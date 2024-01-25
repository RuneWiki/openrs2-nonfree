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

@OriginalClass("client!jm")
public final class Class175 implements Interface24 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	private int anInt4521;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	private int anInt4522;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "[[B")
	private final byte[][] aByteArrayArray18 = new byte[2][];

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "[I")
	private final int[] anIntArray230 = new int[2];

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[2];

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
	private final int[] anIntArray231 = new int[2];

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class175() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
	@Override
	public int method3966(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray12[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt4520;
		@Pc(34) int local34 = this.anIntArray231[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray230[arg0]) {
			for (@Pc(54) int local54 = local24 - this.anIntArray231[arg0] & 0xFFFF; local54 > 0; local54 -= 256) {
				this.method3967(arg0, this.anIntArray229);
			}
			local34 = this.anIntArray231[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V")
	@Override
	public void method3968(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3969(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray12[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray231[arg0] = 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	@Override
	public void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt4522 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4521 = arg1 ? 2 : 1;
		this.anInt4520 = arg1 ? 4 : 2;
		this.anIntArray229 = new int[this.anInt4521 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt4522 = arg0;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.blockAlign = this.anInt4520;
		this.aWaveFormatEx1.channels = this.anInt4521;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt4520;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	@Override
	public void method3970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt4522 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt4520 * 65536;
		if (this.aByteArrayArray18[arg1] == null || this.aByteArrayArray18[arg1].length != local16) {
			this.aByteArrayArray18[arg1] = new byte[local16];
			this.aDSBufferDescArray1[arg1].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray12[arg1] = false;
		this.anIntArray231[arg1] = 0;
		this.anIntArray230[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[I)V")
	@Override
	public void method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4521 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray231[arg0] * this.anInt4520;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray18[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray18[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray18[arg0], 0);
		this.anIntArray231[arg0] = this.anIntArray231[arg0] + local2 / this.anInt4521 & 0xFFFF;
		if (!this.aBooleanArray12[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray12[arg0] = true;
		}
	}
}
