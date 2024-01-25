import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!n", name = "L", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!n", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!n", name = "N", descriptor = "I")
	private int anInt4034;

	@OriginalMember(owner = "client!n", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
	@Override
	protected void method5973() {
		@Pc(1) short local1 = 256;
		if (Static18.aBoolean55) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray508[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray52[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray52[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray52, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	@Override
	public void method5968(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static18.aBoolean55 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4034 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static166.method3085(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5968(Static216.method3815(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	@Override
	protected void method5970() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5977(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(26) String local26 = local20.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean356 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static65.anInt1429, 16, Static18.aBoolean55 ? 2 : 1, true, false);
		this.aByteArray52 = new byte[0x100 << (Static18.aBoolean55 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()I")
	@Override
	protected int method5971() {
		return this.anInt4034 - (this.aSourceDataLine1.available() >> (Static18.aBoolean55 ? 2 : 1));
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
	@Override
	protected void method5978() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean356) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4034 << (Static18.aBoolean55 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
