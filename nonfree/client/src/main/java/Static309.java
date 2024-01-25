import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt5846;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public static int anInt5850;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
	public static int method5094() {
		return Static540.anInt9169;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	public static void method5101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static176.anInt3424 == arg2 && Static26.anInt961 == arg0 && Static222.anInt4226 == arg1) {
			return;
		}
		Static585.aBoolean690 = true;
		Static222.anInt4226 = arg1;
		Static26.anInt961 = arg0;
		Static176.anInt3424 = arg2;
		@Pc(39) double local39 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static49.aDouble5 = local61 * -local52;
		Static116.aDouble7 = local58 * -local55;
		Static547.aDouble4 = local55 * local61;
		Static70.aDouble25 = local52;
		Static638.aDouble37 = 0.0D;
		Static225.aDouble30 = local61;
		Static545.aDouble34 = local52 * local58;
		Static478.aDouble29 = local55;
		Static100.aDouble6 = local58;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method5103() {
		for (@Pc(6) Class3_Sub4_Sub1 local6 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local6 != null; local6 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
			if (local6.anInt805 > 1) {
				local6.anInt805 = 0;
				Static209.aClass102_25.method2674(((Class3_Sub4_Sub13) local6.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66).aLong135, local6);
				local6.aClass15_1.method903();
			}
		}
		Static160.anInt3142 = 0;
		Static157.anInt3113 = 0;
		Static464.aClass223_49.method5862();
		Static458.aClass280_34.method7100();
		Static226.aClass15_3.method903();
		Static186.method3213(Static335.aClass3_Sub4_Sub13_2);
	}
}
