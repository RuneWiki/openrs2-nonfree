import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
	public static int[] anIntArray283 = new int[200];

	@OriginalMember(owner = "client!me", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString192 = "scroll:";

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(CB)Z")
	public static boolean method2895(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIII[Lclient!ne;IZIII)[I")
	public static int[] method2896(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class118[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(11) int local11 = (arg9 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg7) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(34) int local34;
		@Pc(52) int local52;
		if (!arg7) {
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				for (local34 = 0; local34 < 8; local34++) {
					local52 = arg8 + Static263.method4147(arg3, local34 & 0x7, local29 & 0x7);
					@Pc(64) int local64 = Static237.method3673(local34 & 0x7, arg3, local29 & 0x7) + arg6;
					if (local52 > 0 && local52 < 103 && local64 > 0 && local64 < 103) {
						arg5[arg1].anIntArrayArray28[local52][local64] &= 0xFFDFFFFF;
					}
				}
			}
		}
		local34 = (arg9 & 0xFFFFFFF8) << 3;
		local52 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) Class1_Sub14 local121 = new Class1_Sub14(arg0);
		@Pc(123) byte local123 = 0;
		@Pc(125) byte local125 = 0;
		if (arg3 == 1) {
			local125 = 1;
		} else if (arg3 == 2) {
			local125 = 1;
			local123 = 1;
		} else if (arg3 == 3) {
			local123 = 1;
		}
		@Pc(166) int local166;
		@Pc(227) int local227;
		@Pc(239) int local239;
		@Pc(275) int local275;
		@Pc(284) int local284;
		@Pc(293) int local293;
		@Pc(300) int local300;
		for (@Pc(150) int local150 = 0; local150 < local21; local150++) {
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				for (local166 = 0; local166 < 64; local166++) {
					if (local150 != arg2 || local11 > local159 || local11 + 8 < local159 || local166 < local17 || local17 + 8 < local166) {
						Static61.method1109(0, arg7, 0, local121, 0, 0, false, -1, 0, -1, 0);
					} else if (local11 + 8 == local159 || local17 + 8 == local166) {
						if (arg3 == 0) {
							local227 = local159 + arg8 - local11;
							local239 = arg6 + local166 - local17;
						} else if (arg3 == 1) {
							local239 = local11 + arg6 + 8 - local159;
							local227 = local166 + arg8 - local17;
						} else if (arg3 == 2) {
							local227 = arg8 + local11 + 8 - local159;
							local239 = local17 + arg6 + 8 - local166;
						} else {
							local239 = arg6 + local159 - local11;
							local227 = arg8 + local17 + 8 - local166;
						}
						Static61.method1109(0, arg7, local52 + local166, local121, 0, 0, true, local239, local34 + local159, local227, arg1);
					} else {
						local227 = arg8 + Static263.method4147(arg3, local166 & 0x7, local159 & 0x7);
						local239 = Static237.method3673(local166 & 0x7, arg3, local159 & 0x7) + arg6;
						Static61.method1109(local125, arg7, local52 + local166, local121, arg3, local123, false, local239, local159 + local34, local227, arg1);
						if (local159 == 63 || local166 == 63) {
							local275 = local159 == 63 ? 64 : local159;
							local284 = local166 == 63 ? 64 : local166;
							if (arg3 == 0) {
								local293 = arg8 + local275 - local11;
								local300 = local284 + arg6 - local17;
							} else if (arg3 == 1) {
								local300 = arg6 + local11 + 8 - local275;
								local293 = arg8 + local284 - local17;
							} else if (arg3 == 2) {
								local300 = local17 + arg6 + 8 - local284;
								local293 = local11 + arg8 + 8 - local275;
							} else {
								local293 = local17 + arg8 + 8 - local284;
								local300 = local275 + arg6 - local11;
							}
							if (local293 >= 0 && local293 < 104 && local300 >= 0 && local300 < 104) {
								Static24.anIntArrayArrayArray2[arg1][local293][local300] = Static24.anIntArrayArrayArray2[arg1][local227 + local123][local239 + local125];
							}
						}
					}
				}
			}
		}
		@Pc(527) boolean local527 = false;
		@Pc(607) int local607;
		@Pc(654) int local654;
		while (local121.anInt1480 < local121.aByteArray17.length) {
			local166 = local121.method1378();
			if (local166 == 128) {
				local527 = true;
				Static174.anIntArray284[0] = local121.method1386();
				Static174.anIntArray284[1] = local121.method1356();
				Static174.anIntArray284[2] = local121.method1356();
				Static174.anIntArray284[3] = local121.method1356();
				Static174.anIntArray284[4] = local121.method1386();
			} else {
				if (local166 != 129) {
					local121.anInt1480--;
					break;
				}
				for (local227 = 0; local227 < 4; local227++) {
					@Pc(565) byte local565 = local121.method1363();
					if (local565 == 0) {
						if (arg2 >= local227) {
							local275 = arg8;
							if (arg8 < 0) {
								local275 = 0;
							} else if (arg8 >= 104) {
								local275 = 104;
							}
							local293 = arg6;
							local300 = arg6 + 7;
							if (local300 < 0) {
								local300 = 0;
							} else if (local300 >= 104) {
								local300 = 104;
							}
							if (arg6 < 0) {
								local293 = 0;
							} else if (arg6 >= 104) {
								local293 = 104;
							}
							local284 = arg8 + 7;
							if (local284 < 0) {
								local284 = 0;
							} else if (local284 >= 104) {
								local284 = 104;
							}
							while (local284 > local275) {
								while (local293 < local300) {
									Static43.aByteArrayArrayArray1[arg1][local275][local293] = 0;
									local293++;
								}
								local275++;
							}
						}
					} else if (local565 == 1) {
						for (local275 = 0; local275 < 64; local275 += 4) {
							for (local284 = 0; local284 < 64; local284 += 4) {
								@Pc(590) byte local590 = local121.method1363();
								if (arg2 >= local227) {
									for (local300 = local275; local300 < local275 + 4; local300++) {
										for (local607 = local284; local607 < local284 + 4; local607++) {
											if (local300 >= local11 && local11 + 8 > local300 && local607 >= local17 && local17 < local17 + 8) {
												local654 = Static263.method4147(arg3, local607 & 0x7, local300 & 0x7) + arg8;
												@Pc(666) int local666 = Static237.method3673(local607 & 0x7, arg3, local300 & 0x7) + arg6;
												if (local654 >= 0 && local654 < 104 && local666 >= 0 && local666 < 104) {
													Static43.aByteArrayArrayArray1[arg1][local654][local666] = local590;
												}
											}
										}
									}
								}
							}
						}
					} else if (local565 == 2) {
					}
				}
			}
		}
		if (Static156.aBoolean211 && !arg7) {
			@Pc(866) Class126 local866 = null;
			while (true) {
				while (local121.aByteArray17.length > local121.anInt1480) {
					local227 = local121.method1378();
					if (local227 == 0) {
						local866 = new Class126(local121);
					} else if (local227 == 1) {
						local239 = local121.method1378();
						if (local239 > 0) {
							for (local275 = 0; local275 < local239; local275++) {
								@Pc(915) Class61 local915 = new Class61(local121);
								if (local915.anInt1997 == 31) {
									@Pc(927) Class92 local927 = Static51.method953(local121.method1386());
									local915.method1805(local927.anInt2896, local927.anInt2898, local927.anInt2905, local927.anInt2893);
								}
								local293 = local915.anInt2004 >> 7;
								local300 = local915.anInt2006 >> 7;
								if (arg2 == local915.anInt1999 && local11 <= local293 && local293 < local11 + 8 && local300 >= local17 && local300 < local17 + 8) {
									local607 = (arg8 << 7) + Static251.method3965(local915.anInt2006 & 0x3FF, local915.anInt2004 & 0x3FF, arg3);
									local654 = (arg6 << 7) + Static178.method2962(arg3, local915.anInt2006 & 0x3FF, local915.anInt2004 & 0x3FF);
									local915.anInt2004 = local607;
									local915.anInt2006 = local654;
									local300 = local915.anInt2006 >> 7;
									local293 = local915.anInt2004 >> 7;
									if (local293 >= 0 && local300 >= 0 && local293 < 104 && local300 < 104) {
										local915.aBoolean111 = (Static104.aByteArrayArrayArray3[1][local293][local300] & 0x2) != 0;
										local915.anInt1993 = Static24.anIntArrayArrayArray2[local915.anInt1999][local293][local300] - local915.anInt1993;
										Static101.method1825(local915);
									}
								}
							}
						}
					} else if (local227 == 2) {
						if (local866 == null) {
							local866 = new Class126();
						}
						local866.method3203(local121);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local866 == null) {
					local866 = new Class126();
				}
				Static85.aClass126ArrayArray1[arg8 >> 3][arg6 >> 3] = local866;
				break;
			}
		}
		local166 = arg8 + 7;
		local227 = arg6 + 7;
		for (local239 = arg8; local239 < local166; local239++) {
			for (local275 = arg6; local275 < local227; local275++) {
				Static43.aByteArrayArrayArray1[arg1][local239][local275] = 0;
			}
		}
		return local527 ? Static174.anIntArray284 : null;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public static void method2898() {
		Static162.anInt3171 = 0;
		Static196.anInt3703 = 0;
		Static63.aByte18 = 0;
		Static12.anInt176 = 0;
		Static52.aBoolean381 = false;
	}
}
