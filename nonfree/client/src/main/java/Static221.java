import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!ir;")
	public static Class100 aClass100_94;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array14;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	public static int anInt4561;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public static int anInt4557 = 0;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
	public static final int[] anIntArray370 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public static int anInt4562 = 0;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method3873() {
		Static192.aClass122_6 = null;
		Static283.aClass120_4 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static245.anInt4839 == 1) {
			Static284.aClass57Array20[Static297.anInt5931 / 100].method5448(Static67.anInt1358 - 8, Static227.anInt4638 - 8);
		}
		if (Static245.anInt4839 == 2) {
			Static284.aClass57Array20[Static297.anInt5931 / 100 + 4].method5448(Static67.anInt1358 - 8, Static227.anInt4638 + -8);
		}
		Static46.method773();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIZ[BILclient!tj;I[Lclient!ao;)[I")
	public static int[] method3875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class122 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class13[] arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (!arg3) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class13 local15 = arg8[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg1;
						local31 = local21 + arg0;
						if (local27 >= 0 && Static162.anInt2152 > local27 && local31 >= 0 && Static122.anInt2632 > local31) {
							local15.method240(local27, local31);
						}
					}
				}
			}
		}
		@Pc(73) Class3_Sub4 local73 = new Class3_Sub4(arg4);
		@Pc(82) int local82 = arg1 + arg2;
		local17 = arg0 + arg5;
		for (local21 = 0; local21 < arg7; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local31 = 0; local31 < 64; local31++) {
					Static219.method3811(local82 + local27, local31 - -arg0, local73, false, arg1 + local27, 0, local21, local17 + local31, 0, 0, arg3);
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(145) int local145;
		@Pc(200) int local200;
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(220) int local220;
		@Pc(235) int local235;
		while (local73.aByteArray70.length > local73.anInt4268) {
			local145 = local73.method3643();
			if (local145 == 128) {
				Static103.anIntArray126[0] = local73.method3649();
				Static103.anIntArray126[1] = local73.method3622();
				Static103.anIntArray126[2] = local73.method3622();
				Static103.anIntArray126[3] = local73.method3622();
				Static103.anIntArray126[4] = local73.method3649();
				local137 = true;
			} else {
				if (local145 != 129) {
					local73.anInt4268--;
					break;
				}
				if (Static72.aByteArrayArrayArray1 == null) {
					Static72.aByteArrayArrayArray1 = new byte[4][][];
				}
				for (local200 = 0; local200 < 4; local200++) {
					@Pc(206) byte local206 = local73.method3621();
					if (local206 == 0 && Static72.aByteArrayArrayArray1[local200] != null) {
						local214 = arg1;
						local218 = arg1 + 64;
						local220 = arg0;
						if (arg0 < 0) {
							local220 = 0;
						} else if (arg0 >= Static122.anInt2632) {
							local220 = Static122.anInt2632;
						}
						local235 = arg0 + 64;
						if (arg1 < 0) {
							local214 = 0;
						} else if (arg1 >= Static162.anInt2152) {
							local214 = Static162.anInt2152;
						}
						if (local218 < 0) {
							local218 = 0;
						} else if (local218 >= Static162.anInt2152) {
							local218 = Static162.anInt2152;
						}
						if (local235 < 0) {
							local235 = 0;
						} else if (Static122.anInt2632 <= local235) {
							local235 = Static122.anInt2632;
						}
						while (local214 < local218) {
							while (local220 < local235) {
								Static72.aByteArrayArrayArray1[local200][local214][local220] = 0;
								local220++;
							}
							local214++;
						}
					} else if (local206 == 1) {
						if (Static72.aByteArrayArrayArray1[local200] == null) {
							Static72.aByteArrayArrayArray1[local200] = new byte[Static162.anInt2152 + 1][Static122.anInt2632 + 1];
						}
						for (local214 = 0; local214 < 64; local214 += 4) {
							for (local218 = 0; local218 < 64; local218 += 4) {
								@Pc(337) byte local337 = local73.method3621();
								for (local235 = arg1 + local214; local235 < local214 + arg1 + 4; local235++) {
									for (@Pc(348) int local348 = local218 + arg0; local348 < local218 + arg0 + 4; local348++) {
										if (local235 >= 0 && Static162.anInt2152 > local235 && local348 >= 0 && local348 < Static122.anInt2632) {
											Static72.aByteArrayArrayArray1[local200][local235][local348] = local337;
										}
									}
								}
							}
						}
					} else if (local206 == 2) {
						if (Static72.aByteArrayArrayArray1[local200] == null) {
							Static72.aByteArrayArrayArray1[local200] = new byte[Static162.anInt2152 + 1][Static122.anInt2632 + 1];
						}
						if (local200 > 0) {
							local214 = arg1;
							local218 = arg1 + 64;
							local220 = arg0;
							if (local218 < 0) {
								local218 = 0;
							} else if (Static162.anInt2152 <= local218) {
								local218 = Static162.anInt2152;
							}
							if (arg0 < 0) {
								local220 = 0;
							} else if (arg0 >= Static122.anInt2632) {
								local220 = Static122.anInt2632;
							}
							if (arg1 < 0) {
								local214 = 0;
							} else if (Static162.anInt2152 <= arg1) {
								local214 = Static162.anInt2152;
							}
							local235 = arg0 + 64;
							if (local235 < 0) {
								local235 = 0;
							} else if (Static122.anInt2632 <= local235) {
								local235 = Static122.anInt2632;
							}
							while (local218 > local214) {
								while (local220 < local235) {
									Static72.aByteArrayArrayArray1[local200][local214][local220] = Static72.aByteArrayArrayArray1[local200 - 1][local214][local220];
									local220++;
								}
								local214++;
							}
						}
					}
				}
				local139 = true;
			}
		}
		@Pc(602) int local602;
		if (!arg3) {
			@Pc(562) Class184 local562 = null;
			while (true) {
				while (local73.aByteArray70.length > local73.anInt4268) {
					local200 = local73.method3643();
					if (local200 == 0) {
						local562 = new Class184(local73);
					} else if (local200 == 1) {
						local602 = local73.method3643();
						if (local602 > 0) {
							for (local214 = 0; local214 < local602; local214++) {
								@Pc(613) Class3_Sub13_Sub1 local613 = new Class3_Sub13_Sub1(local73);
								if (local613.anInt6678 == 31) {
									@Pc(623) Class176 local623 = Static137.method2084(local73.method3649());
									local613.method5602(local623.anInt5446, local623.anInt5447, local623.anInt5449, local623.anInt5454);
								}
								local613.anInt6662 += arg1 << 7;
								local613.anInt6666 += arg0 << 7;
								local220 = local613.anInt6662 >> 7;
								local235 = local613.anInt6666 >> 7;
								if (local220 >= 0 && local235 >= 0 && local220 < Static162.anInt2152 && local235 < Static122.anInt2632) {
									local613.anInt6667 = Static105.anIntArrayArrayArray2[local613.anInt6672][local220][local235] - local613.anInt6667;
									if (arg6.method4800() > 0) {
										Static271.method4583(local613);
									}
								}
							}
						}
					} else if (local200 == 2) {
						if (local562 == null) {
							local562 = new Class184();
						}
						local562.method4955(local73);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local562 != null) {
					for (local200 = 0; local200 < 8; local200++) {
						for (local602 = 0; local602 < 8; local602++) {
							local214 = local200 + (arg1 >> 3);
							local218 = (arg0 >> 3) + local602;
							if (local214 >= 0 && Static162.anInt2152 >> 3 > local214 && local218 >= 0 && local218 < Static122.anInt2632 >> 3) {
								Static26.method563(local562, local218, local214);
							}
						}
					}
				}
				break;
			}
		}
		if (!local139 && Static72.aByteArrayArrayArray1 != null) {
			for (local145 = 0; local145 < 4; local145++) {
				if (Static72.aByteArrayArrayArray1[local145] != null) {
					for (local200 = 0; local200 < 16; local200++) {
						for (local602 = 0; local602 < 16; local602++) {
							local214 = (arg1 >> 2) + local200;
							local218 = local602 + (arg0 >> 2);
							if (local214 >= 0 && local214 < 26 && local218 >= 0 && local218 < 26) {
								Static72.aByteArrayArrayArray1[local145][local214][local218] = 0;
							}
						}
					}
				}
			}
		}
		if (local137) {
			return Static103.anIntArray126;
		} else {
			return null;
		}
	}
}
