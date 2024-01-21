import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dd", name = "vc", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "nc", descriptor = "Lclient!kb;")
	private static Class46 aClass46_231 = Static65.method1172("Loading )2 please wait)3");

	@OriginalMember(owner = "client!dd", name = "tc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_232 = aClass46_231;

	@OriginalMember(owner = "client!dd", name = "Cc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_234 = Static65.method1172("(U4");

	@OriginalMember(owner = "client!dd", name = "Jc", descriptor = "Lclient!kb;")
	public static Class46 aClass46_235 = Static65.method1172("Null");

	@OriginalMember(owner = "client!dd", name = "Mc", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array4 = new Class46[100];

	@OriginalMember(owner = "client!dd", name = "Oc", descriptor = "[I")
	public static int[] anIntArray67 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIILclient!qf;Lclient!og;IIII)V")
	public static void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static71.aBoolean76 && (Static119.aByteArrayArrayArray5[0][arg5][arg1] & 0x2) == 0) {
			if ((Static119.aByteArrayArrayArray5[arg7][arg5][arg1] & 0x10) != 0) {
				return;
			}
			if (Static25.method2917(arg5, arg1, arg7) != Static27.anInt610) {
				return;
			}
		}
		if (Static148.anInt3558 > arg7) {
			Static148.anInt3558 = arg7;
		}
		@Pc(50) Class3_Sub2_Sub9 local50 = Static136.method2319(arg2);
		@Pc(54) int[][] local54 = Static133.anIntArrayArrayArray8[arg7];
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (arg0 == 1 || arg0 == 3) {
			local65 = local50.anInt1825;
			local68 = local50.anInt1795;
		} else {
			local68 = local50.anInt1825;
			local65 = local50.anInt1795;
		}
		@Pc(96) int local96;
		@Pc(90) int local90;
		if (arg5 + local65 <= 104) {
			local90 = arg5 + (local65 + 1 >> 1);
			local96 = (local65 >> 1) + arg5;
		} else {
			local96 = arg5;
			local90 = arg5 + 1;
		}
		@Pc(123) int local123;
		@Pc(117) int local117;
		if (arg1 + local68 <= 104) {
			local117 = (local68 + 1 >> 1) + arg1;
			local123 = (local68 >> 1) + arg1;
		} else {
			local117 = arg1 + 1;
			local123 = arg1;
		}
		@Pc(157) int local157 = local54[local90][local117] + local54[local96][local117] + local54[local90][local123] + local54[local96][local123] >> 2;
		@Pc(165) int local165 = (local65 << 6) + (arg5 << 7);
		@Pc(173) int local173 = (arg1 << 7) + (local68 << 6);
		@Pc(179) int local179 = arg6 + (arg0 << 6);
		if (local50.anInt1803 == 1) {
			local179 += 256;
		}
		@Pc(199) int local199 = arg5 + (arg1 << 7) + (arg2 << 14) + 1073741824;
		if (local50.anInt1818 == 0) {
			local199 += Integer.MIN_VALUE;
		}
		if (local50.method1210()) {
			Static172.method2723(arg0, local50, arg5, arg7, arg1);
		}
		@Pc(258) Class3_Sub2_Sub1 local258;
		if (arg6 != 22) {
			@Pc(359) int local359;
			if (arg6 == 10 || arg6 == 11) {
				if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
					local258 = local50.method1200(10, local165, local54, local157, local173, arg0);
				} else {
					local258 = new Class3_Sub2_Sub1_Sub5(arg2, 10, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
				}
				if (local258 != null && arg4.method2014(arg7, arg5, arg1, local157, local65, local68, local258, arg6 == 11 ? 256 : 0, local199, local179) && local50.aBoolean72) {
					local359 = 15;
					if (local258 instanceof Class3_Sub2_Sub1_Sub2) {
						local359 = ((Class3_Sub2_Sub1_Sub2) local258).method1791() / 4;
						if (local359 > 30) {
							local359 = 30;
						}
					}
					for (@Pc(377) int local377 = 0; local377 <= local65; local377++) {
						for (@Pc(381) int local381 = 0; local381 <= local68; local381++) {
							if (Static175.aByteArrayArrayArray7[arg7][arg5 + local377][arg1 + local381] < local359) {
								Static175.aByteArrayArrayArray7[arg7][local377 + arg5][local381 + arg1] = (byte) local359;
							}
						}
					}
				}
				if (local50.anInt1820 != 0 && arg3 != null) {
					arg3.method2257(arg5, local65, arg1, local50.aBoolean69, local68);
				}
			} else if (arg6 >= 12) {
				if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
					local258 = local50.method1200(arg6, local165, local54, local157, local173, arg0);
				} else {
					local258 = new Class3_Sub2_Sub1_Sub5(arg2, arg6, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
				}
				arg4.method2014(arg7, arg5, arg1, local157, 1, 1, local258, 0, local199, local179);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0) {
					Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x924;
				}
				if (local50.anInt1820 != 0 && arg3 != null) {
					arg3.method2257(arg5, local65, arg1, local50.aBoolean69, local68);
				}
			} else if (arg6 == 0) {
				if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
					local258 = local50.method1200(0, local165, local54, local157, local173, arg0);
				} else {
					local258 = new Class3_Sub2_Sub1_Sub5(arg2, 0, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
				}
				arg4.method2010(arg7, arg5, arg1, local157, local258, null, Static24.anIntArray40[arg0], 0, local199, local179);
				if (arg0 == 0) {
					if (local50.aBoolean72) {
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1] = 50;
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1 + 1] = 50;
					}
					if (local50.aBoolean71) {
						Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local50.aBoolean72) {
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1 + 1] = 50;
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1 + 1] = 50;
					}
					if (local50.aBoolean71) {
						Static83.anIntArrayArrayArray5[arg7][arg5][arg1 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local50.aBoolean72) {
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1] = 50;
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1 + 1] = 50;
					}
					if (local50.aBoolean71) {
						Static83.anIntArrayArrayArray5[arg7][arg5 + 1][arg1] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local50.aBoolean72) {
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1] = 50;
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1] = 50;
					}
					if (local50.aBoolean71) {
						Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x492;
					}
				}
				if (local50.anInt1820 != 0 && arg3 != null) {
					arg3.method2253(arg6, arg1, arg5, arg0, local50.aBoolean69);
				}
				if (local50.anInt1823 != 16) {
					arg4.method1981(arg7, arg5, arg1, local50.anInt1823);
				}
			} else if (arg6 == 1) {
				if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
					local258 = local50.method1200(1, local165, local54, local157, local173, arg0);
				} else {
					local258 = new Class3_Sub2_Sub1_Sub5(arg2, 1, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
				}
				arg4.method2010(arg7, arg5, arg1, local157, local258, null, Static36.anIntArray84[arg0], 0, local199, local179);
				if (local50.aBoolean72) {
					if (arg0 == 0) {
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1 + 1] = 50;
					} else if (arg0 == 1) {
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1 + 1] = 50;
					} else if (arg0 == 2) {
						Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1] = 50;
					} else if (arg0 == 3) {
						Static175.aByteArrayArrayArray7[arg7][arg5][arg1] = 50;
					}
				}
				if (local50.anInt1820 != 0 && arg3 != null) {
					arg3.method2253(arg6, arg1, arg5, arg0, local50.aBoolean69);
				}
			} else {
				@Pc(958) int local958;
				@Pc(988) Class3_Sub2_Sub1 local988;
				if (arg6 == 2) {
					local958 = arg0 + 1 & 0x3;
					@Pc(978) Class3_Sub2_Sub1 local978;
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local978 = local50.method1200(2, local165, local54, local157, local173, arg0 + 4);
						local988 = local50.method1200(2, local165, local54, local157, local173, local958);
					} else {
						local978 = new Class3_Sub2_Sub1_Sub5(arg2, 2, arg0 + 4, arg7, arg5, arg1, local50.anInt1830, true, null);
						local988 = new Class3_Sub2_Sub1_Sub5(arg2, 2, local958, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method2010(arg7, arg5, arg1, local157, local978, local988, Static24.anIntArray40[arg0], Static24.anIntArray40[local958], local199, local179);
					if (local50.aBoolean71) {
						if (arg0 == 0) {
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x249;
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1 + 1] |= 0x492;
							Static83.anIntArrayArrayArray5[arg7][arg5 + 1][arg1] |= 0x249;
						} else if (arg0 == 2) {
							Static83.anIntArrayArrayArray5[arg7][arg5 + 1][arg1] |= 0x249;
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x492;
						} else if (arg0 == 3) {
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x492;
							Static83.anIntArrayArrayArray5[arg7][arg5][arg1] |= 0x249;
						}
					}
					if (local50.anInt1820 != 0 && arg3 != null) {
						arg3.method2253(arg6, arg1, arg5, arg0, local50.aBoolean69);
					}
					if (local50.anInt1823 != 16) {
						arg4.method1981(arg7, arg5, arg1, local50.anInt1823);
					}
				} else if (arg6 == 3) {
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local258 = local50.method1200(3, local165, local54, local157, local173, arg0);
					} else {
						local258 = new Class3_Sub2_Sub1_Sub5(arg2, 3, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method2010(arg7, arg5, arg1, local157, local258, null, Static36.anIntArray84[arg0], 0, local199, local179);
					if (local50.aBoolean72) {
						if (arg0 == 0) {
							Static175.aByteArrayArrayArray7[arg7][arg5][arg1 + 1] = 50;
						} else if (arg0 == 1) {
							Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1 + 1] = 50;
						} else if (arg0 == 2) {
							Static175.aByteArrayArrayArray7[arg7][arg5 + 1][arg1] = 50;
						} else if (arg0 == 3) {
							Static175.aByteArrayArrayArray7[arg7][arg5][arg1] = 50;
						}
					}
					if (local50.anInt1820 != 0 && arg3 != null) {
						arg3.method2253(arg6, arg1, arg5, arg0, local50.aBoolean69);
					}
				} else if (arg6 == 9) {
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local258 = local50.method1200(arg6, local165, local54, local157, local173, arg0);
					} else {
						local258 = new Class3_Sub2_Sub1_Sub5(arg2, arg6, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method2014(arg7, arg5, arg1, local157, 1, 1, local258, 0, local199, local179);
					if (local50.anInt1820 != 0 && arg3 != null) {
						arg3.method2257(arg5, local65, arg1, local50.aBoolean69, local68);
					}
					if (local50.anInt1823 != 16) {
						arg4.method1981(arg7, arg5, arg1, local50.anInt1823);
					}
				} else if (arg6 == 4) {
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local258 = local50.method1200(4, local165, local54, local157, local173, arg0);
					} else {
						local258 = new Class3_Sub2_Sub1_Sub5(arg2, 4, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method1965(arg7, arg5, arg1, local157, local258, null, Static24.anIntArray40[arg0], 0, 0, 0, local199, local179);
				} else if (arg6 == 5) {
					local359 = arg4.method2008(arg7, arg5, arg1);
					local958 = 16;
					if (local359 != 0) {
						local958 = Static136.method2319(local359 >> 14 & 0x7FFF).anInt1823;
					}
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local988 = local50.method1200(4, local165, local54, local157, local173, arg0);
					} else {
						local988 = new Class3_Sub2_Sub1_Sub5(arg2, 4, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method1965(arg7, arg5, arg1, local157, local988, null, Static24.anIntArray40[arg0], 0, Static59.anIntArray151[arg0] * local958, local958 * Static40.anIntArray103[arg0], local199, local179);
				} else if (arg6 == 6) {
					local359 = arg4.method2008(arg7, arg5, arg1);
					local958 = 8;
					if (local359 != 0) {
						local958 = Static136.method2319(local359 >> 14 & 0x7FFF).anInt1823 / 2;
					}
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local988 = local50.method1200(4, local165, local54, local157, local173, arg0 + 4);
					} else {
						local988 = new Class3_Sub2_Sub1_Sub5(arg2, 4, arg0 + 4, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method1965(arg7, arg5, arg1, local157, local988, null, 256, arg0, local958 * Static182.anIntArray446[arg0], local958 * Static150.anIntArray392[arg0], local199, local179);
				} else if (arg6 == 7) {
					local359 = arg0 + 2 & 0x3;
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local258 = local50.method1200(4, local165, local54, local157, local173, local359 + 4);
					} else {
						local258 = new Class3_Sub2_Sub1_Sub5(arg2, 4, local359 + 4, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method1965(arg7, arg5, arg1, local157, local258, null, 256, local359, 0, 0, local199, local179);
				} else if (arg6 == 8) {
					local958 = 8;
					local359 = arg4.method2008(arg7, arg5, arg1);
					if (local359 != 0) {
						local958 = Static136.method2319(local359 >> 14 & 0x7FFF).anInt1823 / 2;
					}
					@Pc(1766) int local1766 = arg0 + 2 & 0x3;
					@Pc(1797) Class3_Sub2_Sub1 local1797;
					if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
						local988 = local50.method1200(4, local165, local54, local157, local173, arg0 + 4);
						local1797 = local50.method1200(4, local165, local54, local157, local173, local1766 + 4);
					} else {
						local988 = new Class3_Sub2_Sub1_Sub5(arg2, 4, arg0 + 4, arg7, arg5, arg1, local50.anInt1830, true, null);
						local1797 = new Class3_Sub2_Sub1_Sub5(arg2, 4, local1766 + 4, arg7, arg5, arg1, local50.anInt1830, true, null);
					}
					arg4.method1965(arg7, arg5, arg1, local157, local988, local1797, 256, arg0, local958 * Static182.anIntArray446[arg0], Static150.anIntArray392[arg0] * local958, local199, local179);
				}
			}
		} else if (!Static71.aBoolean76 || local50.anInt1818 != 0 || local50.anInt1820 == 1 || local50.aBoolean74) {
			if (local50.anInt1830 == -1 && local50.anIntArray171 == null) {
				local258 = local50.method1200(22, local165, local54, local157, local173, arg0);
			} else {
				local258 = new Class3_Sub2_Sub1_Sub5(arg2, 22, arg0, arg7, arg5, arg1, local50.anInt1830, true, null);
			}
			arg4.method1970(arg7, arg5, arg1, local157, local258, local199, local179);
			if (local50.anInt1820 == 1 && arg3 != null) {
				arg3.method2251(arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Lclient!oh;")
	public static Class3_Sub2_Sub11 method573(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub2_Sub11 local6 = (Class3_Sub2_Sub11) Static26.aClass57_7.method1719((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static175.aClass44_32.method1624(14, arg0);
		local6 = new Class3_Sub2_Sub11();
		if (local28 != null) {
			local6.method2029(new Class3_Sub4(local28));
		}
		Static26.aClass57_7.method1717(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public static void method574() {
		aClass46_231 = null;
		aClass46_232 = null;
		aClass46_235 = null;
		aClass46Array4 = null;
		aClass46_234 = null;
		anIntArray66 = null;
		anIntArray67 = null;
	}
}
