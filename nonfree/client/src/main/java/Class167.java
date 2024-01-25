import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class167 {

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "F")
	public float aFloat82 = 1.0F;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "F")
	public float aFloat83 = 1.0F;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "F")
	public float aFloat85 = 0.25F;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "F")
	public final float aFloat80;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public final int anInt4908;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public final int anInt4906;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "F")
	public final float aFloat84;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public final int anInt4899;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!kn;")
	public final Class108 aClass108_2;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public final int anInt4898;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public final int anInt4902;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public final int anInt4903;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class167() {
		this.aFloat80 = 1.2F;
		this.anInt4908 = -50;
		this.anInt4906 = Static97.anInt2346;
		this.aFloat84 = 1.1523438F;
		this.anInt4899 = -50;
		this.aClass108_2 = Static407.aClass108_7;
		this.anInt4898 = -60;
		this.aFloat79 = 0.69921875F;
		this.anInt4902 = 0;
		this.anInt4903 = Static542.anInt9777;
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class167(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(16) int local16 = arg0.method6538();
		if (Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823) && Static322.aClass15_10.method5329() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4906 = Static97.anInt2346;
			} else {
				this.anInt4906 = arg0.method6497();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat84 = 1.1523438F;
			} else {
				this.aFloat84 = (float) arg0.method6535() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat79 = 0.69921875F;
			} else {
				this.aFloat79 = (float) arg0.method6535() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat80 = 1.2F;
			} else {
				this.aFloat80 = (float) arg0.method6535() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6497();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6535();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6535();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6535();
			}
			this.aFloat80 = 1.2F;
			this.aFloat79 = 0.69921875F;
			this.anInt4906 = Static97.anInt2346;
			this.aFloat84 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4898 = -60;
			this.anInt4908 = -50;
			this.anInt4899 = -50;
		} else {
			this.anInt4908 = arg0.method6525();
			this.anInt4898 = arg0.method6525();
			this.anInt4899 = arg0.method6525();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4903 = Static542.anInt9777;
		} else {
			this.anInt4903 = arg0.method6497();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4902 = 0;
		} else {
			this.anInt4902 = arg0.method6535();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass108_2 = Static407.aClass108_7;
		} else {
			@Pc(219) int local219 = arg0.method6535();
			@Pc(223) int local223 = arg0.method6535();
			@Pc(227) int local227 = arg0.method6535();
			@Pc(231) int local231 = arg0.method6535();
			@Pc(235) int local235 = arg0.method6535();
			@Pc(239) int local239 = arg0.method6535();
			this.aClass108_2 = Static15.method462(local223, local219, local231, local227, local235, local239);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method4126(@OriginalArg(0) Class3_Sub7 arg0) {
		this.aFloat82 = (float) (arg0.method6538() * 8) / 255.0F;
		this.aFloat85 = (float) (arg0.method6538() * 8) / 255.0F;
		this.aFloat83 = (float) (arg0.method6538() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!jd;)Z")
	public boolean method4129(@OriginalArg(1) Class167 arg0) {
		return this.anInt4906 == arg0.anInt4906 && this.aFloat84 == arg0.aFloat84 && this.aFloat79 == arg0.aFloat79 && arg0.aFloat80 == this.aFloat80 && this.aFloat85 == arg0.aFloat85 && arg0.aFloat82 == this.aFloat82 && arg0.aFloat83 == this.aFloat83 && arg0.anInt4903 == this.anInt4903 && arg0.anInt4902 == this.anInt4902 && this.aClass108_2 == arg0.aClass108_2;
	}
}
