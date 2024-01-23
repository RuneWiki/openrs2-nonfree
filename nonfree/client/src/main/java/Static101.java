import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt2176;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public static int anInt2179;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array10 = new Class107[1000];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_595 = Static231.method3737("showVideoAd");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class68[] local7 = Static76.aClass68Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(21) Class68 local21 = local7[local9];
			if (local21 != null && local21.anInt2519 == 2) {
				Static49.method1016(local21.anInt2518 * 2, local21.anInt2504 + (local21.anInt2514 - Static36.anInt764 << 7), arg3 >> 1, local21.anInt2512 + (local21.anInt2506 - Static152.anInt3377 << 7), arg2 >> 1);
				if (Static159.anInt3501 > -1 && Static128.anInt2802 % 20 < 10) {
					Static23.aClass1_Sub2_Sub2Array2[local21.anInt2508].method189(Static159.anInt3501 + arg1 - 12, arg0 + -28 + Static99.anInt922);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!sc;I)V")
	public static void method1691(@OriginalArg(0) Class107 arg0) {
		@Pc(7) int local7 = Static21.method393(arg0);
		if (local7 == -1) {
			return;
		}
		Static199.anInt4323 = Static83.aClass119_2.aShortArray52[local7] - anInt2179;
		Static194.anInt4290 = Static64.anInt1525 + Static152.anInt3375 - Static83.aClass119_2.aShortArray51[local7] - 1;
		@Pc(40) int local40 = Static199.anInt4323 - (int) ((float) Static66.aClass86_3.anInt3280 / Static4.aFloat10);
		@Pc(49) int local49 = (int) ((float) Static66.aClass86_3.anInt3280 / Static4.aFloat10) + Static199.anInt4323;
		@Pc(63) int local63 = Static194.anInt4290 - (int) ((float) Static66.aClass86_3.anInt3270 / Static4.aFloat10);
		@Pc(72) int local72 = (int) ((float) Static66.aClass86_3.anInt3270 / Static4.aFloat10) + Static194.anInt4290;
		if (local63 < 0) {
			Static194.anInt4290 = (int) ((float) Static66.aClass86_3.anInt3270 / Static4.aFloat10);
		}
		if (local40 < 0) {
			Static199.anInt4323 = (int) ((float) Static66.aClass86_3.anInt3280 / Static4.aFloat10);
		}
		if (Static170.anInt3706 < local49) {
			Static199.anInt4323 = Static170.anInt3706 - (int) ((float) Static66.aClass86_3.anInt3280 / Static4.aFloat10);
		}
		if (local72 > Static152.anInt3375) {
			Static194.anInt4290 = Static152.anInt3375 - (int) ((float) Static66.aClass86_3.anInt3270 / Static4.aFloat10);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIBII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static14.anInt333; local15++) {
			if (Static170.anIntArray328[local15] + Static25.anIntArray45[local15] > arg0 && Static25.anIntArray45[local15] < arg2 + arg0 && Static204.anIntArray232[local15] + Static189.anIntArray347[local15] > arg1 && arg3 + arg1 > Static189.anIntArray347[local15]) {
				Static175.aBooleanArray24[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Lclient!gd;")
	public static Class1_Sub11 method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = new Class1_Sub11();
		local7.anInt1575 = arg2;
		local7.anInt1576 = arg1;
		Static154.aClass50_18.method1362((long) arg0, local7);
		Static98.method1668(arg2);
		@Pc(26) Class86 local26 = Static13.method333(arg0);
		if (local26 != null) {
			Static16.method354(local26);
		}
		if (Static184.aClass86_14 != null) {
			Static16.method354(Static184.aClass86_14);
			Static184.aClass86_14 = null;
		}
		Static40.aBoolean81 = false;
		Static8.anInt259 = 0;
		Static5.method224(Static44.anInt965, Static100.anInt2167, Static104.anInt3191, anInt2176);
		if (local26 != null) {
			Static160.method2582(local26, false);
		}
		Static222.method2941(arg2);
		if (Static77.anInt1732 != -1) {
			Static31.method2199(1, Static77.anInt1732);
		}
		return local7;
	}
}
