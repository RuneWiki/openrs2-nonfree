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

@OriginalClass("client!de")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!de", name = "K", descriptor = "I")
	private int anInt1832;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
	@Override
	protected void method1738() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean115) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1832 << (Static555.aBoolean676 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	@Override
	protected void method1727() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
	@Override
	protected void method1737() {
		@Pc(1) short local1 = 256;
		if (Static555.aBoolean676) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray115[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray18[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray18[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray18, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public void method1740(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static555.aBoolean676 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1832 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static180.method8385(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1740(Static655.method8912(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
	@Override
	protected int method1736() {
		return this.anInt1832 - (this.aSourceDataLine1.available() >> (Static555.aBoolean676 ? 2 : 1));
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1733(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean115 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static328.anInt8868, 16, Static555.aBoolean676 ? 2 : 1, true, false);
		this.aByteArray18 = new byte[0x100 << (Static555.aBoolean676 ? 2 : 1)];
	}
}
