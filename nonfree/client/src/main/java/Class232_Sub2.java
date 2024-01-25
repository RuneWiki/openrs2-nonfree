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

@OriginalClass("client!vt")
public final class Class232_Sub2 extends Class232 {

	@OriginalMember(owner = "client!vt", name = "F", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vt", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vt", name = "H", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
	private int anInt10016;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "Z")
	private boolean aBoolean738 = false;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	@Override
	public void method8521(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static293.aBoolean421 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt10016 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static385.method5625(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method8521(Static527.method7377(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "()V")
	@Override
	protected void method8508() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean738) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt10016 << (Static293.aBoolean421 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "()I")
	@Override
	protected int method8509() {
		return this.anInt10016 - (this.aSourceDataLine1.available() >> (Static293.aBoolean421 ? 2 : 1));
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "()V")
	@Override
	protected void method8518() {
		@Pc(1) short local1 = 256;
		if (Static293.aBoolean421) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray642[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray108[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray108[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray108, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8513(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean738 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static656.anInt1392, 16, Static293.aBoolean421 ? 2 : 1, true, false);
		this.aByteArray108 = new byte[0x100 << (Static293.aBoolean421 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "()V")
	@Override
	protected void method8522() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
