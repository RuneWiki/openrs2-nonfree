import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!un", name = "E", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public static int anInt2944 = -1;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!gn;Ljava/lang/Object;B)V")
	public static void method2237(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg0.anEventQueue1.peekEvent() != null; local12++) {
			Static230.method4022(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZIIII)V")
	public static void method2238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static102.anInt2239 <= arg3 && Static88.anInt2052 >= arg2 && Static152.anInt3532 <= arg0 && arg1 <= Static223.anInt1245) {
			Static228.method3998(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static46.method4786(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!h;IIIII)V")
	public static void method2239(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static156.anInt3577) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static212.anInt4717) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static293.anInt6189 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub14 local71 = Static132.aClass1_Sub14ArrayArrayArray2[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static287.anIntArrayArrayArray18[local17][local28][local39] + Static287.anIntArrayArrayArray18[local17][local28 + 1][local39] + Static287.anIntArrayArrayArray18[local17][local28][local39 + 1] + Static287.anIntArrayArrayArray18[local17][local28 + 1][local39 + 1]) / 4 - (Static287.anIntArrayArrayArray18[arg1][arg2][arg3] + Static287.anIntArrayArrayArray18[arg1][arg2 + 1][arg3] + Static287.anIntArrayArrayArray18[arg1][arg2][arg3 + 1] + Static287.anIntArrayArrayArray18[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class133 local161 = local71.aClass133_1;
									if (local161 != null) {
										if (local161.aClass25_4.method4766()) {
											arg0.method4770(local161.aClass25_4, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass25_5 != null && local161.aClass25_5.method4766()) {
											arg0.method4770(local161.aClass25_5, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt2332; local232++) {
										@Pc(241) Class152 local241 = local71.aClass152Array1[local232];
										if (local241 != null && local241.aClass25_6.method4766() && (local28 == local241.anInt5509 || local28 == local3) && (local39 == local241.anInt5519 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt5510 + 1 - local241.anInt5509;
											@Pc(278) int local278 = local241.anInt5512 + 1 - local241.anInt5519;
											arg0.method4770(local241.aClass25_6, (local241.anInt5509 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt5519 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!im;B)V")
	public static void method2241(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(21) int local21 = Static141.anInt3230 >> 2 << 10;
		@Pc(25) int local25 = Static299.anInt6235 >> 1;
		@Pc(29) byte[][] local29 = new byte[Static178.anInt4022][Static173.anInt3932];
		@Pc(43) int local43;
		@Pc(116) int local116;
		@Pc(129) int local129;
		while (arg0.anInt3328 < arg0.aByteArray39.length) {
			@Pc(41) boolean local41 = false;
			local43 = 0;
			@Pc(45) int local45 = 0;
			if (arg0.method2655() == 1) {
				local41 = true;
				local43 = arg0.method2655();
				local45 = arg0.method2655();
			}
			@Pc(69) int local69 = arg0.method2655();
			@Pc(75) int local75 = arg0.method2655();
			@Pc(82) int local82 = local69 * 64 - Static234.anInt5158;
			@Pc(92) int local92 = Static173.anInt3932 + Static48.anInt1347 - local75 * 64 - 1;
			if (local82 >= 0 && local92 - 63 >= 0 && Static178.anInt4022 > local82 + 63 && Static173.anInt3932 > local92) {
				for (local116 = 0; local116 < 64; local116++) {
					@Pc(127) byte[] local127 = local29[local116 + local82];
					for (local129 = 0; local129 < 64; local129++) {
						if (!local41 || local43 * 8 <= local116 && local116 < local43 * 8 + 8 && local129 >= local45 * 8 && local129 < local45 * 8 + 8) {
							local127[local92 - local129] = arg0.method2633();
						}
					}
				}
			} else if (local41) {
				arg0.anInt3328 += 64;
			} else {
				arg0.anInt3328 += 4096;
			}
		}
		@Pc(197) int local197 = Static178.anInt4022;
		local43 = Static173.anInt3932;
		@Pc(202) int[] local202 = new int[local43];
		@Pc(205) int[] local205 = new int[local43];
		@Pc(208) int[] local208 = new int[local43];
		@Pc(211) int[] local211 = new int[local43];
		@Pc(214) int[] local214 = new int[local43];
		for (local116 = -5; local116 < local197; local116++) {
			@Pc(248) int local248;
			@Pc(315) int local315;
			for (@Pc(225) int local225 = 0; local225 < local43; local225++) {
				local129 = local116 + 5;
				@Pc(294) int local294;
				if (local197 > local129) {
					local248 = local29[local129][local225] & 0xFF;
					if (local248 > 0) {
						@Pc(258) Class136 local258 = Static160.method3004(local248 - 1);
						local202[local225] += local258.anInt4935;
						local205[local225] += local258.anInt4942;
						local208[local225] += local258.anInt4949;
						local211[local225] += local258.anInt4941;
						local294 = local214[local225]++;
					}
				}
				local248 = local116 - 5;
				if (local248 >= 0) {
					local315 = local29[local248][local225] & 0xFF;
					if (local315 > 0) {
						@Pc(327) Class136 local327 = Static160.method3004(local315 - 1);
						local202[local225] -= local327.anInt4935;
						local205[local225] -= local327.anInt4942;
						local208[local225] -= local327.anInt4949;
						local211[local225] -= local327.anInt4941;
						local294 = local214[local225]--;
					}
				}
			}
			if (local116 >= 0) {
				@Pc(378) int[][] local378 = Static92.anIntArrayArrayArray7[local116 >> 6];
				local129 = 0;
				local315 = 0;
				@Pc(384) int local384 = 0;
				local248 = 0;
				@Pc(388) int local388 = 0;
				for (@Pc(390) int local390 = -5; local390 < local43; local390++) {
					@Pc(397) int local397 = local390 - 5;
					@Pc(401) int local401 = local390 + 5;
					if (local401 < local43) {
						local129 += local202[local401];
						local248 += local205[local401];
						local388 += local211[local401];
						local384 += local214[local401];
						local315 += local208[local401];
					}
					if (local397 >= 0) {
						local248 -= local205[local397];
						local388 -= local211[local397];
						local384 -= local214[local397];
						local129 -= local202[local397];
						local315 -= local208[local397];
					}
					if (local390 >= 0 && local384 > 0) {
						@Pc(482) int[] local482 = local378[local390 >> 6];
						@Pc(503) int local503 = local388 == 0 ? 0 : Static196.method3519(local248 / local384, local129 * 256 / local388, local315 / local384);
						if (local29[local116][local390] != 0) {
							if (local482 == null) {
								local482 = local378[local390 >> 6] = new int[4096];
							}
							@Pc(528) int local528 = (local503 & 0x7F) + local25;
							if (local528 < 0) {
								local528 = 0;
							} else if (local528 > 127) {
								local528 = 127;
							}
							@Pc(553) int local553 = local528 + (local21 + local503 & 0xFC00) + (local503 & 0x380);
							local482[(local116 & 0x3F) + ((local390 & 0x3F) << 6)] = Static151.anIntArray324[Static122.method2098(96, local553)];
						} else if (local482 != null) {
							local482[((local390 & 0x3F) << 6) + (local116 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2242(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = Static142.method2529(arg0);
		if (local3 != -1) {
			@Pc(41) int[] local41 = Static176.aClass1_Sub2_Sub9_2.method1638(Static159.aClass78_2.anIntArray264[local3] >> 28 & 0x3, Static159.aClass78_2.anIntArray264[local3] & 0x3FFF, Static159.aClass78_2.anIntArray264[local3] >> 14 & 0x3FFF);
			Static169.method3142(local41[2], local41[1]);
		}
	}
}
