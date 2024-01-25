import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!da", name = "u", descriptor = "I")
	public static int anInt1127;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_47 = new Class214(68, -2);

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public static final int anInt1124 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)I")
	public static int method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg1) {
			return arg0;
		} else if (arg2 >= arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CB)Z")
	public static boolean method972(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public static void method976() {
		Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
		Static439.aClass214_250 = null;
		Static65.anInt1145 = 0;
		Static300.anInt5023 = 0;
		Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
		Static379.aClass214_229 = null;
		Static418.aClass214_243 = null;
		Static329.anInt5393 = 0;
		Static175.aClass214_107 = null;
		Static431.method5425();
		Static145.method1908();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static73.aClass20_Sub3_Sub3_Sub1Array1[local31] = null;
		}
		Static239.aClass20_Sub3_Sub3_Sub1_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static98.aClass20_Sub3_Sub3_Sub2Array1.length; local47++) {
			@Pc(53) Class20_Sub3_Sub3_Sub2 local53 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local47];
			if (local53 != null) {
				local53.anInt6012 = -1;
			}
		}
		Static121.method1659();
		Static100.anInt1781 = 1;
		Static430.method5422(30);
		for (@Pc(82) int local82 = 0; local82 < 100; local82++) {
			Static145.aBooleanArray15[local82] = true;
		}
		Static326.method4184();
		Static52.aClass1_Sub10_1 = null;
		Static15.aLong18 = 0L;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method983(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(5, arg0);
		local8.method3458();
	}
}
