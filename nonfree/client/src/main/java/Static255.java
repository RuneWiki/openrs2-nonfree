import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
	public static int anInt4157 = -1;

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "Lclient!vg;")
	public static final Class252 aClass252_27 = new Class252(32);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public static void method3303(@OriginalArg(0) int arg0) {
		Static77.anInt1397 = arg0;
		Static239.aClass44_62.method1031();
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
	public static void method3304() {
		Static459.aFont2 = null;
		Static173.anImage1 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!la;Ljava/lang/String;IZ)V")
	public static void method3305(@OriginalArg(0) Class23 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) int local20 = Static51.aClass14_4.method285(250, arg1, null);
		@Pc(29) int local29 = Static51.aClass14_4.method284(250, arg1, null) * 13;
		Static407.aClass200_9.P(6, 6, local20 + 4 + 4, local29 + 8, -16777216, 0);
		Static407.aClass200_9.method5814(6, 6, local20 + 8, local29 - -4 - -4, -1, 0);
		arg0.method5752(null, 1, 0, -1, null, 10, null, local29, local20, arg1, 10, -1, 0);
		Static258.method3330(local29 + 4 + 4, 6, 6, local20 + 4 + 4);
		if (arg2) {
			Static407.aClass200_9.method5813();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZIIIII)V")
	public static void method3307(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static31.anInt622;
		@Pc(9) int[] local9 = Static334.anIntArray387;
		Static160.anInt2804 = 0;
		@Pc(173) int local173;
		@Pc(202) int local202;
		@Pc(247) int local247;
		@Pc(324) int local324;
		@Pc(413) int local413;
		@Pc(857) int local857;
		@Pc(546) int local546;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static424.anInt7114; local13++) {
			@Pc(17) Class131 local17 = null;
			@Pc(36) Class2_Sub1_Sub3 local36;
			if (local7 <= local13) {
				local36 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local13 - local7])).aClass2_Sub1_Sub3_Sub1_1;
				local17 = ((Class2_Sub1_Sub3_Sub1) local36).aClass131_1;
				if (local17.anIntArray209 != null) {
					local17 = local17.method2781(Static408.aClass39_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local36 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local9[local13]];
			}
			if (local36.anInt6150 >= 0 && (local36.anInt6141 == Static409.anInt6832 || local36.aByte105 == Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105)) {
				Static298.method3698(local36.method4902(), arg1 >> 1, local36, arg0 >> 1);
				if (Static205.anIntArray194[0] >= 0) {
					if (local36.aString64 != null && (local7 <= local13 || Static17.anInt358 == 0 || Static17.anInt358 == 3 || Static17.anInt358 == 1 && Static96.method1355(((Class2_Sub1_Sub3_Sub2) local36).aString65)) && Static160.anInt2804 < Static66.anInt1216) {
						Static66.anIntArray55[Static160.anInt2804] = Static21.aClass14_1.method286(local36.aString64) / 2;
						Static66.anIntArray58[Static160.anInt2804] = Static205.anIntArray194[0];
						Static66.anIntArray56[Static160.anInt2804] = Static205.anIntArray194[1];
						Static66.anIntArray59[Static160.anInt2804] = local36.anInt6162;
						Static66.anIntArray57[Static160.anInt2804] = local36.anInt6122;
						Static66.anIntArray54[Static160.anInt2804] = local36.anInt6132;
						Static66.aStringArray8[Static160.anInt2804] = local36.aString64;
						Static160.anInt2804++;
					}
					local173 = Static205.anIntArray194[1] + arg3;
					@Pc(232) Class49[] local232;
					@Pc(239) Class214[] local239;
					@Pc(297) Class49 local297;
					if (local36.aBoolean409 || Static85.anInt1536 >= local36.anInt6186) {
						local173 -= Math.max(Static21.aClass14_1.anInt360, Static219.aClass49Array8[0].ZA());
					} else {
						@Pc(188) byte local188 = 1;
						if (local7 > local13) {
							@Pc(197) Class2_Sub1_Sub3_Sub2 local197 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local9[local13]];
							local202 = local36.method4910().anInt3520;
							if (local197.aBoolean412) {
								local188 = 2;
							}
						} else {
							local202 = local17.anInt3466;
							if (local202 == -1) {
								local202 = local36.method4910().anInt3520;
							}
						}
						@Pc(222) Class49[] local222 = Static219.aClass49Array8;
						if (local202 != -1) {
							local232 = (Class49[]) Static60.aClass44_7.method1028((long) local202);
							if (local232 == null) {
								local239 = Static470.method4679(Static344.aClass243_196, local202);
								if (local239 != null) {
									local232 = new Class49[local239.length];
									for (local247 = 0; local247 < local239.length; local247++) {
										local232[local247] = Static407.aClass200_9.method5871(local239[local247]);
									}
									Static60.aClass44_7.method1017((long) local202, local232);
								}
							}
							if (local232 != null && local232.length >= 2) {
								local222 = local232;
							}
						}
						if (local188 >= local222.length) {
							local188 = 1;
						}
						@Pc(293) Class49 local293 = local222[0];
						local297 = local222[local188];
						local173 -= Math.max(Static21.aClass14_1.anInt360, local293.ZA());
						local247 = arg2 + Static205.anIntArray194[0] - (local293.YA() >> 1);
						local324 = local293.YA() * local36.anInt6156 / 255;
						if (local36.anInt6156 > 0 && local324 < 2) {
							local324 = 2;
						}
						local293.method5785(local247, local173);
						Static407.aClass200_9.HA(local247, local173, local324 + local247, local293.ZA() + local173);
						local297.method5785(local247, local173);
						Static407.aClass200_9.ba(arg2, arg3, arg2 + arg0, arg3 - -arg1);
					}
					local173 -= 2;
					if (!local36.aBoolean409) {
						@Pc(394) Class49 local394;
						if (Static85.anInt1536 < local36.anInt6133) {
							local394 = Static5.aClass49Array1[local36.aBoolean408 ? 2 : 0];
							@Pc(403) Class49 local403 = Static5.aClass49Array1[local36.aBoolean408 ? 3 : 1];
							if (local36 instanceof Class2_Sub1_Sub3_Sub1) {
								local413 = local17.anInt3484;
								if (local413 == -1) {
									local413 = local36.method4910().anInt3546;
								}
							} else {
								local413 = local36.method4910().anInt3546;
							}
							if (local413 != -1) {
								local232 = (Class49[]) Static129.aClass44_22.method1028((long) local413);
								if (local232 == null) {
									local239 = Static470.method4679(Static344.aClass243_196, local413);
									if (local239 != null) {
										local232 = new Class49[local239.length];
										for (local247 = 0; local247 < local239.length; local247++) {
											local232[local247] = Static407.aClass200_9.method5871(local239[local247]);
										}
										Static129.aClass44_22.method1017((long) local413, local232);
									}
								}
								if (local232 != null && local232.length == 4) {
									local394 = local232[local36.aBoolean408 ? 2 : 0];
									local403 = local232[local36.aBoolean408 ? 3 : 1];
								}
							}
							@Pc(508) int local508 = local36.anInt6133 - Static85.anInt1536;
							if (local508 > local36.anInt6131) {
								local508 -= local36.anInt6131;
								local247 = local36.anInt6184 == 0 ? 0 : (local36.anInt6142 - local508) / local36.anInt6184 * local36.anInt6184;
								local546 = local394.YA() * local247 / local36.anInt6142;
							} else {
								local546 = local394.YA();
							}
							local247 = local394.ZA();
							local173 -= local247;
							local324 = arg2 + Static205.anIntArray194[0] - (local394.YA() >> 1);
							local394.method5785(local324, local173);
							Static407.aClass200_9.HA(local324, local173, local324 + local546, local173 + local247);
							local403.method5785(local324, local173);
							local173 -= 2;
							Static407.aClass200_9.ba(arg2, arg3, arg0 + arg2, arg3 - -arg1);
						}
						if (local7 > local13) {
							@Pc(643) Class2_Sub1_Sub3_Sub2 local643 = (Class2_Sub1_Sub3_Sub2) local36;
							if (local643.anInt6229 != -1) {
								local173 -= 25;
								Static394.aClass49Array12[local643.anInt6229].method5785(arg2 + Static205.anIntArray194[0] - 12, local173);
								local173 -= 2;
							}
							if (local643.anInt6232 != -1) {
								local173 -= 25;
								Static102.aClass49Array4[local643.anInt6232].method5785(arg2 + Static205.anIntArray194[0] - 12, local173);
								local173 -= 2;
							}
						} else if (local17.anInt3456 >= 0 && local17.anInt3456 < Static102.aClass49Array4.length) {
							local173 -= 25;
							local394 = Static102.aClass49Array4[local17.anInt3456];
							local394.method5785(arg2 + Static205.anIntArray194[0] - (local394.YA() >> 1), local173);
							local173 -= 2;
						}
					}
					@Pc(690) Class266[] local690;
					@Pc(698) Class266 local698;
					if (!(local36 instanceof Class2_Sub1_Sub3_Sub2)) {
						local202 = 0;
						local690 = Static186.aClass266Array1;
						for (local413 = 0; local413 < local690.length; local413++) {
							local698 = local690[local413];
							if (local698 != null && local698.anInt7406 == 1 && Static218.anIntArray351[local13 - local7] == local698.anInt7405) {
								local297 = Static278.aClass49Array10[local698.anInt7412];
								if (local202 < local297.ZA()) {
									local202 = local297.ZA();
								}
								if (Static85.anInt1536 % 20 < 10) {
									local297.method5785(Static205.anIntArray194[0] + arg2 - 12, -local297.ZA() + local173);
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local690 = Static186.aClass266Array1;
						for (local413 = 0; local413 < local690.length; local413++) {
							local698 = local690[local413];
							if (local698 != null && local698.anInt7406 == 10 && local698.anInt7405 == local9[local13]) {
								local297 = Static278.aClass49Array10[local698.anInt7412];
								if (local297.ZA() > local202) {
									local202 = local297.ZA();
								}
								local297.method5785(arg2 + Static205.anIntArray194[0] - 12, local173 + -local297.ZA());
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < 4; local202++) {
						if (local36.anIntArray430[local202] > Static85.anInt1536) {
							local857 = local36.method4902() / 2;
							Static298.method3698(local857, arg1 >> 1, local36, arg0 >> 1);
							if (Static205.anIntArray194[0] > -1) {
								local413 = Static217.aClass49Array7[local36.anIntArray431[local202]].YA();
								if (local202 == 1) {
									Static205.anIntArray194[1] -= 20;
								}
								if (local202 == 2) {
									Static205.anIntArray194[0] -= local413 - 9;
									Static205.anIntArray194[1] -= 10;
								}
								if (local202 == 3) {
									Static205.anIntArray194[0] += local413 - 9;
									Static205.anIntArray194[1] -= 10;
								}
								Static217.aClass49Array7[local36.anIntArray431[local202]].method5785(Static205.anIntArray194[0] + arg2 - (local413 >> 1), Static205.anIntArray194[1] + -12 + arg3);
								Static138.aClass23_2.method5739(arg2 + Static205.anIntArray194[0] - 1, Integer.toString(local36.anIntArray432[local202]), arg3 + Static205.anIntArray194[1] + 3, -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1001) int local1001;
		for (@Pc(995) int local995 = 0; local995 < Static138.anInt2467; local995++) {
			local1001 = Static11.anIntArray13[local995];
			@Pc(1014) Class2_Sub1_Sub3 local1014;
			if (local1001 >= 2048) {
				local1014 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) (local1001 - 2048))).aClass2_Sub1_Sub3_Sub1_1;
			} else {
				local1014 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local1001];
			}
			local202 = Static3.anIntArray2[local995];
			@Pc(1039) Class2_Sub1_Sub3 local1039;
			if (local202 >= 2048) {
				local1039 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) (local202 - 2048))).aClass2_Sub1_Sub3_Sub1_1;
			} else {
				local1039 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local202];
			}
			Static322.method3975(local1039, arg2, local1014, --local1014.anInt6174, arg1, arg3, arg0);
		}
		local1001 = Static21.aClass14_1.anInt360 + Static21.aClass14_1.anInt363 + 2;
		for (local173 = 0; local173 < Static160.anInt2804; local173++) {
			local202 = Static66.anIntArray58[local173];
			local857 = Static66.anIntArray56[local173];
			local413 = Static66.anIntArray55[local173];
			@Pc(1102) boolean local1102 = true;
			while (local1102) {
				local1102 = false;
				for (local546 = 0; local546 < local173; local546++) {
					if (local857 + 2 > Static66.anIntArray56[local546] + -local1001 && Static66.anIntArray56[local546] + 2 > local857 - local1001 && Static66.anIntArray58[local546] + Static66.anIntArray55[local546] > local202 - local413 && local202 + local413 > Static66.anIntArray58[local546] + -Static66.anIntArray55[local546] && Static66.anIntArray56[local546] - local1001 < local857) {
						local857 = Static66.anIntArray56[local546] - local1001;
						local1102 = true;
					}
				}
			}
			Static66.anIntArray56[local173] = local857;
			@Pc(1203) String local1203 = Static66.aStringArray8[local173];
			if (Static58.anInt1099 == 0) {
				local247 = 16776960;
				if (Static66.anIntArray59[local173] < 6) {
					local247 = Static447.anIntArray500[Static66.anIntArray59[local173]];
				}
				if (Static66.anIntArray59[local173] == 6) {
					local247 = Static409.anInt6832 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static66.anIntArray59[local173] == 7) {
					local247 = Static409.anInt6832 % 20 < 10 ? 255 : 65535;
				}
				if (Static66.anIntArray59[local173] == 8) {
					local247 = Static409.anInt6832 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static66.anIntArray59[local173] == 9) {
					local324 = 150 - Static66.anIntArray54[local173];
					if (local324 < 50) {
						local247 = local324 * 1280 + 16711680;
					} else if (local324 < 100) {
						local247 = 16384000 + 16776960 - local324 * 327680;
					} else if (local324 < 150) {
						local247 = (local324 - 100) * 5 + 65280;
					}
				}
				if (Static66.anIntArray59[local173] == 10) {
					local324 = 150 - Static66.anIntArray54[local173];
					if (local324 < 50) {
						local247 = local324 * 5 + 16711680;
					} else if (local324 < 100) {
						local247 = 16711935 - (local324 - 50) * 327680;
					} else if (local324 < 150) {
						local247 = (local324 + -100) * 327680 + 500 + 255 - local324 * 5;
					}
				}
				if (Static66.anIntArray59[local173] == 11) {
					local324 = 150 - Static66.anIntArray54[local173];
					if (local324 < 50) {
						local247 = 16777215 - local324 * 327685;
					} else if (local324 < 100) {
						local247 = (local324 - 50) * 327685 + 65280;
					} else if (local324 < 150) {
						local247 = 32768000 + 16777215 - local324 * 327680;
					}
				}
				local324 = local247 | 0xFF000000;
				if (Static66.anIntArray57[local173] == 0) {
					Static56.aClass23_1.method5739(local202 + arg2, local1203, local857 + arg3, local324, -16777216);
				}
				if (Static66.anIntArray57[local173] == 1) {
					Static56.aClass23_1.method5743(local202 + arg2, local1203, arg3 + local857, Static409.anInt6832, local324);
				}
				if (Static66.anIntArray57[local173] == 2) {
					Static56.aClass23_1.method5745(Static409.anInt6832, local1203, local324, local202 + arg2, arg3 - -local857);
				}
				if (Static66.anIntArray57[local173] == 3) {
					Static56.aClass23_1.method5747(local1203, Static409.anInt6832, local324, 150 - Static66.anIntArray54[local173], local857 + arg3, local202 + arg2);
				}
				@Pc(1555) int local1555;
				if (Static66.anIntArray57[local173] == 4) {
					local1555 = (150 - Static66.anIntArray54[local173]) * (Static21.aClass14_1.method286(local1203) + 100) / 150;
					Static407.aClass200_9.HA(arg2 + local202 - 50, arg3, local202 + arg2 + 50, arg3 - -arg1);
					Static56.aClass23_1.method5744(-16777216, local1203, local324, arg2 + local202 + 50 - local1555, arg3 + local857);
					Static407.aClass200_9.ba(arg2, arg3, arg0 + arg2, arg3 - -arg1);
				}
				if (Static66.anIntArray57[local173] == 5) {
					local1555 = 150 - Static66.anIntArray54[local173];
					@Pc(1614) int local1614 = 0;
					if (local1555 < 25) {
						local1614 = local1555 - 25;
					} else if (local1555 > 125) {
						local1614 = local1555 - 125;
					}
					@Pc(1640) int local1640 = Static21.aClass14_1.anInt360 + Static21.aClass14_1.anInt363;
					Static407.aClass200_9.HA(arg2, arg3 + local857 - local1640 - 1, arg0 + arg2, arg3 + local857 + 5);
					Static56.aClass23_1.method5739(arg2 + local202, local1203, arg3 + local857 + local1614, local324, -16777216);
					Static407.aClass200_9.ba(arg2, arg3, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static56.aClass23_1.method5739(arg2 + local202, local1203, arg3 + local857, -256, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!um;Lclient!um;Lclient!um;Lclient!um;B)V")
	public static void method3308(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		Static149.aClass243_88 = arg0;
		Static374.aClass243_218 = arg3;
		Static30.aClass243_26 = arg1;
		Static119.aClass243_122 = arg2;
		Static34.aClass76ArrayArray1 = new Class76[Static149.aClass243_88.method5478()][];
		Static371.aBooleanArray22 = new boolean[Static149.aClass243_88.method5478()];
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	public static void method3309(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(8, arg0);
		local8.method3024();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
	public static boolean method3310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
