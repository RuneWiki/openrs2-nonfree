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

@OriginalClass("client!mj")
public final class Class226 implements Interface16 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	private int anInt5866;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	private int anInt5867;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	private int anInt5868;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
	private final int[] anIntArray479 = new int[2];

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
	private final int[] anIntArray480 = new int[2];

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray22 = new boolean[2];

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[[B")
	private final byte[][] aByteArrayArray25 = new byte[2][];

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class226() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception {
		if (this.anInt5868 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt5866 = arg2 ? 4 : 2;
		this.anInt5867 = arg2 ? 2 : 1;
		this.anIntArray478 = new int[this.anInt5867 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
			this.aDSBufferDescArray1[local47].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt5866;
		this.aWaveFormatEx1.blockAlign = this.anInt5866;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt5867;
		this.anInt5868 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	@Override
	public void method4957(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray22[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray480[arg0] = 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4961(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt5867 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray480[arg0] * this.anInt5866;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray25[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray25[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray25[arg0], 0);
		this.anIntArray480[arg0] = this.anIntArray480[arg0] + local2 / this.anInt5867 & 0xFFFF;
		if (!this.aBooleanArray22[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray22[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
	@Override
	public int method4960(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray22[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt5866;
		@Pc(39) int local39 = this.anIntArray480[arg0] - local30 & 0xFFFF;
		if (local39 > this.anIntArray479[arg0]) {
			for (@Pc(55) int local55 = local30 - this.anIntArray480[arg0] & 0xFFFF; local55 > 0; local55 -= 256) {
				this.method4961(arg0, this.anIntArray478);
			}
			local39 = this.anIntArray480[arg0] - local30 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method4959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt5868 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(24) int local24 = this.anInt5866 * 65536;
		if (this.aByteArrayArray25[arg1] == null || this.aByteArrayArray25[arg1].length != local24) {
			this.aByteArrayArray25[arg1] = new byte[local24];
			this.aDSBufferDescArray1[arg1].bufferBytes = local24;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray22[arg1] = false;
		this.anIntArray480[arg1] = 0;
		this.anIntArray479[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4962(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
