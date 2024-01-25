import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "[B")
	private byte[] aByteArray133;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
	private int anInt4721;

	@OriginalMember(owner = "client!pa", name = "J", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4230(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean314 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static223.anInt5818, 16, Static111.aBoolean172 ? 2 : 1, true, false);
		this.aByteArray133 = new byte[0x100 << (Static111.aBoolean172 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
	@Override
	protected void method4229() {
		@Pc(1) short local1 = 256;
		if (Static111.aBoolean172) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray425[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray133[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray133[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray133, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	@Override
	protected void method4216() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "()I")
	@Override
	protected int method4221() {
		return this.anInt4721 - (this.aSourceDataLine1.available() >> (Static111.aBoolean172 ? 2 : 1));
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
	@Override
	protected void method4222() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean314) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4721 << (Static111.aBoolean172 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	@Override
	public void method4226(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static111.aBoolean172 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4721 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static44.method1085(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4226(Static224.method4011(arg0));
			}
		}
	}
}
