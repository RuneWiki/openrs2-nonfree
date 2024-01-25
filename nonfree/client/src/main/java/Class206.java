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

@OriginalClass("client!mo")
public final class Class206 implements Interface20 {

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	private int anInt6185;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	private int anInt6186;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	private int anInt6187;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
	private final int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "[I")
	private final int[] anIntArray439 = new int[2];

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray20 = new boolean[2];

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray16 = new byte[2][];

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class206() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
	@Override
	public void method5022(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray20[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray438[arg0] = 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
	@Override
	public int method5021(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray20[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt6185;
		@Pc(34) int local34 = this.anIntArray438[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray439[arg0]) {
			for (@Pc(49) int local49 = local24 - this.anIntArray438[arg0] & 0xFFFF; local49 > 0; local49 -= 256) {
				this.method5024(arg0, this.anIntArray440);
			}
			local34 = this.anIntArray438[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	@Override
	public void method5019(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt6187 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6186 = arg2 ? 2 : 1;
		this.anInt6185 = arg2 ? 4 : 2;
		this.anIntArray440 = new int[this.anInt6186 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt6185;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt6185;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.channels = this.anInt6186;
		this.anInt6187 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6186 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray438[arg0] * this.anInt6185;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray16[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray16[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray16[arg0], 0);
		this.anIntArray438[arg0] = this.anIntArray438[arg0] + local2 / this.anInt6186 & 0xFFFF;
		if (!this.aBooleanArray20[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray20[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)V")
	@Override
	public void method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6187 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt6185 * 65536;
		if (this.aByteArrayArray16[arg0] == null || this.aByteArrayArray16[arg0].length != local16) {
			this.aByteArrayArray16[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray20[arg0] = false;
		this.anIntArray438[arg0] = 0;
		this.anIntArray439[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5023(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
