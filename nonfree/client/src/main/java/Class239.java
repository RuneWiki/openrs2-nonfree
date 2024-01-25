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

@OriginalClass("client!ns")
public final class Class239 implements Interface9 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	private int anInt6062;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray108 = new boolean[2];

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
	private final int[] anIntArray445 = new int[2];

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
	private final int[] anIntArray444 = new int[2];

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray19 = new byte[2][];

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class239() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
	@Override
	public void method5171(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(19) ComFailException local19) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	@Override
	public int method5168(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray108[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt6061;
		@Pc(39) int local39 = this.anIntArray444[arg0] - local24 & 0xFFFF;
		if (this.anIntArray445[arg0] < local39) {
			@Pc(54) int local54 = local24 - this.anIntArray444[arg0] & 0xFFFF;
			while (local54 > 0) {
				local54 -= 256;
				this.method5169(arg0, this.anIntArray443);
			}
			local39 = this.anIntArray444[arg0] - local24 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	@Override
	public void method5172(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt6062 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6061 = arg1 ? 4 : 2;
		this.anInt6063 = arg1 ? 2 : 1;
		this.anIntArray443 = new int[this.anInt6063 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(56) int local56 = 0; local56 < 2; local56++) {
			this.aDSBufferDescArray1[local56].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt6061 * arg2;
		this.aWaveFormatEx1.channels = this.anInt6063;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt6062 = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt6061;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg2;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6063 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray444[arg0] * this.anInt6061;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray19[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray19[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray19[arg0], 0);
		this.anIntArray444[arg0] = this.anIntArray444[arg0] + local2 / this.anInt6063 & 0xFFFF;
		if (!this.aBooleanArray108[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray108[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
	@Override
	public void method5173(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray108[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray444[arg0] = 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6062 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt6061 * 65536;
		if (this.aByteArrayArray19[arg0] == null || local16 != this.aByteArrayArray19[arg0].length) {
			this.aByteArrayArray19[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray108[arg0] = false;
		this.anIntArray444[arg0] = 0;
		this.anIntArray445[arg0] = arg1;
	}
}
