import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt5938;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!hd;")
	public static final Class145 aClass145_9 = new Class145(2);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5051(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(18) int local18 = Static144.method2390(arg0, arg1);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1.charAt(local33) != arg0; local33++) {
			}
			local23[local25++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg1.substring(local27);
		return local23;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIIII)V")
	public static void method5053(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(17) Class19_Sub10 local17 = (Class19_Sub10) Static209.aClass66_3.method1381(); local17 != null; local17 = (Class19_Sub10) Static209.aClass66_3.method1380()) {
			if (local17.anInt10013 <= Static269.anInt4883) {
				local17.method9359();
			} else {
				Static186.method2831(arg0 >> 1, local17.anInt10019 * 2, arg2 >> 1, (local17.anInt10015 << 9) + 256, local17.anInt10012, (local17.anInt10016 << 9) + 256);
				Static427.aClass44_34.method8119(local17.aString124, -9902, -16777216 | local17.anInt10018, Static335.anIntArray331[0] + arg3, 0, Static335.anIntArray331[1] + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg3;
		@Pc(21) int local21 = arg1 - arg3;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg1 - 1);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(153) int[] local153 = Static384.anIntArrayArray38[arg0];
		Static482.method7040(arg6, arg4 - arg2, local153, arg4 - local16);
		Static482.method7040(arg5, arg4 - local16, local153, arg4 + local16);
		Static482.method7040(arg6, local16 + arg4, local153, arg4 + arg2);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local135;
					local117 += local105;
					local7++;
					local135 += local105;
				}
			}
			if (local198) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local143;
						local88 += local127;
						local143 += local113;
						local11++;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local88 += local127;
					local143 += local113;
					local11++;
					local127 += local113;
				}
				local97 += -local133;
				local88 += -local149;
				local149 -= local109;
				local133 -= local109;
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local135;
				local117 += local105;
				local7++;
				local135 += local105;
			}
			local70 += -local141;
			local79 += -local123;
			local9--;
			local141 -= local101;
			local123 -= local101;
			@Pc(349) int local349 = arg0 - local9;
			@Pc(353) int local353 = local9 + arg0;
			@Pc(357) int local357 = local7 + arg4;
			@Pc(362) int local362 = arg4 - local7;
			if (local198) {
				@Pc(388) int local388 = local11 + arg4;
				@Pc(393) int local393 = arg4 - local11;
				Static482.method7040(arg6, local362, Static384.anIntArrayArray38[local349], local393);
				Static482.method7040(arg5, local393, Static384.anIntArrayArray38[local349], local388);
				Static482.method7040(arg6, local388, Static384.anIntArrayArray38[local349], local357);
				Static482.method7040(arg6, local362, Static384.anIntArrayArray38[local353], local393);
				Static482.method7040(arg5, local393, Static384.anIntArrayArray38[local353], local388);
				Static482.method7040(arg6, local388, Static384.anIntArrayArray38[local353], local357);
			} else {
				Static482.method7040(arg6, local362, Static384.anIntArrayArray38[local349], local357);
				Static482.method7040(arg6, local362, Static384.anIntArrayArray38[local353], local357);
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)I")
	public static int method5055(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
	public static int method5056() {
		if (Static509.aClass20_16 == null) {
			if (!Static555.aBoolean678 && Static693.aClass3_Sub4_Sub5_4 != null) {
				return Static693.aClass3_Sub4_Sub5_4.anInt2774;
			}
			@Pc(27) int local27 = Static714.aClass161_1.method8581();
			@Pc(31) int local31 = Static714.aClass161_1.method8573();
			@Pc(55) int local55;
			@Pc(57) int local57;
			@Pc(75) int local75;
			@Pc(150) Class3_Sub4_Sub5 local150;
			if (Static367.aBoolean490) {
				@Pc(279) Class54 local279;
				if (local27 > Static121.anInt2335 && local27 < Static655.anInt10491 + Static121.anInt2335) {
					local55 = -1;
					for (local57 = 0; local57 < Static332.anInt5826; local57++) {
						if (Static470.aBoolean628) {
							local75 = local57 * 16 + Static65.anInt1025 + 33;
							if (local31 > local75 - 13 && local31 <= local75 + 3) {
								local55 = local57;
							}
						} else {
							local75 = Static65.anInt1025 + local57 * 16 + 31;
							if (local31 > local75 - 13 && local31 <= local75 + 3) {
								local55 = local57;
							}
						}
					}
					if (local55 != -1) {
						local75 = 0;
						local279 = new Class54(Static555.aClass283_12);
						for (@Pc(284) Class3_Sub4_Sub17 local284 = (Class3_Sub4_Sub17) local279.method1077(); local284 != null; local284 = (Class3_Sub4_Sub17) local279.method1074()) {
							if (local75++ == local55) {
								return ((Class3_Sub4_Sub5) local284.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66).anInt2774;
							}
						}
					}
				} else if (Static239.aClass3_Sub4_Sub17_1 != null && local27 > Static614.anInt9938 && local27 < Static614.anInt9938 + Static618.anInt6014) {
					local55 = -1;
					for (local57 = 0; local57 < Static239.aClass3_Sub4_Sub17_1.anInt8611; local57++) {
						if (Static470.aBoolean628) {
							local75 = local57 * 16 + Static725.anInt11302 + 33;
							if (local75 - 13 < local31 && local31 <= local75 + 3) {
								local55 = local57;
							}
						} else {
							local75 = Static725.anInt11302 + local57 * 16 + 31;
							if (local31 > local75 - 13 && local31 <= local75 + 3) {
								local55 = local57;
							}
						}
					}
					if (local55 != -1) {
						local75 = 0;
						local279 = new Class54(Static239.aClass3_Sub4_Sub17_1.aClass283_10);
						for (local150 = (Class3_Sub4_Sub5) local279.method1077(); local150 != null; local150 = (Class3_Sub4_Sub5) local279.method1074()) {
							if (local75++ == local55) {
								return local150.anInt2774;
							}
						}
					}
				}
			} else if (local27 > Static121.anInt2335 && local27 < Static121.anInt2335 + Static655.anInt10491) {
				local55 = -1;
				for (local57 = 0; local57 < Static285.anInt5168; local57++) {
					if (Static470.aBoolean628) {
						local75 = (Static285.anInt5168 - local57 - 1) * 16 + Static65.anInt1025 + 33;
						if (local75 - 13 < local31 && local31 <= local75 + 3) {
							local55 = local57;
						}
					} else {
						local75 = (Static285.anInt5168 - local57 - 1) * 16 + Static65.anInt1025 + 31;
						if (local31 > local75 - 13 && local75 + 3 >= local31) {
							local55 = local57;
						}
					}
				}
				if (local55 != -1) {
					local75 = 0;
					@Pc(145) Class60 local145 = new Class60(Static562.aClass357_54);
					for (local150 = (Class3_Sub4_Sub5) local145.method1304(); local150 != null; local150 = (Class3_Sub4_Sub5) local145.method1305()) {
						if (local55 == local75++) {
							return local150.anInt2774;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5057(@OriginalArg(1) String arg0) {
		return Static518.method7385(arg0, 10);
	}
}
