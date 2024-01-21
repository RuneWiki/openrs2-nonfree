import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!rb;")
	public static Class55 aClass55_21;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static int[] anIntArray172 = new int[100];

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!gd;")
	private static Class23 aClass23_774 = Static15.method178("To create a new account you need to");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_768 = aClass23_774;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_769 = Static15.method178("Konfig geladen)3");

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_770 = Static15.method178("Examine");

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_771 = Static15.method178("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_772 = Static15.method178("sideicons");

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_773 = aClass23_770;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
	public static int[] anIntArray173 = new int[50];

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_775 = Static15.method178(" x ");

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!gd;")
	public static Class23 aClass23_776 = Static15.method178("leuchten1:");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V")
	public static void method911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static19.aClass65_1.method1743(arg3, arg2, arg1);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(48) int local48;
		@Pc(64) int local64;
		if (local7 != 0) {
			local23 = Static19.aClass65_1.method1730(arg3, arg2, arg1, local7);
			local29 = local23 >> 6 & 0x3;
			@Pc(32) int[] local32 = Static31.aClass1_Sub1_Sub6_Sub1_2.anIntArray155;
			local48 = arg2 * 4 + 4 * 512 * (-arg1 + 103) + 24624;
			local52 = local23 & 0x1F;
			local54 = arg0;
			if (local7 > 0) {
				local54 = arg4;
			}
			local64 = local7 >> 14 & 0x7FFF;
			@Pc(68) Class1_Sub1_Sub4 local68 = Static97.method1645(local64);
			if (local68.anInt307 == -1) {
				if (local52 == 0 || local52 == 2) {
					if (local29 == 0) {
						local32[local48] = local54;
						local32[local48 + 512] = local54;
						local32[local48 + 1024] = local54;
						local32[local48 + 1536] = local54;
					} else if (local29 == 1) {
						local32[local48] = local54;
						local32[local48 + 1] = local54;
						local32[local48 + 2] = local54;
						local32[local48 + 3] = local54;
					} else if (local29 == 2) {
						local32[local48 + 3] = local54;
						local32[local48 + 3 + 512] = local54;
						local32[local48 + 1024 + 3] = local54;
						local32[local48 + 3 + 1536] = local54;
					} else if (local29 == 3) {
						local32[local48 + 1536] = local54;
						local32[local48 + 1 + 1536] = local54;
						local32[local48 + 2 + 1536] = local54;
						local32[local48 + 1536 + 3] = local54;
					}
				}
				if (local52 == 3) {
					if (local29 == 0) {
						local32[local48] = local54;
					} else if (local29 == 1) {
						local32[local48 + 3] = local54;
					} else if (local29 == 2) {
						local32[local48 + 1539] = local54;
					} else if (local29 == 3) {
						local32[local48 + 1536] = local54;
					}
				}
				if (local52 == 2) {
					if (local29 == 3) {
						local32[local48] = local54;
						local32[local48 + 512] = local54;
						local32[local48 + 1024] = local54;
						local32[local48 + 1536] = local54;
					} else if (local29 == 0) {
						local32[local48] = local54;
						local32[local48 + 1] = local54;
						local32[local48 + 2] = local54;
						local32[local48 + 3] = local54;
					} else if (local29 == 1) {
						local32[local48 + 3] = local54;
						local32[local48 + 512 + 3] = local54;
						local32[local48 + 3 + 1024] = local54;
						local32[local48 + 1539] = local54;
					} else if (local29 == 2) {
						local32[local48 + 1536] = local54;
						local32[local48 + 1 + 1536] = local54;
						local32[local48 + 1536 + 2] = local54;
						local32[local48 + 3 + 1536] = local54;
					}
				}
			} else {
				@Pc(77) Class1_Sub1_Sub6_Sub3 local77 = Static75.aClass1_Sub1_Sub6_Sub3Array8[local68.anInt307];
				if (local77 != null) {
					@Pc(89) int local89 = (local68.anInt305 * 4 - local77.anInt1883) / 2;
					@Pc(100) int local100 = (local68.anInt299 * 4 - local77.anInt1878) / 2;
					local77.method1194(arg2 * 4 + local100 + 48, local89 + (48 - -((-local68.anInt305 + 104 + -arg1) * 4)));
				}
			}
		}
		local7 = Static19.aClass65_1.method1733(arg3, arg2, arg1);
		if (local7 != 0) {
			local54 = local7 >> 14 & 0x7FFF;
			local23 = Static19.aClass65_1.method1730(arg3, arg2, arg1, local7);
			local29 = local23 >> 6 & 0x3;
			@Pc(478) Class1_Sub1_Sub4 local478 = Static97.method1645(local54);
			local52 = local23 & 0x1F;
			@Pc(516) int local516;
			if (local478.anInt307 != -1) {
				@Pc(589) Class1_Sub1_Sub6_Sub3 local589 = Static75.aClass1_Sub1_Sub6_Sub3Array8[local478.anInt307];
				if (local589 != null) {
					local64 = (local478.anInt299 * 4 - local589.anInt1878) / 2;
					local516 = (local478.anInt305 * 4 - local589.anInt1883) / 2;
					local589.method1194(arg2 * 4 + local64 + 48, local516 + (-arg1 + 104 - local478.anInt305) * 4 + 48);
				}
			} else if (local52 == 9) {
				local48 = 15658734;
				if (local7 > 0) {
					local48 = 15597568;
				}
				@Pc(501) int[] local501 = Static31.aClass1_Sub1_Sub6_Sub1_2.anIntArray155;
				local516 = arg2 * 4 + (-(arg1 * 512) + 52736) * 4 + 24624;
				if (local29 == 0 || local29 == 2) {
					local501[local516 + 1536] = local48;
					local501[local516 + 1025] = local48;
					local501[local516 + 512 + 2] = local48;
					local501[local516 + 3] = local48;
				} else {
					local501[local516] = local48;
					local501[local516 + 1 + 512] = local48;
					local501[local516 + 2 + 1024] = local48;
					local501[local516 + 3 + 1536] = local48;
				}
			}
		}
		local7 = Static19.aClass65_1.method1762(arg3, arg2, arg1);
		if (local7 == 0) {
			return;
		}
		local23 = local7 >> 14 & 0x7FFF;
		@Pc(656) Class1_Sub1_Sub4 local656 = Static97.method1645(local23);
		if (local656.anInt307 == -1) {
			return;
		}
		@Pc(665) Class1_Sub1_Sub6_Sub3 local665 = Static75.aClass1_Sub1_Sub6_Sub3Array8[local656.anInt307];
		if (local665 != null) {
			@Pc(678) int local678 = (local656.anInt305 * 4 - local665.anInt1883) / 2;
			local54 = (local656.anInt299 * 4 - local665.anInt1878) / 2;
			local665.method1194(arg2 * 4 + local54 + 48, local678 + 48 + (-arg1 + 104 - local656.anInt305) * 4);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!fa;)V")
	public static void method912(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anInt2231 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt2174 != -1 && arg0.anInt2174 < 32768) {
			@Pc(25) Class1_Sub1_Sub2_Sub1_Sub1 local25 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[arg0.anInt2174];
			if (local25 != null) {
				local34 = arg0.anInt2196 - local25.anInt2196;
				local41 = arg0.anInt2232 - local25.anInt2232;
				if (local34 != 0 || local41 != 0) {
					arg0.anInt2187 = (int) (Math.atan2((double) local34, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt2174 >= 32768) {
			local72 = arg0.anInt2174 - 32768;
			if (local72 == Static84.anInt2353) {
				local72 = 2047;
			}
			@Pc(81) Class1_Sub1_Sub2_Sub1_Sub2 local81 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local72];
			if (local81 != null) {
				local41 = arg0.anInt2196 - local81.anInt2196;
				@Pc(97) int local97 = arg0.anInt2232 - local81.anInt2232;
				if (local41 != 0 || local97 != 0) {
					arg0.anInt2187 = (int) (Math.atan2((double) local41, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2189 != 0 || arg0.anInt2181 != 0) && (arg0.anInt2195 == 0 || arg0.anInt2175 > 0)) {
			local34 = arg0.anInt2232 - (arg0.anInt2181 - Static107.anInt2745 - Static107.anInt2745) * 64;
			local72 = arg0.anInt2196 - (arg0.anInt2189 - Static104.anInt2684 - Static104.anInt2684) * 64;
			if (local72 != 0 || local34 != 0) {
				arg0.anInt2187 = (int) (Math.atan2((double) local72, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt2189 = 0;
			arg0.anInt2181 = 0;
		}
		local72 = arg0.anInt2187 - arg0.anInt2223 & 0x7FF;
		if (local72 == 0) {
			arg0.anInt2185 = 0;
			return;
		}
		arg0.anInt2185++;
		@Pc(216) boolean local216;
		if (local72 <= 1024) {
			arg0.anInt2223 += arg0.anInt2231;
			local216 = true;
			if (local72 < arg0.anInt2231 || 2048 - arg0.anInt2231 < local72) {
				arg0.anInt2223 = arg0.anInt2187;
				local216 = false;
			}
			if (arg0.anInt2225 == arg0.anInt2184 && (arg0.anInt2185 > 25 || local216)) {
				if (arg0.anInt2220 == -1) {
					arg0.anInt2184 = arg0.anInt2208;
				} else {
					arg0.anInt2184 = arg0.anInt2220;
				}
			}
		} else {
			local216 = true;
			arg0.anInt2223 -= arg0.anInt2231;
			if (arg0.anInt2231 > local72 || 2048 - arg0.anInt2231 < local72) {
				local216 = false;
				arg0.anInt2223 = arg0.anInt2187;
			}
			if (arg0.anInt2225 == arg0.anInt2184 && (arg0.anInt2185 > 25 || local216)) {
				if (arg0.anInt2211 == -1) {
					arg0.anInt2184 = arg0.anInt2208;
				} else {
					arg0.anInt2184 = arg0.anInt2211;
				}
			}
		}
		arg0.anInt2223 &= 0x7FF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ee;B)[I")
	public static int[] method913(@OriginalArg(0) Class1_Sub1_Sub7 arg0) {
		@Pc(16) int local16;
		if (arg0.anInt826 < 0) {
			local16 = arg0.anInt833 >> 16;
		} else {
			local16 = arg0.anInt826 >> 16;
		}
		if (!Static77.method1346(local16)) {
			return null;
		}
		@Pc(37) int local37 = arg0.anInt820;
		@Pc(40) int local40 = arg0.anInt833;
		@Pc(43) int local43 = arg0.anInt816;
		while (local40 != -1) {
			@Pc(53) Class1_Sub1_Sub7 local53 = Static105.aClass1_Sub1_Sub7ArrayArray1[local16][local40 & 0xFFFF];
			local37 += local53.anInt820 - local53.anInt822;
			local40 = local53.anInt833;
			local43 += local53.anInt816 - local53.anInt832;
		}
		return new int[] { local43, local37 };
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method914() {
		aClass23_768 = null;
		aClass23_776 = null;
		aClass23_770 = null;
		aClass23_769 = null;
		aClass23_774 = null;
		aClass23_773 = null;
		anIntArray173 = null;
		aClass23_775 = null;
		aClass55_21 = null;
		anIntArray172 = null;
		aClass23_772 = null;
		aClass23_771 = null;
	}
}
