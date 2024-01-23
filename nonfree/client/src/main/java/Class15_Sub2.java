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

@OriginalClass("client!fd")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	private int anInt1680;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
	@Override
	protected void method1254() {
		@Pc(1) short local1 = 256;
		if (Static263.aBoolean329) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray184[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray49[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray49[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray49, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	@Override
	public void method1258(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static263.aBoolean329 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1680 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static280.method4266(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1258(Static315.method4766(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1250(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean117 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static230.anInt3026, 16, Static263.aBoolean329 ? 2 : 1, true, false);
		this.aByteArray49 = new byte[0x100 << (Static263.aBoolean329 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()I")
	@Override
	protected int method1247() {
		return this.anInt1680 - (this.aSourceDataLine1.available() >> (Static263.aBoolean329 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()V")
	@Override
	protected void method1255() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	@Override
	protected void method1244() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean117) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1680 << (Static263.aBoolean329 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
