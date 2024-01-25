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

@OriginalClass("client!laa")
public final class Class191 implements Interface10 {

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
	private int anInt5972;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	private int anInt5973;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "[I")
	private final int[] anIntArray365 = new int[2];

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[2];

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray21 = new byte[2][];

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "[I")
	private final int[] anIntArray367 = new int[2];

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	public Class191() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)V")
	@Override
	public void method4940(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZ)I")
	@Override
	public int method4941(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray19[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt5973;
		@Pc(42) int local42 = this.anIntArray367[arg0] - local32 & 0xFFFF;
		if (local42 > this.anIntArray365[arg0]) {
			for (@Pc(62) int local62 = local32 - this.anIntArray367[arg0] & 0xFFFF; local62 > 0; local62 -= 256) {
				this.method4943(arg0, this.anIntArray366);
			}
			local42 = this.anIntArray367[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IB)V")
	@Override
	public void method4938(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray19[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray367[arg0] = 0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	@Override
	public void method4942(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt5974 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt5973 = arg2 ? 4 : 2;
		this.anInt5972 = arg2 ? 2 : 1;
		this.anIntArray366 = new int[this.anInt5972 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(53) int local53 = 0; local53 < 2; local53++) {
			this.aDSBufferDescArray1[local53].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt5973;
		this.anInt5974 = arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt5972;
		this.aWaveFormatEx1.blockAlign = this.anInt5973;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt5974 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(26) int local26 = this.anInt5973 * 65536;
		if (this.aByteArrayArray21[arg0] == null || local26 != this.aByteArrayArray21[arg0].length) {
			this.aByteArrayArray21[arg0] = new byte[local26];
			this.aDSBufferDescArray1[arg0].bufferBytes = local26;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray19[arg0] = false;
		this.anIntArray367[arg0] = 0;
		this.anIntArray365[arg0] = arg1;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4943(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt5972 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray367[arg0] * this.anInt5973;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray21[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray21[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray21[arg0], 0);
		this.anIntArray367[arg0] = this.anIntArray367[arg0] + local2 / this.anInt5972 & 0xFFFF;
		if (!this.aBooleanArray19[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray19[arg0] = true;
		}
	}
}
