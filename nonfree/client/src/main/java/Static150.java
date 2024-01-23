import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public static int anInt3182;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!jd;")
	public static Class84 aClass84_60;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	public static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt3180 = -1;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString153 = null;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[Lclient!l;")
	public static Class2_Sub3_Sub13[] aClass2_Sub3_Sub13Array4 = new Class2_Sub3_Sub13[14];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method2606(@OriginalArg(1) int arg0) {
		Static157.anInt3299 = -1;
		Static34.anInt1968 = -1;
		Static219.anInt4587 = arg0;
		Static133.method2322();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZB)V")
	public static void method2607(@OriginalArg(0) boolean arg0) {
		Static202.anIntArrayArrayArray10 = null;
		Static294.aByteArrayArrayArray16 = null;
		Static119.aByteArrayArrayArray8 = null;
		Static59.aByteArrayArrayArray4 = null;
		Static278.anIntArrayArrayArray15 = null;
		Static57.anIntArrayArrayArray2 = null;
		Static20.anInt1234 = 0;
		if (arg0 && Static197.aClass2_Sub3_Sub18_2 != null) {
			Static58.anInt1304 = Static197.aClass2_Sub3_Sub18_2.anInt3689;
		} else {
			Static58.anInt1304 = -1;
		}
		Static19.aByteArrayArrayArray1 = null;
		Static36.anIntArray56 = null;
		Static197.aClass2_Sub3_Sub18_2 = null;
		Static279.aByteArrayArrayArray15 = null;
		Static269.aClass115_16 = null;
		Static2.aClass1_34.method10();
		Static187.aClass61_6 = null;
		Static34.anInt1968 = -1;
		Static1.aClass61_1 = null;
		Static14.aClass2_Sub3_Sub1_Sub1_1 = null;
		Static101.aClass61_12 = null;
		Static7.aClass61_2 = null;
		Static157.anInt3299 = -1;
		Static37.aClass113_1 = null;
		Static136.aClass2_Sub3_Sub1_5 = null;
		Static234.aClass61_8 = null;
		Static56.aClass61_3 = null;
		Static214.aClass61_7 = null;
		Static152.aClass61_5 = null;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
	public static void method2608() {
		Static188.method3186();
		Static236.method3907();
		Static260.method4340();
		Static212.method3612();
		Static242.method3951();
		Static102.method1925();
		Static122.method2224();
		Static280.method4661();
		Static39.method744();
		Static120.method2206();
		Static116.method2124();
		Static189.method3190();
		Static288.method4797();
		Static214.method3628();
		Static234.method3898();
		Static236.method3910();
		Static205.method3454();
		Static212.method3609();
		if (Static113.anInt2429 != 0) {
			for (@Pc(49) int local49 = 0; local49 < Static91.aByteArrayArray46.length; local49++) {
				Static91.aByteArrayArray46[local49] = null;
			}
			Static36.anInt876 = 0;
		}
		Static55.method1084();
		Static283.method4713();
		Static97.aClass46_12.method1077();
		if (!Static60.aBoolean106) {
			((Class127_Sub1) Static93.anInterface5_1).method3528();
		}
		Static296.aClass53_13.method1261();
		Static294.aClass84_132.method2125();
		aClass84_60.method2125();
		Static88.aClass84_103.method2125();
		Static115.aClass84_50.method2125();
		Static11.aClass84_8.method2125();
		Static152.aClass84_61.method2125();
		Static233.aClass84_105.method2125();
		Static201.aClass84_85.method2125();
		Static42.aClass84_20.method2125();
		Static233.aClass84_106.method2125();
		Static171.aClass84_68.method2125();
		Static75.aClass46_11.method1077();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2609(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(arg0);
		@Pc(18) int local18 = local8.method4261();
		@Pc(22) int local22 = local8.method4228();
		if (local22 < 0 || Static293.anInt6091 != 0 && Static293.anInt6091 < local22) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(92) byte[] local92 = new byte[local22];
			local8.method4226(local92, local22);
			return local92;
		} else {
			@Pc(50) int local50 = local8.method4228();
			if (local50 < 0 || Static293.anInt6091 != 0 && local50 > Static293.anInt6091) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local50];
			if (local18 == 1) {
				Static138.method2435(local68, local50, arg0, local22);
			} else {
				Static254.aClass41_1.method974(local68, local8);
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIIIZILclient!og;Z)Lclient!rj;")
	public static Class2_Sub3_Sub1 method2610(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) Class155 local9 = Static152.method2616(arg0);
		if (arg2 > 1 && local9.anIntArray438 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local9.anIntArray437[local19] <= arg2 && local9.anIntArray437[local19] != 0) {
					local17 = local9.anIntArray438[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static152.method2616(local17);
			}
		}
		@Pc(61) Class36_Sub2_Sub2 local61 = local9.method3932(arg6);
		if (local61 == null) {
			return null;
		}
		@Pc(69) Class2_Sub3_Sub1_Sub1 local69 = null;
		if (local9.anInt4812 != -1) {
			local69 = (Class2_Sub3_Sub1_Sub1) method2610(local9.anInt4819, false, 10, 1, true, 0, arg6, true);
			if (local69 == null) {
				return null;
			}
		} else if (local9.anInt4862 != -1) {
			local69 = (Class2_Sub3_Sub1_Sub1) method2610(local9.anInt4810, false, arg2, arg3, true, arg5, arg6, false);
			if (local69 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static160.anIntArray254;
		@Pc(122) int local122 = Static160.anInt3388;
		@Pc(124) int local124 = Static160.anInt3390;
		@Pc(127) int[] local127 = new int[4];
		Static160.method2775(local127);
		@Pc(135) Class2_Sub3_Sub1_Sub1 local135 = new Class2_Sub3_Sub1_Sub1(36, 32);
		Static160.method2787(local135.anIntArray479, 36, 32);
		Static93.method1725();
		Static93.method1734(16, 16);
		@Pc(147) int local147 = local9.anInt4813;
		Static93.aBoolean160 = false;
		if (arg7) {
			local147 = (int) ((double) local147 * 1.5D);
		} else if (arg3 == 2) {
			local147 = (int) ((double) local147 * 1.04D);
		}
		@Pc(179) int local179 = Class66.anIntArray153[local9.anInt4851] * local147 >> 16;
		@Pc(188) int local188 = Class66.anIntArray148[local9.anInt4851] * local147 >> 16;
		local61.method3846(local9.anInt4811, local9.anInt4859, local9.anInt4851, local9.anInt4815, local188 + local9.anInt4853 - local61.method4881() / 2, local9.anInt4853 + local179, -1L);
		if (arg3 >= 1) {
			local135.method4373(1);
			if (arg3 >= 2) {
				local135.method4373(16777215);
			}
			Static160.method2787(local135.anIntArray479, 36, 32);
		}
		if (arg5 != 0) {
			local135.method4383(arg5);
		}
		if (local9.anInt4812 != -1) {
			local69.method4367(0, 0);
		} else if (local9.anInt4862 != -1) {
			Static160.method2787(local69.anIntArray479, 36, 32);
			local135.method4367(0, 0);
			local135 = local69;
		}
		if (arg1 && (local9.anInt4820 == 1 || arg2 != 1) && arg2 != -1) {
			Static29.aClass2_Sub3_Sub5_Sub1_1.method3317(Static109.method2016(arg2), 0, 9, 16776960, 1);
		}
		Static160.method2787(local120, local124, local122);
		Static160.method2790(local127);
		Static93.method1725();
		Static93.aBoolean160 = true;
		return Static60.aBoolean106 && !arg4 ? new Class2_Sub3_Sub1_Sub2(local135) : local135;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method2611() {
		Static298.method4263(Static23.aClass115_3);
		Static187.anInt3939++;
		if (Static29.aBoolean56 && Static197.aBoolean343) {
			@Pc(27) int local27 = Static86.anInt1911;
			@Pc(29) int local29 = Static238.anInt4852;
			local27 -= Static250.anInt4975;
			local29 -= Static90.anInt2002;
			if (Static297.anInt6214 > local27) {
				local27 = Static297.anInt6214;
			}
			if (Static191.anInt706 > local29) {
				local29 = Static191.anInt706;
			}
			@Pc(58) int local58 = Static23.aClass115_3.anInt3518;
			if (local27 + Static23.aClass115_3.anInt3555 > Static11.aClass115_1.anInt3555 + Static297.anInt6214) {
				local27 = Static11.aClass115_1.anInt3555 + Static297.anInt6214 - Static23.aClass115_3.anInt3555;
			}
			@Pc(87) int local87 = local27 - Static47.anInt1115;
			if (Static23.aClass115_3.anInt3487 + local29 > Static11.aClass115_1.anInt3487 + Static191.anInt706) {
				local29 = Static191.anInt706 + Static11.aClass115_1.anInt3487 - Static23.aClass115_3.anInt3487;
			}
			@Pc(115) int local115 = local29 - Static145.anInt3123;
			@Pc(124) int local124 = local29 + Static11.aClass115_1.anInt3514 - Static191.anInt706;
			if (Static187.anInt3939 > Static23.aClass115_3.anInt3553 && (local87 > local58 || local87 < -local58 || local58 < local115 || local115 < -local58)) {
				Static242.aBoolean412 = true;
			}
			@Pc(162) int local162 = local27 + Static11.aClass115_1.anInt3529 - Static297.anInt6214;
			@Pc(173) Class2_Sub6 local173;
			if (Static23.aClass115_3.anObjectArray7 != null && Static242.aBoolean412) {
				local173 = new Class2_Sub6();
				local173.anObjectArray1 = Static23.aClass115_3.anObjectArray7;
				local173.aClass115_4 = Static23.aClass115_3;
				local173.anInt534 = local124;
				local173.anInt533 = local162;
				Static73.method1363(local173);
			}
			if (Static279.anInt5824 == 0) {
				if (Static242.aBoolean412) {
					if (Static23.aClass115_3.anObjectArray24 != null) {
						local173 = new Class2_Sub6();
						local173.anInt533 = local162;
						local173.aClass115_4 = Static23.aClass115_3;
						local173.aClass115_2 = Static189.aClass115_12;
						local173.anObjectArray1 = Static23.aClass115_3.anObjectArray24;
						local173.anInt534 = local124;
						Static73.method1363(local173);
					}
					if (Static189.aClass115_12 != null && Static35.method707(Static23.aClass115_3) != null) {
						Static95.aClass2_Sub26_Sub1_1.method4287(151);
						Static95.aClass2_Sub26_Sub1_1.method4231(Static189.aClass115_12.anInt3499);
						Static95.aClass2_Sub26_Sub1_1.method4260(Static23.aClass115_3.anInt3552);
						Static95.aClass2_Sub26_Sub1_1.method4272(Static23.aClass115_3.anInt3499);
						Static95.aClass2_Sub26_Sub1_1.method4262(Static189.aClass115_12.anInt3552);
					}
				} else if ((Static109.anInt2341 == 1 || Static146.method2585(Static216.anInt4481 - 1)) && Static216.anInt4481 > 2) {
					Static119.method2205();
				} else if (Static216.anInt4481 > 0) {
					Static34.method1664();
				}
				Static23.aClass115_3 = null;
			}
		} else if (Static187.anInt3939 > 1) {
			Static23.aClass115_3 = null;
		}
	}
}
