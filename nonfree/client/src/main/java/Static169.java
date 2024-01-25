import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_110 = new Class34("M", "M", "M", "M");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt3638 = 0;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
	public static final int[] anIntArray330 = new int[14];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lclient!pd;")
	public static Class1_Sub27 method3377() {
		if (Static79.aClass16_24 == null || Static93.aClass183_1 == null) {
			return null;
		}
		for (@Pc(24) Class1_Sub27 local24 = (Class1_Sub27) Static93.aClass183_1.method4847(); local24 != null; local24 = (Class1_Sub27) Static93.aClass183_1.method4847()) {
			@Pc(31) Class139 local31 = Static255.method4606(local24.anInt4777);
			if (local31 != null && local31.aBoolean391 && local31.method3810()) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method3378() {
		Static57.aClass171_1.method4637();
		Static222.aClass84_1.method5418();
		if (Static188.aClass155_1 != null) {
			Static188.aClass155_1.method5337(Static349.aCanvas5);
		}
		Static93.aClient1.method998();
		Static349.aCanvas5.setBackground(Color.black);
		Static80.anInt2069 = -1;
		Static57.aClass171_1 = Static33.method812(Static349.aCanvas5);
		Static222.aClass84_1 = Static51.method1315(Static349.aCanvas5);
		if (Static188.aClass155_1 != null) {
			Static188.aClass155_1.method5334(Static349.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public static void method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 9);
		local8.method1869();
		local8.anInt2148 = arg1;
		local8.anInt2142 = arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	public static void method3380(@OriginalArg(0) int arg0) {
		if (Static256.anInt5309 == arg0) {
			return;
		}
		Static233.anInt5573 = Static134.anInt2971 = Static276.anIntArray473[arg0];
		Static208.aClass32_11.method2202(50, (int) ((double) Static233.anInt5573 * 34.46D));
		Static133.anIntArrayArrayArray8 = new int[4][Static233.anInt5573 >> 3][Static134.anInt2971 >> 3];
		Static193.anIntArrayArray44 = new int[Static233.anInt5573][Static134.anInt2971];
		Static114.anIntArrayArray48 = new int[Static233.anInt5573][Static134.anInt2971];
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			Static29.aClass71Array1[local47] = Static193.method3722(Static134.anInt2971, Static233.anInt5573);
		}
		Static304.aByteArrayArrayArray10 = new byte[4][Static233.anInt5573][Static134.anInt2971];
		Static294.method4962(Static233.anInt5573, Static134.anInt2971);
		Static327.method5304(Static134.anInt2971 >> 3, Static233.anInt5573 >> 3, Static208.aClass32_11);
		Static256.anInt5309 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B[Lclient!g;IIIILclient!uo;ZI)[I")
	public static int[] method3381(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class32 arg7, @OriginalArg(8) boolean arg8) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (!arg8) {
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				@Pc(19) Class71 local19 = arg2[local13];
				for (local21 = 0; local21 < 64; local21++) {
					for (local25 = 0; local25 < 64; local25++) {
						local31 = local21 + arg5;
						local35 = local25 + arg4;
						if (local31 >= 0 && local31 < Static233.anInt5573 && local35 >= 0 && Static134.anInt2971 > local35) {
							local19.method1946(local31, local35);
						}
					}
				}
			}
		}
		@Pc(82) Class1_Sub8 local82 = new Class1_Sub8(arg1);
		@Pc(87) int local87 = arg0 + arg5;
		local21 = arg4 + arg6;
		for (local25 = 0; local25 < arg3; local25++) {
			for (local31 = 0; local31 < 64; local31++) {
				for (local35 = 0; local35 < 64; local35++) {
					Static80.method1808(0, local31 + arg5, arg8, local25, false, local87 + local31, 0, local82, local35 + local21, local35 + arg4, 0);
				}
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(154) int local154;
		@Pc(213) int local213;
		@Pc(227) int local227;
		@Pc(231) int local231;
		@Pc(267) int local267;
		@Pc(233) int local233;
		while (local82.anInt5182 < local82.aByteArray81.length) {
			local154 = local82.method4532();
			if (local154 == 128) {
				Static3.anIntArray17[0] = local82.method4556();
				Static3.anIntArray17[1] = local82.method4551();
				Static3.anIntArray17[2] = local82.method4551();
				Static3.anIntArray17[3] = local82.method4551();
				local144 = true;
				Static3.anIntArray17[4] = local82.method4556();
			} else {
				if (local154 != 129) {
					local82.anInt5182--;
					break;
				}
				if (Static37.aByteArrayArrayArray1 == null) {
					Static37.aByteArrayArrayArray1 = new byte[4][][];
				}
				for (local213 = 0; local213 < 4; local213++) {
					@Pc(219) byte local219 = local82.method4558();
					if (local219 == 0 && Static37.aByteArrayArrayArray1[local213] != null) {
						local227 = arg5;
						local231 = arg5 + 64;
						local233 = arg4;
						if (local231 < 0) {
							local231 = 0;
						} else if (local231 >= Static233.anInt5573) {
							local231 = Static233.anInt5573;
						}
						if (arg5 < 0) {
							local227 = 0;
						} else if (arg5 >= Static233.anInt5573) {
							local227 = Static233.anInt5573;
						}
						local267 = arg4 + 64;
						if (arg4 < 0) {
							local233 = 0;
						} else if (arg4 >= Static134.anInt2971) {
							local233 = Static134.anInt2971;
						}
						if (local267 < 0) {
							local267 = 0;
						} else if (local267 >= Static134.anInt2971) {
							local267 = Static134.anInt2971;
						}
						while (local227 < local231) {
							while (local233 < local267) {
								Static37.aByteArrayArrayArray1[local213][local227][local233] = 0;
								local233++;
							}
							local227++;
						}
					} else if (local219 == 1) {
						if (Static37.aByteArrayArrayArray1[local213] == null) {
							Static37.aByteArrayArrayArray1[local213] = new byte[Static233.anInt5573 + 1][Static134.anInt2971 + 1];
						}
						for (local227 = 0; local227 < 64; local227 += 4) {
							for (local231 = 0; local231 < 64; local231 += 4) {
								@Pc(489) byte local489 = local82.method4558();
								for (local267 = local227 + arg5; local267 < arg5 + local227 + 4; local267++) {
									for (@Pc(501) int local501 = local231 + arg4; local501 < arg4 + local231 + 4; local501++) {
										if (local267 >= 0 && local267 < Static233.anInt5573 && local501 >= 0 && local501 < Static134.anInt2971) {
											Static37.aByteArrayArrayArray1[local213][local267][local501] = local489;
										}
									}
								}
							}
						}
					} else if (local219 == 2) {
						if (Static37.aByteArrayArrayArray1[local213] == null) {
							Static37.aByteArrayArrayArray1[local213] = new byte[Static233.anInt5573 + 1][Static134.anInt2971 + 1];
						}
						if (local213 > 0) {
							local227 = arg5;
							local231 = arg5 + 64;
							local233 = arg4;
							if (arg4 < 0) {
								local233 = 0;
							} else if (arg4 >= Static134.anInt2971) {
								local233 = Static134.anInt2971;
							}
							local267 = arg4 + 64;
							if (local231 < 0) {
								local231 = 0;
							} else if (Static233.anInt5573 <= local231) {
								local231 = Static233.anInt5573;
							}
							if (arg5 < 0) {
								local227 = 0;
							} else if (arg5 >= Static233.anInt5573) {
								local227 = Static233.anInt5573;
							}
							if (local267 < 0) {
								local267 = 0;
							} else if (Static134.anInt2971 <= local267) {
								local267 = Static134.anInt2971;
							}
							while (local227 < local231) {
								while (local267 > local233) {
									Static37.aByteArrayArrayArray1[local213][local227][local233] = Static37.aByteArrayArrayArray1[local213 - 1][local227][local233];
									local233++;
								}
								local227++;
							}
						}
					}
				}
				local146 = true;
			}
		}
		@Pc(598) int local598;
		if (!arg8) {
			@Pc(582) Class165 local582 = null;
			label281: while (true) {
				label274: do {
					while (true) {
						while (local82.anInt5182 < local82.aByteArray81.length) {
							local213 = local82.method4532();
							if (local213 == 0) {
								local582 = new Class165(local82);
							} else {
								if (local213 == 1) {
									local598 = local82.method4532();
									continue label274;
								}
								if (local213 != 2) {
									throw new IllegalStateException();
								}
								if (local582 == null) {
									local582 = new Class165();
								}
								local582.method4378(local82);
							}
						}
						if (local582 != null) {
							for (local213 = 0; local213 < 8; local213++) {
								for (local598 = 0; local598 < 8; local598++) {
									local227 = (arg5 >> 3) + local213;
									local231 = local598 + (arg4 >> 3);
									if (local227 >= 0 && Static233.anInt5573 >> 3 > local227 && local231 >= 0 && Static134.anInt2971 >> 3 > local231) {
										Static326.method2232(local231, local227, local582);
									}
								}
							}
						}
						break label281;
					}
				} while (local598 <= 0);
				for (local227 = 0; local227 < local598; local227++) {
					@Pc(609) Class1_Sub30_Sub1 local609 = new Class1_Sub30_Sub1(local82);
					if (local609.anInt5307 == 31) {
						@Pc(621) Class205 local621 = Static127.method2622(local82.method4556());
						local609.method4623(local621.anInt6226, local621.anInt6230, local621.anInt6229, local621.anInt6224);
					}
					local609.anInt5297 += arg4 << 7;
					local609.anInt5299 += arg5 << 7;
					local233 = local609.anInt5299 >> 7;
					local267 = local609.anInt5297 >> 7;
					if (local233 >= 0 && local267 >= 0 && local233 < Static233.anInt5573 && local267 < Static134.anInt2971) {
						local609.anInt5298 = Static251.anIntArrayArrayArray15[local609.anInt5311][local233][local267] - local609.anInt5298;
						if (arg7.method2240() > 0) {
							Static74.method1708(local609);
						}
					}
				}
			}
		}
		if (!local146 && Static37.aByteArrayArrayArray1 != null) {
			for (local154 = 0; local154 < 4; local154++) {
				if (Static37.aByteArrayArrayArray1[local154] != null) {
					for (local213 = 0; local213 < 16; local213++) {
						for (local598 = 0; local598 < 16; local598++) {
							local227 = (arg5 >> 2) + local213;
							local231 = local598 + (arg4 >> 2);
							if (local227 >= 0 && local227 < 26 && local231 >= 0 && local231 < 26) {
								Static37.aByteArrayArrayArray1[local154][local227][local231] = 0;
							}
						}
					}
				}
			}
		}
		if (local144) {
			return Static3.anIntArray17;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	public static void method3382() {
		for (@Pc(1) int local1 = 0; local1 < Static19.anInt573; local1++) {
			@Pc(6) Class17_Sub1 local6 = Static245.aClass17_Sub1Array2[local1];
			Static274.method4807(local6);
			Static245.aClass17_Sub1Array2[local1] = null;
		}
		Static19.anInt573 = 0;
	}
}
