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

@OriginalClass("client!eo")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
	private int anInt1747;

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1829(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean124 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static14.anInt4962, 16, Static100.aBoolean156 ? 2 : 1, true, false);
		this.aByteArray37 = new byte[0x100 << (Static100.aBoolean156 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "()I")
	@Override
	protected int method1824() {
		return this.anInt1747 - (this.aSourceDataLine1.available() >> (Static100.aBoolean156 ? 2 : 1));
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "()V")
	@Override
	protected void method1831() {
		@Pc(1) short local1 = 256;
		if (Static100.aBoolean156) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray150[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray37[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray37[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray37, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "()V")
	@Override
	protected void method1822() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean124) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1747 << (Static100.aBoolean156 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	@Override
	public void method1835(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static100.aBoolean156 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1747 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static24.method612(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1835(Static73.method1617(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "()V")
	@Override
	protected void method1823() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
