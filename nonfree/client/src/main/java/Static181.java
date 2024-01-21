import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1851 = Static187.method3089("welle:");

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1852 = Static187.method3089(" weitere Optionen");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZI)V")
	public static void method2940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static102.anInt2207 <= arg1 - arg3 && Static116.anInt2488 >= arg1 + arg3 && Static118.anInt2521 <= arg0 - arg3 && Static204.anInt2389 >= arg3 + arg0) {
			Static196.method3216(arg0, arg2, arg3, arg1);
		} else {
			Static133.method1971(arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II[BB)Z")
	public static boolean method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg2);
		@Pc(17) boolean local17 = true;
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local10.method3033();
			if (local23 == 0) {
				return local17;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local10.method3047();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(78) int local78 = local10.method3010() >> 2;
					@Pc(82) int local82 = arg1 + local72;
					@Pc(86) int local86 = arg0 + local66;
					if (local82 > 0 && local86 > 0 && local82 < 103 && local86 < 103) {
						@Pc(107) Class1_Sub3_Sub5 local107 = Static154.method2362(local19);
						if (local78 != 22 || !Static111.aBoolean141 || local107.anInt1406 != 0 || local107.anInt1420 == 1 || local107.aBoolean93) {
							local33 = true;
							if (!local107.method961()) {
								Static28.anInt645++;
								local17 = false;
							}
						}
					}
				}
				local39 = local10.method3047();
				if (local39 == 0) {
					break;
				}
				local10.method3010();
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ge;B)V")
	public static void method2942(@OriginalArg(0) Class8_Sub3 arg0) {
		if (arg0.anInt3593 == Static155.anInt2981 || arg0.anInt3575 == -1 || arg0.anInt3589 != 0 || arg0.anInt3605 + 1 > Static84.method1279(arg0.anInt3575).anIntArray298[arg0.anInt3570]) {
			@Pc(39) int local39 = arg0.anInt3593 - arg0.anInt3613;
			@Pc(45) int local45 = Static155.anInt2981 - arg0.anInt3613;
			@Pc(55) int local55 = arg0.anInt3583 * 64 + arg0.anInt3584 * 128;
			@Pc(65) int local65 = arg0.anInt3583 * 64 + arg0.anInt3572 * 128;
			@Pc(76) int local76 = arg0.anInt3581 * 128 + arg0.anInt3583 * 64;
			@Pc(86) int local86 = arg0.anInt3583 * 64 + arg0.anInt3588 * 128;
			arg0.anInt3606 = ((local39 - local45) * local65 + local86 * local45) / local39;
			arg0.anInt3600 = (local76 * local45 + (local39 - local45) * local55) / local39;
		}
		arg0.anInt3567 = 0;
		if (arg0.anInt3604 == 0) {
			arg0.anInt3577 = 1024;
		}
		if (arg0.anInt3604 == 1) {
			arg0.anInt3577 = 1536;
		}
		if (arg0.anInt3604 == 2) {
			arg0.anInt3577 = 0;
		}
		if (arg0.anInt3604 == 3) {
			arg0.anInt3577 = 512;
		}
		arg0.anInt3611 = arg0.anInt3577;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Lclient!ge;B)V")
	public static void method2943(@OriginalArg(0) Class8_Sub3 arg0) {
		arg0.anInt3616 = arg0.anInt3574;
		if (arg0.anInt3578 == 0) {
			arg0.anInt3567 = 0;
			return;
		}
		if (arg0.anInt3575 != -1 && arg0.anInt3589 == 0) {
			@Pc(29) Class1_Sub3_Sub20 local29 = Static84.method1279(arg0.anInt3575);
			if (arg0.anInt3609 > 0 && local29.anInt3387 == 0) {
				arg0.anInt3567++;
				return;
			}
			if (arg0.anInt3609 <= 0 && local29.anInt3395 == 0) {
				arg0.anInt3567++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt3606;
		@Pc(82) int local82 = arg0.anInt3583 * 64 + arg0.anIntArray309[arg0.anInt3578 - 1] * 128;
		@Pc(85) int local85 = arg0.anInt3600;
		@Pc(107) int local107 = arg0.anIntArray312[arg0.anInt3578 - 1] * 128 + arg0.anInt3583 * 64;
		if (local82 - local85 > 256 || local82 - local85 < -256 || local107 - local67 > 256 || local107 - local67 < -256) {
			arg0.anInt3606 = local107;
			arg0.anInt3600 = local82;
			return;
		}
		if (local85 < local82) {
			if (local107 > local67) {
				arg0.anInt3577 = 1280;
			} else if (local67 <= local107) {
				arg0.anInt3577 = 1536;
			} else {
				arg0.anInt3577 = 1792;
			}
		} else if (local85 > local82) {
			if (local107 > local67) {
				arg0.anInt3577 = 768;
			} else if (local67 > local107) {
				arg0.anInt3577 = 256;
			} else {
				arg0.anInt3577 = 512;
			}
		} else if (local107 > local67) {
			arg0.anInt3577 = 1024;
		} else if (local107 < local67) {
			arg0.anInt3577 = 0;
		}
		@Pc(238) int local238 = arg0.anInt3577 - arg0.anInt3611 & 0x7FF;
		if (local238 > 1024) {
			local238 -= 2048;
		}
		@Pc(247) int local247 = arg0.anInt3576;
		@Pc(249) int local249 = 4;
		if (local238 >= -256 && local238 <= 256) {
			local247 = arg0.anInt3610;
		} else if (local238 >= 256 && local238 < 768) {
			local247 = arg0.anInt3602;
		} else if (local238 >= -768 && local238 <= -256) {
			local247 = arg0.anInt3565;
		}
		if (local247 == -1) {
			local247 = arg0.anInt3610;
		}
		arg0.anInt3616 = local247;
		@Pc(298) boolean local298 = true;
		if (arg0 instanceof Class8_Sub3_Sub2) {
			local298 = ((Class8_Sub3_Sub2) arg0).aClass1_Sub3_Sub13_1.aBoolean133;
		}
		if (local298) {
			if (arg0.anInt3611 != arg0.anInt3577 && arg0.anInt3582 == -1 && arg0.anInt3597 != 0) {
				local249 = 2;
			}
			if (arg0.anInt3578 > 2) {
				local249 = 6;
			}
			if (arg0.anInt3578 > 3) {
				local249 = 8;
			}
			if (arg0.anInt3567 > 0 && arg0.anInt3578 > 1) {
				arg0.anInt3567--;
				local249 = 8;
			}
		} else {
			if (arg0.anInt3578 > 1) {
				local249 = 6;
			}
			if (arg0.anInt3578 > 2) {
				local249 = 8;
			}
			if (arg0.anInt3567 > 0 && arg0.anInt3578 > 1) {
				local249 = 8;
				arg0.anInt3567--;
			}
		}
		if (arg0.aBooleanArray14[arg0.anInt3578 - 1]) {
			local249 <<= 0x1;
		}
		if (local249 >= 8 && arg0.anInt3610 == arg0.anInt3616 && arg0.anInt3596 != -1) {
			arg0.anInt3616 = arg0.anInt3596;
		}
		if (local82 > local85) {
			arg0.anInt3600 += local249;
			if (local82 < arg0.anInt3600) {
				arg0.anInt3600 = local82;
			}
		} else if (local82 < local85) {
			arg0.anInt3600 -= local249;
			if (local82 > arg0.anInt3600) {
				arg0.anInt3600 = local82;
			}
		}
		if (local67 < local107) {
			arg0.anInt3606 += local249;
			if (local107 < arg0.anInt3606) {
				arg0.anInt3606 = local107;
			}
		} else if (local107 < local67) {
			arg0.anInt3606 -= local249;
			if (local107 > arg0.anInt3606) {
				arg0.anInt3606 = local107;
			}
		}
		if (arg0.anInt3600 == local82 && arg0.anInt3606 == local107) {
			if (arg0.anInt3609 > 0) {
				arg0.anInt3609--;
			}
			arg0.anInt3578--;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Z")
	public static boolean method2945() throws IOException {
		if (Static27.aClass57_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static27.aClass57_1.method1674();
		if (local13 == 0) {
			return false;
		}
		if (Static177.anInt3812 == -1) {
			local13--;
			Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, 1);
			Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
			Static177.anInt3812 = Static18.aClass1_Sub14_Sub1_2.method3071();
			Static63.anInt3562 = Static16.anIntArray86[Static177.anInt3812];
		}
		if (Static63.anInt3562 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, 1);
			local13--;
			Static63.anInt3562 = Static18.aClass1_Sub14_Sub1_2.aByteArray49[0] & 0xFF;
		}
		if (Static63.anInt3562 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, 2);
			local13 -= 2;
			Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
			Static63.anInt3562 = Static18.aClass1_Sub14_Sub1_2.method3023();
		}
		if (Static63.anInt3562 > local13) {
			return false;
		}
		Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
		Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, Static63.anInt3562);
		Static184.anInt3960 = 0;
		Static153.anInt3183 = Static11.anInt273;
		Static11.anInt273 = Static41.anInt1085;
		Static41.anInt1085 = Static177.anInt3812;
		@Pc(125) int local125;
		if (Static177.anInt3812 == 149) {
			for (local125 = 0; local125 < Static83.anInt1837; local125++) {
				@Pc(131) Class1_Sub3_Sub4 local131 = Static169.method2638(local125);
				if (local131 != null && local131.anInt1160 == 0) {
					Static185.anIntArray329[local125] = 0;
					Static84.anIntArray156[local125] = 0;
				}
			}
			Static147.method2192();
			Static162.anInt3397 += 32;
			Static177.anInt3812 = -1;
			return true;
		} else if (Static177.anInt3812 == 244) {
			Static40.aBoolean199 = false;
			for (local125 = 0; local125 < 5; local125++) {
				Static179.aBooleanArray15[local125] = false;
			}
			Static177.anInt3812 = -1;
			return true;
		} else if (Static177.anInt3812 == 245) {
			Static40.aBoolean199 = true;
			Static98.anInt2070 = Static18.aClass1_Sub14_Sub1_2.method3010();
			Static74.anInt1647 = Static18.aClass1_Sub14_Sub1_2.method3010();
			Static199.anInt4344 = Static18.aClass1_Sub14_Sub1_2.method3023();
			Static17.anInt3483 = Static18.aClass1_Sub14_Sub1_2.method3010();
			Static146.anInt2959 = Static18.aClass1_Sub14_Sub1_2.method3010();
			if (Static146.anInt2959 >= 100) {
				Static186.anInt4074 = Static98.anInt2070 * 128 + 64;
				Static100.anInt2140 = Static74.anInt1647 * 128 + 64;
				Static107.anInt2320 = Static64.method1027(Static100.anInt2140, Static186.anInt4074, Static192.anInt4180) - Static199.anInt4344;
			}
			Static177.anInt3812 = -1;
			return true;
		} else {
			@Pc(260) int local260;
			if (Static177.anInt3812 == 94) {
				for (local125 = 0; local125 < Static47.aClass8_Sub3_Sub1Array1.length; local125++) {
					if (Static47.aClass8_Sub3_Sub1Array1[local125] != null) {
						Static47.aClass8_Sub3_Sub1Array1[local125].anInt3575 = -1;
					}
				}
				for (local260 = 0; local260 < Static177.aClass8_Sub3_Sub2Array1.length; local260++) {
					if (Static177.aClass8_Sub3_Sub2Array1[local260] != null) {
						Static177.aClass8_Sub3_Sub2Array1[local260].anInt3575 = -1;
					}
				}
				Static177.anInt3812 = -1;
				return true;
			}
			@Pc(304) Class11 local304;
			if (Static177.anInt3812 == 186) {
				local125 = Static18.aClass1_Sub14_Sub1_2.method3052();
				local260 = Static18.aClass1_Sub14_Sub1_2.method3046();
				local304 = Static9.method2342(local125);
				if (local260 != local304.anInt311 || local260 == -1) {
					local304.anInt276 = 0;
					local304.anInt271 = 0;
					local304.anInt311 = local260;
					Static73.method1118(local304);
				}
				Static177.anInt3812 = -1;
				return true;
			} else if (Static177.anInt3812 == 15) {
				if (Static22.anInt555 != -1) {
					Static7.method125(Static22.anInt555, 0);
				}
				Static177.anInt3812 = -1;
				return true;
			} else if (Static177.anInt3812 == 67) {
				local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
				Static117.aClass65_7 = Static169.aClass24_4.method559(local125);
				Static177.anInt3812 = -1;
				return true;
			} else if (Static177.anInt3812 == 58) {
				local125 = Static18.aClass1_Sub14_Sub1_2.method3010();
				if (Static18.aClass1_Sub14_Sub1_2.method3010() == 0) {
					Static206.aClass91Array1[local125] = new Class91();
				} else {
					Static18.aClass1_Sub14_Sub1_2.anInt4061--;
					Static206.aClass91Array1[local125] = new Class91(Static18.aClass1_Sub14_Sub1_2);
				}
				Static72.anInt1623 = Static25.anInt588;
				Static177.anInt3812 = -1;
				return true;
			} else if (Static177.anInt3812 == 71) {
				Static36.anInt1017 = Static18.aClass1_Sub14_Sub1_2.method3010();
				Static61.anInt1468 = Static25.anInt588;
				Static177.anInt3812 = -1;
				return true;
			} else {
				@Pc(433) int local433;
				@Pc(431) Class11 local431;
				if (Static177.anInt3812 == 86) {
					local125 = Static18.aClass1_Sub14_Sub1_2.method3054();
					local431 = Static9.method2342(local125);
					for (local433 = 0; local433 < local431.anIntArray29.length; local433++) {
						local431.anIntArray29[local433] = -1;
						local431.anIntArray29[local433] = 0;
					}
					Static73.method1118(local431);
					Static177.anInt3812 = -1;
					return true;
				}
				@Pc(491) int local491;
				@Pc(485) int local485;
				@Pc(507) int local507;
				if (Static177.anInt3812 == 45) {
					local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
					local260 = Static18.aClass1_Sub14_Sub1_2.method3039();
					local433 = local260 >> 10 & 0x1F;
					local485 = local260 & 0x1F;
					local491 = local260 >> 5 & 0x1F;
					@Pc(495) Class11 local495 = Static9.method2342(local125);
					local507 = (local485 << 3) + (local491 << 11) + (local433 << 19);
					if (local495.anInt321 != local507) {
						local495.anInt321 = local507;
						Static73.method1118(local495);
					}
					Static177.anInt3812 = -1;
					return true;
				} else if (Static177.anInt3812 == 100) {
					Static147.method2192();
					Static129.anInt2672 = Static18.aClass1_Sub14_Sub1_2.method3010();
					Static177.anInt3812 = -1;
					Static45.anInt1168 = Static25.anInt588;
					return true;
				} else if (Static177.anInt3812 == 152) {
					local125 = Static18.aClass1_Sub14_Sub1_2.method3054();
					local260 = Static18.aClass1_Sub14_Sub1_2.method3023();
					local304 = Static9.method2342(local125);
					if (local260 == 65535) {
						local260 = -1;
					}
					if (local304.anInt302 != 2 || local260 != local304.anInt250) {
						local304.anInt250 = local260;
						local304.anInt302 = 2;
						Static73.method1118(local304);
					}
					Static177.anInt3812 = -1;
					return true;
				} else if (Static177.anInt3812 == 129) {
					Static177.anInt3805 = Static18.aClass1_Sub14_Sub1_2.method3039() * 30;
					Static45.anInt1168 = Static25.anInt588;
					Static177.anInt3812 = -1;
					return true;
				} else {
					@Pc(678) int local678;
					if (Static177.anInt3812 == 178) {
						local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
						local260 = Static18.aClass1_Sub14_Sub1_2.method3023();
						if (local125 < -70000) {
							local260 += 32768;
						}
						if (local125 < 0) {
							local304 = null;
						} else {
							local304 = Static9.method2342(local125);
						}
						if (local304 != null) {
							for (local491 = 0; local491 < local304.anIntArray29.length; local491++) {
								local304.anIntArray29[local491] = 0;
								local304.anIntArray24[local491] = 0;
							}
						}
						Static169.method2642(local260);
						local491 = Static18.aClass1_Sub14_Sub1_2.method3023();
						for (local485 = 0; local485 < local491; local485++) {
							local507 = Static18.aClass1_Sub14_Sub1_2.method3028();
							if (local507 == 255) {
								local507 = Static18.aClass1_Sub14_Sub1_2.method3058();
							}
							local678 = Static18.aClass1_Sub14_Sub1_2.method3039();
							if (local304 != null && local304.anIntArray29.length > local485) {
								local304.anIntArray29[local485] = local678;
								local304.anIntArray24[local485] = local507;
							}
							Static207.method3380(local507, local485, local260, local678 - 1);
						}
						if (local304 != null) {
							Static73.method1118(local304);
						}
						Static147.method2192();
						Static117.anIntArray188[Static203.anInt4430++ & 0x1F] = local260 & 0x7FFF;
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 57) {
						local125 = Static18.aClass1_Sub14_Sub1_2.method3010();
						local260 = Static18.aClass1_Sub14_Sub1_2.method3010();
						local433 = Static18.aClass1_Sub14_Sub1_2.method3010();
						local491 = Static18.aClass1_Sub14_Sub1_2.method3010();
						local485 = Static18.aClass1_Sub14_Sub1_2.method3023();
						Static179.aBooleanArray15[local125] = true;
						Static150.anIntArray278[local125] = local260;
						Static205.anIntArray363[local125] = local433;
						Static77.anIntArray135[local125] = local491;
						Static83.anIntArray155[local125] = local485;
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 159) {
						Static169.anInt3511 = Static18.aClass1_Sub14_Sub1_2.method3010();
						Static196.anInt4281 = Static18.aClass1_Sub14_Sub1_2.method3010();
						Static29.anInt716 = Static18.aClass1_Sub14_Sub1_2.method3010();
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 229) {
						Static124.aClass92_1222 = Static18.aClass1_Sub14_Sub1_2.method3022();
						Static142.method2099(Static124.aClass92_1222);
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 98) {
						local125 = Static18.aClass1_Sub14_Sub1_2.method3039();
						local260 = Static18.aClass1_Sub14_Sub1_2.method3034();
						local433 = Static18.aClass1_Sub14_Sub1_2.method3027();
						local491 = Static18.aClass1_Sub14_Sub1_2.method3052();
						@Pc(845) Class11 local845 = Static9.method2342(local491);
						if (local125 != local845.anInt258 || local845.anInt317 != local260 || local433 != local845.anInt308) {
							local845.anInt317 = local260;
							local845.anInt258 = local125;
							local845.anInt308 = local433;
							Static73.method1118(local845);
						}
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 208) {
						local125 = Static18.aClass1_Sub14_Sub1_2.method3039();
						local260 = Static18.aClass1_Sub14_Sub1_2.method3039();
						Static129.anInt2670 = local125;
						Static106.anInt2306 = local260;
						Static117.method1725();
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 96) {
						Static103.anInt2229 = Static63.anInt3562 / 8;
						for (local125 = 0; local125 < Static103.anInt2229; local125++) {
							Static57.aLongArray3[local125] = Static18.aClass1_Sub14_Sub1_2.method3057();
							Static75.aClass92Array13[local125] = Static179.method2937(Static57.aLongArray3[local125]);
						}
						Static61.anInt1468 = Static25.anInt588;
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 61) {
						Static120.anInt2555 = 0;
						Static177.anInt3812 = -1;
						return true;
					} else if (Static177.anInt3812 == 21) {
						local125 = Static18.aClass1_Sub14_Sub1_2.method3052();
						@Pc(966) boolean local966 = Static18.aClass1_Sub14_Sub1_2.method3053() == 1;
						local304 = Static9.method2342(local125);
						if (local304.aBoolean24 != local966) {
							local304.aBoolean24 = local966;
							Static73.method1118(local304);
						}
						Static177.anInt3812 = -1;
						return true;
					} else {
						@Pc(1005) Class11 local1005;
						if (Static177.anInt3812 == 4) {
							local125 = Static18.aClass1_Sub14_Sub1_2.method3043();
							local260 = Static18.aClass1_Sub14_Sub1_2.method3029();
							local433 = Static18.aClass1_Sub14_Sub1_2.method3046();
							local1005 = Static9.method2342(local260);
							if (local1005.anInt260 != local125 || local1005.anInt319 != local433) {
								local1005.anInt291 -= local1005.anInt319;
								local1005.anInt255 -= local1005.anInt260;
								local1005.anInt260 = local125;
								local1005.anInt319 = local433;
								local1005.anInt291 += local1005.anInt319;
								local1005.anInt255 += local1005.anInt260;
								Static73.method1118(local1005);
							}
							Static177.anInt3812 = -1;
							return true;
						} else if (Static177.anInt3812 == 117) {
							Static97.anInt2043 = Static18.aClass1_Sub14_Sub1_2.method3053();
							Static208.anInt1132 = Static18.aClass1_Sub14_Sub1_2.method3053();
							Static177.anInt3812 = -1;
							return true;
						} else if (Static177.anInt3812 == 84) {
							local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
							local260 = Static18.aClass1_Sub14_Sub1_2.method3023();
							if (local125 < 0) {
								local304 = null;
							} else {
								local304 = Static9.method2342(local125);
							}
							if (local125 < -70000) {
								local260 += 32768;
							}
							while (Static63.anInt3562 > Static18.aClass1_Sub14_Sub1_2.anInt4061) {
								local491 = Static18.aClass1_Sub14_Sub1_2.method3047();
								local485 = Static18.aClass1_Sub14_Sub1_2.method3023();
								local507 = 0;
								if (local485 != 0) {
									local507 = Static18.aClass1_Sub14_Sub1_2.method3010();
									if (local507 == 255) {
										local507 = Static18.aClass1_Sub14_Sub1_2.method3058();
									}
								}
								if (local304 != null && local491 >= 0 && local304.anIntArray29.length > local491) {
									local304.anIntArray29[local491] = local485;
									local304.anIntArray24[local491] = local507;
								}
								Static207.method3380(local507, local491, local260, local485 - 1);
							}
							if (local304 != null) {
								Static73.method1118(local304);
							}
							Static147.method2192();
							Static117.anIntArray188[Static203.anInt4430++ & 0x1F] = local260 & 0x7FFF;
							Static177.anInt3812 = -1;
							return true;
						} else if (Static177.anInt3812 == 183) {
							Static117.method1731(true);
							Static177.anInt3812 = -1;
							return true;
						} else if (Static177.anInt3812 == 92) {
							local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
							@Pc(1229) Class1_Sub4 local1229 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local125);
							if (local1229 != null) {
								Static151.method2294(true, local1229);
							}
							if (Static82.aClass11_6 != null) {
								Static73.method1118(Static82.aClass11_6);
								Static82.aClass11_6 = null;
							}
							Static177.anInt3812 = -1;
							return true;
						} else {
							@Pc(1379) int local1379;
							@Pc(1277) long local1277;
							@Pc(1255) long local1255;
							@Pc(1386) boolean local1386;
							@Pc(1388) int local1388;
							if (Static177.anInt3812 == 56) {
								Static43.anInt1138 = Static25.anInt588;
								local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
								if (local1255 == 0L) {
									Static138.aClass92_1350 = null;
									Static177.anInt3812 = -1;
									Static68.anInt1566 = 0;
									Static8.aClass1_Sub10Array1 = null;
									Static25.aClass92_256 = null;
									return true;
								}
								local1277 = Static18.aClass1_Sub14_Sub1_2.method3057();
								Static25.aClass92_256 = Static179.method2937(local1277);
								Static138.aClass92_1350 = Static179.method2937(local1255);
								Static177.aByte11 = Static18.aClass1_Sub14_Sub1_2.method3009();
								local485 = Static18.aClass1_Sub14_Sub1_2.method3010();
								if (local485 == 255) {
									Static177.anInt3812 = -1;
									return true;
								}
								Static68.anInt1566 = local485;
								@Pc(1305) Class1_Sub10[] local1305 = new Class1_Sub10[100];
								for (local678 = 0; local678 < Static68.anInt1566; local678++) {
									local1305[local678] = new Class1_Sub10();
									local1305[local678].aLong251 = Static18.aClass1_Sub14_Sub1_2.method3057();
									local1305[local678].aClass92_674 = Static179.method2937(local1305[local678].aLong251);
									local1305[local678].anInt1639 = Static18.aClass1_Sub14_Sub1_2.method3023();
									local1305[local678].aByte6 = Static18.aClass1_Sub14_Sub1_2.method3009();
									local1305[local678].aClass92_675 = Static18.aClass1_Sub14_Sub1_2.method3022();
									if (local1305[local678].aLong251 == Static59.aLong64) {
										Static128.aByte8 = local1305[local678].aByte6;
									}
								}
								local1379 = Static68.anInt1566;
								while (local1379 > 0) {
									local1379--;
									local1386 = true;
									for (local1388 = 0; local1388 < local1379; local1388++) {
										if (local1305[local1388].aClass92_674.method3209(local1305[local1388 + 1].aClass92_674) > 0) {
											local1386 = false;
											@Pc(1412) Class1_Sub10 local1412 = local1305[local1388];
											local1305[local1388] = local1305[local1388 + 1];
											local1305[local1388 + 1] = local1412;
										}
									}
									if (local1386) {
										break;
									}
								}
								Static8.aClass1_Sub10Array1 = local1305;
								Static177.anInt3812 = -1;
								return true;
							} else if (Static177.anInt3812 == 226) {
								local125 = Static18.aClass1_Sub14_Sub1_2.method3023();
								if (local125 == 65535) {
									local125 = -1;
								}
								local260 = Static18.aClass1_Sub14_Sub1_2.method3029();
								local433 = Static18.aClass1_Sub14_Sub1_2.method3058();
								local1005 = Static9.method2342(local260);
								@Pc(1484) Class1_Sub3_Sub22 local1484;
								if (local1005.aBoolean28) {
									local1005.anInt309 = local125;
									local1005.anInt314 = local433;
									local1484 = Static102.method1549(local125);
									local1005.anInt281 = local1484.anInt3860;
									local1005.anInt308 = local1484.anInt3879;
									if (local1005.anInt287 > 0) {
										local1005.anInt308 = local1005.anInt308 * 32 / local1005.anInt287;
									} else if (local1005.anInt307 > 0) {
										local1005.anInt308 = local1005.anInt308 * 32 / local1005.anInt307;
									}
									local1005.anInt328 = local1484.anInt3899;
									local1005.anInt258 = local1484.anInt3877;
									local1005.anInt317 = local1484.anInt3890;
									local1005.anInt323 = local1484.anInt3881;
									Static73.method1118(local1005);
								} else if (local125 == -1) {
									Static177.anInt3812 = -1;
									local1005.anInt302 = 0;
									return true;
								} else {
									local1484 = Static102.method1549(local125);
									local1005.anInt258 = local1484.anInt3877;
									local1005.anInt308 = local1484.anInt3879 * 100 / local433;
									local1005.anInt317 = local1484.anInt3890;
									local1005.anInt302 = 4;
									local1005.anInt250 = local125;
									Static73.method1118(local1005);
								}
								Static177.anInt3812 = -1;
								return true;
							} else if (Static177.anInt3812 == 9) {
								Static101.method1521();
								Static177.anInt3812 = -1;
								return true;
							} else if (Static177.anInt3812 == 111) {
								local125 = Static18.aClass1_Sub14_Sub1_2.method3023();
								local260 = Static18.aClass1_Sub14_Sub1_2.method3028();
								if (local260 == 1) {
									Static138.method2070();
									for (local433 = 0; local433 < 4; local433++) {
										Static98.aClass7Array1[local433].method129();
									}
									System.gc();
								} else if (local260 == 2) {
									Static115.method1717();
									System.gc();
									Static48.method862(25);
								}
								Static22.anInt555 = local125;
								Static29.method548(local125);
								Static175.method2875();
								Static9.method2341(Static22.anInt555);
								for (local433 = 0; local433 < 100; local433++) {
									Static84.aBooleanArray5[local433] = true;
								}
								Static177.anInt3812 = -1;
								return true;
							} else {
								@Pc(1689) boolean local1689;
								@Pc(1673) Class92 local1673;
								if (Static177.anInt3812 == 122) {
									local1673 = Static18.aClass1_Sub14_Sub1_2.method3022();
									@Pc(1687) Class92 local1687;
									if (local1673.method3223(Static208.aClass92_455)) {
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1689 = false;
										local1277 = local1687.method3217();
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (Static57.aLongArray3[local507] == local1277) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											Static145.method2151(Static131.aClass92_1308, local1687, 4);
										}
									} else if (local1673.method3223(Static180.aClass92_2053)) {
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1277 = local1687.method3217();
										local1689 = false;
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (Static57.aLongArray3[local507] == local1277) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											@Pc(2074) Class92 local2074 = local1673.method3208(local1673.method3233() - 9, local1673.method3234(Static176.aClass92_1808) + 1);
											Static145.method2151(local2074, local1687, 8);
										}
									} else if (local1673.method3223(Static57.aClass92_574)) {
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1689 = false;
										local1277 = local1687.method3217();
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (local1277 == Static57.aLongArray3[local507]) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											Static145.method2151(Static26.aClass92_268, local1687, 10);
										}
									} else if (local1673.method3223(Static158.aClass92_1599)) {
										local1687 = local1673.method3208(local1673.method3234(Static158.aClass92_1599), 0);
										Static145.method2151(local1687, Static26.aClass92_268, 11);
									} else if (local1673.method3223(Static128.aClass92_1251)) {
										local1687 = local1673.method3208(local1673.method3234(Static128.aClass92_1251), 0);
										if (Static82.anInt1825 == 0) {
											Static145.method2151(local1687, Static26.aClass92_268, 12);
										}
									} else if (local1673.method3223(Static16.aClass92_433)) {
										local1687 = local1673.method3208(local1673.method3234(Static16.aClass92_433), 0);
										if (Static82.anInt1825 == 0) {
											Static145.method2151(local1687, Static26.aClass92_268, 13);
										}
									} else if (local1673.method3223(Static153.aClass92_1512)) {
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1277 = local1687.method3217();
										local1689 = false;
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (Static57.aLongArray3[local507] == local1277) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											Static145.method2151(Static26.aClass92_268, local1687, 14);
										}
									} else if (local1673.method3223(Static203.aClass92_2025)) {
										local1689 = false;
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1277 = local1687.method3217();
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (Static57.aLongArray3[local507] == local1277) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											Static145.method2151(Static26.aClass92_268, local1687, 15);
										}
									} else if (local1673.method3223(Static167.aClass92_1682)) {
										local1687 = local1673.method3208(local1673.method3234(Static176.aClass92_1808), 0);
										local1277 = local1687.method3217();
										local1689 = false;
										for (local507 = 0; local507 < Static103.anInt2229; local507++) {
											if (local1277 == Static57.aLongArray3[local507]) {
												local1689 = true;
												break;
											}
										}
										if (!local1689 && Static82.anInt1825 == 0) {
											Static145.method2151(Static26.aClass92_268, local1687, 16);
										}
									} else {
										Static145.method2151(local1673, Static26.aClass92_268, 0);
									}
									Static177.anInt3812 = -1;
									return true;
								}
								@Pc(2098) Class92 local2098;
								if (Static177.anInt3812 == 20) {
									local125 = Static18.aClass1_Sub14_Sub1_2.method3010();
									local260 = Static18.aClass1_Sub14_Sub1_2.method3036();
									local2098 = Static18.aClass1_Sub14_Sub1_2.method3022();
									if (local260 >= 1 && local260 <= 8) {
										if (local2098.method3241(Static193.aClass92_1451)) {
											local2098 = null;
										}
										Static145.aClass92Array20[local260 - 1] = local2098;
										Static192.aBooleanArray17[local260 - 1] = local125 == 0;
									}
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 93 || Static177.anInt3812 == 137 || Static177.anInt3812 == 80 || Static177.anInt3812 == 33 || Static177.anInt3812 == 235 || Static177.anInt3812 == 195 || Static177.anInt3812 == 127 || Static177.anInt3812 == 154 || Static177.anInt3812 == 73 || Static177.anInt3812 == 184 || Static177.anInt3812 == 91) {
									Static39.method722();
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 146) {
									local125 = Static18.aClass1_Sub14_Sub1_2.method3058();
									local260 = Static18.aClass1_Sub14_Sub1_2.method3039();
									Static185.anIntArray329[local260] = local125;
									if (local125 != Static84.anIntArray156[local260]) {
										Static84.anIntArray156[local260] = local125;
										Static183.method2956(local260);
									}
									Static101.anIntArray166[Static162.anInt3397++ & 0x1F] = local260;
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 144) {
									@Pc(2235) byte[] local2235 = new byte[Static63.anInt3562];
									Static18.aClass1_Sub14_Sub1_2.method3069(local2235, Static63.anInt3562);
									Static82.method1264(Static66.method1032(local2235, Static63.anInt3562, 0));
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 81) {
									Static147.method2192();
									local125 = Static18.aClass1_Sub14_Sub1_2.method3054();
									local260 = Static18.aClass1_Sub14_Sub1_2.method3053();
									local433 = Static18.aClass1_Sub14_Sub1_2.method3053();
									Static96.anIntArray165[local260] = local125;
									Static38.anIntArray79[local260] = local433;
									Static21.anIntArray47[local260] = 1;
									for (local491 = 0; local491 < 98; local491++) {
										if (local125 >= Class1_Sub3_Sub8.anIntArray132[local491]) {
											Static21.anIntArray47[local260] = local491 + 2;
										}
									}
									Static35.anIntArray75[Static110.anInt2387++ & 0x1F] = local260;
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 104) {
									local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
									local2098 = Static130.method2468(Static38.method708(Static18.aClass1_Sub14_Sub1_2).method3213());
									Static145.method2151(local2098, Static179.method2937(local1255).method3198(), 6);
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 231) {
									local1673 = Static18.aClass1_Sub14_Sub1_2.method3022();
									@Pc(2359) Object[] local2359 = new Object[local1673.method3233() + 1];
									for (local433 = local1673.method3233() - 1; local433 >= 0; local433--) {
										if (local1673.method3231(local433) == 115) {
											local2359[local433 + 1] = Static18.aClass1_Sub14_Sub1_2.method3022();
										} else {
											local2359[local433 + 1] = Integer.valueOf(Static18.aClass1_Sub14_Sub1_2.method3058());
										}
									}
									local2359[0] = Integer.valueOf(Static18.aClass1_Sub14_Sub1_2.method3058());
									@Pc(2413) Class1_Sub24 local2413 = new Class1_Sub24();
									local2413.anObjectArray28 = local2359;
									Static45.method810(local2413);
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 134) {
									Static61.anInt1466 = Static18.aClass1_Sub14_Sub1_2.method3010();
									Static177.anInt3812 = -1;
									return true;
								} else if (Static177.anInt3812 == 162) {
									Static147.method2192();
									Static42.anInt1096 = Static18.aClass1_Sub14_Sub1_2.method3048();
									Static177.anInt3812 = -1;
									Static45.anInt1168 = Static25.anInt588;
									return true;
								} else {
									@Pc(2509) int local2509;
									@Pc(2468) long local2468;
									@Pc(2553) Class92 local2553;
									if (Static177.anInt3812 == 182) {
										local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
										local1277 = Static18.aClass1_Sub14_Sub1_2.method3023();
										local2468 = Static18.aClass1_Sub14_Sub1_2.method3049();
										@Pc(2470) boolean local2470 = false;
										@Pc(2476) long local2476 = local2468 + (local1277 << 32);
										local678 = Static18.aClass1_Sub14_Sub1_2.method3010();
										for (local1388 = 0; local1388 < 100; local1388++) {
											if (Static203.aLongArray9[local1388] == local2476) {
												local2470 = true;
												break;
											}
										}
										if (local678 <= 1) {
											for (local2509 = 0; local2509 < Static103.anInt2229; local2509++) {
												if (local1255 == Static57.aLongArray3[local2509]) {
													local2470 = true;
													break;
												}
											}
										}
										if (!local2470 && Static82.anInt1825 == 0) {
											Static203.aLongArray9[Static49.anInt1255] = local2476;
											Static49.anInt1255 = (Static49.anInt1255 + 1) % 100;
											local2553 = Static130.method2468(Static38.method708(Static18.aClass1_Sub14_Sub1_2).method3213());
											if (local678 == 2 || local678 == 3) {
												Static145.method2151(local2553, Static208.method787(new Class92[] { Static51.aClass92_540, Static179.method2937(local1255).method3198() }), 7);
											} else if (local678 == 1) {
												Static145.method2151(local2553, Static208.method787(new Class92[] { Static158.aClass92_1600, Static179.method2937(local1255).method3198() }), 7);
											} else {
												Static145.method2151(local2553, Static179.method2937(local1255).method3198(), 3);
											}
										}
										Static177.anInt3812 = -1;
										return true;
									} else if (Static177.anInt3812 == 116) {
										Static126.method1850();
										Static177.anInt3812 = -1;
										return false;
									} else if (Static177.anInt3812 == 22) {
										@Pc(2637) byte local2637 = Static18.aClass1_Sub14_Sub1_2.method3031();
										local260 = Static18.aClass1_Sub14_Sub1_2.method3034();
										Static185.anIntArray329[local260] = local2637;
										if (Static84.anIntArray156[local260] != local2637) {
											Static84.anIntArray156[local260] = local2637;
											Static183.method2956(local260);
										}
										Static101.anIntArray166[Static162.anInt3397++ & 0x1F] = local260;
										Static177.anInt3812 = -1;
										return true;
									} else if (Static177.anInt3812 == 238) {
										Static34.method617(Static169.aClass24_4, Static18.aClass1_Sub14_Sub1_2, Static63.anInt3562);
										Static177.anInt3812 = -1;
										return true;
									} else {
										@Pc(2835) int local2835;
										@Pc(2717) Class92 local2717;
										@Pc(2908) Class92 local2908;
										if (Static177.anInt3812 == 143) {
											local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
											local433 = Static18.aClass1_Sub14_Sub1_2.method3023();
											local491 = Static18.aClass1_Sub14_Sub1_2.method3010();
											@Pc(2702) Class92 local2702 = Static26.aClass92_268;
											if (local433 > 0) {
												local2702 = Static18.aClass1_Sub14_Sub1_2.method3022();
											}
											local2717 = Static179.method2937(local1255).method3198();
											for (local678 = 0; local678 < Static78.anInt1731; local678++) {
												if (Static106.aLongArray7[local678] == local1255) {
													if (local433 != Static33.anIntArray61[local678]) {
														Static33.anIntArray61[local678] = local433;
														if (local433 > 0) {
															Static145.method2151(Static208.method787(new Class92[] { local2717, Static83.aClass92_775 }), Static26.aClass92_268, 5);
														}
														if (local433 == 0) {
															Static145.method2151(Static208.method787(new Class92[] { local2717, Static162.aClass92_1651 }), Static26.aClass92_268, 5);
														}
													}
													Static109.aClass92Array16[local678] = local2702;
													local2717 = null;
													Static168.anIntArray306[local678] = local491;
													break;
												}
											}
											if (local2717 != null && Static78.anInt1731 < 200) {
												Static106.aLongArray7[Static78.anInt1731] = local1255;
												Static27.aClass92Array5[Static78.anInt1731] = local2717;
												Static33.anIntArray61[Static78.anInt1731] = local433;
												Static109.aClass92Array16[Static78.anInt1731] = local2702;
												Static168.anIntArray306[Static78.anInt1731] = local491;
												Static78.anInt1731++;
											}
											Static61.anInt1468 = Static25.anInt588;
											local2835 = Static78.anInt1731;
											while (local2835 > 0) {
												local2835--;
												local1386 = true;
												for (local1379 = 0; local1379 < local2835; local1379++) {
													if (Static33.anIntArray61[local1379] != Static183.anInt3929 && Static183.anInt3929 == Static33.anIntArray61[local1379 + 1] || Static33.anIntArray61[local1379] == 0 && Static33.anIntArray61[local1379 + 1] != 0) {
														local1386 = false;
														local1388 = Static33.anIntArray61[local1379];
														Static33.anIntArray61[local1379] = Static33.anIntArray61[local1379 + 1];
														Static33.anIntArray61[local1379 + 1] = local1388;
														local2553 = Static109.aClass92Array16[local1379];
														Static109.aClass92Array16[local1379] = Static109.aClass92Array16[local1379 + 1];
														Static109.aClass92Array16[local1379 + 1] = local2553;
														local2908 = Static27.aClass92Array5[local1379];
														Static27.aClass92Array5[local1379] = Static27.aClass92Array5[local1379 + 1];
														Static27.aClass92Array5[local1379 + 1] = local2908;
														@Pc(2926) long local2926 = Static106.aLongArray7[local1379];
														Static106.aLongArray7[local1379] = Static106.aLongArray7[local1379 + 1];
														Static106.aLongArray7[local1379 + 1] = local2926;
														@Pc(2944) int local2944 = Static168.anIntArray306[local1379];
														Static168.anIntArray306[local1379] = Static168.anIntArray306[local1379 + 1];
														Static168.anIntArray306[local1379 + 1] = local2944;
													}
												}
												if (local1386) {
													break;
												}
											}
											Static177.anInt3812 = -1;
											return true;
										} else if (Static177.anInt3812 == 180) {
											local1673 = Static18.aClass1_Sub14_Sub1_2.method3022();
											local260 = Static18.aClass1_Sub14_Sub1_2.method3054();
											local304 = Static9.method2342(local260);
											if (!local1673.method3243(local304.aClass92_104)) {
												local304.aClass92_104 = local1673;
												Static73.method1118(local304);
											}
											Static177.anInt3812 = -1;
											return true;
										} else if (Static177.anInt3812 == 27) {
											Static97.anInt2043 = Static18.aClass1_Sub14_Sub1_2.method3010();
											Static208.anInt1132 = Static18.aClass1_Sub14_Sub1_2.method3010();
											for (local125 = Static97.anInt2043; local125 < Static97.anInt2043 + 8; local125++) {
												for (local260 = Static208.anInt1132; local260 < Static208.anInt1132 + 8; local260++) {
													if (Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local125][local260] != null) {
														Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local125][local260] = null;
														Static162.method2557(local260, local125);
													}
												}
											}
											for (@Pc(3067) Class1_Sub8 local3067 = (Class1_Sub8) Static73.aClass20_6.method467(); local3067 != null; local3067 = (Class1_Sub8) Static73.aClass20_6.method468()) {
												if (Static97.anInt2043 <= local3067.anInt1251 && Static97.anInt2043 + 8 > local3067.anInt1251 && local3067.anInt1250 >= Static208.anInt1132 && Static208.anInt1132 + 8 > local3067.anInt1250 && Static192.anInt4180 == local3067.anInt1239) {
													local3067.anInt1243 = 0;
												}
											}
											Static177.anInt3812 = -1;
											return true;
										} else {
											@Pc(3256) int local3256;
											if (Static177.anInt3812 == 19) {
												local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
												local433 = Static18.aClass1_Sub14_Sub1_2.method3023();
												@Pc(3142) byte local3142 = Static18.aClass1_Sub14_Sub1_2.method3009();
												local1689 = false;
												if ((local1255 & Long.MIN_VALUE) != 0L) {
													local1689 = true;
												}
												if (local1689) {
													if (Static68.anInt1566 == 0) {
														Static177.anInt3812 = -1;
														return true;
													}
													local1255 &= Long.MAX_VALUE;
													for (local507 = 0; Static68.anInt1566 > local507 && (Static8.aClass1_Sub10Array1[local507].aLong251 != local1255 || local433 != Static8.aClass1_Sub10Array1[local507].anInt1639); local507++) {
													}
													if (Static68.anInt1566 > local507) {
														while (Static68.anInt1566 - 1 > local507) {
															Static8.aClass1_Sub10Array1[local507] = Static8.aClass1_Sub10Array1[local507 + 1];
															local507++;
														}
														Static68.anInt1566--;
														Static8.aClass1_Sub10Array1[Static68.anInt1566] = null;
													}
												} else {
													local2717 = Static18.aClass1_Sub14_Sub1_2.method3022();
													@Pc(3234) Class1_Sub10 local3234 = new Class1_Sub10();
													local3234.aLong251 = local1255;
													local3234.aClass92_674 = Static179.method2937(local3234.aLong251);
													local3234.aByte6 = local3142;
													local3234.anInt1639 = local433;
													local3234.aClass92_675 = local2717;
													for (local3256 = Static68.anInt1566 - 1; local3256 >= 0; local3256--) {
														local2835 = Static8.aClass1_Sub10Array1[local3256].aClass92_674.method3209(local3234.aClass92_674);
														if (local2835 == 0) {
															Static8.aClass1_Sub10Array1[local3256].anInt1639 = local433;
															Static8.aClass1_Sub10Array1[local3256].aByte6 = local3142;
															Static8.aClass1_Sub10Array1[local3256].aClass92_675 = local2717;
															Static177.anInt3812 = -1;
															if (local1255 == Static59.aLong64) {
																Static128.aByte8 = local3142;
															}
															Static43.anInt1138 = Static25.anInt588;
															return true;
														}
														if (local2835 < 0) {
															break;
														}
													}
													if (Static8.aClass1_Sub10Array1.length <= Static68.anInt1566) {
														Static177.anInt3812 = -1;
														return true;
													}
													for (local2835 = Static68.anInt1566 - 1; local2835 > local3256; local2835--) {
														Static8.aClass1_Sub10Array1[local2835 + 1] = Static8.aClass1_Sub10Array1[local2835];
													}
													if (Static68.anInt1566 == 0) {
														Static8.aClass1_Sub10Array1 = new Class1_Sub10[100];
													}
													Static8.aClass1_Sub10Array1[local3256 + 1] = local3234;
													Static68.anInt1566++;
													if (local1255 == Static59.aLong64) {
														Static128.aByte8 = local3142;
													}
												}
												Static177.anInt3812 = -1;
												Static43.anInt1138 = Static25.anInt588;
												return true;
											} else if (Static177.anInt3812 == 222) {
												Static208.method783(Static18.aClass1_Sub14_Sub1_2);
												Static177.anInt3812 = -1;
												return true;
											} else {
												@Pc(3475) Class1_Sub4 local3475;
												@Pc(3531) long local3531;
												if (Static177.anInt3812 == 39) {
													local125 = Static63.anInt3562 + Static18.aClass1_Sub14_Sub1_2.anInt4061;
													local260 = Static18.aClass1_Sub14_Sub1_2.method3023();
													local433 = Static18.aClass1_Sub14_Sub1_2.method3023();
													if (Static22.anInt555 != local260) {
														Static22.anInt555 = local260;
														Static29.method548(Static22.anInt555);
														Static175.method2875();
														Static9.method2341(Static22.anInt555);
														for (local491 = 0; local491 < 100; local491++) {
															Static84.aBooleanArray5[local491] = true;
														}
													}
													while (local433-- > 0) {
														local491 = Static18.aClass1_Sub14_Sub1_2.method3058();
														local485 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local507 = Static18.aClass1_Sub14_Sub1_2.method3010();
														@Pc(3444) Class1_Sub4 local3444 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local491);
														if (local3444 != null && local485 != local3444.anInt490) {
															Static151.method2294(true, local3444);
															local3444 = null;
														}
														if (local3444 == null) {
															local3444 = Static152.method2320(local507, local485, local491);
														}
														local3444.aBoolean36 = true;
													}
													for (local3475 = (Class1_Sub4) Static183.aClass97_21.method3372(); local3475 != null; local3475 = (Class1_Sub4) Static183.aClass97_21.method3377()) {
														if (local3475.aBoolean36) {
															local3475.aBoolean36 = false;
														} else {
															Static151.method2294(true, local3475);
														}
													}
													Static192.aClass97_22 = new Class97(512);
													while (local125 > Static18.aClass1_Sub14_Sub1_2.anInt4061) {
														local485 = Static18.aClass1_Sub14_Sub1_2.method3058();
														local507 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local678 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local3256 = Static18.aClass1_Sub14_Sub1_2.method3058();
														for (local2835 = local507; local2835 <= local678; local2835++) {
															local3531 = ((long) local485 << 32) + (long) local2835;
															Static192.aClass97_22.method3374(new Class1_Sub20(local3256), local3531);
														}
													}
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 47) {
													for (local125 = 0; local125 < Static84.anIntArray156.length; local125++) {
														if (Static84.anIntArray156[local125] != Static185.anIntArray329[local125]) {
															Static84.anIntArray156[local125] = Static185.anIntArray329[local125];
															Static183.method2956(local125);
															Static101.anIntArray166[Static162.anInt3397++ & 0x1F] = local125;
														}
													}
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 227) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3027();
													local260 = Static18.aClass1_Sub14_Sub1_2.method3039();
													local433 = Static18.aClass1_Sub14_Sub1_2.method3058();
													local1005 = Static9.method2342(local433);
													Static177.anInt3812 = -1;
													local1005.anInt261 = (local260 << 16) + local125;
													return true;
												} else if (Static177.anInt3812 == 156) {
													Static208.anInt1132 = Static18.aClass1_Sub14_Sub1_2.method3028();
													Static97.anInt2043 = Static18.aClass1_Sub14_Sub1_2.method3028();
													while (Static18.aClass1_Sub14_Sub1_2.anInt4061 < Static63.anInt3562) {
														Static177.anInt3812 = Static18.aClass1_Sub14_Sub1_2.method3010();
														Static39.method722();
													}
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 230) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3029();
													local431 = Static9.method2342(local125);
													local431.anInt302 = 3;
													local431.anInt250 = Static15.aClass8_Sub3_Sub1_1.aClass95_18.method3302();
													Static73.method1118(local431);
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 115) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3034();
													Static79.method1210(local125);
													Static117.anIntArray188[Static203.anInt4430++ & 0x1F] = local125 & 0x7FFF;
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 0) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3023();
													if (local125 == 65535) {
														local125 = -1;
													}
													local260 = Static18.aClass1_Sub14_Sub1_2.method3010();
													local433 = Static18.aClass1_Sub14_Sub1_2.method3023();
													Static173.method2740(local433, local260, local125);
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 95) {
													Static208.method785();
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 14) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3023();
													if (local125 == 65535) {
														local125 = -1;
													}
													local260 = Static18.aClass1_Sub14_Sub1_2.method3052();
													local304 = Static9.method2342(local260);
													if (local304.anInt302 != 1 || local304.anInt250 != local125) {
														local304.anInt302 = 1;
														local304.anInt250 = local125;
														Static73.method1118(local304);
													}
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 113) {
													local125 = Static18.aClass1_Sub14_Sub1_2.method3036();
													local260 = Static18.aClass1_Sub14_Sub1_2.method3036();
													local433 = Static18.aClass1_Sub14_Sub1_2.method3010();
													Static192.anInt4180 = local125 >> 1;
													Static15.aClass8_Sub3_Sub1_1.method2678(local260, local433, (local125 & 0x1) == 1);
													Static177.anInt3812 = -1;
													return true;
												} else if (Static177.anInt3812 == 181) {
													local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
													local433 = Static18.aClass1_Sub14_Sub1_2.method3023();
													@Pc(3869) Class92 local3869 = Static68.method1065(local433).method2383(Static18.aClass1_Sub14_Sub1_2);
													Static100.method1498(null, 19, local433, local3869, Static179.method2937(local1255).method3198());
													Static177.anInt3812 = -1;
													return true;
												} else {
													@Pc(3946) int local3946;
													@Pc(3911) long local3911;
													@Pc(3925) int local3925;
													if (Static177.anInt3812 == 148) {
														local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
														Static18.aClass1_Sub14_Sub1_2.method3009();
														local1277 = Static18.aClass1_Sub14_Sub1_2.method3057();
														local2468 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local3911 = Static18.aClass1_Sub14_Sub1_2.method3049();
														local2835 = Static18.aClass1_Sub14_Sub1_2.method3010();
														local3531 = local3911 + (local2468 << 32);
														@Pc(3923) boolean local3923 = false;
														for (local3925 = 0; local3925 < 100; local3925++) {
															if (local3531 == Static203.aLongArray9[local3925]) {
																local3923 = true;
																break;
															}
														}
														if (local2835 <= 1) {
															for (local3946 = 0; local3946 < Static103.anInt2229; local3946++) {
																if (local1255 == Static57.aLongArray3[local3946]) {
																	local3923 = true;
																	break;
																}
															}
														}
														if (!local3923 && Static82.anInt1825 == 0) {
															Static203.aLongArray9[Static49.anInt1255] = local3531;
															Static49.anInt1255 = (Static49.anInt1255 + 1) % 100;
															@Pc(3987) Class92 local3987 = Static130.method2468(Static38.method708(Static18.aClass1_Sub14_Sub1_2).method3213());
															if (local2835 == 2 || local2835 == 3) {
																Static204.method1661(Static179.method2937(local1277).method3198(), Static208.method787(new Class92[] { Static51.aClass92_540, Static179.method2937(local1255).method3198() }), local3987);
															} else if (local2835 == 1) {
																Static204.method1661(Static179.method2937(local1277).method3198(), Static208.method787(new Class92[] { Static158.aClass92_1600, Static179.method2937(local1255).method3198() }), local3987);
															} else {
																Static204.method1661(Static179.method2937(local1277).method3198(), Static179.method2937(local1255).method3198(), local3987);
															}
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 142) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3039();
														local260 = Static18.aClass1_Sub14_Sub1_2.method3029();
														local304 = Static9.method2342(local260);
														if (local304 != null && local304.anInt326 == 0) {
															if (local304.anInt318 - local304.anInt263 < local125) {
																local125 = local304.anInt318 - local304.anInt263;
															}
															if (local125 < 0) {
																local125 = 0;
															}
															if (local304.anInt297 != local125) {
																local304.anInt297 = local125;
																Static73.method1118(local304);
															}
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 82) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3053();
														local260 = Static18.aClass1_Sub14_Sub1_2.method3027();
														local433 = Static18.aClass1_Sub14_Sub1_2.method3054();
														local3475 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local433);
														if (local3475 != null) {
															Static151.method2294(local3475.anInt490 != local260, local3475);
														}
														Static152.method2320(local125, local260, local433);
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 28) {
														local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
														local1277 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local2468 = Static18.aClass1_Sub14_Sub1_2.method3049();
														@Pc(4193) long local4193 = (local1277 << 32) + local2468;
														local678 = Static18.aClass1_Sub14_Sub1_2.method3010();
														@Pc(4199) boolean local4199 = false;
														local3256 = Static18.aClass1_Sub14_Sub1_2.method3023();
														for (local2509 = 0; local2509 < 100; local2509++) {
															if (Static203.aLongArray9[local2509] == local4193) {
																local4199 = true;
																break;
															}
														}
														if (local678 <= 1) {
															for (local3925 = 0; local3925 < Static103.anInt2229; local3925++) {
																if (local1255 == Static57.aLongArray3[local3925]) {
																	local4199 = true;
																	break;
																}
															}
														}
														if (!local4199 && Static82.anInt1825 == 0) {
															Static203.aLongArray9[Static49.anInt1255] = local4193;
															Static49.anInt1255 = (Static49.anInt1255 + 1) % 100;
															local2908 = Static68.method1065(local3256).method2383(Static18.aClass1_Sub14_Sub1_2);
															if (local678 == 2) {
																Static100.method1498(null, 18, local3256, local2908, Static208.method787(new Class92[] { Static51.aClass92_540, Static179.method2937(local1255).method3198() }));
															} else if (local678 == 1) {
																Static100.method1498(null, 18, local3256, local2908, Static208.method787(new Class92[] { Static158.aClass92_1600, Static179.method2937(local1255).method3198() }));
															} else {
																Static100.method1498(null, 18, local3256, local2908, Static179.method2937(local1255).method3198());
															}
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 10) {
														local1255 = Static18.aClass1_Sub14_Sub1_2.method3057();
														Static18.aClass1_Sub14_Sub1_2.method3009();
														local1277 = Static18.aClass1_Sub14_Sub1_2.method3057();
														local2468 = Static18.aClass1_Sub14_Sub1_2.method3023();
														local3911 = Static18.aClass1_Sub14_Sub1_2.method3049();
														local2835 = Static18.aClass1_Sub14_Sub1_2.method3010();
														local1379 = Static18.aClass1_Sub14_Sub1_2.method3023();
														@Pc(4380) long local4380 = local3911 + (local2468 << 32);
														@Pc(4382) boolean local4382 = false;
														for (local3946 = 0; local3946 < 100; local3946++) {
															if (Static203.aLongArray9[local3946] == local4380) {
																local4382 = true;
																break;
															}
														}
														if (local2835 <= 1) {
															for (@Pc(4407) int local4407 = 0; local4407 < Static103.anInt2229; local4407++) {
																if (Static57.aLongArray3[local4407] == local1255) {
																	local4382 = true;
																	break;
																}
															}
														}
														if (!local4382 && Static82.anInt1825 == 0) {
															Static203.aLongArray9[Static49.anInt1255] = local4380;
															Static49.anInt1255 = (Static49.anInt1255 + 1) % 100;
															@Pc(4455) Class92 local4455 = Static68.method1065(local1379).method2383(Static18.aClass1_Sub14_Sub1_2);
															if (local2835 == 2 || local2835 == 3) {
																Static100.method1498(Static179.method2937(local1277).method3198(), 20, local1379, local4455, Static208.method787(new Class92[] { Static51.aClass92_540, Static179.method2937(local1255).method3198() }));
															} else if (local2835 == 1) {
																Static100.method1498(Static179.method2937(local1277).method3198(), 20, local1379, local4455, Static208.method787(new Class92[] { Static158.aClass92_1600, Static179.method2937(local1255).method3198() }));
															} else {
																Static100.method1498(Static179.method2937(local1277).method3198(), 20, local1379, local4455, Static179.method2937(local1255).method3198());
															}
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 206) {
														Static40.aBoolean199 = true;
														Static106.anInt2307 = Static18.aClass1_Sub14_Sub1_2.method3010();
														Static187.anInt4098 = Static18.aClass1_Sub14_Sub1_2.method3010();
														Static178.anInt3840 = Static18.aClass1_Sub14_Sub1_2.method3023();
														Static207.anInt4461 = Static18.aClass1_Sub14_Sub1_2.method3010();
														Static188.anInt4443 = Static18.aClass1_Sub14_Sub1_2.method3010();
														if (Static188.anInt4443 >= 100) {
															local125 = Static106.anInt2307 * 128 + 64;
															local260 = Static187.anInt4098 * 128 + 64;
															local433 = Static64.method1027(local260, local125, Static192.anInt4180) - Static178.anInt3840;
															local485 = local433 - Static107.anInt2320;
															local491 = local125 - Static186.anInt4074;
															local507 = local260 - Static100.anInt2140;
															local678 = (int) Math.sqrt((double) (local491 * local491 + local507 * local507));
															Static10.anInt243 = (int) (Math.atan2((double) local485, (double) local678) * 325.949D) & 0x7FF;
															Static47.anInt1197 = (int) (Math.atan2((double) local491, (double) local507) * -325.949D) & 0x7FF;
															if (Static10.anInt243 < 128) {
																Static10.anInt243 = 128;
															}
															if (Static10.anInt243 > 383) {
																Static10.anInt243 = 383;
															}
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 191) {
														Static117.method1731(false);
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 97) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3010();
														local260 = local125 >> 6;
														@Pc(4686) Class55 local4686 = new Class55();
														local4686.anInt2276 = local125 & 0x3F;
														local4686.anInt2275 = Static18.aClass1_Sub14_Sub1_2.method3010();
														if (local4686.anInt2275 >= 0 && Static82.aClass1_Sub3_Sub1_Sub1Array13.length > local4686.anInt2275) {
															if (local4686.anInt2276 == 1 || local4686.anInt2276 == 10) {
																local4686.anInt2281 = Static18.aClass1_Sub14_Sub1_2.method3023();
																Static18.aClass1_Sub14_Sub1_2.anInt4061 += 3;
															} else if (local4686.anInt2276 >= 2 && local4686.anInt2276 <= 6) {
																if (local4686.anInt2276 == 2) {
																	local4686.anInt2277 = 64;
																	local4686.anInt2279 = 64;
																}
																if (local4686.anInt2276 == 3) {
																	local4686.anInt2279 = 64;
																	local4686.anInt2277 = 0;
																}
																if (local4686.anInt2276 == 4) {
																	local4686.anInt2277 = 128;
																	local4686.anInt2279 = 64;
																}
																if (local4686.anInt2276 == 5) {
																	local4686.anInt2277 = 64;
																	local4686.anInt2279 = 0;
																}
																if (local4686.anInt2276 == 6) {
																	local4686.anInt2279 = 128;
																	local4686.anInt2277 = 64;
																}
																local4686.anInt2276 = 2;
																local4686.anInt2280 = Static18.aClass1_Sub14_Sub1_2.method3023();
																local4686.anInt2274 = Static18.aClass1_Sub14_Sub1_2.method3023();
																local4686.anInt2278 = Static18.aClass1_Sub14_Sub1_2.method3010();
															}
															local4686.anInt2283 = Static18.aClass1_Sub14_Sub1_2.method3023();
															if (local4686.anInt2283 == 65535) {
																local4686.anInt2283 = -1;
															}
															Static117.aClass55Array1[local260] = local4686;
														}
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 62) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3034();
														if (local125 == 65535) {
															local125 = -1;
														}
														Static42.method733(local125);
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 126) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3039();
														if (local125 == 65535) {
															local125 = -1;
														}
														local260 = Static18.aClass1_Sub14_Sub1_2.method3059();
														Static126.method1851(local125, local260);
														Static177.anInt3812 = -1;
														return true;
													} else if (Static177.anInt3812 == 66) {
														local125 = Static18.aClass1_Sub14_Sub1_2.method3034();
														local260 = Static18.aClass1_Sub14_Sub1_2.method3058();
														local433 = Static18.aClass1_Sub14_Sub1_2.method3052();
														if (local125 == 65535) {
															local125 = -1;
														}
														local491 = Static18.aClass1_Sub14_Sub1_2.method3027();
														if (local491 == 65535) {
															local491 = -1;
														}
														for (local485 = local491; local485 <= local125; local485++) {
															@Pc(4923) long local4923 = ((long) local433 << 32) + (long) local485;
															@Pc(4928) Class1 local4928 = Static192.aClass97_22.method3375(local4923);
															if (local4928 != null) {
																local4928.method3414();
															}
															Static192.aClass97_22.method3374(new Class1_Sub20(local260), local4923);
														}
														Static177.anInt3812 = -1;
														return true;
													} else {
														Static61.method998(null, "T1 - " + Static177.anInt3812 + "," + Static11.anInt273 + "," + Static153.anInt3183 + " - " + Static63.anInt3562);
														Static126.method1850();
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
