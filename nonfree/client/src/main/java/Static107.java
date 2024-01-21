import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!ji;")
	public static Class5_Sub2_Sub10 aClass5_Sub2_Sub10_5;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_820 = Static161.method2452("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public static int anInt2194 = 0;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_821 = Static161.method2452("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)I")
	public static int method1721(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!re;)V")
	public static void method1723(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.anInt2211 == 0) {
			return;
		}
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg0.anInt2249 != -1 && arg0.anInt2249 < 32768) {
			@Pc(22) Class1_Sub2_Sub1 local22 = Static61.aClass1_Sub2_Sub1Array1[arg0.anInt2249];
			if (local22 != null) {
				local30 = arg0.anInt2241 - local22.anInt2241;
				local36 = arg0.anInt2234 - local22.anInt2234;
				if (local30 != 0 || local36 != 0) {
					arg0.anInt2246 = (int) (Math.atan2((double) local30, (double) local36) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(64) int local64;
		if (arg0.anInt2249 >= 32768) {
			local64 = arg0.anInt2249 - 32768;
			if (Static65.anInt1414 == local64) {
				local64 = 2047;
			}
			@Pc(73) Class1_Sub2_Sub2 local73 = Static6.aClass1_Sub2_Sub2Array1[local64];
			if (local73 != null) {
				local36 = arg0.anInt2241 - local73.anInt2241;
				@Pc(88) int local88 = arg0.anInt2234 - local73.anInt2234;
				if (local36 != 0 || local88 != 0) {
					arg0.anInt2246 = (int) (Math.atan2((double) local36, (double) local88) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2226 != 0 || arg0.anInt2253 != 0) && (arg0.anInt2235 == 0 || arg0.anInt2213 > 0)) {
			local64 = arg0.anInt2238 * 64 + arg0.anInt2241 - (-Static86.anInt1895 + arg0.anInt2226 + -Static86.anInt1895) * 64 - 64;
			local30 = arg0.anInt2238 * 64 + arg0.anInt2234 - (arg0.anInt2253 - Static110.anInt2295 - Static110.anInt2295) * 64 - 64;
			if (local64 != 0 || local30 != 0) {
				arg0.anInt2246 = (int) (Math.atan2((double) local64, (double) local30) * 325.949D) & 0x7FF;
			}
			arg0.anInt2253 = 0;
			arg0.anInt2226 = 0;
		}
		local64 = arg0.anInt2246 - arg0.anInt2244 & 0x7FF;
		if (local64 == 0) {
			arg0.anInt2224 = 0;
			return;
		}
		arg0.anInt2224++;
		@Pc(229) boolean local229;
		if (local64 <= 1024) {
			arg0.anInt2244 += arg0.anInt2211;
			local229 = true;
			if (arg0.anInt2211 > local64 || local64 > 2048 - arg0.anInt2211) {
				local229 = false;
				arg0.anInt2244 = arg0.anInt2246;
			}
			if (arg0.anInt2216 == arg0.anInt2215 && (arg0.anInt2224 > 25 || local229)) {
				if (arg0.anInt2252 == -1) {
					arg0.anInt2215 = arg0.anInt2221;
				} else {
					arg0.anInt2215 = arg0.anInt2252;
				}
			}
		} else {
			local229 = true;
			arg0.anInt2244 -= arg0.anInt2211;
			if (local64 < arg0.anInt2211 || 2048 - arg0.anInt2211 < local64) {
				local229 = false;
				arg0.anInt2244 = arg0.anInt2246;
			}
			if (arg0.anInt2215 == arg0.anInt2216 && (arg0.anInt2224 > 25 || local229)) {
				if (arg0.anInt2229 == -1) {
					arg0.anInt2215 = arg0.anInt2221;
				} else {
					arg0.anInt2215 = arg0.anInt2229;
				}
			}
		}
		arg0.anInt2244 &= 0x7FF;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
	public static void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local25 + (1 - local29) * local17;
		@Pc(46) int local46 = local21 * ((arg1 << 1) - 3);
		@Pc(67) int local67;
		@Pc(76) int local76;
		if (arg0 >= Static173.anInt3464 && Static174.anInt3493 >= arg0) {
			local67 = Static171.method2627(Static27.anInt493, arg3 + arg4, Static72.anInt1572);
			local76 = Static171.method2627(Static27.anInt493, arg3 - arg4, Static72.anInt1572);
			Static27.method409(local67, arg2, Static9.anIntArrayArray1[arg0], local76);
		}
		@Pc(92) int local92 = local25 * 3;
		@Pc(96) int local96 = local17 << 2;
		@Pc(100) int local100 = local13 << 2;
		@Pc(106) int local106 = (arg1 - 1) * local96;
		@Pc(112) int local112 = local100;
		@Pc(121) int local121 = local13 - local21 * (local29 - 1);
		while (local7 > 0) {
			local7--;
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local92;
					local121 += local112;
					local9++;
					local92 += local100;
					local112 += local100;
				}
			}
			local67 = arg0 - local7;
			if (local121 < 0) {
				local38 += local92;
				local9++;
				local121 += local112;
				local112 += local100;
				local92 += local100;
			}
			local38 += -local106;
			local121 += -local46;
			local76 = arg0 + local7;
			local46 -= local96;
			if (local76 >= Static173.anInt3464 && local67 <= Static174.anInt3493) {
				@Pc(215) int local215 = Static171.method2627(Static27.anInt493, arg3 + local9, Static72.anInt1572);
				@Pc(223) int local223 = Static171.method2627(Static27.anInt493, arg3 - local9, Static72.anInt1572);
				if (local67 >= Static173.anInt3464) {
					Static27.method409(local215, arg2, Static9.anIntArrayArray1[local67], local223);
				}
				if (local76 <= Static174.anInt3493) {
					Static27.method409(local215, arg2, Static9.anIntArrayArray1[local76], local223);
				}
			}
			local106 -= local96;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg6 - arg2;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = local21 * local21;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = arg3 * arg3;
		@Pc(41) int local41 = local25 << 1;
		@Pc(50) int local50 = local37 << 1;
		@Pc(54) int local54 = local29 << 1;
		@Pc(58) int local58 = arg6 << 1;
		@Pc(67) int local67 = local41 + (1 - local58) * local37;
		@Pc(71) int local71 = local33 << 1;
		@Pc(75) int local75 = local21 << 1;
		@Pc(84) int local84 = local54 + (1 - local75) * local33;
		@Pc(93) int local93 = local29 - (local75 - 1) * local71;
		@Pc(102) int local102 = local25 - (local58 - 1) * local50;
		@Pc(106) int local106 = local37 << 2;
		@Pc(110) int local110 = local25 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local29 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local50 * (local58 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local75 - 3) * local71;
		@Pc(140) int local140 = local118;
		@Pc(146) int local146 = (arg6 - 1) * local106;
		@Pc(148) int local148 = local110;
		@Pc(154) int local154 = local114 * (local21 - 1);
		@Pc(158) int[] local158 = Static9.anIntArrayArray1[arg4];
		Static27.method409(arg1 - local16, arg0, local158, arg1 - arg3);
		Static27.method409(arg1 + local16, arg5, local158, arg1 - local16);
		Static27.method409(arg1 + arg3, arg0, local158, local16 + arg1);
		while (local9 > 0) {
			if (local67 < 0) {
				while (local67 < 0) {
					local7++;
					local67 += local122;
					local122 += local110;
					local102 += local148;
					local148 += local110;
				}
			}
			@Pc(229) boolean local229 = local9 <= local21;
			if (local229) {
				if (local84 < 0) {
					while (local84 < 0) {
						local11++;
						local84 += local132;
						local93 += local140;
						local132 += local118;
						local140 += local118;
					}
				}
				if (local93 < 0) {
					local11++;
					local93 += local140;
					local84 += local132;
					local140 += local118;
					local132 += local118;
				}
				local93 += -local138;
				local138 -= local114;
				local84 += -local154;
				local154 -= local114;
			}
			if (local102 < 0) {
				local7++;
				local102 += local148;
				local67 += local122;
				local122 += local110;
				local148 += local110;
			}
			@Pc(318) int local318 = arg1 + local7;
			local9--;
			@Pc(323) int local323 = arg1 - local7;
			@Pc(328) int local328 = arg4 - local9;
			@Pc(332) int local332 = arg4 + local9;
			if (local229) {
				@Pc(339) int local339 = arg1 - local11;
				@Pc(343) int local343 = local11 + arg1;
				Static27.method409(local339, arg0, Static9.anIntArrayArray1[local328], local323);
				Static27.method409(local343, arg5, Static9.anIntArrayArray1[local328], local339);
				Static27.method409(local318, arg0, Static9.anIntArrayArray1[local328], local343);
				Static27.method409(local339, arg0, Static9.anIntArrayArray1[local332], local323);
				Static27.method409(local343, arg5, Static9.anIntArrayArray1[local332], local339);
				Static27.method409(local318, arg0, Static9.anIntArrayArray1[local332], local343);
			} else {
				Static27.method409(local318, arg0, Static9.anIntArrayArray1[local328], local323);
				Static27.method409(local318, arg0, Static9.anIntArrayArray1[local332], local323);
			}
			local102 += -local128;
			local128 -= local106;
			local67 += -local146;
			local146 -= local106;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
	public static void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg2) {
			Static27.method409(arg2, arg0, Static9.anIntArrayArray1[arg3], arg1);
		} else {
			Static27.method409(arg1, arg0, Static9.anIntArrayArray1[arg3], arg2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1727() {
		if (Static67.anInt3979 > 1) {
			Static67.anInt3979--;
			Static173.anInt3462 = Static98.anInt2085;
		}
		if (Static170.anInt3428 > 0) {
			Static170.anInt3428--;
		}
		if (Static38.aBoolean49) {
			Static38.aBoolean49 = false;
			Static88.method1473();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static153.method2328(); local32++) {
		}
		if (Static96.anInt2013 != 30) {
			return;
		}
		Static5.method130(Static43.aClass5_Sub6_Sub1_2);
		@Pc(56) Object local56 = Static217.aClass100_1.anObject4;
		@Pc(81) int local81;
		@Pc(83) int local83;
		@Pc(85) int local85;
		@Pc(102) int local102;
		@Pc(120) int local120;
		synchronized (Static217.aClass100_1.anObject4) {
			if (!Static168.aBoolean149) {
				Static217.aClass100_1.anInt3791 = 0;
			} else if (Static85.anInt1876 != 0 || Static217.aClass100_1.anInt3791 >= 40) {
				Static43.aClass5_Sub6_Sub1_2.method3087(43);
				Static43.aClass5_Sub6_Sub1_2.method3061(0);
				local81 = Static43.aClass5_Sub6_Sub1_2.anInt4050;
				local83 = 0;
				for (local85 = 0; local85 < Static217.aClass100_1.anInt3791 && Static43.aClass5_Sub6_Sub1_2.anInt4050 - local81 < 240; local85++) {
					local83++;
					local102 = Static217.aClass100_1.anIntArray404[local85];
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 502) {
						local102 = 502;
					}
					local120 = Static217.aClass100_1.anIntArray403[local85];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 764) {
						local120 = 764;
					}
					@Pc(142) int local142 = local102 * 765 + local120;
					if (Static217.aClass100_1.anIntArray404[local85] == -1 && Static217.aClass100_1.anIntArray403[local85] == -1) {
						local142 = 524287;
						local120 = -1;
						local102 = -1;
					}
					if (Static134.anInt2793 != local120 || local102 != Static183.anInt3683) {
						@Pc(187) int local187 = local120 - Static134.anInt2793;
						@Pc(191) int local191 = local102 - Static183.anInt3683;
						Static134.anInt2793 = local120;
						Static183.anInt3683 = local102;
						if (Static133.anInt2775 < 8 && local187 >= -32 && local187 <= 31 && local191 >= -32 && local191 <= 31) {
							local191 += 32;
							local187 += 32;
							Static43.aClass5_Sub6_Sub1_2.method3044(local191 + (local187 << 6) + (Static133.anInt2775 << 12));
							Static133.anInt2775 = 0;
						} else if (Static133.anInt2775 < 8) {
							Static43.aClass5_Sub6_Sub1_2.method3058(local142 + (Static133.anInt2775 << 19) + 8388608);
							Static133.anInt2775 = 0;
						} else {
							Static43.aClass5_Sub6_Sub1_2.method3030((Static133.anInt2775 << 19) + local142 - 1073741824);
							Static133.anInt2775 = 0;
						}
					} else if (Static133.anInt2775 < 2047) {
						Static133.anInt2775++;
					}
				}
				Static43.aClass5_Sub6_Sub1_2.method3078(Static43.aClass5_Sub6_Sub1_2.anInt4050 - local81);
				if (local83 >= Static217.aClass100_1.anInt3791) {
					Static217.aClass100_1.anInt3791 = 0;
				} else {
					Static217.aClass100_1.anInt3791 -= local83;
					for (local102 = 0; local102 < Static217.aClass100_1.anInt3791; local102++) {
						Static217.aClass100_1.anIntArray403[local102] = Static217.aClass100_1.anIntArray403[local83 + local102];
						Static217.aClass100_1.anIntArray404[local102] = Static217.aClass100_1.anIntArray404[local102 + local83];
					}
				}
			}
		}
		if (Static85.anInt1876 != 0) {
			@Pc(363) long local363 = (Static122.aLong143 - Static17.aLong31) / 50L;
			Static17.aLong31 = Static122.aLong143;
			if (local363 > 4095L) {
				local363 = 4095L;
			}
			local83 = Static179.anInt3572;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 764) {
				local83 = 764;
			}
			local81 = Static175.anInt3521;
			@Pc(390) byte local390 = 0;
			if (Static85.anInt1876 == 2) {
				local390 = 1;
			}
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 502) {
				local81 = 502;
			}
			local120 = (int) local363;
			Static43.aClass5_Sub6_Sub1_2.method3087(192);
			local85 = local81 * 765 + local83;
			Static43.aClass5_Sub6_Sub1_2.method3040((local390 << 19) + ((local120 << 20) + local85));
		}
		if (Static201.aBooleanArray22[96] || Static201.aBooleanArray22[97] || Static201.aBooleanArray22[98] || Static201.aBooleanArray22[99]) {
			Static216.aBoolean188 = true;
		}
		if (Static7.anInt177 > 0) {
			Static7.anInt177--;
		}
		if (Static216.aBoolean188 && Static7.anInt177 <= 0) {
			Static216.aBoolean188 = false;
			Static7.anInt177 = 20;
			Static43.aClass5_Sub6_Sub1_2.method3087(183);
			Static43.aClass5_Sub6_Sub1_2.method3044(Static214.anInt4154);
			Static43.aClass5_Sub6_Sub1_2.method3028(Static72.anInt1568);
		}
		if (Static197.aBoolean175 && !Static7.aBoolean7) {
			Static7.aBoolean7 = true;
			Static43.aClass5_Sub6_Sub1_2.method3087(32);
			Static43.aClass5_Sub6_Sub1_2.method3061(1);
		}
		if (!Static197.aBoolean175 && Static7.aBoolean7) {
			Static7.aBoolean7 = false;
			Static43.aClass5_Sub6_Sub1_2.method3087(32);
			Static43.aClass5_Sub6_Sub1_2.method3061(0);
		}
		Static3.method95();
		if (Static96.anInt2013 != 30) {
			return;
		}
		Static159.method2437();
		Static18.method291();
		Static118.anInt3277++;
		if (Static118.anInt3277 > 750) {
			Static88.method1473();
			return;
		}
		Static101.method1696();
		Static153.method2329();
		Static9.method198();
		if (Static122.aClass69_11 != null) {
			Static38.method644();
		}
		Static176.anInt3529++;
		if (Static43.anInt990 != 0) {
			Static101.anInt2161 += 20;
			if (Static101.anInt2161 >= 400) {
				Static43.anInt990 = 0;
			}
		}
		if (Static62.aClass69_5 != null) {
			Static215.anInt4177++;
			if (Static215.anInt4177 >= 15) {
				Static184.method2779(Static62.aClass69_5);
				Static62.aClass69_5 = null;
			}
		}
		@Pc(689) Class69 local689;
		if (Static101.aClass69_7 != null) {
			Static184.method2779(Static101.aClass69_7);
			Static208.anInt4083++;
			if (Static146.anInt3035 + 5 < Static70.anInt1549 || Static70.anInt1549 < Static146.anInt3035 - 5 || Static207.anInt4069 > Static215.anInt4183 + 5 || Static215.anInt4183 - 5 > Static207.anInt4069) {
				Static191.aBoolean170 = true;
			}
			if (Static18.anInt352 == 0) {
				if (Static191.aBoolean170 && Static208.anInt4083 >= 5) {
					if (Static101.aClass69_7 == Static191.aClass69_15 && Static178.anInt3564 != Static96.anInt2017) {
						@Pc(687) byte local687 = 0;
						local689 = Static101.aClass69_7;
						if (Static148.anInt3055 == 1 && local689.anInt2550 == 206) {
							local687 = 1;
						}
						if (local689.anIntArray277[Static96.anInt2017] <= 0) {
							local687 = 0;
						}
						if (Static16.method274(Static94.method1538(local689))) {
							local81 = Static178.anInt3564;
							local83 = Static96.anInt2017;
							local689.anIntArray277[local83] = local689.anIntArray277[local81];
							local689.anIntArray286[local83] = local689.anIntArray286[local81];
							local689.anIntArray277[local81] = -1;
							local689.anIntArray286[local81] = 0;
						} else if (local687 == 1) {
							local83 = Static96.anInt2017;
							local81 = Static178.anInt3564;
							while (local81 != local83) {
								if (local83 < local81) {
									local689.method1887(local81 - 1, local81);
									local81--;
								} else if (local81 < local83) {
									local689.method1887(local81 + 1, local81);
									local81++;
								}
							}
						} else {
							local689.method1887(Static96.anInt2017, Static178.anInt3564);
						}
						Static43.aClass5_Sub6_Sub1_2.method3087(178);
						Static43.aClass5_Sub6_Sub1_2.method3044(Static178.anInt3564);
						Static43.aClass5_Sub6_Sub1_2.method3046(Static101.aClass69_7.anInt2523);
						Static43.aClass5_Sub6_Sub1_2.method3061(local687);
						Static43.aClass5_Sub6_Sub1_2.method3028(Static96.anInt2017);
					}
				} else if ((Static189.anInt3754 == 1 || Static183.method2774(Static85.anInt1879 - 1)) && Static85.anInt1879 > 2) {
					Static75.method1218();
				} else if (Static85.anInt1879 > 0) {
					Static136.method2111(Static85.anInt1879 - 1);
				}
				Static85.anInt1876 = 0;
				Static101.aClass69_7 = null;
				Static215.anInt4177 = 10;
			}
		}
		Static165.anInt2227 = 0;
		Static217.aBoolean190 = false;
		Static175.aClass69_13 = null;
		Static143.aBoolean128 = false;
		local689 = Static86.aClass69_6;
		Static86.aClass69_6 = null;
		@Pc(849) Class69 local849 = Static186.aClass69_14;
		Static186.aClass69_14 = null;
		while (Static41.method766() && Static165.anInt2227 < 128) {
			Static45.anIntArray95[Static165.anInt2227] = Static173.anInt3466;
			Static37.anIntArray127[Static165.anInt2227] = Static104.anInt2178;
			Static165.anInt2227++;
		}
		Static122.aClass69_11 = null;
		if (Static130.anInt2715 != -1) {
			Static52.method913(Static101.anInt2163, Static130.anInt2715, 0, 0, 0, 0, Static90.anInt1933);
		}
		Static98.anInt2085++;
		while (true) {
			@Pc(901) Class5_Sub10 local901;
			@Pc(917) Class69 local917;
			@Pc(906) Class69 local906;
			do {
				local901 = (Class5_Sub10) Static23.aClass91_4.method2683();
				if (local901 == null) {
					while (true) {
						do {
							local901 = (Class5_Sub10) Static11.aClass91_2.method2683();
							if (local901 == null) {
								while (true) {
									do {
										local901 = (Class5_Sub10) Static54.aClass91_8.method2683();
										if (local901 == null) {
											if (Static27.aBoolean23 && Static122.aClass69_11 == null) {
												Static27.aBoolean23 = false;
											}
											if (Static48.aClass69_4 != null) {
												Static35.method550();
											}
											if (Static97.anInt2043 != -1) {
												local81 = Static97.anInt2043;
												local83 = Static98.anInt2089;
												@Pc(1078) boolean local1078 = Static12.method231(0, local83, 0, local81, true, 0, 0, Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], 0, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0], 0);
												if (local1078) {
													Static43.anInt990 = 1;
													Static114.anInt648 = Static175.anInt3521;
													Static101.anInt2161 = 0;
													Static141.anInt2945 = Static179.anInt3572;
												}
												Static97.anInt2043 = -1;
											}
											Static59.method1006();
											if (local689 != Static86.aClass69_6) {
												if (local689 != null) {
													Static184.method2779(local689);
												}
												if (Static86.aClass69_6 != null) {
													Static184.method2779(Static86.aClass69_6);
												}
											}
											if (Static186.aClass69_14 != local849 && Static115.anInt2418 == Static210.anInt923) {
												if (local849 != null) {
													Static184.method2779(local849);
												}
												if (Static186.aClass69_14 != null) {
													Static184.method2779(Static186.aClass69_14);
												}
											}
											if (Static186.aClass69_14 == null) {
												if (Static210.anInt923 > 0) {
													Static210.anInt923--;
												}
											} else if (Static210.anInt923 < Static115.anInt2418) {
												Static210.anInt923++;
												if (Static115.anInt2418 == Static210.anInt923) {
													Static184.method2779(Static186.aClass69_14);
												}
											}
											Static68.method1117();
											if (Static26.aBoolean182) {
												Static111.method1783();
											}
											for (local81 = 0; local81 < 5; local81++) {
												@Pc(1162) int local1162 = Static70.anIntArray140[local81]++;
											}
											local83 = Static35.method593();
											local85 = Static53.method924();
											if (local83 > 4500 && local85 > 4500) {
												Static170.anInt3428 = 250;
												Static15.method267(4000);
												Static43.aClass5_Sub6_Sub1_2.method3087(35);
											}
											Static204.anInt3990++;
											Static18.anInt355++;
											Static11.anInt249++;
											if (Static18.anInt355 > 500) {
												Static18.anInt355 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x1) == 1) {
													Static183.anInt3681 += Static135.anInt2820;
												}
												if ((local102 & 0x2) == 2) {
													Static211.anInt4099 += Static9.anInt213;
												}
												if ((local102 & 0x4) == 4) {
													Static6.anInt153 += Static144.anInt2997;
												}
											}
											if (Static11.anInt249 > 500) {
												Static11.anInt249 = 0;
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x2) == 2) {
													Static109.anInt2292 += Static148.anInt3058;
												}
												if ((local102 & 0x1) == 1) {
													Static79.anInt1777 += Static186.anInt3739;
												}
											}
											if (Static211.anInt4099 < -55) {
												Static9.anInt213 = 2;
											}
											if (Static211.anInt4099 > 55) {
												Static9.anInt213 = -2;
											}
											if (Static183.anInt3681 < -50) {
												Static135.anInt2820 = 2;
											}
											if (Static183.anInt3681 > 50) {
												Static135.anInt2820 = -2;
											}
											if (Static79.anInt1777 < -60) {
												Static186.anInt3739 = 2;
											}
											if (Static6.anInt153 < -40) {
												Static144.anInt2997 = 1;
											}
											if (Static109.anInt2292 < -20) {
												Static148.anInt3058 = 1;
											}
											if (Static79.anInt1777 > 60) {
												Static186.anInt3739 = -2;
											}
											if (Static109.anInt2292 > 10) {
												Static148.anInt3058 = -1;
											}
											if (Static6.anInt153 > 40) {
												Static144.anInt2997 = -1;
											}
											if (Static204.anInt3990 > 50) {
												Static43.aClass5_Sub6_Sub1_2.method3087(56);
											}
											try {
												if (Static157.aClass39_3 != null && Static43.aClass5_Sub6_Sub1_2.anInt4050 > 0) {
													Static157.aClass39_3.method1176(Static43.aClass5_Sub6_Sub1_2.anInt4050, Static43.aClass5_Sub6_Sub1_2.aByteArray56);
													Static204.anInt3990 = 0;
													Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
													return;
												}
												return;
											} catch (@Pc(1379) IOException local1379) {
												Static88.method1473();
												return;
											}
										}
										local906 = local901.aClass69_3;
										if (local906.anInt2475 < 0) {
											break;
										}
										local917 = Static157.method2392(local906.anInt2498);
									} while (local917 == null || local917.aClass69Array2 == null || local917.aClass69Array2.length <= local906.anInt2475 || local917.aClass69Array2[local906.anInt2475] != local906);
									Static184.method2781(local901);
								}
							}
							local906 = local901.aClass69_3;
							if (local906.anInt2475 < 0) {
								break;
							}
							local917 = Static157.method2392(local906.anInt2498);
						} while (local917 == null || local917.aClass69Array2 == null || local906.anInt2475 >= local917.aClass69Array2.length || local917.aClass69Array2[local906.anInt2475] != local906);
						Static184.method2781(local901);
					}
				}
				local906 = local901.aClass69_3;
				if (local906.anInt2475 < 0) {
					break;
				}
				local917 = Static157.method2392(local906.anInt2498);
			} while (local917 == null || local917.aClass69Array2 == null || local906.anInt2475 >= local917.aClass69Array2.length || local906 != local917.aClass69Array2[local906.anInt2475]);
			Static184.method2781(local901);
		}
	}
}
