import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Lclient!jd;")
	public static Class84 aClass84_125;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
	public static int anInt5982 = 0;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
	public static int[] anIntArray514 = new int[8];

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString290 = "slide:";

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!hk;)V")
	public static void method4788(@OriginalArg(1) Class71_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static298.anIntArray473.length; local3++) {
			Static298.anIntArray473[local3] = 0;
		}
		@Pc(30) int local30;
		@Pc(43) int local43;
		for (local30 = 0; local30 < 5000; local30++) {
			local43 = (int) (Math.random() * 128.0D * (double) 256);
			Static298.anIntArray473[local43] = (int) (Math.random() * 284.0D);
		}
		@Pc(77) int local77;
		@Pc(86) int local86;
		for (local30 = 0; local30 < 20; local30++) {
			for (local43 = 1; local43 < 255; local43++) {
				for (local77 = 1; local77 < 127; local77++) {
					local86 = (local43 << 7) + local77;
					Static121.anIntArray171[local86] = (Static298.anIntArray473[local86 + 128] + Static298.anIntArray473[local86 + 1] + Static298.anIntArray473[local86 + -1] + Static298.anIntArray473[local86 + -128]) / 4;
				}
			}
			@Pc(122) int[] local122 = Static298.anIntArray473;
			Static298.anIntArray473 = Static121.anIntArray171;
			Static121.anIntArray171 = local122;
		}
		if (arg0 == null) {
			return;
		}
		local30 = 0;
		for (local43 = 0; local43 < arg0.anInt5767; local43++) {
			for (local77 = 0; local77 < arg0.anInt5766; local77++) {
				if (arg0.aByteArray21[local30++] != 0) {
					@Pc(166) int local166 = arg0.anInt5764 + local43 + 16;
					local86 = arg0.anInt5763 + local77 + 16;
					@Pc(179) int local179 = (local166 << 7) + local86;
					Static298.anIntArray473[local179] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!jd;)Z")
	public static boolean method4789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class84 arg2) {
		@Pc(5) byte[] local5 = arg2.method2127(arg0, arg1);
		if (local5 == null) {
			return false;
		} else {
			Static62.method1203(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIZI[B[Lclient!f;III)V")
	public static void method4792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) Class52[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = -1;
		@Pc(16) Class2_Sub26 local16 = new Class2_Sub26(arg5);
		while (true) {
			@Pc(20) int local20 = local16.method4240();
			if (local20 == 0) {
				return;
			}
			@Pc(29) int local29 = 0;
			local11 += local20;
			while (true) {
				@Pc(37) int local37 = local16.method4217();
				if (local37 == 0) {
					break;
				}
				local29 += local37 - 1;
				@Pc(54) int local54 = local29 & 0x3F;
				@Pc(60) int local60 = local29 >> 6 & 0x3F;
				@Pc(64) int local64 = local29 >> 12;
				@Pc(68) int local68 = local16.method4261();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (local64 == arg9 && arg4 <= local60 && arg4 + 8 > local60 && local54 >= arg8 && arg8 + 8 > local54) {
					@Pc(108) Class143 local108 = Static218.method3692(local11);
					@Pc(125) int local125 = Static49.method985(local108.anInt4494, local108.anInt4496, local76, local60 & 0x7, local54 & 0x7, arg7) + arg0;
					@Pc(143) int local143 = arg2 + Static22.method286(local108.anInt4496, local108.anInt4494, arg7, local60 & 0x7, local76, local54 & 0x7);
					if (local125 > 0 && local143 > 0 && local125 < 103 && local143 < 103) {
						@Pc(161) Class52 local161 = null;
						if (!arg3) {
							@Pc(165) int local165 = arg1;
							if ((Static134.aByteArrayArrayArray9[1][local125][local143] & 0x2) == 2) {
								local165 = arg1 - 1;
							}
							if (local165 >= 0) {
								local161 = arg6[local165];
							}
						}
						Static121.method2216(local125, !arg3, local161, arg3, local72, local76 + arg7 & 0x3, arg1, arg1, local11, local143);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIB)V")
	public static void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class142 local13 = Static17.method359(arg1);
		@Pc(16) int local16 = local13.anInt4473;
		@Pc(19) int local19 = local13.anInt4478;
		@Pc(22) int local22 = local13.anInt4479;
		@Pc(29) int local29 = Class2_Sub1_Sub7.anIntArray96[local22 - local19];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local19;
		Static25.method4637(local16, local29 & arg0 << local19 | ~local29 & Static249.anIntArray446[local16]);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BJ)V")
	public static void method4795(@OriginalArg(1) long arg0) {
		if (Static101.anInt6027 == 1 || Static101.anInt6027 == 5) {
			Static248.method3969(arg0);
		} else if (Static101.anInt6027 == 2) {
			Static92.method1721();
		} else {
			Static19.method418();
		}
		if (!Static299.aBoolean203) {
			Static77.anIntArray116[0] = Static260.anInt5409;
			Static289.aShortArray93[0] = 1005;
			Static216.anInt4481 = 1;
			if (Static155.anInt6185 != 0) {
				Static68.anInt1506 = Static118.anInt2534;
				Static9.anInt275 = Static104.anInt2262;
			} else if (Static246.anInt5126 == 0) {
				Static68.anInt1506 = Static238.anInt4852;
				Static9.anInt275 = Static86.anInt1911;
			} else {
				Static9.anInt275 = Static199.anInt4139;
				Static68.anInt1506 = Static122.anInt2587;
			}
			Static250.aStringArray28[0] = Static224.aString233;
			Static214.aStringArray22[0] = "";
		}
		if (Static17.anInt427 != -1) {
			Static170.method2925(Static17.anInt427);
		}
		@Pc(82) int local82;
		for (local82 = 0; local82 < Static231.anInt4776; local82++) {
			if (Static165.aBooleanArray16[local82]) {
				Static90.aBooleanArray9[local82] = true;
			}
			Static222.aBooleanArray21[local82] = Static165.aBooleanArray16[local82];
			Static165.aBooleanArray16[local82] = false;
		}
		if (Static60.aBoolean106) {
			Static295.aBoolean488 = true;
		}
		Static197.anInt4133 = -1;
		Static43.aClass115_5 = null;
		Static104.aClass115_9 = null;
		Static65.anInt1453 = Static148.anInt3168;
		Static180.anInt3872 = -1;
		if (Static17.anInt427 != -1) {
			Static231.anInt4776 = 0;
			Static254.method4117();
		}
		if (Static60.aBoolean106) {
			Static94.method1750();
		} else {
			Static160.method2786();
		}
		Static222.method3719();
		if (Static299.aBoolean203) {
			if (Static201.aBoolean347) {
				Static42.method826();
			} else {
				Static28.method545();
			}
		} else if (Static104.aClass115_9 != null) {
			Static105.method1949(Static226.anInt1976, Static104.aClass115_9, Static272.anInt5669);
		} else if (Static180.anInt3872 != -1) {
			Static105.method1949(Static180.anInt3872, null, Static197.anInt4133);
		}
		local82 = Static299.aBoolean203 ? -1 : Static26.method495();
		if (local82 == -1) {
			local82 = Static139.anInt3000;
		}
		Static15.method319(local82);
		if (Static262.anInt6194 == 1) {
			Static262.anInt6194 = 2;
		}
		if (Static2.anInt5935 == 1) {
			Static2.anInt5935 = 2;
		}
		if (Static219.anInt4589 == 3) {
			for (@Pc(214) int local214 = 0; local214 < Static231.anInt4776; local214++) {
				if (Static222.aBooleanArray21[local214]) {
					if (Static60.aBoolean106) {
						Static94.method1747(Static12.anIntArray14[local214], Static113.anIntArray166[local214], Static295.anIntArray526[local214], Static264.anIntArray483[local214], 16711935, 128);
					} else {
						Static160.method2779(Static12.anIntArray14[local214], Static113.anIntArray166[local214], Static295.anIntArray526[local214], Static264.anIntArray483[local214], 16711935, 128);
					}
				} else if (Static90.aBooleanArray9[local214]) {
					if (Static60.aBoolean106) {
						Static94.method1747(Static12.anIntArray14[local214], Static113.anIntArray166[local214], Static295.anIntArray526[local214], Static264.anIntArray483[local214], 16711680, 128);
					} else {
						Static160.method2779(Static12.anIntArray14[local214], Static113.anIntArray166[local214], Static295.anIntArray526[local214], Static264.anIntArray483[local214], 16711680, 128);
					}
				}
			}
		}
		Static216.method3636(Static208.anInt4335, Static37.anInt906, Static111.aClass36_Sub3_Sub2_1.anInt5093, Static111.aClass36_Sub3_Sub2_1.anInt5109);
		Static37.anInt906 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	public static void method4796() {
		if (Static58.anInt1304 != -1) {
			Static20.method1062(-1, Static58.anInt1304, -1);
			Static58.anInt1304 = -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
	public static void method4797() {
		Static186.aClass46_31.method1077();
		Static144.aClass46_24.method1077();
	}
}
