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

@OriginalClass("client!hi")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	@Override
	public void method2727(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static15.aBoolean12 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1776 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static90.method3683(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2727(Static148.method2539(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "()I")
	@Override
	protected int method2738() {
		return this.anInt1776 - (this.aSourceDataLine1.available() >> (Static15.aBoolean12 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()V")
	@Override
	protected void method2735() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean80) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1776 << (Static15.aBoolean12 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	@Override
	protected void method2729() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()V")
	@Override
	protected void method2733() {
		@Pc(1) short local1 = 256;
		if (Static15.aBoolean12) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray228[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray16[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray16[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray16, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2731(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean80 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static31.anInt702, 16, Static15.aBoolean12 ? 2 : 1, true, false);
		this.aByteArray16 = new byte[0x100 << (Static15.aBoolean12 ? 2 : 1)];
	}
}
