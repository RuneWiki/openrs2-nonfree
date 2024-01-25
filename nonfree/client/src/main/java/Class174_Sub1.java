import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class174_Sub1 extends Class174 {

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	private int anInt5153;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5512(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean428 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static184.anInt3834, 16, Static111.aBoolean191 ? 2 : 1, true, false);
		this.aByteArray83 = new byte[0x100 << (Static111.aBoolean191 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	@Override
	protected void method5517() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean428) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5153 << (Static111.aBoolean191 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public void method5509(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static111.aBoolean191 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5153 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static169.method4148(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5509(Static339.method5608(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	@Override
	protected void method5516() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
	@Override
	protected int method5522() {
		return this.anInt5153 - (this.aSourceDataLine1.available() >> (Static111.aBoolean191 ? 2 : 1));
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	@Override
	protected void method5524() {
		@Pc(1) short local1 = 256;
		if (Static111.aBoolean191) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray785[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray83[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray83[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray83, 0, local1 << 1);
	}
}
