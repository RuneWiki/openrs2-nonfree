import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!df;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	public static int anInt432;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!jb;")
	public static Class28 aClass28_10;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt434;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!hd;")
	public static Class50 aClass50_8 = new Class50(512);

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
	public static int[] anIntArray42 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!sc;")
	public static Class107 aClass107_150 = Static231.method3737("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method409() {
		Static162.aClass61_62.method1689();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
	public static void method410(@OriginalArg(1) int arg0) {
		Static92.anInt1986 = 50;
		Static34.anInt720 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
	public static boolean method412() {
		return Static89.aBoolean176;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)V")
	public static void method413(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static71.anInt1625 = 0;
		@Pc(290) int local290;
		@Pc(567) int local567;
		@Pc(208) int local208;
		@Pc(132) int local132;
		for (@Pc(5) int local5 = -1; local5 < Static189.anInt4168 + Static10.anInt285; local5++) {
			@Pc(26) Class5_Sub5 local26;
			if (local5 == -1) {
				local26 = Static204.aClass5_Sub5_Sub1_2;
			} else if (local5 >= Static10.anInt285) {
				local26 = Static33.aClass5_Sub5_Sub2Array1[Static37.anIntArray82[local5 - Static10.anInt285]];
			} else {
				local26 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local5]];
			}
			if (local26 != null && local26.method2308()) {
				@Pc(53) Class30 local53;
				if (local26 instanceof Class5_Sub5_Sub2) {
					local53 = ((Class5_Sub5_Sub2) local26).aClass30_1;
					if (local53.anIntArray102 != null) {
						local53 = local53.method870();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local5 >= Static10.anInt285) {
					local53 = ((Class5_Sub5_Sub2) local26).aClass30_1;
					if (local53.anIntArray102 != null) {
						local53 = local53.method870();
					}
					if (local53.anInt978 >= 0 && local53.anInt978 < Static151.aClass1_Sub2_Sub2Array9.length) {
						Static141.method2354(arg0 >> 1, local26, local26.method2310() + 15, arg2 >> 1);
						if (Static159.anInt3501 > -1) {
							Static151.aClass1_Sub2_Sub2Array9[local53.anInt978].method189(arg3 + Static159.anInt3501 - 12, arg1 + Static99.anInt922 - 30);
						}
					}
					@Pc(130) Class68[] local130 = Static76.aClass68Array1;
					for (local132 = 0; local132 < local130.length; local132++) {
						@Pc(138) Class68 local138 = local130[local132];
						if (local138 != null && local138.anInt2519 == 1 && local138.anInt2515 == Static37.anIntArray82[local5 - Static10.anInt285] && Static128.anInt2802 % 20 < 10) {
							Static141.method2354(arg0 >> 1, local26, local26.method2310() + 15, arg2 >> 1);
							if (Static159.anInt3501 > -1) {
								Static23.aClass1_Sub2_Sub2Array2[local138.anInt2508].method189(arg3 + Static159.anInt3501 - 12, Static99.anInt922 + -28 + arg1);
							}
						}
					}
				} else {
					local208 = 30;
					@Pc(211) Class5_Sub5_Sub1 local211 = (Class5_Sub5_Sub1) local26;
					if (local211.anInt1280 != -1 || local211.anInt1282 != -1) {
						Static141.method2354(arg0 >> 1, local26, local26.method2310() + 15, arg2 >> 1);
						if (Static159.anInt3501 > -1) {
							if (local211.anInt1280 != -1) {
								Static122.aClass1_Sub2_Sub2Array8[local211.anInt1280].method189(Static159.anInt3501 + arg3 - 12, Static99.anInt922 + arg1 - 30);
								local208 += 25;
							}
							if (local211.anInt1282 != -1) {
								Static151.aClass1_Sub2_Sub2Array9[local211.anInt1282].method189(arg3 + Static159.anInt3501 - 12, arg1 + Static99.anInt922 - local208);
								local208 += 25;
							}
						}
					}
					if (local5 >= 0) {
						local290 = 0;
						@Pc(292) Class68[] local292 = Static76.aClass68Array1;
						while (local290 < local292.length) {
							@Pc(298) Class68 local298 = local292[local290];
							if (local298 != null && local298.anInt2519 == 10 && Static16.anIntArray38[local5] == local298.anInt2515) {
								Static141.method2354(arg0 >> 1, local26, local26.method2310() + 15, arg2 >> 1);
								if (Static159.anInt3501 > -1) {
									Static23.aClass1_Sub2_Sub2Array2[local298.anInt2508].method189(Static159.anInt3501 + arg3 - 12, -local208 + arg1 - -Static99.anInt922);
								}
							}
							local290++;
						}
					}
				}
				if (local26.aClass107_826 != null && (Static10.anInt285 <= local5 || Static107.anInt2342 == 0 || Static107.anInt2342 == 3 || Static107.anInt2342 == 1 && Static71.method1286(((Class5_Sub5_Sub1) local26).aClass107_351))) {
					Static141.method2354(arg0 >> 1, local26, local26.method2310(), arg2 >> 1);
					if (Static159.anInt3501 > -1 && Static71.anInt1625 < Static63.anInt1524) {
						Static63.anIntArray127[Static71.anInt1625] = Static175.aClass1_Sub2_Sub15_3.method3350(local26.aClass107_826) / 2;
						Static63.anIntArray129[Static71.anInt1625] = Static175.aClass1_Sub2_Sub15_3.anInt4481;
						Static63.anIntArray128[Static71.anInt1625] = Static159.anInt3501;
						Static63.anIntArray133[Static71.anInt1625] = Static99.anInt922;
						Static63.anIntArray131[Static71.anInt1625] = local26.anInt3012;
						Static63.anIntArray130[Static71.anInt1625] = local26.anInt3017;
						Static63.anIntArray132[Static71.anInt1625] = local26.anInt2998;
						Static63.aClass107Array8[Static71.anInt1625] = local26.aClass107_826;
						Static71.anInt1625++;
					}
				}
				if (Static128.anInt2802 < local26.anInt3010) {
					@Pc(466) Class1_Sub2_Sub2 local466 = Static72.aClass1_Sub2_Sub2Array4[1];
					@Pc(470) Class1_Sub2_Sub2 local470 = Static72.aClass1_Sub2_Sub2Array4[0];
					if (local26 instanceof Class5_Sub5_Sub2) {
						@Pc(476) Class5_Sub5_Sub2 local476 = (Class5_Sub5_Sub2) local26;
						@Pc(487) Class1_Sub2_Sub2[] local487 = (Class1_Sub2_Sub2[]) Static179.aClass61_69.method1693((long) local476.aClass30_1.anInt958);
						if (local487 == null) {
							local487 = Static141.method2352(Static169.aClass28_Sub1_97, local476.aClass30_1.anInt958);
							if (local487 != null) {
								Static179.aClass61_69.method1694((long) local476.aClass30_1.anInt958, local487);
							}
						}
						if (local487 != null && local487.length == 2) {
							local466 = local487[1];
							local470 = local487[0];
						}
					}
					Static141.method2354(arg0 >> 1, local26, local26.method2310() + local470.anInt208 + 10, arg2 >> 1);
					if (Static159.anInt3501 > -1) {
						local132 = Static159.anInt3501 + arg3 - (local470.anInt209 >> 1);
						local290 = arg1 + Static99.anInt922 - 3;
						local470.method189(local132, local290);
						local567 = local470.anInt208;
						@Pc(575) int local575 = local470.anInt209 * local26.anInt3051 / 255;
						Static205.method3255(local132, local290, local575 + local132, local567 + local290);
						local466.method189(local132, local290);
						Static205.method3251(arg3, arg1, arg0 + arg3, arg1 + arg2);
					}
				}
				for (local208 = 0; local208 < 4; local208++) {
					if (Static128.anInt2802 < local26.anIntArray257[local208]) {
						Static141.method2354(arg0 >> 1, local26, local26.method2310() / 2, arg2 >> 1);
						if (Static159.anInt3501 > -1) {
							if (local208 == 1) {
								Static99.anInt922 -= 20;
							}
							if (local208 == 2) {
								Static99.anInt922 -= 10;
								Static159.anInt3501 -= 15;
							}
							if (local208 == 3) {
								Static159.anInt3501 += 15;
								Static99.anInt922 -= 10;
							}
							Static110.aClass1_Sub2_Sub2Array6[local26.anIntArray259[local208]].method189(arg3 + Static159.anInt3501 - 12, Static99.anInt922 + arg1 + -12);
							Static64.aClass1_Sub2_Sub15_2.method3327(Static115.method2001(local26.anIntArray258[local208]), Static159.anInt3501 + arg3 - 1, arg1 + 3 + Static99.anInt922, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(713) int local713 = 0; local713 < Static71.anInt1625; local713++) {
			local208 = Static63.anIntArray128[local713];
			local132 = Static63.anIntArray127[local713];
			local290 = Static63.anIntArray129[local713];
			@Pc(731) int local731 = Static63.anIntArray133[local713];
			@Pc(733) boolean local733 = true;
			while (local733) {
				local733 = false;
				for (local567 = 0; local567 < local713; local567++) {
					if (local731 + 2 > Static63.anIntArray133[local567] - Static63.anIntArray129[local567] && Static63.anIntArray133[local567] + 2 > -local290 + local731 && Static63.anIntArray128[local567] + Static63.anIntArray127[local567] > local208 - local132 && Static63.anIntArray128[local567] - Static63.anIntArray127[local567] < local208 - -local132 && Static63.anIntArray133[local567] - Static63.anIntArray129[local567] < local731) {
						local733 = true;
						local731 = Static63.anIntArray133[local567] - Static63.anIntArray129[local567];
					}
				}
			}
			Static159.anInt3501 = Static63.anIntArray128[local713];
			Static99.anInt922 = Static63.anIntArray133[local713] = local731;
			@Pc(847) Class107 local847 = Static63.aClass107Array8[local713];
			if (Static215.anInt4669 == 0) {
				@Pc(866) int local866 = 16776960;
				if (Static63.anIntArray131[local713] < 6) {
					local866 = Static222.anIntArray342[Static63.anIntArray131[local713]];
				}
				if (Static63.anIntArray131[local713] == 6) {
					local866 = Static157.anInt3451 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static63.anIntArray131[local713] == 7) {
					local866 = Static157.anInt3451 % 20 < 10 ? 255 : 65535;
				}
				if (Static63.anIntArray131[local713] == 8) {
					local866 = Static157.anInt3451 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(943) int local943;
				if (Static63.anIntArray131[local713] == 9) {
					local943 = 150 - Static63.anIntArray132[local713];
					if (local943 < 50) {
						local866 = local943 * 1280 + 16711680;
					} else if (local943 < 100) {
						local866 = 33160960 - local943 * 327680;
					} else if (local943 < 150) {
						local866 = (local943 - 100) * 5 + 65280;
					}
				}
				if (Static63.anIntArray131[local713] == 10) {
					local943 = 150 - Static63.anIntArray132[local713];
					if (local943 < 50) {
						local866 = local943 * 5 + 16711680;
					} else if (local943 < 100) {
						local866 = 16711935 + 16384000 - local943 * 327680;
					} else if (local943 < 150) {
						local866 = local943 * 327680 + 500 + 255 - local943 * 5 - 32768000;
					}
				}
				if (Static63.anIntArray131[local713] == 11) {
					local943 = 150 - Static63.anIntArray132[local713];
					if (local943 < 50) {
						local866 = 16777215 - local943 * 327685;
					} else if (local943 < 100) {
						local866 = (local943 - 50) * 327685 + 65280;
					} else if (local943 < 150) {
						local866 = 32768000 + 16777215 - local943 * 327680;
					}
				}
				if (Static63.anIntArray130[local713] == 0) {
					Static175.aClass1_Sub2_Sub15_3.method3327(local847, arg3 + Static159.anInt3501, Static99.anInt922 + arg1, local866, 0);
				}
				if (Static63.anIntArray130[local713] == 1) {
					Static175.aClass1_Sub2_Sub15_3.method3342(local847, arg3 + Static159.anInt3501, arg1 + Static99.anInt922, local866, Static157.anInt3451);
				}
				if (Static63.anIntArray130[local713] == 2) {
					Static175.aClass1_Sub2_Sub15_3.method3333(local847, arg3 + Static159.anInt3501, arg1 - -Static99.anInt922, local866, Static157.anInt3451);
				}
				if (Static63.anIntArray130[local713] == 3) {
					Static175.aClass1_Sub2_Sub15_3.method3343(local847, Static159.anInt3501 + arg3, Static99.anInt922 + arg1, local866, Static157.anInt3451, 150 - Static63.anIntArray132[local713]);
				}
				if (Static63.anIntArray130[local713] == 4) {
					local943 = (150 - Static63.anIntArray132[local713]) * (Static175.aClass1_Sub2_Sub15_3.method3350(local847) + 100) / 150;
					Static205.method3255(Static159.anInt3501 + arg3 - 50, arg1, arg3 + Static159.anInt3501 + 50, arg2 + arg1);
					Static175.aClass1_Sub2_Sub15_3.method3331(local847, Static159.anInt3501 + arg3 + 50 - local943, arg1 - -Static99.anInt922, local866, 0);
					Static205.method3251(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
				if (Static63.anIntArray130[local713] == 5) {
					local943 = 150 - Static63.anIntArray132[local713];
					@Pc(1253) int local1253 = 0;
					Static205.method3255(arg3, Static99.anInt922 + arg1 - Static175.aClass1_Sub2_Sub15_3.anInt4481 - 1, arg0 + arg3, arg1 + Static99.anInt922 + 5);
					if (local943 < 25) {
						local1253 = local943 - 25;
					} else if (local943 > 125) {
						local1253 = local943 - 125;
					}
					Static175.aClass1_Sub2_Sub15_3.method3327(local847, arg3 + Static159.anInt3501, local1253 + arg1 + Static99.anInt922, local866, 0);
					Static205.method3251(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static175.aClass1_Sub2_Sub15_3.method3327(local847, arg3 + Static159.anInt3501, arg1 - -Static99.anInt922, 16776960, 0);
			}
		}
	}
}
