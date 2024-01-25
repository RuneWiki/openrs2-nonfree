import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
	public static int anInt4115;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "[Lclient!lj;")
	public static final Class121[] aClass121Array1 = new Class121[8];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIBIIIILclient!vm;[Lclient!qs;[BI)[I")
	public static int[] method3455(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class92 arg7, @OriginalArg(9) Class174[] arg8, @OriginalArg(10) byte[] arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(17) int local17 = (arg2 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg1) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg1) {
			@Pc(31) Class174 local31 = arg8[arg10];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = Static19.method5603(arg6, local33 & 0x7, local37 & 0x7) + arg4;
					@Pc(63) int local63 = Static94.method1674(local33 & 0x7, arg6, local37 & 0x7) + arg3;
					if (local51 > 0 && local51 < Static92.anInt2048 - 1 && local63 > 0 && Static290.anInt5893 - 1 > local63) {
						local31.method4664(local51, local63);
					}
				}
			}
		}
		@Pc(106) Class4_Sub7 local106 = new Class4_Sub7(arg9);
		local33 = (arg0 & 0x1FFFFFF8) << 3;
		local37 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		if (arg6 == 1) {
			local127 = 1;
		} else if (arg6 == 2) {
			local125 = 1;
			local127 = 1;
		} else if (arg6 == 3) {
			local125 = 1;
		}
		@Pc(211) int local211;
		@Pc(218) int local218;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(375) int local375;
		@Pc(368) int local368;
		for (@Pc(150) int local150 = 0; local150 < local21; local150++) {
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
					if (local150 != arg5 || local154 < local11 || local154 > local11 + 8 || local17 > local158 || local158 > local17 + 8) {
						Static280.method4790(0, local106, 0, arg1, 0, 0, -1, 0, 0, false, -1);
					} else if (local11 + 8 == local154 || local158 == local17 + 8) {
						if (arg6 == 0) {
							local218 = arg3 + local158 - local17;
							local211 = arg4 + local154 - local11;
						} else if (arg6 == 1) {
							local218 = local11 + arg3 + 8 - local154;
							local211 = arg4 + local158 - local17;
						} else if (arg6 == 2) {
							local218 = arg3 + local17 + 8 - local158;
							local211 = local11 + arg4 + 8 - local154;
						} else {
							local211 = arg4 + local17 + 8 - local158;
							local218 = arg3 + local154 - local11;
						}
						Static280.method4790(0, local106, 0, arg1, 0, local33 + local154, local211, arg10, local37 + local158, true, local218);
					} else {
						local211 = Static19.method5603(arg6, local154 & 0x7, local158 & 0x7) + arg4;
						local218 = arg3 + Static94.method1674(local154 & 0x7, arg6, local158 & 0x7);
						Static280.method4790(local127, local106, arg6, arg1, local125, local154 + local33, local211, arg10, local158 + local37, false, local218);
						if (local154 == 63 || local158 == 63) {
							local349 = local154 == 63 ? 64 : local154;
							local356 = local158 == 63 ? 64 : local158;
							if (arg6 == 0) {
								local368 = local356 + arg3 - local17;
								local375 = arg4 + local349 - local11;
							} else if (arg6 == 1) {
								local368 = arg3 + local11 + 8 - local349;
								local375 = local356 + arg4 - local17;
							} else if (arg6 == 2) {
								local368 = local17 + arg3 + 8 - local356;
								local375 = local11 + arg4 + 8 - local349;
							} else {
								local375 = arg4 + local17 + 8 - local356;
								local368 = local349 + arg3 - local11;
							}
							if (local375 >= 0 && Static92.anInt2048 > local375 && local368 >= 0 && Static290.anInt5893 > local368) {
								Static57.anIntArrayArrayArray4[arg10][local375][local368] = Static57.anIntArrayArrayArray4[arg10][local125 + local211][local218 + local127];
							}
						}
					}
				}
			}
		}
		@Pc(507) boolean local507 = false;
		@Pc(598) int local598;
		@Pc(697) int local697;
		@Pc(735) int local735;
		while (local106.anInt2667 < local106.aByteArray42.length) {
			local211 = local106.method2380();
			if (local211 == 128) {
				Static56.anIntArray140[0] = local106.method2404();
				Static56.anIntArray140[1] = local106.method2396();
				Static56.anIntArray140[2] = local106.method2396();
				Static56.anIntArray140[3] = local106.method2396();
				Static56.anIntArray140[4] = local106.method2404();
				local507 = true;
			} else {
				if (local211 != 129) {
					local106.anInt2667--;
					break;
				}
				if (Static142.aByteArrayArrayArray4 == null) {
					Static142.aByteArrayArrayArray4 = new byte[4][][];
				}
				for (local218 = 0; local218 < 4; local218++) {
					@Pc(542) byte local542 = local106.method2393();
					if (local542 == 0 && Static142.aByteArrayArrayArray4[arg10] != null) {
						if (local218 <= arg5) {
							local356 = arg4;
							local375 = arg4 + 7;
							local368 = arg3;
							if (local375 < 0) {
								local375 = 0;
							} else if (Static92.anInt2048 <= local375) {
								local375 = Static92.anInt2048;
							}
							if (arg3 < 0) {
								local368 = 0;
							} else if (Static290.anInt5893 <= arg3) {
								local368 = Static290.anInt5893;
							}
							local598 = arg3 + 7;
							if (arg4 < 0) {
								local356 = 0;
							} else if (Static92.anInt2048 <= arg4) {
								local356 = Static92.anInt2048;
							}
							if (local598 < 0) {
								local598 = 0;
							} else if (Static290.anInt5893 <= local598) {
								local598 = Static290.anInt5893;
							}
							while (local356 < local375) {
								while (local598 > local368) {
									Static142.aByteArrayArrayArray4[arg10][local356][local368] = 0;
									local368++;
								}
								local356++;
							}
						}
					} else if (local542 == 1) {
						if (Static142.aByteArrayArrayArray4[arg10] == null) {
							Static142.aByteArrayArrayArray4[arg10] = new byte[Static92.anInt2048 + 1][Static290.anInt5893 + 1];
						}
						for (local356 = 0; local356 < 64; local356 += 4) {
							for (local375 = 0; local375 < 64; local375 += 4) {
								@Pc(684) byte local684 = local106.method2393();
								if (local218 <= arg5) {
									for (local598 = local356; local598 < local356 + 4; local598++) {
										for (local697 = local375; local697 < local375 + 4; local697++) {
											if (local598 >= local11 && local11 + 8 > local598 && local697 >= local17 && local17 + 8 > local17) {
												local735 = Static19.method5603(arg6, local598 & 0x7, local697 & 0x7) + arg4;
												@Pc(747) int local747 = arg3 + Static94.method1674(local598 & 0x7, arg6, local697 & 0x7);
												if (local735 >= 0 && local735 < Static92.anInt2048 && local747 >= 0 && local747 < Static290.anInt5893) {
													Static142.aByteArrayArrayArray4[arg10][local735][local747] = local684;
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
			@Pc(853) Class100 local853 = null;
			while (true) {
				while (local106.aByteArray42.length > local106.anInt2667) {
					local218 = local106.method2380();
					if (local218 == 0) {
						local853 = new Class100(local106);
					} else if (local218 == 1) {
						local349 = local106.method2380();
						if (local349 > 0) {
							for (local356 = 0; local356 < local349; local356++) {
								@Pc(890) Class4_Sub12_Sub1 local890 = new Class4_Sub12_Sub1(local106);
								if (local890.anInt6088 == 31) {
									@Pc(900) Class136 local900 = Static325.method5355(local106.method2404());
									local890.method5111(local900.anInt4330, local900.anInt4335, local900.anInt4332, local900.anInt4339);
								}
								local368 = local890.anInt6082 >> 7;
								local598 = local890.anInt6081 >> 7;
								if (arg5 == local890.anInt6093 && local368 >= local11 && local11 + 8 > local368 && local598 >= local17 && local598 < local17 + 8) {
									local697 = (arg4 << 7) + Static243.method4210(local890.anInt6081 & 0x3FF, local890.anInt6082 & 0x3FF, arg6);
									local735 = Static219.method3772(local890.anInt6082 & 0x3FF, arg6, local890.anInt6081 & 0x3FF) + (arg3 << 7);
									local890.anInt6081 = local735;
									local890.anInt6082 = local697;
									local598 = local890.anInt6081 >> 7;
									local368 = local890.anInt6082 >> 7;
									if (local368 >= 0 && local598 >= 0 && Static92.anInt2048 > local368 && local598 < Static290.anInt5893) {
										local890.anInt6079 = Static57.anIntArrayArrayArray4[arg5][local368][local598] - local890.anInt6079;
										if (arg7.method4499() > 0) {
											Static13.method306(local890);
										}
									}
								}
							}
						}
					} else if (local218 == 2) {
						if (local853 == null) {
							local853 = new Class100();
						}
						local853.method2727(local106);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local853 != null) {
					Static144.method2829(arg4 >> 3, arg3 >> 3, local853);
				}
				break;
			}
		}
		if (Static142.aByteArrayArrayArray4 != null && Static142.aByteArrayArrayArray4[arg10] != null) {
			local211 = arg4 + 7;
			local218 = arg3 + 7;
			for (local349 = arg4; local349 < local211; local349++) {
				for (local356 = arg3; local356 < local218; local356++) {
					Static142.aByteArrayArrayArray4[arg10][local349][local356] = 0;
				}
			}
		}
		if (local507) {
			return Static56.anIntArray140;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method3456(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static81.method1448(arg1, 0, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!am;I)Lclient!in;")
	public static Class4_Sub1_Sub11 method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2) {
		@Pc(14) Class4_Sub7 local14 = new Class4_Sub7(arg2.method288(arg1, arg0));
		@Pc(63) Class4_Sub1_Sub11 local63 = new Class4_Sub1_Sub11(arg1, local14.method2379(), local14.method2379(), local14.method2389(), local14.method2389(), local14.method2380() == 1, local14.method2380());
		@Pc(67) int local67 = local14.method2380();
		for (@Pc(69) int local69 = 0; local69 < local67; local69++) {
			local63.aClass130_62.method3510(new Class4_Sub27(local14.method2380(), local14.method2404(), local14.method2404(), local14.method2404(), local14.method2404(), local14.method2404(), local14.method2404(), local14.method2404(), local14.method2404()));
		}
		local63.method2688();
		return local63;
	}
}
