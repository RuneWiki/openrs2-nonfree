import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[[[Lclient!fk;")
	public static Class56[][][] aClass56ArrayArrayArray1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray102 = new boolean[100];

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 method3634() {
		@Pc(24) int local24 = Static101.anIntArray185[0] * Static306.anIntArray618[0];
		@Pc(28) byte[] local28 = Static314.aByteArrayArray130[0];
		@Pc(88) Class3_Sub4_Sub12_Sub2 local88;
		if (Static314.aBooleanArray138[0]) {
			@Pc(36) byte[] local36 = Static281.aByteArrayArray106[0];
			@Pc(39) int[] local39 = new int[local24];
			for (@Pc(41) int local41 = 0; local41 < local24; local41++) {
				local39[local41] = Static299.anIntArray611[local28[local41] & 0xFF] | (local36[local41] & 0xFF) << 24;
			}
			local88 = new Class3_Sub4_Sub12_Sub2_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[0], Static35.anIntArray54[0], Static101.anIntArray185[0], Static306.anIntArray618[0], local39);
		} else {
			@Pc(93) int[] local93 = new int[local24];
			for (@Pc(95) int local95 = 0; local95 < local24; local95++) {
				local93[local95] = Static299.anIntArray611[local28[local95] & 0xFF];
			}
			local88 = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[0], Static35.anIntArray54[0], Static101.anIntArray185[0], Static306.anIntArray618[0], local93);
		}
		Static6.method108();
		return local88;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method3635() {
		if (Static43.aClass74ArrayArray1 == null) {
			return;
		}
		@Pc(20) Class74 local20 = new Class74();
		for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
			for (@Pc(29) int local29 = 0; local29 < 13; local29++) {
				Static43.aClass74ArrayArray1[local22][local29] = local20;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!qg;IILclient!qg;)I")
	public static int method3637(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class87_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class87_Sub1 arg3) {
		if (arg2 == 1) {
			@Pc(9) int local9 = arg1.anInt4358;
			@Pc(12) int local12 = arg3.anInt4358;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static247.method4164(arg3.method3648().aString105, Static134.anInt4352, arg1.method3648().aString105);
		} else if (arg2 == 3) {
			if (arg1.aString156.equals("-")) {
				if (arg3.aString156.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString156.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static247.method4164(arg3.aString156, Static134.anInt4352, arg1.aString156);
			}
		} else if (arg2 == 4) {
			return arg1.method3646() ? (arg3.method3646() ? 0 : 1) : arg3.method3646() ? -1 : 0;
		} else if (arg2 == 5) {
			return arg1.method3645() ? (arg3.method3645() ? 0 : 1) : arg3.method3645() ? -1 : 0;
		} else if (arg2 == 6) {
			return arg1.method3644() ? (arg3.method3644() ? 0 : 1) : arg3.method3644() ? -1 : 0;
		} else if (arg2 == 7) {
			return arg1.method3640() ? (arg3.method3640() ? 0 : 1) : (arg3.method3640() ? -1 : 0);
		} else {
			return arg1.anInt4366 - arg3.anInt4366;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static171.anInt3219 = 0;
		@Pc(9) int local9;
		@Pc(171) int local171;
		@Pc(200) Class3_Sub4_Sub12[] local200;
		@Pc(248) int local248;
		@Pc(404) int local404;
		@Pc(260) int local260;
		for (local9 = -1; local9 < Static152.anInt2869 + Static118.anInt2202; local9++) {
			@Pc(17) Class124 local17 = null;
			@Pc(28) Class10_Sub5 local28;
			if (local9 < 0) {
				local28 = Static136.aClass10_Sub5_Sub1_1;
			} else if (Static152.anInt2869 > local9) {
				local28 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local9]];
			} else {
				local28 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local9 - Static152.anInt2869]];
				local17 = ((Class10_Sub5_Sub2) local28).aClass124_1;
				if (local17.anIntArray432 != null) {
					local17 = local17.method3191();
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local28.method4189()) {
				Static260.method4351(local28.method4187(), arg4 >> 1, arg2, arg0, arg5 >> 1, local28);
				if (Static244.anInt4957 >= 0) {
					if (local28.aString176 != null && (Static152.anInt2869 <= local9 || Static296.anInt5865 == 0 || Static296.anInt5865 == 3 || Static296.anInt5865 == 1 && Static141.method2394(((Class10_Sub5_Sub1) local28).aString124)) && Static171.anInt3219 < Static3.anInt66) {
						Static3.anIntArray5[Static171.anInt3219] = Static224.aClass3_Sub4_Sub2_14.method3690(local28.aString176) / 2;
						Static3.anIntArray8[Static171.anInt3219] = Static224.aClass3_Sub4_Sub2_14.anInt4400;
						Static3.anIntArray7[Static171.anInt3219] = Static244.anInt4957;
						Static3.anIntArray3[Static171.anInt3219] = Static67.anInt1246;
						Static3.anIntArray9[Static171.anInt3219] = local28.anInt5092;
						Static3.anIntArray4[Static171.anInt3219] = local28.anInt5048;
						Static3.anIntArray6[Static171.anInt3219] = local28.anInt5093;
						Static3.aStringArray1[Static171.anInt3219] = local28.aString176;
						Static171.anInt3219++;
					}
					@Pc(160) Class3_Sub4_Sub12 local160 = Static186.aClass3_Sub4_Sub12Array5[0];
					local171 = arg1 + Static67.anInt1246 - Math.max(Static224.aClass3_Sub4_Sub2_14.anInt4399, local160.anInt5729);
					@Pc(183) Class3_Sub4_Sub12 local183;
					if (!local28.aBoolean351 && local28.anInt5064 > Static124.anInt2371) {
						local183 = Static186.aClass3_Sub4_Sub12Array5[1];
						if (local28 instanceof Class10_Sub5_Sub2) {
							@Pc(190) Class10_Sub5_Sub2 local190 = (Class10_Sub5_Sub2) local28;
							local200 = (Class3_Sub4_Sub12[]) Static191.aClass98_31.method2570((long) local190.aClass124_1.anInt3760);
							if (local200 == null) {
								local200 = Static276.method4531(local190.aClass124_1.anInt3760, Static65.aClass155_31);
								if (local200 != null) {
									Static191.aClass98_31.method2568(local200, (long) local190.aClass124_1.anInt3760);
								}
							}
							if (local200 != null && local200.length == 2) {
								local183 = local200[1];
								local160 = local200[0];
							}
						}
						local248 = arg3 + Static244.anInt4957 - (local160.anInt5728 >> 1);
						local160.method4697(local248, local171);
						local260 = local160.anInt5728 * local28.anInt5026 / 255;
						if (Static283.aBoolean393) {
							Static234.method3980(local248, local171, local248 + local260, local160.anInt5729 + local171);
						} else {
							Static143.method2440(local248, local171, local248 + local260, local160.anInt5729 + local171);
						}
						local183.method4697(local248, local171);
						if (Static283.aBoolean393) {
							Static234.method3975(arg3, arg1, arg4 + arg3, arg5 + arg1);
						} else {
							Static143.method2449(arg3, arg1, arg3 + arg4, arg5 + arg1);
						}
					}
					local171 -= 2;
					if (!local28.aBoolean351) {
						if (Static152.anInt2869 > local9) {
							@Pc(325) Class10_Sub5_Sub1 local325 = (Class10_Sub5_Sub1) local28;
							if (local325.anInt3582 != -1) {
								local171 -= 25;
								Static300.aClass3_Sub4_Sub12Array11[local325.anInt3582].method4697(Static244.anInt4957 + arg3 - 12, local171);
								local171 -= 2;
							}
							if (local325.anInt3588 != -1) {
								local171 -= 25;
								Static86.aClass3_Sub4_Sub12Array3[local325.anInt3588].method4697(arg3 + Static244.anInt4957 - 12, local171);
								local171 -= 2;
							}
						} else if (local17.anInt3786 >= 0 && local17.anInt3786 < Static86.aClass3_Sub4_Sub12Array3.length) {
							local183 = Static86.aClass3_Sub4_Sub12Array3[local17.anInt3786];
							local171 -= 25;
							local183.method4697(arg3 + Static244.anInt4957 - (local183.anInt5728 >> 1), local171);
							local171 -= 2;
						}
					}
					@Pc(416) Class121 local416;
					@Pc(436) Class3_Sub4_Sub12 local436;
					@Pc(406) Class121[] local406;
					if (!(local28 instanceof Class10_Sub5_Sub1)) {
						local404 = 0;
						local260 = 0;
						local406 = Static51.aClass121Array1;
						while (local260 < local406.length) {
							local416 = local406[local260];
							if (local416 != null && local416.anInt3691 == 1 && local416.anInt3690 == Static253.anIntArray547[local9 - Static152.anInt2869]) {
								local436 = Static270.aClass3_Sub4_Sub12Array10[local416.anInt3699];
								if (local436.anInt5729 > local404) {
									local404 = local436.anInt5729;
								}
								if (Static124.anInt2371 % 20 < 10) {
									local436.method4697(arg3 + Static244.anInt4957 - 12, -local436.anInt5729 + local171);
								}
							}
							local260++;
						}
						if (local404 <= 0) {
						}
					} else if (local9 >= 0) {
						local404 = 0;
						local406 = Static51.aClass121Array1;
						for (local260 = 0; local260 < local406.length; local260++) {
							local416 = local406[local260];
							if (local416 != null && local416.anInt3691 == 10 && local416.anInt3690 == Static102.anIntArray188[local9]) {
								local436 = Static270.aClass3_Sub4_Sub12Array10[local416.anInt3699];
								if (local436.anInt5729 > local404) {
									local404 = local436.anInt5729;
								}
								local436.method4697(arg3 + Static244.anInt4957 - 12, local171 - local436.anInt5729);
							}
						}
						if (local404 <= 0) {
						}
					}
					for (local404 = 0; local404 < 4; local404++) {
						if (local28.anIntArray536[local404] > Static124.anInt2371) {
							local248 = local28.method4187() / 2;
							Static260.method4351(local248, arg4 >> 1, arg2, arg0, arg5 >> 1, local28);
							if (Static244.anInt4957 > -1) {
								if (local404 == 1) {
									Static67.anInt1246 -= 20;
								}
								if (local404 == 2) {
									Static244.anInt4957 -= 15;
									Static67.anInt1246 -= 10;
								}
								if (local404 == 3) {
									Static67.anInt1246 -= 10;
									Static244.anInt4957 += 15;
								}
								Static60.aClass3_Sub4_Sub12Array2[local28.anIntArray539[local404]].method4697(Static244.anInt4957 + arg3 - 12, Static67.anInt1246 + arg1 + -12);
								Static25.aClass3_Sub4_Sub2_4.method3684(Integer.toString(local28.anIntArray538[local404]), arg3 + Static244.anInt4957 - 1, arg1 + (Static67.anInt1246 - -3), 16777215, 0);
							}
						}
					}
				}
			}
		}
		@Pc(699) int local699;
		@Pc(681) int local681;
		@Pc(806) int local806;
		@Pc(792) int local792;
		for (local9 = 0; local9 < Static288.anInt5767; local9++) {
			local681 = Static41.anIntArray62[local9];
			@Pc(688) Class10_Sub5 local688;
			if (local681 < 2048) {
				local688 = Static52.aClass10_Sub5_Sub1Array1[local681];
			} else {
				local681 -= 2048;
				local688 = Static110.aClass10_Sub5_Sub2Array1[local681];
			}
			local699 = Static256.anIntArray553[local9];
			@Pc(706) Class10_Sub5 local706;
			if (local699 < 2048) {
				local706 = Static52.aClass10_Sub5_Sub1Array1[local699];
			} else {
				local699 -= 2048;
				local706 = Static110.aClass10_Sub5_Sub2Array1[local699];
			}
			local404 = local688.method4190();
			if (local404 != -1) {
				@Pc(732) Class3_Sub4_Sub12 local732 = (Class3_Sub4_Sub12) Static132.aClass98_17.method2570((long) local404);
				if (local732 == null) {
					local200 = Static276.method4531(local404, Static65.aClass155_31);
					if (local200 != null) {
						local732 = local200[0];
						Static132.aClass98_17.method2568(local732, (long) local404);
					}
				}
				if (local732 != null) {
					local260 = local706.anInt5031++;
					Static137.method2337(local706.anInt5073, local706.anInt5016, local706.method4186() * 64, arg4 >> 1, arg5 >> 1, arg0, 0, arg2);
					local792 = Static67.anInt1246 - 16 - 54;
					@Pc(800) int local800 = local792 + local260 % 4 * 18;
					local806 = Static244.anInt4957 + arg3 - 18;
					@Pc(814) int local814 = local806 + local260 / 4 * 18;
					local732.method4697(local814, local800);
					if (local688 == local706) {
						if (Static283.aBoolean393) {
							Static234.method3979(local814 - 1, local800 + -1, 18, 18, 16776960);
						} else {
							Static143.method2455(local814 - 1, local800 - 1, 18, 18, 16776960);
						}
					}
					if (Static216.anInt4245 >= local814 && local732.anInt5728 + local814 > Static216.anInt4245 && Static79.anInt1910 >= local800 && Static79.anInt1910 < local732.anInt5729 + local800) {
						if (local688 instanceof Class10_Sub5_Sub1) {
							Static88.aLongArray4[0] = (long) local681 << 32;
						} else {
							Static88.aLongArray4[0] = Static41.method572((long) local681 << 32, 536870912L);
						}
						Static120.anInt2259 = 1;
						Static141.aBoolean201 = false;
					}
				}
			}
		}
		for (local9 = 0; local9 < Static171.anInt3219; local9++) {
			@Pc(901) int local901 = Static3.anIntArray3[local9];
			local699 = Static3.anIntArray7[local9];
			local681 = Static3.anIntArray5[local9];
			@Pc(911) boolean local911 = true;
			local171 = Static3.anIntArray8[local9];
			while (local911) {
				local911 = false;
				for (local248 = 0; local248 < local9; local248++) {
					if (Static3.anIntArray3[local248] - Static3.anIntArray8[local248] < local901 + 2 && Static3.anIntArray3[local248] + 2 > -local171 + local901 && local699 - local681 < Static3.anIntArray7[local248] + Static3.anIntArray5[local248] && Static3.anIntArray7[local248] - Static3.anIntArray5[local248] < local699 + local681 && local901 > Static3.anIntArray3[local248] - Static3.anIntArray8[local248]) {
						local911 = true;
						local901 = Static3.anIntArray3[local248] - Static3.anIntArray8[local248];
					}
				}
			}
			Static244.anInt4957 = Static3.anIntArray7[local9];
			Static67.anInt1246 = Static3.anIntArray3[local9] = local901;
			@Pc(1029) String local1029 = Static3.aStringArray1[local9];
			if (Static105.anInt1947 == 0) {
				local260 = 16776960;
				if (Static3.anIntArray9[local9] < 6) {
					local260 = Static10.anIntArray17[Static3.anIntArray9[local9]];
				}
				if (Static3.anIntArray9[local9] == 6) {
					local260 = Static289.anInt5783 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static3.anIntArray9[local9] == 7) {
					local260 = Static289.anInt5783 % 20 < 10 ? 255 : 65535;
				}
				if (Static3.anIntArray9[local9] == 8) {
					local260 = Static289.anInt5783 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static3.anIntArray9[local9] == 9) {
					local806 = 150 - Static3.anIntArray6[local9];
					if (local806 < 50) {
						local260 = local806 * 1280 + 16711680;
					} else if (local806 < 100) {
						local260 = 16776960 + 16384000 - local806 * 327680;
					} else if (local806 < 150) {
						local260 = local806 * 5 + 65280 - 500;
					}
				}
				if (Static3.anIntArray9[local9] == 10) {
					local806 = 150 - Static3.anIntArray6[local9];
					if (local806 < 50) {
						local260 = local806 * 5 + 16711680;
					} else if (local806 < 100) {
						local260 = 16384000 + 16711935 - local806 * 327680;
					} else if (local806 < 150) {
						local260 = (local806 - 100) * 327680 + 255 - (local806 - 100) * 5;
					}
				}
				if (Static3.anIntArray9[local9] == 11) {
					local806 = 150 - Static3.anIntArray6[local9];
					if (local806 < 50) {
						local260 = 16777215 - local806 * 327685;
					} else if (local806 < 100) {
						local260 = local806 * 327685 + 65280 - 16384250;
					} else if (local806 < 150) {
						local260 = 49545215 - local806 * 327680;
					}
				}
				if (Static3.anIntArray4[local9] == 0) {
					Static224.aClass3_Sub4_Sub2_14.method3684(local1029, Static244.anInt4957 + arg3, Static67.anInt1246 + arg1, local260, 0);
				}
				if (Static3.anIntArray4[local9] == 1) {
					Static224.aClass3_Sub4_Sub2_14.method3705(local1029, Static244.anInt4957 + arg3, arg1 - -Static67.anInt1246, local260, Static289.anInt5783);
				}
				if (Static3.anIntArray4[local9] == 2) {
					Static224.aClass3_Sub4_Sub2_14.method3695(local1029, Static244.anInt4957 + arg3, arg1 - -Static67.anInt1246, local260, Static289.anInt5783);
				}
				if (Static3.anIntArray4[local9] == 3) {
					Static224.aClass3_Sub4_Sub2_14.method3698(local1029, Static244.anInt4957 + arg3, Static67.anInt1246 + arg1, local260, Static289.anInt5783, 150 - Static3.anIntArray6[local9]);
				}
				if (Static3.anIntArray4[local9] == 4) {
					local806 = (150 - Static3.anIntArray6[local9]) * (Static224.aClass3_Sub4_Sub2_14.method3690(local1029) - -100) / 150;
					if (Static283.aBoolean393) {
						Static234.method3980(Static244.anInt4957 + arg3 - 50, arg1, arg3 + Static244.anInt4957 + 50, arg5 + arg1);
					} else {
						Static143.method2440(Static244.anInt4957 + arg3 - 50, arg1, arg3 + Static244.anInt4957 + 50, arg5 + arg1);
					}
					Static224.aClass3_Sub4_Sub2_14.method3685(local1029, arg3 + Static244.anInt4957 + 50 - local806, arg1 - -Static67.anInt1246, local260, 0);
					if (Static283.aBoolean393) {
						Static234.method3975(arg3, arg1, arg3 + arg4, arg1 + arg5);
					} else {
						Static143.method2449(arg3, arg1, arg4 + arg3, arg5 + arg1);
					}
				}
				if (Static3.anIntArray4[local9] == 5) {
					local806 = 150 - Static3.anIntArray6[local9];
					if (Static283.aBoolean393) {
						Static234.method3980(arg3, Static67.anInt1246 + arg1 - Static224.aClass3_Sub4_Sub2_14.anInt4400 - 1, arg3 - -arg4, Static67.anInt1246 + arg1 + 5);
					} else {
						Static143.method2440(arg3, Static67.anInt1246 + arg1 - Static224.aClass3_Sub4_Sub2_14.anInt4400 - 1, arg4 + arg3, arg1 + Static67.anInt1246 + 5);
					}
					local792 = 0;
					if (local806 < 25) {
						local792 = local806 - 25;
					} else if (local806 > 125) {
						local792 = local806 - 125;
					}
					Static224.aClass3_Sub4_Sub2_14.method3684(local1029, arg3 + Static244.anInt4957, local792 + Static67.anInt1246 + arg1, local260, 0);
					if (Static283.aBoolean393) {
						Static234.method3975(arg3, arg1, arg4 + arg3, arg5 + arg1);
					} else {
						Static143.method2449(arg3, arg1, arg4 + arg3, arg5 + arg1);
					}
				}
			} else {
				Static224.aClass3_Sub4_Sub2_14.method3684(local1029, Static244.anInt4957 + arg3, Static67.anInt1246 + arg1, 16776960, 0);
			}
		}
	}
}
