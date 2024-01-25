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

@OriginalClass("client!ac")
public final class Class4 implements Interface9 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt72;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray1 = new boolean[2];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[[B")
	private final byte[][] aByteArrayArray1 = new byte[2][];

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
	private final int[] anIntArray5 = new int[2];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	private final int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class4() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BI)V")
	@Override
	public void method105(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray1[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray5[arg0] = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
	@Override
	public void method102(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[I)V")
	@Override
	public void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt71 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray5[arg0] * this.anInt73;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray1[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray1[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray1[arg0], 0);
		this.anIntArray5[arg0] = this.anIntArray5[arg0] + local2 / this.anInt71 & 0xFFFF;
		if (!this.aBooleanArray1[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray1[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
	@Override
	public int method103(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray1[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(29) int local29 = this.aDSCursorsArray1[arg0].write / this.anInt73;
		@Pc(39) int local39 = this.anIntArray5[arg0] - local29 & 0xFFFF;
		if (this.anIntArray6[arg0] < local39) {
			for (@Pc(59) int local59 = local29 - this.anIntArray5[arg0] & 0xFFFF; local59 > 0; local59 -= 256) {
				this.method104(arg0, this.anIntArray4);
			}
			local39 = this.anIntArray5[arg0] - local29 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method106(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception {
		if (this.anInt72 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt71 = arg1 ? 2 : 1;
		this.anInt73 = arg1 ? 4 : 2;
		this.anIntArray4 = new int[this.anInt71 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(53) int local53 = 0; local53 < 2; local53++) {
			this.aDSBufferDescArray1[local53].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt73 * arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt73;
		this.aWaveFormatEx1.channels = this.anInt71;
		this.anInt72 = arg0;
		this.aWaveFormatEx1.samplesPerSec = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V")
	@Override
	public void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt72 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt73 * 65536;
		if (this.aByteArrayArray1[arg1] == null || local16 != this.aByteArrayArray1[arg1].length) {
			this.aByteArrayArray1[arg1] = new byte[local16];
			this.aDSBufferDescArray1[arg1].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray1[arg1] = false;
		this.anIntArray5[arg1] = 0;
		this.anIntArray6[arg1] = arg0;
	}
}
