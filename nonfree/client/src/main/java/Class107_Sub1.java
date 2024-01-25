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

@OriginalClass("client!fb")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class107_Sub1() {
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()V")
	@Override
	protected void method5375() {
		@Pc(1) short local1 = 256;
		if (Static330.aBoolean659) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray471[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray25[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray25[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray25, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
	@Override
	protected void method5379() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean189) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) Info local38 = new Info(Static162.aClass13 == null ? (Static162.aClass13 = a("javax.sound.sampled.SourceDataLine")) : Static162.aClass13, this.anAudioFormat1, this.anInt2900 << (Static330.aBoolean659 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()I")
	@Override
	protected int method5376() {
		return this.anInt2900 - (this.aSourceDataLine1.available() >> (Static330.aBoolean659 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5369(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean189 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static330.anInt9773, 16, Static330.aBoolean659 ? 2 : 1, true, false);
		this.aByteArray25 = new byte[0x100 << (Static330.aBoolean659 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	@Override
	public void method5373(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) Info local23 = new Info(Static162.aClass13 == null ? (Static162.aClass13 = a("javax.sound.sampled.SourceDataLine")) : Static162.aClass13, this.anAudioFormat1, arg0 << (Static330.aBoolean659 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2900 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static356.method4980(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method5373(Static92.method1941(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
	@Override
	protected void method5378() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
