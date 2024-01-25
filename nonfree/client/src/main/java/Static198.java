import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[[[Lclient!uk;")
	public static Class204[][][] aClass204ArrayArrayArray2;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!wf;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)Z")
	public static boolean method3725(@OriginalArg(1) int arg0) {
		if (Static23.aBooleanArray2[arg0]) {
			return true;
		} else if (Static230.aClass165_70.method4487(arg0)) {
			@Pc(23) int local23 = Static230.aClass165_70.method4499(arg0);
			if (local23 == 0) {
				Static23.aBooleanArray2[arg0] = true;
				return true;
			}
			if (Static314.aClass177ArrayArray1[arg0] == null) {
				Static314.aClass177ArrayArray1[arg0] = new Class177[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static314.aClass177ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static230.aClass165_70.method4508(local42, arg0);
					if (local56 != null) {
						@Pc(68) Class177 local68 = Static314.aClass177ArrayArray1[arg0][local42] = new Class177();
						local68.anInt5219 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							local68.method4693(new Class1_Sub7(local56));
						} else {
							local68.method4697(new Class1_Sub7(local56));
						}
					}
				}
			}
			Static23.aBooleanArray2[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIII)V")
	public static void method3726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static273.anInt5336 = arg3;
		Static193.anInt3951 = arg2;
		Static188.anInt3907 = arg4;
		Static73.anInt1509 = arg1;
		Static311.anInt5998 = arg5;
		Static126.anInt2479 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public static void method3728() {
		@Pc(16) Class1_Sub1_Sub2 local16 = Static42.method1000(15, 0);
		local16.method167();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)S")
	public static short method3729(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? local15 * (127 - local19) >> 7 : local19 * local15 >> 7;
		@Pc(43) int local43 = local19 + local39;
		@Pc(49) int local49;
		if (local43 == 0) {
			local49 = local39 << 1;
		} else {
			local49 = (local39 << 8) / local43;
		}
		return (short) (local43 | local49 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3730(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static367.method5383(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	public static void method3731() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static138.aBooleanArray9[local7] = false;
		}
		Static147.anInt2898 = 0;
		Static81.anInt1609 = 1;
		Static17.anInt380 = 0;
		Static112.anInt4021 = -1;
		Static304.anInt5854 = -1;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	public static void method3732() {
		Static277.anInt6207 = 0;
		Static175.aClass195_36.method5032();
		Static175.aClass195_36.method5018(Static239.aClass1_Sub41_1);
		Static277.anInt6207++;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!aa;)V")
	public static void method3736(@OriginalArg(0) int arg0, @OriginalArg(2) Class2 arg1) {
		Static204.method3804(arg1);
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0 > 1) {
			for (local21 = 0; local21 < Static48.anInt1107; local21++) {
				for (local25 = 0; local25 < Static337.anInt6402; local25++) {
					if ((Static183.aByteArrayArrayArray7[1][local21][local25] & 0x2) == 2) {
						Static112.method3712(local21, local25);
					}
				}
			}
		}
		for (local21 = 0; local21 < arg0; local21++) {
			for (local25 = 0; local25 <= Static337.anInt6402; local25++) {
				for (@Pc(59) int local59 = 0; local59 <= Static48.anInt1107; local59++) {
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(117) int local117;
					@Pc(121) int local121;
					@Pc(206) int local206;
					@Pc(214) int local214;
					@Pc(234) int local234;
					@Pc(238) int local238;
					if ((Static337.aByteArrayArrayArray12[local21][local59][local25] & 0x1) != 0) {
						local73 = local25;
						local75 = local25;
						local77 = local21;
						while (local73 > 0 && (Static337.aByteArrayArrayArray12[local21][local59][local73 - 1] & 0x1) != 0) {
							local73--;
						}
						while (Static337.anInt6402 > local75 && (Static337.aByteArrayArrayArray12[local21][local59][local75 + 1] & 0x1) != 0) {
							local75++;
						}
						local117 = local21;
						label164: while (local77 > 0) {
							for (local121 = local73; local121 <= local75; local121++) {
								if ((Static337.aByteArrayArrayArray12[local77 - 1][local59][local121] & 0x1) == 0) {
									break label164;
								}
							}
							local77--;
						}
						label153: while (local117 < 3) {
							for (local121 = local73; local121 <= local75; local121++) {
								if ((Static337.aByteArrayArrayArray12[local117 + 1][local59][local121] & 0x1) == 0) {
									break label153;
								}
							}
							local117++;
						}
						local121 = (local75 + 1 - local73) * (local117 + 1 - local77);
						if (local121 >= 2) {
							local206 = Static213.anIntArrayArrayArray10[local117][local59][local73] - 240;
							local214 = Static213.anIntArrayArrayArray10[local77][local59][local73];
							Static226.method4109(1, local59 * 128, local59 * 128, local73 * 128, local75 * 128 + 128, local206, local214);
							for (local234 = local77; local234 <= local117; local234++) {
								for (local238 = local73; local238 <= local75; local238++) {
									Static337.aByteArrayArrayArray12[local234][local59][local238] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static337.aByteArrayArrayArray12[local21][local59][local25] & 0x2) != 0) {
						local73 = local59;
						local75 = local59;
						local77 = local21;
						while (local73 > 0 && (Static337.aByteArrayArrayArray12[local21][local73 - 1][local25] & 0x2) != 0) {
							local73--;
						}
						local117 = local21;
						while (Static48.anInt1107 > local75 && (Static337.aByteArrayArrayArray12[local21][local75 + 1][local25] & 0x2) != 0) {
							local75++;
						}
						label218: while (local77 > 0) {
							for (local121 = local73; local121 <= local75; local121++) {
								if ((Static337.aByteArrayArrayArray12[local77 - 1][local121][local25] & 0x2) == 0) {
									break label218;
								}
							}
							local77--;
						}
						label207: while (local117 < 3) {
							for (local121 = local73; local121 <= local75; local121++) {
								if ((Static337.aByteArrayArrayArray12[local117 + 1][local121][local25] & 0x2) == 0) {
									break label207;
								}
							}
							local117++;
						}
						local121 = (local117 + 1 - local77) * ((local75 + 1) - local73);
						if (local121 >= 2) {
							local206 = Static213.anIntArrayArrayArray10[local117][local73][local25] - 240;
							local214 = Static213.anIntArrayArrayArray10[local77][local73][local25];
							Static226.method4109(2, local73 * 128, local75 * 128 + 128, local25 * 128, local25 * 128, local206, local214);
							for (local234 = local77; local234 <= local117; local234++) {
								for (local238 = local73; local238 <= local75; local238++) {
									Static337.aByteArrayArrayArray12[local234][local238][local25] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static337.aByteArrayArrayArray12[local21][local59][local25] & 0x4) != 0) {
						local73 = local59;
						local75 = local59;
						local77 = local25;
						local117 = local25;
						while (local77 > 0 && (Static337.aByteArrayArrayArray12[local21][local59][local77 - 1] & 0x4) != 0) {
							local77--;
						}
						while (local117 < Static337.anInt6402 && (Static337.aByteArrayArrayArray12[local21][local59][local117 + 1] & 0x4) != 0) {
							local117++;
						}
						label272: while (local73 > 0) {
							for (local121 = local77; local121 <= local117; local121++) {
								if ((Static337.aByteArrayArrayArray12[local21][local73 - 1][local121] & 0x4) == 0) {
									break label272;
								}
							}
							local73--;
						}
						label261: while (Static48.anInt1107 > local75) {
							for (local121 = local77; local121 <= local117; local121++) {
								if ((Static337.aByteArrayArrayArray12[local21][local75 + 1][local121] & 0x4) == 0) {
									break label261;
								}
							}
							local75++;
						}
						if ((local117 + 1 - local77) * (local75 - (local73 - 1)) >= 4) {
							local121 = Static213.anIntArrayArrayArray10[local21][local73][local77];
							Static226.method4109(4, local73 * 128, local75 * 128 + 128, local77 * 128, local117 * 128 + 128, local121, local121);
							for (@Pc(670) int local670 = local73; local670 <= local75; local670++) {
								for (local206 = local77; local206 <= local117; local206++) {
									Static337.aByteArrayArrayArray12[local21][local670][local206] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method3737() {
		for (@Pc(13) Class1_Sub9 local13 = (Class1_Sub9) Static348.aClass26_20.method871(); local13 != null; local13 = (Class1_Sub9) Static348.aClass26_20.method878()) {
			@Pc(18) int local18 = local13.anInt1104;
			if (method3725(local18)) {
				@Pc(24) boolean local24 = true;
				@Pc(28) Class177[] local28 = Static314.aClass177ArrayArray1[local18];
				for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
					if (local28[local30] != null) {
						local24 = local28[local30].aBoolean445;
						break;
					}
				}
				if (!local24) {
					@Pc(54) int local54 = (int) local13.aLong215;
					@Pc(58) Class177 local58 = Static140.method2694(local54);
					if (local58 != null) {
						Static133.method2517(local58);
					}
				}
			}
		}
	}
}
