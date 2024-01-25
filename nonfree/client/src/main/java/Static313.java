import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!hi;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "[Lclient!gh;")
	public static Class73[] aClass73Array39;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "Lclient!aj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!on;")
	public static Class146 aClass146_15;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	public static int anInt6327;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "J")
	public static long aLong191;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	public static int anInt6324 = 0;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "Lclient!ts;")
	public static Class193 aClass193_9 = null;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)V")
	public static void method5504(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static147.aClass4_2 = Static5.method4241(Static274.anInterface7_5, Static177.aClass168_2, Static7.anInt152 * 2, Static240.aCanvas4, arg1);
		} else {
			if (arg0) {
				Static147.aClass4_2 = Static5.method4241(Static274.anInterface7_5, Static177.aClass168_2, 0, Static240.aCanvas4, 0);
				Static147.aClass4_2.method4283(0);
				@Pc(37) Class188 local37 = Static154.method5669(Static106.anInt2392, Static318.aClass191_204);
				@Pc(46) Class37 local46 = Static147.aClass4_2.method4305(local37, Static361.method2367(Static59.aClass191_35, Static106.anInt2392));
				Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455), local46);
				Static147.aClass4_2.method4298();
				Static183.method3318();
				Static147.aClass4_2.method4238();
			}
			try {
				Static147.aClass4_2 = Static5.method4241(Static274.anInterface7_5, Static177.aClass168_2, Static7.anInt152 * 2, Static240.aCanvas4, arg1);
			} catch (@Pc(73) Throwable local73) {
				arg1 = 0;
				Static147.aClass4_2 = Static5.method4241(Static274.anInterface7_5, Static177.aClass168_2, 0, Static240.aCanvas4, 0);
			}
		}
		if (Static147.aClass4_2.method4278()) {
			@Pc(95) Class2_Sub17 local95 = Static147.aClass4_2.method4293();
			Static147.aClass4_2.method4262(local95);
		}
		Static129.anInt2728 = arg1;
		Static202.method3645();
		if (!Static147.aClass4_2.method4290()) {
			Static30.anInt553 = 1;
		}
		Static147.aClass4_2.method4267(Static30.anInt553);
		Static147.aClass4_2.method4217(0);
		Static88.aClass133_4 = Static147.aClass4_2.method4273();
		Static75.aClass133_3 = Static147.aClass4_2.method4273();
		@Pc(130) int local130 = (int) ((double) Static95.anInt6381 * 34.46D);
		if (Static147.aClass4_2.method4282()) {
			local130 += 128;
		}
		Static147.aClass4_2.method4205(50, local130);
		Static147.aClass4_2.method4229(!Static21.aBoolean59);
		if (Static147.aClass4_2.method4294()) {
			Static327.method5744(Static229.aBoolean222);
		}
		Static229.aBoolean220 = !Static257.method4680();
		Static263.method4786(Static95.anInt6381 >> 3, Static237.anInt4532 >> 3, Static147.aClass4_2);
		Static349.method5959();
		Static235.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!ae;I)Z")
	public static boolean method5505(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static95.anInt6381 - 104) / 2;
		@Pc(17) int local17 = (Static237.anInt4532 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static85.method1908(local29, local25, arg1, local21)) {
						local40 = local29;
						if (Static222.method3911(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static25.method1418(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static75.aClass31_42 = arg0.method4227(local86, 512, 512, 512);
		Static355.method5984();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(178) boolean[][] local178 = new boolean[Static25.anInt1335][Static25.anInt1335];
		@Pc(184) int local184;
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(265) int local265;
		@Pc(271) int local271;
		@Pc(275) int local275;
		@Pc(294) int local294;
		for (@Pc(180) int local180 = local11; local180 < local11 + 104; local180 += Static25.anInt1335) {
			for (local184 = local17; local184 < local17 + 104; local184 += Static25.anInt1335) {
				arg0.method4252(0, 0, Static25.anInt1335 * 4, Static25.anInt1335 * 4);
				arg0.method4283(-16777216);
				for (local201 = arg1; local201 <= 3; local201++) {
					for (local205 = 0; local205 < Static25.anInt1335; local205++) {
						for (local209 = 0; local209 < Static25.anInt1335; local209++) {
							local178[local205][local209] = Static85.method1908(local201, local184 + local209, arg1, local180 + local205);
						}
					}
					Static265.aClass73Array44[local201].method4923(local180, local184, Static25.anInt1335 + local180, local184 - -Static25.anInt1335, local178);
					if (!Static183.aBoolean319) {
						for (local209 = -4; local209 < Static25.anInt1335; local209++) {
							for (local265 = -4; local265 < Static25.anInt1335; local265++) {
								local271 = local209 + local180;
								local275 = local265 + local184;
								if (local271 >= local11 && local275 >= local17 && Static85.method1908(local201, local275, arg1, local271)) {
									local294 = local201;
									if (Static222.method3911(local275, local271)) {
										local294 = local201 - 1;
									}
									if (local294 >= 0) {
										Static197.method3545(local155, local209 * 4, local294, local40, local271, arg0, local275, (Static25.anInt1335 - local265) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static183.aBoolean319) {
					@Pc(344) Class151 local344 = Static169.aClass151Array1[arg1];
					for (local209 = 0; local209 < Static25.anInt1335; local209++) {
						for (local265 = 0; local265 < Static25.anInt1335; local265++) {
							local271 = local209 + local180;
							local275 = local265 + local184;
							local294 = local344.anIntArrayArray128[local271 - local344.anInt4563][local275 - local344.anInt4572];
							if ((local294 & 0x40240000) != 0) {
								arg0.method4261((Static25.anInt1335 - local265) * 4 - 4, local209 * 4, 4, 4, -1713569622);
							} else if ((local294 & 0x800000) != 0) {
								arg0.method4260(4, local209 * 4, (Static25.anInt1335 - local265) * 4 - 4, -1713569622);
							} else if ((local294 & 0x2000000) != 0) {
								arg0.method4220((Static25.anInt1335 - local265) * 4 - 4, local209 * 4 - -3, 4, -1713569622);
							} else if ((local294 & 0x8000000) != 0) {
								arg0.method4260(4, local209 * 4, (Static25.anInt1335 - local265) * 4 + 3 - 4, -1713569622);
							} else if ((local294 & 0x20000000) != 0) {
								arg0.method4220((Static25.anInt1335 - local265) * 4 - 4, local209 * 4, 4, -1713569622);
							}
						}
					}
				}
				arg0.method4246(0, 0, Static25.anInt1335 * 4, Static25.anInt1335 * 4, local174, 2);
				Static75.aClass31_42.method4387((local180 - local11) * 4 + 48, -(Static25.anInt1335 * 4) + 464 - (-local17 + local184) * 4, Static25.anInt1335 * 4, Static25.anInt1335 * 4);
			}
		}
		arg0.method4299();
		arg0.method4283(-16777215);
		Static253.method5944();
		Static311.anInt6289 = 0;
		Class62_Sub1_Sub3.lb.method5991();
		if (!Static183.aBoolean319) {
			for (local184 = local11; local184 < local11 + 104; local184++) {
				for (local201 = local17; local201 < local17 + 104; local201++) {
					for (local205 = arg1; arg1 + 1 >= local205 && local205 <= 3; local205++) {
						if (Static85.method1908(local205, local201, arg1, local184)) {
							@Pc(611) Interface9 local611 = (Interface9) Static104.method4927(local205, local184, local201);
							if (local611 == null) {
								local611 = (Interface9) Static280.method5066(local205, local184, local201, vl.class);
							}
							if (local611 == null) {
								local611 = (Interface9) Static230.method4018(local205, local184, local201);
							}
							if (local611 == null) {
								local611 = (Interface9) Static226.method3034(local205, local184, local201);
							}
							if (local611 != null) {
								@Pc(651) Class96 local651 = Static234.method4051(local611.method5583());
								if (!local651.aBoolean272 || Static58.aBoolean116) {
									local271 = local651.anInt3127;
									if (local651.anIntArray259 != null) {
										for (local275 = 0; local275 < local651.anIntArray259.length; local275++) {
											if (local651.anIntArray259[local275] != -1) {
												@Pc(679) Class96 local679 = Static234.method4051(local651.anIntArray259[local275]);
												if (local679.anInt3127 >= 0) {
													local271 = local679.anInt3127;
												}
											}
										}
									}
									if (local271 >= 0) {
										@Pc(705) boolean local705 = false;
										if (local271 >= 0) {
											@Pc(714) Class120 local714 = Static278.method5042(local271);
											if (local714 != null && local714.aBoolean321) {
												local705 = true;
											}
										}
										local294 = local184;
										@Pc(725) int local725 = local201;
										if (local705) {
											@Pc(732) int[][] local732 = Static169.aClass151Array1[local205].anIntArrayArray128;
											@Pc(737) int local737 = Static169.aClass151Array1[local205].anInt4563;
											@Pc(742) int local742 = Static169.aClass151Array1[local205].anInt4572;
											for (@Pc(744) int local744 = 0; local744 < 10; local744++) {
												@Pc(751) int local751 = (int) (Math.random() * 4.0D);
												if (local751 == 0 && local294 > local11 && local184 - 3 < local294 && (local732[local294 - local737 - 1][local725 - local742] & 0x2C0108) == 0) {
													local294--;
												}
												if (local751 == 1 && local294 < local11 + 104 - 1 && local184 + 3 > local294 && (local732[local294 + 1 - local737][local725 - local742] & 0x2C0180) == 0) {
													local294++;
												}
												if (local751 == 2 && local725 > local17 && local201 - 3 < local725 && (local732[local294 - local737][local725 - local742 - 1] & 0x2C0102) == 0) {
													local725--;
												}
												if (local751 == 3 && local17 + 104 - 1 > local725 && local725 < local201 + 3 && (local732[local294 - local737][local725 + 1 - local742] & 0x2C0120) == 0) {
													local725++;
												}
											}
										}
										Static141.anIntArray242[Static311.anInt6289] = local651.anInt3132;
										Static286.anIntArray421[Static311.anInt6289] = local294;
										Static219.anIntArray333[Static311.anInt6289] = local725;
										Static311.anInt6289++;
									}
								}
							}
						}
					}
				}
			}
			if (Static136.aClass142_3 != null) {
				Static31.aClass191_18.anInt6270 = 1;
				Static113.method2468(64, 1024);
				for (local201 = 0; local201 < Static136.aClass142_3.anInt4249; local201++) {
					local205 = Static136.aClass142_3.anIntArray334[local201];
					if (local205 >> 28 == Static182.anInt3603) {
						local209 = (local205 >> 14 & 0x3FFF) - Static138.anInt2879;
						local265 = (local205 & 0x3FFF) - Static342.anInt6864;
						if (local209 >= 0 && local209 < Static95.anInt6381 && local265 >= 0 && Static237.anInt4532 > local265) {
							Class62_Sub1_Sub3.lb.method5995(new Class2_Sub42(local201));
						} else {
							@Pc(1025) Class120 local1025 = Static278.method5042(Static136.aClass142_3.anIntArray335[local201]);
							if (local1025.anIntArray297 != null && local1025.anInt3654 + local209 >= 0 && Static95.anInt6381 > local1025.anInt3641 + local209 && local265 + local1025.anInt3647 >= 0 && local1025.anInt3666 + local265 < Static237.anInt4532) {
								Class62_Sub1_Sub3.lb.method5995(new Class2_Sub42(local201));
							}
						}
					}
				}
				Static113.method2468(64, 128);
				Static31.aClass191_18.anInt6270 = 2;
				Static31.aClass191_18.method5432();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	public static void method5506() {
		Static93.aClass119_54.method3315(5);
		Static277.aClass119_169.method3315(5);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZII[ILclient!p;IIIIIII[I)I")
	public static int method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class151 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static350.anIntArrayArray185[local3][local7] = 0;
				Static130.anIntArrayArray137[local3][local7] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg7 == 1) {
			local58 = Static97.method5918(arg1, arg11, arg12, arg5, arg0, arg9, arg3, arg6, arg8, arg10);
		} else if (arg7 == 2) {
			local58 = Static163.method1561(arg6, arg10, arg9, arg1, arg11, arg5, arg8, arg3, arg0, arg12);
		} else {
			local58 = Static141.method2769(arg0, arg7, arg9, arg11, arg3, arg10, arg6, arg8, arg12, arg5, arg1);
		}
		@Pc(98) int local98 = arg3 - 64;
		@Pc(102) int local102 = arg11 - 64;
		@Pc(104) int local104 = Static81.anInt1750;
		@Pc(106) int local106 = Static251.anInt4951;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		if (!local58) {
			if (!arg2) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local123 = arg1 - 10; local123 <= arg1 + 10; local123++) {
				for (@Pc(129) int local129 = arg9 - 10; local129 <= arg9 + 10; local129++) {
					@Pc(136) int local136 = local123 - local98;
					@Pc(141) int local141 = local129 - local102;
					if (local136 >= 0 && local141 >= 0 && local136 < 128 && local141 < 128 && Static130.anIntArrayArray137[local136][local141] < 100) {
						@Pc(166) int local166 = 0;
						if (local123 < arg1) {
							local166 = arg1 - local123;
						} else if (arg0 + arg1 - 1 < local123) {
							local166 = local123 + 1 - arg1 - arg0;
						}
						@Pc(194) int local194 = 0;
						if (local129 < arg9) {
							local194 = arg9 - local129;
						} else if (local129 > arg9 + arg6 - 1) {
							local194 = local129 + 1 - arg9 - arg6;
						}
						@Pc(237) int local237 = local194 * local194 + local166 * local166;
						if (local114 > local237 || local114 == local237 && local116 > Static130.anIntArrayArray137[local136][local141]) {
							local106 = local129;
							local114 = local237;
							local104 = local123;
							local116 = Static130.anIntArrayArray137[local136][local141];
						}
					}
				}
			}
			if (~local114 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg3 == local104 && arg11 == local106) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static256.anIntArray386[0] = local104;
		local114 = local307 + 1;
		Static104.anIntArray408[0] = local106;
		@Pc(327) int local327;
		local116 = local327 = Static350.anIntArrayArray185[local104 - local98][local106 - local102];
		while (arg3 != local104 || arg11 != local106) {
			if (local327 != local116) {
				local327 = local116;
				Static256.anIntArray386[local114] = local104;
				Static104.anIntArray408[local114++] = local106;
			}
			if ((local116 & 0x1) != 0) {
				local106++;
			} else if ((local116 & 0x4) != 0) {
				local106--;
			}
			if ((local116 & 0x2) != 0) {
				local104++;
			} else if ((local116 & 0x8) != 0) {
				local104--;
			}
			local116 = Static350.anIntArrayArray185[local104 - local98][local106 - local102];
		}
		local123 = 0;
		while (local114-- > 0) {
			arg4[local123] = Static256.anIntArray386[local114];
			arg13[local123++] = Static104.anIntArray408[local114];
			if (local123 >= arg4.length) {
				break;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!tq;I)I")
	public static int method5508(@OriginalArg(0) Class191 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5440(Static96.anInt2181)) {
			local5++;
		}
		if (arg0.method5440(Static237.anInt4546)) {
			local5++;
		}
		if (arg0.method5440(Static39.anInt792)) {
			local5++;
		}
		if (arg0.method5440(Static350.anInt6742)) {
			local5++;
		}
		if (arg0.method5440(Static118.anInt4999)) {
			local5++;
		}
		if (arg0.method5440(Static205.anInt3972)) {
			local5++;
		}
		if (arg0.method5440(Static192.anInt3750)) {
			local5++;
		}
		if (arg0.method5440(Static17.anInt392)) {
			local5++;
		}
		if (arg0.method5440(Static18.anInt426)) {
			local5++;
		}
		if (arg0.method5440(Static55.anInt4788)) {
			local5++;
		}
		if (arg0.method5440(Static39.anInt790)) {
			local5++;
		}
		if (arg0.method5440(Static37.anInt701)) {
			local5++;
		}
		if (arg0.method5440(Static263.anInt5404)) {
			local5++;
		}
		if (arg0.method5440(Static65.anInt1428)) {
			local5++;
		}
		if (arg0.method5440(Static173.anInt3525)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method5509() {
		Static15.method628((long) Static212.anInt4090, Static147.aClass4_2);
		if (Static111.anInt2471 != -1) {
			Static34.method804(Static111.anInt2471);
		}
		for (@Pc(24) int local24 = 0; local24 < Static53.anInt1131; local24++) {
			if (Static200.aBooleanArray29[local24]) {
				Static135.aBooleanArray12[local24] = true;
			}
			Static19.aBooleanArray3[local24] = Static200.aBooleanArray29[local24];
			Static200.aBooleanArray29[local24] = false;
		}
		Static346.anInt6892 = Static212.anInt4090;
		if (Static147.aClass4_2.method4297()) {
			Static218.aBoolean373 = true;
		}
		if (Static111.anInt2471 != -1) {
			Static53.anInt1131 = 0;
			Static192.method3451();
		}
		Static147.aClass4_2.method4299();
		Static70.method1578(Static264.anInt5425);
		Static220.anInt4246 = 0;
	}
}
