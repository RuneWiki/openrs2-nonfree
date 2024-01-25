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

@OriginalClass("client!sv")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
	private int anInt9762;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "Z")
	private boolean aBoolean705 = false;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	private Class33_Sub2() {
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
	@Override
	protected void method8240() {
		@Pc(1) short local1 = 256;
		if (Static510.aBoolean777) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray542[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray97[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray97[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray97, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()V")
	@Override
	protected void method8233() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8238(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(28) String local28 = local21.getName();
					if (local28 != null && local28.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean705 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static103.anInt1658, 16, Static510.aBoolean777 ? 2 : 1, true, false);
		this.aByteArray97 = new byte[0x100 << (Static510.aBoolean777 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()I")
	@Override
	protected int method8235() {
		return this.anInt9762 - (this.aSourceDataLine1.available() >> (Static510.aBoolean777 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
	@Override
	protected void method8231() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean705) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(38) javax.sound.sampled.DataLine.Info local38 = new javax.sound.sampled.DataLine.Info(Static598.aClass22 == null ? (Static598.aClass22 = a("javax.sound.sampled.SourceDataLine")) : Static598.aClass22, this.anAudioFormat1, this.anInt9762 << (Static510.aBoolean777 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local38);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	@Override
	public void method8237(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(23) javax.sound.sampled.DataLine.Info local23 = new javax.sound.sampled.DataLine.Info(Static598.aClass22 == null ? (Static598.aClass22 = a("javax.sound.sampled.SourceDataLine")) : Static598.aClass22, this.anAudioFormat1, arg0 << (Static510.aBoolean777 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local23);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt9762 = arg0;
		} catch (@Pc(39) LineUnavailableException local39) {
			if (Static238.method3674(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local39;
			} else {
				this.method8237(Static60.method735(arg0));
			}
		}
	}
}
