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

@OriginalClass("client!hda")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "I")
	private int anInt3940;

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hda", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hda", name = "M", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!hda", name = "K", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
	@Override
	protected void method6360() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "()V")
	@Override
	protected void method6361() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean289) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3940 << (Static21.aBoolean12 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	@Override
	public void method6371(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static21.aBoolean12 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3940 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static321.method4872(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6371(Static613.method8740(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6362(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(24) String local24 = local17.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean289 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static491.anInt8290, 16, Static21.aBoolean12 ? 2 : 1, true, false);
		this.aByteArray31 = new byte[0x100 << (Static21.aBoolean12 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "()I")
	@Override
	protected int method6365() {
		return this.anInt3940 - (this.aSourceDataLine1.available() >> (Static21.aBoolean12 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()V")
	@Override
	protected void method6356() {
		@Pc(1) short local1 = 256;
		if (Static21.aBoolean12) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray382[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray31[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray31[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray31, 0, local1 << 1);
	}
}
