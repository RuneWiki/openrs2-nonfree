import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class210 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "F")
	public float aFloat81 = 0.25F;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "F")
	public float aFloat82 = 1.0F;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "F")
	public float aFloat84 = 1.0F;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt5569;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	public final int anInt5579;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public final int anInt5576;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public final int anInt5575;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "F")
	public final float aFloat80;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public final int anInt5573;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "F")
	public final float aFloat83;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!tl;")
	public final Class9 aClass9_5;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public final int anInt5572;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class210() {
		this.anInt5569 = -60;
		this.anInt5579 = -50;
		this.anInt5576 = 0;
		this.anInt5575 = Static455.anInt7453;
		this.aFloat80 = 1.2F;
		this.anInt5573 = Static91.anInt1609;
		this.aFloat83 = 1.1523438F;
		this.aClass9_5 = Static291.aClass9_4;
		this.aFloat79 = 0.69921875F;
		this.anInt5572 = -50;
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class210(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method4463();
		if (Static336.aClass106_Sub1_1.method4423(Static410.anInt6680) && Static38.aClass128_9.method3558() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5573 = Static91.anInt1609;
			} else {
				this.anInt5573 = arg0.method4487();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat83 = 1.1523438F;
			} else {
				this.aFloat83 = (float) arg0.method4485() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat79 = 0.69921875F;
			} else {
				this.aFloat79 = (float) arg0.method4485() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat80 = 1.2F;
			} else {
				this.aFloat80 = (float) arg0.method4485() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4487();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4485();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4485();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4485();
			}
			this.anInt5573 = Static91.anInt1609;
			this.aFloat80 = 1.2F;
			this.aFloat79 = 0.69921875F;
			this.aFloat83 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5569 = -60;
			this.anInt5572 = -50;
			this.anInt5579 = -50;
		} else {
			this.anInt5572 = arg0.method4482();
			this.anInt5569 = arg0.method4482();
			this.anInt5579 = arg0.method4482();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5575 = Static455.anInt7453;
		} else {
			this.anInt5575 = arg0.method4487();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5576 = 0;
		} else {
			this.anInt5576 = arg0.method4485();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass9_5 = Static291.aClass9_4;
		} else {
			@Pc(232) int local232 = arg0.method4485();
			@Pc(236) int local236 = arg0.method4485();
			@Pc(240) int local240 = arg0.method4485();
			@Pc(244) int local244 = arg0.method4485();
			@Pc(248) int local248 = arg0.method4485();
			@Pc(252) int local252 = arg0.method4485();
			this.aClass9_5 = Static448.method5117(local244, local232, local240, local236, local248, local252);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method4346(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aFloat84 = (float) (arg0.method4463() * 8) / 255.0F;
		this.aFloat81 = (float) (arg0.method4463() * 8) / 255.0F;
		this.aFloat82 = (float) (arg0.method4463() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!rb;)Z")
	public boolean method4347(@OriginalArg(1) Class210 arg0) {
		return this.anInt5573 == arg0.anInt5573 && arg0.aFloat83 == this.aFloat83 && this.aFloat79 == arg0.aFloat79 && arg0.aFloat80 == this.aFloat80 && this.aFloat81 == arg0.aFloat81 && arg0.aFloat84 == this.aFloat84 && arg0.aFloat82 == this.aFloat82 && this.anInt5575 == arg0.anInt5575 && this.anInt5576 == arg0.anInt5576 && arg0.aClass9_5 == this.aClass9_5;
	}
}
