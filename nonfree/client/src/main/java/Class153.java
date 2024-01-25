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

@OriginalClass("client!iga")
public final class Class153 implements Interface8 {

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
	private int anInt4483;

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
	private int anInt4484;

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	private int anInt4485;

	@OriginalMember(owner = "client!iga", name = "k", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
	private final int[] anIntArray407 = new int[2];

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "[I")
	private final int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray26 = new boolean[2];

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!iga", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray19 = new byte[2][];

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
	public Class153() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4109(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V")
	@Override
	public void method4107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt4483 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt4485 * 65536;
		if (this.aByteArrayArray19[arg0] == null || local19 != this.aByteArrayArray19[arg0].length) {
			this.aByteArrayArray19[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray26[arg0] = false;
		this.anIntArray408[arg0] = 0;
		this.anIntArray407[arg0] = arg1;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)I")
	@Override
	public int method4110(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray26[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt4485;
		@Pc(34) int local34 = this.anIntArray408[arg0] - local24 & 0xFFFF;
		if (this.anIntArray407[arg0] < local34) {
			@Pc(60) int local60 = local24 - this.anIntArray408[arg0] & 0xFFFF;
			while (local60 > 0) {
				local60 -= 256;
				this.method4108(arg0, this.anIntArray409);
			}
			local34 = this.anIntArray408[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	@Override
	public void method4111(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt4483 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4485 = arg1 ? 4 : 2;
		this.anInt4484 = arg1 ? 2 : 1;
		this.anIntArray409 = new int[this.anInt4484 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
			this.aDSBufferDescArray1[local48].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.anInt4483 = arg0;
		this.aWaveFormatEx1.channels = this.anInt4484;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt4485;
		this.aWaveFormatEx1.blockAlign = this.anInt4485;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4484 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray408[arg0] * this.anInt4485;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray19[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray19[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray19[arg0], 0);
		this.anIntArray408[arg0] = this.anIntArray408[arg0] + local2 / this.anInt4484 & 0xFFFF;
		if (!this.aBooleanArray26[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray26[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(II)V")
	@Override
	public void method4112(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray26[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray408[arg0] = 0;
	}
}
