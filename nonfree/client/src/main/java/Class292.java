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

@OriginalClass("client!rt")
public final class Class292 implements Interface22 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	private int anInt8049;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	private int anInt8050;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	private int anInt8051;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray33 = new boolean[2];

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "[I")
	private final int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "[I")
	private final int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[[B")
	private final byte[][] aByteArrayArray30 = new byte[2][];

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class292() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I")
	@Override
	public int method6631(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray33[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt8049;
		@Pc(39) int local39 = this.anIntArray540[arg0] - local24 & 0xFFFF;
		if (local39 > this.anIntArray539[arg0]) {
			for (@Pc(55) int local55 = local24 - this.anIntArray540[arg0] & 0xFFFF; local55 > 0; local55 -= 256) {
				this.method6632(arg0, this.anIntArray538);
			}
			local39 = this.anIntArray540[arg0] - local24 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
	@Override
	public void method6629(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray33[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray540[arg0] = 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	@Override
	public void method6628(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[I)V")
	@Override
	public void method6632(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt8051 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray540[arg0] * this.anInt8049;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray30[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray30[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray30[arg0], 0);
		this.anIntArray540[arg0] = this.anIntArray540[arg0] + local2 / this.anInt8051 & 0xFFFF;
		if (!this.aBooleanArray33[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray33[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt8050 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt8049 * 65536;
		if (this.aByteArrayArray30[arg1] == null || local16 != this.aByteArrayArray30[arg1].length) {
			this.aByteArrayArray30[arg1] = new byte[local16];
			this.aDSBufferDescArray1[arg1].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray33[arg1] = false;
		this.anIntArray540[arg1] = 0;
		this.anIntArray539[arg1] = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	@Override
	public void method6633(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception {
		if (this.anInt8050 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt8051 = arg2 ? 2 : 1;
		this.anInt8049 = arg2 ? 4 : 2;
		this.anIntArray538 = new int[this.anInt8051 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(52) int local52 = 0; local52 < 2; local52++) {
			this.aDSBufferDescArray1[local52].flags = 16384;
		}
		this.anInt8050 = arg1;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt8049 * arg1;
		this.aWaveFormatEx1.channels = this.anInt8051;
		this.aWaveFormatEx1.blockAlign = this.anInt8049;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}
}
