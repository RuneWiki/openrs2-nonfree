import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tja", name = "j", descriptor = "[I")
	public static int[] anIntArray510;

	@OriginalMember(owner = "client!tja", name = "k", descriptor = "Lclient!m;")
	public static Class2_Sub1_Sub13 aClass2_Sub1_Sub13_4;

	@OriginalMember(owner = "client!tja", name = "i", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_96 = new Class341(18, 8);

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZIII)V")
	public static void method8738(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static284.aClass335_14.method8357((long) arg2) != null) {
			return;
		}
		if (Static592.aBoolean781) {
			@Pc(32) Class2_Sub18 local32 = new Class2_Sub18(arg2, new Class78_Sub1(4096, Static455.aClass124_100, arg2), arg1, arg0);
			local32.aClass78_Sub1_1.method2000(Static372.aStringArray39[Static204.anInt8130]);
			Static284.aClass335_14.method8356(local32, (long) arg2);
		} else {
			Static432.method7065(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V")
	public static void method8739() {
		Static237.method4264();
		Static14.aClass169_207 = null;
		Static446.aClass169_194 = null;
		Static10.anInt166 = 0;
		Static543.anInt9483 = 0;
		Static482.aClass169_210 = null;
		Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
		Static538.anInt9383 = 0;
		Static275.aClass169_135 = null;
		Static591.method8905();
		Static24.method450();
		for (@Pc(32) int local32 = 0; local32 < 2048; local32++) {
			Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local32] = null;
		}
		Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 = null;
		for (@Pc(46) int local46 = 0; local46 < Static487.anInt8726; local46++) {
			@Pc(53) Class15_Sub3_Sub3_Sub1_Sub2 local53 = Static275.aClass2_Sub6Array1[local46].aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (local53 != null) {
				local53.anInt3979 = -1;
			}
		}
		Static648.method9545();
		Static484.anInt8685 = 1;
		Static533.anInt9359 = -1;
		Static5.anInt83 = -1;
		Static248.method4408(10);
		for (@Pc(75) int local75 = 0; local75 < 100; local75++) {
			Static561.aBooleanArray58[local75] = true;
		}
		Static62.method1157();
		Static354.aClass2_Sub22_1 = null;
		Static21.aLong13 = 0L;
	}
}
