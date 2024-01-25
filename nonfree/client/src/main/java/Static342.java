import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_108 = new Class66(64);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[BIIILclient!en;IZIIZ[Lclient!dl;)[I")
	public static int[] method5672(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class49[] arg10) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg0 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg7) {
			@Pc(23) Class49 local23 = arg10[arg9];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = Static29.method725(local25 & 0x7, arg6, local29 & 0x7) + arg8;
					@Pc(55) int local55 = Static272.method4621(local29 & 0x7, local25 & 0x7, arg6) + arg4;
					if (local43 > 0 && local43 < Static266.anInt5101 - 1 && local55 > 0 && local55 < Static339.anInt6352 - 1) {
						local23.method1230(local43, local55);
					}
				}
			}
		}
		@Pc(99) byte local99;
		if (arg7) {
			local99 = 1;
		} else {
			local99 = 4;
		}
		@Pc(108) Class5_Sub1 local108 = new Class5_Sub1(arg1);
		local25 = (arg2 & 0x1FFFFFF8) << 3;
		local29 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(122) byte local122 = 0;
		@Pc(124) byte local124 = 0;
		if (arg6 == 1) {
			local124 = 1;
		} else if (arg6 == 2) {
			local124 = 1;
			local122 = 1;
		} else if (arg6 == 3) {
			local122 = 1;
		}
		@Pc(236) int local236;
		@Pc(248) int local248;
		@Pc(278) int local278;
		@Pc(285) int local285;
		@Pc(303) int local303;
		@Pc(311) int local311;
		for (@Pc(149) int local149 = 0; local149 < local99; local149++) {
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
					if (arg3 != local149 || local153 < local11 || local11 + 8 < local153 || local157 < local17 || local17 + 8 < local157) {
						Static233.method3987(arg7, local108, -1, 0, 0, -1, 0, 0, 0, 0, false);
					} else if (local153 == local11 + 8 || local17 + 8 == local157) {
						if (arg6 == 0) {
							local248 = local157 + arg4 - local17;
							local236 = arg8 + local153 - local11;
						} else if (arg6 == 1) {
							local248 = arg4 + local11 + 8 - local153;
							local236 = arg8 + local157 - local17;
						} else if (arg6 == 2) {
							local236 = local11 + arg8 + 8 - local153;
							local248 = arg4 + local17 + 8 - local157;
						} else {
							local248 = local153 + arg4 - local11;
							local236 = local17 + arg8 + 8 - local157;
						}
						Static233.method3987(arg7, local108, local236, local29 + local157, arg9, local248, 0, 0, local25 + local153, 0, true);
					} else {
						local236 = arg8 + Static29.method725(local153 & 0x7, arg6, local157 & 0x7);
						local248 = arg4 + Static272.method4621(local157 & 0x7, local153 & 0x7, arg6);
						Static233.method3987(arg7, local108, local236, local157 + local29, arg9, local248, local124, arg6, local25 + local153, local122, false);
						if (local153 == 63 || local157 == 63) {
							local278 = local153 == 63 ? 64 : local153;
							local285 = local157 == 63 ? 64 : local157;
							if (arg6 == 0) {
								local311 = local285 + arg4 - local17;
								local303 = arg8 + local278 - local11;
							} else if (arg6 == 1) {
								local303 = arg8 + local285 - local17;
								local311 = local11 + arg4 + 8 - local278;
							} else if (arg6 == 2) {
								local311 = arg4 + local17 + 8 - local285;
								local303 = arg8 + local11 + 8 - local278;
							} else {
								local311 = local278 + arg4 - local11;
								local303 = arg8 + local17 + 8 - local285;
							}
							if (local303 >= 0 && local303 < Static266.anInt5101 && local311 >= 0 && local311 < Static339.anInt6352) {
								Static200.anIntArrayArrayArray17[arg9][local303][local311] = Static200.anIntArrayArrayArray17[arg9][local236 + local122][local248 + local124];
							}
						}
					}
				}
			}
		}
		@Pc(523) boolean local523 = false;
		@Pc(636) int local636;
		@Pc(640) int local640;
		@Pc(683) int local683;
		while (local108.anInt2029 < local108.aByteArray18.length) {
			local236 = local108.method1832();
			if (local236 == 128) {
				Static222.anIntArray313[0] = local108.method1845();
				Static222.anIntArray313[1] = local108.method1834();
				Static222.anIntArray313[2] = local108.method1834();
				Static222.anIntArray313[3] = local108.method1834();
				Static222.anIntArray313[4] = local108.method1845();
				local523 = true;
			} else {
				if (local236 != 129) {
					local108.anInt2029--;
					break;
				}
				if (Static54.aByteArrayArrayArray6 == null) {
					Static54.aByteArrayArrayArray6 = new byte[4][][];
				}
				for (local248 = 0; local248 < 4; local248++) {
					@Pc(594) byte local594 = local108.method1863();
					if (local594 == 0 && Static54.aByteArrayArrayArray6[arg9] != null) {
						if (local248 <= arg3) {
							local285 = arg8;
							local303 = arg8 + 7;
							local311 = arg4;
							if (arg4 < 0) {
								local311 = 0;
							} else if (arg4 >= Static339.anInt6352) {
								local311 = Static339.anInt6352;
							}
							local636 = arg4 + 7;
							if (local303 < 0) {
								local303 = 0;
							} else if (Static266.anInt5101 <= local303) {
								local303 = Static266.anInt5101;
							}
							if (arg8 < 0) {
								local285 = 0;
							} else if (Static266.anInt5101 <= arg8) {
								local285 = Static266.anInt5101;
							}
							if (local636 < 0) {
								local636 = 0;
							} else if (local636 >= Static339.anInt6352) {
								local636 = Static339.anInt6352;
							}
							while (local303 > local285) {
								while (local311 < local636) {
									Static54.aByteArrayArrayArray6[arg9][local285][local311] = 0;
									local311++;
								}
								local285++;
							}
						}
					} else if (local594 == 1) {
						if (Static54.aByteArrayArrayArray6[arg9] == null) {
							Static54.aByteArrayArrayArray6[arg9] = new byte[Static266.anInt5101 + 1][Static339.anInt6352 + 1];
						}
						for (local285 = 0; local285 < 64; local285 += 4) {
							for (local303 = 0; local303 < 64; local303 += 4) {
								@Pc(631) byte local631 = local108.method1863();
								if (arg3 >= local248) {
									for (local636 = local285; local636 < local285 + 4; local636++) {
										for (local640 = local303; local640 < local303 + 4; local640++) {
											if (local636 >= local11 && local11 + 8 > local636 && local17 <= local640 && local17 + 8 > local17) {
												local683 = arg8 + Static29.method725(local636 & 0x7, arg6, local640 & 0x7);
												@Pc(695) int local695 = arg4 + Static272.method4621(local640 & 0x7, local636 & 0x7, arg6);
												if (local683 >= 0 && local683 < Static266.anInt5101 && local695 >= 0 && local695 < Static339.anInt6352) {
													Static54.aByteArrayArrayArray6[arg9][local683][local695] = local631;
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
		if (!arg7) {
			@Pc(861) Class6 local861 = null;
			while (true) {
				while (local108.aByteArray18.length > local108.anInt2029) {
					local248 = local108.method1832();
					if (local248 == 0) {
						local861 = new Class6(local108);
					} else if (local248 == 1) {
						local278 = local108.method1832();
						if (local278 > 0) {
							for (local285 = 0; local285 < local278; local285++) {
								@Pc(896) Class5_Sub13_Sub1 local896 = new Class5_Sub13_Sub1(local108);
								if (local896.anInt2085 == 31) {
									@Pc(908) Class149 local908 = Static321.method5423(local108.method1845());
									local896.method1926(local908.anInt4492, local908.anInt4490, local908.anInt4485, local908.anInt4487);
								}
								local311 = local896.anInt2080 >> 7;
								local636 = local896.anInt2082 >> 7;
								if (arg3 == local896.anInt2094 && local311 >= local11 && local311 < local11 + 8 && local636 >= local17 && local636 < local17 + 8) {
									local640 = (arg8 << 7) + Static22.method566(arg6, local896.anInt2080 & 0x3FF, local896.anInt2082 & 0x3FF);
									local683 = Static108.method2173(local896.anInt2080 & 0x3FF, arg6, local896.anInt2082 & 0x3FF) + (arg4 << 7);
									local896.anInt2080 = local640;
									local896.anInt2082 = local683;
									local636 = local896.anInt2082 >> 7;
									local311 = local896.anInt2080 >> 7;
									if (local311 >= 0 && local636 >= 0 && local311 < Static266.anInt5101 && local636 < Static339.anInt6352) {
										local896.anInt2076 = Static200.anIntArrayArrayArray17[arg3][local311][local636] - local896.anInt2076;
										if (arg5.method4796() > 0) {
											Static152.method2890(local896);
										}
									}
								}
							}
						}
					} else if (local248 == 2) {
						if (local861 == null) {
							local861 = new Class6();
						}
						local861.method188(local108);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local861 != null) {
					Static3.method5633(arg8 >> 3, arg4 >> 3, local861);
				}
				break;
			}
		}
		if (Static54.aByteArrayArrayArray6 != null && Static54.aByteArrayArrayArray6[arg9] != null) {
			local236 = arg8 + 7;
			local248 = arg4 + 7;
			for (local278 = arg8; local278 < local236; local278++) {
				for (local285 = arg4; local285 < local248; local285++) {
					Static54.aByteArrayArrayArray6[arg9][local278][local285] = 0;
				}
			}
		}
		if (local523) {
			return Static222.anIntArray313;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V")
	public static void method5673() {
		Static26.aClass59_2.method4876(Static57.aFloat20, Static352.aFloat104, Static126.aFloat34);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public static void method5674() {
		Static126.aClass66_44.method1944(5);
		Static261.aClass66_87.method1944(5);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V")
	public static void method5676(@OriginalArg(1) boolean arg0) {
		if (Static22.aBoolean44 != arg0) {
			Static22.aBoolean44 = arg0;
			Static168.method3162();
		}
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)V")
	public static void method5677() {
		Static56.aClass66_19.method1942();
		Static38.aClass66_11.method1942();
	}
}
