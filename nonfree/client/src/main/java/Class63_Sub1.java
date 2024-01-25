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

@OriginalClass("client!cu")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!cu", name = "J", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	@Override
	public void method3496(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static568.aBoolean763 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1361 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static160.method2419(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3496(Static522.method6795(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "()V")
	@Override
	protected void method3490() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean113) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1361 << (Static568.aBoolean763 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3494(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean113 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static92.anInt9993, 16, Static568.aBoolean763 ? 2 : 1, true, false);
		this.aByteArray18 = new byte[0x100 << (Static568.aBoolean763 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "()I")
	@Override
	protected int method3491() {
		return this.anInt1361 - (this.aSourceDataLine1.available() >> (Static568.aBoolean763 ? 2 : 1));
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "()V")
	@Override
	protected void method3501() {
		@Pc(1) short local1 = 256;
		if (Static568.aBoolean763) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray320[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray18[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray18[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray18, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "()V")
	@Override
	protected void method3499() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
