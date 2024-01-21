import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!kc;")
	private static Class36 aClass36_308 = Static14.method2017("glow2:");

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_309 = aClass36_308;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!kc;")
	private static Class36 aClass36_316 = Static14.method2017("Prepared sound engine");

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_310 = aClass36_316;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_311 = Static14.method2017("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!kc;")
	private static Class36 aClass36_313 = Static14.method2017(" has logged out)3");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_312 = aClass36_313;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!kc;")
	public static Class36 aClass36_314 = Static14.method2017("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "[I")
	public static int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!e", name = "E", descriptor = "I")
	public static int anInt579 = -1;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static void method483() {
		aClass36_310 = null;
		aClass36_312 = null;
		aClass36_311 = null;
		aClass36_309 = null;
		aClass36_314 = null;
		aClass36_308 = null;
		aClass36_313 = null;
		aByteArrayArrayArray4 = null;
		aClass36_316 = null;
		anIntArray38 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;IB)Lclient!ba;")
	public static Class2_Sub1_Sub2 method484(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int[] local9 = arg1.method943(arg2);
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			@Pc(26) byte[] local26 = arg1.method931(arg2, local9[local17]);
			if (local26 == null) {
				local15 = false;
			} else {
				@Pc(45) int local45 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg0.method931(local45, 0);
				if (local60 == null) {
					local15 = false;
				}
			}
		}
		if (!local15) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub2(arg1, arg0, arg2, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public static void method485() {
		Static92.method1685();
		if (Static7.anInt193 == 1) {
			Static14.aClass2_Sub1_Sub1_Sub3Array38[Static92.anInt2411 / 100].method1234(Static40.anInt2190 - 12, Static15.anInt313 + -8 - 4);
		}
		if (Static7.anInt193 == 2) {
			Static14.aClass2_Sub1_Sub1_Sub3Array38[Static92.anInt2411 / 100 + 4].method1234(Static40.anInt2190 - 8 - 4, Static15.anInt313 + -8 + -4);
		}
		if (Static32.anInt900 != -1) {
			Static65.method1151(Static32.anInt900);
			Static81.method1494(334, 512, 4, Static32.anInt900);
		}
		if (Static78.anInt2037 != -1) {
			Static65.method1151(Static78.anInt2037);
			Static81.method1494(334, 512, 0, Static78.anInt2037);
		}
		Static15.method270();
		if (!Static73.aBoolean82) {
			Static69.method1199();
			Static56.method1048();
		} else if (Static24.anInt620 == 0) {
			Static95.method1789();
		}
		if (Static15.anInt314 == 1) {
			Static1.aClass2_Sub1_Sub1_Sub3_1.method1234(472, 296);
		}
		@Pc(129) int local129;
		if (Static55.aBoolean125) {
			@Pc(107) byte local107 = 20;
			Static11.aClass2_Sub1_Sub1_Sub2_1.method469(Static49.method949(new Class36[] { Static49.aClass36_657, Static57.method1055(Static3.anInt1297) }), 20, 16776960);
			local129 = local107 + 15;
			@Pc(131) int local131 = 16776960;
			@Pc(133) Runtime local133 = Runtime.getRuntime();
			@Pc(143) int local143 = (int) ((local133.totalMemory() - local133.freeMemory()) / 1024L);
			if (local143 > 32768 && Static35.aBoolean51) {
				local131 = 16711680;
			}
			if (local143 > 65536 && !Static35.aBoolean51) {
				local131 = 16711680;
			}
			Static11.aClass2_Sub1_Sub1_Sub2_1.method469(Static49.method949(new Class36[] { Static14.aClass36_1420, Static57.method1055(local143), Static112.aClass36_1441 }), 35, local131);
			local129 += 15;
			if (Static110.aBoolean133) {
				Static11.aClass2_Sub1_Sub1_Sub2_1.method469(Static8.aClass36_115, 50, 16711680);
				Static110.aBoolean133 = false;
				local129 += 15;
			}
			if (Static105.aBoolean126) {
				Static11.aClass2_Sub1_Sub1_Sub2_1.method469(Static89.aClass36_1081, local129, 16711680);
				local129 += 15;
				Static105.aBoolean126 = false;
			}
			if (Static91.aBoolean105) {
				Static11.aClass2_Sub1_Sub1_Sub2_1.method469(Static23.aClass36_322, local129, 16711680);
				local129 += 15;
				Static91.aBoolean105 = false;
			}
		}
		if (Static10.anInt243 == 0) {
			return;
		}
		@Pc(227) int local227 = Static10.anInt243 / 50;
		local129 = local227 / 60;
		@Pc(235) int local235 = local227 % 60;
		if (local235 < 10) {
			Static11.aClass2_Sub1_Sub1_Sub2_1.method456(Static49.method949(new Class36[] { Static32.aClass36_475, Static57.method1055(local129), Static17.aClass36_224, Static57.method1055(local235) }), 4, 329, 16776960);
		} else {
			Static11.aClass2_Sub1_Sub1_Sub2_1.method456(Static49.method949(new Class36[] { Static32.aClass36_475, Static57.method1055(local129), Static63.aClass36_785, Static57.method1055(local235) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIBII)V")
	public static void method486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static33.method328(arg2)) {
			Static19.method2032(arg1, arg4, 0, 0, arg3, Static42.aClass2_Sub1_Sub6ArrayArray1[arg2], -1, arg5, arg0);
		}
	}
}
