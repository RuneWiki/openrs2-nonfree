import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Lclient!lm;")
	public static Class134 aClass134_53;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
	public static final int[] anIntArray186 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "[I")
	public static int[] anIntArray187 = new int[2];

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString84 = "Unable to find ";

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	public static void method1797(@OriginalArg(1) int arg0) {
		Static22.anInt428 = arg0;
		Static288.anInt5766 = -1;
		Static282.anInt3502 = -1;
		Static173.method3116();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILclient!ii;I)Z")
	public static boolean method1799(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		@Pc(11) int local11 = (Static43.anInt1151 - 104) / 2;
		@Pc(17) int local17 = (Static260.anInt5348 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static217.method739(local29, local25, local21, arg0)) {
						local40 = local29;
						if (Static141.method2321(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static226.method4893(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static100.aClass8_14 = arg1.method4257(local84, 512, 512, 512);
		Static142.method2379();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10 | 0xFF000000;
		@Pc(161) int local161 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(180) int local180 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(184) boolean[][] local184 = new boolean[Static10.anInt176][Static10.anInt176];
		@Pc(190) int local190;
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(215) int local215;
		@Pc(265) int local265;
		@Pc(271) int local271;
		@Pc(276) int local276;
		@Pc(295) int local295;
		for (@Pc(186) int local186 = local11; local186 < local11 + 104; local186 += Static10.anInt176) {
			for (local190 = local17; local190 < local17 + 104; local190 += Static10.anInt176) {
				arg1.method4268(0, 0, Static10.anInt176 * 4, Static10.anInt176 * 4);
				arg1.method4295(-16777216);
				for (local207 = arg0; local207 <= 3; local207++) {
					for (local211 = 0; local211 < Static10.anInt176; local211++) {
						for (local215 = 0; local215 < Static10.anInt176; local215++) {
							local184[local211][local215] = Static217.method739(local207, local190 + local215, local211 + local186, arg0);
						}
					}
					Static278.aClass12Array3[local207].method2694(local186, local190, Static10.anInt176 + local186, local190 - -Static10.anInt176, local184);
					if (!Static244.aBoolean512) {
						for (local215 = -4; local215 < Static10.anInt176; local215++) {
							for (local265 = -4; local265 < Static10.anInt176; local265++) {
								local271 = local186 + local215;
								local276 = local190 + local265;
								if (local11 <= local271 && local276 >= local17 && Static217.method739(local207, local276, local271, arg0)) {
									local295 = local207;
									if (Static141.method2321(local271, local276)) {
										local295 = local207 - 1;
									}
									if (local295 >= 0) {
										Static107.method1710(local295, local40, local271, local215 * 4, local161, arg1, local276, (Static10.anInt176 - local265) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static244.aBoolean512) {
					@Pc(345) Class17 local345 = Static313.aClass17Array1[arg0];
					for (local215 = 0; local215 < Static10.anInt176; local215++) {
						for (local265 = 0; local265 < Static10.anInt176; local265++) {
							local271 = local215 + local186;
							local276 = local190 + local265;
							local295 = local345.anIntArrayArray5[local271 - local345.anInt365][local276 - local345.anInt370];
							if ((local295 & 0x40240000) != 0) {
								arg1.method4225(4, -1713569622, 4, local215 * 4, (Static10.anInt176 - local265) * 4 - 4);
							} else if ((local295 & 0x800000) != 0) {
								arg1.method4248(local215 * 4, -1713569622, (Static10.anInt176 - local265) * 4 - 4, 4);
							} else if ((local295 & 0x2000000) != 0) {
								arg1.method4255(-1713569622, 4, (Static10.anInt176 - local265) * 4 - 4, local215 * 4 + 3);
							} else if ((local295 & 0x8000000) != 0) {
								arg1.method4248(local215 * 4, -1713569622, (Static10.anInt176 - local265) * 4 - 1, 4);
							} else if ((local295 & 0x20000000) != 0) {
								arg1.method4255(-1713569622, 4, (Static10.anInt176 - local265) * 4 - 4, local215 * 4);
							}
						}
					}
				}
				arg1.method4249(0, 0, Static10.anInt176 * 4, Static10.anInt176 * 4, local180, 2);
				Static100.aClass8_14.method4385((local186 - local11) * 4 + 48, 464 - (-local17 + local190) * 4 - Static10.anInt176 * 4, Static10.anInt176 * 4, Static10.anInt176 * 4);
			}
		}
		arg1.method4233();
		arg1.method4295(-16777215);
		Static74.method1295();
		Static73.anInt960 = 0;
		Static85.aClass14_6.method305();
		if (!Static244.aBoolean512) {
			for (local190 = local11; local190 < local11 + 104; local190++) {
				for (local207 = local17; local207 < local17 + 104; local207++) {
					for (local211 = arg0; local211 <= arg0 + 1 && local211 <= 3; local211++) {
						if (Static217.method739(local211, local207, local190, arg0)) {
							@Pc(609) Interface4 local609 = (Interface4) Static137.method4969(local211, local190, local207);
							if (local609 == null) {
								local609 = (Interface4) Static183.method3234(local211, local190, local207, jb.class);
							}
							if (local609 == null) {
								local609 = (Interface4) Static107.method1713(local211, local190, local207);
							}
							if (local609 == null) {
								local609 = (Interface4) Static14.method198(local211, local190, local207);
							}
							if (local609 != null) {
								@Pc(649) Class79 local649 = Static129.method2097(local609.method5445());
								if (!local649.aBoolean137 || Static228.aBoolean379) {
									local271 = local649.anInt1895;
									if (local649.anIntArray161 != null) {
										for (local276 = 0; local276 < local649.anIntArray161.length; local276++) {
											if (local649.anIntArray161[local276] != -1) {
												@Pc(677) Class79 local677 = Static129.method2097(local649.anIntArray161[local276]);
												if (local677.anInt1895 >= 0) {
													local271 = local677.anInt1895;
												}
											}
										}
									}
									if (local271 >= 0) {
										@Pc(699) boolean local699 = false;
										if (local271 >= 0) {
											@Pc(705) Class74 local705 = Static298.method5215(local271);
											if (local705 != null && local705.aBoolean124) {
												local699 = true;
											}
										}
										local295 = local190;
										@Pc(716) int local716 = local207;
										if (local699) {
											@Pc(723) int[][] local723 = Static313.aClass17Array1[local211].anIntArrayArray5;
											@Pc(728) int local728 = Static313.aClass17Array1[local211].anInt365;
											@Pc(733) int local733 = Static313.aClass17Array1[local211].anInt370;
											for (@Pc(735) int local735 = 0; local735 < 10; local735++) {
												@Pc(742) int local742 = (int) (Math.random() * 4.0D);
												if (local742 == 0 && local11 < local295 && local190 - 3 < local295 && (local723[local295 - local728 - 1][local716 - local733] & 0x2C0108) == 0) {
													local295--;
												}
												if (local742 == 1 && local295 < local11 + 104 - 1 && local295 < local190 + 3 && (local723[local295 + 1 - local728][local716 - local733] & 0x2C0180) == 0) {
													local295++;
												}
												if (local742 == 2 && local716 > local17 && local716 > local207 - 3 && (local723[local295 - local728][local716 - local733 - 1] & 0x2C0102) == 0) {
													local716--;
												}
												if (local742 == 3 && local17 + 104 - 1 > local716 && local716 < local207 + 3 && (local723[local295 - local728][local716 + 1 - local733] & 0x2C0120) == 0) {
													local716++;
												}
											}
										}
										Static25.anIntArray26[Static73.anInt960] = local649.anInt1898;
										Static142.anIntArray279[Static73.anInt960] = local295;
										Static322.anIntArray645[Static73.anInt960] = local716;
										Static73.anInt960++;
									}
								}
							}
						}
					}
				}
			}
			if (Static37.aClass129_1 != null) {
				Static137.aClass134_128.anInt3576 = 1;
				Static49.method4590(64, 1024);
				for (local207 = 0; local207 < Static37.aClass129_1.anInt3453; local207++) {
					local211 = Static37.aClass129_1.anIntArray337[local207];
					if (local211 >> 28 == Static127.anInt2487) {
						local215 = (local211 >> 14 & 0x3FFF) - Static92.anInt1755;
						local265 = (local211 & 0x3FFF) - Static98.anInt1911;
						if (local215 >= 0 && local215 < Static43.anInt1151 && local265 >= 0 && Static260.anInt5348 > local265) {
							Static85.aClass14_6.method300(new Class1_Sub14(local207));
						} else {
							@Pc(998) Class74 local998 = Static298.method5215(Static37.aClass129_1.anIntArray336[local207]);
							if (local998.anIntArray149 != null && local215 + local998.anInt1737 >= 0 && local998.anInt1735 + local215 < Static43.anInt1151 && local265 + local998.anInt1745 >= 0 && local265 + local998.anInt1740 < Static260.anInt5348) {
								Static85.aClass14_6.method300(new Class1_Sub14(local207));
							}
						}
					}
				}
				Static49.method4590(64, 128);
				Static137.aClass134_128.anInt3576 = 2;
				Static137.aClass134_128.method3022();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BI)I")
	public static int method1800(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static296.method5192(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ii;)V")
	public static void method1801(@OriginalArg(0) Class105 arg0) {
		for (@Pc(1) int local1 = Static275.anInt5621; local1 < Static132.anInt6773; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static97.anInt1852; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static3.anInt38; local7++) {
					@Pc(16) Class83 local16 = Static347.aClass83ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class10_Sub2 local21 = local16.aClass10_Sub2_1;
						@Pc(24) Class10_Sub2 local24 = local16.aClass10_Sub2_2;
						if (local21 != null && local21.method5824()) {
							Static9.method115(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5824()) {
								Static9.method115(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5825(arg0, 0, 0, 0, local21, false);
								local24.method5819();
							}
							local21.method5819();
						}
						for (@Pc(70) Class59 local70 = local16.aClass59_2; local70 != null; local70 = local70.aClass59_1) {
							@Pc(74) Class10_Sub1 local74 = local70.aClass10_Sub1_1;
							if (local74 != null && local74.method5824()) {
								Static9.method115(arg0, local74, local1, local4, local7, local74.aShort93 + 1 - local74.aShort94, local74.aShort92 - local74.aShort91 + 1);
								local74.method5819();
							}
						}
						@Pc(111) Class10_Sub3 local111 = local16.aClass10_Sub3_1;
						if (local111 != null && local111.method5824()) {
							Static262.method1694(arg0, local111, local1, local4, local7);
							local111.method5819();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static244.method5351(arg1 - arg3, arg3 + arg1, Static319.anIntArrayArray31[arg0], arg2);
		@Pc(35) int local35 = -1;
		while (local9 > local7) {
			local35 += 2;
			local7++;
			local12 += local35;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static319.anIntArrayArray31[arg0 + local9];
				@Pc(66) int[] local66 = Static319.anIntArrayArray31[arg0 - local9];
				@Pc(70) int local70 = arg1 + local7;
				@Pc(74) int local74 = arg1 - local7;
				Static244.method5351(local74, local70, local59, arg2);
				Static244.method5351(local74, local70, local66, arg2);
			}
			@Pc(90) int local90 = local9 + arg1;
			@Pc(95) int local95 = arg1 - local9;
			@Pc(102) int[] local102 = Static319.anIntArrayArray31[arg0 + local7];
			@Pc(109) int[] local109 = Static319.anIntArrayArray31[arg0 - local7];
			Static244.method5351(local95, local90, local102, arg2);
			Static244.method5351(local95, local90, local109, arg2);
		}
	}
}
