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

@OriginalClass("client!rn")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
	private int anInt5679;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()V")
	@Override
	protected void method4799() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4803(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(22) String local22 = local17.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean499 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static57.anInt1232, 16, Static288.aBoolean515 ? 2 : 1, true, false);
		this.aByteArray84 = new byte[0x100 << (Static288.aBoolean515 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "()I")
	@Override
	protected int method4802() {
		return this.anInt5679 - (this.aSourceDataLine1.available() >> (Static288.aBoolean515 ? 2 : 1));
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
	@Override
	protected void method4796() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean499) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5679 << (Static288.aBoolean515 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()V")
	@Override
	protected void method4805() {
		@Pc(1) short local1 = 256;
		if (Static288.aBoolean515) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray460[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray84[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray84[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray84, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	@Override
	public void method4794(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static288.aBoolean515 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5679 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static350.method5646(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4794(Static338.method4468(arg0));
			}
		}
	}
}
