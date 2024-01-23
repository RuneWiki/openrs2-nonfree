import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public static int anInt4118 = 0;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	public static int[] anIntArray471 = new int[50];

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public static int anInt4122 = 0;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public static int anInt4126 = -1;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public static int anInt4127 = 0;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "[J")
	public static long[] aLongArray9 = new long[200];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIILclient!bo;)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		if (Static29.anInt626 >= 400) {
			return;
		}
		if (arg3.anIntArray67 != null) {
			arg3 = arg3.method507();
		}
		if (arg3 == null || !arg3.aBoolean58) {
			return;
		}
		@Pc(36) String local36 = arg3.aString21;
		if (arg3.anInt650 != 0) {
			@Pc(48) String local48 = Static107.anInt1994 == 1 ? Static152.aString98 : Static89.aString49;
			local36 = local36 + Static146.method2280(arg3.anInt650, Static28.aClass6_Sub6_Sub2_1.anInt4593) + " (" + local48 + arg3.anInt650 + ")";
		}
		if (Static282.anInt5856 == 1) {
			Static166.method2533(Static149.aString96, arg0, arg1, Static196.aString132 + " -> <col=ffff00>" + local36, (short) 20, Static180.anInt3325, (long) arg2);
		} else if (Static75.aBoolean115) {
			@Pc(328) Class1_Sub2_Sub20 local328 = Static26.anInt574 == -1 ? null : Static47.method4517(Static26.anInt574);
			if ((Static14.anInt367 & 0x2) != 0 && (local328 == null || arg3.method492(local328.anInt5559, Static26.anInt574) != local328.anInt5559)) {
				Static166.method2533(Static222.aString150, arg0, arg1, Static54.aString32 + " -> <col=ffff00>" + local36, (short) 44, Static162.anInt2993, (long) arg2);
			}
		} else {
			@Pc(83) String[] local83 = arg3.aStringArray3;
			if (Static244.aBoolean389) {
				local83 = Static184.method2765(local83);
			}
			@Pc(94) int local94;
			if (local83 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local83[local94] != null && (Static107.anInt1994 != 0 || !local83[local94].equalsIgnoreCase(Static73.aString42))) {
						@Pc(114) byte local114 = 0;
						if (local94 == 0) {
							local114 = 21;
						}
						if (local94 == 1) {
							local114 = 51;
						}
						@Pc(133) int local133 = -1;
						if (local94 == arg3.anInt651) {
							local133 = arg3.anInt645;
						}
						if (arg3.anInt657 == local94) {
							local133 = arg3.anInt654;
						}
						if (local94 == 2) {
							local114 = 41;
						}
						if (local94 == 3) {
							local114 = 11;
						}
						if (local94 == 4) {
							local114 = 12;
						}
						Static166.method2533(local83[local94], arg0, arg1, "<col=ffff00>" + local36, local114, local133, (long) arg2);
					}
				}
			}
			if (Static107.anInt1994 == 0 && local83 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local83[local94] != null && local83[local94].equalsIgnoreCase(Static73.aString42)) {
						@Pc(222) short local222 = 0;
						if (arg3.anInt650 > Static28.aClass6_Sub6_Sub2_1.anInt4593) {
							local222 = 2000;
						}
						@Pc(231) short local231 = 0;
						if (local94 == 0) {
							local231 = 21;
						}
						if (local94 == 1) {
							local231 = 51;
						}
						if (local94 == 2) {
							local231 = 41;
						}
						if (local94 == 3) {
							local231 = 11;
						}
						if (local94 == 4) {
							local231 = 12;
						}
						if (local231 != 0) {
							local231 += local222;
						}
						Static166.method2533(local83[local94], arg0, arg1, "<col=ffff00>" + local36, local231, arg3.anInt669, (long) arg2);
					}
				}
			}
			Static166.method2533(Static179.aString114, arg0, arg1, "<col=ffff00>" + local36, (short) 1005, Static210.anInt4227, (long) arg2);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z")
	public static boolean method3229(@OriginalArg(1) int arg0) {
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (Static65.aClass1_Sub2_Sub2_Sub1_2 == null) {
			if (Static240.aBoolean369 || Static206.aClass1_Sub2_Sub2_9 == null) {
				Static65.aClass1_Sub2_Sub2_Sub1_2 = new Class1_Sub2_Sub2_Sub1(512, 512);
			} else {
				Static65.aClass1_Sub2_Sub2_Sub1_2 = (Class1_Sub2_Sub2_Sub1) Static206.aClass1_Sub2_Sub2_9;
			}
			@Pc(38) int[] local38 = Static65.aClass1_Sub2_Sub2_Sub1_2.anIntArray598;
			local41 = local38.length;
			for (local43 = 0; local43 < local41; local43++) {
				local38[local43] = 1;
			}
			for (local43 = 1; local43 < 103; local43++) {
				local79 = (103 - local43) * 4 * 512 + 24628;
				for (local83 = 1; local83 < 103; local83++) {
					if ((Static242.aByteArrayArrayArray23[arg0][local83][local43] & 0x18) == 0) {
						Static149.method2336(local38, local79, arg0, local83, local43);
					}
					if (arg0 < 3 && (Static242.aByteArrayArrayArray23[arg0 + 1][local83][local43] & 0x8) != 0) {
						Static149.method2336(local38, local79, arg0 + 1, local83, local43);
					}
					local79 += 4;
				}
			}
			Static235.anInt4895 = 0;
			for (local43 = 0; local43 < 104; local43++) {
				for (local79 = 0; local79 < 104; local79++) {
					@Pc(166) long local166 = Static287.method4359(Static159.anInt2978, local43 + 0, local79);
					if (local166 != 0L) {
						@Pc(180) Class104 local180 = Static35.method636(Integer.MAX_VALUE & (int) (local166 >>> 32));
						@Pc(183) int local183 = local180.anInt2801;
						@Pc(189) int local189;
						if (local180.anIntArray350 != null) {
							for (local189 = 0; local189 < local180.anIntArray350.length; local189++) {
								if (local180.anIntArray350[local189] != -1) {
									@Pc(207) Class104 local207 = Static35.method636(local180.anIntArray350[local189]);
									if (local207.anInt2801 >= 0) {
										local183 = local207.anInt2801;
										break;
									}
								}
							}
						}
						if (local183 >= 0) {
							local189 = local43;
							@Pc(235) int local235 = local79;
							if (local183 != 22 && local183 != 29 && local183 != 34 && local183 != 36 && local183 != 46 && local183 != 47 && local183 != 48) {
								@Pc(274) int[][] local274 = Static27.aClass2Array1[Static159.anInt2978].anIntArrayArray1;
								for (@Pc(276) int local276 = 0; local276 < 10; local276++) {
									@Pc(284) int local284 = (int) (Math.random() * 4.0D);
									if (local284 == 0 && local189 > 0 && local189 > local43 - 3 && (local274[local189 - 1][local235] & 0x2C0108) == 0) {
										local189--;
									}
									if (local284 == 1 && local189 < 103 && local43 + 3 > local189 && (local274[local189 + 1][local235] & 0x2C0180) == 0) {
										local189++;
									}
									if (local284 == 2 && local235 > 0 && local235 > local79 - 3 && (local274[local189][local235 - 1] & 0x2C0102) == 0) {
										local235--;
									}
									if (local284 == 3 && local235 < 103 && local235 < local79 + 3 && (local274[local189][local235 + 1] & 0x2C0120) == 0) {
										local235++;
									}
								}
							}
							Static135.anIntArray492[Static235.anInt4895] = local180.anInt2819;
							Static100.anIntArray258[Static235.anInt4895] = local189;
							Static183.anIntArray683[Static235.anInt4895] = local235;
							Static235.anInt4895++;
						}
					}
				}
			}
		}
		Static65.aClass1_Sub2_Sub2_Sub1_2.method3932();
		local41 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(472) int local472 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D)) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		for (local43 = 1; local43 < 103; local43++) {
			for (local79 = 1; local79 < 103; local79++) {
				if ((Static242.aByteArrayArrayArray23[arg0][local79][local43] & 0x18) == 0 && !Static1.method4(arg0, local43, local79, local41, local472)) {
					if (Static240.aBoolean369) {
						Static213.anIntArray495 = null;
					} else {
						Static282.aClass23_33.method1012();
					}
					return false;
				}
				if (arg0 < 3 && (Static242.aByteArrayArrayArray23[arg0 + 1][local79][local43] & 0x8) != 0 && !Static1.method4(arg0 + 1, local43, local79, local41, local472)) {
					if (Static240.aBoolean369) {
						Static213.anIntArray495 = null;
					} else {
						Static282.aClass23_33.method1012();
					}
					return false;
				}
			}
		}
		if (Static240.aBoolean369) {
			@Pc(587) int[] local587 = Static65.aClass1_Sub2_Sub2_Sub1_2.anIntArray598;
			local79 = local587.length;
			for (local83 = 0; local83 < local79; local83++) {
				if (local587[local83] == 0) {
					local587[local83] = 1;
				}
			}
			Static206.aClass1_Sub2_Sub2_9 = new Class1_Sub2_Sub2_Sub2(Static65.aClass1_Sub2_Sub2_Sub1_2);
		} else {
			Static206.aClass1_Sub2_Sub2_9 = Static65.aClass1_Sub2_Sub2_Sub1_2;
		}
		if (Static240.aBoolean369) {
			Static213.anIntArray495 = null;
		} else {
			Static282.aClass23_33.method1012();
		}
		Static65.aClass1_Sub2_Sub2_Sub1_2 = null;
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
	public static void method3230() {
		Static155.method2392(Static108.aClass127_7);
		Static61.anInt1268++;
		if (Static259.aBoolean402 && Static109.aBoolean150) {
			@Pc(27) int local27 = Static224.anInt4700;
			local27 -= Static39.anInt853;
			if (local27 < Static14.anInt362) {
				local27 = Static14.anInt362;
			}
			if (Static270.aClass127_15.anInt3567 + Static14.anInt362 < Static108.aClass127_7.anInt3567 + local27) {
				local27 = Static14.anInt362 + Static270.aClass127_15.anInt3567 - Static108.aClass127_7.anInt3567;
			}
			@Pc(66) int local66 = local27 - Static1.anInt1;
			@Pc(68) int local68 = Static293.anInt5833;
			@Pc(71) int local71 = Static108.aClass127_7.anInt3612;
			@Pc(79) int local79 = Static270.aClass127_15.anInt3583 + local27 - Static14.anInt362;
			local68 -= Static108.anInt2042;
			if (Static117.anInt2232 > local68) {
				local68 = Static117.anInt2232;
			}
			if (Static108.aClass127_7.anInt3595 + local68 > Static270.aClass127_15.anInt3595 + Static117.anInt2232) {
				local68 = Static270.aClass127_15.anInt3595 + Static117.anInt2232 - Static108.aClass127_7.anInt3595;
			}
			@Pc(127) int local127 = local68 - Static246.anInt3363;
			if (Static61.anInt1268 > Static108.aClass127_7.anInt3597 && (local71 < local66 || -local71 > local66 || local71 < local127 || -local71 > local127)) {
				Static118.aBoolean166 = true;
			}
			@Pc(166) int local166 = local68 + Static270.aClass127_15.anInt3628 - Static117.anInt2232;
			@Pc(175) Class1_Sub20 local175;
			if (Static108.aClass127_7.anObjectArray25 != null && Static118.aBoolean166) {
				local175 = new Class1_Sub20();
				local175.aClass127_9 = Static108.aClass127_7;
				local175.anInt3133 = local79;
				local175.anInt3123 = local166;
				local175.anObjectArray2 = Static108.aClass127_7.anObjectArray25;
				Static283.method4321(local175);
			}
			if (Static211.anInt959 == 0) {
				if (Static118.aBoolean166) {
					if (Static108.aClass127_7.anObjectArray18 != null) {
						local175 = new Class1_Sub20();
						local175.aClass127_9 = Static108.aClass127_7;
						local175.aClass127_8 = Static261.aClass127_13;
						local175.anInt3133 = local79;
						local175.anObjectArray2 = Static108.aClass127_7.anObjectArray18;
						local175.anInt3123 = local166;
						Static283.method4321(local175);
					}
					if (Static261.aClass127_13 != null && Static43.method797(Static108.aClass127_7) != null) {
						Static270.aClass1_Sub18_Sub1_3.method3130(80);
						Static270.aClass1_Sub18_Sub1_3.method3100(Static261.aClass127_13.anInt3573);
						Static270.aClass1_Sub18_Sub1_3.method3119(Static108.aClass127_7.anInt3574);
						Static270.aClass1_Sub18_Sub1_3.method3102(Static108.aClass127_7.anInt3573);
						Static270.aClass1_Sub18_Sub1_3.method3106(Static261.aClass127_13.anInt3574);
					}
				} else if ((Static276.anInt5540 == 1 || Static150.method2339(Static29.anInt626 - 1)) && Static29.anInt626 > 2) {
					Static167.method2549();
				} else if (Static29.anInt626 > 0) {
					Static72.method1184();
				}
				Static108.aClass127_7 = null;
			}
		} else if (Static61.anInt1268 > 1) {
			Static108.aClass127_7 = null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	public static void method3231() {
		if (Static224.anInt4701 == 5) {
			Static224.anInt4701 = 6;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lclient!t;")
	public static Class152_Sub1 method3232(@OriginalArg(1) int arg0) {
		return Static103.aBoolean139 && arg0 >= Static4.anInt162 && Static249.anInt5052 >= arg0 ? Static46.aClass152_Sub1Array2[arg0 - Static4.anInt162] : null;
	}
}
