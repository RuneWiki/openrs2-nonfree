import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_129 = new Class18(26, -1);

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_34 = new Class42();

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
	public static int[] anIntArray309 = new int[2];

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
	public static int anInt4016 = -1;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
	public static final int[] anIntArray310 = new int[64];

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Lclient!eg;")
	public static Class1_Sub17 method3716() {
		if (Static269.aClass42_21 == null || Static286.aClass50_4 == null) {
			return null;
		}
		Static286.aClass50_4.method1693(Static269.aClass42_21);
		@Pc(23) Class1_Sub17 local23 = (Class1_Sub17) Static286.aClass50_4.method1690();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class194 local32 = Static226.method4184(local23.anInt1640);
			return local32 != null && local32.aBoolean435 && local32.method5269() ? local23 : Static10.method321();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ia;B)I")
	public static int method3717(@OriginalArg(0) Class1_Sub22 arg0) {
		@Pc(7) String local7 = Static123.method2597(arg0);
		@Pc(9) int[] local9 = null;
		if (Static83.method1776(arg0.anInt2822)) {
			local9 = Static243.aClass220_2.method5972((int) arg0.aLong104).anIntArray58;
		} else if (Static289.method5105(arg0.anInt2822)) {
			@Pc(66) Class11_Sub2_Sub6_Sub2 local66 = Static231.aClass11_Sub2_Sub6_Sub2Array1[(int) arg0.aLong104];
			if (local66 != null) {
				@Pc(71) Class208 local71 = local66.aClass208_1;
				if (local71.anIntArray480 != null) {
					local71 = local71.method5539();
				}
				if (local71 != null) {
					local9 = local71.anIntArray476;
				}
			}
		} else if (Static298.method5710(arg0.anInt2822)) {
			@Pc(40) Class71 local40;
			if (arg0.anInt2822 == 1006) {
				local40 = Static219.method4081((int) arg0.aLong104);
			} else {
				local40 = Static219.method4081((int) (arg0.aLong104 >>> 32 & 0x7FFFFFFFL));
			}
			if (local40.anIntArray178 != null) {
				local40 = local40.method2282();
			}
			if (local40 != null) {
				local9 = local40.anIntArray181;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static7.method285(local9);
		}
		@Pc(116) int local116 = Static64.aClass80_17.method2530(Static213.aClass4Array11, local7);
		if (arg0.aBoolean203) {
			local116 += Static155.aClass4_9.method5962() + 4;
		}
		return local116;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
	public static void method3718() {
		if (Static175.anInt3664 != -1) {
			Static12.method332(-1, false, Static175.anInt3664, -1);
			Static175.anInt3664 = -1;
		}
	}
}
