import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Lclient!lc;")
	public static Class98 aClass98_116;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!on", name = "L", descriptor = "[I")
	public static int[] anIntArray323 = new int[4];

	@OriginalMember(owner = "client!on", name = "P", descriptor = "[I")
	public static int[] anIntArray324 = new int[100];

	@OriginalMember(owner = "client!on", name = "U", descriptor = "[Lclient!pn;")
	public static Class12_Sub7[] aClass12_Sub7Array1 = new Class12_Sub7[4];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V")
	public static void method3080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(14) int local14 = arg2 - arg3;
		if (local10 == 0) {
			if (local14 != 0) {
				Static221.method3531(arg3, arg1, arg2, arg0);
			}
		} else if (local14 == 0) {
			Static181.method1754(arg3, arg1, arg4, arg0);
		} else {
			@Pc(53) int local53 = (local14 << 12) / local10;
			@Pc(62) int local62 = arg3 - (local53 * arg0 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (arg0 < Static211.anInt4200) {
				local73 = local62 + (Static211.anInt4200 * local53 >> 12);
				local75 = Static211.anInt4200;
			} else if (arg0 <= Static154.anInt3126) {
				local75 = arg0;
				local73 = arg3;
			} else {
				local73 = local62 + (local53 * Static154.anInt3126 >> 12);
				local75 = Static154.anInt3126;
			}
			@Pc(105) int local105;
			@Pc(113) int local113;
			if (arg4 < Static211.anInt4200) {
				local105 = Static211.anInt4200;
				local113 = (Static211.anInt4200 * local53 >> 12) + local62;
			} else if (arg4 > Static154.anInt3126) {
				local113 = (local53 * Static154.anInt3126 >> 12) + local62;
				local105 = Static154.anInt3126;
			} else {
				local105 = arg4;
				local113 = arg2;
			}
			if (local73 < Static171.anInt3392) {
				local73 = Static171.anInt3392;
				local75 = (Static171.anInt3392 - local62 << 12) / local53;
			} else if (local73 > Static141.anInt2889) {
				local75 = (Static141.anInt2889 - local62 << 12) / local53;
				local73 = Static141.anInt2889;
			}
			if (local113 < Static171.anInt3392) {
				local113 = Static171.anInt3392;
				local105 = (Static171.anInt3392 - local62 << 12) / local53;
			} else if (Static141.anInt2889 < local113) {
				local105 = (Static141.anInt2889 - local62 << 12) / local53;
				local113 = Static141.anInt2889;
			}
			Static153.method2444(arg1, local105, local75, local113, local73);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([Lclient!hm;IIZII[BI)[I")
	public static int[] method3081(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(11) int local11;
		@Pc(16) int local16;
		if (!arg3) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (local11 = 0; local11 < 64; local11++) {
					for (local16 = 0; local16 < 64; local16++) {
						if (local11 + arg5 > 0 && local11 + arg5 < 103 && arg4 + local16 > 0 && local16 + arg4 < 103) {
							arg0[local6].anIntArrayArray21[arg5 + local11][local16 + arg4] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(92) byte local92;
		if (arg3) {
			local92 = 1;
		} else {
			local92 = 4;
		}
		local16 = arg4 + arg1;
		local11 = arg2 + arg5;
		@Pc(119) Class4_Sub17 local119 = new Class4_Sub17(arg6);
		@Pc(131) int local131;
		for (@Pc(121) int local121 = 0; local121 < local92; local121++) {
			for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
				for (local131 = 0; local131 < 64; local131++) {
					Static214.method3421(local121, 0, arg4 + local131, arg3, local119, 0, false, arg5 + local126, 0, local131 + local16, local126 + local11);
				}
			}
		}
		@Pc(168) boolean local168 = false;
		@Pc(170) boolean local170 = false;
		@Pc(194) int local194;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(233) int local233;
		@Pc(235) int local235;
		while (local119.aByteArray30.length > local119.anInt2400) {
			local131 = local119.method1874();
			if (local131 == 128) {
				Static179.anIntArray299[0] = local119.method1837();
				Static179.anIntArray299[1] = local119.method1869();
				local168 = true;
				Static179.anIntArray299[2] = local119.method1869();
				Static179.anIntArray299[3] = local119.method1869();
				Static179.anIntArray299[4] = local119.method1837();
			} else {
				if (local131 != 129) {
					local119.anInt2400--;
					break;
				}
				local170 = true;
				for (local194 = 0; local194 < 4; local194++) {
					@Pc(203) byte local203 = local119.method1892();
					if (local203 == 0) {
						local210 = arg5;
						local214 = arg5 + 64;
						if (local214 < 0) {
							local214 = 0;
						} else if (local214 >= 104) {
							local214 = 104;
						}
						local233 = arg4 + 64;
						local235 = arg4;
						if (local233 < 0) {
							local233 = 0;
						} else if (local233 >= 104) {
							local233 = 104;
						}
						if (arg4 < 0) {
							local235 = 0;
						} else if (arg4 >= 104) {
							local235 = 104;
						}
						if (arg5 < 0) {
							local210 = 0;
						} else if (arg5 >= 104) {
							local210 = 104;
						}
						while (local214 > local210) {
							while (local233 > local235) {
								Static35.aByteArrayArrayArray1[local194][local210][local235] = 0;
								local235++;
							}
							local210++;
						}
					} else if (local203 == 1) {
						for (local210 = 0; local210 < 64; local210 += 4) {
							for (local214 = 0; local214 < 64; local214 += 4) {
								@Pc(448) byte local448 = local119.method1892();
								for (local233 = arg5 + local210; local233 < arg5 + local210 + 4; local233++) {
									for (@Pc(463) int local463 = local214 + arg4; local463 < local214 + arg4 + 4; local463++) {
										if (local233 >= 0 && local233 < 104 && local463 >= 0 && local463 < 104) {
											Static35.aByteArrayArrayArray1[local194][local233][local463] = local448;
										}
									}
								}
							}
						}
					} else if (local203 == 2 && local194 > 0) {
						local214 = arg5 + 64;
						if (local214 < 0) {
							local214 = 0;
						} else if (local214 >= 104) {
							local214 = 104;
						}
						local210 = arg5;
						if (arg5 < 0) {
							local210 = 0;
						} else if (arg5 >= 104) {
							local210 = 104;
						}
						local233 = arg4 + 64;
						if (local233 < 0) {
							local233 = 0;
						} else if (local233 >= 104) {
							local233 = 104;
						}
						local235 = arg4;
						if (arg4 < 0) {
							local235 = 0;
						} else if (arg4 >= 104) {
							local235 = 104;
						}
						while (local210 < local214) {
							while (local235 < local233) {
								Static35.aByteArrayArrayArray1[local194][local210][local235] = Static35.aByteArrayArrayArray1[local194 - 1][local210][local235];
								local235++;
							}
							local210++;
						}
					}
				}
			}
		}
		@Pc(610) int local610;
		if (Static178.aBoolean216 && !arg3) {
			@Pc(564) Class64 local564 = null;
			while (true) {
				while (local119.aByteArray30.length > local119.anInt2400) {
					local194 = local119.method1874();
					if (local194 == 0) {
						local564 = new Class64(local119);
					} else if (local194 == 1) {
						local610 = local119.method1874();
						if (local610 > 0) {
							for (local210 = 0; local210 < local610; local210++) {
								@Pc(622) Class155 local622 = new Class155(local119);
								if (local622.anInt4692 == 31) {
									@Pc(632) Class24 local632 = Static40.method673(local119.method1837());
									local622.method3754(local632.anInt657, local632.anInt652, local632.anInt660, local632.anInt659);
								}
								local622.anInt4691 += arg4 << 7;
								local622.anInt4688 += arg5 << 7;
								local235 = local622.anInt4688 >> 7;
								local233 = local622.anInt4691 >> 7;
								if (local235 >= 0 && local233 >= 0 && local235 < 104 && local233 < 104) {
									local622.aBoolean306 = (Static46.aByteArrayArrayArray2[1][local235][local233] & 0x2) != 0;
									local622.anInt4687 = Static250.anIntArrayArrayArray13[local622.anInt4698][local235][local233] - local622.anInt4687;
									Static12.method203(local622);
								}
							}
						}
					} else if (local194 == 2) {
						if (local564 == null) {
							local564 = new Class64();
						}
						local564.method1734(local119);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local564 == null) {
					local564 = new Class64();
				}
				for (local194 = 0; local194 < 8; local194++) {
					for (local610 = 0; local610 < 8; local610++) {
						local210 = local194 + (arg5 >> 3);
						local214 = (arg4 >> 3) + local610;
						if (local210 >= 0 && local210 < 13 && local214 >= 0 && local214 < 13) {
							Static61.aClass64ArrayArray1[local210][local214] = local564;
						}
					}
				}
				break;
			}
		}
		if (!local170) {
			for (local131 = 0; local131 < 4; local131++) {
				for (local194 = 0; local194 < 16; local194++) {
					for (local610 = 0; local610 < 16; local610++) {
						local214 = (arg4 >> 2) + local610;
						local210 = local194 + (arg5 >> 2);
						if (local210 >= 0 && local210 < 26 && local214 >= 0 && local214 < 26) {
							Static35.aByteArrayArrayArray1[local131][local210][local214] = 0;
						}
					}
				}
			}
		}
		return local168 ? Static179.anIntArray299 : null;
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public static void method3082() {
		if (Static53.anIntArray123 != null && Static79.anIntArray165 != null) {
			return;
		}
		Static53.anIntArray123 = new int[256];
		Static79.anIntArray165 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(29) double local29 = (double) local17 / 255.0D * 6.283185307179586D;
			Static53.anIntArray123[local17] = (int) (Math.sin(local29) * 4096.0D);
			Static79.anIntArray165[local17] = (int) (Math.cos(local29) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V")
	public static void method3083() {
		anIntArray324 = null;
		anIntArray323 = null;
		aClass12_Sub7Array1 = null;
		aClass98_116 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BILclient!g;)V")
	public static void method3084(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub3 arg1) {
		if (Static104.anInt2226 < arg1.anInt4193) {
			Static76.method1154(arg1);
		} else if (arg1.anInt4137 < Static104.anInt2226) {
			Static3.method50(arg1);
		} else {
			Static190.method3014(arg1);
		}
		if (arg1.anInt4141 < 128 || arg1.anInt4113 < 128 || arg1.anInt4141 >= 13184 || arg1.anInt4113 >= 13184) {
			arg1.anInt4193 = 0;
			arg1.anInt4125 = -1;
			arg1.anInt4178 = -1;
			arg1.anInt4137 = 0;
			arg1.anInt4141 = arg1.anIntArray376[0] * 128 + arg1.method3375() * 64;
			arg1.anInt4113 = arg1.anIntArray379[0] * 128 + arg1.method3375() * 64;
			arg1.method3363();
		}
		if (arg1 == Static239.aClass12_Sub3_Sub2_2 && (arg1.anInt4141 < 1536 || arg1.anInt4113 < 1536 || arg1.anInt4141 >= 11776 || arg1.anInt4113 >= 11776)) {
			arg1.anInt4125 = -1;
			arg1.anInt4178 = -1;
			arg1.anInt4193 = 0;
			arg1.anInt4137 = 0;
			arg1.anInt4141 = arg1.anIntArray376[0] * 128 + arg1.method3375() * 64;
			arg1.anInt4113 = arg1.anIntArray379[0] * 128 + arg1.method3375() * 64;
			arg1.method3363();
		}
		Static121.method2053(arg1);
		Static2.method15(arg1);
	}
}
