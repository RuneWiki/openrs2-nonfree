import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	public static int anInt1994;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "Lclient!ae;")
	private static Class5 aClass5_918 = Static56.method972("wave2:");

	@OriginalMember(owner = "client!od", name = "S", descriptor = "Lclient!ae;")
	public static Class5 aClass5_919 = aClass5_918;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Lclient!ae;")
	public static Class5 aClass5_920 = Static56.method972("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!od", name = "W", descriptor = "Lclient!ae;")
	public static Class5 aClass5_921 = Static56.method972("Menge eingeben:");

	@OriginalMember(owner = "client!od", name = "X", descriptor = "Lclient!bd;")
	public static Class9 aClass9_20 = new Class9(64);

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "[Lclient!h;")
	public static Class30[] aClass30Array1 = new Class30[4];

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_922 = Static56.method972("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!bb;ILclient!bb;)V")
	public static void method1292(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub1 arg1) {
		Static110.aClass2_24.method1318();
		if (Static47.anInt1308 == 0 || Static47.anInt1308 == 5) {
			arg1.method259(Static67.aClass5_823, 180, 54, 16777215);
			Static66.method1842(28, 62, 304, 34, 9179409);
			Static66.method1842(29, 63, 302, 32, 0);
			Static66.method1839(30, 64, Static69.anInt1825 * 3, 30, 9179409);
			Static66.method1839(Static69.anInt1825 * 3 + 30, 64, 300 - Static69.anInt1825 * 3, 30, 0);
			arg1.method259(Static88.aClass5_1025, 180, 85, 16777215);
		}
		@Pc(90) byte local90;
		@Pc(98) int local98;
		if (Static47.anInt1308 == 20) {
			Static93.aClass3_Sub1_Sub2_Sub4_12.method1857(0, 0);
			local90 = 40;
			arg1.method266(Static88.aClass5_1024, 180, 40, 16776960, true);
			local98 = local90 + 15;
			arg1.method266(Static88.aClass5_1014, 180, 55, 16776960, true);
			@Pc(106) int local106 = local98 + 15;
			arg1.method266(Static88.aClass5_1017, 180, 70, 16776960, true);
			@Pc(114) int local114 = local106 + 15;
			@Pc(115) int local115 = local114 + 10;
			arg1.method265(Static75.method1261(new Class5[] { Static18.aClass5_284, Static88.aClass5_1015 }), 90, 95, 16777215, true);
			@Pc(134) int local134 = local115 + 15;
			arg1.method265(Static75.method1261(new Class5[] { Static82.aClass5_928, Static88.aClass5_1019.method148() }), 92, 110, 16777215, true);
			@Pc(157) int local157 = local134 + 15;
		}
		if (Static47.anInt1308 == 10) {
			Static93.aClass3_Sub1_Sub2_Sub4_12.method1857(0, 0);
			if (Static11.anInt464 == 0) {
				local90 = 80;
				arg1.method266(Static53.aClass5_697, 180, 80, 16776960, true);
				local98 = local90 + 30;
				Static106.aClass3_Sub1_Sub2_Sub4_16.method1857(27, 100);
				arg1.method255(Static44.aClass5_583, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static106.aClass3_Sub1_Sub2_Sub4_16.method1857(187, 100);
				arg1.method255(Static76.aClass5_1162, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static11.anInt464 == 2) {
				local90 = 40;
				arg1.method266(Static88.aClass5_1024, 180, 40, 16776960, true);
				local98 = local90 + 15;
				arg1.method266(Static88.aClass5_1014, 180, 55, 16776960, true);
				local98 += 15;
				arg1.method266(Static88.aClass5_1017, 180, 70, 16776960, true);
				local98 += 15;
				local98 += 10;
				arg1.method265(Static75.method1261(new Class5[] { Static18.aClass5_284, Static88.aClass5_1015, Static3.anInt289 % 40 < 20 & Static70.anInt1833 == 0 ? Static83.aClass5_941 : Static88.aClass5_1020 }), 90, 95, 16777215, true);
				local98 += 15;
				arg1.method265(Static75.method1261(new Class5[] { Static82.aClass5_928, Static88.aClass5_1019.method148(), Static70.anInt1833 == 1 & Static3.anInt289 % 40 < 20 ? Static83.aClass5_941 : Static88.aClass5_1020 }), 92, 110, 16777215, true);
				local98 += 15;
				Static106.aClass3_Sub1_Sub2_Sub4_16.method1857(27, 130);
				arg1.method266(Static76.aClass5_1161, 100, 155, 16777215, true);
				Static106.aClass3_Sub1_Sub2_Sub4_16.method1857(187, 130);
				arg1.method266(Static57.aClass5_769, 260, 155, 16777215, true);
			} else if (Static11.anInt464 == 3) {
				local90 = 65;
				arg1.method266(Static75.aClass5_891, 180, 40, 16776960, true);
				arg1.method266(Static111.aClass5_1313, 180, 65, 16777215, true);
				local98 = local90 + 15;
				arg1.method266(Static5.aClass5_116, 180, 80, 16777215, true);
				local98 += 15;
				arg1.method266(Static15.aClass5_219, 180, 95, 16777215, true);
				local98 += 15;
				arg1.method266(Static47.aClass5_620, 180, 110, 16777215, true);
				Static106.aClass3_Sub1_Sub2_Sub4_16.method1857(107, 130);
				local98 += 15;
				arg1.method266(Static57.aClass5_769, 180, 155, 16777215, true);
			}
		}
		Static7.method201();
		try {
			@Pc(466) Graphics local466 = Static62.aCanvas1.getGraphics();
			Static110.aClass2_24.method1322(local466, 202, 171);
			Static47.aClass2_9.method1322(local466, 0, 0);
			Static113.aClass2_26.method1322(local466, 637, 0);
			if (Static27.aBoolean42) {
				Static27.aBoolean42 = false;
				Static37.aClass2_6.method1322(local466, 128, 0);
				Static102.aClass2_22.method1322(local466, 202, 371);
				Static16.aClass2_3.method1322(local466, 0, 265);
				Static57.aClass2_13.method1322(local466, 562, 265);
				Static15.aClass2_2.method1322(local466, 128, 171);
				Static48.aClass2_10.method1322(local466, 562, 171);
			}
		} catch (@Pc(546) Exception local546) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method1294() {
		aClass5_921 = null;
		aClass30Array1 = null;
		aClass5_919 = null;
		aClass5_922 = null;
		aClass5_920 = null;
		aClass5_918 = null;
		aClass9_20 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!h;IIIIIILclient!l;II)V")
	public static void method1295(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class42 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static111.anIntArrayArrayArray7[arg4][arg1][arg8];
		@Pc(23) int local23 = Static111.anIntArrayArrayArray7[arg4][arg1 + 1][arg8];
		@Pc(35) int local35 = Static111.anIntArrayArrayArray7[arg4][arg1 + 1][arg8 + 1];
		@Pc(45) int local45 = Static111.anIntArrayArrayArray7[arg4][arg1][arg8 + 1];
		@Pc(55) int local55 = local45 + local35 + local23 + local9 >> 2;
		@Pc(59) Class3_Sub1_Sub15 local59 = Static72.method1211(arg5);
		@Pc(80) int local80 = (arg5 << 14) + (arg8 << 7) + arg1 + 1073741824;
		@Pc(87) int local87 = (arg2 << 6) + arg6;
		if (local59.anInt2339 == 1) {
			local87 += 256;
		}
		if (local59.anInt2324 == 0) {
			local80 += Integer.MIN_VALUE;
		}
		@Pc(124) Class3_Sub1_Sub1 local124;
		if (arg6 == 22) {
			if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
				local124 = local59.method1531(22, local9, arg2, local45, local35, local23);
			} else {
				local124 = new Class3_Sub1_Sub1_Sub3(arg5, 22, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
			}
			arg7.method1037(arg3, arg1, arg8, local55, local124, local80, local87);
			if (local59.aBoolean112 && local59.anInt2324 == 1) {
				arg0.method709(arg8, arg1);
			}
			return;
		}
		@Pc(222) int local222;
		if (arg6 == 10 || arg6 == 11) {
			if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
				local124 = local59.method1531(10, local9, arg2, local45, local35, local23);
			} else {
				local124 = new Class3_Sub1_Sub1_Sub3(arg5, 10, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
			}
			if (local124 != null) {
				@Pc(225) int local225;
				if (arg2 == 1 || arg2 == 3) {
					local222 = local59.anInt2331;
					local225 = local59.anInt2312;
				} else {
					local225 = local59.anInt2331;
					local222 = local59.anInt2312;
				}
				@Pc(235) int local235 = 0;
				if (arg6 == 11) {
					local235 += 256;
				}
				arg7.method1039(arg3, arg1, arg8, local55, local222, local225, local124, local235, local80, local87);
			}
			if (local59.aBoolean112) {
				arg0.method707(local59.aBoolean114, arg1, local59.anInt2312, arg8, local59.anInt2331, arg2);
			}
		} else if (arg6 >= 12) {
			if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
				local124 = local59.method1531(arg6, local9, arg2, local45, local35, local23);
			} else {
				local124 = new Class3_Sub1_Sub1_Sub3(arg5, arg6, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
			}
			arg7.method1039(arg3, arg1, arg8, local55, 1, 1, local124, 0, local80, local87);
			if (local59.aBoolean112) {
				arg0.method707(local59.aBoolean114, arg1, local59.anInt2312, arg8, local59.anInt2331, arg2);
			}
		} else if (arg6 == 0) {
			if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
				local124 = local59.method1531(0, local9, arg2, local45, local35, local23);
			} else {
				local124 = new Class3_Sub1_Sub1_Sub3(arg5, 0, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
			}
			arg7.method1061(arg3, arg1, arg8, local55, local124, null, Static102.anIntArray302[arg2], 0, local80, local87);
			if (local59.aBoolean112) {
				arg0.method705(arg1, local59.aBoolean114, arg8, arg2, arg6);
			}
		} else if (arg6 == 1) {
			if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
				local124 = local59.method1531(1, local9, arg2, local45, local35, local23);
			} else {
				local124 = new Class3_Sub1_Sub1_Sub3(arg5, 1, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
			}
			arg7.method1061(arg3, arg1, arg8, local55, local124, null, Static31.anIntArray134[arg2], 0, local80, local87);
			if (local59.aBoolean112) {
				arg0.method705(arg1, local59.aBoolean114, arg8, arg2, arg6);
			}
		} else {
			@Pc(476) int local476;
			@Pc(507) Class3_Sub1_Sub1 local507;
			if (arg6 == 2) {
				local476 = arg2 + 1 & 0x3;
				@Pc(497) Class3_Sub1_Sub1 local497;
				if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
					local497 = local59.method1531(2, local9, arg2 + 4, local45, local35, local23);
					local507 = local59.method1531(2, local9, local476, local45, local35, local23);
				} else {
					local497 = new Class3_Sub1_Sub1_Sub3(arg5, 2, arg2 + 4, local9, local23, local35, local45, local59.anInt2323, true, null);
					local507 = new Class3_Sub1_Sub1_Sub3(arg5, 2, local476, local9, local23, local35, local45, local59.anInt2323, true, null);
				}
				arg7.method1061(arg3, arg1, arg8, local55, local497, local507, Static102.anIntArray302[arg2], Static102.anIntArray302[local476], local80, local87);
				if (local59.aBoolean112) {
					arg0.method705(arg1, local59.aBoolean114, arg8, arg2, arg6);
				}
			} else if (arg6 == 3) {
				if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
					local124 = local59.method1531(3, local9, arg2, local45, local35, local23);
				} else {
					local124 = new Class3_Sub1_Sub1_Sub3(arg5, 3, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
				}
				arg7.method1061(arg3, arg1, arg8, local55, local124, null, Static31.anIntArray134[arg2], 0, local80, local87);
				if (local59.aBoolean112) {
					arg0.method705(arg1, local59.aBoolean114, arg8, arg2, arg6);
				}
			} else if (arg6 == 9) {
				if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
					local124 = local59.method1531(arg6, local9, arg2, local45, local35, local23);
				} else {
					local124 = new Class3_Sub1_Sub1_Sub3(arg5, arg6, arg2, local9, local23, local35, local45, local59.anInt2323, true, null);
				}
				arg7.method1039(arg3, arg1, arg8, local55, 1, 1, local124, 0, local80, local87);
				if (local59.aBoolean112) {
					arg0.method707(local59.aBoolean114, arg1, local59.anInt2312, arg8, local59.anInt2331, arg2);
				}
			} else {
				if (local59.aBoolean116) {
					if (arg2 == 1) {
						local476 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local9;
						local9 = local476;
					} else if (arg2 == 2) {
						local476 = local45;
						local45 = local23;
						local23 = local476;
						local476 = local35;
						local35 = local9;
						local9 = local476;
					} else if (arg2 == 3) {
						local476 = local45;
						local45 = local9;
						local9 = local23;
						local23 = local35;
						local35 = local476;
					}
				}
				if (arg6 == 4) {
					if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
						local124 = local59.method1531(4, local9, 0, local45, local35, local23);
					} else {
						local124 = new Class3_Sub1_Sub1_Sub3(arg5, 4, 0, local9, local23, local35, local45, local59.anInt2323, true, null);
					}
					arg7.method1021(arg3, arg1, arg8, local55, local124, Static102.anIntArray302[arg2], arg2 * 512, 0, 0, local80, local87);
				} else if (arg6 == 5) {
					local222 = arg7.method1035(arg3, arg1, arg8);
					local476 = 16;
					if (local222 > 0) {
						local476 = Static72.method1211(local222 >> 14 & 0x7FFF).anInt2322;
					}
					if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
						local507 = local59.method1531(4, local9, 0, local45, local35, local23);
					} else {
						local507 = new Class3_Sub1_Sub1_Sub3(arg5, 4, 0, local9, local23, local35, local45, local59.anInt2323, true, null);
					}
					arg7.method1021(arg3, arg1, arg8, local55, local507, Static102.anIntArray302[arg2], arg2 * 512, Static92.anIntArray269[arg2] * local476, Static91.anIntArray266[arg2] * local476, local80, local87);
				} else if (arg6 == 6) {
					if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
						local124 = local59.method1531(4, local9, 0, local45, local35, local23);
					} else {
						local124 = new Class3_Sub1_Sub1_Sub3(arg5, 4, 0, local9, local23, local35, local45, local59.anInt2323, true, null);
					}
					arg7.method1021(arg3, arg1, arg8, local55, local124, 256, arg2, 0, 0, local80, local87);
				} else if (arg6 == 7) {
					if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
						local124 = local59.method1531(4, local9, 0, local45, local35, local23);
					} else {
						local124 = new Class3_Sub1_Sub1_Sub3(arg5, 4, 0, local9, local23, local35, local45, local59.anInt2323, true, null);
					}
					arg7.method1021(arg3, arg1, arg8, local55, local124, 512, arg2, 0, 0, local80, local87);
				} else if (arg6 == 8) {
					if (local59.anInt2323 == -1 && local59.anIntArray263 == null) {
						local124 = local59.method1531(4, local9, 0, local45, local35, local23);
					} else {
						local124 = new Class3_Sub1_Sub1_Sub3(arg5, 4, 0, local9, local23, local35, local45, local59.anInt2323, true, null);
					}
					arg7.method1021(arg3, arg1, arg8, local55, local124, 768, arg2, 0, 0, local80, local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!bf;Lclient!ae;Lclient!ae;)[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] method1296(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(16) int local16 = arg0.method1880(arg2);
		@Pc(22) int local22 = arg0.method1860(local16, arg1);
		return Static83.method1327(local16, local22, arg0);
	}
}
