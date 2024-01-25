import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public static int anInt5906;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public static int anInt5908;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[S")
	public static short[] aShortArray112;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Lclient!rk;")
	public static Class180 aClass180_88;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
	public static final int[] anIntArray752 = new int[3];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Lclient!gb;")
	public static Class22_Sub3 method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class22_Sub3 local14 = local7.aClass22_Sub3_1;
			local7.aClass22_Sub3_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!sa;IBLclient!pe;Lclient!sa;Z[[I[[B[[B[[B[[B)V")
	public static void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class89 arg4, @OriginalArg(6) Class8 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static329.anInt6220 == 0 && !Static53.aBoolean112) {
			Static47.method1059(arg3, arg6, arg0, arg11, arg2, arg7, arg5, arg1, arg9, arg4, arg8, arg10);
		} else {
			Static107.method1192(arg5, arg4, arg7, arg3, arg8, arg11, arg1, arg6, arg9, arg10, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public static void method5005() {
		for (@Pc(8) Class7_Sub26 local8 = (Class7_Sub26) Static75.aClass74_7.method1793(); local8 != null; local8 = (Class7_Sub26) Static75.aClass74_7.method1798()) {
			if (local8.aBoolean310) {
				local8.method3578();
			}
		}
		for (@Pc(44) Class7_Sub26 local44 = (Class7_Sub26) Static45.aClass74_4.method1793(); local44 != null; local44 = (Class7_Sub26) Static45.aClass74_4.method1798()) {
			if (local44.aBoolean310) {
				local44.method3578();
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Lclient!u;")
	public static Class187_Sub1 method5007() {
		Static235.anInt4668 = 0;
		return Static345.method5562();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[BZZII[Lclient!oa;IILclient!pe;II)[I")
	public static int[] method5010(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class149[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class89 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(22) int local22 = (arg3 & 0x7) * 8;
		@Pc(30) int local30;
		@Pc(34) int local34;
		if (!arg2) {
			@Pc(28) Class149 local28 = arg5[arg0];
			for (local30 = 0; local30 < 8; local30++) {
				for (local34 = 0; local34 < 8; local34++) {
					@Pc(48) int local48 = Static146.method2934(local30 & 0x7, local34 & 0x7, arg4) + arg10;
					@Pc(60) int local60 = Static275.method4600(arg4, local30 & 0x7, local34 & 0x7) + arg7;
					if (local48 > 0 && Static15.anInt287 - 1 > local48 && local60 > 0 && local60 < Static325.anInt6173 - 1) {
						local28.method3953(local60, local48);
					}
				}
			}
		}
		@Pc(102) byte local102;
		if (arg2) {
			local102 = 1;
		} else {
			local102 = 4;
		}
		@Pc(111) Class7_Sub3 local111 = new Class7_Sub3(arg1);
		local30 = (arg6 & 0xFFFFFFF8) << 3;
		local34 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		if (arg4 == 1) {
			local127 = 1;
		} else if (arg4 == 2) {
			local127 = 1;
			local125 = 1;
		} else if (arg4 == 3) {
			local125 = 1;
		}
		@Pc(229) int local229;
		@Pc(242) int local242;
		@Pc(277) int local277;
		@Pc(286) int local286;
		@Pc(295) int local295;
		@Pc(302) int local302;
		for (@Pc(154) int local154 = 0; local154 < local102; local154++) {
			for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
				for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
					if (local154 != arg9 || local158 < local11 || local158 > local11 + 8 || local162 < local22 || local162 > local22 + 8) {
						Static93.method1896(-1, 0, -1, 0, 0, local111, 0, arg2, 0, false, 0);
					} else if (local158 == local11 + 8 || local22 + 8 == local162) {
						if (arg4 == 0) {
							local242 = arg7 + local162 - local22;
							local229 = local158 + arg10 - local11;
						} else if (arg4 == 1) {
							local229 = local162 + arg10 - local22;
							local242 = arg7 + local11 + 8 - local158;
						} else if (arg4 == 2) {
							local242 = arg7 + local22 + 8 - local162;
							local229 = local11 + arg10 + 8 - local158;
						} else {
							local242 = arg7 + local158 - local11;
							local229 = arg10 + local22 + 8 - local162;
						}
						Static93.method1896(local229, 0, local242, 0, local34 + local162, local111, 0, arg2, local158 + local30, true, arg0);
					} else {
						local229 = arg10 + Static146.method2934(local158 & 0x7, local162 & 0x7, arg4);
						local242 = arg7 + Static275.method4600(arg4, local158 & 0x7, local162 & 0x7);
						Static93.method1896(local229, local125, local242, local127, local162 + local34, local111, arg4, arg2, local30 + local158, false, arg0);
						if (local158 == 63 || local162 == 63) {
							local277 = local158 == 63 ? 64 : local158;
							local286 = local162 == 63 ? 64 : local162;
							if (arg4 == 0) {
								local295 = local277 + arg10 - local11;
								local302 = arg7 + local286 - local22;
							} else if (arg4 == 1) {
								local295 = local286 + arg10 - local22;
								local302 = arg7 + local11 + 8 - local277;
							} else if (arg4 == 2) {
								local295 = arg10 + local11 + 8 - local277;
								local302 = arg7 + local22 + 8 - local286;
							} else {
								local295 = local22 + arg10 + 8 - local286;
								local302 = local277 + arg7 - local11;
							}
							if (local295 >= 0 && local295 < Static15.anInt287 && local302 >= 0 && local302 < Static325.anInt6173) {
								Static23.anIntArrayArrayArray15[arg0][local295][local302] = Static23.anIntArrayArrayArray15[arg0][local229 + local125][local127 + local242];
							}
						}
					}
				}
			}
		}
		@Pc(521) boolean local521 = false;
		@Pc(637) int local637;
		@Pc(725) int local725;
		@Pc(763) int local763;
		while (local111.anInt3005 < local111.aByteArray33.length) {
			local229 = local111.method2772();
			if (local229 == 128) {
				Static210.anIntArray575[0] = local111.method2764();
				Static210.anIntArray575[1] = local111.method2744();
				Static210.anIntArray575[2] = local111.method2744();
				Static210.anIntArray575[3] = local111.method2744();
				Static210.anIntArray575[4] = local111.method2764();
				local521 = true;
			} else {
				if (local229 != 129) {
					local111.anInt3005--;
					break;
				}
				if (Static222.aByteArrayArrayArray10 == null) {
					Static222.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local242 = 0; local242 < 4; local242++) {
					@Pc(584) byte local584 = local111.method2779();
					if (local584 == 0 && Static222.aByteArrayArrayArray10[arg0] != null) {
						if (local242 <= arg9) {
							local286 = arg10;
							local295 = arg10 + 7;
							local302 = arg7;
							if (arg7 < 0) {
								local302 = 0;
							} else if (arg7 >= Static325.anInt6173) {
								local302 = Static325.anInt6173;
							}
							if (arg10 < 0) {
								local286 = 0;
							} else if (arg10 >= Static15.anInt287) {
								local286 = Static15.anInt287;
							}
							local637 = arg7 + 7;
							if (local295 < 0) {
								local295 = 0;
							} else if (Static15.anInt287 <= local295) {
								local295 = Static15.anInt287;
							}
							if (local637 < 0) {
								local637 = 0;
							} else if (local637 >= Static325.anInt6173) {
								local637 = Static325.anInt6173;
							}
							while (local286 < local295) {
								while (local637 > local302) {
									Static222.aByteArrayArrayArray10[arg0][local286][local302] = 0;
									local302++;
								}
								local286++;
							}
						}
					} else if (local584 == 1) {
						if (Static222.aByteArrayArrayArray10[arg0] == null) {
							Static222.aByteArrayArrayArray10[arg0] = new byte[Static15.anInt287 + 1][Static325.anInt6173 + 1];
						}
						for (local286 = 0; local286 < 64; local286 += 4) {
							for (local295 = 0; local295 < 64; local295 += 4) {
								@Pc(712) byte local712 = local111.method2779();
								if (arg9 >= local242) {
									for (local637 = local286; local637 < local286 + 4; local637++) {
										for (local725 = local295; local725 < local295 + 4; local725++) {
											if (local11 <= local637 && local637 < local11 + 8 && local725 >= local22 && local22 + 8 > local22) {
												local763 = Static146.method2934(local637 & 0x7, local725 & 0x7, arg4) + arg10;
												@Pc(775) int local775 = Static275.method4600(arg4, local637 & 0x7, local725 & 0x7) + arg7;
												if (local763 >= 0 && local763 < Static15.anInt287 && local775 >= 0 && Static325.anInt6173 > local775) {
													Static222.aByteArrayArrayArray10[arg0][local763][local775] = local712;
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
		if (!arg2) {
			@Pc(857) Class14 local857 = null;
			label280: while (true) {
				label273: do {
					while (true) {
						while (local111.anInt3005 < local111.aByteArray33.length) {
							local242 = local111.method2772();
							if (local242 == 0) {
								local857 = new Class14(local111);
							} else {
								if (local242 == 1) {
									local277 = local111.method2772();
									continue label273;
								}
								if (local242 != 2) {
									throw new IllegalStateException();
								}
								if (local857 == null) {
									local857 = new Class14();
								}
								local857.method211(local111);
							}
						}
						if (local857 != null) {
							Static71.method1391(local857, arg7 >> 3, arg10 >> 3);
						}
						break label280;
					}
				} while (local277 <= 0);
				for (local286 = 0; local286 < local277; local286++) {
					@Pc(890) Class7_Sub16_Sub1 local890 = new Class7_Sub16_Sub1(local111);
					if (local890.anInt4089 == 31) {
						@Pc(900) Class141 local900 = Static289.method1954(local111.method2764());
						local890.method3647(local900.anInt4235, local900.anInt4229, local900.anInt4238, local900.anInt4228);
					}
					local302 = local890.anInt4070 >> 7;
					local637 = local890.anInt4072 >> 7;
					if (arg9 == local890.anInt4088 && local11 <= local302 && local11 + 8 > local302 && local22 <= local637 && local22 + 8 > local637) {
						local725 = (arg10 << 7) + Static251.method5281(arg4, local890.anInt4072 & 0x3FF, local890.anInt4070 & 0x3FF);
						local763 = Static198.method3546(local890.anInt4070 & 0x3FF, local890.anInt4072 & 0x3FF, arg4) + (arg7 << 7);
						local890.anInt4070 = local725;
						local890.anInt4072 = local763;
						local302 = local890.anInt4070 >> 7;
						local637 = local890.anInt4072 >> 7;
						if (local302 >= 0 && local637 >= 0 && local302 < Static15.anInt287 && local637 < Static325.anInt6173) {
							local890.anInt4074 = Static23.anIntArrayArrayArray15[arg9][local302][local637] - local890.anInt4074;
							if (arg8.method5419() > 0) {
								Static229.method4024(local890);
							}
						}
					}
				}
			}
		}
		if (Static222.aByteArrayArrayArray10 != null && Static222.aByteArrayArrayArray10[arg0] != null) {
			local229 = arg10 + 7;
			local242 = arg7 + 7;
			for (local277 = arg10; local277 < local229; local277++) {
				for (local286 = arg7; local286 < local242; local286++) {
					Static222.aByteArrayArrayArray10[arg0][local277][local286] = 0;
				}
			}
		}
		if (local521) {
			return Static210.anIntArray575;
		} else {
			return null;
		}
	}
}
