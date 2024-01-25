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

@OriginalClass("client!nu")
public final class Class251 implements Interface22 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	private int anInt6999;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
	private int anInt7000;

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
	private int anInt7001;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray17 = new boolean[2];

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "[I")
	private final int[] anIntArray390 = new int[2];

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "[I")
	private final int[] anIntArray391 = new int[2];

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray16 = new byte[2][];

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class251() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt7001 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt6999 * 65536;
		if (this.aByteArrayArray16[arg0] == null || this.aByteArrayArray16[arg0].length != local19) {
			this.aByteArrayArray16[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray17[arg0] = false;
		this.anIntArray390[arg0] = 0;
		this.anIntArray391[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
	@Override
	public void method5954(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray17[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray390[arg0] = 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)I")
	@Override
	public int method5951(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray17[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt6999;
		@Pc(41) int local41 = this.anIntArray390[arg0] - local32 & 0xFFFF;
		if (local41 > this.anIntArray391[arg0]) {
			@Pc(57) int local57 = local32 - this.anIntArray390[arg0] & 0xFFFF;
			while (local57 > 0) {
				local57 -= 256;
				this.method5949(arg0, this.anIntArray392);
			}
			local41 = this.anIntArray390[arg0] - local32 & 0xFFFF;
		}
		return local41;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
	@Override
	public void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt7001 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7000 = arg1 ? 2 : 1;
		this.anInt6999 = arg1 ? 4 : 2;
		this.anIntArray392 = new int[this.anInt7000 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(56) int local56 = 0; local56 < 2; local56++) {
			this.aDSBufferDescArray1[local56].flags = 16384;
		}
		this.aWaveFormatEx1.blockAlign = this.anInt6999;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt6999;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt7000;
		this.anInt7001 = arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5949(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7000 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray390[arg0] * this.anInt6999;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray16[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray16[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray16[arg0], 0);
		this.anIntArray390[arg0] = this.anIntArray390[arg0] + local2 / this.anInt7000 & 0xFFFF;
		if (!this.aBooleanArray17[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray17[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
	@Override
	public void method5953(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
