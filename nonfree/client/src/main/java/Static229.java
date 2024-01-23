import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "Lclient!rn;")
	public static Class155 aClass155_93;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	public static int anInt4480 = -1;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "[I")
	public static int[] anIntArray496 = new int[2500];

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "[I")
	public static int[] anIntArray497 = new int[32];

	@OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
	public static int anInt4487 = 0;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString161 = "yellow:";

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3778(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(15) String local15 = Static190.method3179(arg0);
		if (local15 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static285.anInt5735; local22++) {
			@Pc(35) String local35 = Static190.method3179(Static286.aStringArray37[local22]);
			if (local35 != null && local35.equals(local15)) {
				Static285.anInt5735--;
				for (@Pc(47) int local47 = local22; local47 < Static285.anInt5735; local47++) {
					Static286.aStringArray37[local47] = Static286.aStringArray37[local47 + 1];
					Static136.aStringArray22[local47] = Static136.aStringArray22[local47 + 1];
					Static139.anIntArray400[local47] = Static139.anIntArray400[local47 + 1];
					Static151.aStringArray24[local47] = Static151.aStringArray24[local47 + 1];
					Static9.anIntArray16[local47] = Static9.anIntArray16[local47 + 1];
					Static279.aBooleanArray122[local47] = Static279.aBooleanArray122[local47 + 1];
				}
				Static152.anInt2882 = Static201.anInt3956;
				Static215.aClass3_Sub26_Sub1_2.method3958(30);
				Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0));
				Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3779(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static254.aClass69_1);
		arg0.removeFocusListener(Static254.aClass69_1);
		Static206.anInt4081 = -1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI[Lclient!rk;IB[BIII)[I")
	public static int[] method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class153[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = (arg9 & 0x7) * 8;
		@Pc(17) int local17 = (arg1 & 0x7) * 8;
		@Pc(29) int local29;
		@Pc(47) int local47;
		if (!arg2) {
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (local29 = 0; local29 < 8; local29++) {
					local47 = arg7 + Static34.method526(arg3, local29 & 0x7, local22 & 0x7);
					@Pc(59) int local59 = Static148.method2518(local29 & 0x7, local22 & 0x7, arg3) + arg8;
					if (local47 > 0 && local47 < 103 && local59 > 0 && local59 < 103) {
						arg4[arg5].anIntArrayArray69[local47][local59] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(103) byte local103;
		if (arg2) {
			local103 = 1;
		} else {
			local103 = 4;
		}
		local29 = (arg9 & 0xFFFFFFF8) << 3;
		@Pc(124) Class3_Sub26 local124 = new Class3_Sub26(arg6);
		@Pc(126) byte local126 = 0;
		local47 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(134) byte local134 = 0;
		if (arg3 == 1) {
			local126 = 1;
		} else if (arg3 == 2) {
			local126 = 1;
			local134 = 1;
		} else if (arg3 == 3) {
			local134 = 1;
		}
		@Pc(176) int local176;
		@Pc(232) int local232;
		@Pc(244) int local244;
		@Pc(278) int local278;
		@Pc(285) int local285;
		@Pc(300) int local300;
		@Pc(308) int local308;
		for (@Pc(162) int local162 = 0; local162 < local103; local162++) {
			for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
				for (local176 = 0; local176 < 64; local176++) {
					if (local162 != arg0 || local171 < local11 || local171 > local11 + 8 || local17 > local176 || local176 > local17 + 8) {
						Static77.method1205(0, false, -1, 0, 0, -1, 0, 0, arg2, local124, 0);
					} else if (local11 + 8 == local171 || local176 == local17 + 8) {
						if (arg3 == 0) {
							local244 = arg8 + local176 - local17;
							local232 = arg7 + local171 - local11;
						} else if (arg3 == 1) {
							local232 = local176 + arg7 - local17;
							local244 = arg8 + local11 + 8 - local171;
						} else if (arg3 == 2) {
							local232 = arg7 + local11 + 8 - local171;
							local244 = local17 + arg8 + 8 - local176;
						} else {
							local232 = local17 + arg7 + 8 - local176;
							local244 = local171 + arg8 - local11;
						}
						Static77.method1205(0, true, local244, 0, 0, local232, local29 + local171, arg5, arg2, local124, local176 + local47);
					} else {
						local232 = Static34.method526(arg3, local176 & 0x7, local171 & 0x7) + arg7;
						local244 = Static148.method2518(local176 & 0x7, local171 & 0x7, arg3) + arg8;
						Static77.method1205(arg3, false, local244, local126, local134, local232, local29 + local171, arg5, arg2, local124, local176 + local47);
						if (local171 == 63 || local176 == 63) {
							local278 = local171 == 63 ? 64 : local171;
							local285 = local176 == 63 ? 64 : local176;
							if (arg3 == 0) {
								local308 = arg8 + local285 - local17;
								local300 = local278 + arg7 - local11;
							} else if (arg3 == 1) {
								local300 = local285 + arg7 - local17;
								local308 = arg8 + local11 + 8 - local278;
							} else if (arg3 == 2) {
								local300 = arg7 + local11 + 8 - local278;
								local308 = arg8 + local17 + 8 - local285;
							} else {
								local308 = local278 + arg8 - local11;
								local300 = local17 + arg7 + 8 - local285;
							}
							if (local300 >= 0 && local300 < 104 && local308 >= 0 && local308 < 104) {
								Static256.anIntArrayArrayArray14[arg5][local300][local308] = Static256.anIntArrayArrayArray14[arg5][local232 + local134][local244 + local126];
							}
						}
					}
				}
			}
		}
		@Pc(529) boolean local529 = false;
		@Pc(652) int local652;
		@Pc(694) int local694;
		while (local124.aByteArray64.length > local124.anInt4615) {
			local176 = local124.method3915();
			if (local176 == 128) {
				local529 = true;
				Static22.anIntArray33[0] = local124.method3948();
				Static22.anIntArray33[1] = local124.method3930();
				Static22.anIntArray33[2] = local124.method3930();
				Static22.anIntArray33[3] = local124.method3930();
				Static22.anIntArray33[4] = local124.method3948();
			} else {
				if (local176 != 129) {
					local124.anInt4615--;
					break;
				}
				for (local232 = 0; local232 < 4; local232++) {
					@Pc(604) byte local604 = local124.method3920();
					if (local604 == 0) {
						if (local232 <= arg0) {
							local278 = arg7;
							local285 = arg7 + 7;
							if (local285 < 0) {
								local285 = 0;
							} else if (local285 >= 104) {
								local285 = 104;
							}
							if (arg7 < 0) {
								local278 = 0;
							} else if (arg7 >= 104) {
								local278 = 104;
							}
							local308 = arg8 + 7;
							local300 = arg8;
							if (local308 < 0) {
								local308 = 0;
							} else if (local308 >= 104) {
								local308 = 104;
							}
							if (arg8 < 0) {
								local300 = 0;
							} else if (arg8 >= 104) {
								local300 = 104;
							}
							while (local285 > local278) {
								while (local308 > local300) {
									Static48.aByteArrayArrayArray3[arg5][local278][local300] = 0;
									local300++;
								}
								local278++;
							}
						}
					} else if (local604 == 1) {
						for (local278 = 0; local278 < 64; local278 += 4) {
							for (local285 = 0; local285 < 64; local285 += 4) {
								@Pc(632) byte local632 = local124.method3920();
								if (arg0 >= local232) {
									for (local308 = local278; local308 < local278 + 4; local308++) {
										for (local652 = local285; local652 < local285 + 4; local652++) {
											if (local11 <= local308 && local11 + 8 > local308 && local652 >= local17 && local17 < local17 + 8) {
												local694 = Static34.method526(arg3, local652 & 0x7, local308 & 0x7) + arg7;
												@Pc(706) int local706 = Static148.method2518(local652 & 0x7, local308 & 0x7, arg3) + arg8;
												if (local694 >= 0 && local694 < 104 && local706 >= 0 && local706 < 104) {
													Static48.aByteArrayArrayArray3[arg5][local694][local706] = local632;
												}
											}
										}
									}
								}
							}
						}
					} else if (local604 != 2) {
					}
				}
			}
		}
		if (Static283.aBoolean393 && !arg2) {
			@Pc(863) Class74 local863 = null;
			label287: while (true) {
				while (true) {
					while (local124.aByteArray64.length > local124.anInt4615) {
						local232 = local124.method3915();
						if (local232 == 0) {
							local863 = new Class74(local124);
						} else if (local232 == 1) {
							local244 = local124.method3915();
							if (local244 > 0) {
								for (local278 = 0; local278 < local244; local278++) {
									@Pc(927) Class90 local927 = new Class90(local124);
									if (local927.anInt2637 == 31) {
										@Pc(940) Class89 local940 = Static307.method4925(local124.method3948());
										local927.method2335(local940.anInt2617, local940.anInt2622, local940.anInt2625, local940.anInt2618);
									}
									local300 = local927.anInt2630 >> 7;
									local308 = local927.anInt2639 >> 7;
									if (local927.anInt2638 == arg0 && local11 <= local300 && local300 < local11 + 8 && local308 >= local17 && local17 + 8 > local308) {
										local652 = Static27.method427(local927.anInt2630 & 0x3FF, local927.anInt2639 & 0x3FF, arg3) + (arg7 << 7);
										local694 = (arg8 << 7) + Static89.method1357(arg3, local927.anInt2639 & 0x3FF, local927.anInt2630 & 0x3FF);
										local927.anInt2639 = local694;
										local308 = local927.anInt2639 >> 7;
										local927.anInt2630 = local652;
										local300 = local927.anInt2630 >> 7;
										if (local300 >= 0 && local308 >= 0 && local300 < 104 && local308 < 104) {
											local927.aBoolean195 = (Static41.aByteArrayArrayArray2[1][local300][local308] & 0x2) != 0;
											local927.anInt2632 = Static256.anIntArrayArrayArray14[local927.anInt2638][local300][local308] - local927.anInt2632;
											Static142.method2403(local927);
										}
									}
								}
							}
						} else if (local232 == 2) {
							if (local863 == null) {
								local863 = new Class74();
							}
							local863.method1780(local124);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local863 == null) {
						local863 = new Class74();
					}
					Static43.aClass74ArrayArray1[arg7 >> 3][arg8 >> 3] = local863;
					break label287;
				}
			}
		}
		local176 = arg7 + 7;
		local232 = arg8 + 7;
		for (local244 = arg7; local244 < local176; local244++) {
			for (local278 = arg8; local278 < local232; local278++) {
				Static48.aByteArrayArrayArray3[arg5][local244][local278] = 0;
			}
		}
		return local529 ? Static22.anIntArray33 : null;
	}
}
