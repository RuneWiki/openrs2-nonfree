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

@OriginalClass("client!ea")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
	@Override
	protected int method1992() {
		return this.anInt969 - (this.aSourceDataLine1.available() >> (Static59.aBoolean76 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	@Override
	public void method1999(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static59.aBoolean76 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt969 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static118.method2003(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1999(Static61.method1102(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
	@Override
	protected void method1995() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean62) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt969 << (Static59.aBoolean76 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
	@Override
	protected void method1984() {
		@Pc(1) short local1 = 256;
		if (Static59.aBoolean76) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray335[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray18[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray18[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray18, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	@Override
	protected void method1987() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1994(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(26) String local26 = local21.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean62 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static191.anInt4086, 16, Static59.aBoolean76 ? 2 : 1, true, false);
		this.aByteArray18 = new byte[0x100 << (Static59.aBoolean76 ? 2 : 1)];
	}
}
