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

@OriginalClass("client!no")
public final class Class252 implements Interface12 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	private int anInt6888;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	private int anInt6889;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "I")
	private int anInt6890;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!no", name = "b", descriptor = "[I")
	private final int[] anIntArray430 = new int[2];

	@OriginalMember(owner = "client!no", name = "e", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
	private final int[] anIntArray432 = new int[2];

	@OriginalMember(owner = "client!no", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[2][];

	@OriginalMember(owner = "client!no", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[2];

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class252() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6890 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray432[arg0] * this.anInt6889;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray17[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray17[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray17[arg0], 0);
		this.anIntArray432[arg0] = this.anIntArray432[arg0] + local2 / this.anInt6890 & 0xFFFF;
		if (!this.aBooleanArray21[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray21[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	@Override
	public void method5759(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt6888 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6890 = arg0 ? 2 : 1;
		this.anInt6889 = arg0 ? 4 : 2;
		this.anIntArray431 = new int[this.anInt6890 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
			this.aDSBufferDescArray1[local46].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt6889;
		this.aWaveFormatEx1.blockAlign = this.anInt6889;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt6890;
		this.anInt6888 = arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.formatTag = 1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5761(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray21[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt6889;
		@Pc(34) int local34 = this.anIntArray432[arg0] - local24 & 0xFFFF;
		if (this.anIntArray430[arg0] < local34) {
			@Pc(54) int local54 = local24 - this.anIntArray432[arg0] & 0xFFFF;
			while (local54 > 0) {
				local54 -= 256;
				this.method5760(arg0, this.anIntArray431);
			}
			local34 = this.anIntArray432[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
	@Override
	public void method5762(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray21[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray432[arg0] = 0;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IB)V")
	@Override
	public void method5764(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(18) ComFailException local18) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method5763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6888 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(23) int local23 = this.anInt6889 * 65536;
		if (this.aByteArrayArray17[arg0] == null || local23 != this.aByteArrayArray17[arg0].length) {
			this.aByteArrayArray17[arg0] = new byte[local23];
			this.aDSBufferDescArray1[arg0].bufferBytes = local23;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray21[arg0] = false;
		this.anIntArray432[arg0] = 0;
		this.anIntArray430[arg0] = arg1;
	}
}
