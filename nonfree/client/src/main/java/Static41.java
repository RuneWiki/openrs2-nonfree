import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_27;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_650 = Static33.method650("wishes to trade with you)3");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_651 = aClass56_650;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_652 = Static33.method650(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "[I")
	public static int[] anIntArray74 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!ab;")
	public static Class2 aClass2_1 = new Class2(512);

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_653 = Static33.method650("@red@");

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_654 = Static33.method650("@cr1@");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!b;IIIII)V")
	public static void method765(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22;
		if (arg0 < 0 || arg0 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local22 = arg1.method270();
				if (local22 == 0) {
					break;
				}
				if (local22 == 1) {
					arg1.method270();
					break;
				}
				if (local22 <= 49) {
					arg1.method270();
				}
			}
			return;
		}
		Static66.aByteArrayArrayArray3[arg2][arg0][arg5] = 0;
		while (true) {
			local22 = arg1.method270();
			if (local22 == 0) {
				if (arg2 == 0) {
					Static22.anIntArrayArrayArray4[0][arg0][arg5] = -Static99.method616(arg6 + arg5 + 556238, arg0 + 932731 + arg4) * 8;
				} else {
					Static22.anIntArrayArrayArray4[arg2][arg0][arg5] = Static22.anIntArrayArrayArray4[arg2 - 1][arg0][arg5] - 240;
				}
				break;
			}
			if (local22 == 1) {
				@Pc(119) int local119 = arg1.method270();
				if (local119 == 1) {
					local119 = 0;
				}
				if (arg2 == 0) {
					Static22.anIntArrayArrayArray4[0][arg0][arg5] = -local119 * 8;
				} else {
					Static22.anIntArrayArrayArray4[arg2][arg0][arg5] = Static22.anIntArrayArrayArray4[arg2 - 1][arg0][arg5] - local119 * 8;
				}
				break;
			}
			if (local22 <= 49) {
				Static18.aByteArrayArrayArray1[arg2][arg0][arg5] = arg1.method265();
				Static116.aByteArrayArrayArray7[arg2][arg0][arg5] = (byte) ((local22 - 2) / 4);
				Static43.aByteArrayArrayArray5[arg2][arg0][arg5] = (byte) (arg3 + local22 - 2 & 0x3);
			} else if (local22 <= 81) {
				Static66.aByteArrayArrayArray3[arg2][arg0][arg5] = (byte) (local22 - 49);
			} else {
				Static43.aByteArrayArrayArray6[arg2][arg0][arg5] = (byte) (local22 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method766() {
		Static43.aByteArrayArrayArray6 = null;
		Static43.aByteArrayArrayArray5 = null;
		Static64.anIntArray141 = null;
		Static15.anIntArray29 = null;
		Static38.anIntArray63 = null;
		Static38.anIntArrayArray8 = null;
		Static116.aByteArrayArrayArray7 = null;
		Static18.aByteArrayArrayArray1 = null;
		Static117.aByteArrayArrayArray8 = null;
		Static54.anIntArray109 = null;
		Static106.anIntArray226 = null;
		Static73.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method767() {
		Static18.method349();
		Static106.method1759();
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (Static119.anInt2986 == 2 || Static119.anInt2986 == 5) {
			@Pc(27) byte[] local27 = Static40.aClass3_Sub1_Sub1_Sub4_26.aByteArray30;
			@Pc(29) int[] local29 = Static6.anIntArray189;
			local32 = local27.length;
			for (local34 = 0; local34 < local32; local34++) {
				if (local27[local34] == 0) {
					local29[local34] = 0;
				}
			}
			if (Static119.anInt2986 < 3) {
				Static79.aClass3_Sub1_Sub1_Sub2_4.method957(0, 0, 33, 33, 25, 25, Static22.anInt686, 256, Static50.anIntArray99, Static66.anIntArray32);
			}
			Static47.method875();
			return;
		}
		@Pc(75) int local75 = Static18.anInt493 + Static22.anInt686 & 0x7FF;
		@Pc(83) int local83 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32 + 48;
		local32 = 464 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
		Static53.aClass3_Sub1_Sub1_Sub2_3.method957(25, 5, 146, 151, local83, local32, local75, Static62.anInt1804 + 256, Static65.anIntArray142, Static69.anIntArray160);
		for (local34 = 0; local34 < Static46.anInt2273; local34++) {
			local83 = Static17.anIntArray30[local34] * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
			local32 = Static117.anIntArray297[local34] * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
			Static24.method494(local32, local83, Static52.aClass3_Sub1_Sub1_Sub2Array32[local34]);
		}
		@Pc(152) int local152;
		for (@Pc(148) int local148 = 0; local148 < 104; local148++) {
			for (local152 = 0; local152 < 104; local152++) {
				@Pc(162) Class37 local162 = Static8.aClass37ArrayArrayArray1[Static94.anInt2470][local148][local152];
				if (local162 != null) {
					local32 = local152 * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
					local83 = local148 * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
					Static24.method494(local32, local83, Static93.aClass3_Sub1_Sub1_Sub2Array50[0]);
				}
			}
		}
		for (local152 = 0; local152 < Static109.anInt1678; local152++) {
			@Pc(214) Class3_Sub1_Sub2_Sub4_Sub2 local214 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[Static75.anIntArray176[local152]];
			if (local214 != null && local214.method2033()) {
				@Pc(223) Class3_Sub1_Sub17 local223 = local214.aClass3_Sub1_Sub17_1;
				if (local223 != null && local223.anIntArray290 != null) {
					local223 = local223.method1901();
				}
				if (local223 != null && local223.aBoolean160 && local223.aBoolean159) {
					local83 = local214.anInt3187 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
					local32 = local214.anInt3196 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
					Static24.method494(local32, local83, Static93.aClass3_Sub1_Sub1_Sub2Array50[1]);
				}
			}
		}
		@Pc(318) int local318;
		@Pc(282) Class3_Sub1_Sub2_Sub4_Sub1 local282;
		for (@Pc(274) int local274 = 0; local274 < Static110.anInt2767; local274++) {
			local282 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static54.anIntArray108[local274]];
			if (local282 != null && local282.method2033()) {
				local83 = local282.anInt3187 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
				@Pc(300) boolean local300 = false;
				local32 = local282.anInt3196 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
				@Pc(316) long local316 = local282.aClass56_764.method1445();
				for (local318 = 0; local318 < Static42.anInt1124; local318++) {
					if (local316 == Static3.aLongArray36[local318] && Static86.anIntArray195[local318] != 0) {
						local300 = true;
						break;
					}
				}
				@Pc(340) boolean local340 = false;
				if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1385 != 0 && local282.anInt1385 != 0 && local282.anInt1385 == Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1385) {
					local340 = true;
				}
				if (local300) {
					Static24.method494(local32, local83, Static93.aClass3_Sub1_Sub1_Sub2Array50[3]);
				} else if (local340) {
					Static24.method494(local32, local83, Static93.aClass3_Sub1_Sub1_Sub2Array50[4]);
				} else {
					Static24.method494(local32, local83, Static93.aClass3_Sub1_Sub1_Sub2Array50[2]);
				}
			}
		}
		if (Static86.anInt2355 != 0 && Static98.anInt2566 % 20 < 10) {
			if (Static86.anInt2355 == 1 && Static126.anInt3102 >= 0 && Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1.length > Static126.anInt3102) {
				@Pc(413) Class3_Sub1_Sub2_Sub4_Sub2 local413 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[Static126.anInt3102];
				if (local413 != null) {
					local32 = local413.anInt3196 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
					local83 = local413.anInt3187 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
					Static51.method983(Static70.aClass3_Sub1_Sub1_Sub2Array38[1], local32, local83);
				}
			}
			if (Static86.anInt2355 == 2) {
				local83 = (Static75.anInt2024 - Static18.anInt497) * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
				local32 = (Static68.anInt1869 - Static57.anInt1618) * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
				Static51.method983(Static70.aClass3_Sub1_Sub1_Sub2Array38[1], local32, local83);
			}
			if (Static86.anInt2355 == 10 && Static44.anInt1154 >= 0 && Static44.anInt1154 < Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1.length) {
				local282 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static44.anInt1154];
				if (local282 != null) {
					local83 = local282.anInt3187 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
					local32 = local282.anInt3196 / 32 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
					Static51.method983(Static70.aClass3_Sub1_Sub1_Sub2Array38[1], local32, local83);
				}
			}
		}
		if (Static38.anInt1028 != 0) {
			local83 = Static38.anInt1028 * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 / 32;
			local32 = Static75.anInt2022 * 4 + 2 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 / 32;
			Static24.method494(local32, local83, Static70.aClass3_Sub1_Sub1_Sub2Array38[0]);
		}
		Static6.method1487(97, 78, 3, 3, 16777215);
		if (Static119.anInt2986 < 3) {
			Static79.aClass3_Sub1_Sub1_Sub2_4.method957(0, 0, 33, 33, 25, 25, Static22.anInt686, 256, Static50.anIntArray99, Static66.anIntArray32);
		} else {
			@Pc(591) byte[] local591 = Static40.aClass3_Sub1_Sub1_Sub4_26.aByteArray30;
			@Pc(593) int[] local593 = Static6.anIntArray189;
			for (@Pc(595) int local595 = 0; local595 <= 33; local595++) {
				@Pc(602) int local602 = local595 * Static40.aClass3_Sub1_Sub1_Sub4_26.anInt2250;
				for (local318 = 0; local318 <= 33; local318++) {
					if (local591[local602 + local318] == 0) {
						local593[local318 + local602] = 0;
					}
				}
			}
		}
		Static47.method875();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method768() {
		Static36.anInt1016 = 0;
		@Pc(168) int local168;
		for (@Pc(14) int local14 = -1; local14 < Static110.anInt2767 + Static109.anInt1678; local14++) {
			@Pc(32) Class3_Sub1_Sub2_Sub4 local32;
			if (local14 == -1) {
				local32 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1;
			} else if (Static110.anInt2767 <= local14) {
				local32 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[Static75.anIntArray176[local14 - Static110.anInt2767]];
			} else {
				local32 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static54.anIntArray108[local14]];
			}
			if (local32 != null && local32.method2033()) {
				@Pc(61) Class3_Sub1_Sub17 local61;
				if (local32 instanceof Class3_Sub1_Sub2_Sub4_Sub2) {
					local61 = ((Class3_Sub1_Sub2_Sub4_Sub2) local32).aClass3_Sub1_Sub17_1;
					if (local61.anIntArray290 != null) {
						local61 = local61.method1901();
					}
					if (local61 == null) {
						continue;
					}
				}
				if (Static110.anInt2767 <= local14) {
					local61 = ((Class3_Sub1_Sub2_Sub4_Sub2) local32).aClass3_Sub1_Sub17_1;
					if (local61.anIntArray290 != null) {
						local61 = local61.method1901();
					}
					if (local61.anInt2936 >= 0 && local61.anInt2936 < Static5.aClass3_Sub1_Sub1_Sub2Array4.length) {
						Static35.method667(local32, local32.anInt3181 + 15);
						if (Static94.anInt2473 > -1) {
							Static5.aClass3_Sub1_Sub1_Sub2Array4[local61.anInt2936].method967(Static94.anInt2473 - 12, Static49.anInt1492 + -30);
						}
					}
					if (Static86.anInt2355 == 1 && Static75.anIntArray176[local14 - Static110.anInt2767] == Static126.anInt3102 && Static98.anInt2566 % 20 < 10) {
						Static35.method667(local32, local32.anInt3181 + 15);
						if (Static94.anInt2473 > -1) {
							Static102.aClass3_Sub1_Sub1_Sub2Array65[0].method967(Static94.anInt2473 - 12, Static49.anInt1492 + -28);
						}
					}
				} else {
					local168 = 30;
					@Pc(171) Class3_Sub1_Sub2_Sub4_Sub1 local171 = (Class3_Sub1_Sub2_Sub4_Sub1) local32;
					if (local171.anInt1375 != -1 || local171.anInt1378 != -1) {
						Static35.method667(local32, local32.anInt3181 + 15);
						if (Static94.anInt2473 > -1) {
							if (local171.anInt1375 != -1) {
								Static29.aClass3_Sub1_Sub1_Sub2Array19[local171.anInt1375].method967(Static94.anInt2473 - 12, Static49.anInt1492 + -30);
								local168 += 25;
							}
							if (local171.anInt1378 != -1) {
								Static5.aClass3_Sub1_Sub1_Sub2Array4[local171.anInt1378].method967(Static94.anInt2473 - 12, Static49.anInt1492 - local168);
								local168 += 25;
							}
						}
					}
					if (local14 >= 0 && Static86.anInt2355 == 10 && Static44.anInt1154 == Static54.anIntArray108[local14]) {
						Static35.method667(local32, local32.anInt3181 + 15);
						if (Static94.anInt2473 > -1) {
							Static102.aClass3_Sub1_Sub1_Sub2Array65[1].method967(Static94.anInt2473 - 12, -local168 + Static49.anInt1492);
						}
					}
				}
				if (local32.aClass56_1729 != null && (Static110.anInt2767 <= local14 || Static66.anInt541 == 0 || Static66.anInt541 == 3 || Static66.anInt541 == 1 && Static108.method1824(((Class3_Sub1_Sub2_Sub4_Sub1) local32).aClass56_764))) {
					Static35.method667(local32, local32.anInt3181);
					if (Static94.anInt2473 > -1 && Static36.anInt1016 < Static117.anInt2968) {
						Static117.anIntArray305[Static36.anInt1016] = Static57.aClass3_Sub1_Sub1_Sub1_3.method745(local32.aClass56_1729) / 2;
						Static117.anIntArray301[Static36.anInt1016] = Static57.aClass3_Sub1_Sub1_Sub1_3.anInt1057;
						Static117.anIntArray302[Static36.anInt1016] = Static94.anInt2473;
						Static117.anIntArray295[Static36.anInt1016] = Static49.anInt1492;
						Static117.anIntArray304[Static36.anInt1016] = local32.anInt3155;
						Static117.anIntArray296[Static36.anInt1016] = local32.anInt3177;
						Static117.anIntArray299[Static36.anInt1016] = local32.anInt3150;
						Static117.aClass56Array17[Static36.anInt1016] = local32.aClass56_1729;
						Static36.anInt1016++;
					}
				}
				if (Static98.anInt2566 < local32.anInt3167) {
					Static35.method667(local32, local32.anInt3181 + 15);
					if (Static94.anInt2473 > -1) {
						local168 = local32.anInt3169 * 30 / local32.anInt3148;
						if (local168 > 30) {
							local168 = 30;
						}
						Static6.method1487(Static94.anInt2473 - 15, Static49.anInt1492 + -3, local168, 5, 65280);
						Static6.method1487(Static94.anInt2473 + local168 - 15, Static49.anInt1492 + -3, 30 - local168, 5, 16711680);
					}
				}
				for (local168 = 0; local168 < 4; local168++) {
					if (local32.anIntArray335[local168] > Static98.anInt2566) {
						Static35.method667(local32, local32.anInt3181 / 2);
						if (Static94.anInt2473 > -1) {
							if (local168 == 1) {
								Static49.anInt1492 -= 20;
							}
							if (local168 == 2) {
								Static94.anInt2473 -= 15;
								Static49.anInt1492 -= 10;
							}
							if (local168 == 3) {
								Static94.anInt2473 += 15;
								Static49.anInt1492 -= 10;
							}
							Static4.aClass3_Sub1_Sub1_Sub2Array3[local32.anIntArray334[local168]].method967(Static94.anInt2473 - 12, Static49.anInt1492 + -12);
							Static122.aClass3_Sub1_Sub1_Sub1_5.method735(Static111.method1851(local32.anIntArray333[local168]), Static94.anInt2473, Static49.anInt1492 + 4, 0);
							Static122.aClass3_Sub1_Sub1_Sub1_5.method735(Static111.method1851(local32.anIntArray333[local168]), Static94.anInt2473 - 1, Static49.anInt1492 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(509) int local509 = 0; local509 < Static36.anInt1016; local509++) {
			local168 = Static117.anIntArray302[local509];
			@Pc(519) int local519 = Static117.anIntArray301[local509];
			@Pc(523) int local523 = Static117.anIntArray305[local509];
			@Pc(525) boolean local525 = true;
			@Pc(529) int local529 = Static117.anIntArray295[local509];
			while (local525) {
				local525 = false;
				for (@Pc(535) int local535 = 0; local535 < local509; local535++) {
					if (Static117.anIntArray295[local535] - Static117.anIntArray301[local535] < local529 - -2 && Static117.anIntArray295[local535] + 2 > -local519 + local529 && local168 - local523 < Static117.anIntArray302[local535] + Static117.anIntArray305[local535] && local168 + local523 > -Static117.anIntArray305[local535] + Static117.anIntArray302[local535] && local529 > Static117.anIntArray295[local535] - Static117.anIntArray301[local535]) {
						local529 = Static117.anIntArray295[local535] - Static117.anIntArray301[local535];
						local525 = true;
					}
				}
			}
			Static94.anInt2473 = Static117.anIntArray302[local509];
			Static49.anInt1492 = Static117.anIntArray295[local509] = local529;
			@Pc(634) Class56 local634 = Static117.aClass56Array17[local509];
			if (Static79.anInt2114 == 0) {
				@Pc(641) int local641 = 16776960;
				if (Static117.anIntArray304[local509] < 6) {
					local641 = Static124.anIntArray329[Static117.anIntArray304[local509]];
				}
				if (Static117.anIntArray304[local509] == 6) {
					local641 = Static106.anInt2639 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static117.anIntArray304[local509] == 7) {
					local641 = Static106.anInt2639 % 20 >= 10 ? 65535 : 255;
				}
				if (Static117.anIntArray304[local509] == 8) {
					local641 = Static106.anInt2639 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(716) int local716;
				if (Static117.anIntArray304[local509] == 9) {
					local716 = 150 - Static117.anIntArray299[local509];
					if (local716 < 50) {
						local641 = local716 * 1280 + 16711680;
					} else if (local716 < 100) {
						local641 = 16776960 - (local716 - 50) * 327680;
					} else if (local716 < 150) {
						local641 = local716 * 5 + 65280 - 500;
					}
				}
				if (Static117.anIntArray304[local509] == 10) {
					local716 = 150 - Static117.anIntArray299[local509];
					if (local716 < 50) {
						local641 = local716 * 5 + 16711680;
					} else if (local716 < 100) {
						local641 = 16711935 - (local716 - 50) * 327680;
					} else if (local716 < 150) {
						local641 = (local716 - 100) * 327680 + 255 - (local716 - 100) * 5;
					}
				}
				if (Static117.anIntArray304[local509] == 11) {
					local716 = 150 - Static117.anIntArray299[local509];
					if (local716 < 50) {
						local641 = 16777215 - local716 * 327685;
					} else if (local716 < 100) {
						local641 = local716 * 327685 + 65280 - 16384250;
					} else if (local716 < 150) {
						local641 = 16777215 + 32768000 - local716 * 327680;
					}
				}
				if (Static117.anIntArray296[local509] == 0) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492 + 1, 0);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492, local641);
				}
				if (Static117.anIntArray296[local509] == 1) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method736(local634, Static94.anInt2473, Static49.anInt1492 + 1, 0, Static106.anInt2639);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method736(local634, Static94.anInt2473, Static49.anInt1492, local641, Static106.anInt2639);
				}
				if (Static117.anIntArray296[local509] == 2) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method737(local634, Static94.anInt2473, Static49.anInt1492 + 1, 0, Static106.anInt2639);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method737(local634, Static94.anInt2473, Static49.anInt1492, local641, Static106.anInt2639);
				}
				if (Static117.anIntArray296[local509] == 3) {
					Static57.aClass3_Sub1_Sub1_Sub1_3.method740(local634, Static94.anInt2473, Static49.anInt1492 + 1, 0, Static106.anInt2639, 150 - Static117.anIntArray299[local509]);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method740(local634, Static94.anInt2473, Static49.anInt1492, local641, Static106.anInt2639, 150 - Static117.anIntArray299[local509]);
				}
				@Pc(984) int local984;
				if (Static117.anIntArray296[local509] == 4) {
					local716 = Static57.aClass3_Sub1_Sub1_Sub1_3.method745(local634);
					local984 = (150 - Static117.anIntArray299[local509]) * (local716 + 100) / 150;
					Static6.method1498(Static94.anInt2473 - 50, 0, Static94.anInt2473 + 50, 334);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method738(local634, Static94.anInt2473 + 50 - local984, Static49.anInt1492 + 1, 0);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method738(local634, Static94.anInt2473 + 50 - local984, Static49.anInt1492, local641);
					Static6.method1485();
				}
				if (Static117.anIntArray296[local509] == 5) {
					local716 = 150 - Static117.anIntArray299[local509];
					local984 = 0;
					Static6.method1498(0, Static49.anInt1492 - Static57.aClass3_Sub1_Sub1_Sub1_3.anInt1057 - 1, 512, Static49.anInt1492 + 5);
					if (local716 < 25) {
						local984 = local716 - 25;
					} else if (local716 > 125) {
						local984 = local716 - 125;
					}
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492 + local984 + 1, 0);
					Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492 + local984, local641);
					Static6.method1485();
				}
			} else {
				Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492 + 1, 0);
				Static57.aClass3_Sub1_Sub1_Sub1_3.method735(local634, Static94.anInt2473, Static49.anInt1492, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method769() {
		anIntArray74 = null;
		aClass56_654 = null;
		aClass3_Sub1_Sub1_Sub4_27 = null;
		aClass56_651 = null;
		aClass56_653 = null;
		aClass2_1 = null;
		aClass56_650 = null;
		anIntArray75 = null;
		aClass56_652 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!ed;")
	public static Class3_Sub1_Sub4 method770(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub1_Sub4 local15 = (Class3_Sub1_Sub4) Static59.aClass52_35.method1342((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static109.aClass44_40.method1146(12, arg0);
		local15 = new Class3_Sub1_Sub4();
		if (local25 != null) {
			local15.method596(new Class3_Sub2(local25));
		}
		local15.method592();
		Static59.aClass52_35.method1344(local15, (long) arg0);
		return local15;
	}
}
