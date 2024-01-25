import com.ms.com.ComFailException;
import com.ms.com._Guid;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class355 implements Interface13 {

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "I")
	private int anInt10230;

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
	private int anInt10231;

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
	private int anInt10232;

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "[I")
	private int[] anIntArray746;

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray51 = new byte[2][];

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray27 = new boolean[2];

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "[I")
	private final int[] anIntArray745 = new int[2];

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "[I")
	private final int[] anIntArray744 = new int[2];

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "()V")
	public Class355() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(II)V")
	@Override
	public void method8513(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IB)I")
	@Override
	public int method8516(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray27[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt10231;
		@Pc(34) int local34 = this.anIntArray744[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray745[arg0]) {
			for (@Pc(60) int local60 = local24 - this.anIntArray744[arg0] & 0xFFFF; local60 > 0; local60 -= 256) {
				this.method8515(arg0, this.anIntArray746);
			}
			local34 = this.anIntArray744[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)V")
	@Override
	public void method8512(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray27[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray744[arg0] = 0;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/awt/Component;BIZ)V")
	@Override
	public void method8514(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt10230 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt10232 = arg2 ? 2 : 1;
		this.anInt10231 = arg2 ? 4 : 2;
		this.anIntArray746 = new int[this.anInt10232 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.channels = this.anInt10232;
		this.aWaveFormatEx1.avgBytesPerSec = arg1 * this.anInt10231;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt10231;
		this.anInt10230 = arg1;
		this.aWaveFormatEx1.formatTag = 1;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I[I)V")
	@Override
	public void method8515(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt10232 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray744[arg0] * this.anInt10231;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray51[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray51[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray51[arg0], 0);
		this.anIntArray744[arg0] = this.anIntArray744[arg0] + local2 / this.anInt10232 & 0xFFFF;
		if (!this.aBooleanArray27[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray27[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)V")
	@Override
	public void method8517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt10230 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt10231 * 65536;
		if (this.aByteArrayArray51[arg1] == null || this.aByteArrayArray51[arg1].length != local19) {
			this.aByteArrayArray51[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray27[arg1] = false;
		this.anIntArray744[arg1] = 0;
		this.anIntArray745[arg1] = arg0;
	}
}
