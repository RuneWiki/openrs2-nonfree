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

@OriginalClass("client!fr")
public final class Class104 implements Interface6 {

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	private int anInt3147;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
	private int anInt3148;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray10 = new byte[2][];

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray6 = new boolean[2];

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
	private final int[] anIntArray265 = new int[2];

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "[I")
	private final int[] anIntArray266 = new int[2];

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class104() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	@Override
	public void method2812(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[I)V")
	@Override
	public void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt3146 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray265[arg0] * this.anInt3147;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray10[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray10[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray10[arg0], 0);
		this.anIntArray265[arg0] = this.anIntArray265[arg0] + local2 / this.anInt3146 & 0xFFFF;
		if (!this.aBooleanArray6[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray6[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method2808(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception {
		if (this.anInt3148 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt3146 = arg0 ? 2 : 1;
		this.anInt3147 = arg0 ? 4 : 2;
		this.anIntArray264 = new int[this.anInt3146 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(52) int local52 = 0; local52 < 2; local52++) {
			this.aDSBufferDescArray1[local52].flags = 16384;
		}
		this.anInt3148 = arg2;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt3147;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt3147;
		this.aWaveFormatEx1.channels = this.anInt3146;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	@Override
	public void method2810(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray6[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray265[arg0] = 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)I")
	@Override
	public int method2807(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray6[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt3147;
		@Pc(40) int local40 = this.anIntArray265[arg0] - local30 & 0xFFFF;
		if (local40 > this.anIntArray266[arg0]) {
			for (@Pc(59) int local59 = local30 - this.anIntArray265[arg0] & 0xFFFF; local59 > 0; local59 -= 256) {
				this.method2811(arg0, this.anIntArray264);
			}
			local40 = this.anIntArray265[arg0] - local30 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	@Override
	public void method2809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt3148 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt3147 * 65536;
		if (this.aByteArrayArray10[arg0] == null || this.aByteArrayArray10[arg0].length != local16) {
			this.aByteArrayArray10[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray6[arg0] = false;
		this.anIntArray265[arg0] = 0;
		this.anIntArray266[arg0] = arg1;
	}
}
