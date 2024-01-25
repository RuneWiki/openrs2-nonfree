import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt9932;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!ih;")
	public static Class161 aClass161_3;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method8540() {
		if (Static97.aClass5_Sub25_8.aClass6_Sub12_1.method4024() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static96.anInt1932 - 4 & 0xFF);
		@Pc(23) int local23 = Static96.anInt1932 % Static326.anInt5541;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static448.anInt7637; local29++) {
				Static105.aByteArrayArrayArray3[local25][local23][local29] = local19;
			}
		}
		if (Static636.anInt10567 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static588.anIntArray559[local29] = -1000000;
			Static406.anIntArray376[local29] = 1000000;
			Static344.anIntArray323[local29] = 0;
			Static502.anIntArray485[local29] = 1000000;
			Static194.anIntArray188[local29] = 0;
		}
		@Pc(98) int local98 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
		@Pc(101) int local101 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
		@Pc(152) int local152;
		if (Static254.anInt4612 != 1 && Static304.anInt5319 == -1) {
			local152 = Static644.method9021(Static117.anInt2170, Static19.anInt277, Static636.anInt10567);
			if (local152 - Static441.anInt7550 < 3200 && (Static305.aByteArrayArrayArray18[Static636.anInt10567][Static19.anInt277 >> 9][Static117.anInt2170 >> 9] & 0x4) != 0) {
				Static531.method7861(Static117.anInt2170 >> 9, false, Static19.anInt277 >> 9, 1, Static421.aClass217ArrayArrayArray5);
				return;
			}
			return;
		}
		if (Static254.anInt4612 != 1) {
			local98 = Static304.anInt5319;
			local101 = Static396.anInt6606;
		}
		if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local98 >> 9][local101 >> 9] & 0x4) != 0) {
			Static531.method7861(local101 >> 9, false, local98 >> 9, 0, Static421.aClass217ArrayArrayArray5);
		}
		if (Static210.anInt4029 >= 2560) {
			return;
		}
		local152 = Static19.anInt277 >> 9;
		@Pc(156) int local156 = Static117.anInt2170 >> 9;
		@Pc(160) int local160 = local98 >> 9;
		@Pc(164) int local164 = local101 >> 9;
		@Pc(172) int local172;
		if (local160 > local152) {
			local172 = local160 - local152;
		} else {
			local172 = local152 - local160;
		}
		@Pc(191) int local191;
		if (local156 < local164) {
			local191 = local164 - local156;
		} else {
			local191 = local156 - local164;
		}
		if ((local172 != 0 || local191 != 0) && -Static326.anInt5541 < local172 && local172 < Static326.anInt5541 && local191 > -Static448.anInt7637 && Static448.anInt7637 > local191) {
			@Pc(259) int local259;
			@Pc(261) int local261;
			if (local172 <= local191) {
				local259 = local172 * 65536 / local191;
				local261 = 32768;
				while (local164 != local156) {
					if (local164 > local156) {
						local156++;
					} else if (local164 < local156) {
						local156--;
					}
					if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local152][local156] & 0x4) != 0) {
						Static531.method7861(local156, false, local152, 1, Static421.aClass217ArrayArrayArray5);
						return;
					}
					local261 += local259;
					if (local261 >= 65536) {
						if (local160 > local152) {
							local152++;
						} else if (local160 < local152) {
							local152--;
						}
						local261 -= 65536;
						if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local152][local156] & 0x4) != 0) {
							Static531.method7861(local156, false, local152, 1, Static421.aClass217ArrayArrayArray5);
							return;
						}
					}
				}
				return;
			}
			local259 = local191 * 65536 / local172;
			local261 = 32768;
			while (local160 != local152) {
				if (local152 < local160) {
					local152++;
				} else if (local160 < local152) {
					local152--;
				}
				if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local152][local156] & 0x4) != 0) {
					Static531.method7861(local156, false, local152, 1, Static421.aClass217ArrayArrayArray5);
					return;
				}
				local261 += local259;
				if (local261 >= 65536) {
					local261 -= 65536;
					if (local164 > local156) {
						local156++;
					} else if (local164 < local156) {
						local156--;
					}
					if ((Static305.aByteArrayArrayArray18[Static636.anInt10567][local152][local156] & 0x4) != 0) {
						Static531.method7861(local156, false, local152, 1, Static421.aClass217ArrayArrayArray5);
						return;
					}
				}
			}
			return;
		}
		Static524.method7740(null, "RC: " + local152 + "," + local156 + " " + local160 + "," + local164 + " " + Static565.anInt9560 + "," + Static567.anInt9589);
		return;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	public static void method8541() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static326.anInt5541; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static448.anInt7637; local13++) {
				if (Static531.method7861(local13, true, local9, local7, Static421.aClass217ArrayArrayArray5)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	public static int method8543(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method8545() {
		Static295.method4600();
		Static17.aClass130_1 = null;
		Static20.aClass48ArrayArray1 = null;
		Static625.aClass130_4 = null;
		Static550.aClass133_14 = null;
		Static575.aClass130_3 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method8546(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		@Pc(10) boolean local10 = false;
		if (arg0.anInt1249 == Static631.anInt10493 || arg0.anInt1277 == -1 || arg0.anInt1271 != 0) {
			local10 = true;
		} else {
			@Pc(31) Class362 local31 = Static435.aClass298_1.method7034(arg0.anInt1277);
			if (local31.aBoolean718 || arg0.anInt1201 + 1 > local31.anIntArray573[arg0.anInt1223]) {
				local10 = true;
			}
		}
		if (local10) {
			@Pc(55) int local55 = arg0.anInt1249 - arg0.anInt1237;
			@Pc(60) int local60 = Static631.anInt10493 - arg0.anInt1237;
			@Pc(72) int local72 = arg0.anInt1209 * 512 + arg0.method1018() * 256;
			@Pc(85) int local85 = arg0.anInt1217 * 512 + arg0.method1018() * 256;
			@Pc(97) int local97 = arg0.anInt1270 * 512 + arg0.method1018() * 256;
			@Pc(108) int local108 = arg0.anInt1194 * 512 + arg0.method1018() * 256;
			arg0.anInt10231 = (local72 * (local55 - local60) + local97 * local60) / local55;
			arg0.anInt10229 = (local108 * local60 + local85 * (local55 - local60)) / local55;
		}
		arg0.anInt1279 = 0;
		if (arg0.anInt1254 == 0) {
			arg0.method1024(false, 8192);
		}
		if (arg0.anInt1254 == 1) {
			arg0.method1024(false, 12288);
		}
		if (arg0.anInt1254 == 2) {
			arg0.method1024(false, 0);
		}
		if (arg0.anInt1254 == 3) {
			arg0.method1024(false, 4096);
		}
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
	public static void method8547() {
		Static315.aClass87_172.method1801();
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
	public static void method8548(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(17, arg0);
		local8.method8961();
	}
}
