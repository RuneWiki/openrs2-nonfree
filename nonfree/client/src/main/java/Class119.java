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

@OriginalClass("client!gga")
public final class Class119 implements Interface16 {

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
	private int anInt3039;

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
	private int anInt3040;

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray11 = new byte[2][];

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "[I")
	private final int[] anIntArray179 = new int[2];

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray4 = new boolean[2];

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "[I")
	private final int[] anIntArray181 = new int[2];

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
	public Class119() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	@Override
	public void method2579(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt3040 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt3038 = arg0 ? 2 : 1;
		this.anInt3039 = arg0 ? 4 : 2;
		this.anIntArray180 = new int[this.anInt3038 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(52) int local52 = 0; local52 < 2; local52++) {
			this.aDSBufferDescArray1[local52].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt3039;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt3038;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt3039;
		this.anInt3040 = arg2;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)I")
	@Override
	public int method2576(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray4[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt3039;
		@Pc(42) int local42 = this.anIntArray181[arg0] - local24 & 0xFFFF;
		if (local42 > this.anIntArray179[arg0]) {
			@Pc(57) int local57 = local24 - this.anIntArray181[arg0] & 0xFFFF;
			while (local57 > 0) {
				local57 -= 256;
				this.method2575(arg0, this.anIntArray180);
			}
			local42 = this.anIntArray181[arg0] - local24 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[I)V")
	@Override
	public void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt3038 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray181[arg0] * this.anInt3039;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray11[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray11[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray11[arg0], 0);
		this.anIntArray181[arg0] = this.anIntArray181[arg0] + local2 / this.anInt3038 & 0xFFFF;
		if (!this.aBooleanArray4[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray4[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V")
	@Override
	public void method2574(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
	@Override
	public void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt3040 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt3039 * 65536;
		if (this.aByteArrayArray11[arg0] == null || this.aByteArrayArray11[arg0].length != local16) {
			this.aByteArrayArray11[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray4[arg0] = false;
		this.anIntArray181[arg0] = 0;
		this.anIntArray179[arg0] = arg1;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(II)V")
	@Override
	public void method2577(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray4[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray181[arg0] = 0;
	}
}
