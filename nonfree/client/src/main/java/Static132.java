import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1229 = Static193.method3027("red:");

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1225 = aClass70_1229;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1226 = Static193.method3027("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[I")
	public static final int[] anIntArray179 = new int[2000];

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public static int anInt2573 = 0;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1227 = Static193.method3027("Freie Welt");

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1228 = aClass70_1226;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1230 = Static193.method3027("::fps ");

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	public static int anInt2576 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1231 = aClass70_1229;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)I")
	public static int method1843() {
		@Pc(7) int local7 = 3;
		if (Static122.anInt2464 < 310) {
			@Pc(20) int local20 = Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7;
			@Pc(24) int local24 = Static54.anInt1158 >> 7;
			@Pc(28) int local28 = Static130.anInt2546 >> 7;
			if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][local28][local24] & 0x4) != 0) {
				local7 = Static137.anInt2795;
			}
			@Pc(45) int local45 = Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7;
			@Pc(57) int local57;
			if (local20 <= local28) {
				local57 = local28 - local20;
			} else {
				local57 = local20 - local28;
			}
			@Pc(74) int local74;
			if (local24 >= local45) {
				local74 = local24 - local45;
			} else {
				local74 = local45 - local24;
			}
			@Pc(94) int local94;
			@Pc(96) int local96;
			if (local74 >= local57) {
				local94 = local57 * 65536 / local74;
				local96 = 32768;
				while (local24 != local45) {
					local96 += local94;
					if (local45 > local24) {
						local24++;
					} else if (local24 > local45) {
						local24--;
					}
					if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][local28][local24] & 0x4) != 0) {
						local7 = Static137.anInt2795;
					}
					if (local96 >= 65536) {
						if (local20 > local28) {
							local28++;
						} else if (local28 > local20) {
							local28--;
						}
						local96 -= 65536;
						if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][local28][local24] & 0x4) != 0) {
							local7 = Static137.anInt2795;
						}
					}
				}
			} else {
				local94 = local74 * 65536 / local57;
				local96 = 32768;
				while (local20 != local28) {
					local96 += local94;
					if (local20 > local28) {
						local28++;
					} else if (local28 > local20) {
						local28--;
					}
					if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][local28][local24] & 0x4) != 0) {
						local7 = Static137.anInt2795;
					}
					if (local96 >= 65536) {
						local96 -= 65536;
						if (local24 < local45) {
							local24++;
						} else if (local24 > local45) {
							local24--;
						}
						if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][local28][local24] & 0x4) != 0) {
							local7 = Static137.anInt2795;
						}
					}
				}
			}
		}
		if ((Static17.aByteArrayArrayArray2[Static137.anInt2795][Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7][Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7] & 0x4) != 0) {
			local7 = Static137.anInt2795;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!ij;)V")
	public static void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26_Sub2_Sub1 arg2) {
		if ((arg1 & 0x2) != 0) {
			arg2.anInt2620 = Static48.aClass3_Sub4_Sub1_43.method1270();
			if (arg2.anInt2620 == 65535) {
				arg2.anInt2620 = -1;
			}
		}
		@Pc(41) int local41;
		if ((arg1 & 0x200) != 0) {
			arg2.anInt2608 = Static48.aClass3_Sub4_Sub1_43.method1295();
			local41 = Static48.aClass3_Sub4_Sub1_43.method1245();
			arg2.anInt2614 = (local41 & 0xFFFF) + Static184.anInt3760;
			arg2.anInt2612 = 0;
			arg2.anInt2592 = 0;
			if (arg2.anInt2608 == 65535) {
				arg2.anInt2608 = -1;
			}
			if (arg2.anInt2614 > Static184.anInt3760) {
				arg2.anInt2592 = -1;
			}
			arg2.anInt2589 = local41 >> 16;
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt2622 = Static48.aClass3_Sub4_Sub1_43.method1295();
			arg2.anInt2631 = Static48.aClass3_Sub4_Sub1_43.method1270();
		}
		if ((arg1 & 0x80) != 0) {
			arg2.aClass70_1235 = Static48.aClass3_Sub4_Sub1_43.method1246();
			if (arg2.aClass70_1235.method2055(0) == 126) {
				arg2.aClass70_1235 = arg2.aClass70_1235.method2019(1);
				Static135.method1934(arg2.aClass70_1235, 2, arg2.aClass70_952);
			} else if (arg2 == Static144.aClass26_Sub2_Sub1_1) {
				Static135.method1934(arg2.aClass70_1235, 2, arg2.aClass70_952);
			}
			arg2.anInt2637 = 0;
			arg2.anInt2632 = 150;
			arg2.anInt2630 = 0;
		}
		@Pc(171) int local171;
		if ((arg1 & 0x8) != 0) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1243();
			local171 = Static48.aClass3_Sub4_Sub1_43.method1286();
			arg2.method1857(Static184.anInt3760, local41, local171);
			arg2.anInt2626 = Static184.anInt3760 + 300;
			arg2.anInt2627 = Static48.aClass3_Sub4_Sub1_43.method1281();
		}
		if ((arg1 & 0x10) != 0) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1270();
			if (local41 == 65535) {
				local41 = -1;
			}
			local171 = Static48.aClass3_Sub4_Sub1_43.method1281();
			Static66.method1003(arg2, local41, local171);
		}
		if ((arg1 & 0x20) != 0) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1278();
			@Pc(228) byte[] local228 = new byte[local41];
			@Pc(233) Class3_Sub4 local233 = new Class3_Sub4(local228);
			Static48.aClass3_Sub4_Sub1_43.method1268(local228, local41);
			Static134.aClass3_Sub4Array1[arg0] = local233;
			arg2.method1356(local233);
		}
		if ((arg1 & 0x100) != 0) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1286();
			local171 = Static48.aClass3_Sub4_Sub1_43.method1243();
			arg2.method1857(Static184.anInt3760, local41, local171);
		}
		if ((arg1 & 0x4) != 0) {
			local41 = Static48.aClass3_Sub4_Sub1_43.method1280();
			local171 = Static48.aClass3_Sub4_Sub1_43.method1278();
			@Pc(288) int local288 = Static48.aClass3_Sub4_Sub1_43.method1286();
			@Pc(291) int local291 = Static48.aClass3_Sub4_Sub1_43.anInt1758;
			if (arg2.aClass70_952 != null && arg2.aClass101_1 != null) {
				@Pc(304) long local304 = arg2.aClass70_952.method2018();
				@Pc(306) boolean local306 = false;
				if (local171 <= 1) {
					for (@Pc(311) int local311 = 0; local311 < Static61.anInt1297; local311++) {
						if (Static183.aLongArray6[local311] == local304) {
							local306 = true;
							break;
						}
					}
				}
				if (!local306 && Static203.anInt4145 == 0) {
					Static75.aClass3_Sub4_1.anInt1758 = 0;
					Static48.aClass3_Sub4_Sub1_43.method1240(Static75.aClass3_Sub4_1.aByteArray12, local288);
					Static75.aClass3_Sub4_1.anInt1758 = 0;
					@Pc(355) boolean local355 = (local41 & 0x8000) != 0;
					@Pc(357) int local357 = -1;
					@Pc(366) Class70 local366;
					if (local355) {
						local41 &= 0x7FFF;
						@Pc(378) Class8 local378 = Static141.method2011(Static75.aClass3_Sub4_1);
						local357 = local378.anInt287;
						local366 = local378.aClass3_Sub3_Sub15_1.method1190(Static75.aClass3_Sub4_1);
					} else {
						local366 = Static173.method3101(Static78.method1147(Static75.aClass3_Sub4_1).method2046());
					}
					arg2.aClass70_1235 = local366.method2056();
					arg2.anInt2637 = local41 & 0xFF;
					arg2.anInt2630 = local41 >> 8;
					arg2.anInt2632 = 150;
					if (local171 == 2) {
						Static199.method3159(local366, local355 ? 17 : 1, local357, Static207.method3296(new Class70[] { Static99.aClass70_996, arg2.aClass70_952 }), null);
					} else if (local171 == 1) {
						Static199.method3159(local366, local355 ? 17 : 1, local357, Static207.method3296(new Class70[] { Static16.aClass70_165, arg2.aClass70_952 }), null);
					} else {
						Static199.method3159(local366, local355 ? 17 : 2, local357, arg2.aClass70_952, null);
					}
				}
			}
			Static48.aClass3_Sub4_Sub1_43.anInt1758 = local288 + local291;
		}
		if ((arg1 & 0x400) == 0) {
			return;
		}
		arg2.anInt2619 = Static48.aClass3_Sub4_Sub1_43.method1286();
		arg2.anInt2588 = Static48.aClass3_Sub4_Sub1_43.method1281();
		arg2.anInt2639 = Static48.aClass3_Sub4_Sub1_43.method1278();
		arg2.anInt2629 = Static48.aClass3_Sub4_Sub1_43.method1278();
		arg2.anInt2624 = Static48.aClass3_Sub4_Sub1_43.method1270() + Static184.anInt3760;
		arg2.anInt2640 = Static48.aClass3_Sub4_Sub1_43.method1270() + Static184.anInt3760;
		arg2.anInt2607 = Static48.aClass3_Sub4_Sub1_43.method1281();
		arg2.anInt2635 = 1;
		arg2.anInt2642 = 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)Lclient!h;")
	public static Class3_Sub10 method1846(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub10 local12 = new Class3_Sub10();
		local12.anInt1429 = arg1;
		local12.anInt1427 = arg2;
		Static144.aClass40_9.method1027(local12, (long) arg0);
		Static101.method1450(arg2);
		@Pc(31) Class6 local31 = Static146.method2127(arg0);
		if (local31 != null) {
			Static9.method237(local31);
		}
		if (Static72.aClass6_40 != null) {
			Static9.method237(Static72.aClass6_40);
			Static72.aClass6_40 = null;
		}
		Static134.aBoolean131 = false;
		Static35.anInt770 = 0;
		Static5.method92(Static199.anInt4049, Static36.anInt795, Static36.anInt796, Static85.anInt1693);
		if (local31 != null) {
			Static83.method1194(local31);
		}
		Static166.method2464(arg2);
		if (Static63.anInt1331 != -1) {
			Static138.method1978(1, Static63.anInt1331);
		}
		return local12;
	}
}
