import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_600 = Static118.method2249("blaugr-Un:");

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_601 = Static118.method2249("Neuer Benutzer");

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt857 = 0;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_602 = Static118.method2249("weiss:");

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt859 = 0;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "[S")
	public static final short[] aShortArray18 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBII)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static47.anInt1239 = 0;
		@Pc(273) int local273;
		@Pc(201) int local201;
		@Pc(133) int local133;
		for (@Pc(10) int local10 = -1; local10 < Static44.anInt1123 + Static22.anInt659; local10++) {
			@Pc(18) Class6_Sub4 local18;
			if (local10 == -1) {
				local18 = Static201.aClass6_Sub4_Sub1_3;
			} else if (Static44.anInt1123 > local10) {
				local18 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local10]];
			} else {
				local18 = Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local10 - Static44.anInt1123]];
			}
			if (local18 != null && local18.method2996()) {
				@Pc(59) Class1_Sub2_Sub11 local59;
				if (local18 instanceof Class6_Sub4_Sub2) {
					local59 = ((Class6_Sub4_Sub2) local18).aClass1_Sub2_Sub11_1;
					if (local59.anIntArray151 != null) {
						local59 = local59.method1076();
					}
					if (local59 == null) {
						continue;
					}
				}
				if (Static44.anInt1123 <= local10) {
					local59 = ((Class6_Sub4_Sub2) local18).aClass1_Sub2_Sub11_1;
					if (local59.anIntArray151 != null) {
						local59 = local59.method1076();
					}
					if (local59.anInt1591 >= 0 && Static168.aClass1_Sub2_Sub5_Sub3Array8.length > local59.anInt1591) {
						Static114.method2109(local18, local18.method2995() + 15);
						if (Static141.anInt3425 > -1) {
							Static168.aClass1_Sub2_Sub5_Sub3Array8[local59.anInt1591].method1315(Static141.anInt3425 + arg1 - 12, arg3 + (Static93.anInt2335 - 30));
						}
					}
					@Pc(131) Class49[] local131 = Static44.aClass49Array1;
					for (local133 = 0; local133 < local131.length; local133++) {
						@Pc(139) Class49 local139 = local131[local133];
						if (local139 != null && local139.anInt2337 == 1 && Static72.anIntArray197[local10 - Static44.anInt1123] == local139.anInt2327 && Static174.anInt3887 % 20 < 10) {
							Static114.method2109(local18, local18.method2995() + 15);
							if (Static141.anInt3425 > -1) {
								Static136.aClass1_Sub2_Sub5_Sub3Array10[local139.anInt2333].method1315(Static141.anInt3425 + arg1 - 12, Static93.anInt2335 + -28 + arg3);
							}
						}
					}
				} else {
					local201 = 30;
					@Pc(204) Class6_Sub4_Sub1 local204 = (Class6_Sub4_Sub1) local18;
					if (local204.anInt600 != -1 || local204.anInt595 != -1) {
						Static114.method2109(local18, local18.method2995() + 15);
						if (Static141.anInt3425 > -1) {
							if (local204.anInt600 != -1) {
								Static114.aClass1_Sub2_Sub5_Sub3Array5[local204.anInt600].method1315(arg1 + Static141.anInt3425 - 12, Static93.anInt2335 + arg3 + -30);
								local201 += 25;
							}
							if (local204.anInt595 != -1) {
								Static168.aClass1_Sub2_Sub5_Sub3Array8[local204.anInt595].method1315(arg1 + Static141.anInt3425 - 12, -local201 + Static93.anInt2335 + arg3);
								local201 += 25;
							}
						}
					}
					if (local10 >= 0) {
						@Pc(271) Class49[] local271 = Static44.aClass49Array1;
						for (local273 = 0; local273 < local271.length; local273++) {
							@Pc(279) Class49 local279 = local271[local273];
							if (local279 != null && local279.anInt2337 == 10 && local279.anInt2327 == Static138.anIntArray385[local10]) {
								Static114.method2109(local18, local18.method2995() + 15);
								if (Static141.anInt3425 > -1) {
									Static136.aClass1_Sub2_Sub5_Sub3Array10[local279.anInt2333].method1315(Static141.anInt3425 + arg1 - 12, -local201 + arg3 + Static93.anInt2335);
								}
							}
						}
					}
				}
				if (local18.aClass65_2377 != null && (Static44.anInt1123 <= local10 || Static78.anInt1922 == 0 || Static78.anInt1922 == 3 || Static78.anInt1922 == 1 && Static92.method1764(((Class6_Sub4_Sub1) local18).aClass65_479))) {
					Static114.method2109(local18, local18.method2995());
					if (Static141.anInt3425 > -1 && Static199.anInt4288 > Static47.anInt1239) {
						Static199.anIntArray493[Static47.anInt1239] = Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1600(local18.aClass65_2377) / 2;
						Static199.anIntArray497[Static47.anInt1239] = Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.anInt2171;
						Static199.anIntArray492[Static47.anInt1239] = Static141.anInt3425;
						Static199.anIntArray498[Static47.anInt1239] = Static93.anInt2335;
						Static199.anIntArray496[Static47.anInt1239] = local18.anInt3940;
						Static199.anIntArray495[Static47.anInt1239] = local18.anInt3961;
						Static199.anIntArray494[Static47.anInt1239] = local18.anInt3973;
						Static199.aClass65Array63[Static47.anInt1239] = local18.aClass65_2377;
						Static47.anInt1239++;
					}
				}
				if (Static174.anInt3887 < local18.anInt3985) {
					Static114.method2109(local18, local18.method2995() + 15);
					if (Static141.anInt3425 > -1) {
						Static194.method3096(arg1 + Static141.anInt3425 - 15, arg3 + -3 - -Static93.anInt2335, local18.anInt3941, 5, 65280);
						Static194.method3096(Static141.anInt3425 + arg1 + local18.anInt3941 - 15, Static93.anInt2335 + arg3 + -3, 30 - local18.anInt3941, 5, 16711680);
					}
				}
				for (local201 = 0; local201 < 4; local201++) {
					if (Static174.anInt3887 < local18.anIntArray452[local201]) {
						Static114.method2109(local18, local18.method2995() / 2);
						if (Static141.anInt3425 > -1) {
							if (local201 == 1) {
								Static93.anInt2335 -= 20;
							}
							if (local201 == 2) {
								Static141.anInt3425 -= 15;
								Static93.anInt2335 -= 10;
							}
							if (local201 == 3) {
								Static141.anInt3425 += 15;
								Static93.anInt2335 -= 10;
							}
							Static96.aClass1_Sub2_Sub5_Sub3Array3[local18.anIntArray454[local201]].method1315(Static141.anInt3425 + arg1 - 12, arg3 + -12 - -Static93.anInt2335);
							Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4.method1595(Static118.method2250(local18.anIntArray453[local201]), Static141.anInt3425 + arg1 - 1, Static93.anInt2335 + arg3 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(590) int local590 = 0; local590 < Static47.anInt1239; local590++) {
			local201 = Static199.anIntArray492[local590];
			@Pc(600) int local600 = Static199.anIntArray498[local590];
			local133 = Static199.anIntArray493[local590];
			local273 = Static199.anIntArray497[local590];
			@Pc(610) boolean local610 = true;
			while (local610) {
				local610 = false;
				for (@Pc(616) int local616 = 0; local616 < local590; local616++) {
					if (local600 + 2 > -Static199.anIntArray497[local616] + Static199.anIntArray498[local616] && Static199.anIntArray498[local616] + 2 > -local273 + local600 && Static199.anIntArray493[local616] + Static199.anIntArray492[local616] > local201 + -local133 && Static199.anIntArray492[local616] - Static199.anIntArray493[local616] < local201 - -local133 && Static199.anIntArray498[local616] - Static199.anIntArray497[local616] < local600) {
						local610 = true;
						local600 = Static199.anIntArray498[local616] - Static199.anIntArray497[local616];
					}
				}
			}
			Static141.anInt3425 = Static199.anIntArray492[local590];
			Static93.anInt2335 = Static199.anIntArray498[local590] = local600;
			@Pc(726) Class65 local726 = Static199.aClass65Array63[local590];
			if (Static128.anInt3157 == 0) {
				@Pc(730) int local730 = 16776960;
				if (Static199.anIntArray496[local590] < 6) {
					local730 = Static62.anIntArray156[Static199.anIntArray496[local590]];
				}
				if (Static199.anIntArray496[local590] == 6) {
					local730 = Static100.anInt2510 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static199.anIntArray496[local590] == 7) {
					local730 = Static100.anInt2510 % 20 >= 10 ? 65535 : 255;
				}
				if (Static199.anIntArray496[local590] == 8) {
					local730 = Static100.anInt2510 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(804) int local804;
				if (Static199.anIntArray496[local590] == 9) {
					local804 = 150 - Static199.anIntArray494[local590];
					if (local804 < 50) {
						local730 = local804 * 1280 + 16711680;
					} else if (local804 < 100) {
						local730 = 16776960 + 16384000 - local804 * 327680;
					} else if (local804 < 150) {
						local730 = (local804 - 100) * 5 + 65280;
					}
				}
				if (Static199.anIntArray496[local590] == 10) {
					local804 = 150 - Static199.anIntArray494[local590];
					if (local804 < 50) {
						local730 = local804 * 5 + 16711680;
					} else if (local804 < 100) {
						local730 = 16711935 - (local804 - 50) * 327680;
					} else if (local804 < 150) {
						local730 = local804 * 327680 + 755 - local804 * 5 - 32768000;
					}
				}
				if (Static199.anIntArray496[local590] == 11) {
					local804 = 150 - Static199.anIntArray494[local590];
					if (local804 < 50) {
						local730 = 16777215 - local804 * 327685;
					} else if (local804 < 100) {
						local730 = local804 * 327685 - 16318970;
					} else if (local804 < 150) {
						local730 = 16777215 + 32768000 - local804 * 327680;
					}
				}
				if (Static199.anIntArray495[local590] == 0) {
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1595(local726, Static141.anInt3425 + arg1, arg3 + Static93.anInt2335, local730, 0);
				}
				if (Static199.anIntArray495[local590] == 1) {
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1615(local726, Static141.anInt3425 + arg1, Static93.anInt2335 + arg3, local730, Static100.anInt2510);
				}
				if (Static199.anIntArray495[local590] == 2) {
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1606(local726, arg1 + Static141.anInt3425, arg3 - -Static93.anInt2335, local730, Static100.anInt2510);
				}
				if (Static199.anIntArray495[local590] == 3) {
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1612(local726, arg1 + Static141.anInt3425, arg3 + Static93.anInt2335, local730, Static100.anInt2510, 150 - Static199.anIntArray494[local590]);
				}
				if (Static199.anIntArray495[local590] == 4) {
					local804 = (150 - Static199.anIntArray494[local590]) * (Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1600(local726) + 100) / 150;
					Static194.method3100(arg1 + Static141.anInt3425 - 50, arg3, arg1 + Static141.anInt3425 + 50, arg3 + arg2);
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1597(local726, Static141.anInt3425 + arg1 + 50 - local804, arg3 + Static93.anInt2335, local730, 0);
					Static194.method3107(arg1, arg3, arg0 + arg1, arg2 + arg3);
				}
				if (Static199.anIntArray495[local590] == 5) {
					local804 = 150 - Static199.anIntArray494[local590];
					Static194.method3100(arg1, arg3 + Static93.anInt2335 - Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.anInt2171 - 1, arg1 - -arg0, arg3 + Static93.anInt2335 + 5);
					@Pc(1126) int local1126 = 0;
					if (local804 < 25) {
						local1126 = local804 - 25;
					} else if (local804 > 125) {
						local1126 = local804 - 125;
					}
					Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1595(local726, Static141.anInt3425 + arg1, local1126 + Static93.anInt2335 + arg3, local730, 0);
					Static194.method3107(arg1, arg3, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1595(local726, Static141.anInt3425 + arg1, Static93.anInt2335 + arg3, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!wd;)V")
	public static void method564(@OriginalArg(1) Class97 arg0) {
		@Pc(11) int local11 = arg0.anInt4314;
		if (local11 == 324) {
			if (Static15.anInt400 == -1) {
				Static15.anInt400 = arg0.anInt4347;
				Static101.anInt2540 = arg0.anInt4340;
			}
			if (Static28.aClass19_2.aBoolean43) {
				arg0.anInt4347 = Static15.anInt400;
			} else {
				arg0.anInt4347 = Static101.anInt2540;
			}
		} else if (local11 == 325) {
			if (Static15.anInt400 == -1) {
				Static15.anInt400 = arg0.anInt4347;
				Static101.anInt2540 = arg0.anInt4340;
			}
			if (Static28.aClass19_2.aBoolean43) {
				arg0.anInt4347 = Static101.anInt2540;
			} else {
				arg0.anInt4347 = Static15.anInt400;
			}
		} else if (local11 == 327) {
			arg0.anInt4370 = 150;
			arg0.anInt4380 = (int) (Math.sin((double) Static174.anInt3887 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4325 = -1;
			arg0.anInt4315 = 5;
		} else if (local11 == 328) {
			if (Static201.aClass6_Sub4_Sub1_3.aClass65_479 == null) {
				arg0.anInt4325 = 0;
			} else {
				arg0.anInt4370 = 150;
				arg0.anInt4380 = (int) (Math.sin((double) Static174.anInt3887 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4315 = 5;
				arg0.anInt4325 = ((int) Static201.aClass6_Sub4_Sub1_3.aClass65_479.method2475() << 11) + 2047;
				arg0.anInt4381 = Static201.aClass6_Sub4_Sub1_3.anInt3946;
				arg0.anInt4316 = Static201.aClass6_Sub4_Sub1_3.anInt3933;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method565() {
		Static1.aClass1_Sub14_Sub1_43.method1759();
		@Pc(19) int local19 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
		if (local19 == 0) {
			return;
		}
		@Pc(30) int local30 = Static1.aClass1_Sub14_Sub1_43.method1756(2);
		if (local30 == 0) {
			Static191.anIntArray474[Static95.anInt2376++] = 2047;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		if (local30 == 1) {
			local54 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
			Static201.aClass6_Sub4_Sub1_3.method2994(false, local54);
			local64 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			if (local64 == 1) {
				Static191.anIntArray474[Static95.anInt2376++] = 2047;
			}
			return;
		}
		@Pc(108) int local108;
		if (local30 == 2) {
			local54 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
			Static201.aClass6_Sub4_Sub1_3.method2994(true, local54);
			local64 = Static1.aClass1_Sub14_Sub1_43.method1756(3);
			Static201.aClass6_Sub4_Sub1_3.method2994(true, local64);
			local108 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			if (local108 == 1) {
				Static191.anIntArray474[Static95.anInt2376++] = 2047;
			}
		} else if (local30 == 3) {
			Static207.anInt4425 = Static1.aClass1_Sub14_Sub1_43.method1756(2);
			local54 = Static1.aClass1_Sub14_Sub1_43.method1756(7);
			local64 = Static1.aClass1_Sub14_Sub1_43.method1756(7);
			local108 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			@Pc(152) int local152 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
			if (local152 == 1) {
				Static191.anIntArray474[Static95.anInt2376++] = 2047;
			}
			Static201.aClass6_Sub4_Sub1_3.method2991(local54, local108 == 1, local64);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method567(@OriginalArg(0) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub19_5 != null) {
			arg0.aClass1_Sub19_5.anInt2890 = 0;
		}
		arg0.aBoolean127 = false;
		for (@Pc(21) Class1_Sub6 local21 = arg0.method2368(); local21 != null; local21 = arg0.method2369()) {
			method567(local21);
		}
	}
}
