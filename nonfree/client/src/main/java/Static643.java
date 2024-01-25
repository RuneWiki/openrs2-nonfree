import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	public static int anInt9908;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public static final int anInt9914 = 2;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method8441() {
		if (Static582.aClass16_12 == null) {
			return;
		}
		if (Static649.aBoolean735) {
			Static609.method5403();
		}
		Static52.aClass211_2.method4939();
		Static418.method5969();
		Static542.method7494();
		Static248.method3935();
		Static437.method6387();
		Static30.method943();
		if (Static578.aClass10_1 != null) {
			Static578.aClass10_1.method93();
		}
		Static589.method7916();
		Static389.method5059();
		Static9.method92();
		Static200.method3155();
		Static585.method7868(false);
		for (@Pc(49) int local49 = 0; local49 < 2048; local49++) {
			@Pc(55) Class23_Sub2_Sub1_Sub2_Sub1 local55 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local49];
			if (local55 != null) {
				for (@Pc(59) int local59 = 0; local59 < local55.aClass28Array3.length; local59++) {
					local55.aClass28Array3[local59] = null;
				}
			}
		}
		for (@Pc(84) int local84 = 0; local84 < Static609.anInt6433; local84++) {
			@Pc(91) Class23_Sub2_Sub1_Sub2_Sub2 local91 = Static43.aClass3_Sub11Array1[local84].aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (local91 != null) {
				for (@Pc(95) int local95 = 0; local95 < local91.aClass28Array3.length; local95++) {
					local91.aClass28Array3[local95] = null;
				}
			}
		}
		Static366.aClass25_4 = null;
		Static668.aClass25_9 = null;
		Static582.aClass16_12.method8199();
		Static582.aClass16_12 = null;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method8442() {
		if (Static56.anInt1424 < 0) {
			return;
		}
		@Pc(7) long local7 = Static131.method2268();
		Static56.anInt1424 = (int) ((long) Static56.anInt1424 + Static352.aLong163 - local7);
		if (Static56.anInt1424 <= 0) {
			Static530.aFloat189 = Static390.aClass182_1.aFloat117;
			Static56.anInt1424 = -1;
			Static102.aFloat70 = Static390.aClass182_1.aFloat112;
			Static56.aClass106_1 = Static390.aClass182_1.aClass106_3;
			Static623.aFloat188 = Static390.aClass182_1.aFloat114;
			Static256.anInt4826 = Static390.aClass182_1.anInt4943;
			Static637.anInt9833 = Static390.aClass182_1.anInt4939;
			Static363.aFloat151 = Static390.aClass182_1.aFloat113;
			Static142.anInt5232 = Static390.aClass182_1.anInt4934;
			Static406.aFloat156 = Static390.aClass182_1.aFloat116;
			Static587.aFloat192 = Static390.aClass182_1.aFloat115;
		} else {
			@Pc(60) int local60 = (Static56.anInt1424 << 8) / Static151.anInt2843;
			@Pc(65) int local65 = 255 - local60;
			@Pc(70) float local70 = (float) local60 / 255.0F;
			@Pc(75) float local75 = 1.0F - local70;
			Static142.anInt5232 = (local65 * (Static390.aClass182_1.anInt4934 & 0xFF00) + (Static257.anInt4846 & 0xFF00) * local60 & 0xFF0000) + (local60 * (Static257.anInt4846 & 0xFF00FF) + (local65 * (Static390.aClass182_1.anInt4934 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static363.aFloat151 = (Static390.aClass182_1.aFloat113 - Static77.aFloat66) * local75 + Static77.aFloat66;
			Static587.aFloat192 = Static227.aFloat85 + (Static390.aClass182_1.aFloat115 - Static227.aFloat85) * local75;
			Static530.aFloat189 = local75 * (Static390.aClass182_1.aFloat117 - Static101.aFloat69) + Static101.aFloat69;
			Static637.anInt9833 = (local65 * (Static390.aClass182_1.anInt4939 & 0xFF00FF) + (Static305.anInt5571 & 0xFF00FF) * local60 & 0xFF00FF00) + ((Static305.anInt5571 & 0xFF00) * local60 + (Static390.aClass182_1.anInt4939 & 0xFF00) * local65 & 0xFF0000) >>> 8;
			Static102.aFloat70 = Static383.aFloat154 + (Static390.aClass182_1.aFloat112 - Static383.aFloat154) * local75;
			Static623.aFloat188 = local75 * (Static390.aClass182_1.aFloat114 - Static567.aFloat191) + Static567.aFloat191;
			Static406.aFloat156 = Static447.aFloat176 + local75 * (Static390.aClass182_1.aFloat116 - Static447.aFloat176);
			Static256.anInt4826 = Static390.aClass182_1.anInt4943 * local65 + local60 * Static617.anInt9568 >> 8;
			if (Static390.aClass182_1.aClass106_3 != Static406.aClass106_4) {
				Static56.aClass106_1 = Static355.aClass16_6.method8158(Static406.aClass106_4, Static390.aClass182_1.aClass106_3, local75, Static56.aClass106_1);
			}
		}
		Static352.aLong163 = local7;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method8443() {
		@Pc(1) Class279 local1 = Static415.aClass279_37;
		synchronized (Static415.aClass279_37) {
			Static415.aClass279_37.method6637();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg2 && arg6 == arg7 && arg4 == arg1 && arg0 == arg3) {
			Static424.method6045(arg8, arg3, arg4, arg5, arg6);
			return;
		}
		@Pc(39) int local39 = arg5;
		@Pc(41) int local41 = arg6;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg7 * 3;
		@Pc(61) int local61 = arg1 * 3;
		@Pc(65) int local65 = arg0 * 3;
		@Pc(75) int local75 = local53 + arg4 - arg5 - local61;
		@Pc(84) int local84 = arg3 + local57 - arg6 - local65;
		@Pc(94) int local94 = local45 + local61 - local53 - local53;
		@Pc(103) int local103 = local49 + local65 - local57 - local57;
		@Pc(108) int local108 = local53 - local45;
		@Pc(113) int local113 = local57 - local49;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local129 * local75;
			@Pc(137) int local137 = local84 * local129;
			@Pc(141) int local141 = local123 * local94;
			@Pc(145) int local145 = local103 * local123;
			@Pc(149) int local149 = local108 * local115;
			@Pc(153) int local153 = local113 * local115;
			@Pc(163) int local163 = arg5 + (local149 + local141 + local133 >> 12);
			@Pc(174) int local174 = arg6 + (local153 + local137 + local145 >> 12);
			Static424.method6045(arg8, local174, local163, local39, local41);
			local39 = local163;
			local41 = local174;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static262.aBoolean400 = true;
		Static340.aBoolean474 = Static486.aClass16_8.method8130() > 0;
		Static281.aBoolean409 = true;
		Static177.anInt3330 = arg1 >> Static436.anInt7634;
		Static227.anInt4358 = arg3 >> Static436.anInt7634;
		Static356.anInt6401 = arg1;
		Static6.anInt89 = arg3;
		Static245.anInt4579 = arg2;
		Static518.anInt8668 = Static177.anInt3330 - Static641.anInt9890;
		if (Static518.anInt8668 < 0) {
			Static461.anInt7919 = -Static518.anInt8668;
			Static518.anInt8668 = 0;
		} else {
			Static461.anInt7919 = 0;
		}
		Static664.anInt6954 = Static227.anInt4358 - Static641.anInt9890;
		if (Static664.anInt6954 < 0) {
			Static470.anInt8030 = -Static664.anInt6954;
			Static664.anInt6954 = 0;
		} else {
			Static470.anInt8030 = 0;
		}
		Static426.anInt7220 = Static177.anInt3330 + Static641.anInt9890;
		if (Static426.anInt7220 > Static410.anInt6962) {
			Static426.anInt7220 = Static410.anInt6962;
		}
		Static507.anInt8481 = Static227.anInt4358 + Static641.anInt9890;
		if (Static507.anInt8481 > Static315.anInt5894) {
			Static507.anInt8481 = Static315.anInt5894;
		}
		@Pc(72) boolean[][] local72 = Static569.aBooleanArrayArray6;
		@Pc(74) boolean[][] local74 = Static452.aBooleanArrayArray4;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static281.aBoolean409) {
			for (local78 = 0; local78 < Static641.anInt9890 + Static641.anInt9890 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static641.anInt9890 + Static641.anInt9890 + 2; local85++) {
					if (local85 > 1) {
						Static419.anIntArray443[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static177.anInt3330 + local78 - Static641.anInt9890;
					@Pc(109) int local109 = Static227.anInt4358 + local85 - Static641.anInt9890;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static410.anInt6962 && local109 < Static315.anInt5894) {
						local123 = local103 << Static436.anInt7634;
						@Pc(127) int local127 = local109 << Static436.anInt7634;
						@Pc(144) int local144 = Static239.aClass104Array1[Static239.aClass104Array1.length - 1].method8279(local109, local103) - (0x3E8 << Static436.anInt7634 - 7);
						@Pc(166) int local166 = Static605.aClass104Array3 == null ? Static239.aClass104Array1[0].method8279(local109, local103) + Static10.anInt118 : Static605.aClass104Array3[0].method8279(local109, local103) + Static10.anInt118;
						local83 = arg15 >= 0 ? Static486.aClass16_8.r(local123, local144, local127, local123, local166, local127, arg15) : Static486.aClass16_8.JA(local123, local144, local127, local123, local166, local127);
						Static452.aBooleanArrayArray4[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static452.aBooleanArrayArray4[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static419.anIntArray443[local85 - 1] & Static419.anIntArray443[local85] & local81 & local83;
						Static569.aBooleanArrayArray6[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static419.anIntArray443[Static641.anInt9890 + Static641.anInt9890] = local81;
				Static419.anIntArray443[Static641.anInt9890 + Static641.anInt9890 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static262.aBoolean400 = false;
			} else {
				Static641.anIntArray640 = arg5;
				Static400.anIntArray427 = arg6;
				Static158.anIntArray194 = arg7;
				Static122.anIntArray155 = arg8;
				Static269.anIntArray333 = arg9;
				Static374.method5524(Static486.aClass16_8, arg10);
			}
		} else {
			if (Static588.aBooleanArrayArray7 == null) {
				Static588.aBooleanArrayArray7 = new boolean[Static410.anInt6962 + Static410.anInt6962 + 1][Static315.anInt5894 + Static410.anInt6962 + 1];
			}
			for (local78 = 0; local78 < Static588.aBooleanArrayArray7.length; local78++) {
				for (local81 = 0; local81 < Static588.aBooleanArrayArray7[0].length; local81++) {
					Static588.aBooleanArrayArray7[local78][local81] = true;
				}
			}
			Static452.aBooleanArrayArray4 = Static588.aBooleanArrayArray7;
			Static569.aBooleanArrayArray6 = Static588.aBooleanArrayArray7;
			Static518.anInt8668 = 0;
			Static664.anInt6954 = 0;
			Static426.anInt7220 = Static410.anInt6962;
			Static507.anInt8481 = Static315.anInt5894;
			Static262.aBoolean400 = false;
		}
		Static497.method7094(Static486.aClass16_8);
		if (!Static52.aClass211_2.aBoolean459) {
			@Pc(349) Class105 local349 = Static52.aClass211_2.aClass105_7;
			for (@Pc(354) Class23_Sub6 local354 = (Class23_Sub6) local349.method2444(); local354 != null; local354 = (Class23_Sub6) local349.method2448()) {
				local354.method8588();
				Static305.method4702(local354);
			}
		}
		if (Static340.aBoolean474) {
			for (local78 = 0; local78 < Static379.anInt9747; local78++) {
				Static135.aClass119Array1[local78].method2745(arg14, arg0);
			}
		}
		if (Static284.aBoolean410) {
			Static99.anIntArray140 = Static486.aClass16_8.Y();
			Static486.aClass16_8.K(Static226.anIntArray405);
			local78 = (Static226.anIntArray405[2] - Static226.anIntArray405[0]) / Static189.anInt7974;
			for (local81 = 0; local81 < Static189.anInt7974 - 1; local81++) {
				Static59.anIntArray65[local81] = local78 * (local81 + 1) + Static221.anIntArray277[local81];
			}
			for (local83 = 0; local83 < Static49.aClass392Array1.length; local83++) {
				Static49.aClass392Array1[local83].method8683();
			}
		}
		if (Static618.aClass247ArrayArrayArray3 != null) {
			if (Static284.aBoolean410) {
				Static299.method4639(0);
			}
			Static95.method1889(true);
			Static486.aClass16_8.ra(-1, 1583160, 40, 127);
			Static151.method2609(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static284.aBoolean410) {
				Static649.method8506();
			}
			Static486.aClass16_8.pa();
			Static95.method1889(false);
		}
		Static151.method2609(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static284.aBoolean410) {
			for (local78 = 0; local78 < Static373.anInt6613; local78++) {
				Static120.aBooleanArrayArrayArray1[local78] = Static252.aBooleanArrayArrayArray2[local78];
			}
			Static299.method4639(0);
			for (local81 = 0; local81 < Static49.aClass392Array1.length; local81++) {
				Static49.aClass392Array1[local81].method8683();
			}
		}
		if (Static284.aBoolean410) {
			Static649.method8506();
			for (local78 = 0; local78 < Static373.anInt6613; local78++) {
				Static252.aBooleanArrayArrayArray2[local78] = Static120.aBooleanArrayArrayArray1[local78];
			}
			if (Static105.anInt2206 == 2) {
				@Pc(543) int local543;
				if (Static373.aLongArray14[0] < Static373.aLongArray14[1]) {
					if (Static59.anIntArray65[0] + Static221.anIntArray277[0] > Static226.anIntArray405[0]) {
						local543 = Static221.anIntArray277[0]++;
					}
				} else if (Static373.aLongArray14[0] > Static373.aLongArray14[1] && Static59.anIntArray65[0] + Static221.anIntArray277[0] < Static226.anIntArray405[2]) {
					local543 = Static221.anIntArray277[0]--;
				}
			}
		}
		if (!Static281.aBoolean409) {
			Static569.aBooleanArrayArray6 = local72;
			Static452.aBooleanArrayArray4 = local74;
		}
		Static249.method3944();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IBI)Z")
	public static boolean method8446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
