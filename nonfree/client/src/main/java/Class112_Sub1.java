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

@OriginalClass("client!fq")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
	private int anInt3298;

	@OriginalMember(owner = "client!fq", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fq", name = "L", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fq", name = "J", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "()I")
	@Override
	protected int method5378() {
		return this.anInt3298 - (this.aSourceDataLine1.available() >> (Static40.aBoolean129 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	@Override
	public void method5386(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static40.aBoolean129 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3298 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static179.method2847(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5386(Static330.method5181(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5384(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(26) String local26 = local19.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean255 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static515.anInt9036, 16, Static40.aBoolean129 ? 2 : 1, true, false);
		this.aByteArray46 = new byte[0x100 << (Static40.aBoolean129 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "()V")
	@Override
	protected void method5382() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "()V")
	@Override
	protected void method5383() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean255) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3298 << (Static40.aBoolean129 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "()V")
	@Override
	protected void method5379() {
		@Pc(1) short local1 = 256;
		if (Static40.aBoolean129) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray471[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray46[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray46[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray46, 0, local1 << 1);
	}
}
