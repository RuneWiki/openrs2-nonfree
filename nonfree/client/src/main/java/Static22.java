import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_17;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_189 = Static177.method3050("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_190 = Static177.method3050("sl_flags");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public static void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static145.method2932(arg2, arg3, arg2 + arg1, arg3 + arg0);
		Static171.method2952();
		Static113.anInt2757++;
		Static155.method2667(true);
		Static100.method1916(true);
		Static155.method2667(false);
		Static100.method1916(false);
		Static156.method2679();
		Static142.method2442();
		@Pc(48) int local48;
		@Pc(80) int local80;
		if (!Static35.aBoolean47) {
			local48 = Static116.anInt2859;
			if (Static71.anInt1858 / 256 > local48) {
				local48 = Static71.anInt1858 / 256;
			}
			if (Static29.aBooleanArray4[4] && Static99.anIntArray235[4] + 128 > local48) {
				local48 = Static99.anIntArray235[4] + 128;
			}
			local80 = Static8.anInt297 + Static84.anInt4113 & 0x7FF;
			Static102.method1957(Static44.anInt1092, Static106.method1998(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832, Static73.anInt1873, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803) - 50, local80, local48, Static78.anInt1985, local48 * 3 + 600);
		}
		if (Static35.aBoolean47) {
			local48 = Static79.method1589();
		} else {
			local48 = Static62.method1290();
		}
		local80 = Static119.anInt2886;
		@Pc(116) int local116 = Static111.anInt2724;
		@Pc(118) int local118 = Static135.anInt3214;
		@Pc(120) int local120 = Static15.anInt456;
		@Pc(122) int local122 = Static4.anInt2849;
		@Pc(166) int local166;
		for (@Pc(124) int local124 = 0; local124 < 5; local124++) {
			if (Static29.aBooleanArray4[local124]) {
				local166 = (int) ((double) -Static117.anIntArray264[local124] + Math.random() * (double) (Static117.anIntArray264[local124] * 2 + 1) + Math.sin((double) Static79.anIntArray198[local124] / 100.0D * (double) Static84.anIntArray439[local124]) * (double) Static99.anIntArray235[local124]);
				if (local124 == 4) {
					Static15.anInt456 += local166;
					if (Static15.anInt456 < 128) {
						Static15.anInt456 = 128;
					}
					if (Static15.anInt456 > 383) {
						Static15.anInt456 = 383;
					}
				}
				if (local124 == 3) {
					Static4.anInt2849 = local166 + Static4.anInt2849 & 0x7FF;
				}
				if (local124 == 2) {
					Static135.anInt3214 += local166;
				}
				if (local124 == 1) {
					Static111.anInt2724 += local166;
				}
				if (local124 == 0) {
					Static119.anInt2886 += local166;
				}
			}
		}
		local166 = Static25.anInt620;
		@Pc(228) int local228 = Static169.anInt3778;
		if (arg2 <= local166 && arg1 + arg2 > local166 && arg3 <= local228 && local228 < arg3 + arg0) {
			Static34.anInt3724 = Static25.anInt620 - arg2;
			Static34.aBoolean146 = true;
			Static34.anInt3723 = 0;
			Static34.anInt3725 = Static169.anInt3778 - arg3;
		} else {
			Static34.aBoolean146 = false;
			Static34.anInt3723 = 0;
		}
		Static6.method100();
		Static145.method2941(arg2, arg3, arg1, arg0, 0);
		Static6.method100();
		Static36.method637(Static119.anInt2886, Static111.anInt2724, Static135.anInt3214, Static15.anInt456, Static4.anInt2849, local48);
		Static6.method100();
		Static12.method239();
		Static98.method1898(arg2, arg0, arg3, arg1);
		Static152.method2602(arg2, arg3);
		((Class15) Static171.anInterface1_2).method389(Static68.anInt1847);
		Static40.method698(arg0, arg3, arg1, arg2);
		Static4.anInt2849 = local122;
		Static119.anInt2886 = local80;
		Static135.anInt3214 = local118;
		Static111.anInt2724 = local116;
		Static15.anInt456 = local120;
		if (Static160.aBoolean142 && Static125.method2224() == 0) {
			Static160.aBoolean142 = false;
		}
		if (Static160.aBoolean142) {
			Static145.method2941(arg2, arg3, arg1, arg0, 0);
			Static13.method264(false, Static128.aClass46_1117);
		}
		if (!Static160.aBoolean142 && !Static64.aBoolean76 && arg2 <= local166 && arg1 + arg2 > local166 && arg3 <= local228 && local228 < arg3 + arg0) {
			Static7.method107(local166, arg3, local228, arg2);
		}
	}
}
