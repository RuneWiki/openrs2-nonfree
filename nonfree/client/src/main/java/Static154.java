import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!wa;")
	public static Class23 aClass23_56;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!kd;")
	public static Class5_Sub11_Sub2 aClass5_Sub11_Sub2_2;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1167 = Static161.method2452("purple:");

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1168 = aClass20_1167;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1171 = Static161.method2452(" is already on your ignore list)3");

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1169 = aClass20_1171;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1170 = aClass20_1167;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
	public static void method2333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].anInt335 = arg3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method2334() {
		Static50.anInt1085 = -1;
		Static211.anInt4102 = 0;
		Static85.anInt1879 = 0;
		Static87.anInt2704 = -1;
		Static196.anInt3834 = -1;
		Static104.aBoolean95 = false;
		Static166.anInt3320 = 0;
		Static50.anInt1080 = -1;
		Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
		Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
		Static118.anInt3277 = 0;
		Static6.anInt155 = 0;
		Static67.anInt3979 = 0;
		for (@Pc(39) int local39 = 0; local39 < Static6.aClass1_Sub2_Sub2Array1.length; local39++) {
			if (Static6.aClass1_Sub2_Sub2Array1[local39] != null) {
				Static6.aClass1_Sub2_Sub2Array1[local39].anInt2249 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static61.aClass1_Sub2_Sub1Array1.length; local57++) {
			if (Static61.aClass1_Sub2_Sub1Array1[local57] != null) {
				Static61.aClass1_Sub2_Sub1Array1[local57].anInt2249 = -1;
			}
		}
		Static185.method2811();
		Static208.method3109(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static185.aBooleanArray43[local80] = true;
		}
	}
}
