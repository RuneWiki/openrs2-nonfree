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

@OriginalClass("client!su")
public final class Class347 implements Interface27 {

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	private int anInt9738;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	private int anInt9739;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	private int anInt9740;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "[[B")
	private final byte[][] aByteArrayArray21 = new byte[2][];

	@OriginalMember(owner = "client!su", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!su", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!su", name = "j", descriptor = "[I")
	private final int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[I")
	private final int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray27 = new boolean[2];

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!su", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	private Class347() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	@Override
	public void method8222(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray27[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray539[arg0] = 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)I")
	@Override
	public int method8225(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray27[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(25) int local25 = this.aDSCursorsArray1[arg0].write / this.anInt9739;
		@Pc(35) int local35 = this.anIntArray539[arg0] - local25 & 0xFFFF;
		if (local35 > this.anIntArray540[arg0]) {
			@Pc(51) int local51 = local25 - this.anIntArray539[arg0] & 0xFFFF;
			while (local51 > 0) {
				local51 -= 256;
				this.method8223(arg0, this.anIntArray541);
			}
			local35 = this.anIntArray539[arg0] - local25 & 0xFFFF;
		}
		return local35;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	@Override
	public void method8227(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception {
		if (this.anInt9740 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt9738 = arg2 ? 2 : 1;
		this.anInt9739 = arg2 ? 4 : 2;
		this.anIntArray541 = new int[this.anInt9738 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(51) int local51 = 0; local51 < 2; local51++) {
			this.aDSBufferDescArray1[local51].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg1 * this.anInt9739;
		this.aWaveFormatEx1.channels = this.anInt9738;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt9739;
		this.anInt9740 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I[I)V")
	@Override
	public void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt9738 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray539[arg0] * this.anInt9739;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray21[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray21[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray21[arg0], 0);
		this.anIntArray539[arg0] = this.anIntArray539[arg0] + local2 / this.anInt9738 & 0xFFFF;
		if (!this.aBooleanArray27[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray27[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
	@Override
	public void method8224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt9740 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(31) int local31 = this.anInt9739 * 65536;
		if (this.aByteArrayArray21[arg0] == null || local31 != this.aByteArrayArray21[arg0].length) {
			this.aByteArrayArray21[arg0] = new byte[local31];
			this.aDSBufferDescArray1[arg0].bufferBytes = local31;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray27[arg0] = false;
		this.anIntArray539[arg0] = 0;
		this.anIntArray540[arg0] = arg1;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(II)V")
	@Override
	public void method8226(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(12) ComFailException local12) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
