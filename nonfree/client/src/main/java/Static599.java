import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_156 = new Class337(120, 3);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIBLclient!ha;)V")
	public static void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class133 arg4) {
		if ((Static628.aClass28_35 == null || Static17.aClass28_1 == null || Static615.aClass28_34 == null) && Static441.aClass207_89.method4678(Static306.anInt5330) && Static441.aClass207_89.method4678(Static530.anInt9821) && Static441.aClass207_89.method4678(Static183.anInt3242)) {
			@Pc(36) Class131 local36 = Static649.method2888(Static441.aClass207_89, Static530.anInt9821, 0);
			Static17.aClass28_1 = arg4.method7297(local36, true);
			local36.method2901();
			Static215.aClass28_9 = arg4.method7297(local36, true);
			Static628.aClass28_35 = arg4.method7297(Static649.method2888(Static441.aClass207_89, Static306.anInt5330, 0), true);
			@Pc(61) Class131 local61 = Static649.method2888(Static441.aClass207_89, Static183.anInt3242, 0);
			Static615.aClass28_34 = arg4.method7297(local61, true);
			local61.method2901();
			Static586.aClass28_33 = arg4.method7297(local61, true);
		}
		if (Static628.aClass28_35 == null || Static17.aClass28_1 == null || Static615.aClass28_34 == null) {
			return;
		}
		@Pc(90) int local90 = (arg2 - Static615.aClass28_34.method4032() * 2) / Static628.aClass28_35.method4032();
		for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
			Static628.aClass28_35.method4040(arg3 + Static615.aClass28_34.method4032() + Static628.aClass28_35.method4032() * local92, -Static628.aClass28_35.method4037() + arg1 + arg0);
		}
		@Pc(127) int local127 = (arg0 - Static615.aClass28_34.method4037() - 20) / Static17.aClass28_1.method4037();
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			Static17.aClass28_1.method4040(arg3, Static17.aClass28_1.method4037() * local129 + arg1 + 20);
			Static215.aClass28_9.method4040(arg2 + arg3 - Static215.aClass28_9.method4032(), arg1 - -(local129 * Static17.aClass28_1.method4037()) + 20);
		}
		Static615.aClass28_34.method4040(arg3, arg0 + arg1 - Static615.aClass28_34.method4037());
		Static586.aClass28_33.method4040(arg2 + arg3 - Static615.aClass28_34.method4032(), -Static615.aClass28_34.method4037() + arg0 + arg1);
	}
}
