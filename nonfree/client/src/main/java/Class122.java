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

@OriginalClass("client!gv")
public final class Class122 implements Interface9 {

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	private int anInt3965;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	private int anInt3966;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
	private final int[] anIntArray236 = new int[2];

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "[[B")
	private final byte[][] aByteArrayArray64 = new byte[2][];

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "[I")
	private final int[] anIntArray237 = new int[2];

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray23 = new boolean[2];

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class122() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[I)V")
	@Override
	public void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt3966 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray237[arg0] * this.anInt3965;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray64[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray64[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray64[arg0], 0);
		this.anIntArray237[arg0] = this.anIntArray237[arg0] + local2 / this.anInt3966 & 0xFFFF;
		if (!this.aBooleanArray23[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray23[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)I")
	@Override
	public int method3474(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray23[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt3965;
		@Pc(41) int local41 = this.anIntArray237[arg0] - local24 & 0xFFFF;
		if (this.anIntArray236[arg0] < local41) {
			for (@Pc(56) int local56 = local24 - this.anIntArray237[arg0] & 0xFFFF; local56 > 0; local56 -= 256) {
				this.method3471(arg0, this.anIntArray238);
			}
			local41 = this.anIntArray237[arg0] - local24 & 0xFFFF;
		}
		return local41;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	@Override
	public void method3470(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	@Override
	public void method3475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt3964 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(20) int local20 = this.anInt3965 * 65536;
		if (this.aByteArrayArray64[arg1] == null || this.aByteArrayArray64[arg1].length != local20) {
			this.aByteArrayArray64[arg1] = new byte[local20];
			this.aDSBufferDescArray1[arg1].bufferBytes = local20;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray23[arg1] = false;
		this.anIntArray237[arg1] = 0;
		this.anIntArray236[arg1] = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
	@Override
	public void method3473(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt3964 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt3965 = arg0 ? 4 : 2;
		this.anInt3966 = arg0 ? 2 : 1;
		this.anIntArray238 = new int[this.anInt3966 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.anInt3964 = arg2;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt3965 * arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt3965;
		this.aWaveFormatEx1.channels = this.anInt3966;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)V")
	@Override
	public void method3472(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray23[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray237[arg0] = 0;
	}
}
