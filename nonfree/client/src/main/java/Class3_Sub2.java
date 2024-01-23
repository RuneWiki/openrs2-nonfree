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

@OriginalClass("client!jk")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!jk", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	private int anInt2626;

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
	@Override
	protected void method2232() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "()I")
	@Override
	protected int method2235() {
		return this.anInt2626 - (this.aSourceDataLine1.available() >> (Static82.aBoolean465 ? 2 : 1));
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "()V")
	@Override
	protected void method2236() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean205) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2626 << (Static82.aBoolean465 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2227(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(24) String local24 = local19.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean205 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static110.anInt2380, 16, Static82.aBoolean465 ? 2 : 1, true, false);
		this.aByteArray23 = new byte[0x100 << (Static82.aBoolean465 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "()V")
	@Override
	protected void method2233() {
		@Pc(1) short local1 = 256;
		if (Static82.aBoolean465) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray172[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray23[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray23[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray23, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	@Override
	public void method2238(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static82.aBoolean465 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2626 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static273.method4566(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2238(Static7.method217(arg0));
			}
		}
	}
}
