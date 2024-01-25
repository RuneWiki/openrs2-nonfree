import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!an", name = "A", descriptor = "I")
	public static int anInt507 = 0;

	@OriginalMember(owner = "client!an", name = "F", descriptor = "I")
	public static int anInt512 = 0;

	@OriginalMember(owner = "client!an", name = "H", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_2 = new Class342(15, 0, 1, 0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)Lclient!jg;")
	public static Class6_Sub2_Sub10 method403(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub2_Sub10 local9 = new Class6_Sub2_Sub10();
		@Pc(14) Class6_Sub21 local14 = new Class6_Sub21(arg0);
		local14.anInt7338 = local14.aByteArray93.length - 2;
		@Pc(30) int local30 = local14.method6003();
		@Pc(41) int local41 = local14.aByteArray93.length - local30 - 12 - 2;
		local14.anInt7338 = local41;
		@Pc(48) int local48 = local14.method6036();
		local9.anInt4704 = local14.method6003();
		local9.anInt4703 = local14.method6003();
		local9.anInt4701 = local14.method6003();
		local9.anInt4702 = local14.method6003();
		@Pc(72) int local72 = local14.method6069();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass128Array1 = new Class128[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method6003();
				@Pc(96) Class128 local96 = new Class128(Static253.method4296(local89));
				local9.aClass128Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method6036();
					@Pc(111) int local111 = local14.method6036();
					local96.method3267(new Class6_Sub35(local111), (long) local107);
				}
			}
		}
		local14.anInt7338 = 0;
		local9.aString34 = local14.method6049();
		local9.aStringArray12 = new String[local48];
		local9.anIntArray284 = new int[local48];
		local9.anIntArray283 = new int[local48];
		local83 = 0;
		while (local14.anInt7338 < local41) {
			local89 = local14.method6003();
			if (local89 == 3) {
				local9.aStringArray12[local83] = local14.method6044().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray284[local83] = local14.method6069();
			} else {
				local9.anIntArray284[local83] = local14.method6036();
			}
			local9.anIntArray283[local83++] = local89;
		}
		return local9;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static133.aClass59Array3 == null) {
			return;
		}
		@Pc(8) Class4_Sub1_Sub1 local8 = null;
		@Pc(15) int local15;
		if (arg0 < 0) {
			local15 = -arg0 - 1;
			if (Static272.anInt5214 == local15) {
				local8 = Static328.aClass4_Sub1_Sub1_Sub2_2;
			} else {
				local8 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local15];
			}
		} else {
			local15 = arg0 - 1;
			@Pc(41) Class6_Sub34 local41 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local15);
			if (local41 != null) {
				local8 = local41.aClass4_Sub1_Sub1_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(54) Class252 local54 = Static412.aClass307_4.method6636(arg4);
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg6 == 1 || arg6 == 3) {
			local68 = local54.anInt6935;
			local65 = local54.anInt6898;
		} else {
			local65 = local54.anInt6935;
			local68 = local54.anInt6898;
		}
		@Pc(82) int local82 = (local65 >> 1) + arg5;
		@Pc(91) int local91 = arg5 + (local65 + 1 >> 1);
		@Pc(98) int local98 = arg3 + (local68 >> 1);
		@Pc(106) int local106 = (local68 + 1 >> 1) + arg3;
		@Pc(110) Class59 local110 = Static133.aClass59Array3[arg11];
		@Pc(132) int local132 = local110.JA(local82, local98) + local110.JA(local91, local98) + local110.JA(local82, local106) + local110.JA(local91, local106) >> 2;
		@Pc(136) Class6_Sub29 local136 = new Class6_Sub29();
		local136.anInt5277 = arg1;
		local136.anInt5263 = arg3;
		@Pc(147) int local147;
		if (arg10 < arg7) {
			local147 = arg7;
			arg7 = arg10;
			arg10 = local147;
		}
		local136.anInt5279 = arg5;
		local136.anInt5275 = Static312.anInt5688 + arg2;
		local136.anInt5280 = local8.aByte108;
		local136.anInt5268 = Static312.anInt5688 + arg8;
		local136.anInt5276 = arg4;
		local136.anInt5269 = arg6;
		local136.anInt5267 = arg5 + arg7;
		local136.anInt5266 = arg10 + arg5;
		if (arg9 < arg12) {
			local147 = arg12;
			arg12 = arg9;
			arg9 = local147;
		}
		local136.anInt5272 = local132;
		local136.anInt5273 = arg12 + arg3;
		local136.anInt5264 = (local65 << 8) + (local136.anInt5279 << 9);
		local136.anInt5265 = arg3 + arg9;
		local136.anInt5278 = (local68 << 8) + (local136.anInt5263 << 9);
		Static556.aClass361_66.method7833(local136);
		local8.aClass6_Sub29_3 = local136;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method405(@OriginalArg(1) Class14 arg0) {
		@Pc(7) int local7 = Static574.anInt9422;
		@Pc(9) int local9 = Static397.anInt6954;
		@Pc(11) int local11 = Static363.anInt6354;
		@Pc(15) int local15 = Static144.anInt3166 - 3;
		if (Static456.aClass58_41 == null || Static182.aClass58_22 == null) {
			if (Static398.aClass251_94.method5782(Static579.anInt9513) && Static398.aClass251_94.method5782(Static325.anInt5950)) {
				Static456.aClass58_41 = arg0.method6889(Static604.method3623(Static398.aClass251_94, Static579.anInt9513, 0), true);
				@Pc(44) Class140 local44 = Static604.method3623(Static398.aClass251_94, Static325.anInt5950, 0);
				Static182.aClass58_22 = arg0.method6889(local44, true);
				local44.method3620();
				Static205.aClass58_24 = arg0.method6889(local44, true);
			} else {
				arg0.C(local7, local9, local11, 20, 255 - Static104.anInt1998 << 24 | Static299.anInt5536, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static456.aClass58_41 != null && Static182.aClass58_22 != null) {
			local88 = (local11 - Static182.aClass58_22.QA() * 2) / Static456.aClass58_41.QA();
			for (local90 = 0; local90 < local88; local90++) {
				Static456.aClass58_41.method7666(local7 + Static182.aClass58_22.QA() + local90 * Static456.aClass58_41.QA(), local9);
			}
			Static182.aClass58_22.method7666(local7, local9);
			Static205.aClass58_24.method7666(local7 + local11 - Static205.aClass58_24.QA(), local9);
		}
		Static114.aClass92_4.method6390(local9 + 14, Static187.anInt3883 | 0xFF000000, local7 + 3, -1, Static230.aClass156_23.method4065(Static25.anInt769));
		arg0.C(local7, local9 + 20, local11, local15 - 20, -Static104.anInt1998 + 255 << 24 | Static299.anInt5536, 1);
		local88 = Static164.aClass173_1.method6487();
		local90 = Static164.aClass173_1.method6489();
		@Pc(171) int local171 = 0;
		@Pc(192) int local192;
		for (@Pc(176) Class6_Sub45 local176 = (Class6_Sub45) Static182.aClass361_23.method7838(); local176 != null; local176 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			local192 = (Static421.anInt7365 - local171 - 1) * 16 + local9 + 33;
			if (local88 > local7 && local88 < local11 + local7 && local192 - 13 < local90 && local90 < local192 + 4 && local176.aBoolean634) {
				arg0.C(local7, local192 - 12, local11, 16, Static398.anInt6974 | 255 - Static345.anInt6211 << 24, 1);
			}
			local171++;
		}
		if ((Static352.aClass58_33 == null || Static519.aClass58_43 == null || Static183.aClass58_23 == null) && Static398.aClass251_94.method5782(Static56.anInt1227) && Static398.aClass251_94.method5782(Static493.anInt8292) && Static398.aClass251_94.method5782(Static8.anInt276)) {
			@Pc(268) Class140 local268 = Static604.method3623(Static398.aClass251_94, Static493.anInt8292, 0);
			Static519.aClass58_43 = arg0.method6889(local268, true);
			local268.method3620();
			Static39.aClass58_26 = arg0.method6889(local268, true);
			Static352.aClass58_33 = arg0.method6889(Static604.method3623(Static398.aClass251_94, Static56.anInt1227, 0), true);
			@Pc(293) Class140 local293 = Static604.method3623(Static398.aClass251_94, Static8.anInt276, 0);
			Static183.aClass58_23 = arg0.method6889(local293, true);
			local293.method3620();
			Static301.aClass58_27 = arg0.method6889(local293, true);
		}
		local171 = 0;
		@Pc(364) int local364;
		@Pc(325) int local325;
		if (Static352.aClass58_33 != null && Static519.aClass58_43 != null && Static183.aClass58_23 != null) {
			local192 = (local11 - Static183.aClass58_23.QA() * 2) / Static352.aClass58_33.QA();
			for (local325 = 0; local325 < local192; local325++) {
				Static352.aClass58_33.method7666(Static183.aClass58_23.QA() + local7 + Static352.aClass58_33.QA() * local325, local15 + local9 - Static352.aClass58_33.b());
			}
			local364 = (local15 - Static183.aClass58_23.b() - 20) / Static519.aClass58_43.b();
			for (@Pc(366) int local366 = 0; local366 < local364; local366++) {
				Static519.aClass58_43.method7666(local7, local9 + Static519.aClass58_43.b() * local366 + 20);
				Static39.aClass58_26.method7666(local7 + local11 - Static39.aClass58_26.QA(), local9 - (-20 - local366 * Static519.aClass58_43.b()));
			}
			Static183.aClass58_23.method7666(local7, local15 + local9 - Static183.aClass58_23.b());
			Static301.aClass58_27.method7666(local11 + local7 - Static183.aClass58_23.QA(), local15 + local9 + -Static183.aClass58_23.b());
		}
		for (@Pc(437) Class6_Sub45 local437 = (Class6_Sub45) Static182.aClass361_23.method7838(); local437 != null; local437 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			local325 = (Static421.anInt7365 - local171 - 1) * 16 + local9 + 33;
			local364 = Static187.anInt3883 | 0xFF000000;
			if (local7 < local88 && local88 < local7 + local11 && local90 > local325 - 13 && local90 < local325 + 4 && local437.aBoolean634) {
				local364 = Static599.anInt9632 | 0xFF000000;
			}
			@Pc(490) int[] local490 = null;
			if (Static189.method3425(local437.anInt8730)) {
				local490 = Static444.aClass322_2.method7141((int) local437.aLong235).anIntArray485;
			} else if (local437.anInt8734 != -1) {
				local490 = Static444.aClass322_2.method7141(local437.anInt8734).anIntArray485;
			} else if (Static280.method4614(local437.anInt8730)) {
				@Pc(568) Class6_Sub34 local568 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local437.aLong235);
				if (local568 != null) {
					@Pc(573) Class4_Sub1_Sub1_Sub1 local573 = local568.aClass4_Sub1_Sub1_Sub1_2;
					@Pc(576) Class273 local576 = local573.aClass273_1;
					if (local576.anIntArray537 != null) {
						local576 = local576.method6159(Static498.aClass101_1);
					}
					if (local576 != null) {
						local490 = local576.anIntArray535;
					}
				}
			} else if (Static357.method5419(local437.anInt8730)) {
				@Pc(537) Class252 local537;
				if (local437.anInt8730 == 1011) {
					local537 = Static412.aClass307_4.method6636((int) local437.aLong235);
				} else {
					local537 = Static412.aClass307_4.method6636((int) (local437.aLong235 >>> 32 & 0x7FFFFFFFL));
				}
				if (local537.anIntArray506 != null) {
					local537 = local537.method5799(Static498.aClass101_1);
				}
				if (local537 != null) {
					local490 = local537.anIntArray508;
				}
			}
			@Pc(602) String local602 = Static55.method1204(local437);
			if (local490 != null) {
				local602 = local602 + Static493.method6728(local490);
			}
			Static114.aClass92_4.method6402(local364, local602, local325, Static218.anIntArray272, Static194.aClass58Array9, local7 + 3);
			if (local437.aBoolean633) {
				Static313.aClass58_29.method7666(local7 + Static555.aClass327_13.method7196(local602) + 5, local325 - 12);
			}
			local171++;
		}
		Static9.method204(Static144.anInt3166, Static574.anInt9422, Static397.anInt6954, Static363.anInt6354);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void method406(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Static528.aString99 = arg1;
		Static104.aBoolean141 = arg2;
		Static216.aString30 = arg0;
		if (!Static104.aBoolean141 && Static560.anInt9247 != 3 && (Static216.aString30.equals("") || Static528.aString99.equals(""))) {
			Static305.method1149(3);
			return;
		}
		Static283.aBoolean380 = false;
		if (Static560.anInt9247 != 1) {
			Static2.anInt25 = -1;
			Static365.anInt6397 = 0;
		}
		Static305.method1149(-3);
		Static10.anInt296 = 0;
		Static384.anInt6751 = 1;
		Static492.anInt8281 = 0;
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "(I)V")
	public static void method408() {
		if (Static438.aBoolean528) {
			return;
		}
		Static438.aBoolean528 = true;
		Static261.aBoolean359 = true;
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static428.aFloat160 = (int) Static428.aFloat160 + 191 & 0xFFFFFF80;
		} else {
			Static272.aFloat131 += (24.0F - Static272.aFloat131) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)Z")
	public static boolean method409(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
