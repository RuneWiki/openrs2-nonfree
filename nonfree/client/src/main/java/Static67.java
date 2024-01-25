import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static631.aBoolean753 = true;
		Static348.aBoolean425 = Static517.aClass133_13.method7245() > 0;
		Static154.aBoolean202 = true;
		Static260.anInt4712 = arg1 >> Static115.anInt2156;
		Static598.anInt10044 = arg3 >> Static115.anInt2156;
		Static36.anInt575 = arg1;
		Static73.anInt6083 = arg3;
		Static213.anInt4045 = arg2;
		Static306.anInt5332 = Static260.anInt4712 - Static51.anInt1064;
		if (Static306.anInt5332 < 0) {
			Static20.anInt282 = -Static306.anInt5332;
			Static306.anInt5332 = 0;
		} else {
			Static20.anInt282 = 0;
		}
		Static177.anInt3154 = Static598.anInt10044 - Static51.anInt1064;
		if (Static177.anInt3154 < 0) {
			Static320.anInt5432 = -Static177.anInt3154;
			Static177.anInt3154 = 0;
		} else {
			Static320.anInt5432 = 0;
		}
		Static114.anInt2151 = Static260.anInt4712 + Static51.anInt1064;
		if (Static114.anInt2151 > Static357.anInt5961) {
			Static114.anInt2151 = Static357.anInt5961;
		}
		Static518.anInt8914 = Static598.anInt10044 + Static51.anInt1064;
		if (Static518.anInt8914 > Static429.anInt7422) {
			Static518.anInt8914 = Static429.anInt7422;
		}
		@Pc(72) boolean[][] local72 = Static475.aBooleanArrayArray8;
		@Pc(74) boolean[][] local74 = Static431.aBooleanArrayArray6;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static154.aBoolean202) {
			for (local78 = 0; local78 < Static51.anInt1064 + Static51.anInt1064 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static51.anInt1064 + Static51.anInt1064 + 2; local85++) {
					if (local85 > 1) {
						Static376.anIntArray345[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static260.anInt4712 + local78 - Static51.anInt1064;
					@Pc(109) int local109 = Static598.anInt10044 + local85 - Static51.anInt1064;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static357.anInt5961 && local109 < Static429.anInt7422) {
						local123 = local103 << Static115.anInt2156;
						@Pc(127) int local127 = local109 << Static115.anInt2156;
						@Pc(144) int local144 = Static20.aClass61Array2[Static20.aClass61Array2.length - 1].method8580(local109, local103) - (0x3E8 << Static115.anInt2156 - 7);
						@Pc(166) int local166 = Static456.aClass61Array3 == null ? Static20.aClass61Array2[0].method8580(local109, local103) + Static302.anInt5267 : Static456.aClass61Array3[0].method8580(local109, local103) + Static302.anInt5267;
						local83 = arg15 >= 0 ? Static517.aClass133_13.r(local123, local144, local127, local123, local166, local127, arg15) : Static517.aClass133_13.JA(local123, local144, local127, local123, local166, local127);
						Static431.aBooleanArrayArray6[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static431.aBooleanArrayArray6[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static376.anIntArray345[local85 - 1] & Static376.anIntArray345[local85] & local81 & local83;
						Static475.aBooleanArrayArray8[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static376.anIntArray345[Static51.anInt1064 + Static51.anInt1064] = local81;
				Static376.anIntArray345[Static51.anInt1064 + Static51.anInt1064 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static631.aBoolean753 = false;
			} else {
				Static526.anIntArray496 = arg5;
				Static100.anIntArray123 = arg6;
				Static82.anIntArray115 = arg7;
				Static621.anIntArray590 = arg8;
				Static344.anIntArray324 = arg9;
				Static308.method6297(arg10, Static517.aClass133_13);
			}
		} else {
			if (Static59.aBooleanArrayArray1 == null) {
				Static59.aBooleanArrayArray1 = new boolean[Static357.anInt5961 + Static357.anInt5961 + 1][Static429.anInt7422 + Static357.anInt5961 + 1];
			}
			for (local78 = 0; local78 < Static59.aBooleanArrayArray1.length; local78++) {
				for (local81 = 0; local81 < Static59.aBooleanArrayArray1[0].length; local81++) {
					Static59.aBooleanArrayArray1[local78][local81] = true;
				}
			}
			Static431.aBooleanArrayArray6 = Static59.aBooleanArrayArray1;
			Static475.aBooleanArrayArray8 = Static59.aBooleanArrayArray1;
			Static306.anInt5332 = 0;
			Static177.anInt3154 = 0;
			Static114.anInt2151 = Static357.anInt5961;
			Static518.anInt8914 = Static429.anInt7422;
			Static631.aBoolean753 = false;
		}
		Static87.method1419(Static517.aClass133_13);
		if (!Static348.aClass155_3.aBoolean308) {
			@Pc(349) Class99 local349 = Static348.aClass155_3.aClass99_4;
			for (@Pc(354) Class4_Sub6 local354 = (Class4_Sub6) local349.method2045(); local354 != null; local354 = (Class4_Sub6) local349.method2047()) {
				local354.method8713();
				Static87.method1410(local354);
			}
		}
		if (Static348.aBoolean425) {
			for (local78 = 0; local78 < Static461.anInt7766; local78++) {
				Static278.aClass174Array1[local78].method4175(arg0, arg14);
			}
		}
		if (Static576.aBoolean696) {
			Static547.anIntArray508 = Static517.aClass133_13.Y();
			Static517.aClass133_13.K(Static455.anIntArray416);
			local78 = (Static455.anIntArray416[2] - Static455.anIntArray416[0]) / Static645.anInt10657;
			for (local81 = 0; local81 < Static645.anInt10657 - 1; local81++) {
				Static442.anIntArray407[local81] = local78 * (local81 + 1) + Static570.anIntArray529[local81];
			}
			for (local83 = 0; local83 < Static56.aClass220Array1.length; local83++) {
				Static56.aClass220Array1[local83].method4930();
			}
		}
		if (Static61.aClass217ArrayArrayArray6 != null) {
			if (Static576.aBoolean696) {
				Static535.method7889(0);
			}
			Static350.method8738(true);
			Static517.aClass133_13.ra(-1, 1583160, 40, 127);
			Static357.method5307(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static576.aBoolean696) {
				Static578.method4160();
			}
			Static517.aClass133_13.pa();
			Static350.method8738(false);
		}
		Static357.method5307(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static576.aBoolean696) {
			for (local78 = 0; local78 < Static68.anInt1380; local78++) {
				Static557.aBooleanArrayArrayArray2[local78] = Static448.aBooleanArrayArrayArray1[local78];
			}
			Static535.method7889(0);
			for (local81 = 0; local81 < Static56.aClass220Array1.length; local81++) {
				Static56.aClass220Array1[local81].method4930();
			}
		}
		if (Static576.aBoolean696) {
			Static578.method4160();
			for (local78 = 0; local78 < Static68.anInt1380; local78++) {
				Static448.aBooleanArrayArrayArray1[local78] = Static557.aBooleanArrayArrayArray2[local78];
			}
			if (Static106.anInt2025 == 2) {
				@Pc(543) int local543;
				if (Static631.aLongArray17[0] < Static631.aLongArray17[1]) {
					if (Static442.anIntArray407[0] + Static570.anIntArray529[0] > Static455.anIntArray416[0]) {
						local543 = Static570.anIntArray529[0]++;
					}
				} else if (Static631.aLongArray17[0] > Static631.aLongArray17[1] && Static442.anIntArray407[0] + Static570.anIntArray529[0] < Static455.anIntArray416[2]) {
					local543 = Static570.anIntArray529[0]--;
				}
			}
		}
		if (!Static154.aBoolean202) {
			Static475.aBooleanArrayArray8 = local72;
			Static431.aBooleanArrayArray6 = local74;
		}
		Static564.method8213();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)Z")
	public static boolean method1107(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!ov;ILclient!vga;I)V")
	public static void method1108(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		if (Static44.anInt945 >= 50 || (arg2 == null || arg2.anIntArrayArray70 == null || arg2.anIntArrayArray70.length <= arg1 || arg2.anIntArrayArray70[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArrayArray70[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg2.anIntArrayArray70[arg1].length > 1) {
			local61 = (int) (Math.random() * (double) arg2.anIntArrayArray70[arg1].length);
			if (local61 > 0) {
				local36 = arg2.anIntArrayArray70[arg1][local61];
			}
		}
		@Pc(77) int local77 = local32 & 0x1F;
		local61 = 256;
		if (arg2.anIntArray568 != null && arg2.anIntArray572 != null) {
			local61 = (int) (Math.random() * (double) (arg2.anIntArray572[arg1] - arg2.anIntArray568[arg1])) + arg2.anIntArray568[arg1];
		}
		@Pc(120) int local120 = arg2.anIntArray570 == null ? 255 : arg2.anIntArray570[arg1];
		if (local77 == 0) {
			if (arg0 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2) {
				if (!arg2.aBoolean720) {
					Static443.method6696(local120, 0, local36, local61, local42);
					return;
				}
				Static492.method7225(0, local61, local120, local36, local42, false);
			}
		} else if (Static97.aClass5_Sub25_8.aClass6_Sub18_4.method5120() != 0) {
			@Pc(163) int local163 = arg0.anInt10231 - 256 >> 9;
			@Pc(170) int local170 = arg0.anInt10229 - 256 >> 9;
			@Pc(191) int local191 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == arg0 ? 0 : local77 + (arg0.aByte132 << 24) + (local163 << 16) + (local170 << 8);
			Static13.aClass166Array1[Static44.anInt945++] = new Class166((byte) (arg2.aBoolean720 ? 2 : 1), local36, local42, 0, local120, local191, local61, arg0);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
	public static void method1109() {
		try {
			@Pc(18) int local18;
			if (Static72.anInt1497 == 1) {
				local18 = Static404.aClass5_Sub1_Sub5_2.method8320();
				if (local18 > 0 && Static404.aClass5_Sub1_Sub5_2.method8295()) {
					local18 -= Static172.anInt3051;
					if (local18 < 0) {
						local18 = 0;
					}
					Static404.aClass5_Sub1_Sub5_2.method8316(local18);
					return;
				}
				Static404.aClass5_Sub1_Sub5_2.method8318();
				Static404.aClass5_Sub1_Sub5_2.method8309();
				Static189.aClass219_2 = null;
				Static171.aClass5_Sub49_1 = null;
				if (Static217.aClass207_53 == null) {
					Static72.anInt1497 = 0;
				} else {
					Static72.anInt1497 = 2;
				}
			}
			if (Static72.anInt1497 == 3) {
				local18 = Static404.aClass5_Sub1_Sub5_2.method8320();
				if (local18 < Static522.anInt8987 && Static404.aClass5_Sub1_Sub5_2.method8295()) {
					local18 += Static55.anInt1103;
					if (local18 > Static522.anInt8987) {
						local18 = Static522.anInt8987;
					}
					Static404.aClass5_Sub1_Sub5_2.method8316(local18);
				} else {
					Static55.anInt1103 = 0;
					Static72.anInt1497 = 0;
				}
			}
		} catch (@Pc(97) Exception local97) {
			local97.printStackTrace();
			Static404.aClass5_Sub1_Sub5_2.method8318();
			Static72.anInt1497 = 0;
			Static171.aClass5_Sub49_1 = null;
			Static591.aClass5_Sub1_Sub5_4 = null;
			Static189.aClass219_2 = null;
			Static217.aClass207_53 = null;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class133 arg4) {
		arg4.KA(arg3, arg2, arg3 + arg0, arg2 - -arg1);
		arg4.method7251(arg0, arg1, -16777216, arg2, arg3);
		if (Static353.anInt5917 < 100) {
			return;
		}
		@Pc(37) float local37 = (float) Static620.anInt8204 / (float) Static620.anInt8201;
		@Pc(39) int local39 = arg0;
		@Pc(41) int local41 = arg1;
		if (local37 < 1.0F) {
			local41 = (int) (local37 * (float) arg0);
		} else {
			local39 = (int) ((float) arg1 / local37);
		}
		@Pc(67) int local67 = arg2 + (arg1 - local41) / 2;
		@Pc(76) int local76 = arg3 + (arg0 - local39) / 2;
		if (Static390.aClass28_11 == null || arg0 != Static390.aClass28_11.method4032() || arg1 != Static390.aClass28_11.method4037()) {
			Static620.method7141(Static620.anInt8206, Static620.anInt8204 + Static620.anInt8210, Static620.anInt8206 - -Static620.anInt8201, Static620.anInt8210, local76, local67, local39 + local76, local67 + local41);
			Static620.method7133(arg4);
			Static390.aClass28_11 = arg4.method7258(local76, local67, local39, local41, false);
		}
		Static390.aClass28_11.method4040(local76, local67);
		@Pc(128) int local128 = local39 * Static511.anInt8846 / Static620.anInt8201;
		@Pc(134) int local134 = local41 * Static469.anInt7883 / Static620.anInt8204;
		@Pc(142) int local142 = local76 + local39 * Static291.anInt5082 / Static620.anInt8201;
		@Pc(157) int local157 = local67 + local41 - local134 - Static586.anInt9840 * local41 / Static620.anInt8204;
		@Pc(159) int local159 = -1996554240;
		if (Static265.aClass63_4 == Static156.aClass63_2) {
			local159 = -1996488705;
		}
		arg4.aa(local142, local157, local128, local134, local159, 1);
		arg4.method7279(local142, local157, local128, local134, local159, 0);
		if (Static248.anInt4508 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static374.anInt6199 > 50) {
			local195 = (100 - Static374.anInt6199) * 5;
		} else {
			local195 = Static374.anInt6199 * 5;
		}
		for (@Pc(206) Class5_Sub26 local206 = (Class5_Sub26) Static620.aClass330_46.method7908(); local206 != null; local206 = (Class5_Sub26) Static620.aClass330_46.method7914()) {
			@Pc(214) Class299 local214 = Static620.aClass42_4.method937(local206.anInt4151);
			if (Static258.method4238(local214)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (local206.anInt4151 == Static165.anInt10647) {
					local247 = local39 * local206.anInt4153 / Static620.anInt8201 + local76;
					local259 = local67 + (Static620.anInt8204 - local206.anInt4154) * local41 / Static620.anInt8204;
					arg4.method7251(4, 4, local195 << 24 | 0xFFFF00, local259 - 2, local247 + -2);
				} else if (Static555.anInt9372 != -1 && Static555.anInt9372 == local214.anInt8121) {
					local247 = local76 + local39 * local206.anInt4153 / Static620.anInt8201;
					local259 = (Static620.anInt8204 - local206.anInt4154) * local41 / Static620.anInt8204 + local67;
					arg4.method7251(4, 4, local195 << 24 | 0xFFFF00, local259 - 2, local247 + -2);
				}
			}
		}
	}
}
