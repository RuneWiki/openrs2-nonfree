import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class150 implements Interface6 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!maa;")
	private final Class217 aClass217_2;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!kp;")
	private final Class194 aClass194_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!maa;Lclient!kp;)V")
	public Class150(@OriginalArg(0) Class217 arg0, @OriginalArg(1) Class194 arg1) {
		this.aClass217_2 = arg0;
		this.aClass194_1 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!la;ILjava/lang/String;IBI)I")
	private int method3207(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3) {
		return arg0.method7261(0, 0, null, 0, arg3 + 5, 0, null, this.aClass194_1.anInt5036, 0, arg1 + 5, this.aClass194_1.anInt5034 + -10, this.aClass194_1.anInt5039, this.aClass194_1.anInt5042 - 10, arg2, null);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		return this.aClass217_2.method4656();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		@Pc(18) Class27 local18 = this.aClass217_2.method4658(this.aClass194_1.anInt5035);
		if (local18 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass194_1.aClass259_8.method5515(this.aClass194_1.anInt5034, Static318.anInt5819) + this.aClass194_1.anInt5040;
		@Pc(50) int local50 = this.aClass194_1.aClass216_8.method4653(this.aClass194_1.anInt5042, Static192.anInt3766) + this.aClass194_1.anInt5038;
		if (this.aClass194_1.aBoolean383) {
			Static31.aClass78_18.method6778(local35, local50, this.aClass194_1.anInt5034, this.aClass194_1.anInt5042, this.aClass194_1.anInt5037, 0);
		}
		local50 += this.method3207(Static62.aClass96_4, local35, local18.aString5, local50) * 12;
		local50 += 8;
		if (this.aClass194_1.aBoolean383) {
			Static31.aClass78_18.method6815(local35, local50, local35 + this.aClass194_1.anInt5034 - 1, local50, this.aClass194_1.anInt5037, 0);
		}
		local50++;
		local50 += this.method3207(Static62.aClass96_4, local35, local18.aString6, local50) * 12;
		local50 += 5;
		@Pc(132) int local132 = local50 + this.method3207(Static62.aClass96_4, local35, local18.aString4, local50) * 12;
	}
}
