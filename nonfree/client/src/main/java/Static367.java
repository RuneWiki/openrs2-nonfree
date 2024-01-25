import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "[S")
	public static short[] aShortArray99 = new short[256];

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	public static int anInt6516 = -1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!of;B)V")
	public static void method5068(@OriginalArg(0) Class4_Sub30_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3917();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static58.anInt4352; local12++) {
			local18 = Static144.anIntArray186[local12];
			if ((Static3.aByteArray2[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static3.aByteArray2[local18] = (byte) (Static3.aByteArray2[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method3924(1);
					if (local46 == 0) {
						local7 = Static379.method5163(arg0);
						Static3.aByteArray2[local18] = (byte) (Static3.aByteArray2[local18] | 0x2);
					} else {
						Static79.method1389(local18, arg0);
					}
				}
			}
		}
		arg0.method3925();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3917();
		@Pc(120) int local120;
		for (local18 = 0; local18 < Static58.anInt4352; local18++) {
			local46 = Static144.anIntArray186[local18];
			if ((Static3.aByteArray2[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static3.aByteArray2[local46] = (byte) (Static3.aByteArray2[local46] | 0x2);
					local7--;
				} else {
					local120 = arg0.method3924(1);
					if (local120 == 0) {
						local7 = Static379.method5163(arg0);
						Static3.aByteArray2[local46] = (byte) (Static3.aByteArray2[local46] | 0x2);
					} else {
						Static79.method1389(local46, arg0);
					}
				}
			}
		}
		arg0.method3925();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3917();
		@Pc(191) int local191;
		for (local46 = 0; local46 < Static394.anInt6801; local46++) {
			local120 = Static341.anIntArray532[local46];
			if ((Static3.aByteArray2[local120] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static3.aByteArray2[local120] = (byte) (Static3.aByteArray2[local120] | 0x2);
				} else {
					local191 = arg0.method3924(1);
					if (local191 == 0) {
						local7 = Static379.method5163(arg0);
						Static3.aByteArray2[local120] = (byte) (Static3.aByteArray2[local120] | 0x2);
					} else if (Static382.method5205(arg0, local120)) {
						Static3.aByteArray2[local120] = (byte) (Static3.aByteArray2[local120] | 0x2);
					}
				}
			}
		}
		arg0.method3925();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3917();
		for (local120 = 0; local120 < Static394.anInt6801; local120++) {
			local191 = Static341.anIntArray532[local120];
			if ((Static3.aByteArray2[local191] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static3.aByteArray2[local191] = (byte) (Static3.aByteArray2[local191] | 0x2);
				} else {
					@Pc(272) int local272 = arg0.method3924(1);
					if (local272 == 0) {
						local7 = Static379.method5163(arg0);
						Static3.aByteArray2[local191] = (byte) (Static3.aByteArray2[local191] | 0x2);
					} else if (Static382.method5205(arg0, local191)) {
						Static3.aByteArray2[local191] = (byte) (Static3.aByteArray2[local191] | 0x2);
					}
				}
			}
		}
		arg0.method3925();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static394.anInt6801 = 0;
		Static58.anInt4352 = 0;
		for (local191 = 1; local191 < 2048; local191++) {
			Static3.aByteArray2[local191] = (byte) (Static3.aByteArray2[local191] >> 1);
			@Pc(347) Class6_Sub2_Sub1_Sub1 local347 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local191];
			if (local347 == null) {
				Static341.anIntArray532[Static394.anInt6801++] = local191;
			} else {
				Static144.anIntArray186[Static58.anInt4352++] = local191;
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZZI)V")
	public static void method5072(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static37.method669(arg0, arg3, arg1, arg2, 0, Static190.aClass84_Sub1Array1.length - 1);
		Static405.aClass4_Sub6_2 = null;
		Static284.anInt5184 = 0;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public static void method5075() {
		if (Static130.aClass239_4 != Static371.aClass239_6) {
			try {
				Static459.method3567(Static102.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIILclient!wd;I)V")
	public static void method5076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub44 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt7349 == -1 && arg3.anIntArray643 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3.anInt7341 < arg4) {
			local15 = arg4 - arg3.anInt7341;
		} else if (arg4 < arg3.anInt7342) {
			local15 = arg3.anInt7342 - arg4;
		}
		@Pc(49) int local49 = Static126.aClass67_Sub1_1.anInt5855 * arg3.anInt7343 >> 8;
		if (arg2 > arg3.anInt7339) {
			local15 += arg2 - arg3.anInt7339;
		} else if (arg3.anInt7348 > arg2) {
			local15 += arg3.anInt7348 - arg2;
		}
		if (arg3.anInt7347 == 0 || arg3.anInt7347 < local15 - 64 || Static126.aClass67_Sub1_1.anInt5855 == 0 || arg3.anInt7344 != arg0) {
			if (arg3.aClass4_Sub18_Sub2_3 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(arg3.aClass4_Sub18_Sub2_3);
				arg3.aClass4_Sub18_Sub2_3 = null;
			}
			if (arg3.aClass4_Sub18_Sub2_2 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(arg3.aClass4_Sub18_Sub2_2);
				arg3.aClass4_Sub18_Sub2_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(138) int local138 = (arg3.anInt7347 - local15) * local49 / arg3.anInt7347;
		if (arg3.aClass4_Sub18_Sub2_3 != null) {
			arg3.aClass4_Sub18_Sub2_3.method4553(local138);
		} else if (arg3.anInt7349 >= 0) {
			@Pc(150) Class55 local150 = Static458.method1453(Static354.aClass166_247, arg3.anInt7349, 0);
			if (local150 != null) {
				@Pc(157) Class4_Sub35_Sub1 local157 = local150.method1452().method5373(Static350.aClass21_1);
				@Pc(162) Class4_Sub18_Sub2 local162 = Static463.method4577(local157, local138);
				local162.method4578(-1);
				Static393.aClass4_Sub18_Sub1_1.method2787(local162);
				arg3.aClass4_Sub18_Sub2_3 = local162;
			}
		}
		if (arg3.aClass4_Sub18_Sub2_2 != null) {
			arg3.aClass4_Sub18_Sub2_2.method4553(local138);
			if (!arg3.aClass4_Sub18_Sub2_2.method5857()) {
				arg3.aClass4_Sub18_Sub2_2 = null;
			}
		} else if (arg3.anIntArray643 != null && (arg3.anInt7352 -= arg1) <= 0) {
			@Pc(212) int local212 = (int) ((double) arg3.anIntArray643.length * Math.random());
			@Pc(220) Class55 local220 = Static458.method1453(Static354.aClass166_247, arg3.anIntArray643[local212], 0);
			if (local220 != null) {
				@Pc(227) Class4_Sub35_Sub1 local227 = local220.method1452().method5373(Static350.aClass21_1);
				@Pc(232) Class4_Sub18_Sub2 local232 = Static463.method4577(local227, local138);
				local232.method4578(0);
				Static393.aClass4_Sub18_Sub1_1.method2787(local232);
				arg3.aClass4_Sub18_Sub2_2 = local232;
				arg3.anInt7352 = arg3.anInt7338 + (int) (Math.random() * (double) (arg3.anInt7346 - arg3.anInt7338));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5077(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static422.anInt7120; local11++) {
			if (arg0.equalsIgnoreCase(Static317.aStringArray34[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static252.aStringArray15[local11])) {
				return true;
			}
		}
		return false;
	}
}
