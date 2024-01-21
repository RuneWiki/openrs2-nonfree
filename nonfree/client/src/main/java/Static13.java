import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
	public static int[] anIntArray65 = new int[32768];

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!rd;")
	private static Class64 aClass64_303 = Static69.method1153("Attack");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!rd;")
	public static Class64 aClass64_304 = null;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!rd;")
	private static Class64 aClass64_305 = Static69.method1153("Prepared visibility map");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_306 = aClass64_305;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_307 = aClass64_303;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public static int anInt455 = -1;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
	public static int[] anIntArray66 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_308 = Static69.method1153("weiss:");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!pb;Ljava/awt/Component;Lclient!pb;I)V")
	public static void method285(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class41 arg2) {
		if (Static61.aBoolean81) {
			return;
		}
		Static61.aClass37_21 = Static55.method2074(128, 265, arg1);
		Static47.method1948();
		Static105.aClass37_35 = Static55.method2074(128, 265, arg1);
		Static47.method1948();
		Static62.aClass37_23 = Static55.method2074(509, 171, arg1);
		Static47.method1948();
		Static51.aClass37_16 = Static55.method2074(360, 132, arg1);
		Static47.method1948();
		Static77.aClass37_28 = Static55.method2074(360, 200, arg1);
		Static47.method1948();
		Static58.aClass37_19 = Static55.method2074(202, 238, arg1);
		Static47.method1948();
		Static20.aClass37_9 = Static55.method2074(203, 238, arg1);
		Static47.method1948();
		Static98.aClass37_30 = Static55.method2074(74, 94, arg1);
		Static47.method1948();
		Static94.aClass37_29 = Static55.method2074(75, 94, arg1);
		Static47.method1948();
		@Pc(77) byte[] local77 = arg0.method1065(Static45.aClass64_708, Static34.aClass64_501);
		@Pc(83) Class1_Sub1_Sub5_Sub2 local83 = new Class1_Sub1_Sub5_Sub2(local77, arg1);
		Static61.aClass37_21.method1459();
		local83.method782(0, 0);
		Static105.aClass37_35.method1459();
		local83.method782(-637, 0);
		Static62.aClass37_23.method1459();
		local83.method782(-128, 0);
		Static51.aClass37_16.method1459();
		local83.method782(-202, -371);
		Static77.aClass37_28.method1459();
		local83.method782(-202, -171);
		Static58.aClass37_19.method1459();
		local83.method782(0, -265);
		Static20.aClass37_9.method1459();
		local83.method782(-562, -265);
		Static98.aClass37_30.method1459();
		local83.method782(-128, -171);
		Static94.aClass37_29.method1459();
		local83.method782(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt1019];
		@Pc(156) int local156;
		@Pc(184) int local184;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt1023; local152++) {
			for (local156 = 0; local156 < local83.anInt1019; local156++) {
				local150[local156] = local83.anIntArray150[local83.anInt1019 + local152 * local83.anInt1019 - local156 - 1];
			}
			for (local184 = 0; local184 < local83.anInt1019; local184++) {
				local83.anIntArray150[local184 + local83.anInt1019 * local152] = local150[local184];
			}
		}
		Static61.aClass37_21.method1459();
		local83.method782(382, 0);
		Static105.aClass37_35.method1459();
		local83.method782(-255, 0);
		Static62.aClass37_23.method1459();
		local83.method782(254, 0);
		Static51.aClass37_16.method1459();
		local83.method782(180, -371);
		Static77.aClass37_28.method1459();
		local83.method782(180, -171);
		Static58.aClass37_19.method1459();
		local83.method782(382, -265);
		Static20.aClass37_9.method1459();
		local83.method782(-180, -265);
		Static98.aClass37_30.method1459();
		local83.method782(254, -171);
		Static94.aClass37_29.method1459();
		local83.method782(-180, -171);
		local83 = Static105.method1723(arg2, Static57.aClass64_815, Static34.aClass64_501);
		Static62.aClass37_23.method1459();
		local83.method778(254 - local83.anInt1019 / 2, 18);
		Static92.aClass1_Sub1_Sub5_Sub3_16 = Static38.method682(Static46.aClass64_713, arg2, Static34.aClass64_501);
		Static20.aClass1_Sub1_Sub5_Sub3_4 = Static38.method682(Static10.aClass64_286, arg2, Static34.aClass64_501);
		Static15.aClass1_Sub1_Sub5_Sub3Array1 = Static86.method1416(Static34.aClass64_501, Static92.aClass64_1312, arg2);
		Static64.aClass1_Sub1_Sub5_Sub2_4 = new Class1_Sub1_Sub5_Sub2(128, 265);
		Static15.aClass1_Sub1_Sub5_Sub2_1 = new Class1_Sub1_Sub5_Sub2(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static64.aClass1_Sub1_Sub5_Sub2_4.anIntArray150[local156] = Static61.aClass37_21.anIntArray304[local156];
		}
		for (local184 = 0; local184 < 33920; local184++) {
			Static15.aClass1_Sub1_Sub5_Sub2_1.anIntArray150[local184] = Static105.aClass37_35.anIntArray304[local184];
		}
		Static34.anIntArray120 = new int[256];
		for (@Pc(361) int local361 = 0; local361 < 64; local361++) {
			Static34.anIntArray120[local361] = local361 * 262144;
		}
		for (@Pc(375) int local375 = 0; local375 < 64; local375++) {
			Static34.anIntArray120[local375 + 64] = local375 * 1024 + 16711680;
		}
		for (@Pc(395) int local395 = 0; local395 < 64; local395++) {
			Static34.anIntArray120[local395 + 128] = local395 * 4 + 16776960;
		}
		for (@Pc(413) int local413 = 0; local413 < 64; local413++) {
			Static34.anIntArray120[local413 + 192] = 16777215;
		}
		Static102.anIntArray342 = new int[256];
		for (@Pc(432) int local432 = 0; local432 < 64; local432++) {
			Static102.anIntArray342[local432] = local432 * 1024;
		}
		for (@Pc(448) int local448 = 0; local448 < 64; local448++) {
			Static102.anIntArray342[local448 + 64] = local448 * 4 + 65280;
		}
		for (@Pc(468) int local468 = 0; local468 < 64; local468++) {
			Static102.anIntArray342[local468 + 128] = local468 * 262144 + 65535;
		}
		for (@Pc(487) int local487 = 0; local487 < 64; local487++) {
			Static102.anIntArray342[local487 + 192] = 16777215;
		}
		Static49.anIntArray162 = new int[256];
		for (@Pc(504) int local504 = 0; local504 < 64; local504++) {
			Static49.anIntArray162[local504] = local504 * 4;
		}
		for (@Pc(523) int local523 = 0; local523 < 64; local523++) {
			Static49.anIntArray162[local523 + 64] = local523 * 262144 + 255;
		}
		for (@Pc(544) int local544 = 0; local544 < 64; local544++) {
			Static49.anIntArray162[local544 + 128] = local544 * 1024 + 16711935;
		}
		for (@Pc(562) int local562 = 0; local562 < 64; local562++) {
			Static49.anIntArray162[local562 + 192] = 16777215;
		}
		Static51.anIntArray166 = new int[32768];
		Static52.anIntArray448 = new int[256];
		Static6.anIntArray47 = new int[32768];
		Static38.method685(null);
		Static40.anInt919 = 0;
		Static64.anIntArray228 = new int[32768];
		Static34.aClass64_502 = Static34.aClass64_501;
		Static52.anIntArray449 = new int[32768];
		Static34.aClass64_496 = Static34.aClass64_501;
		if (Static31.anInt803 == 0 || Static52.aBoolean169) {
			Static65.method1107();
		} else {
			Static65.method1104(Static114.aClass41_Sub1_21, Static31.anInt803, Static109.aClass64_1643, Static34.aClass64_501);
		}
		Static69.method1140(false);
		Static27.aBoolean59 = true;
		Static61.aBoolean81 = true;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZB)V")
	public static void method286(@OriginalArg(0) boolean arg0) {
		@Pc(3) int local3 = Static6.anInt319;
		if (Static52.anInt2832 == Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2375 >> 7 && Static70.anInt1578 == Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2412 >> 7) {
			Static52.anInt2832 = 0;
		}
		if (arg0) {
			local3 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local3; local31++) {
			@Pc(41) Class1_Sub1_Sub2_Sub1_Sub2 local41;
			@Pc(47) int local47;
			if (arg0) {
				local41 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1;
				local47 = 33538048;
			} else {
				local41 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local31]];
				local47 = Static90.anIntArray69[local31] << 14;
			}
			if (local41 != null && local41.method1685()) {
				local41.aBoolean148 = false;
				@Pc(67) int local67 = local41.anInt2375 >> 7;
				if ((Static52.aBoolean169 && Static6.anInt319 > 50 || Static6.anInt319 > 200) && !arg0 && local41.anInt2396 == local41.anInt2361) {
					local41.aBoolean148 = true;
				}
				@Pc(96) int local96 = local41.anInt2412 >> 7;
				if (local67 >= 0 && local67 < 104 && local96 >= 0 && local96 < 104) {
					if (local41.aClass1_Sub1_Sub2_Sub7_1 == null || local41.anInt2434 > Static15.anInt471 || local41.anInt2437 <= Static15.anInt471) {
						if ((local41.anInt2375 & 0x7F) == 64 && (local41.anInt2412 & 0x7F) == 64) {
							if (Static41.anIntArrayArray33[local67][local96] == Static89.anInt2034) {
								continue;
							}
							Static41.anIntArrayArray33[local67][local96] = Static89.anInt2034;
						}
						local41.anInt2426 = Static114.method1996(Static15.anInt463, local41.anInt2375, local41.anInt2412);
						Static82.aClass68_1.method1765(Static15.anInt463, local41.anInt2375, local41.anInt2412, local41.anInt2426, 60, local41, local41.anInt2363, local47, local41.aBoolean146);
					} else {
						local41.aBoolean148 = false;
						local41.anInt2426 = Static114.method1996(Static15.anInt463, local41.anInt2375, local41.anInt2412);
						Static82.aClass68_1.method1748(Static15.anInt463, local41.anInt2375, local41.anInt2412, local41.anInt2426, local41, local41.anInt2363, local47, local41.anInt2419, local41.anInt2416, local41.anInt2415, local41.anInt2425);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 method287() {
		@Pc(20) Class1_Sub1_Sub5_Sub1 local20 = new Class1_Sub1_Sub5_Sub1(Static98.anIntArray327, Static91.anIntArray303, Static116.anIntArray441, Static25.anIntArray437, Static116.aByteArrayArray8);
		Static27.method675();
		return local20;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!ua;Lclient!nc;IIIB)V")
	public static void method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class68 arg3, @OriginalArg(4) Class52 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static52.aBoolean169 && (Static18.aByteArrayArrayArray2[0][arg7][arg0] & 0x2) == 0) {
			if ((Static18.aByteArrayArrayArray2[arg2][arg7][arg0] & 0x10) != 0) {
				return;
			}
			if (Static86.method1413(arg7, arg2, arg0) != Static5.anInt125) {
				return;
			}
		}
		if (arg2 < Static17.anInt569) {
			Static17.anInt569 = arg2;
		}
		@Pc(64) int local64 = Static102.anIntArrayArrayArray5[arg2][arg7 + 1][arg0 + 1];
		@Pc(72) int local72 = Static102.anIntArrayArrayArray5[arg2][arg7][arg0];
		@Pc(82) int local82 = Static102.anIntArrayArrayArray5[arg2][arg7 + 1][arg0];
		@Pc(92) int local92 = Static102.anIntArrayArrayArray5[arg2][arg7][arg0 + 1];
		@Pc(102) int local102 = local92 + local64 + local82 + local72 >> 2;
		@Pc(108) Class1_Sub1_Sub3 local108 = Static108.method1807(arg6);
		@Pc(121) int local121 = (arg6 << 14) + arg7 + (arg0 << 7) + 1073741824;
		if (local108.anInt401 == 0) {
			local121 += Integer.MIN_VALUE;
		}
		@Pc(138) int local138 = (arg5 << 6) + arg1;
		if (local108.anInt395 == 1) {
			local138 += 256;
		}
		if (local108.method253()) {
			Static22.method429(arg0, arg5, arg2, arg7, local108);
		}
		@Pc(191) Class1_Sub1_Sub2 local191;
		if (arg1 != 22) {
			@Pc(285) int local285;
			if (arg1 == 10 || arg1 == 11) {
				if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
					local191 = local108.method252(arg5, local82, local64, local92, local72, 10);
				} else {
					local191 = new Class1_Sub1_Sub2_Sub5(arg6, 10, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
				}
				if (local191 != null) {
					@Pc(288) int local288;
					if (arg5 == 1 || arg5 == 3) {
						local285 = local108.anInt411;
						local288 = local108.anInt420;
					} else {
						local288 = local108.anInt411;
						local285 = local108.anInt420;
					}
					@Pc(298) int local298 = 0;
					if (arg1 == 11) {
						local298 += 256;
					}
					if (arg3.method1754(arg2, arg7, arg0, local102, local285, local288, local191, local298, local121, local138) && local108.aBoolean24) {
						@Pc(320) int local320 = 15;
						if (local191 instanceof Class1_Sub1_Sub2_Sub7) {
							local320 = ((Class1_Sub1_Sub2_Sub7) local191).method1930() / 4;
							if (local320 > 30) {
								local320 = 30;
							}
						}
						for (@Pc(338) int local338 = 0; local338 <= local285; local338++) {
							for (@Pc(342) int local342 = 0; local342 <= local288; local342++) {
								if (local320 > Static110.aByteArrayArrayArray7[arg2][arg7 + local338][arg0 + local342]) {
									Static110.aByteArrayArrayArray7[arg2][local338 + arg7][arg0 + local342] = (byte) local320;
								}
							}
						}
					}
				}
				if (local108.aBoolean25 && arg4 != null) {
					arg4.method1204(local108.anInt411, local108.anInt420, arg7, local108.aBoolean31, arg5, arg0);
				}
			} else if (arg1 >= 12) {
				if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
					local191 = local108.method252(arg5, local82, local64, local92, local72, arg1);
				} else {
					local191 = new Class1_Sub1_Sub2_Sub5(arg6, arg1, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
				}
				arg3.method1754(arg2, arg7, arg0, local102, 1, 1, local191, 0, local121, local138);
				if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
					Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x924;
				}
				if (local108.aBoolean25 && arg4 != null) {
					arg4.method1204(local108.anInt411, local108.anInt420, arg7, local108.aBoolean31, arg5, arg0);
				}
			} else if (arg1 == 0) {
				if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
					local191 = local108.method252(arg5, local82, local64, local92, local72, 0);
				} else {
					local191 = new Class1_Sub1_Sub2_Sub5(arg6, 0, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
				}
				arg3.method1780(arg2, arg7, arg0, local102, local191, null, Static37.anIntArray135[arg5], 0, local121, local138);
				if (arg5 == 0) {
					if (local108.aBoolean24) {
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0] = 50;
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0 + 1] = 50;
					}
					if (local108.aBoolean30) {
						Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local108.aBoolean24) {
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0 + 1] = 50;
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0 + 1] = 50;
					}
					if (local108.aBoolean30) {
						Static5.anIntArrayArrayArray4[arg2][arg7][arg0 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local108.aBoolean24) {
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0] = 50;
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0 + 1] = 50;
					}
					if (local108.aBoolean30) {
						Static5.anIntArrayArrayArray4[arg2][arg7 + 1][arg0] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local108.aBoolean24) {
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0] = 50;
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0] = 50;
					}
					if (local108.aBoolean30) {
						Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x492;
					}
				}
				if (local108.aBoolean25 && arg4 != null) {
					arg4.method1196(arg0, arg7, local108.aBoolean31, arg1, arg5);
				}
				if (local108.anInt405 != 16) {
					arg3.method1793(arg2, arg7, arg0, local108.anInt405);
				}
			} else if (arg1 == 1) {
				if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
					local191 = local108.method252(arg5, local82, local64, local92, local72, 1);
				} else {
					local191 = new Class1_Sub1_Sub2_Sub5(arg6, 1, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
				}
				arg3.method1780(arg2, arg7, arg0, local102, local191, null, Static102.anIntArray341[arg5], 0, local121, local138);
				if (local108.aBoolean24) {
					if (arg5 == 0) {
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0 + 1] = 50;
					} else if (arg5 == 1) {
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0 + 1] = 50;
					} else if (arg5 == 2) {
						Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0] = 50;
					} else if (arg5 == 3) {
						Static110.aByteArrayArrayArray7[arg2][arg7][arg0] = 50;
					}
				}
				if (local108.aBoolean25 && arg4 != null) {
					arg4.method1196(arg0, arg7, local108.aBoolean31, arg1, arg5);
				}
			} else {
				@Pc(928) int local928;
				@Pc(967) Class1_Sub1_Sub2 local967;
				if (arg1 == 2) {
					local928 = arg5 + 1 & 0x3;
					@Pc(952) Class1_Sub1_Sub2 local952;
					if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
						local952 = local108.method252(arg5 + 4, local82, local64, local92, local72, 2);
						local967 = local108.method252(local928, local82, local64, local92, local72, 2);
					} else {
						local952 = new Class1_Sub1_Sub2_Sub5(arg6, 2, arg5 + 4, local72, local82, local64, local92, local108.anInt382, true, null);
						local967 = new Class1_Sub1_Sub2_Sub5(arg6, 2, local928, local72, local82, local64, local92, local108.anInt382, true, null);
					}
					arg3.method1780(arg2, arg7, arg0, local102, local952, local967, Static37.anIntArray135[arg5], Static37.anIntArray135[local928], local121, local138);
					if (local108.aBoolean30) {
						if (arg5 == 0) {
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x249;
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0 + 1] |= 0x492;
							Static5.anIntArrayArrayArray4[arg2][arg7 + 1][arg0] |= 0x249;
						} else if (arg5 == 2) {
							Static5.anIntArrayArrayArray4[arg2][arg7 + 1][arg0] |= 0x249;
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x492;
						} else if (arg5 == 3) {
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x492;
							Static5.anIntArrayArrayArray4[arg2][arg7][arg0] |= 0x249;
						}
					}
					if (local108.aBoolean25 && arg4 != null) {
						arg4.method1196(arg0, arg7, local108.aBoolean31, arg1, arg5);
					}
					if (local108.anInt405 != 16) {
						arg3.method1793(arg2, arg7, arg0, local108.anInt405);
					}
				} else if (arg1 == 3) {
					if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
						local191 = local108.method252(arg5, local82, local64, local92, local72, 3);
					} else {
						local191 = new Class1_Sub1_Sub2_Sub5(arg6, 3, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
					}
					arg3.method1780(arg2, arg7, arg0, local102, local191, null, Static102.anIntArray341[arg5], 0, local121, local138);
					if (local108.aBoolean24) {
						if (arg5 == 0) {
							Static110.aByteArrayArrayArray7[arg2][arg7][arg0 + 1] = 50;
						} else if (arg5 == 1) {
							Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0 + 1] = 50;
						} else if (arg5 == 2) {
							Static110.aByteArrayArrayArray7[arg2][arg7 + 1][arg0] = 50;
						} else if (arg5 == 3) {
							Static110.aByteArrayArrayArray7[arg2][arg7][arg0] = 50;
						}
					}
					if (local108.aBoolean25 && arg4 != null) {
						arg4.method1196(arg0, arg7, local108.aBoolean31, arg1, arg5);
					}
				} else if (arg1 == 9) {
					if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
						local191 = local108.method252(arg5, local82, local64, local92, local72, arg1);
					} else {
						local191 = new Class1_Sub1_Sub2_Sub5(arg6, arg1, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
					}
					arg3.method1754(arg2, arg7, arg0, local102, 1, 1, local191, 0, local121, local138);
					if (local108.aBoolean25 && arg4 != null) {
						arg4.method1204(local108.anInt411, local108.anInt420, arg7, local108.aBoolean31, arg5, arg0);
					}
				} else {
					if (local108.aBoolean28) {
						if (arg5 == 1) {
							local928 = local92;
							local92 = local64;
							local64 = local82;
							local82 = local72;
							local72 = local928;
						} else if (arg5 == 2) {
							local928 = local92;
							local92 = local82;
							local82 = local928;
							local928 = local64;
							local64 = local72;
							local72 = local928;
						} else if (arg5 == 3) {
							local928 = local92;
							local92 = local72;
							local72 = local82;
							local82 = local64;
							local64 = local928;
						}
					}
					if (arg1 == 4) {
						if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
							local191 = local108.method252(0, local82, local64, local92, local72, 4);
						} else {
							local191 = new Class1_Sub1_Sub2_Sub5(arg6, 4, 0, local72, local82, local64, local92, local108.anInt382, true, null);
						}
						arg3.method1744(arg2, arg7, arg0, local102, local191, Static37.anIntArray135[arg5], arg5 * 512, 0, 0, local121, local138);
					} else if (arg1 == 5) {
						local285 = arg3.method1785(arg2, arg7, arg0);
						local928 = 16;
						if (local285 != 0) {
							local928 = Static108.method1807(local285 >> 14 & 0x7FFF).anInt405;
						}
						if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
							local967 = local108.method252(0, local82, local64, local92, local72, 4);
						} else {
							local967 = new Class1_Sub1_Sub2_Sub5(arg6, 4, 0, local72, local82, local64, local92, local108.anInt382, true, null);
						}
						arg3.method1744(arg2, arg7, arg0, local102, local967, Static37.anIntArray135[arg5], arg5 * 512, local928 * Static5.anIntArray20[arg5], Static26.anIntArray107[arg5] * local928, local121, local138);
					} else if (arg1 == 6) {
						if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
							local191 = local108.method252(0, local82, local64, local92, local72, 4);
						} else {
							local191 = new Class1_Sub1_Sub2_Sub5(arg6, 4, 0, local72, local82, local64, local92, local108.anInt382, true, null);
						}
						arg3.method1744(arg2, arg7, arg0, local102, local191, 256, arg5, 0, 0, local121, local138);
					} else if (arg1 == 7) {
						if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
							local191 = local108.method252(0, local82, local64, local92, local72, 4);
						} else {
							local191 = new Class1_Sub1_Sub2_Sub5(arg6, 4, 0, local72, local82, local64, local92, local108.anInt382, true, null);
						}
						arg3.method1744(arg2, arg7, arg0, local102, local191, 512, arg5, 0, 0, local121, local138);
					} else if (arg1 == 8) {
						if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
							local191 = local108.method252(0, local82, local64, local92, local72, 4);
						} else {
							local191 = new Class1_Sub1_Sub2_Sub5(arg6, 4, 0, local72, local82, local64, local92, local108.anInt382, true, null);
						}
						arg3.method1744(arg2, arg7, arg0, local102, local191, 768, arg5, 0, 0, local121, local138);
					}
				}
			}
		} else if (!Static52.aBoolean169 || local108.anInt401 != 0 || local108.aBoolean29) {
			if (local108.anInt382 == -1 && local108.anIntArray61 == null) {
				local191 = local108.method252(arg5, local82, local64, local92, local72, 22);
			} else {
				local191 = new Class1_Sub1_Sub2_Sub5(arg6, 22, arg5, local72, local82, local64, local92, local108.anInt382, true, null);
			}
			arg3.method1772(arg2, arg7, arg0, local102, local191, local121, local138);
			if (local108.aBoolean25 && local108.anInt401 == 1 && arg4 != null) {
				arg4.method1200(arg7, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method289() {
		aClass64_307 = null;
		aClass64_306 = null;
		anIntArray66 = null;
		anIntArray65 = null;
		aClass64_305 = null;
		aClass64_303 = null;
		aClass64_304 = null;
		aClass64_308 = null;
	}
}
