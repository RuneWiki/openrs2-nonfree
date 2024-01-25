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

@OriginalClass("client!go")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!go", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "()V")
	@Override
	protected void method7812() {
		@Pc(1) short local1 = 256;
		if (Static313.aBoolean513) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray768[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray67[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray67[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray67, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7814(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(26) String local26 = local21.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean243 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static302.anInt5530, 16, Static313.aBoolean513 ? 2 : 1, true, false);
		this.aByteArray67 = new byte[0x100 << (Static313.aBoolean513 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	@Override
	public void method7819(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static313.aBoolean513 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3001 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static231.method3629(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7819(Static131.method2413(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()V")
	@Override
	protected void method7820() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean243) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3001 << (Static313.aBoolean513 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
	@Override
	protected void method7811() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()I")
	@Override
	protected int method7808() {
		return this.anInt3001 - (this.aSourceDataLine1.available() >> (Static313.aBoolean513 ? 2 : 1));
	}
}
