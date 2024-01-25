import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "F")
	private float aFloat205;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
	private int anInt9932;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt9933;

	@OriginalMember(owner = "client!ts", name = "G", descriptor = "Ljava/lang/String;")
	private String aString100;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "Ljava/lang/String;")
	private String aString101;

	@OriginalMember(owner = "client!ts", name = "L", descriptor = "F")
	private float aFloat206;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub5_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method8257() {
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)F")
	public float method8263() {
		return this.aFloat206;
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(B)F")
	public float method8264() {
		return this.aFloat205;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8260(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9926 > 0 && !"SUB".equals(this.aString100)) {
			return;
		}
		@Pc(21) Class2_Sub11 local21 = new Class2_Sub11(arg0.getData());
		@Pc(25) int local25 = local21.method8383();
		if (super.anInt9926 <= 8) {
			if ((local25 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (super.anInt9926 == 0) {
				local21.anInt10066 += 23;
				this.anInt9933 = local21.method8355();
				this.anInt9932 = local21.method8355();
				if (this.anInt9933 == 0 || this.anInt9932 == 0) {
					throw new IllegalStateException();
				}
				@Pc(77) Class2_Sub11 local77 = new Class2_Sub11(16);
				local21.method8385(0, 16, local77.aByteArray128);
				this.aString99 = local77.method8373();
				local77.anInt10066 = 0;
				local21.method8385(0, 16, local77.aByteArray128);
				this.aString100 = local77.method8373();
			}
			return;
		}
		if (local25 == 0) {
			@Pc(112) long local112 = local21.method8328();
			@Pc(116) long local116 = local21.method8328();
			@Pc(120) long local120 = local21.method8328();
			if (local112 < 0L || local116 < 0L || local120 < 0L || local120 > local112) {
				throw new IllegalStateException();
			}
			this.aFloat206 = (float) ((long) this.anInt9932 * local112) / (float) this.anInt9933;
			this.aFloat205 = (float) ((local112 + local116) * (long) this.anInt9932) / (float) this.anInt9933;
			@Pc(177) int local177 = local21.method8355();
			if (local177 < 0 || local21.aByteArray128.length - local21.anInt10066 < local177) {
				throw new IllegalStateException();
			}
			this.aString101 = Static543.method8142(local21.aByteArray128, local21.anInt10066, local177);
		}
		if ((local25 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method8266() {
		return this.aString99;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method8269() {
		return this.aString101;
	}
}
