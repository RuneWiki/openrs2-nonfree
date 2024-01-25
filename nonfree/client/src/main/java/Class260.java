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

@OriginalClass("client!pq")
public final class Class260 implements Interface6 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	private int anInt7463;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	private int anInt7464;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	private int anInt7465;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "[I")
	private final int[] anIntArray422 = new int[2];

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[I")
	private final int[] anIntArray424 = new int[2];

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "[[B")
	private final byte[][] aByteArrayArray39 = new byte[2][];

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "[Z")
	private final boolean[] aBooleanArray23 = new boolean[2];

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class260() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5822(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray23[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray424[arg0] = 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	@Override
	public void method5819(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt7463 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7464 = arg1 ? 4 : 2;
		this.anInt7465 = arg1 ? 2 : 1;
		this.anIntArray423 = new int[this.anInt7465 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
			this.aDSBufferDescArray1[local47].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt7464 * arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.anInt7463 = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt7464;
		this.aWaveFormatEx1.channels = this.anInt7465;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5821(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7465 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray424[arg0] * this.anInt7464;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray39[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray39[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray39[arg0], 0);
		this.anIntArray424[arg0] = this.anIntArray424[arg0] + local2 / this.anInt7465 & 0xFFFF;
		if (!this.aBooleanArray23[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray23[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt7463 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt7464 * 65536;
		if (this.aByteArrayArray39[arg1] == null || local19 != this.aByteArrayArray39[arg1].length) {
			this.aByteArrayArray39[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray23[arg1] = false;
		this.anIntArray424[arg1] = 0;
		this.anIntArray422[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V")
	@Override
	public void method5823(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
	@Override
	public int method5820(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray23[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(28) int local28 = this.aDSCursorsArray1[arg0].write / this.anInt7464;
		@Pc(38) int local38 = this.anIntArray424[arg0] - local28 & 0xFFFF;
		if (this.anIntArray422[arg0] < local38) {
			for (@Pc(58) int local58 = local28 - this.anIntArray424[arg0] & 0xFFFF; local58 > 0; local58 -= 256) {
				this.method5821(arg0, this.anIntArray423);
			}
			local38 = this.anIntArray424[arg0] - local28 & 0xFFFF;
		}
		return local38;
	}
}
