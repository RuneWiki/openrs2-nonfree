import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int anInt1162;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_49;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!db;")
	public static Class31 aClass31_10 = new Class31(100);

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
	public static int[] anIntArray139 = new int[50];

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static int anInt1167 = -1;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "[I")
	public static int[] anIntArray140 = new int[500];

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "[Lclient!bk;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array1 = new Class1_Sub2_Sub4[14];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BIIII)Lclient!na;")
	public static Class116 method927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg0 & 0xFFFFL) << 32 | ((long) arg2 & 0xFFFFL) << 16 | (long) arg3 & 0xFFFFL;
		@Pc(37) Class116 local37 = (Class116) Static140.aClass31_23.method852(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(78) Class97[] local78 = null;
		@Pc(82) Class88 local82 = Static98.method1609(arg3);
		if (local82.anIntArray303 != null) {
			local78 = new Class97[local82.anIntArray303.length];
			for (@Pc(93) int local93 = 0; local93 < local78.length; local93++) {
				@Pc(106) Class78 local106 = Static1.method1(local82.anIntArray303[local93]);
				local78[local93] = new Class97(local106.anInt2126, local106.anInt2127, local106.anInt2119, local106.anInt2121, local106.anInt2132, local106.anInt2128, local106.anInt2131, local106.aBoolean161);
			}
		}
		local37 = new Class116(local82.anInt2538, local78, local82.anInt2537, arg1, arg0, arg2);
		Static140.aClass31_23.method851(local37, local31);
		return local37;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method928() {
		while (true) {
			if (Static63.aClass1_Sub18_Sub1_1.method3125(Static292.anInt5802) >= 27) {
				@Pc(20) int local20 = Static63.aClass1_Sub18_Sub1_1.method3129(15);
				if (local20 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static211.aClass6_Sub6_Sub1Array2[local20] == null) {
						local25 = true;
						Static211.aClass6_Sub6_Sub1Array2[local20] = new Class6_Sub6_Sub1();
					}
					@Pc(43) Class6_Sub6_Sub1 local43 = Static211.aClass6_Sub6_Sub1Array2[local20];
					Static75.anIntArray178[Static293.anInt5831++] = local20;
					local43.anInt4519 = Static261.anInt5259;
					if (local43.aClass19_1 != null && local43.aClass19_1.method505()) {
						Static165.method2523(local43);
					}
					@Pc(76) int local76 = Static43.anIntArray129[Static63.aClass1_Sub18_Sub1_1.method3129(3)];
					if (local25) {
						local43.anInt4579 = local43.anInt4511 = local76;
					}
					local43.method3458(Static24.method424(Static63.aClass1_Sub18_Sub1_1.method3129(14)));
					@Pc(99) int local99 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
					if (local99 == 1) {
						Static294.anIntArray687[Static101.anInt1926++] = local20;
					}
					@Pc(118) int local118 = Static63.aClass1_Sub18_Sub1_1.method3129(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					@Pc(129) int local129 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
					@Pc(134) int local134 = Static63.aClass1_Sub18_Sub1_1.method3129(5);
					local43.method3511(local43.aClass19_1.anInt629);
					if (local134 > 15) {
						local134 -= 32;
					}
					local43.anInt4503 = local43.aClass19_1.anInt673;
					if (local43.anInt4503 == 0) {
						local43.anInt4511 = 0;
					}
					local43.anInt4546 = local43.aClass19_1.anInt656;
					local43.method3500(local129 == 1, Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] + local134, local118 + Static28.aClass6_Sub6_Sub2_1.anIntArray519[0], local43.method3509());
					if (local43.aClass19_1.method505()) {
						Static280.method4296(null, null, Static159.anInt2978, local43, local43.anIntArray519[0], local43.anIntArray516[0], 0);
					}
					continue;
				}
			}
			Static63.aClass1_Sub18_Sub1_1.method3132();
			return;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZILjava/lang/String;)V")
	public static void method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(13) Class127 local13 = Static241.method3829(arg2, arg1);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray26 != null) {
			@Pc(26) Class1_Sub20 local26 = new Class1_Sub20();
			local26.aString109 = arg3;
			local26.anObjectArray2 = local13.anObjectArray26;
			local26.aClass127_9 = local13;
			local26.anInt3129 = arg0;
			Static283.method4321(local26);
		}
		@Pc(44) boolean local44 = true;
		if (local13.anInt3566 > 0) {
			local44 = Static100.method1633(local13);
		}
		if (!local44 || !Static43.method794(local13).method4350(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static270.aClass1_Sub18_Sub1_3.method3130(230);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 2) {
			Static270.aClass1_Sub18_Sub1_3.method3130(115);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 3) {
			Static270.aClass1_Sub18_Sub1_3.method3130(105);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 4) {
			Static270.aClass1_Sub18_Sub1_3.method3130(217);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 5) {
			Static270.aClass1_Sub18_Sub1_3.method3130(125);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 6) {
			Static270.aClass1_Sub18_Sub1_3.method3130(207);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 7) {
			Static270.aClass1_Sub18_Sub1_3.method3130(116);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 8) {
			Static270.aClass1_Sub18_Sub1_3.method3130(173);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 9) {
			Static270.aClass1_Sub18_Sub1_3.method3130(86);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
		if (arg0 == 10) {
			Static270.aClass1_Sub18_Sub1_3.method3130(168);
			Static270.aClass1_Sub18_Sub1_3.method3119(arg1);
			Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public static void method930(@OriginalArg(1) byte arg0) {
		if (Static119.aByteArrayArrayArray21 == null) {
			Static119.aByteArrayArrayArray21 = new byte[4][104][104];
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
				for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
					Static119.aByteArrayArrayArray21[local21][local26][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[[FZIII[[FZIF[[FI[[I[[IIIILclient!rc;)I")
	public static int method931(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class1_Sub25 arg16) {
		@Pc(12) int local12;
		if (arg0 == 1) {
			local12 = arg15;
			arg15 = arg5;
			arg5 = 128 - local12;
		} else if (arg0 == 2) {
			arg15 = 128 - arg15;
			arg5 = 128 - arg5;
		} else if (arg0 == 3) {
			local12 = arg15;
			arg15 = 128 - arg5;
			arg5 = local12;
		}
		@Pc(98) float local98;
		@Pc(86) float local86;
		@Pc(88) int local88;
		@Pc(108) float local108;
		if (arg15 == 0 && arg5 == 0) {
			local86 = arg9[arg7][arg14];
			local108 = arg6[arg7][arg14];
			local88 = arg10;
			local98 = arg1[arg7][arg14];
		} else if (arg15 == 128 && arg5 == 0) {
			local86 = arg9[arg7 + 1][arg14];
			local88 = arg4;
			local108 = arg6[arg7 + 1][arg14];
			local98 = arg1[arg7 + 1][arg14];
		} else if (arg15 == 128 && arg5 == 128) {
			local86 = arg9[arg7 + 1][arg14 + 1];
			local88 = arg13;
			local98 = arg1[arg7 + 1][arg14 + 1];
			local108 = arg6[arg7 + 1][arg14 + 1];
		} else if (arg15 == 0 && arg5 == 128) {
			local98 = arg1[arg7][arg14 + 1];
			local88 = arg3;
			local86 = arg9[arg7][arg14 + 1];
			local108 = arg6[arg7][arg14 + 1];
		} else {
			local108 = arg6[arg7][arg14];
			local86 = arg9[arg7][arg14];
			local98 = arg1[arg7][arg14];
			@Pc(170) float local170 = arg9[arg7][arg14 + 1];
			@Pc(178) float local178 = arg6[arg7][arg14 + 1];
			@Pc(183) float local183 = (float) arg5 / 128.0F;
			@Pc(191) float local191 = arg1[arg7][arg14 + 1];
			@Pc(196) float local196 = (float) arg15 / 128.0F;
			@Pc(213) float local213 = local191 + (arg1[arg7 + 1][arg14 + 1] - local191) * local196;
			@Pc(230) float local230 = local178 + (arg6[arg7 + 1][arg14 + 1] - local178) * local196;
			@Pc(245) float local245 = local108 + (arg6[arg7 + 1][arg14] - local108) * local196;
			@Pc(259) float local259 = local86 + local196 * (arg9[arg7 + 1][arg14] - local86);
			@Pc(273) float local273 = local98 + local196 * (arg1[arg7 + 1][arg14] - local98);
			local108 = local245 + local183 * (local230 - local245);
			local98 = local273 + local183 * (local213 - local273);
			@Pc(307) float local307 = local170 + local196 * (arg9[arg7 + 1][arg14 + 1] - local170);
			@Pc(313) int local313 = Static65.method1076(arg10, arg4, arg15);
			local86 = local259 + local183 * (local307 - local259);
			@Pc(327) int local327 = Static65.method1076(arg3, arg13, arg15);
			local88 = Static65.method1076(local313, local327, arg5);
		}
		@Pc(395) int local395 = (arg7 << 7) + arg15;
		@Pc(401) int local401 = arg5 + (arg14 << 7);
		@Pc(409) int local409 = Static291.method4468(arg15, arg7, arg14, arg5, arg11);
		return arg16.method3602(local395, local409, local401, local108, local98, local86, arg2 ? local88 & 0xFFFFFF00 : local88, arg12 == null ? 0.0F : (float) (local409 - Static291.method4468(arg15, arg7, arg14, arg5, arg12)) / arg8);
	}
}
