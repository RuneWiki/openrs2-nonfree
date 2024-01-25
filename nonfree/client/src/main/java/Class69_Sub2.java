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

@OriginalClass("client!sl")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt8258;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "Z")
	private boolean aBoolean564 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
	@Override
	protected void method6837() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean564) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt8258 << (Static140.aBoolean250 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
	@Override
	public void method6846(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static140.aBoolean250 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt8258 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static326.method5150(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6846(Static37.method6277(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "()V")
	@Override
	protected void method6843() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "()I")
	@Override
	protected int method6847() {
		return this.anInt8258 - (this.aSourceDataLine1.available() >> (Static140.aBoolean250 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6849(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean564 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static426.anInt6103, 16, Static140.aBoolean250 ? 2 : 1, true, false);
		this.aByteArray100 = new byte[0x100 << (Static140.aBoolean250 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "()V")
	@Override
	protected void method6844() {
		@Pc(1) short local1 = 256;
		if (Static140.aBoolean250) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray615[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray100[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray100[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray100, 0, local1 << 1);
	}
}
