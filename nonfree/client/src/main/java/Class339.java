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

@OriginalClass("client!ui")
public final class Class339 implements Interface13 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private int anInt9428;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[I")
	private int[] anIntArray659;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	private int anInt9429;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	private int anInt9430;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[[B")
	private final byte[][] aByteArrayArray26 = new byte[2][];

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
	private final int[] anIntArray660 = new int[2];

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray47 = new boolean[2];

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[I")
	private final int[] anIntArray661 = new int[2];

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class339() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	@Override
	public void method7875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt9428 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt9430 * 65536;
		if (this.aByteArrayArray26[arg0] == null || this.aByteArrayArray26[arg0].length != local16) {
			this.aByteArrayArray26[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray47[arg0] = false;
		this.anIntArray661[arg0] = 0;
		this.anIntArray660[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7876(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray47[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray661[arg0] = 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
	@Override
	public void method7873(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt9428 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt9430 = arg2 ? 4 : 2;
		this.anInt9429 = arg2 ? 2 : 1;
		this.anIntArray659 = new int[this.anInt9429 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSBufferDescArray1[local57].flags = 16384;
		}
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.avgBytesPerSec = arg1 * this.anInt9430;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt9430;
		this.aWaveFormatEx1.channels = this.anInt9429;
		this.anInt9428 = arg1;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt9429 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray661[arg0] * this.anInt9430;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray26[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray26[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray26[arg0], 0);
		this.anIntArray661[arg0] = this.anIntArray661[arg0] + local2 / this.anInt9429 & 0xFFFF;
		if (!this.aBooleanArray47[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray47[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)I")
	@Override
	public int method7874(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray47[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt9430;
		@Pc(34) int local34 = this.anIntArray661[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray660[arg0]) {
			@Pc(50) int local50 = local24 - this.anIntArray661[arg0] & 0xFFFF;
			while (local50 > 0) {
				local50 -= 256;
				this.method7877(arg0, this.anIntArray659);
			}
			local34 = this.anIntArray661[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}
}
