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

@OriginalClass("client!kn")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "[B")
	private byte[] aByteArray132;

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	private int anInt5388;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "Z")
	private boolean aBoolean369 = false;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "()I")
	@Override
	protected int method5322() {
		return this.anInt5388 - (this.aSourceDataLine1.available() >> (Static102.aBoolean181 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	@Override
	public void method5325(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static102.aBoolean181 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5388 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static57.method1394(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5325(Static538.method7366(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
	@Override
	protected void method5316() {
		@Pc(1) short local1 = 256;
		if (Static102.aBoolean181) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray373[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray132[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray132[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray132, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()V")
	@Override
	protected void method5320() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean369) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5388 << (Static102.aBoolean181 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "()V")
	@Override
	protected void method5324() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5317(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean369 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static180.anInt3952, 16, Static102.aBoolean181 ? 2 : 1, true, false);
		this.aByteArray132 = new byte[0x100 << (Static102.aBoolean181 ? 2 : 1)];
	}
}
