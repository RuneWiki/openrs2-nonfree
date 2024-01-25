import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "[S")
	public static short[] aShortArray42;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "C")
	public static char aChar2;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
	public static int anInt2003;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	public static int anInt1990 = 0;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "[I")
	public static final int[] anIntArray182 = new int[14];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[BZI[Lclient!fn;ILclient!e;III)[I")
	public static int[] method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class65[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg4) {
			@Pc(23) Class65 local23 = arg5[arg0];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(44) int local44 = arg8 + Static232.method2202(arg9, local25 & 0x7, local29 & 0x7);
					@Pc(57) int local57 = arg2 + Static68.method1676(arg9, local29 & 0x7, local25 & 0x7);
					if (local44 > 0 && local44 < Static195.anInt3965 - 1 && local57 > 0 && local57 < Static298.anInt5716 - 1) {
						local23.method2129(local44, local57);
					}
				}
			}
		}
		@Pc(103) byte local103;
		if (arg4) {
			local103 = 1;
		} else {
			local103 = 4;
		}
		@Pc(112) Class14_Sub4 local112 = new Class14_Sub4(arg3);
		local25 = (arg1 & 0xFFFFFFF8) << 3;
		local29 = (arg6 & 0x1FFFFFF8) << 3;
		@Pc(126) byte local126 = 0;
		@Pc(128) byte local128 = 0;
		if (arg9 == 1) {
			local128 = 1;
		} else if (arg9 == 2) {
			local128 = 1;
			local126 = 1;
		} else if (arg9 == 3) {
			local126 = 1;
		}
		@Pc(242) int local242;
		@Pc(236) int local236;
		@Pc(378) int local378;
		@Pc(385) int local385;
		@Pc(410) int local410;
		@Pc(403) int local403;
		for (@Pc(157) int local157 = 0; local157 < local103; local157++) {
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
					if (arg10 != local157 || local161 < local11 || local161 > local11 + 8 || local165 < local17 || local17 + 8 < local165) {
						Static273.method4635(-1, -1, 0, 0, 0, 0, false, arg4, 0, local112, 0);
					} else if (local161 == local11 + 8 || local165 == local17 + 8) {
						if (arg9 == 0) {
							local236 = arg2 + local165 - local17;
							local242 = local161 + arg8 - local11;
						} else if (arg9 == 1) {
							local242 = local165 + arg8 - local17;
							local236 = local11 + arg2 + 8 - local161;
						} else if (arg9 == 2) {
							local236 = arg2 + local17 + 8 - local165;
							local242 = arg8 + local11 + 8 - local161;
						} else {
							local236 = local161 + arg2 - local11;
							local242 = local17 + arg8 + 8 - local165;
						}
						Static273.method4635(local236, local242, local29 + local165, arg0, 0, local25 + local161, true, arg4, 0, local112, 0);
					} else {
						local242 = Static232.method2202(arg9, local161 & 0x7, local165 & 0x7) + arg8;
						local236 = Static68.method1676(arg9, local165 & 0x7, local161 & 0x7) + arg2;
						Static273.method4635(local236, local242, local165 + local29, arg0, arg9, local25 + local161, false, arg4, local128, local112, local126);
						if (local161 == 63 || local165 == 63) {
							local378 = local161 == 63 ? 64 : local161;
							local385 = local165 == 63 ? 64 : local165;
							if (arg9 == 0) {
								local403 = arg2 + local385 - local17;
								local410 = arg8 + local378 - local11;
							} else if (arg9 == 1) {
								local403 = local11 + arg2 + 8 - local378;
								local410 = arg8 + local385 - local17;
							} else if (arg9 == 2) {
								local403 = arg2 + local17 + 8 - local385;
								local410 = local11 + arg8 + 8 - local378;
							} else {
								local410 = arg8 + local17 + 8 - local385;
								local403 = local378 + arg2 - local11;
							}
							if (local410 >= 0 && Static195.anInt3965 > local410 && local403 >= 0 && Static298.anInt5716 > local403) {
								Static1.anIntArrayArrayArray12[arg0][local410][local403] = Static1.anIntArrayArrayArray12[arg0][local242 + local126][local128 + local236];
							}
						}
					}
				}
			}
		}
		@Pc(541) boolean local541 = false;
		@Pc(662) int local662;
		@Pc(762) int local762;
		@Pc(805) int local805;
		while (local112.anInt2637 < local112.aByteArray74.length) {
			local242 = local112.method2548();
			if (local242 == 128) {
				Static27.anIntArray40[0] = local112.method2498();
				Static27.anIntArray40[1] = local112.method2502();
				Static27.anIntArray40[2] = local112.method2502();
				Static27.anIntArray40[3] = local112.method2502();
				Static27.anIntArray40[4] = local112.method2498();
				local541 = true;
			} else {
				if (local242 != 129) {
					local112.anInt2637--;
					break;
				}
				if (Static260.aByteArrayArrayArray10 == null) {
					Static260.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local236 = 0; local236 < 4; local236++) {
					@Pc(608) byte local608 = local112.method2553();
					if (local608 == 0 && Static260.aByteArrayArrayArray10[arg0] != null) {
						if (arg10 >= local236) {
							local385 = arg8;
							local410 = arg8 + 7;
							local403 = arg2;
							if (arg8 < 0) {
								local385 = 0;
							} else if (arg8 >= Static195.anInt3965) {
								local385 = Static195.anInt3965;
							}
							if (arg2 < 0) {
								local403 = 0;
							} else if (arg2 >= Static298.anInt5716) {
								local403 = Static298.anInt5716;
							}
							local662 = arg2 + 7;
							if (local410 < 0) {
								local410 = 0;
							} else if (Static195.anInt3965 <= local410) {
								local410 = Static195.anInt3965;
							}
							if (local662 < 0) {
								local662 = 0;
							} else if (Static298.anInt5716 <= local662) {
								local662 = Static298.anInt5716;
							}
							while (local385 < local410) {
								while (local662 > local403) {
									Static260.aByteArrayArrayArray10[arg0][local385][local403] = 0;
									local403++;
								}
								local385++;
							}
						}
					} else if (local608 == 1) {
						if (Static260.aByteArrayArrayArray10[arg0] == null) {
							Static260.aByteArrayArrayArray10[arg0] = new byte[Static195.anInt3965 + 1][Static298.anInt5716 + 1];
						}
						for (local385 = 0; local385 < 64; local385 += 4) {
							for (local410 = 0; local410 < 64; local410 += 4) {
								@Pc(749) byte local749 = local112.method2553();
								if (arg10 >= local236) {
									for (local662 = local385; local662 < local385 + 4; local662++) {
										for (local762 = local410; local762 < local410 + 4; local762++) {
											if (local11 <= local662 && local11 + 8 > local662 && local762 >= local17 && local17 < local17 + 8) {
												local805 = arg8 + Static232.method2202(arg9, local662 & 0x7, local762 & 0x7);
												@Pc(817) int local817 = Static68.method1676(arg9, local762 & 0x7, local662 & 0x7) + arg2;
												if (local805 >= 0 && Static195.anInt3965 > local805 && local817 >= 0 && local817 < Static298.anInt5716) {
													Static260.aByteArrayArrayArray10[arg0][local805][local817] = local749;
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
		if (!arg4) {
			@Pc(882) Class188 local882 = null;
			label279: while (true) {
				label272: do {
					while (true) {
						while (local112.aByteArray74.length > local112.anInt2637) {
							local236 = local112.method2548();
							if (local236 == 0) {
								local882 = new Class188(local112);
							} else {
								if (local236 == 1) {
									local378 = local112.method2548();
									continue label272;
								}
								if (local236 != 2) {
									throw new IllegalStateException();
								}
								if (local882 == null) {
									local882 = new Class188();
								}
								local882.method5076(local112);
							}
						}
						if (local882 != null) {
							Static251.method2948(local882, arg2 >> 3, arg8 >> 3);
						}
						break label279;
					}
				} while (local378 <= 0);
				for (local385 = 0; local385 < local378; local385++) {
					@Pc(910) Class14_Sub13_Sub1 local910 = new Class14_Sub13_Sub1(local112);
					if (local910.anInt5646 == 31) {
						@Pc(922) Class194 local922 = Static262.method4489(local112.method2498());
						local910.method5023(local922.anInt5855, local922.anInt5858, local922.anInt5856, local922.anInt5861);
					}
					local403 = local910.anInt5640 >> 7;
					local662 = local910.anInt5638 >> 7;
					if (arg10 == local910.anInt5650 && local403 >= local11 && local11 + 8 > local403 && local662 >= local17 && local662 < local17 + 8) {
						local762 = Static300.method5704(local910.anInt5640 & 0x3FF, arg9, local910.anInt5638 & 0x3FF) + (arg8 << 7);
						local805 = (arg2 << 7) + Static333.method5738(local910.anInt5640 & 0x3FF, local910.anInt5638 & 0x3FF, arg9);
						local910.anInt5640 = local762;
						local910.anInt5638 = local805;
						local403 = local910.anInt5640 >> 7;
						local662 = local910.anInt5638 >> 7;
						if (local403 >= 0 && local662 >= 0 && local403 < Static195.anInt3965 && Static298.anInt5716 > local662) {
							local910.anInt5635 = Static1.anIntArrayArrayArray12[arg10][local403][local662] - local910.anInt5635;
							if (arg7.method5135() > 0) {
								Static286.method4893(local910);
							}
						}
					}
				}
			}
		}
		if (Static260.aByteArrayArrayArray10 != null && Static260.aByteArrayArrayArray10[arg0] != null) {
			local242 = arg8 + 7;
			local236 = arg2 + 7;
			for (local378 = arg8; local378 < local242; local378++) {
				for (local385 = arg2; local385 < local236; local385++) {
					Static260.aByteArrayArrayArray10[arg0][local378][local385] = 0;
				}
			}
		}
		if (local541) {
			return Static27.anIntArray40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIII)V")
	public static void method2014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 < arg1) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static104.anIntArrayArray31[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static104.anIntArrayArray31[local10][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZZLclient!rb;)V")
	public static void method2015(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class14_Sub27 arg2) {
		@Pc(8) int local8 = arg2.anInt5186;
		@Pc(12) int local12 = (int) arg2.aLong217;
		arg2.method5986();
		if (arg0) {
			Static67.method1660(local8);
		}
		Static49.method1192(local8);
		@Pc(27) Class146 local27 = Static273.method4632(local12);
		if (local27 != null) {
			Static166.method3295(local27);
		}
		Static355.method6007();
		if (!arg1 && Static324.anInt6226 != -1) {
			Static266.method4536(1, Static324.anInt6226);
		}
		@Pc(49) Class176 local49 = new Class176(Static198.aClass25_20);
		for (@Pc(54) Class14_Sub27 local54 = (Class14_Sub27) local49.method4615(); local54 != null; local54 = (Class14_Sub27) local49.method4614()) {
			if (!local54.method5989()) {
				local54 = (Class14_Sub27) local49.method4615();
				if (local54 == null) {
					return;
				}
			}
			if (local54.anInt5192 == 3) {
				@Pc(78) int local78 = (int) local54.aLong217;
				if (local8 == local78 >>> 16) {
					method2015(true, arg1, local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
	public static void method2016(@OriginalArg(0) int arg0) {
		@Pc(1) Class82 local1 = Static28.aClass82_1;
		synchronized (Static28.aClass82_1) {
			Static270.anInt5147 = arg0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2017(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static302.anInt5838; local19++) {
			if (arg0.equalsIgnoreCase(Static120.aStringArray36[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224);
	}
}
