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

@OriginalClass("client!wp")
public final class Class303_Sub2 extends Class303 {

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "[B")
	private byte[] aByteArray119;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "I")
	private int anInt9753;

	@OriginalMember(owner = "client!wp", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "()V")
	@Override
	protected void method7984() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
	@Override
	protected void method7981() {
		@Pc(1) short local1 = 256;
		if (Static558.aBoolean667) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray722[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray119[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray119[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray119, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "()I")
	@Override
	protected int method7986() {
		return this.anInt9753 - (this.aSourceDataLine1.available() >> (Static558.aBoolean667 ? 2 : 1));
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
	@Override
	public void method7985(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static558.aBoolean667 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt9753 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static557.method95(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7985(Static514.method7261(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	@Override
	protected void method7976() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean685) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt9753 << (Static558.aBoolean667 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7982(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean685 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static379.anInt7010, 16, Static558.aBoolean667 ? 2 : 1, true, false);
		this.aByteArray119 = new byte[0x100 << (Static558.aBoolean667 ? 2 : 1)];
	}
}
