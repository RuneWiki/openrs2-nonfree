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

@OriginalClass("client!st")
public final class Class291 implements Interface5 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
	private int[] anIntArray769;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	private int anInt8721;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	private int anInt8722;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	private int anInt8723;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!st", name = "e", descriptor = "[I")
	private final int[] anIntArray770 = new int[2];

	@OriginalMember(owner = "client!st", name = "f", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!st", name = "i", descriptor = "[[B")
	private final byte[][] aByteArrayArray31 = new byte[2][];

	@OriginalMember(owner = "client!st", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!st", name = "m", descriptor = "[I")
	private final int[] anIntArray771 = new int[2];

	@OriginalMember(owner = "client!st", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray38 = new boolean[2];

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class291() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method7291(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt8721 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt8723 = arg0 ? 2 : 1;
		this.anInt8722 = arg0 ? 4 : 2;
		this.anIntArray769 = new int[this.anInt8723 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
			this.aDSBufferDescArray1[local48].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.channels = this.anInt8723;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt8722;
		this.anInt8721 = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt8722;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7288(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt8723 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray770[arg0] * this.anInt8722;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray31[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray31[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray31[arg0], 0);
		this.anIntArray770[arg0] = this.anIntArray770[arg0] + local2 / this.anInt8723 & 0xFFFF;
		if (!this.aBooleanArray38[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray38[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)V")
	@Override
	public void method7287(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray38[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray770[arg0] = 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7292(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(18) ComFailException local18) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
	@Override
	public void method7289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt8721 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt8722 * 65536;
		if (this.aByteArrayArray31[arg1] == null || local19 != this.aByteArrayArray31[arg1].length) {
			this.aByteArrayArray31[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray38[arg1] = false;
		this.anIntArray770[arg1] = 0;
		this.anIntArray771[arg1] = arg0;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)I")
	@Override
	public int method7290(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray38[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt8722;
		@Pc(33) int local33 = this.anIntArray770[arg0] - local24 & 0xFFFF;
		if (this.anIntArray771[arg0] < local33) {
			@Pc(52) int local52 = local24 - this.anIntArray770[arg0] & 0xFFFF;
			while (local52 > 0) {
				local52 -= 256;
				this.method7288(arg0, this.anIntArray769);
			}
			local33 = this.anIntArray770[arg0] - local24 & 0xFFFF;
		}
		return local33;
	}
}
