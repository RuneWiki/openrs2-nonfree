import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array10;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt5509 = 0;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString203 = "glow1:";

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	public static int anInt5514 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
	public static int anInt5515 = 0;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	public static int anInt5516 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method4461(@OriginalArg(0) Class155 arg0) {
		Static18.aClass155_12 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Z")
	public static boolean method4462() {
		return Static94.anInt1711 == 0 ? Static204.aClass3_Sub15_Sub4_3.method4577() : true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!vo;Lclient!ec;I)V")
	public static void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub23 arg2, @OriginalArg(3) Class40 arg3) {
		@Pc(17) int local17;
		if (arg3.anIntArray108 != null) {
			@Pc(10) boolean local10 = false;
			@Pc(15) int[] local15 = new int[arg3.anIntArray108.length];
			for (local17 = 0; local17 < local15.length / 2; local17++) {
				@Pc(38) int local38 = arg3.anIntArray108[local17 * 2] + arg2.anInt5964;
				@Pc(52) int local52 = arg2.anInt5970 - arg3.anIntArray108[local17 * 2 + 1];
				@Pc(74) int local74 = local15[local17 * 2] = (local38 - Static228.anInt1437) * (Static228.anInt1441 - Static228.anInt1443) / (Static228.anInt1442 - Static228.anInt1437) + Static228.anInt1443;
				@Pc(98) int local98 = local15[local17 * 2 + 1] = (Static228.anInt1438 - Static228.anInt1439) * (local52 - Static228.anInt1444) / (Static228.anInt1440 - Static228.anInt1444) + Static228.anInt1439;
				if (local74 > Static228.anInt1443 && Static228.anInt1441 > local74 && Static228.anInt1439 < local98 && Static228.anInt1438 > local98) {
					local10 = true;
				}
			}
			if (!local10) {
				return;
			}
			Static207.method3451(local15, arg3.anInt1152, arg3.anInt1152 >>> 24);
			for (local17 = 0; local17 < local15.length / 2 - 1; local17++) {
				Static143.method2442(local15[local17 * 2], local15[local17 * 2 + 1], local15[local17 * 2 + 2], local15[(local17 + 1) * 2 + 1], arg3.anInt1168, arg3.anInt1168 >>> 24);
			}
			Static143.method2442(local15[local15.length - 2], local15[local15.length - 1], local15[0], local15[1], arg3.anInt1168, arg3.anInt1168 >>> 24);
		} else if (arg2.aBoolean423) {
			return;
		}
		@Pc(217) Class81_Sub2 local217 = null;
		@Pc(226) Class3_Sub9 local226 = new Class3_Sub9(arg2);
		if (arg3.anInt1169 != -1) {
			if (arg2.aBoolean422 && arg3.anInt1164 != -1) {
				local217 = (Class81_Sub2) arg3.method981(true, true);
			} else {
				local217 = (Class81_Sub2) arg3.method981(true, false);
			}
			if (local217 != null) {
				if (Static135.anInt2616 > 0 && (Static300.anInt5934 != -1 && Static300.anInt5934 == arg2.anInt5971 || Static257.anInt5294 != -1 && Static257.anInt5294 == arg3.anInt1166)) {
					if (Static157.anInt2942 > 50) {
						local17 = (100 - Static157.anInt2942) * 3;
					} else {
						local17 = Static157.anInt2942 * 3;
					}
					Static143.method2450(arg2.anInt5967, arg2.anInt5969, local217.anInt2797 / 2 + 7, 16776960, local17);
					Static143.method2450(arg2.anInt5967, arg2.anInt5969, local217.anInt2797 / 2 + 5, 16776960, local17);
					Static143.method2450(arg2.anInt5967, arg2.anInt5969, local217.anInt2797 / 2 + 3, 16776960, local17);
					Static143.method2450(arg2.anInt5967, arg2.anInt5969, local217.anInt2797 / 2 + 1, 16776960, local17);
					Static143.method2450(arg2.anInt5967, arg2.anInt5969, local217.anInt2797 / 2, 16776960, local17);
				}
				local217.method2501(arg2.anInt5967 - (local217.anInt2797 >> 1), -(local217.anInt2796 >> 1) + arg2.anInt5969);
				local226.anInt1263 = arg0 + arg2.anInt5967 - (local217.anInt2797 >> 1);
				local226.anInt1266 = (local217.anInt2796 >> 1) + arg2.anInt5969 + arg1;
				local226.anInt1273 = arg2.anInt5967 + arg0 + (local217.anInt2797 >> 1);
				local226.anInt1276 = arg2.anInt5969 + arg1 - (local217.anInt2796 >> 1);
			}
		}
		if (arg3.aString48 != null) {
			if (local217 == null) {
				Static3.method43(arg1, arg2, local226, 0, arg0, true, arg3);
			} else {
				Static3.method43(arg1, arg2, local226, (local217.anInt2796 >> 1) + 5, arg0, false, arg3);
			}
		}
		if (local226.method1063(Static153.anInt2892, Static167.anInt3153) && arg3.aStringArray11 != null) {
			if (arg3.aStringArray11[4] != null) {
				Static167.method2784((short) 1005, arg3.aString49, 0, -1, arg3.aStringArray11[4], (long) arg2.anInt5971, arg3.anInt1166);
			}
			if (arg3.aStringArray11[3] != null) {
				Static167.method2784((short) 1003, arg3.aString49, 0, -1, arg3.aStringArray11[3], (long) arg2.anInt5971, arg3.anInt1166);
			}
			if (arg3.aStringArray11[2] != null) {
				Static167.method2784((short) 1002, arg3.aString49, 0, -1, arg3.aStringArray11[2], (long) arg2.anInt5971, arg3.anInt1166);
			}
			if (arg3.aStringArray11[1] != null) {
				Static167.method2784((short) 1004, arg3.aString49, 0, -1, arg3.aStringArray11[1], (long) arg2.anInt5971, arg3.anInt1166);
			}
			if (arg3.aStringArray11[0] != null) {
				Static167.method2784((short) 1008, arg3.aString49, 0, -1, arg3.aStringArray11[0], (long) arg2.anInt5971, arg3.anInt1166);
			}
		}
		Static204.aClass56_18.method1282(local226);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BB)C")
	public static char method4464(@OriginalArg(1) byte arg0) {
		@Pc(8) int local8 = arg0 & 0xFF;
		if (local8 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local8, 16) + " provided");
		}
		if (local8 >= 128 && local8 < 160) {
			@Pc(45) char local45 = Static202.aCharArray30[local8 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local8 = local45;
		}
		return (char) local8;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method4465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) Class151 local4 = Static114.method5019(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray28 != null) {
			@Pc(18) Class3_Sub24 local18 = new Class3_Sub24();
			local18.anObjectArray1 = local4.anObjectArray28;
			local18.aClass151_13 = local4;
			local18.aString150 = arg3;
			local18.anInt4254 = arg2;
			Static161.method2653(local18);
		}
		@Pc(43) boolean local43 = true;
		if (local4.anInt4797 > 0) {
			local43 = Static273.method4497(local4);
		}
		if (!local43 || !Static42.method612(local4).method4794(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static215.aClass3_Sub26_Sub1_2.method3958(173);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 2) {
			Static215.aClass3_Sub26_Sub1_2.method3958(157);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 3) {
			Static215.aClass3_Sub26_Sub1_2.method3958(118);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 4) {
			Static215.aClass3_Sub26_Sub1_2.method3958(55);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 5) {
			Static215.aClass3_Sub26_Sub1_2.method3958(226);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 6) {
			Static215.aClass3_Sub26_Sub1_2.method3958(191);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 7) {
			Static215.aClass3_Sub26_Sub1_2.method3958(212);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 8) {
			Static215.aClass3_Sub26_Sub1_2.method3958(164);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 9) {
			Static215.aClass3_Sub26_Sub1_2.method3958(67);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
		if (arg2 == 10) {
			Static215.aClass3_Sub26_Sub1_2.method3958(170);
			Static215.aClass3_Sub26_Sub1_2.method3944(arg1);
			Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIC)I")
	public static int method4467(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(3) int local3 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local3 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local3 = 1762;
		}
		return local3;
	}
}
