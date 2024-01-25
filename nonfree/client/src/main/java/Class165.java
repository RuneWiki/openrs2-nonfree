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

@OriginalClass("client!jb")
public final class Class165 implements Interface23 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	private int anInt4654;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
	private int anInt4656;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
	private final int[] anIntArray245 = new int[2];

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray13 = new boolean[2];

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[2][];

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
	private final int[] anIntArray244 = new int[2];

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class165() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I")
	@Override
	public int method4175(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray13[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt4654;
		@Pc(33) int local33 = this.anIntArray245[arg0] - local24 & 0xFFFF;
		if (local33 > this.anIntArray244[arg0]) {
			@Pc(54) int local54 = local24 - this.anIntArray245[arg0] & 0xFFFF;
			while (local54 > 0) {
				local54 -= 256;
				this.method4171(arg0, this.anIntArray246);
			}
			local33 = this.anIntArray245[arg0] - local24 & 0xFFFF;
		}
		return local33;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt4656 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(26) int local26 = this.anInt4654 * 65536;
		if (this.aByteArrayArray14[arg1] == null || local26 != this.aByteArrayArray14[arg1].length) {
			this.aByteArrayArray14[arg1] = new byte[local26];
			this.aDSBufferDescArray1[arg1].bufferBytes = local26;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray13[arg1] = false;
		this.anIntArray245[arg1] = 0;
		this.anIntArray244[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4655 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray245[arg0] * this.anInt4654;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray14[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray14[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray14[arg0], 0);
		this.anIntArray245[arg0] = this.anIntArray245[arg0] + local2 / this.anInt4655 & 0xFFFF;
		if (!this.aBooleanArray13[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray13[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	@Override
	public void method4172(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method4173(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt4656 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4655 = arg0 ? 2 : 1;
		this.anInt4654 = arg0 ? 4 : 2;
		this.anIntArray246 = new int[this.anInt4655 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
			this.aDSBufferDescArray1[local48].flags = 16384;
		}
		this.anInt4656 = arg1;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.blockAlign = this.anInt4654;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = arg1 * this.anInt4654;
		this.aWaveFormatEx1.channels = this.anInt4655;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	@Override
	public void method4170(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray13[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray245[arg0] = 0;
	}
}
