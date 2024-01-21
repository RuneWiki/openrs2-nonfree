import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Lclient!mb;")
	private static Class45 aClass45_669 = Static63.method1251("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_670 = Static63.method1251("Chat panel redrawn");

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_671 = Static63.method1251("Texturen geladen)3");

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_672 = Static63.method1251("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_674 = Static63.method1251("Classic");

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_673 = aClass45_674;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "Lclient!mb;")
	public static Class45 aClass45_675 = aClass45_669;

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "[Lclient!hb;")
	public static Class5_Sub9[] aClass5_Sub9Array1 = new Class5_Sub9[2048];

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_676 = Static63.method1251(",Zffentlicher Chat");

	@OriginalMember(owner = "client!ka", name = "Bb", descriptor = "I")
	public static int anInt1677 = 1;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method1150() {
		aClass45_674 = null;
		aClass45_672 = null;
		aClass45_670 = null;
		aClass45_675 = null;
		aClass45_673 = null;
		aClass5_Sub9Array1 = null;
		aClass45_676 = null;
		aClass45_669 = null;
		aClass45_671 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!mb;Lclient!mb;Lclient!sd;)Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 method1152(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(13) int local13 = arg2.method746(arg1);
		@Pc(19) int local19 = arg2.method753(arg0, local13);
		return Static32.method678(arg2, local13, local19);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!jd;")
	public static Class11 method1154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class11_Sub1");
			@Pc(15) Class11 local15 = (Class11) local11.getDeclaredConstructor().newInstance();
			local15.method2150(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class11_Sub2 local28 = new Class11_Sub2();
			local28.method2150(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!i;Lclient!jc;IBIII)V")
	public static void method1155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static103.aBoolean122 && (Static48.aByteArrayArrayArray3[0][arg0][arg1] & 0x2) == 0) {
			if ((Static48.aByteArrayArrayArray3[arg4][arg0][arg1] & 0x10) != 0) {
				return;
			}
			if (Static121.method1620(arg1, arg4, arg0) != Static99.anInt2657) {
				return;
			}
		}
		if (Static32.anInt936 > arg4) {
			Static32.anInt936 = arg4;
		}
		@Pc(52) int local52 = Static40.anIntArrayArrayArray2[arg4][arg0 + 1][arg1];
		@Pc(64) int local64 = Static40.anIntArrayArrayArray2[arg4][arg0 + 1][arg1 + 1];
		@Pc(72) int local72 = Static40.anIntArrayArrayArray2[arg4][arg0][arg1];
		@Pc(82) int local82 = Static40.anIntArrayArrayArray2[arg4][arg0][arg1 + 1];
		@Pc(92) int local92 = local82 + local64 + local52 + local72 >> 2;
		@Pc(105) int local105 = (arg1 << 7) + (arg0 + (arg5 << 14)) + 1073741824;
		@Pc(112) int local112 = (arg6 << 6) + arg7;
		@Pc(116) Class5_Sub2_Sub7 local116 = Static62.method1232(arg5);
		if (local116.anInt828 == 0) {
			local105 += Integer.MIN_VALUE;
		}
		if (local116.anInt832 == 1) {
			local112 += 256;
		}
		if (local116.method600()) {
			Static97.method1801(arg1, local116, arg6, arg4, arg0);
		}
		@Pc(177) Class5_Sub2_Sub4 local177;
		if (arg7 != 22) {
			@Pc(280) int local280;
			if (arg7 == 10 || arg7 == 11) {
				if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
					local177 = local116.method612(arg6, local52, local82, 10, local64, local72);
				} else {
					local177 = new Class5_Sub2_Sub4_Sub5(arg5, 10, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
				}
				if (local177 != null) {
					@Pc(263) int local263 = 0;
					if (arg7 == 11) {
						local263 += 256;
					}
					@Pc(283) int local283;
					if (arg6 == 1 || arg6 == 3) {
						local280 = local116.anInt829;
						local283 = local116.anInt839;
					} else {
						local280 = local116.anInt839;
						local283 = local116.anInt829;
					}
					if (arg2.method912(arg4, arg0, arg1, local92, local280, local283, local177, local263, local105, local112) && local116.aBoolean42) {
						@Pc(308) int local308 = 15;
						if (local177 instanceof Class5_Sub2_Sub4_Sub2) {
							local308 = ((Class5_Sub2_Sub4_Sub2) local177).method437() / 4;
							if (local308 > 30) {
								local308 = 30;
							}
						}
						for (@Pc(324) int local324 = 0; local324 <= local280; local324++) {
							for (@Pc(327) int local327 = 0; local327 <= local283; local327++) {
								if (local308 > Static51.aByteArrayArrayArray4[arg4][local324 + arg0][local327 + arg1]) {
									Static51.aByteArrayArrayArray4[arg4][arg0 + local324][arg1 + local327] = (byte) local308;
								}
							}
						}
					}
				}
				if (local116.aBoolean43 && arg3 != null) {
					arg3.method1117(local116.anInt829, local116.aBoolean35, arg6, arg1, local116.anInt839, arg0);
				}
			} else if (arg7 >= 12) {
				if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
					local177 = local116.method612(arg6, local52, local82, arg7, local64, local72);
				} else {
					local177 = new Class5_Sub2_Sub4_Sub5(arg5, arg7, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
				}
				arg2.method912(arg4, arg0, arg1, local92, 1, 1, local177, 0, local105, local112);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0) {
					Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x924;
				}
				if (local116.aBoolean43 && arg3 != null) {
					arg3.method1117(local116.anInt829, local116.aBoolean35, arg6, arg1, local116.anInt839, arg0);
				}
			} else if (arg7 == 0) {
				if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
					local177 = local116.method612(arg6, local52, local82, 0, local64, local72);
				} else {
					local177 = new Class5_Sub2_Sub4_Sub5(arg5, 0, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
				}
				arg2.method919(arg4, arg0, arg1, local92, local177, null, Static53.anIntArray348[arg6], 0, local105, local112);
				if (arg6 == 0) {
					if (local116.aBoolean42) {
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1] = 50;
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1 + 1] = 50;
					}
					if (local116.aBoolean38) {
						Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x249;
					}
				} else if (arg6 == 1) {
					if (local116.aBoolean42) {
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1 + 1] = 50;
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1 + 1] = 50;
					}
					if (local116.aBoolean38) {
						Static40.anIntArrayArrayArray1[arg4][arg0][arg1 + 1] |= 0x492;
					}
				} else if (arg6 == 2) {
					if (local116.aBoolean42) {
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1] = 50;
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1 + 1] = 50;
					}
					if (local116.aBoolean38) {
						Static40.anIntArrayArrayArray1[arg4][arg0 + 1][arg1] |= 0x249;
					}
				} else if (arg6 == 3) {
					if (local116.aBoolean42) {
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1] = 50;
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1] = 50;
					}
					if (local116.aBoolean38) {
						Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x492;
					}
				}
				if (local116.aBoolean43 && arg3 != null) {
					arg3.method1119(arg6, local116.aBoolean35, arg7, arg1, arg0);
				}
				if (local116.anInt837 != 16) {
					arg2.method890(arg4, arg0, arg1, local116.anInt837);
				}
			} else if (arg7 == 1) {
				if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
					local177 = local116.method612(arg6, local52, local82, 1, local64, local72);
				} else {
					local177 = new Class5_Sub2_Sub4_Sub5(arg5, 1, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
				}
				arg2.method919(arg4, arg0, arg1, local92, local177, null, Static29.anIntArray151[arg6], 0, local105, local112);
				if (local116.aBoolean42) {
					if (arg6 == 0) {
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1 + 1] = 50;
					} else if (arg6 == 1) {
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1 + 1] = 50;
					} else if (arg6 == 2) {
						Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1] = 50;
					} else if (arg6 == 3) {
						Static51.aByteArrayArrayArray4[arg4][arg0][arg1] = 50;
					}
				}
				if (local116.aBoolean43 && arg3 != null) {
					arg3.method1119(arg6, local116.aBoolean35, arg7, arg1, arg0);
				}
			} else {
				@Pc(899) int local899;
				@Pc(928) Class5_Sub2_Sub4 local928;
				if (arg7 == 2) {
					local899 = arg6 + 1 & 0x3;
					@Pc(918) Class5_Sub2_Sub4 local918;
					if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
						local918 = local116.method612(arg6 + 4, local52, local82, 2, local64, local72);
						local928 = local116.method612(local899, local52, local82, 2, local64, local72);
					} else {
						local918 = new Class5_Sub2_Sub4_Sub5(arg5, 2, arg6 + 4, local72, local52, local64, local82, local116.anInt831, true, null);
						local928 = new Class5_Sub2_Sub4_Sub5(arg5, 2, local899, local72, local52, local64, local82, local116.anInt831, true, null);
					}
					arg2.method919(arg4, arg0, arg1, local92, local918, local928, Static53.anIntArray348[arg6], Static53.anIntArray348[local899], local105, local112);
					if (local116.aBoolean38) {
						if (arg6 == 0) {
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x249;
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1 + 1] |= 0x492;
						} else if (arg6 == 1) {
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1 + 1] |= 0x492;
							Static40.anIntArrayArrayArray1[arg4][arg0 + 1][arg1] |= 0x249;
						} else if (arg6 == 2) {
							Static40.anIntArrayArrayArray1[arg4][arg0 + 1][arg1] |= 0x249;
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x492;
						} else if (arg6 == 3) {
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x492;
							Static40.anIntArrayArrayArray1[arg4][arg0][arg1] |= 0x249;
						}
					}
					if (local116.aBoolean43 && arg3 != null) {
						arg3.method1119(arg6, local116.aBoolean35, arg7, arg1, arg0);
					}
					if (local116.anInt837 != 16) {
						arg2.method890(arg4, arg0, arg1, local116.anInt837);
					}
				} else if (arg7 == 3) {
					if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
						local177 = local116.method612(arg6, local52, local82, 3, local64, local72);
					} else {
						local177 = new Class5_Sub2_Sub4_Sub5(arg5, 3, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
					}
					arg2.method919(arg4, arg0, arg1, local92, local177, null, Static29.anIntArray151[arg6], 0, local105, local112);
					if (local116.aBoolean42) {
						if (arg6 == 0) {
							Static51.aByteArrayArrayArray4[arg4][arg0][arg1 + 1] = 50;
						} else if (arg6 == 1) {
							Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1 + 1] = 50;
						} else if (arg6 == 2) {
							Static51.aByteArrayArrayArray4[arg4][arg0 + 1][arg1] = 50;
						} else if (arg6 == 3) {
							Static51.aByteArrayArrayArray4[arg4][arg0][arg1] = 50;
						}
					}
					if (local116.aBoolean43 && arg3 != null) {
						arg3.method1119(arg6, local116.aBoolean35, arg7, arg1, arg0);
					}
				} else if (arg7 == 9) {
					if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
						local177 = local116.method612(arg6, local52, local82, arg7, local64, local72);
					} else {
						local177 = new Class5_Sub2_Sub4_Sub5(arg5, arg7, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
					}
					arg2.method912(arg4, arg0, arg1, local92, 1, 1, local177, 0, local105, local112);
					if (local116.aBoolean43 && arg3 != null) {
						arg3.method1117(local116.anInt829, local116.aBoolean35, arg6, arg1, local116.anInt839, arg0);
					}
				} else {
					if (local116.aBoolean40) {
						if (arg6 == 1) {
							local899 = local82;
							local82 = local64;
							local64 = local52;
							local52 = local72;
							local72 = local899;
						} else if (arg6 == 2) {
							local899 = local82;
							local82 = local52;
							local52 = local899;
							local899 = local64;
							local64 = local72;
							local72 = local899;
						} else if (arg6 == 3) {
							local899 = local82;
							local82 = local72;
							local72 = local52;
							local52 = local64;
							local64 = local899;
						}
					}
					if (arg7 == 4) {
						if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
							local177 = local116.method612(0, local52, local82, 4, local64, local72);
						} else {
							local177 = new Class5_Sub2_Sub4_Sub5(arg5, 4, 0, local72, local52, local64, local82, local116.anInt831, true, null);
						}
						arg2.method884(arg4, arg0, arg1, local92, local177, Static53.anIntArray348[arg6], arg6 * 512, 0, 0, local105, local112);
					} else if (arg7 == 5) {
						local899 = 16;
						local280 = arg2.method916(arg4, arg0, arg1);
						if (local280 != 0) {
							local899 = Static62.method1232(local280 >> 14 & 0x7FFF).anInt837;
						}
						if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
							local928 = local116.method612(0, local52, local82, 4, local64, local72);
						} else {
							local928 = new Class5_Sub2_Sub4_Sub5(arg5, 4, 0, local72, local52, local64, local82, local116.anInt831, true, null);
						}
						arg2.method884(arg4, arg0, arg1, local92, local928, Static53.anIntArray348[arg6], arg6 * 512, local899 * Static12.anIntArray485[arg6], local899 * Static76.anIntArray308[arg6], local105, local112);
					} else if (arg7 == 6) {
						if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
							local177 = local116.method612(0, local52, local82, 4, local64, local72);
						} else {
							local177 = new Class5_Sub2_Sub4_Sub5(arg5, 4, 0, local72, local52, local64, local82, local116.anInt831, true, null);
						}
						arg2.method884(arg4, arg0, arg1, local92, local177, 256, arg6, 0, 0, local105, local112);
					} else if (arg7 == 7) {
						if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
							local177 = local116.method612(0, local52, local82, 4, local64, local72);
						} else {
							local177 = new Class5_Sub2_Sub4_Sub5(arg5, 4, 0, local72, local52, local64, local82, local116.anInt831, true, null);
						}
						arg2.method884(arg4, arg0, arg1, local92, local177, 512, arg6, 0, 0, local105, local112);
					} else if (arg7 == 8) {
						if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
							local177 = local116.method612(0, local52, local82, 4, local64, local72);
						} else {
							local177 = new Class5_Sub2_Sub4_Sub5(arg5, 4, 0, local72, local52, local64, local82, local116.anInt831, true, null);
						}
						arg2.method884(arg4, arg0, arg1, local92, local177, 768, arg6, 0, 0, local105, local112);
					}
				}
			}
		} else if (!Static103.aBoolean122 || local116.anInt828 != 0 || local116.aBoolean39) {
			if (local116.anInt831 == -1 && local116.anIntArray143 == null) {
				local177 = local116.method612(arg6, local52, local82, 22, local64, local72);
			} else {
				local177 = new Class5_Sub2_Sub4_Sub5(arg5, 22, arg6, local72, local52, local64, local82, local116.anInt831, true, null);
			}
			arg2.method898(arg4, arg0, arg1, local92, local177, local105, local112);
			if (local116.aBoolean43 && local116.anInt828 == 1 && arg3 != null) {
				arg3.method1122(arg1, arg0);
			}
		}
	}
}
