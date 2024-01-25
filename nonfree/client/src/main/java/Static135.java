import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public static int anInt2706;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Lclient!bn;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "Lclient!aj;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "Lclient!ul;")
	public static Class246 aClass246_85;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_30 = new Class179(28, -1);

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_31 = new Class179(61, 2);

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
	public static int anInt2707 = 1;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
	public static int anInt2708 = -1;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!jh;I)V")
	public static void method2322(@OriginalArg(0) Class4_Sub4 arg0) {
		arg0.aClass31_Sub2_Sub1_1 = null;
		if (Static200.anInt3843 < 20) {
			Static29.aClass141_6.method3356(arg0);
			Static200.anInt3843++;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method2323(@OriginalArg(0) Class39 arg0) {
		@Pc(7) int local7 = Static280.anInt4913;
		@Pc(9) int local9 = Static315.anInt5432;
		@Pc(11) int local11 = Static270.anInt4802;
		@Pc(15) int local15 = Static389.anInt6274 - 3;
		if (Static211.aClass143_23 == null || Static3.aClass143_1 == null) {
			if (Static345.aClass246_187.method5497(Static334.anInt5701) && Static345.aClass246_187.method5497(Static274.anInt4853)) {
				Static211.aClass143_23 = arg0.method4549(Static461.method1450(Static345.aClass246_187, Static334.anInt5701, 0));
				@Pc(44) Class51 local44 = Static461.method1450(Static345.aClass246_187, Static274.anInt4853, 0);
				Static3.aClass143_1 = arg0.method4549(local44);
				local44.method1455();
				Static338.aClass143_29 = arg0.method4549(local44);
			} else {
				arg0.O(local7, local9, local11, 20, Static112.anInt2332 | 255 - Static407.anInt6566 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static211.aClass143_23 != null && Static3.aClass143_1 != null) {
			local88 = (local11 - Static3.aClass143_1.la() * 2) / Static211.aClass143_23.la();
			for (local90 = 0; local90 < local88; local90++) {
				Static211.aClass143_23.method5723(Static3.aClass143_1.la() + local7 + local90 * Static211.aClass143_23.la(), local9);
			}
			Static3.aClass143_1.method5723(local7, local9);
			Static338.aClass143_29.method5723(local7 + local11 - Static338.aClass143_29.la(), local9);
		}
		Static178.aClass71_5.method5454(local7 + 3, -1, Static68.anInt1560 | -16777216, local9 + 14, Static39.aClass7_17.method331(Static341.anInt5770));
		arg0.O(local7, local9 + 20, local11, local15 - 20, Static112.anInt2332 | -Static407.anInt6566 + 255 << 24, 1);
		local88 = Static125.aClass114_1.method2701();
		local90 = Static125.aClass114_1.method2698();
		@Pc(170) int local170 = 0;
		@Pc(193) int local193;
		for (@Pc(175) Class1_Sub3 local175 = (Class1_Sub3) Static55.aClass181_63.method4112(); local175 != null; local175 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			local193 = local9 + (-local170 + -1 + Static217.anInt4004) * 16 + 20 + 13;
			local170++;
			if (local7 < local88 && local88 < local11 + local7 && local193 - 13 < local90 && local193 + 4 > local90 && local175.aBoolean5) {
				arg0.O(local7, local193 - 12, local11, 16, Static383.anInt6217 | 255 - Static162.anInt3026 << 24, 1);
			}
		}
		if ((Static176.aClass143_18 == null || Static64.aClass143_11 == null || Static167.aClass143_17 == null) && Static345.aClass246_187.method5497(Static167.anInt3079) && Static345.aClass246_187.method5497(Static120.anInt2435) && Static345.aClass246_187.method5497(Static439.anInt7060)) {
			@Pc(273) Class51 local273 = Static461.method1450(Static345.aClass246_187, Static120.anInt2435, 0);
			Static64.aClass143_11 = arg0.method4549(local273);
			local273.method1455();
			Static247.aClass143_33 = arg0.method4549(local273);
			Static176.aClass143_18 = arg0.method4549(Static461.method1450(Static345.aClass246_187, Static167.anInt3079, 0));
			@Pc(298) Class51 local298 = Static461.method1450(Static345.aClass246_187, Static439.anInt7060, 0);
			Static167.aClass143_17 = arg0.method4549(local298);
			local298.method1455();
			Static75.aClass143_14 = arg0.method4549(local298);
		}
		@Pc(365) int local365;
		@Pc(329) int local329;
		if (Static176.aClass143_18 != null && Static64.aClass143_11 != null && Static167.aClass143_17 != null) {
			local193 = (local11 - Static167.aClass143_17.la() * 2) / Static176.aClass143_18.la();
			for (local329 = 0; local329 < local193; local329++) {
				Static176.aClass143_18.method5723(local7 + Static167.aClass143_17.la() + local329 * Static176.aClass143_18.la(), local9 + (local15 - Static176.aClass143_18.ma()));
			}
			local365 = (local15 - Static167.aClass143_17.ma() - 20) / Static64.aClass143_11.ma();
			for (@Pc(367) int local367 = 0; local367 < local365; local367++) {
				Static64.aClass143_11.method5723(local7, local367 * Static64.aClass143_11.ma() + local9 + 20);
				Static247.aClass143_33.method5723(local7 + local11 - Static247.aClass143_33.la(), Static64.aClass143_11.ma() * local367 + 20 + local9);
			}
			Static167.aClass143_17.method5723(local7, local15 + local9 - Static167.aClass143_17.ma());
			Static75.aClass143_14.method5723(local7 + local11 - Static167.aClass143_17.la(), -Static167.aClass143_17.ma() + local15 + local9);
		}
		local170 = 0;
		for (@Pc(434) Class1_Sub3 local434 = (Class1_Sub3) Static55.aClass181_63.method4112(); local434 != null; local434 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			local329 = local9 + (-local170 + -1 + Static217.anInt4004) * 16 + 13 + 20;
			local365 = Static68.anInt1560 | 0xFF000000;
			if (local88 > local7 && local11 + local7 > local88 && local90 > local329 - 13 && local90 < local329 + 4 && local434.aBoolean5) {
				local365 = Static249.anInt4547 | 0xFF000000;
			}
			@Pc(491) int[] local491 = null;
			if (Static423.method5615(local434.anInt117)) {
				local491 = Static165.aClass19_1.method560((int) local434.aLong10).anIntArray340;
			} else if (local434.anInt120 != -1) {
				local491 = Static165.aClass19_1.method560(local434.anInt120).anIntArray340;
			} else if (Static112.method2066(local434.anInt117)) {
				@Pc(567) Class31_Sub2_Sub1_Sub2 local567 = Static98.aClass31_Sub2_Sub1_Sub2Array1[(int) local434.aLong10];
				if (local567 != null) {
					@Pc(572) Class53 local572 = local567.aClass53_1;
					if (local572.anIntArray131 != null) {
						local572 = local572.method1508(Static394.aClass23_1);
					}
					if (local572 != null) {
						local491 = local572.anIntArray132;
					}
				}
			} else if (Static262.method3883(local434.anInt117)) {
				@Pc(535) Class129 local535;
				if (local434.anInt117 == 1004) {
					local535 = Static349.aClass115_4.method2766((int) local434.aLong10);
				} else {
					local535 = Static349.aClass115_4.method2766((int) (local434.aLong10 >>> 32 & 0x7FFFFFFFL));
				}
				if (local535.anIntArray310 != null) {
					local535 = local535.method3031(Static394.aClass23_1);
				}
				if (local535 != null) {
					local491 = local535.anIntArray308;
				}
			}
			@Pc(600) String local600 = Static74.method1493(local434);
			if (local491 != null) {
				local600 = local600 + Static254.method3806(local491);
			}
			Static178.aClass71_5.method5453(Static212.aClass143Array6, Static134.anIntArray208, local7 + 3, local365, local600, local329);
			local170++;
			if (local434.aBoolean6) {
				Static57.aClass143_9.method5723(local7 + Static3.aClass151_6.method3475(local600) + 5, local329 + -12);
			}
		}
		Static433.method5752(Static315.anInt5432, Static389.anInt6274, Static270.anInt4802, Static280.anInt4913);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2324(@OriginalArg(1) String arg0) {
		Static378.method3527(arg0, 0, "", "", 0);
	}
}
