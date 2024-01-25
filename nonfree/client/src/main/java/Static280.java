import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public static int anInt5512;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
	public static int anInt5514;

	@OriginalMember(owner = "client!rk", name = "C", descriptor = "Z")
	public static boolean aBoolean452;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "[Lclient!rd;")
	public static final Class4_Sub5_Sub2_Sub2[] aClass4_Sub5_Sub2_Sub2Array1 = new Class4_Sub5_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "[I")
	public static final int[] anIntArray533 = new int[32];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
	public static void method4870(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static32.anInt628 != -1) {
				Static332.method6049(Static32.anInt628);
			}
			for (@Pc(21) Class5_Sub18 local21 = (Class5_Sub18) Static198.aClass190_21.method5471(); local21 != null; local21 = (Class5_Sub18) Static198.aClass190_21.method5465()) {
				if (!local21.method6008()) {
					local21 = (Class5_Sub18) Static198.aClass190_21.method5471();
					if (local21 == null) {
						break;
					}
				}
				Static78.method1417(true, false, local21);
			}
			Static32.anInt628 = -1;
			Static198.aClass190_21 = new Class190(8);
			Static107.method4265();
			Static32.anInt628 = Static137.anInt2651;
			Static43.method6040(false);
			Static300.method5274();
			Static108.method1909(Static32.anInt628);
		}
		Static298.method1801();
		Static199.anInt3970 = -1;
		Static204.method3754(Static353.anInt6772);
		Static192.aClass4_Sub5_Sub2_Sub1_2 = new Class4_Sub5_Sub2_Sub1();
		Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 = 6656;
		Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 = 6656;
		Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] = 52;
		Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] = 52;
		Static21.anInt466 = 0;
		Static271.anInt5301 = 0;
		if (Static53.anInt992 == 2) {
			Static271.anInt5301 = Static181.anInt3653 << 7;
			Static21.anInt466 = Static238.anInt4735 << 7;
		} else {
			Static85.method1516();
		}
		Static200.method3522();
		if (Static271.anInt5301 == 0 || Static21.anInt466 == 0) {
			Static50.method822(10);
		} else {
			Static164.method2904();
			Static50.method822(28);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Lclient!oh;")
	public static Class150 method4872(@OriginalArg(0) int arg0) {
		@Pc(10) Class150 local10 = (Class150) Static306.aClass109_56.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static229.aClass93_87.method2410(arg0, 0);
		local10 = new Class150();
		if (local20 != null) {
			local10.method4131(new Class5_Sub12(local20));
		}
		local10.method4130();
		Static306.aClass109_56.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ea;ZIIBII[Lclient!bm;I[BII)[I")
	public static int[] method4875(@OriginalArg(0) Class55 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class24[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg10 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg1) {
			@Pc(23) Class24 local23 = arg6[arg7];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = Static331.method5735(arg9, local29 & 0x7, local25 & 0x7) + arg4;
					@Pc(55) int local55 = Static346.method5928(local25 & 0x7, arg9, local29 & 0x7) + arg2;
					if (local43 > 0 && local43 < Static22.anInt481 - 1 && local55 > 0 && local55 < Static269.anInt5281 - 1) {
						local23.method480(local43, local55);
					}
				}
			}
		}
		@Pc(91) byte local91;
		if (arg1) {
			local91 = 1;
		} else {
			local91 = 4;
		}
		@Pc(100) Class5_Sub12 local100 = new Class5_Sub12(arg8);
		local25 = (arg10 & 0x1FFFFFF8) << 3;
		local29 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg9 == 1) {
			local116 = 1;
		} else if (arg9 == 2) {
			local114 = 1;
			local116 = 1;
		} else if (arg9 == 3) {
			local114 = 1;
		}
		@Pc(235) int local235;
		@Pc(378) int local378;
		@Pc(387) int local387;
		@Pc(410) int local410;
		@Pc(403) int local403;
		for (@Pc(139) int local139 = 0; local139 < local91; local139++) {
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
					if (arg5 == local139 && local143 >= local11 && local11 + 8 >= local143 && local147 >= local17 && local147 <= local17 + 8) {
						@Pc(225) int local225;
						if (local143 == local11 + 8 || local17 + 8 == local147) {
							if (arg9 == 0) {
								local225 = local143 + arg4 - local11;
								local235 = arg2 + local147 - local17;
							} else if (arg9 == 1) {
								local225 = local147 + arg4 - local17;
								local235 = local11 + arg2 + 8 - local143;
							} else if (arg9 == 2) {
								local225 = local11 + arg4 + 8 - local143;
								local235 = local17 + arg2 + 8 - local147;
							} else {
								local235 = arg2 + local143 - local11;
								local225 = arg4 + local17 + 8 - local147;
							}
							Static104.method1877(local100, true, local29 + local147, arg1, 0, arg7, 0, local235, local25 + local143, local225, 0);
						} else {
							local225 = arg4 + Static331.method5735(arg9, local147 & 0x7, local143 & 0x7);
							local235 = arg2 + Static346.method5928(local143 & 0x7, arg9, local147 & 0x7);
							Static104.method1877(local100, false, local29 + local147, arg1, local114, arg7, local116, local235, local25 + local143, local225, arg9);
							if (local143 == 63 || local147 == 63) {
								local378 = local143 == 63 ? 64 : local143;
								local387 = local147 == 63 ? 64 : local147;
								if (arg9 == 0) {
									local410 = arg4 + local378 - local11;
									local403 = arg2 + local387 - local17;
								} else if (arg9 == 1) {
									local403 = local11 + arg2 + 8 - local378;
									local410 = arg4 + local387 - local17;
								} else if (arg9 == 2) {
									local403 = arg2 + local17 + 8 - local387;
									local410 = local11 + arg4 + 8 - local378;
								} else {
									local403 = local378 + arg2 - local11;
									local410 = local17 + arg4 + 8 - local387;
								}
								if (local410 >= 0 && Static22.anInt481 > local410 && local403 >= 0 && local403 < Static269.anInt5281) {
									Static217.anIntArrayArrayArray8[arg7][local410][local403] = Static217.anIntArrayArrayArray8[arg7][local114 + local225][local235 + local116];
								}
							}
						}
					} else {
						Static104.method1877(local100, false, 0, arg1, 0, 0, 0, -1, 0, -1, 0);
					}
				}
			}
		}
		@Pc(535) boolean local535 = false;
		@Pc(617) int local617;
		@Pc(621) int local621;
		@Pc(663) int local663;
		@Pc(743) int local743;
		while (local100.aByteArray90.length > local100.anInt5731) {
			local235 = local100.method5115();
			if (local235 == 128) {
				Static163.anIntArray334[0] = local100.method5106();
				Static163.anIntArray334[1] = local100.method5066();
				Static163.anIntArray334[2] = local100.method5066();
				Static163.anIntArray334[3] = local100.method5066();
				local535 = true;
				Static163.anIntArray334[4] = local100.method5106();
			} else {
				if (local235 != 129) {
					local100.anInt5731--;
					break;
				}
				if (Static332.aByteArrayArrayArray16 == null) {
					Static332.aByteArrayArrayArray16 = new byte[4][][];
				}
				for (local378 = 0; local378 < 4; local378++) {
					@Pc(572) byte local572 = local100.method5098();
					if (local572 == 0 && Static332.aByteArrayArrayArray16[arg7] != null) {
						if (arg5 >= local378) {
							local410 = arg4;
							local403 = arg4 + 7;
							local743 = arg2;
							if (local403 < 0) {
								local403 = 0;
							} else if (Static22.anInt481 <= local403) {
								local403 = Static22.anInt481;
							}
							if (arg4 < 0) {
								local410 = 0;
							} else if (Static22.anInt481 <= arg4) {
								local410 = Static22.anInt481;
							}
							if (arg2 < 0) {
								local743 = 0;
							} else if (Static269.anInt5281 <= arg2) {
								local743 = Static269.anInt5281;
							}
							local617 = arg2 + 7;
							if (local617 < 0) {
								local617 = 0;
							} else if (local617 >= Static269.anInt5281) {
								local617 = Static269.anInt5281;
							}
							while (local403 > local410) {
								while (local743 < local617) {
									Static332.aByteArrayArrayArray16[arg7][local410][local743] = 0;
									local743++;
								}
								local410++;
							}
						}
					} else if (local572 == 1) {
						if (Static332.aByteArrayArrayArray16[arg7] == null) {
							Static332.aByteArrayArrayArray16[arg7] = new byte[Static22.anInt481 + 1][Static269.anInt5281 + 1];
						}
						for (local410 = 0; local410 < 64; local410 += 4) {
							for (local403 = 0; local403 < 64; local403 += 4) {
								@Pc(612) byte local612 = local100.method5098();
								if (local378 <= arg5) {
									for (local617 = local410; local617 < local410 + 4; local617++) {
										for (local621 = local403; local621 < local403 + 4; local621++) {
											if (local11 <= local617 && local11 + 8 > local617 && local621 >= local17 && local17 + 8 > local17) {
												local663 = Static331.method5735(arg9, local621 & 0x7, local617 & 0x7) + arg4;
												@Pc(675) int local675 = Static346.method5928(local617 & 0x7, arg9, local621 & 0x7) + arg2;
												if (local663 >= 0 && Static22.anInt481 > local663 && local675 >= 0 && local675 < Static269.anInt5281) {
													Static332.aByteArrayArrayArray16[arg7][local663][local675] = local612;
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
		if (!arg1) {
			@Pc(875) Class65 local875 = null;
			while (true) {
				while (local100.anInt5731 < local100.aByteArray90.length) {
					local378 = local100.method5115();
					if (local378 == 0) {
						local875 = new Class65(local100);
					} else if (local378 == 1) {
						local387 = local100.method5115();
						if (local387 > 0) {
							for (local410 = 0; local410 < local387; local410++) {
								@Pc(907) Class5_Sub9_Sub1 local907 = new Class5_Sub9_Sub1(local100);
								if (local907.anInt718 == 31) {
									@Pc(917) Class165 local917 = Static60.method1848(local100.method5106());
									local907.method635(local917.anInt5076, local917.anInt5069, local917.anInt5071, local917.anInt5074);
								}
								local743 = local907.anInt703 >> 7;
								local617 = local907.anInt708 >> 7;
								if (local907.anInt722 == arg5 && local11 <= local743 && local743 < local11 + 8 && local617 >= local17 && local617 < local17 + 8) {
									local621 = (arg4 << 7) + Static82.method1463(local907.anInt703 & 0x3FF, arg9, local907.anInt708 & 0x3FF);
									local663 = (arg2 << 7) + Static36.method579(arg9, local907.anInt708 & 0x3FF, local907.anInt703 & 0x3FF);
									local907.anInt703 = local621;
									local907.anInt708 = local663;
									local617 = local907.anInt708 >> 7;
									local743 = local907.anInt703 >> 7;
									if (local743 >= 0 && local617 >= 0 && Static22.anInt481 > local743 && local617 < Static269.anInt5281) {
										local907.anInt704 = Static217.anIntArrayArrayArray8[arg5][local743][local617] - local907.anInt704;
										if (arg0.method5207() > 0) {
											Static300.method5272(local907);
										}
									}
								}
							}
						}
					} else if (local378 == 2) {
						if (local875 == null) {
							local875 = new Class65();
						}
						local875.method1423(local100);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local875 != null) {
					Static236.method3917(arg2 >> 3, local875, arg4 >> 3);
				}
				break;
			}
		}
		if (Static332.aByteArrayArrayArray16 != null && Static332.aByteArrayArrayArray16[arg7] != null) {
			local235 = arg4 + 7;
			local378 = arg2 + 7;
			for (local387 = arg4; local387 < local235; local387++) {
				for (local410 = arg2; local410 < local378; local410++) {
					Static332.aByteArrayArrayArray16[arg7][local387][local410] = 0;
				}
			}
		}
		if (local535) {
			return Static163.anIntArray334;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(ZI)V")
	public static void method4879(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static291.aClass109_53;
		synchronized (Static291.aClass109_53) {
			Static291.aClass109_53.method2858();
			Static291.aClass109_53 = new Class109(arg0);
		}
	}
}
