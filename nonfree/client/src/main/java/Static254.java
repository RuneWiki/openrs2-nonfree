import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ph;Lclient!ph;Z)V")
	public static void method3868(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1) {
		Static230.aClass138_59 = arg1;
		Static5.aClass138_2 = arg0;
		Static19.anInt384 = Static230.aClass138_59.method3365(3);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZLclient!ph;Lclient!ph;)Lclient!kc;")
	public static Class1_Sub1_Sub12 method3869(@OriginalArg(1) int arg0, @OriginalArg(3) Class138 arg1, @OriginalArg(4) Class138 arg2) {
		return Static27.method486(arg0, 0, arg2) ? Static82.method1241(arg1.method3346(arg0, 0)) : null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BIIZIBIII[Lclient!o;)[I")
	public static int[] method3870(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class122[] arg9) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(41) int local41;
		if (!arg4) {
			for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
				for (local26 = 0; local26 < 8; local26++) {
					local41 = Static31.method537(arg5, local26 & 0x7, local21 & 0x7) + arg7;
					@Pc(53) int local53 = arg3 + Static84.method1248(arg5, local21 & 0x7, local26 & 0x7);
					if (local41 > 0 && local41 < 103 && local53 > 0 && local53 < 103) {
						arg9[arg8].anIntArrayArray28[local41][local53] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(98) byte local98;
		if (arg4) {
			local98 = 1;
		} else {
			local98 = 4;
		}
		@Pc(113) Class1_Sub14 local113 = new Class1_Sub14(arg1);
		local41 = (arg6 & 0x1FFFFFF8) << 3;
		local26 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (arg5 == 1) {
			local129 = 1;
		} else if (arg5 == 2) {
			local129 = 1;
			local127 = 1;
		} else if (arg5 == 3) {
			local127 = 1;
		}
		@Pc(164) int local164;
		@Pc(239) int local239;
		@Pc(246) int local246;
		@Pc(389) int local389;
		@Pc(396) int local396;
		@Pc(413) int local413;
		@Pc(422) int local422;
		for (@Pc(154) int local154 = 0; local154 < local98; local154++) {
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				for (local164 = 0; local164 < 64; local164++) {
					if (local154 != arg0 || local159 < local11 || local11 + 8 < local159 || local17 > local164 || local164 > local17 + 8) {
						Static300.method4498(false, -1, local113, 0, 0, arg4, 0, -1, 0, 0, 0);
					} else if (local11 + 8 == local159 || local17 + 8 == local164) {
						if (arg5 == 0) {
							local239 = arg7 + local159 - local11;
							local246 = arg3 + local164 - local17;
						} else if (arg5 == 1) {
							local239 = local164 + arg7 - local17;
							local246 = local11 + arg3 + 8 - local159;
						} else if (arg5 == 2) {
							local239 = arg7 + local11 + 8 - local159;
							local246 = local17 + arg3 + 8 - local164;
						} else {
							local239 = local17 + arg7 + 8 - local164;
							local246 = arg3 + local159 - local11;
						}
						Static300.method4498(true, local246, local113, arg8, 0, arg4, 0, local239, 0, local41 + local164, local26 + local159);
					} else {
						local239 = Static31.method537(arg5, local164 & 0x7, local159 & 0x7) + arg7;
						local246 = arg3 + Static84.method1248(arg5, local159 & 0x7, local164 & 0x7);
						Static300.method4498(false, local246, local113, arg8, arg5, arg4, local127, local239, local129, local41 + local164, local159 + local26);
						if (local159 == 63 || local164 == 63) {
							local389 = local159 == 63 ? 64 : local159;
							local396 = local164 == 63 ? 64 : local164;
							if (arg5 == 0) {
								local413 = local389 + arg7 - local11;
								local422 = local396 + arg3 - local17;
							} else if (arg5 == 1) {
								local413 = local396 + arg7 - local17;
								local422 = arg3 + local11 + 8 - local389;
							} else if (arg5 == 2) {
								local413 = local11 + arg7 + 8 - local389;
								local422 = arg3 + local17 + 8 - local396;
							} else {
								local413 = local17 + arg7 + 8 - local396;
								local422 = arg3 + local389 - local11;
							}
							if (local413 >= 0 && local413 < 104 && local422 >= 0 && local422 < 104) {
								Static208.anIntArrayArrayArray11[arg8][local413][local422] = Static208.anIntArrayArrayArray11[arg8][local127 + local239][local246 + local129];
							}
						}
					}
				}
			}
		}
		@Pc(520) boolean local520 = false;
		@Pc(702) int local702;
		@Pc(744) int local744;
		while (local113.aByteArray34.length > local113.anInt3290) {
			local164 = local113.method2595();
			if (local164 == 128) {
				local520 = true;
				Static195.anIntArray320[0] = local113.method2593();
				Static195.anIntArray320[1] = local113.method2623();
				Static195.anIntArray320[2] = local113.method2623();
				Static195.anIntArray320[3] = local113.method2623();
				Static195.anIntArray320[4] = local113.method2593();
			} else {
				if (local164 != 129) {
					local113.anInt3290--;
					break;
				}
				for (local239 = 0; local239 < 4; local239++) {
					@Pc(561) byte local561 = local113.method2598();
					if (local561 == 0) {
						if (arg0 >= local239) {
							local389 = arg7;
							if (arg7 < 0) {
								local389 = 0;
							} else if (arg7 >= 104) {
								local389 = 104;
							}
							local396 = arg7 + 7;
							if (local396 < 0) {
								local396 = 0;
							} else if (local396 >= 104) {
								local396 = 104;
							}
							local413 = arg3;
							if (arg3 < 0) {
								local413 = 0;
							} else if (arg3 >= 104) {
								local413 = 104;
							}
							local422 = arg3 + 7;
							if (local422 < 0) {
								local422 = 0;
							} else if (local422 >= 104) {
								local422 = 104;
							}
							while (local389 < local396) {
								while (local413 < local422) {
									Static159.aByteArrayArrayArray17[arg8][local389][local413] = 0;
									local413++;
								}
								local389++;
							}
						}
					} else if (local561 == 1) {
						for (local389 = 0; local389 < 64; local389 += 4) {
							for (local396 = 0; local396 < 64; local396 += 4) {
								@Pc(686) byte local686 = local113.method2598();
								if (local239 <= arg0) {
									for (local422 = local389; local422 < local389 + 4; local422++) {
										for (local702 = local396; local702 < local396 + 4; local702++) {
											if (local11 <= local422 && local11 + 8 > local422 && local17 <= local702 && local17 + 8 > local17) {
												local744 = Static31.method537(arg5, local702 & 0x7, local422 & 0x7) + arg7;
												@Pc(757) int local757 = arg3 + Static84.method1248(arg5, local422 & 0x7, local702 & 0x7);
												if (local744 >= 0 && local744 < 104 && local757 >= 0 && local757 < 104) {
													Static159.aByteArrayArrayArray17[arg8][local744][local757] = local686;
												}
											}
										}
									}
								}
							}
						}
					} else if (local561 == 2) {
					}
				}
			}
		}
		if (Static291.aBoolean404 && !arg4) {
			@Pc(845) Class135 local845 = null;
			while (true) {
				while (local113.anInt3290 < local113.aByteArray34.length) {
					local239 = local113.method2595();
					if (local239 == 0) {
						local845 = new Class135(local113);
					} else if (local239 == 1) {
						local246 = local113.method2595();
						if (local246 > 0) {
							for (local389 = 0; local389 < local246; local389++) {
								@Pc(897) Class170 local897 = new Class170(local113);
								if (local897.anInt5260 == 31) {
									@Pc(910) Class195 local910 = Static251.method3843(local113.method2593());
									local897.method4115(local910.anInt5922, local910.anInt5915, local910.anInt5916, local910.anInt5924);
								}
								local413 = local897.anInt5278 >> 7;
								local422 = local897.anInt5266 >> 7;
								if (arg0 == local897.anInt5272 && local413 >= local11 && local11 + 8 > local413 && local17 <= local422 && local422 < local17 + 8) {
									local702 = (arg7 << 7) + Static114.method1824(local897.anInt5278 & 0x3FF, arg5, local897.anInt5266 & 0x3FF);
									local744 = Static295.method4394(local897.anInt5266 & 0x3FF, local897.anInt5278 & 0x3FF, arg5) + (arg3 << 7);
									local897.anInt5278 = local702;
									local413 = local897.anInt5278 >> 7;
									local897.anInt5266 = local744;
									local422 = local897.anInt5266 >> 7;
									if (local413 >= 0 && local422 >= 0 && local413 < 104 && local422 < 104) {
										local897.aBoolean377 = (Static94.aByteArrayArrayArray9[1][local413][local422] & 0x2) != 0;
										local897.anInt5279 = Static208.anIntArrayArrayArray11[local897.anInt5272][local413][local422] - local897.anInt5279;
										Static294.method4352(local897);
									}
								}
							}
						}
					} else if (local239 == 2) {
						if (local845 == null) {
							local845 = new Class135();
						}
						local845.method3281(local113);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local845 == null) {
					local845 = new Class135();
				}
				Static20.aClass135ArrayArray1[arg7 >> 3][arg3 >> 3] = local845;
				break;
			}
		}
		local164 = arg7 + 7;
		local239 = arg3 + 7;
		for (local246 = arg7; local246 < local164; local246++) {
			for (local389 = arg3; local389 < local239; local389++) {
				Static159.aByteArrayArrayArray17[arg8][local246][local389] = 0;
			}
		}
		return local520 ? Static195.anIntArray320 : null;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	public static void method3871() {
		Static183.aClass1_Sub4_Sub3_3.method1494();
		Static78.anInt1449 = 1;
		Static75.aClass138_21 = null;
	}
}
