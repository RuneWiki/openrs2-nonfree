import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_6 = new Class188(4, 1, 1, 1);

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
	public static final int anInt3293 = 1406;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!dw;Z)V")
	public static void method2796(@OriginalArg(1) Class29_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static374.anInt6451 >= 400) {
			return;
		}
		@Pc(12) Class257 local12 = arg0.aClass257_1;
		if (local12.anIntArray571 != null) {
			local12 = local12.method5935(Static505.aClass30_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean504) {
			return;
		}
		@Pc(38) String local38 = local12.aString87;
		if (local12.anInt7155 != 0) {
			@Pc(54) String local54 = Static533.aClass314_4 == Static57.aClass314_1 ? Static141.aClass104_75.method2145(Static470.anInt7957) : Static141.aClass104_73.method2145(Static470.anInt7957);
			local38 = local38 + Static418.method6133(local12.anInt7155, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623) + " (" + local54 + local12.anInt7155 + ")";
		}
		if (Static492.aBoolean560 && !arg1) {
			@Pc(92) Class343 local92 = Static217.anInt3703 == -1 ? null : Static112.aClass307_1.method6811(Static217.anInt3703);
			if ((Static217.anInt3710 & 0x2) != 0 && (local92 == null || local12.method5942(Static217.anInt3703, local92.anInt9461) != local92.anInt9461)) {
				Static246.method3528(0, (long) arg0.anInt8541, 0, Static516.aString112, Static324.anInt5830, 57, Static474.aString98 + " -> <col=ffff00>" + local38, -1, true, false);
			}
		}
		if (!arg1) {
			@Pc(139) String[] local139 = local12.aStringArray26;
			if (Static209.aBoolean240) {
				local139 = Static14.method216(local139);
			}
			@Pc(149) int local149;
			if (local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && (local12.aByte71 == 0 || !local139[local149].equalsIgnoreCase(Static141.aClass104_68.method2145(Static470.anInt7957)))) {
						@Pc(172) byte local172 = 0;
						if (local149 == 0) {
							local172 = 12;
						}
						@Pc(181) int local181 = Static569.anInt9540;
						if (local149 == 1) {
							local172 = 60;
						}
						if (local149 == 2) {
							local172 = 13;
						}
						if (local149 == 3) {
							local172 = 51;
						}
						if (local149 == 4) {
							local172 = 49;
						}
						if (local12.anInt7153 == local149) {
							local181 = local12.anInt7135;
						}
						if (local12.anInt7137 == local149) {
							local181 = local12.anInt7160;
						}
						Static246.method3528(0, (long) arg0.anInt8541, 0, local139[local149], local139[local149].equalsIgnoreCase(Static141.aClass104_68.method2145(Static470.anInt7957)) ? local12.anInt7157 : local181, local172, "<col=ffff00>" + local38, -1, true, false);
					}
				}
			}
			if (local12.aByte71 == 1 && local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && local139[local149].equalsIgnoreCase(Static141.aClass104_68.method2145(Static470.anInt7957))) {
						@Pc(290) short local290 = 0;
						if (local12.anInt7155 > Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623) {
							local290 = 2000;
						}
						@Pc(299) short local299 = 0;
						if (local149 == 0) {
							local299 = 12;
						}
						if (local149 == 1) {
							local299 = 60;
						}
						if (local149 == 2) {
							local299 = 13;
						}
						if (local149 == 3) {
							local299 = 51;
						}
						if (local149 == 4) {
							local299 = 49;
						}
						if (local299 != 0) {
							local299 += local290;
						}
						Static246.method3528(0, (long) arg0.anInt8541, 0, local139[local149], local12.anInt7157, local299, "<col=ffff00>" + local38, -1, true, false);
					}
				}
			}
		}
		Static246.method3528(0, (long) arg0.anInt8541, 0, Static141.aClass104_67.method2145(Static470.anInt7957), Static568.anInt9516, 1004, "<col=ffff00>" + local38, -1, true, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!oa;Lclient!e;)V")
	public static void method2798(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Interface7 arg1) {
		if (Static349.aClass6_Sub1_Sub9_3 == null) {
			return;
		}
		if (Static142.anInt2546 < 10) {
			if (!Static349.aClass251_123.method5856(Static349.aClass6_Sub1_Sub9_3.aString47)) {
				Static142.anInt2546 = Static30.aClass251_82.method5846(Static349.aClass6_Sub1_Sub9_3.aString47) / 10;
				return;
			}
			Static203.method3007();
			Static142.anInt2546 = 10;
		}
		if (Static142.anInt2546 == 10) {
			Static349.anInt7457 = Static349.aClass6_Sub1_Sub9_3.anInt3230 >> 6 << 6;
			Static349.anInt7465 = Static349.aClass6_Sub1_Sub9_3.anInt3228 >> 6 << 6;
			Static349.anInt7466 = (Static349.aClass6_Sub1_Sub9_3.anInt3231 >> 6 << 6) + 64 - Static349.anInt7457;
			Static349.anInt7463 = (Static349.aClass6_Sub1_Sub9_3.anInt3220 >> 6 << 6) + 64 - Static349.anInt7465;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static349.aClass6_Sub1_Sub9_3.method2748(Static218.anInt3718 + (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9), Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9) + Static167.anInt3048, local75)) {
				local77 = local75[1] - Static349.anInt7457;
				local79 = local75[2] - Static349.anInt7465;
			}
			if (!Static48.aBoolean34 && local77 >= 0 && Static349.anInt7466 > local77 && local79 >= 0 && Static349.anInt7463 > local79) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static95.anInt1576 = local77;
				Static387.anInt6906 = local79;
			} else if (Static485.anInt8126 == -1 || Static350.anInt6169 == -1) {
				Static349.aClass6_Sub1_Sub9_3.method2747(Static349.aClass6_Sub1_Sub9_3.anInt3226 >> 14 & 0x3FFF, Static349.aClass6_Sub1_Sub9_3.anInt3226 & 0x3FFF, local75);
				Static387.anInt6906 = local75[2] - Static349.anInt7465;
				Static95.anInt1576 = local75[1] - Static349.anInt7457;
			} else {
				Static349.aClass6_Sub1_Sub9_3.method2747(Static485.anInt8126, Static350.anInt6169, local75);
				Static48.aBoolean34 = false;
				if (local75 != null) {
					Static387.anInt6906 = local75[2] - Static349.anInt7465;
					Static95.anInt1576 = local75[1] - Static349.anInt7457;
				}
				Static350.anInt6169 = -1;
				Static485.anInt8126 = -1;
			}
			if (Static349.aClass6_Sub1_Sub9_3.anInt3229 == 37) {
				Static349.aFloat170 = 3.0F;
				Static349.aFloat169 = 3.0F;
			} else if (Static349.aClass6_Sub1_Sub9_3.anInt3229 == 50) {
				Static349.aFloat170 = 4.0F;
				Static349.aFloat169 = 4.0F;
			} else if (Static349.aClass6_Sub1_Sub9_3.anInt3229 == 75) {
				Static349.aFloat170 = 6.0F;
				Static349.aFloat169 = 6.0F;
			} else if (Static349.aClass6_Sub1_Sub9_3.anInt3229 == 100) {
				Static349.aFloat170 = 8.0F;
				Static349.aFloat169 = 8.0F;
			} else if (Static349.aClass6_Sub1_Sub9_3.anInt3229 == 200) {
				Static349.aFloat170 = 16.0F;
				Static349.aFloat169 = 16.0F;
			} else {
				Static349.aFloat170 = 8.0F;
				Static349.aFloat169 = 8.0F;
			}
			Static349.anInt7455 = (int) Static349.aFloat170 >> 1;
			Static349.aByteArrayArrayArray17 = Static84.method1341(Static349.anInt7455);
			Static155.method2279();
			Static349.method6194();
			Static553.aClass275_194 = new Class275();
			Static349.anInt7454 += (int) (Math.random() * 5.0D) - 2;
			if (Static349.anInt7454 < -8) {
				Static349.anInt7454 = -8;
			}
			if (Static349.anInt7454 > 8) {
				Static349.anInt7454 = 8;
			}
			Static349.anInt7453 += (int) (Math.random() * 5.0D) - 2;
			if (Static349.anInt7453 < -16) {
				Static349.anInt7453 = -16;
			}
			if (Static349.anInt7453 > 16) {
				Static349.anInt7453 = 16;
			}
			Static349.method6195(arg1, Static349.anInt7454 >> 2 << 10, Static349.anInt7453 >> 1);
			Static349.aClass276_3.method6397(1024, 256);
			Static349.aClass245_4.method5766(256, 256);
			Static349.aClass100_3.method2005(4096);
			Static386.aClass91_1.method1859(256);
			Static142.anInt2546 = 20;
		} else if (Static142.anInt2546 == 20) {
			Static193.method2891(true);
			Static349.method6180(arg0, Static349.anInt7454, Static349.anInt7453);
			Static142.anInt2546 = 60;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 60) {
			if (Static349.aClass251_123.method5835(Static349.aClass6_Sub1_Sub9_3.aString47 + "_staticelements")) {
				if (!Static349.aClass251_123.method5856(Static349.aClass6_Sub1_Sub9_3.aString47 + "_staticelements")) {
					return;
				}
				Static349.aClass252_5 = Static158.method2322(Static349.aClass6_Sub1_Sub9_3.aString47 + "_staticelements", Static296.aBoolean667, Static349.aClass251_123);
			} else {
				Static349.aClass252_5 = new Class252(0);
			}
			Static349.method6188();
			Static142.anInt2546 = 70;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 70) {
			Static544.aClass85_8 = new Class85(arg0, 11, true, Static34.aCanvas15);
			Static142.anInt2546 = 73;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 73) {
			Static334.aClass85_6 = new Class85(arg0, 12, true, Static34.aCanvas15);
			Static142.anInt2546 = 76;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 76) {
			Static43.aClass85_2 = new Class85(arg0, 14, true, Static34.aCanvas15);
			Static142.anInt2546 = 79;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 79) {
			Static199.aClass85_5 = new Class85(arg0, 17, true, Static34.aCanvas15);
			Static142.anInt2546 = 82;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 82) {
			Static173.aClass85_4 = new Class85(arg0, 19, true, Static34.aCanvas15);
			Static142.anInt2546 = 85;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 85) {
			Static40.aClass85_1 = new Class85(arg0, 22, true, Static34.aCanvas15);
			Static142.anInt2546 = 88;
			Static193.method2891(true);
			Static220.method3227();
		} else if (Static142.anInt2546 == 88) {
			Static169.aClass85_3 = new Class85(arg0, 26, true, Static34.aCanvas15);
			Static142.anInt2546 = 91;
			Static193.method2891(true);
			Static220.method3227();
		} else {
			Static402.aClass85_7 = new Class85(arg0, 30, true, Static34.aCanvas15);
			Static142.anInt2546 = 100;
			Static193.method2891(true);
			Static220.method3227();
			System.gc();
		}
	}
}
