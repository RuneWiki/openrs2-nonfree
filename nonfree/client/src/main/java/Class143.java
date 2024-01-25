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

@OriginalClass("client!jc")
public final class Class143 implements Interface6 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt4755;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt4756;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt4757;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[Z")
	private final boolean[] aBooleanArray23 = new boolean[2];

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[[B")
	private final byte[][] aByteArrayArray15 = new byte[2][];

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
	private final int[] anIntArray428 = new int[2];

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
	private final int[] anIntArray430 = new int[2];

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class143() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	@Override
	public void method3986(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(19) ComFailException local19) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
	@Override
	public void method3990(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray23[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray428[arg0] = 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3991(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray23[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(31) int local31 = this.aDSCursorsArray1[arg0].write / this.anInt4755;
		@Pc(41) int local41 = this.anIntArray428[arg0] - local31 & 0xFFFF;
		if (this.anIntArray430[arg0] < local41) {
			for (@Pc(57) int local57 = local31 - this.anIntArray428[arg0] & 0xFFFF; local57 > 0; local57 -= 256) {
				this.method3987(arg0, this.anIntArray429);
			}
			local41 = this.anIntArray428[arg0] - local31 & 0xFFFF;
		}
		return local41;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	@Override
	public void method3988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt4757 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt4755 * 65536;
		if (this.aByteArrayArray15[arg1] == null || this.aByteArrayArray15[arg1].length != local19) {
			this.aByteArrayArray15[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray23[arg1] = false;
		this.anIntArray428[arg1] = 0;
		this.anIntArray430[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	@Override
	public void method3989(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt4757 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4755 = arg2 ? 4 : 2;
		this.anInt4756 = arg2 ? 2 : 1;
		this.anIntArray429 = new int[this.anInt4756 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(49) int local49 = 0; local49 < 2; local49++) {
			this.aDSBufferDescArray1[local49].flags = 16384;
		}
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.blockAlign = this.anInt4755;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt4755;
		this.aWaveFormatEx1.formatTag = 1;
		this.anInt4757 = arg0;
		this.aWaveFormatEx1.channels = this.anInt4756;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[I)V")
	@Override
	public void method3987(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4756 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray428[arg0] * this.anInt4755;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray15[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray15[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray15[arg0], 0);
		this.anIntArray428[arg0] = this.anIntArray428[arg0] + local2 / this.anInt4756 & 0xFFFF;
		if (!this.aBooleanArray23[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray23[arg0] = true;
		}
	}
}
