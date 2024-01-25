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

@OriginalClass("client!rba")
public final class Class307 implements Interface12 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	private int anInt7963;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	private int anInt7964;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	private int anInt7965;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray17 = new boolean[2];

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "[I")
	private final int[] anIntArray543 = new int[2];

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "[[B")
	private final byte[][] aByteArrayArray25 = new byte[2][];

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "[I")
	private final int[] anIntArray545 = new int[2];

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V")
	public Class307() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)V")
	@Override
	public void method6928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt7965 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt7964 * 65536;
		if (this.aByteArrayArray25[arg0] == null || this.aByteArrayArray25[arg0].length != local16) {
			this.aByteArrayArray25[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray17[arg0] = false;
		this.anIntArray545[arg0] = 0;
		this.anIntArray543[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(II)I")
	@Override
	public int method6930(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray17[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt7964;
		@Pc(42) int local42 = this.anIntArray545[arg0] - local32 & 0xFFFF;
		if (local42 > this.anIntArray543[arg0]) {
			@Pc(62) int local62 = local32 - this.anIntArray545[arg0] & 0xFFFF;
			while (local62 > 0) {
				local62 -= 256;
				this.method6929(arg0, this.anIntArray544);
			}
			local42 = this.anIntArray545[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)V")
	@Override
	public void method6927(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method6925(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt7965 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7963 = arg0 ? 2 : 1;
		this.anInt7964 = arg0 ? 4 : 2;
		this.anIntArray544 = new int[this.anInt7963 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(53) int local53 = 0; local53 < 2; local53++) {
			this.aDSBufferDescArray1[local53].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.channels = this.anInt7963;
		this.aWaveFormatEx1.blockAlign = this.anInt7964;
		this.anInt7965 = arg2;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt7964;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I[I)V")
	@Override
	public void method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7963 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray545[arg0] * this.anInt7964;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray25[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray25[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray25[arg0], 0);
		this.anIntArray545[arg0] = this.anIntArray545[arg0] + local2 / this.anInt7963 & 0xFFFF;
		if (!this.aBooleanArray17[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray17[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	@Override
	public void method6926(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray17[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray545[arg0] = 0;
	}
}
