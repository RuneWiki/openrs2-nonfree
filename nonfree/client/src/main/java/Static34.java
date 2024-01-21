import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_4;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "Lclient!r;")
	public static Class2_Sub9_Sub4 aClass2_Sub9_Sub4_1;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_283 = Static181.method2795("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Lclient!qe;")
	public static Class83 aClass83_284 = aClass83_283;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIZZIIIZ)Lclient!nb;")
	public static Class2_Sub2_Sub17 method716(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) Class2_Sub2_Sub3 local9 = Static113.method1987(arg3);
		if (arg4 > 1 && local9.anIntArray28 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg4 >= local9.anIntArray26[local21] && local9.anIntArray26[local21] != 0) {
					local19 = local9.anIntArray28[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static113.method1987(local19);
			}
		}
		@Pc(59) Class24_Sub3_Sub1 local59 = local9.method342();
		if (local59 == null) {
			return null;
		}
		@Pc(65) Class2_Sub2_Sub17 local65 = null;
		if (local9.anInt466 != -1) {
			local65 = method716(false, 0, true, local9.anInt423, 10, 1);
			if (local65 == null) {
				return null;
			}
		} else if (local9.anInt450 != -1) {
			local65 = method716(false, arg1, false, local9.anInt462, arg4, arg5);
			if (local65 == null) {
				return null;
			}
		}
		@Pc(107) int[] local107 = Static126.anIntArray279;
		@Pc(109) int local109 = Static126.anInt2775;
		@Pc(111) int local111 = Static126.anInt2773;
		@Pc(114) int[] local114 = new int[4];
		Static126.method2126(local114);
		@Pc(122) Class2_Sub2_Sub17_Sub1 local122 = new Class2_Sub2_Sub17_Sub1(36, 32);
		Static126.method2131(local122.anIntArray252, 36, 32);
		Static126.method2130();
		Static24.method464();
		Static24.method475(16, 16);
		Static24.aBoolean35 = false;
		if (local9.anInt450 != -1) {
			local65.method1905(0, 0);
		}
		@Pc(146) int local146 = local9.anInt421;
		if (arg2) {
			local146 = (int) ((double) local146 * 1.5D);
		} else if (arg5 == 2) {
			local146 = (int) ((double) local146 * 1.04D);
		}
		@Pc(176) int local176 = Class16.anIntArray44[local9.anInt445] * local146 >> 16;
		@Pc(185) int local185 = local146 * Class16.anIntArray39[local9.anInt445] >> 16;
		local59.method2734(local9.anInt460, local9.anInt434, local9.anInt445, local9.anInt431, local176 + local9.anInt433 - local59.method2978() / 2, local185 + local9.anInt433);
		if (local9.anInt450 == -1) {
			if (arg5 >= 1) {
				local122.method1921(1);
			}
			if (arg5 >= 2) {
				local122.method1921(16777215);
			}
			if (arg1 != 0) {
				local122.method1923(arg1);
			}
		}
		Static126.method2131(local122.anIntArray252, 36, 32);
		if (local9.anInt466 != -1) {
			local65.method1905(0, 0);
		}
		if (arg0 && (local9.anInt465 == 1 || arg4 != 1) && arg4 != -1) {
			Static56.aClass2_Sub2_Sub5_Sub1_Sub1_1.method1100(Static183.method625(arg4), 0, 9, 16776960, 1);
		}
		Static126.method2131(local107, local109, local111);
		Static126.method2128(local114);
		Static24.method464();
		Static24.aBoolean35 = true;
		return local122;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public static void method718() {
		if (Static124.aClass5_14 != null || Static73.aClass5_9 != null) {
			return;
		}
		@Pc(13) int local13 = Static61.anInt1502;
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (Static159.aBoolean152) {
			@Pc(196) int local196;
			if (local13 != 1) {
				local93 = Static121.anInt2740;
				local196 = Static4.anInt95;
				if (local196 < Static177.anInt3624 - 10 || local196 > Static162.anInt3931 + Static177.anInt3624 + 10 || local93 < Static43.anInt1134 - 10 || Static43.anInt1134 + Static160.anInt3230 + 10 < local93) {
					Static159.aBoolean152 = false;
					Static124.method1906(Static162.anInt3931, Static160.anInt3230, Static43.anInt1134, Static177.anInt3624);
				}
			}
			if (local13 != 1) {
				return;
			}
			local196 = Static177.anInt3624;
			local99 = Static162.anInt3931;
			local93 = Static43.anInt1134;
			@Pc(256) int local256 = Static153.anInt3298;
			@Pc(258) int local258 = -1;
			@Pc(260) int local260 = Static59.anInt1446;
			for (@Pc(262) int local262 = 0; local262 < Static98.anInt2124; local262++) {
				@Pc(277) int local277 = (Static98.anInt2124 - local262 - 1) * 15 + local93 + 31;
				if (local260 > local196 && local260 < local99 + local196 && local256 > local277 - 13 && local277 + 3 > local256) {
					local258 = local262;
				}
			}
			if (local258 != -1) {
				Static8.method124(local258);
			}
			Static159.aBoolean152 = false;
			Static124.method1906(Static162.anInt3931, Static160.anInt3230, Static43.anInt1134, Static177.anInt3624);
			return;
		}
		if (local13 == 1 && Static98.anInt2124 > 0) {
			@Pc(35) short local35 = Static22.aShortArray9[Static98.anInt2124 - 1];
			if (local35 == 16 || local35 == 51 || local35 == 41 || local35 == 22 || local35 == 29 || local35 == 46 || local35 == 25 || local35 == 34 || local35 == 35 || local35 == 43 || local35 == 19 || local35 == 1002) {
				local93 = Static2.anIntArray1[Static98.anInt2124 - 1];
				local99 = Static94.anIntArray201[Static98.anInt2124 - 1];
				@Pc(103) Class5 local103 = Static74.method1401(local99);
				if (Static138.method2248(Static138.method2242(local103)) || Static170.method2644(Static138.method2242(local103))) {
					Static172.anInt3540 = 0;
					Static69.aBoolean86 = false;
					if (Static124.aClass5_14 != null) {
						Static121.method2085(Static124.aClass5_14);
					}
					Static124.aClass5_14 = Static74.method1401(local99);
					Static191.anInt3781 = Static153.anInt3298;
					Static146.anInt3027 = Static59.anInt1446;
					Static142.anInt2990 = local93;
					Static121.method2085(Static124.aClass5_14);
					return;
				}
			}
		}
		if (local13 == 1 && (Static180.anInt3674 == 1 && Static98.anInt2124 > 2 || Static177.method2716(Static98.anInt2124 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static98.anInt2124 > 0) {
			Static8.method124(Static98.anInt2124 - 1);
		}
		if (local13 == 2 && Static98.anInt2124 > 0) {
			Static167.method2589();
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	public static void method719(@OriginalArg(0) int arg0) {
		Static113.method1993();
		Static157.method2414();
		@Pc(22) int local22 = Static216.method3272(arg0).anInt87;
		if (local22 == 0) {
			return;
		}
		@Pc(29) int local29 = Static14.anIntArray235[arg0];
		if (local22 == 1) {
			Static16.anInt2431 = local29;
			if (Static16.anInt2431 == 1) {
				Static24.method459(0.9F);
			}
			if (Static16.anInt2431 == 2) {
				Static24.method459(0.8F);
			}
			if (Static16.anInt2431 == 3) {
				Static24.method459(0.7F);
			}
			if (Static16.anInt2431 == 4) {
				Static24.method459(0.6F);
			}
			Static157.method2394();
		}
		if (local22 == 3) {
			@Pc(67) short local67 = 0;
			if (local29 == 0) {
				local67 = 255;
			}
			if (local29 == 1) {
				local67 = 192;
			}
			if (local29 == 2) {
				local67 = 128;
			}
			if (local29 == 3) {
				local67 = 64;
			}
			if (local29 == 4) {
				local67 = 0;
			}
			if (local67 != Static112.anInt1949) {
				if (Static112.anInt1949 == 0 && Static118.anInt2711 != -1) {
					Static3.method62(Static118.anInt2711, Static157.aClass28_Sub1_23, local67);
					Static125.aBoolean136 = false;
				} else if (local67 == 0) {
					Static59.method1139();
					Static125.aBoolean136 = false;
				} else {
					Static42.method812(local67);
				}
				Static112.anInt1949 = local67;
			}
		}
		if (local22 == 9) {
			Static135.anInt2896 = local29;
		}
		if (local22 == 5) {
			Static180.anInt3674 = local29;
		}
		if (local22 == 10) {
			if (local29 == 0) {
				Static89.anInt4291 = 127;
			}
			if (local29 == 1) {
				Static89.anInt4291 = 96;
			}
			if (local29 == 2) {
				Static89.anInt4291 = 64;
			}
			if (local29 == 3) {
				Static89.anInt4291 = 32;
			}
			if (local29 == 4) {
				Static89.anInt4291 = 0;
			}
		}
		if (local22 == 6) {
			Static97.anInt2088 = local29;
		}
		if (local22 != 4) {
			return;
		}
		if (local29 == 0) {
			Static132.anInt2855 = 127;
		}
		if (local29 == 1) {
			Static132.anInt2855 = 96;
		}
		if (local29 == 2) {
			Static132.anInt2855 = 64;
		}
		if (local29 == 3) {
			Static132.anInt2855 = 32;
		}
		if (local29 == 4) {
			Static132.anInt2855 = 0;
			return;
		}
	}
}
