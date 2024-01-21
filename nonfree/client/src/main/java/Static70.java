import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Z")
	public static volatile boolean aBoolean64 = true;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "Lclient!od;")
	private static Class60 aClass60_700 = Static41.method597("Your account has been disabled)3");

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!od;")
	public static Class60 aClass60_698 = aClass60_700;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!od;")
	public static Class60 aClass60_699 = Static41.method597("::noclip");

	@OriginalMember(owner = "client!md", name = "L", descriptor = "[I")
	public static int[] anIntArray194 = new int[2000];

	@OriginalMember(owner = "client!md", name = "O", descriptor = "I")
	public static int anInt1742 = 0;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "[I")
	public static int[] anIntArray195 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!md", name = "T", descriptor = "Lclient!od;")
	public static Class60 aClass60_701 = Static41.method597("");

	@OriginalMember(owner = "client!md", name = "U", descriptor = "Lclient!od;")
	public static Class60 aClass60_702 = Static41.method597("blaugr-Un:");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
	public static void method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static44.method1487();
		Static34.method1652(arg1, arg0, arg1 + Static5.aClass4_Sub3_Sub6_Sub2_2.anInt2255, Static5.aClass4_Sub3_Sub6_Sub2_2.anInt2256 + arg0);
		if (Static29.anInt897 == 2 || Static29.anInt897 == 5) {
			Static34.method1653(arg1 + 25, arg0 - -5, Static8.anIntArray10, Static97.anIntArray294);
		} else {
			@Pc(27) int local27 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32 + 48;
			@Pc(34) int local34 = 464 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
			@Pc(40) int local40 = Static62.anInt1585 + Static79.anInt1896 & 0x7FF;
			Static106.aClass4_Sub3_Sub6_Sub3_5.method1622(arg1 + 25, arg0 + 5, 146, 151, local27, local34, local40, Static116.anInt2717 + 256, Static8.anIntArray10, Static97.anIntArray294);
			@Pc(75) int local75;
			@Pc(89) int local89;
			for (@Pc(60) int local60 = 0; local60 < Static91.anInt2139; local60++) {
				local75 = Static5.anIntArray7[local60] * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
				local89 = Static68.anIntArray192[local60] * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
				Static80.method1279(arg0, Static103.aClass4_Sub3_Sub6_Sub3Array9[local60], arg1, local75, local89);
			}
			@Pc(132) int local132;
			@Pc(143) int local143;
			for (local75 = 0; local75 < 104; local75++) {
				for (local89 = 0; local89 < 104; local89++) {
					@Pc(118) Class45 local118 = Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local75][local89];
					if (local118 != null) {
						local132 = local75 * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
						local143 = local89 * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
						Static80.method1279(arg0, Static118.aClass4_Sub3_Sub6_Sub3Array10[0], arg1, local132, local143);
					}
				}
			}
			@Pc(221) int local221;
			for (local89 = 0; local89 < Static36.anInt1010; local89++) {
				@Pc(174) Class4_Sub3_Sub1_Sub2_Sub2 local174 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local89]];
				if (local174 != null && local174.method852()) {
					@Pc(183) Class4_Sub3_Sub13 local183 = local174.aClass4_Sub3_Sub13_1;
					if (local183 != null && local183.anIntArray282 != null) {
						local183 = local183.method1526();
					}
					if (local183 != null && local183.aBoolean80 && local183.aBoolean78) {
						local143 = local174.anInt1440 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
						local221 = local174.anInt1407 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
						Static80.method1279(arg0, Static118.aClass4_Sub3_Sub6_Sub3Array10[1], arg1, local143, local221);
					}
				}
			}
			@Pc(244) Class4_Sub3_Sub1_Sub2_Sub1 local244;
			for (@Pc(236) int local236 = 0; local236 < Static125.anInt2830; local236++) {
				local244 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local236]];
				if (local244 != null && local244.method852()) {
					local221 = local244.anInt1407 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
					local143 = local244.anInt1440 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
					@Pc(274) boolean local274 = false;
					@Pc(279) long local279 = local244.aClass60_139.method1325();
					for (@Pc(281) int local281 = 0; local281 < Static83.anInt1972; local281++) {
						if (local279 == Static35.aLongArray4[local281] && Static61.anIntArray177[local281] != 0) {
							local274 = true;
							break;
						}
					}
					@Pc(307) boolean local307 = false;
					if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt426 != 0 && local244.anInt426 != 0 && local244.anInt426 == Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt426) {
						local307 = true;
					}
					if (local274) {
						Static80.method1279(arg0, Static118.aClass4_Sub3_Sub6_Sub3Array10[3], arg1, local143, local221);
					} else if (local307) {
						Static80.method1279(arg0, Static118.aClass4_Sub3_Sub6_Sub3Array10[4], arg1, local143, local221);
					} else {
						Static80.method1279(arg0, Static118.aClass4_Sub3_Sub6_Sub3Array10[2], arg1, local143, local221);
					}
				}
			}
			if (Static28.anInt2006 != 0 && Static118.anInt2741 % 20 < 10) {
				if (Static28.anInt2006 == 1 && Static6.anInt72 >= 0 && Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3.length > Static6.anInt72) {
					@Pc(384) Class4_Sub3_Sub1_Sub2_Sub2 local384 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static6.anInt72];
					if (local384 != null) {
						local143 = local384.anInt1440 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
						local221 = local384.anInt1407 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
						Static124.method1930(Static113.aClass4_Sub3_Sub6_Sub3Array6[1], local221, arg1, arg0, local143);
					}
				}
				if (Static28.anInt2006 == 2) {
					local132 = (-Static49.anInt1207 + Static36.anInt1012) * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
					local143 = (Static79.anInt1897 - Static60.anInt2956) * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
					Static124.method1930(Static113.aClass4_Sub3_Sub6_Sub3Array6[1], local143, arg1, arg0, local132);
				}
				if (Static28.anInt2006 == 10 && Static117.anInt2723 >= 0 && Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1.length > Static117.anInt2723) {
					local244 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static117.anInt2723];
					if (local244 != null) {
						local221 = local244.anInt1407 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
						local143 = local244.anInt1440 / 32 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
						Static124.method1930(Static113.aClass4_Sub3_Sub6_Sub3Array6[1], local221, arg1, arg0, local143);
					}
				}
			}
			if (Static106.anInt2495 != 0) {
				local143 = Static127.anInt1133 * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 / 32;
				local132 = Static106.anInt2495 * 4 + 2 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 / 32;
				Static80.method1279(arg0, Static113.aClass4_Sub3_Sub6_Sub3Array6[0], arg1, local132, local143);
			}
			Static34.method1649(arg1 + 93 + 4, arg0 + 82 - 4, 3, 3, 16777215);
		}
		if (Static29.anInt897 < 3) {
			Static28.aClass4_Sub3_Sub6_Sub3_3.method1622(arg1, arg0, 33, 33, 25, 25, Static79.anInt1896, 256, Static10.anIntArray27, Static39.anIntArray107);
		} else {
			Static34.method1653(arg1, arg0, Static10.anIntArray27, Static39.anIntArray107);
		}
		if (Static61.aBooleanArray10[arg2]) {
			Static5.aClass4_Sub3_Sub6_Sub2_2.method1558(arg1, arg0);
		}
		Static108.aBooleanArray17[arg2] = true;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public static void method1114() {
		aClass60_698 = null;
		aClass60_700 = null;
		anIntArray195 = null;
		aClass60_702 = null;
		aClass60_701 = null;
		anIntArray194 = null;
		aClass60_699 = null;
	}
}
