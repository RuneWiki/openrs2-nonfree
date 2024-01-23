import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	public static int anInt3966;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Lclient!en;")
	public static Class44 aClass44_20 = new Class44();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIILclient!kk;IIZZB)Lclient!bn;")
	public static Class2_Sub8_Sub1 method3259(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(9) Class60 local9 = Static87.method1546(arg5);
		if (arg2 > 1 && local9.anIntArray200 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg2 >= local9.anIntArray201[local19] && local9.anIntArray201[local19] != 0) {
					local17 = local9.anIntArray200[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static87.method1546(local17);
			}
		}
		@Pc(65) Class15_Sub5_Sub1 local65 = local9.method1640(arg3);
		if (local65 == null) {
			return null;
		}
		@Pc(72) Class2_Sub8_Sub1_Sub1 local72 = null;
		if (local9.anInt2213 != -1) {
			local72 = (Class2_Sub8_Sub1_Sub1) method3259(false, 1, 10, arg3, 0, local9.anInt2209, true, true);
			if (local72 == null) {
				return null;
			}
		} else if (local9.anInt2215 != -1) {
			local72 = (Class2_Sub8_Sub1_Sub1) method3259(false, arg1, arg2, arg3, arg4, local9.anInt2225, false, true);
			if (local72 == null) {
				return null;
			}
		}
		@Pc(119) int[] local119 = Static77.anIntArray163;
		@Pc(121) int local121 = Static77.anInt1895;
		@Pc(124) int[] local124 = new int[4];
		@Pc(126) int local126 = Static77.anInt1897;
		Static77.method1452(local124);
		@Pc(134) Class2_Sub8_Sub1_Sub1 local134 = new Class2_Sub8_Sub1_Sub1(36, 32);
		Static77.method1460(local134.anIntArray340, 36, 32);
		Static1.method17();
		Static1.method8(16, 16);
		@Pc(146) int local146 = local9.anInt2260;
		if (arg6) {
			local146 = (int) ((double) local146 * 1.5D);
		} else if (arg1 == 2) {
			local146 = (int) ((double) local146 * 1.04D);
		}
		Static1.aBoolean5 = false;
		@Pc(177) int local177 = local146 * Class1.anIntArray3[local9.anInt2239] >> 16;
		@Pc(186) int local186 = local146 * Class1.anIntArray4[local9.anInt2239] >> 16;
		local65.method2332(local9.anInt2218, local9.anInt2246, local9.anInt2239, local9.anInt2237, local186 + local9.anInt2250 - local65.method4274() / 2, local177 + local9.anInt2250, -1L);
		if (arg1 >= 1) {
			local134.method2788(1);
			if (arg1 >= 2) {
				local134.method2788(16777215);
			}
			Static77.method1460(local134.anIntArray340, 36, 32);
		}
		if (arg4 != 0) {
			local134.method2781(arg4);
		}
		if (local9.anInt2213 != -1) {
			local72.method4364(0, 0);
		} else if (local9.anInt2215 != -1) {
			Static77.method1460(local72.anIntArray340, 36, 32);
			local134.method4364(0, 0);
			local134 = local72;
		}
		if (arg0 && (local9.anInt2244 == 1 || arg2 != 1) && arg2 != -1) {
			Static211.aClass2_Sub8_Sub5_Sub1_2.method1220(Static285.method4452(arg2), 0, 9, 16776960, 1);
		}
		Static77.method1460(local119, local126, local121);
		Static77.method1440(local124);
		Static1.method17();
		Static1.aBoolean5 = true;
		return Static116.aBoolean184 && !arg7 ? new Class2_Sub8_Sub1_Sub2(local134) : local134;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ee;Z)V")
	public static void method3260(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) boolean arg1) {
		Static39.aClass44_3.method1358(arg0);
		while (true) {
			@Pc(8) Class2_Sub13 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class2_Sub13[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class2_Sub13 local153;
			@Pc(1332) int local1332;
			do {
				do {
					do {
						do {
							do {
								do {
									@Pc(33) float var8;
									@Pc(44) int var9;
									@Pc(48) int var10;
									@Pc(907) int var17;
									@Pc(916) int var18;
									@Pc(928) int var19;
									while (true) {
										@Pc(363) Class122 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class170 var33;
										@Pc(1179) Class2_Sub13 var39;
										while (true) {
											do {
												local8 = (Class2_Sub13) Static39.aClass44_3.method1353();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean104);
											local18 = local8.anInt1551;
											local21 = local8.anInt1543;
											local24 = local8.anInt1548;
											local27 = local8.anInt1547;
											local31 = Static52.aClass2_Sub13ArrayArrayArray1[local24];
											var8 = 0.0F;
											if (Static116.aBoolean184) {
												if (Static85.anIntArrayArrayArray4 == Static9.anIntArrayArrayArray7) {
													var9 = Static170.anIntArrayArray23[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static73.anInt1827) {
														Static73.anInt1827 = var10;
														Static163.method2983(var10);
														Static235.method3806(Static152.method2800());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static304.anInt5893) {
														Static304.anInt5893 = local65;
														Static29.method567(local65);
													}
													local115 = Static300.anIntArrayArrayArray15[0][local18][local21] + Static300.anIntArrayArrayArray15[0][local18 + 1][local21] + Static300.anIntArrayArrayArray15[0][local18][local21 + 1] + Static300.anIntArrayArrayArray15[0][local18 + 1][local21 + 1] >> 2;
													Static118.method1991(-local115, 3);
													var8 = 201.5F;
													Static116.method1957(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static116.method1957(var8);
												}
											}
											if (!local8.aBoolean101) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static52.aClass2_Sub13ArrayArrayArray1[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean104) {
														continue;
													}
												}
												if (local18 <= Static290.anInt5686 && local18 > Static82.anInt1918) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean104 && (local153.aBoolean101 || (local8.anInt1550 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static290.anInt5686 && local18 < Static276.anInt5467 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean104 && (local153.aBoolean101 || (local8.anInt1550 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static72.anInt1815 && local21 > Static281.anInt5559) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean104 && (local153.aBoolean101 || (local8.anInt1550 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static72.anInt1815 && local21 < Static84.anInt1964 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean104 && (local153.aBoolean101 || (local8.anInt1550 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean101 = false;
											if (local8.aClass2_Sub13_1 != null) {
												local153 = local8.aClass2_Sub13_1;
												if (Static116.aBoolean184) {
													Static116.method1957(201.5F - (float) (local153.anInt1547 + 1) * 50.0F);
												}
												if (local153.aClass143_1 == null) {
													if (local153.aClass182_1 != null) {
														if (Static87.method1552(0, local18, local21)) {
															Static100.method1730(local153.aClass182_1, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, true);
														} else {
															Static100.method1730(local153.aClass182_1, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, false);
														}
													}
												} else if (Static87.method1552(0, local18, local21)) {
													Static160.method4108(local153.aClass143_1, 0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, true);
												} else {
													Static160.method4108(local153.aClass143_1, 0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, false);
												}
												var30 = local153.aClass122_1;
												if (var30 != null) {
													if (Static116.aBoolean184) {
														if ((var30.anInt4022 & local8.anInt1545) == 0) {
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
														} else {
															Static212.method3539(var30.anInt4022, Static10.anInt148, Static268.anInt5235, Static18.anInt389, local27, local18, local21);
														}
													}
													var30.aClass15_3.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, var30.anInt4018 - Static10.anInt148, var30.anInt4023 - Static268.anInt5235, var30.anInt4021 - Static18.anInt389, var30.aLong142, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt1544; local65++) {
													var33 = local153.aClass170Array1[local65];
													if (var33 != null) {
														if (Static116.aBoolean184) {
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
														}
														var33.aClass15_9.method4272(var33.anInt5438, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, var33.anInt5443 - Static10.anInt148, var33.anInt5431 - Static268.anInt5235, var33.anInt5432 - Static18.anInt389, var33.aLong195, local24, null);
													}
												}
												if (Static116.aBoolean184) {
													Static116.method1957(var8);
												}
											}
											var32 = false;
											if (local8.aClass143_1 == null) {
												if (local8.aClass182_1 != null) {
													if (Static87.method1552(local27, local18, local21)) {
														Static100.method1730(local8.aClass182_1, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, true);
													} else {
														var32 = true;
														Static100.method1730(local8.aClass182_1, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, false);
													}
												}
											} else if (Static87.method1552(local27, local18, local21)) {
												Static160.method4108(local8.aClass143_1, local27, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass143_1.anInt4573 != 12345678 || Static182.aBoolean399 && local24 <= Static268.anInt5228) {
													Static160.method4108(local8.aClass143_1, local27, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class191 local549 = local8.aClass191_1;
												if (local549 != null && (local549.aLong209 & 0x80000000L) != 0L) {
													if (Static116.aBoolean184 && local549.aBoolean394) {
														Static116.method1957(var8 + 50.0F - 1.5F);
													}
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													local549.aClass15_10.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local549.anInt5934 - Static10.anInt148, local549.anInt5935 - Static268.anInt5235, local549.anInt5932 - Static18.anInt389, local549.aLong209, local24, null);
													if (Static116.aBoolean184 && local549.aBoolean394) {
														Static116.method1957(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class122 local616 = local8.aClass122_1;
											@Pc(619) Class147 local619 = local8.aClass147_1;
											if (local616 != null || local619 != null) {
												if (Static290.anInt5686 == local18) {
													var10++;
												} else if (Static290.anInt5686 < local18) {
													var10 += 2;
												}
												if (Static72.anInt1815 == local21) {
													var10 += 3;
												} else if (Static72.anInt1815 > local21) {
													var10 += 6;
												}
												local65 = Static136.anIntArray306[var10];
												local8.anInt1545 = Static39.anIntArray86[var10];
											}
											if (local616 != null) {
												if ((local616.anInt4022 & Static91.anIntArray199[var10]) == 0) {
													local8.anInt1552 = 0;
												} else if (local616.anInt4022 == 16) {
													local8.anInt1552 = 3;
													local8.anInt1546 = Static242.anIntArray474[var10];
													local8.anInt1549 = 3 - local8.anInt1546;
												} else if (local616.anInt4022 == 32) {
													local8.anInt1552 = 6;
													local8.anInt1546 = Static193.anIntArray402[var10];
													local8.anInt1549 = 6 - local8.anInt1546;
												} else if (local616.anInt4022 == 64) {
													local8.anInt1552 = 12;
													local8.anInt1546 = Static213.anIntArray437[var10];
													local8.anInt1549 = 12 - local8.anInt1546;
												} else {
													local8.anInt1552 = 9;
													local8.anInt1546 = Static206.anIntArray424[var10];
													local8.anInt1549 = 9 - local8.anInt1546;
												}
												if ((local616.anInt4022 & local65) != 0 && !Static272.method4306(local27, local18, local21, local616.anInt4022)) {
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													local616.aClass15_3.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local616.anInt4018 - Static10.anInt148, local616.anInt4023 - Static268.anInt5235, local616.anInt4021 - Static18.anInt389, local616.aLong142, local24, null);
												}
												if ((local616.anInt4019 & local65) != 0 && !Static272.method4306(local27, local18, local21, local616.anInt4019)) {
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													local616.aClass15_2.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local616.anInt4018 - Static10.anInt148, local616.anInt4023 - Static268.anInt5235, local616.anInt4021 - Static18.anInt389, local616.aLong142, local24, null);
												}
											}
											if (local619 != null && !Static121.method2021(local27, local18, local21, local619.aClass15_5.method4274())) {
												if (Static116.aBoolean184) {
													Static116.method1957(var8 - 0.5F);
												}
												if ((local619.anInt4777 & local65) != 0) {
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													local619.aClass15_5.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local619.anInt4781 + local619.anInt4783 - Static10.anInt148, local619.anInt4780 - Static268.anInt5235, local619.anInt4784 + local619.anInt4778 - Static18.anInt389, local619.aLong178, local24, null);
												} else if (local619.anInt4777 == 256) {
													local894 = local619.anInt4781 - Static10.anInt148;
													local899 = local619.anInt4780 - Static268.anInt5235;
													local904 = local619.anInt4784 - Static18.anInt389;
													var17 = local619.anInt4782;
													if (var17 == 1 || var17 == 2) {
														var18 = -local894;
													} else {
														var18 = local894;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local904;
													} else {
														var19 = local904;
													}
													if (var19 < var18) {
														if (Static116.aBoolean184) {
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
														}
														local619.aClass15_5.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local894 + local619.anInt4783, local899, local904 + local619.anInt4778, local619.aLong178, local24, null);
													} else if (local619.aClass15_4 != null) {
														if (Static116.aBoolean184) {
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
														}
														local619.aClass15_4.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local894, local899, local904, local619.aLong178, local24, null);
													}
												}
												if (Static116.aBoolean184) {
													Static116.method1957(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class191 local1001 = local8.aClass191_1;
												if (local1001 != null && (local1001.aLong209 & 0x80000000L) == 0L) {
													if (Static116.aBoolean184 && local1001.aBoolean394) {
														Static116.method1957(var8 + 50.0F - 1.5F);
													}
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													local1001.aClass15_10.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local1001.anInt5934 - Static10.anInt148, local1001.anInt5935 - Static268.anInt5235, local1001.anInt5932 - Static18.anInt389, local1001.aLong209, local24, null);
													if (Static116.aBoolean184 && local1001.aBoolean394) {
														Static116.method1957(var8);
													}
												}
												@Pc(1064) Class167 local1064 = local8.aClass167_1;
												if (local1064 != null && local1064.anInt5237 == 0) {
													if (Static116.aBoolean184) {
														Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
													}
													if (local1064.aClass15_6 != null) {
														local1064.aClass15_6.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local1064.anInt5231 - Static10.anInt148, local1064.anInt5234 - Static268.anInt5235, local1064.anInt5232 - Static18.anInt389, local1064.aLong189, local24, null);
													}
													if (local1064.aClass15_7 != null) {
														local1064.aClass15_7.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local1064.anInt5231 - Static10.anInt148, local1064.anInt5234 - Static268.anInt5235, local1064.anInt5232 - Static18.anInt389, local1064.aLong189, local24, null);
													}
													if (local1064.aClass15_8 != null) {
														local1064.aClass15_8.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local1064.anInt5231 - Static10.anInt148, local1064.anInt5234 - Static268.anInt5235, local1064.anInt5232 - Static18.anInt389, local1064.aLong189, local24, null);
													}
												}
											}
											local894 = local8.anInt1550;
											if (local894 != 0) {
												if (local18 < Static290.anInt5686 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean104) {
														Static39.aClass44_3.method1358(var39);
													}
												}
												if (local21 < Static72.anInt1815 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean104) {
														Static39.aClass44_3.method1358(var39);
													}
												}
												if (local18 > Static290.anInt5686 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean104) {
														Static39.aClass44_3.method1358(var39);
													}
												}
												if (local21 > Static72.anInt1815 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean104) {
														Static39.aClass44_3.method1358(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt1552 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt1544; var10++) {
												if (local8.aClass170Array1[var10].anInt5445 != Static40.anInt989 && (local8.anIntArray131[var10] & local8.anInt1552) == local8.anInt1546) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass122_1;
												if (!Static272.method4306(local27, local18, local21, var30.anInt4022)) {
													if (Static116.aBoolean184) {
														label1037: {
															if ((var30.aLong142 & 0xFC000L) == 16384L) {
																local65 = var30.anInt4018 - Static10.anInt148;
																local115 = var30.anInt4021 - Static18.anInt389;
																local1332 = (int) (var30.aLong142 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static232.anInt4680 - 1) {
																		Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static38.anInt954 - 1 && local21 < Static232.anInt4680 - 1) {
																		Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static38.anInt954 - 1 && local21 > 0) {
																		Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
														}
													}
													var30.aClass15_3.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, var30.anInt4018 - Static10.anInt148, var30.anInt4023 - Static268.anInt5235, var30.anInt4021 - Static18.anInt389, var30.aLong142, local24, null);
												}
												local8.anInt1552 = 0;
											}
										}
										if (!local8.aBoolean102) {
											break;
										}
										try {
											var9 = local8.anInt1544;
											local8.aBoolean102 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass170Array1[local65];
												if (var33.anInt5445 != Static40.anInt989) {
													for (local1332 = var33.anInt5433; local1332 <= var33.anInt5435; local1332++) {
														for (local894 = var33.anInt5437; local894 <= var33.anInt5448; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean101) {
																local8.aBoolean102 = true;
																continue label844;
															}
															if (var39.anInt1552 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt5433) {
																	local904++;
																}
																if (local1332 < var33.anInt5435) {
																	local904 += 4;
																}
																if (local894 > var33.anInt5437) {
																	local904 += 8;
																}
																if (local894 < var33.anInt5448) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt1552) == local8.anInt1549) {
																	local8.aBoolean102 = true;
																	continue label844;
																}
															}
														}
													}
													Static285.aClass170Array2[var10++] = var33;
													local1332 = Static290.anInt5686 - var33.anInt5433;
													local894 = var33.anInt5435 - Static290.anInt5686;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static72.anInt1815 - var33.anInt5437;
													local904 = var33.anInt5448 - Static72.anInt1815;
													if (local904 > local899) {
														var33.anInt5442 = local1332 + local904;
													} else {
														var33.anInt5442 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class170 local1628 = Static285.aClass170Array2[local1332];
													if (local1628.anInt5445 != Static40.anInt989) {
														if (local1628.anInt5442 > local65) {
															local65 = local1628.anInt5442;
															local115 = local1332;
														} else if (local1628.anInt5442 == local65) {
															local899 = local1628.anInt5443 - Static10.anInt148;
															local904 = local1628.anInt5432 - Static18.anInt389;
															var17 = Static285.aClass170Array2[local115].anInt5443 - Static10.anInt148;
															var18 = Static285.aClass170Array2[local115].anInt5432 - Static18.anInt389;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class170 local1697 = Static285.aClass170Array2[local115];
												local1697.anInt5445 = Static40.anInt989;
												if (!Static249.method3920(local27, local1697.anInt5433, local1697.anInt5435, local1697.anInt5437, local1697.anInt5448, local1697.aClass15_9.method4274())) {
													if (Static116.aBoolean184) {
														if ((local1697.aLong195 & 0xFC000L) == 147456L) {
															Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
															local894 = local1697.anInt5443 - Static10.anInt148;
															local899 = local1697.anInt5432 - Static18.anInt389;
															local904 = (int) (local1697.aLong195 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static212.method3532(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static212.method3532(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static212.method3532(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static212.method3532(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static212.method3545(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local1697.anInt5433, local1697.anInt5437, local1697.anInt5435, local1697.anInt5448);
														}
													}
													local1697.aClass15_9.method4272(local1697.anInt5438, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local1697.anInt5443 - Static10.anInt148, local1697.anInt5431 - Static268.anInt5235, local1697.anInt5432 - Static18.anInt389, local1697.aLong195, local24, null);
												}
												for (local894 = local1697.anInt5433; local894 <= local1697.anInt5435; local894++) {
													for (local899 = local1697.anInt5437; local899 <= local1697.anInt5448; local899++) {
														@Pc(1863) Class2_Sub13 local1863 = local31[local894][local899];
														if (local1863.anInt1552 != 0) {
															Static39.aClass44_3.method1358(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean104) {
															Static39.aClass44_3.method1358(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean102) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean102 = false;
											break;
										}
									}
									if (local8.aClass66_1 != null) {
										if (Static116.aBoolean184) {
											@Pc(1905) GL local1905 = Static116.aGL1;
											Static116.method1957(var8);
											Static97.method1702(Static10.anInt148, Static268.anInt5235, Static18.anInt389);
											var10 = local8.anInt1551 * 128 + 64 - Static10.anInt148;
											local65 = Static9.anIntArrayArrayArray7[local24][local8.anInt1551][local8.anInt1543] - Static268.anInt5235;
											local115 = local8.anInt1543 * 128 + 64 - Static18.anInt389;
											if (local24 < 3) {
												local1332 = Static9.anIntArrayArrayArray7[local24][local8.anInt1551][local8.anInt1543] - Static9.anIntArrayArrayArray7[local24 + 1][local8.anInt1551][local8.anInt1543];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static20.anInt418 - var10 * Static222.anInt4524 >> 16;
											local899 = local65 * Static192.anInt4024 + local894 * Static100.anInt2374 >> 16;
											local904 = local899 + (Static100.anInt2374 * 91 + Static192.anInt4024 * 0 >> 16);
											var17 = local899 + (Static100.anInt2374 * -91 - local1332 * Static192.anInt4024 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class20_Sub1_Sub1 local2030 = null;
											@Pc(2032) Class20_Sub3 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class20_Sub1_Sub1 local2040 = (Class20_Sub1_Sub1) local8.aClass66_1.method1707();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass20_Sub3_1 == null || local2040.aClass20_Sub3_1.aClass20_Sub2_7.aBoolean150) {
															local2040.method4753();
															break label1054;
														}
														if ((byte) (local2040.aClass20_Sub3_1.aClass20_Sub2_7.aLong76 & 0xFFL) != local8.aByte3) {
															local8.aClass66_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub3_1;
															local2034 = local2032.aClass75_2.anInt2535;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass20_Sub3_1 != local2032 || local2040.aClass20_Sub3_1.aClass75_2.anInt2535 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static97.anIntArray203[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static97.anIntArray204[local2097] = 0;
														}
														Static97.anInt2329 = 0;
														for (@Pc(2121) Class20_Sub1_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class20_Sub1_Sub1) local2121.aClass20_Sub1_5) {
															if (local2121.aClass20_Sub3_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt4570 >> 12) - Static10.anInt148;
																@Pc(2141) int local2141 = (local2121.anInt4571 >> 12) - Static268.anInt5235;
																@Pc(2148) int local2148 = (local2121.anInt4566 >> 12) - Static18.anInt389;
																@Pc(2158) int local2158 = local2148 * Static20.anInt418 - local2134 * Static222.anInt4524 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static192.anInt4024 + local2158 * Static100.anInt2374 >> 16) - var17;
																if (Static97.anIntArray203[local2170] < 32) {
																	Static97.aShortArrayArray3[local2170][Static97.anIntArray203[local2170]++] = local2121.aShort68;
																} else {
																	if (Static97.anIntArray203[local2170] == 32) {
																		if (Static97.anInt2329 == 32) {
																			if (Static97.aBoolean151) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static97.anIntArray203[local2170] += Static97.anInt2329++ + 1;
																	}
																	@Pc(2227) int local2227 = Static97.anIntArray204[Static97.anIntArray203[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static97.aShortArrayArray4[Static97.anIntArray203[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static97.anIntArray203[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static97.anIntArray204[Static97.anIntArray203[local2170] - 32 - 1];
																		Static97.anIntArray204[local2247] = Static97.anIntArray204[Static97.anIntArray203[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort68;
																	}
																}
															}
															if (local2121.aClass20_Sub1_5 == local8.aClass66_1.aClass20_Sub1_3) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static97.aBoolean152 && local2032.aClass75_2.anInt2567 != -1) {
															Static1.anInterface3_1.method4140(local2032.aClass75_2.anInt2567);
															local2270 = true;
														} else {
															Static116.method1945(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static97.aFloat10;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass20_Sub2_7.method1690(local1905, var18, local2270, local2032.aClass75_2.aBoolean166);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass20_Sub3_1;
															local2034 = local2040.aClass20_Sub3_1.aClass75_2.anInt2535;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class20_Sub1_Sub1) local8.aClass66_1.method1713();
											}
											Static97.method1701();
										} else {
											var9 = Static97.anInt2314 + Static1.anInt4;
											var10 = Static97.anInt2316 + Static1.anInt3;
											@Pc(2347) Class20_Sub1 local2347 = local8.aClass66_1.aClass20_Sub1_3;
											for (@Pc(2350) Class20_Sub1 local2350 = local2347.aClass20_Sub1_5; local2350 != local2347; local2350 = local2350.aClass20_Sub1_5) {
												@Pc(2356) Class20_Sub1_Sub1 local2356 = (Class20_Sub1_Sub1) local2350;
												if (local2356.aClass20_Sub3_1 != null && !local2356.aClass20_Sub3_1.aClass20_Sub2_7.aBoolean150) {
													if ((byte) (local2356.aClass20_Sub3_1.aClass20_Sub2_7.aLong76 & 0xFFL) != local8.aByte3) {
														local8.aClass66_1 = null;
														break;
													}
													local894 = (local2356.anInt4570 >> 12) - Static10.anInt148;
													local899 = (local2356.anInt4571 >> 12) - Static268.anInt5235;
													local904 = (local2356.anInt4566 >> 12) - Static18.anInt389;
													var17 = local904 * Static222.anInt4524 + local894 * Static20.anInt418 >> 16;
													local904 = local904 * Static20.anInt418 - local894 * Static222.anInt4524 >> 16;
													local894 = var17;
													var17 = local899 * Static100.anInt2374 - local904 * Static192.anInt4024 >> 16;
													local904 = local899 * Static192.anInt4024 + local904 * Static100.anInt2374 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static77.method1461(var18, var19, (local2356.aClass20_Sub3_1.aClass75_2.anInt2535 << 16) / local2468, local2356.anInt4572, local2356.anInt4572 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean104);
							} while (local8.anInt1552 != 0);
							if (local18 > Static290.anInt5686 || local18 <= Static82.anInt1918) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean104);
						if (local18 < Static290.anInt5686 || local18 >= Static276.anInt5467 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean104);
					if (local21 > Static72.anInt1815 || local21 <= Static281.anInt5559) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean104);
				if (local21 < Static72.anInt1815 || local21 >= Static84.anInt1964 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean104);
			local8.aBoolean104 = false;
			Static169.anInt3730--;
			@Pc(2596) Class167 local2596 = local8.aClass167_1;
			if (local2596 != null && local2596.anInt5237 != 0) {
				if (Static116.aBoolean184) {
					Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
				}
				if (local2596.aClass15_6 != null) {
					local2596.aClass15_6.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2596.anInt5231 - Static10.anInt148, local2596.anInt5234 - Static268.anInt5235 - local2596.anInt5237, local2596.anInt5232 - Static18.anInt389, local2596.aLong189, local24, null);
				}
				if (local2596.aClass15_7 != null) {
					local2596.aClass15_7.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2596.anInt5231 - Static10.anInt148, local2596.anInt5234 - Static268.anInt5235 - local2596.anInt5237, local2596.anInt5232 - Static18.anInt389, local2596.aLong189, local24, null);
				}
				if (local2596.aClass15_8 != null) {
					local2596.aClass15_8.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2596.anInt5231 - Static10.anInt148, local2596.anInt5234 - Static268.anInt5235 - local2596.anInt5237, local2596.anInt5232 - Static18.anInt389, local2596.aLong189, local24, null);
				}
			}
			if (local8.anInt1545 != 0) {
				@Pc(2706) Class147 local2706 = local8.aClass147_1;
				if (local2706 != null && !Static121.method2021(local27, local18, local21, local2706.aClass15_5.method4274())) {
					if ((local2706.anInt4777 & local8.anInt1545) != 0) {
						if (Static116.aBoolean184) {
							Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
						}
						local2706.aClass15_5.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2706.anInt4781 + local2706.anInt4783 - Static10.anInt148, local2706.anInt4780 - Static268.anInt5235, local2706.anInt4784 + local2706.anInt4778 - Static18.anInt389, local2706.aLong178, local24, null);
					} else if (local2706.anInt4777 == 256) {
						local65 = local2706.anInt4781 - Static10.anInt148;
						local115 = local2706.anInt4780 - Static268.anInt5235;
						local1332 = local2706.anInt4784 - Static18.anInt389;
						local894 = local2706.anInt4782;
						if (local894 == 1 || local894 == 2) {
							local899 = -local65;
						} else {
							local899 = local65;
						}
						if (local894 == 2 || local894 == 3) {
							local904 = -local1332;
						} else {
							local904 = local1332;
						}
						if (local904 >= local899) {
							if (Static116.aBoolean184) {
								Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
							}
							local2706.aClass15_5.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local65 + local2706.anInt4783, local115, local1332 + local2706.anInt4778, local2706.aLong178, local24, null);
						} else if (local2706.aClass15_4 != null) {
							if (Static116.aBoolean184) {
								Static212.method3538(Static10.anInt148, Static268.anInt5235, Static18.anInt389, local24, local18, local21);
							}
							local2706.aClass15_4.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local65, local115, local1332, local2706.aLong178, local24, null);
						}
					}
				}
				@Pc(2872) Class122 local2872 = local8.aClass122_1;
				if (local2872 != null) {
					if ((local2872.anInt4019 & local8.anInt1545) != 0 && !Static272.method4306(local27, local18, local21, local2872.anInt4019)) {
						if (Static116.aBoolean184) {
							Static212.method3539(local2872.anInt4019, Static10.anInt148, Static268.anInt5235, Static18.anInt389, local27, local18, local21);
						}
						local2872.aClass15_2.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2872.anInt4018 - Static10.anInt148, local2872.anInt4023 - Static268.anInt5235, local2872.anInt4021 - Static18.anInt389, local2872.aLong142, local24, null);
					}
					if ((local2872.anInt4022 & local8.anInt1545) != 0 && !Static272.method4306(local27, local18, local21, local2872.anInt4022)) {
						if (Static116.aBoolean184) {
							Static212.method3539(local2872.anInt4022, Static10.anInt148, Static268.anInt5235, Static18.anInt389, local27, local18, local21);
						}
						local2872.aClass15_3.method4272(0, Static192.anInt4024, Static100.anInt2374, Static222.anInt4524, Static20.anInt418, local2872.anInt4018 - Static10.anInt148, local2872.anInt4023 - Static268.anInt5235, local2872.anInt4021 - Static18.anInt389, local2872.aLong142, local24, null);
					}
				}
			}
			@Pc(2985) Class2_Sub13 local2985;
			if (local24 < Static46.anInt1155 - 1) {
				local2985 = Static52.aClass2_Sub13ArrayArrayArray1[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean104) {
					Static39.aClass44_3.method1358(local2985);
				}
			}
			if (local18 < Static290.anInt5686) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean104) {
					Static39.aClass44_3.method1358(local2985);
				}
			}
			if (local21 < Static72.anInt1815) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean104) {
					Static39.aClass44_3.method1358(local2985);
				}
			}
			if (local18 > Static290.anInt5686) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean104) {
					Static39.aClass44_3.method1358(local2985);
				}
			}
			if (local21 > Static72.anInt1815) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean104) {
					Static39.aClass44_3.method1358(local2985);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3262(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static56.aClass177_1);
		arg0.removeMouseMotionListener(Static56.aClass177_1);
		arg0.removeFocusListener(Static56.aClass177_1);
		Static53.anInt1321 = 0;
	}
}
