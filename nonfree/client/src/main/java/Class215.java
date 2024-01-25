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

@OriginalClass("client!lh")
public final class Class215 implements Interface13 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	private int anInt6042;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	private int anInt6043;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	private int anInt6044;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "[[B")
	private final byte[][] aByteArrayArray15 = new byte[2][];

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray10 = new boolean[2];

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "[I")
	private final int[] anIntArray334 = new int[2];

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
	private final int[] anIntArray335 = new int[2];

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class215() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	@Override
	public void method5163(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(12) ComFailException local12) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
	@Override
	public int method5162(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray10[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(34) int local34 = this.aDSCursorsArray1[arg0].write / this.anInt6043;
		@Pc(44) int local44 = this.anIntArray334[arg0] - local34 & 0xFFFF;
		if (this.anIntArray335[arg0] < local44) {
			for (@Pc(59) int local59 = local34 - this.anIntArray334[arg0] & 0xFFFF; local59 > 0; local59 -= 256) {
				this.method5161(arg0, this.anIntArray333);
			}
			local44 = this.anIntArray334[arg0] - local34 & 0xFFFF;
		}
		return local44;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	@Override
	public void method5165(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt6044 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6042 = arg1 ? 2 : 1;
		this.anInt6043 = arg1 ? 4 : 2;
		this.anIntArray333 = new int[this.anInt6042 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(64) int local64 = 0; local64 < 2; local64++) {
			this.aDSBufferDescArray1[local64].flags = 16384;
		}
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt6043;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt6043 * arg0;
		this.anInt6044 = arg0;
		this.aWaveFormatEx1.channels = this.anInt6042;
		this.aWaveFormatEx1.formatTag = 1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	@Override
	public void method5160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6044 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(22) int local22 = this.anInt6043 * 65536;
		if (this.aByteArrayArray15[arg0] == null || local22 != this.aByteArrayArray15[arg0].length) {
			this.aByteArrayArray15[arg0] = new byte[local22];
			this.aDSBufferDescArray1[arg0].bufferBytes = local22;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray10[arg0] = false;
		this.anIntArray334[arg0] = 0;
		this.anIntArray335[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	@Override
	public void method5164(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray10[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray334[arg0] = 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6042 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray334[arg0] * this.anInt6043;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray15[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray15[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray15[arg0], 0);
		this.anIntArray334[arg0] = this.anIntArray334[arg0] + local2 / this.anInt6042 & 0xFFFF;
		if (!this.aBooleanArray10[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray10[arg0] = true;
		}
	}
}
