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

@OriginalClass("client!lf")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	private int anInt5107;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()V")
	@Override
	protected void method7510() {
		@Pc(1) short local1 = 256;
		if (Static19.aBoolean22) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray691[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray56[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray56[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray56, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()I")
	@Override
	protected int method7505() {
		return this.anInt5107 - (this.aSourceDataLine1.available() >> (Static19.aBoolean22 ? 2 : 1));
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()V")
	@Override
	protected void method7512() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
	@Override
	protected void method7503() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean414) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5107 << (Static19.aBoolean22 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7513(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean414 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Class1_Sub30_Sub1.lb, 16, Static19.aBoolean22 ? 2 : 1, true, false);
		this.aByteArray56 = new byte[0x100 << (Static19.aBoolean22 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	@Override
	public void method7517(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static19.aBoolean22 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5107 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static406.method5636(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7517(Static457.method6299(arg0));
			}
		}
	}
}
