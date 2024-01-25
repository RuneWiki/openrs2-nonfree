import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nn", name = "X", descriptor = "Lclient!po;")
	public static Class72 aClass72_4;

	@OriginalMember(owner = "client!nn", name = "P", descriptor = "Lclient!jl;")
	public static final Class109 aClass109_5 = new Class109();

	@OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
	public static int anInt3920 = 2;

	@OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
	public static int anInt3921 = -1;

	@OriginalMember(owner = "client!nn", name = "U", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!nn", name = "V", descriptor = "I")
	public static int anInt3923 = 0;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Lclient!eq;")
	public static Class6_Sub2_Sub5 method3827(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub2_Sub5 local12 = (Class6_Sub2_Sub5) Static91.aClass31_8.method634((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static109.aClass53_55.method1033(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static20.method301(local22);
			Static91.aClass31_8.method632((long) arg0, local12);
			return local12;
		}
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
	public static void method3828() {
		@Pc(13) Class70 local13 = Static215.aClass70_70;
		synchronized (Static215.aClass70_70) {
			Static215.aClass70_70.method1405();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ja;IIZZIIII[Lclient!c;I[B)[I")
	public static int[] method3829(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class27[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[] arg10) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg3) {
			@Pc(23) Class27 local23 = arg8[arg7];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(44) int local44 = arg1 + Static102.method4776(arg2, local25 & 0x7, local29 & 0x7);
					@Pc(56) int local56 = Static240.method3874(local25 & 0x7, arg2, local29 & 0x7) + arg9;
					if (local44 > 0 && local44 < Static153.anInt2883 - 1 && local56 > 0 && local56 < Static246.anInt4606 - 1) {
						local23.method521(local56, local44);
					}
				}
			}
		}
		@Pc(101) byte local101;
		if (arg3) {
			local101 = 1;
		} else {
			local101 = 4;
		}
		@Pc(110) Class6_Sub10 local110 = new Class6_Sub10(arg10);
		local25 = (arg4 & 0x1FFFFFF8) << 3;
		local29 = (arg6 & 0x1FFFFFF8) << 3;
		@Pc(124) byte local124 = 0;
		@Pc(126) byte local126 = 0;
		if (arg2 == 1) {
			local126 = 1;
		} else if (arg2 == 2) {
			local126 = 1;
			local124 = 1;
		} else if (arg2 == 3) {
			local124 = 1;
		}
		@Pc(229) int local229;
		@Pc(242) int local242;
		@Pc(278) int local278;
		@Pc(285) int local285;
		@Pc(300) int local300;
		@Pc(308) int local308;
		for (@Pc(151) int local151 = 0; local151 < local101; local151++) {
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
					if (arg5 != local151 || local11 > local155 || local11 + 8 < local155 || local17 > local159 || local17 + 8 < local159) {
						Static59.method980(0, -1, arg3, false, 0, 0, 0, -1, 0, local110, 0);
					} else if (local11 + 8 == local155 || local17 + 8 == local159) {
						if (arg2 == 0) {
							local242 = arg9 + local159 - local17;
							local229 = local155 + arg1 - local11;
						} else if (arg2 == 1) {
							local229 = local159 + arg1 - local17;
							local242 = local11 + arg9 + 8 - local155;
						} else if (arg2 == 2) {
							local229 = arg1 + local11 + 8 - local155;
							local242 = local17 + arg9 + 8 - local159;
						} else {
							local242 = local155 + arg9 - local11;
							local229 = local17 + arg1 + 8 - local159;
						}
						Static59.method980(0, local229, arg3, true, 0, local25 + local155, 0, local242, arg7, local110, local159 + local29);
					} else {
						local229 = Static102.method4776(arg2, local155 & 0x7, local159 & 0x7) + arg1;
						local242 = arg9 + Static240.method3874(local155 & 0x7, arg2, local159 & 0x7);
						Static59.method980(local126, local229, arg3, false, local124, local155 + local25, arg2, local242, arg7, local110, local159 + local29);
						if (local155 == 63 || local159 == 63) {
							local278 = local155 == 63 ? 64 : local155;
							local285 = local159 == 63 ? 64 : local159;
							if (arg2 == 0) {
								local300 = local278 + arg1 - local11;
								local308 = local285 + arg9 - local17;
							} else if (arg2 == 1) {
								local300 = local285 + arg1 - local17;
								local308 = arg9 + local11 + 8 - local278;
							} else if (arg2 == 2) {
								local308 = local17 + arg9 + 8 - local285;
								local300 = arg1 + local11 + 8 - local278;
							} else {
								local300 = arg1 + local17 + 8 - local285;
								local308 = arg9 + local278 - local11;
							}
							if (local300 >= 0 && local300 < Static153.anInt2883 && local308 >= 0 && local308 < Static246.anInt4606) {
								Static5.anIntArrayArrayArray1[arg7][local300][local308] = Static5.anIntArrayArrayArray1[arg7][local229 + local124][local126 + local242];
							}
						}
					}
				}
			}
		}
		@Pc(517) boolean local517 = false;
		@Pc(620) int local620;
		@Pc(741) int local741;
		@Pc(779) int local779;
		while (local110.anInt4188 < local110.aByteArray67.length) {
			local229 = local110.method3972();
			if (local229 == 128) {
				Static292.anIntArray617[0] = local110.method4021();
				Static292.anIntArray617[1] = local110.method4022();
				Static292.anIntArray617[2] = local110.method4022();
				Static292.anIntArray617[3] = local110.method4022();
				Static292.anIntArray617[4] = local110.method4021();
				local517 = true;
			} else {
				if (local229 != 129) {
					local110.anInt4188--;
					break;
				}
				if (Static270.aByteArrayArrayArray12 == null) {
					Static270.aByteArrayArrayArray12 = new byte[4][][];
				}
				for (local242 = 0; local242 < 4; local242++) {
					@Pc(599) byte local599 = local110.method3992();
					if (local599 == 0 && Static270.aByteArrayArrayArray12[arg7] != null) {
						if (arg5 >= local242) {
							local285 = arg1;
							local300 = arg1 + 7;
							local308 = arg9;
							local620 = arg9 + 7;
							if (arg1 < 0) {
								local285 = 0;
							} else if (arg1 >= Static153.anInt2883) {
								local285 = Static153.anInt2883;
							}
							if (arg9 < 0) {
								local308 = 0;
							} else if (arg9 >= Static246.anInt4606) {
								local308 = Static246.anInt4606;
							}
							if (local300 < 0) {
								local300 = 0;
							} else if (local300 >= Static153.anInt2883) {
								local300 = Static153.anInt2883;
							}
							if (local620 < 0) {
								local620 = 0;
							} else if (Static246.anInt4606 <= local620) {
								local620 = Static246.anInt4606;
							}
							while (local285 < local300) {
								while (local620 > local308) {
									Static270.aByteArrayArrayArray12[arg7][local285][local308] = 0;
									local308++;
								}
								local285++;
							}
						}
					} else if (local599 == 1) {
						if (Static270.aByteArrayArrayArray12[arg7] == null) {
							Static270.aByteArrayArrayArray12[arg7] = new byte[Static153.anInt2883 + 1][Static246.anInt4606 + 1];
						}
						for (local285 = 0; local285 < 64; local285 += 4) {
							for (local300 = 0; local300 < 64; local300 += 4) {
								@Pc(732) byte local732 = local110.method3992();
								if (local242 <= arg5) {
									for (local620 = local285; local620 < local285 + 4; local620++) {
										for (local741 = local300; local741 < local300 + 4; local741++) {
											if (local11 <= local620 && local620 < local11 + 8 && local17 <= local741 && local17 + 8 > local17) {
												local779 = arg1 + Static102.method4776(arg2, local620 & 0x7, local741 & 0x7);
												@Pc(792) int local792 = arg9 + Static240.method3874(local620 & 0x7, arg2, local741 & 0x7);
												if (local779 >= 0 && Static153.anInt2883 > local779 && local792 >= 0 && local792 < Static246.anInt4606) {
													Static270.aByteArrayArrayArray12[arg7][local779][local792] = local732;
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
		if (!arg3) {
			@Pc(876) Class14 local876 = null;
			label280: while (true) {
				label273: do {
					while (true) {
						while (local110.aByteArray67.length > local110.anInt4188) {
							local242 = local110.method3972();
							if (local242 == 0) {
								local876 = new Class14(local110);
							} else {
								if (local242 == 1) {
									local278 = local110.method3972();
									continue label273;
								}
								if (local242 != 2) {
									throw new IllegalStateException();
								}
								if (local876 == null) {
									local876 = new Class14();
								}
								local876.method295(local110);
							}
						}
						if (local876 != null) {
							Static303.method5208(local876, arg1 >> 3, arg9 >> 3);
						}
						break label280;
					}
				} while (local278 <= 0);
				for (local285 = 0; local285 < local278; local285++) {
					@Pc(909) Class6_Sub17_Sub1 local909 = new Class6_Sub17_Sub1(local110);
					if (local909.anInt2328 == 31) {
						@Pc(919) Class129 local919 = Static327.method3200(local110.method4021());
						local909.method2487(local919.anInt3436, local919.anInt3437, local919.anInt3438, local919.anInt3435);
					}
					local308 = local909.anInt2314 >> 7;
					local620 = local909.anInt2317 >> 7;
					if (local909.anInt2324 == arg5 && local11 <= local308 && local308 < local11 + 8 && local620 >= local17 && local17 + 8 > local620) {
						local741 = (arg1 << 7) + Static227.method4064(local909.anInt2317 & 0x3FF, arg2, local909.anInt2314 & 0x3FF);
						local779 = (arg9 << 7) + Static33.method502(arg2, local909.anInt2314 & 0x3FF, local909.anInt2317 & 0x3FF);
						local909.anInt2317 = local779;
						local909.anInt2314 = local741;
						local620 = local909.anInt2317 >> 7;
						local308 = local909.anInt2314 >> 7;
						if (local308 >= 0 && local620 >= 0 && Static153.anInt2883 > local308 && Static246.anInt4606 > local620) {
							local909.anInt2316 = Static5.anIntArrayArrayArray1[arg5][local308][local620] - local909.anInt2316;
							if (arg0.method3038() > 0) {
								Static297.method5065(local909);
							}
						}
					}
				}
			}
		}
		if (Static270.aByteArrayArrayArray12 != null && Static270.aByteArrayArrayArray12[arg7] != null) {
			local229 = arg1 + 7;
			local242 = arg9 + 7;
			for (local278 = arg1; local278 < local229; local278++) {
				for (local285 = arg9; local285 < local242; local285++) {
					Static270.aByteArrayArrayArray12[arg7][local278][local285] = 0;
				}
			}
		}
		if (local517) {
			return Static292.anIntArray617;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)V")
	public static void method3830() {
		if (Static189.anInt3601 != 2) {
			try {
				Static365.method3241(Static16.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)V")
	public static void method3831() {
		@Pc(13) int[] local13 = new int[Static269.anInt5047];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static269.anInt5047; local17++) {
			@Pc(23) Class147 local23 = Static211.method3762(local17);
			if (local23.anInt3980 >= 0 || local23.anInt3958 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static150.anIntArray347 = new int[local15];
		for (@Pc(50) int local50 = 0; local50 < local15; local50++) {
			Static150.anIntArray347[local50] = local13[local50];
		}
	}
}
