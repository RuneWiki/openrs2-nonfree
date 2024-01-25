import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!jo;Lclient!pm;Lclient!ha;Z)V")
	public static void method580(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class3_Sub48 arg1, @OriginalArg(2) Class22 arg2) {
		@Pc(10) Class178 local10 = arg0.method4671(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(27) int local27 = local10.method7636();
		if (local10.method7618() > local27) {
			local27 = local10.method7618();
		}
		@Pc(39) int local39 = arg1.anInt8045;
		@Pc(42) int local42 = arg1.anInt8046;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(62) int local62;
		@Pc(85) int local85;
		if (arg0.aString62 != null) {
			local44 = Static286.aClass169_5.method3649((Class178[]) null, arg0.aString62, (int[]) null, Static486.aStringArray31);
			for (local62 = 0; local62 < local44; local62++) {
				@Pc(68) String local68 = Static486.aStringArray31[local62];
				if (local44 - 1 > local62) {
					local68 = local68.substring(0, local68.length() - 4);
				}
				local85 = Static720.aClass193_10.method4589(local68);
				if (local46 < local85) {
					local46 = local85;
				}
			}
			local48 = local44 * Static720.aClass193_10.method4590() + Static720.aClass193_10.method4592() / 2;
		}
		local62 = arg1.anInt8045 + local27 / 2;
		@Pc(120) int local120 = arg1.anInt8046;
		if (Static327.anInt1085 + local27 > local39) {
			local62 = local46 / 2 + local27 / 2 + Static327.anInt1085 + 15;
			local39 = Static327.anInt1085;
		} else if (local39 > Static327.anInt1075 - local27) {
			local39 = Static327.anInt1075 - local27;
			local62 = Static327.anInt1075 - local46 / 2 - local27 / 2 - 5 - 10;
		}
		if (local27 + Static327.anInt1081 > local42) {
			local120 = Static327.anInt1081 + local27 / 2 + 10;
			local42 = Static327.anInt1081;
		} else if (Static327.anInt1083 - local27 < local42) {
			local42 = Static327.anInt1083 - local27;
			local120 = Static327.anInt1083 - local48 - local27 / 2 - 10;
		}
		local85 = (int) (Math.atan2((double) (local39 - arg1.anInt8045), (double) (local42 - arg1.anInt8046)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7619((float) local27 / 2.0F + (float) local39, (float) local27 / 2.0F + (float) local42, 4096, local85);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg0.aString62 != null) {
			local265 = local120;
			local263 = local62 - local46 / 2 - 5;
			local267 = local46 + local263 + 10;
			local269 = local44 * Static720.aClass193_10.method4590() + local120 + 3;
			if (arg0.anInt5132 != 0) {
				arg2.method9378(local120, local263, arg0.anInt5132, local269 - local120, -local263 + local267);
			}
			if (arg0.anInt5144 != 0) {
				arg2.method9399(local267 - local263, local269 - local120, arg0.anInt5144, local263, local120);
			}
			for (@Pc(342) int local342 = 0; local342 < local44; local342++) {
				@Pc(348) String local348 = Static486.aStringArray31[local342];
				if (local44 - 1 > local342) {
					local348 = local348.substring(0, local348.length() - 4);
				}
				Static720.aClass193_10.method4588(arg2, local348, local62, local120, arg0.anInt5147);
				local120 += Static720.aClass193_10.method4590();
			}
		}
		if (arg0.anInt5156 == -1 && arg0.aString62 == null) {
			return;
		}
		@Pc(399) Class3_Sub10 local399 = new Class3_Sub10(arg1);
		local27 >>= 0x1;
		local399.anInt1314 = local269;
		local399.anInt1312 = local263;
		local399.anInt1315 = local39 + local27;
		local399.anInt1313 = local39 - local27;
		local399.anInt1310 = local267;
		local399.anInt1317 = local42 - local27;
		local399.anInt1318 = local42 + local27;
		local399.anInt1309 = local265;
		Static654.aClass342_80.method7654(local399);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method582() {
		Static49.anInt1325 = -1;
		Static314.anInt5069 = -1;
		Static599.method7699(0);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static497.anInt7926 >> 3; local18++) {
				for (local22 = 0; local22 < Static646.anInt9979 >> 3; local22++) {
					Static66.anIntArrayArrayArray1[local14][local18][local22] = -1;
				}
			}
		}
		@Pc(92) int local92;
		@Pc(95) int local95;
		@Pc(98) int local98;
		@Pc(101) int local101;
		@Pc(104) int local104;
		@Pc(107) int local107;
		@Pc(110) int local110;
		@Pc(167) int local167;
		for (@Pc(65) Class3_Sub35 local65 = (Class3_Sub35) Static160.aClass342_24.method7644(); local65 != null; local65 = (Class3_Sub35) Static160.aClass342_24.method7650()) {
			local22 = local65.anInt5464;
			@Pc(82) boolean local82 = (local22 & 0x1) == 1;
			@Pc(87) int local87 = local65.anInt5468 >> 3;
			local92 = local65.anInt5466 >> 3;
			local95 = local65.anInt5458;
			local98 = local65.anInt5459;
			local101 = local65.anInt5460;
			local104 = local65.anInt5463;
			local107 = local65.anInt5465;
			local110 = local65.anInt5454;
			@Pc(112) int local112 = 0;
			@Pc(114) int local114 = 0;
			@Pc(116) byte local116 = 1;
			@Pc(118) byte local118 = 1;
			if (local22 == 1) {
				local116 = -1;
				local114 = local107 - 1;
			} else if (local22 == 2) {
				local118 = -1;
				local114 = local107 - 1;
				local116 = -1;
				local112 = local110 - 1;
			} else if (local22 == 3) {
				local112 = local110 - 1;
				local118 = -1;
				local116 = 1;
			}
			@Pc(163) int local163 = local92;
			while (local163 < local92 + local110) {
				local167 = local114;
				@Pc(169) int local169 = local87;
				while (local87 + local107 > local169) {
					if (local82) {
						Static66.anIntArrayArrayArray1[local104][local112 + local95][local167 + local98] = (local169 << 14) + (local101 << 24) + (local163 << 3) + (local22 << 1);
					} else {
						Static66.anIntArrayArrayArray1[local104][local167 + local95][local112 + local98] = (local22 << 1) + (local101 << 24) + (local169 << 14) + (local163 << 3);
					}
					local169++;
					local167 += local116;
				}
				local163++;
				local112 += local118;
			}
		}
		@Pc(286) int local286 = Static309.anIntArrayArray22.length;
		Static22.anIntArray50 = new int[local286];
		Static223.anIntArray250 = null;
		Static169.aByteArrayArray3 = new byte[local286][];
		Static592.aByteArrayArray14 = new byte[local286][];
		Static469.anIntArray550 = new int[local286];
		Static699.aByteArrayArray23 = new byte[local286][];
		Static253.anIntArray292 = new int[local286];
		Static176.aByteArrayArray4 = new byte[local286][];
		Static385.anIntArray437 = new int[local286];
		Static266.anIntArray325 = new int[local286];
		Static186.aByteArrayArray5 = null;
		@Pc(319) int local319 = 0;
		for (@Pc(324) Class3_Sub35 local324 = (Class3_Sub35) Static160.aClass342_24.method7644(); local324 != null; local324 = (Class3_Sub35) Static160.aClass342_24.method7650()) {
			local92 = local324.anInt5468 >>> -418184669;
			local95 = local324.anInt5466 >>> 3;
			local98 = local324.anInt5465 + local92;
			if ((local98 & 0x7) == 0) {
				local98--;
			}
			local98 >>>= 0x3;
			local101 = local324.anInt5454 + local95;
			if ((local101 & 0x7) == 0) {
				local101--;
			}
			local101 >>>= 0x3;
			for (local104 = local92 >>> 3; local104 <= local98; local104++) {
				label82: for (local107 = local95 >>> 3; local107 <= local101; local107++) {
					local110 = local104 << 8 | local107;
					for (local167 = 0; local167 < local319; local167++) {
						if (Static385.anIntArray437[local167] == local110) {
							continue label82;
						}
					}
					Static385.anIntArray437[local319] = local110;
					Static266.anIntArray325[local319] = Static699.aClass182_127.method3978("m" + local104 + "_" + local107);
					Static22.anIntArray50[local319] = Static699.aClass182_127.method3978("l" + local104 + "_" + local107);
					Static253.anIntArray292[local319] = Static699.aClass182_127.method3978("um" + local104 + "_" + local107);
					Static469.anIntArray550[local319] = Static699.aClass182_127.method3978("ul" + local104 + "_" + local107);
					local319++;
				}
			}
		}
		Static297.anIntArrayArray21 = Static309.anIntArrayArray22;
		Static309.anIntArrayArray22 = null;
		Static326.method4755(Static497.anInt7926 >> 4, Static646.anInt9979 >> 4, false, 12);
	}
}
