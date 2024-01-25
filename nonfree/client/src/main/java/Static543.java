import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "F")
	public static float aFloat234;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_14 = new Class262(6, 4);

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[I")
	public static final int[] anIntArray582 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	public static final int anInt8920 = 1405;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
	public static void method7101(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(12) Class12_Sub5 local12 = (Class12_Sub5) Static71.aClass220_8.method4661(); local12 != null; local12 = (Class12_Sub5) Static71.aClass220_8.method4660()) {
			if (local12.anInt6701 <= Static532.anInt8757) {
				local12.method7630();
			} else {
				Static89.method1351(arg1 >> 1, (local12.anInt6698 << 9) + 256, local12.anInt6703, (local12.anInt6700 << 9) + 256, arg3 >> 1, local12.anInt6699 * 2);
				Static81.aClass37_16.method7724(local12.anInt6705 | 0xFF000000, 0, local12.aString99, arg2 + Static494.anIntArray527[1], Static494.anIntArray527[0] + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!caa;ILclient!hq;B)V")
	public static void method7102(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class148 arg2) {
		if (Static276.anInt4784 >= 50 || (arg2 == null || arg2.anIntArrayArray34 == null || arg2.anIntArrayArray34.length <= arg1 || arg2.anIntArrayArray34[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray34[arg1][0];
		@Pc(46) int local46 = local34 >> 8;
		@Pc(52) int local52 = local34 >> 5 & 0x7;
		@Pc(56) int local56 = local34 & 0x1F;
		@Pc(73) int local73;
		if (arg2.anIntArrayArray34[arg1].length > 1) {
			local73 = (int) (Math.random() * (double) arg2.anIntArrayArray34[arg1].length);
			if (local73 > 0) {
				local46 = arg2.anIntArrayArray34[arg1][local73];
			}
		}
		local73 = 256;
		if (arg2.anIntArray255 != null && arg2.anIntArray256 != null) {
			local73 = (int) (Math.random() * (double) (arg2.anIntArray256[arg1] - arg2.anIntArray255[arg1])) + arg2.anIntArray255[arg1];
		}
		@Pc(121) int local121 = arg2.anIntArray251 == null ? 255 : arg2.anIntArray251[arg1];
		if (local56 == 0) {
			if (arg0 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30) {
				if (arg2.aBoolean222) {
					Static351.method5040(false, local52, 0, local73, local46, local121);
					return;
				}
				Static86.method1275(local121, local46, local73, 0, local52);
			}
		} else if (Static257.aClass2_Sub35_Sub1_1.anInt7512 != 0) {
			@Pc(163) int local163 = arg0.anInt9374 - 256 >> 9;
			@Pc(170) int local170 = arg0.anInt9375 - 256 >> 9;
			@Pc(190) int local190 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == arg0 ? 0 : local56 + (local163 << 16) + (arg0.aByte128 << 24) + (local170 << 8);
			Static537.aClass67Array1[Static276.anInt4784++] = new Class67((byte) (arg2.aBoolean222 ? 2 : 1), local46, local52, 0, local121, local190, local73, arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
	public static int method7103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static576.aByteArrayArray24 == null ? 0 : Static576.aByteArrayArray24[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Z")
	public static boolean method7105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V")
	public static void method7106(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub7 local10 = new Class2_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method4464();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(27) int[] local27 = Static30.anIntArray51 = new int[6];
					local27[0] = local10.method4518();
					local27[1] = local10.method4518();
					local27[2] = local10.method4518();
					local27[3] = local10.method4518();
					local27[4] = local10.method4518();
					local27[5] = local10.method4518();
				} else {
					@Pc(81) int local81;
					@Pc(86) int local86;
					if (local14 == 4) {
						local81 = local10.method4464();
						Static463.anIntArray497 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static463.anIntArray497[local86] = local10.method4518();
							if (Static463.anIntArray497[local86] == 65535) {
								Static463.anIntArray497[local86] = -1;
							}
						}
					} else if (local14 == 5) {
						local81 = local10.method4464();
						Static52.anIntArray102 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static52.anIntArray102[local86] = local10.method4518();
							if (Static52.anIntArray102[local86] == 65535) {
								Static52.anIntArray102[local86] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7107(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static107.anInt1861 >= 200 && !Static327.aBoolean433 || Static107.anInt1861 >= 200) {
			Static581.method7527(Static229.aClass159_12.method2776(Static261.anInt4297));
			local30 = Static229.aClass159_13.method2776(Static261.anInt4297);
			if (local30 != null) {
				Static581.method7527(local30);
			}
			return;
		}
		local30 = Static273.method3974(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(89) String local89;
		for (@Pc(50) int local50 = 0; local50 < Static107.anInt1861; local50++) {
			@Pc(58) String local58 = Static273.method3974(Static394.aStringArray33[local50]);
			if (local58 != null && local58.equals(local30)) {
				Static581.method7527(arg0 + Static229.aClass159_40.method2776(Static261.anInt4297));
				return;
			}
			if (Static197.aStringArray18[local50] != null) {
				local89 = Static273.method3974(Static197.aStringArray18[local50]);
				if (local89 != null && local89.equals(local30)) {
					Static581.method7527(arg0 + Static229.aClass159_40.method2776(Static261.anInt4297));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static225.anInt3293; local120++) {
			local89 = Static273.method3974(Static582.aStringArray44[local120]);
			if (local89 != null && local89.equals(local30)) {
				Static581.method7527(Static229.aClass159_45.method2776(Static261.anInt4297) + arg0 + Static229.aClass159_46.method2776(Static261.anInt4297));
				return;
			}
			if (Static117.aStringArray13[local120] != null) {
				@Pc(164) String local164 = Static273.method3974(Static117.aStringArray13[local120]);
				if (local164 != null && local164.equals(local30)) {
					Static581.method7527(Static229.aClass159_45.method2776(Static261.anInt4297) + arg0 + Static229.aClass159_46.method2776(Static261.anInt4297));
					return;
				}
			}
		}
		if (Static273.method3974(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75).equals(local30)) {
			Static581.method7527(Static229.aClass159_43.method2776(Static261.anInt4297));
		} else {
			@Pc(218) Class2_Sub34 local218 = Static555.method7264(Static317.aClass154_68, Static551.aClass64_2);
			local218.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0));
			local218.aClass2_Sub7_Sub2_2.method4481(arg0);
			Static100.method1508(local218);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[FIIII)V")
	public static void method7108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static259.method3656(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static259.method3656(arg3)) {
			@Pc(34) int local34 = Static224.method2730(6408);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg3 > arg5 ? arg5 : arg3;
			@Pc(55) int local55 = arg5 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(61) float[] local61 = arg2;
			@Pc(68) float[] local68 = new float[local34 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg5, arg3, 0, 6408, 5126, local61, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(87) int local87 = local34 * arg5;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local89 + local87;
					for (@Pc(101) int local101 = 0; local101 < local59; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local55; local105++) {
							@Pc(111) float local111 = local61[local95];
							local95 += local34;
							@Pc(121) float local121 = local111 + local61[local95];
							@Pc(127) float local127 = local121 + local61[local99];
							local95 += local34;
							local99 += local34;
							@Pc(141) float local141 = local127 + local61[local99];
							local68[local93] = local141 * 0.25F;
							local99 += local34;
							local93 += local34;
						}
						local99 += local87;
						local95 += local87;
					}
				}
				@Pc(185) float[] local185 = local68;
				local68 = local61;
				local61 = local185;
				arg5 = local55;
				arg3 = local59;
				local55 >>= 0x1;
				local36++;
				local59 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
