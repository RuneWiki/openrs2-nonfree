import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!al", name = "C", descriptor = "Lclient!vn;")
	public static Class308 aClass308_1;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	public static int anInt834;

	@OriginalMember(owner = "client!al", name = "P", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	public static int anInt833 = 0;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "I")
	public static int anInt836 = -1;

	@OriginalMember(owner = "client!al", name = "Q", descriptor = "[I")
	public static final int[] anIntArray33 = new int[8];

	@OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V")
	public static void method801() {
		if (Static362.aFloat128 < 1024.0F) {
			Static362.aFloat128 = 1024.0F;
		}
		while (Static443.aFloat151 >= 16384.0F) {
			Static443.aFloat151 -= 16384.0F;
		}
		if (Static362.aFloat128 > 3072.0F) {
			Static362.aFloat128 = 3072.0F;
		}
		while (Static443.aFloat151 < 0.0F) {
			Static443.aFloat151 += 16384.0F;
		}
		@Pc(37) int local37 = Static126.anInt3030 >> 7;
		@Pc(41) int local41 = Static180.anInt3880 >> 7;
		@Pc(47) int local47 = Static74.method1954(Static245.anInt4747, Static180.anInt3880, Static126.anInt3030);
		@Pc(49) int local49 = 0;
		@Pc(71) int local71;
		if (local37 > 3 && local41 > 3 && local37 < Static542.anInt9387 - 4 && Static36.anInt1324 - 4 > local41) {
			for (local71 = local37 - 4; local71 <= local37 + 4; local71++) {
				for (@Pc(76) int local76 = local41 - 4; local76 <= local41 + 4; local76++) {
					@Pc(79) int local79 = Static245.anInt4747;
					if (local79 < 3 && Static180.method3467(local71, local76)) {
						local79++;
					}
					@Pc(90) int local90 = 0;
					if (Static108.aClass118_Sub1_2.aByteArrayArrayArray13 != null && Static108.aClass118_Sub1_2.aByteArrayArrayArray13[local79] != null) {
						local90 = (Static108.aClass118_Sub1_2.aByteArrayArrayArray13[local79][local71][local76] & 0xFF) * 8;
					}
					@Pc(123) int local123 = local47 + local90 - Static290.aClass10Array7[local79].ba(local71, local76);
					if (local49 < local123) {
						local49 = local123;
					}
				}
			}
		}
		local71 = (local49 >> 0) * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (local71 > Static497.anInt8449) {
			Static497.anInt8449 += (local71 - Static497.anInt8449) / 24;
		} else if (Static497.anInt8449 > local71) {
			Static497.anInt8449 += (local71 - Static497.anInt8449) / 80;
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(II)[[[B")
	public static byte[][][] method802(@OriginalArg(0) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local20 >= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(68) int local68;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local68 = 0; local68 < arg0; local68++) {
				if (local23 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(102) int local102;
		for (local68 = 0; local68 < arg0; local68++) {
			for (local102 = 0; local102 < arg0; local102++) {
				if (local68 <= local102) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(143) int local143;
		for (local102 = arg0 - 1; local102 >= 0; local102--) {
			for (local143 = 0; local143 < arg0; local143++) {
				if (local102 <= local143) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(192) int local192;
		for (local143 = arg0 - 1; local143 >= 0; local143--) {
			for (local192 = 0; local192 < arg0; local192++) {
				if (local143 >> 1 >= local192) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(232) int local232;
		for (local192 = 0; local192 < arg0; local192++) {
			for (local232 = 0; local232 < arg0; local232++) {
				if (local18 >= 0 && local18 < local16.length) {
					if (local232 >= local192 << 1) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(287) int local287;
		for (local232 = 0; local232 < arg0; local232++) {
			for (local287 = arg0 - 1; local287 >= 0; local287--) {
				if (local287 <= local232 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(334) int local334;
		for (local287 = arg0 - 1; local287 >= 0; local287--) {
			for (local334 = arg0 - 1; local334 >= 0; local334--) {
				if (local287 << 1 <= local334) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(373) int local373;
		for (local334 = arg0 - 1; local334 >= 0; local334--) {
			for (local373 = arg0 - 1; local373 >= 0; local373--) {
				if (local373 <= local334 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(410) int local410;
		for (local373 = arg0 - 1; local373 >= 0; local373--) {
			for (local410 = 0; local410 < arg0; local410++) {
				if (local373 << 1 <= local410) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(453) int local453;
		for (local410 = 0; local410 < arg0; local410++) {
			for (local453 = 0; local453 < arg0; local453++) {
				if (local453 <= local410 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(492) int local492;
		for (local453 = 0; local453 < arg0; local453++) {
			for (local492 = arg0 - 1; local492 >= 0; local492--) {
				if (local492 >= local453 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(533) int local533;
		for (local492 = arg0 - 1; local492 >= 0; local492--) {
			for (local533 = 0; local533 < arg0; local533++) {
				if (local492 >> 1 <= local533) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(576) int local576;
		for (local533 = 0; local533 < arg0; local533++) {
			for (local576 = 0; local576 < arg0; local576++) {
				if (local576 <= local533 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(623) int local623;
		for (local576 = 0; local576 < arg0; local576++) {
			for (local623 = arg0 - 1; local623 >= 0; local623--) {
				if (local576 >> 1 <= local623) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(667) int local667;
		for (local623 = arg0 - 1; local623 >= 0; local623--) {
			for (local667 = arg0 - 1; local667 >= 0; local667--) {
				if (local623 << 1 >= local667) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(713) int local713;
		for (local667 = arg0 - 1; local667 >= 0; local667--) {
			for (local713 = arg0 - 1; local713 >= 0; local713--) {
				if (local667 >> 1 <= local713) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(760) int local760;
		for (local713 = arg0 - 1; local713 >= 0; local713--) {
			for (local760 = 0; local760 < arg0; local760++) {
				if (local713 << 1 >= local760) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(804) int local804;
		for (local760 = 0; local760 < arg0; local760++) {
			for (local804 = 0; local804 < arg0; local804++) {
				if (local760 >> 1 <= local804) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(847) int local847;
		for (local804 = 0; local804 < arg0; local804++) {
			for (local847 = arg0 - 1; local847 >= 0; local847--) {
				if (local804 << 1 >= local847) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(883) int local883;
		for (local847 = 0; local847 < arg0; local847++) {
			for (local883 = 0; local883 < arg0; local883++) {
				if (local883 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(928) int local928;
		for (local883 = 0; local883 < arg0; local883++) {
			for (local928 = 0; local928 < arg0; local928++) {
				if (local883 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(969) int local969;
		for (local928 = 0; local928 < arg0; local928++) {
			for (local969 = 0; local969 < arg0; local969++) {
				if (local969 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1014) int local1014;
		for (local969 = 0; local969 < arg0; local969++) {
			for (local1014 = 0; local1014 < arg0; local1014++) {
				if (local969 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1051) int local1051;
		for (local1014 = 0; local1014 < arg0; local1014++) {
			for (local1051 = 0; local1051 < arg0; local1051++) {
				if (local1014 - arg0 / 2 >= local1051) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1101) int local1101;
		for (local1051 = arg0 - 1; local1051 >= 0; local1051--) {
			for (local1101 = 0; local1101 < arg0; local1101++) {
				if (local1051 - arg0 / 2 >= local1101) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1155) int local1155;
		for (local1101 = arg0 - 1; local1101 >= 0; local1101--) {
			for (local1155 = arg0 - 1; local1155 >= 0; local1155--) {
				if (local1101 - arg0 / 2 >= local1155) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1202) int local1202;
		for (local1155 = 0; local1155 < arg0; local1155++) {
			for (local1202 = arg0 - 1; local1202 >= 0; local1202--) {
				if (local1202 <= local1155 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1247) int local1247;
		for (local1202 = 0; local1202 < arg0; local1202++) {
			for (local1247 = 0; local1247 < arg0; local1247++) {
				if (local1247 >= local1202 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1293) int local1293;
		for (local1247 = arg0 - 1; local1247 >= 0; local1247--) {
			for (local1293 = 0; local1293 < arg0; local1293++) {
				if (local1293 >= local1247 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1343) int local1343;
		for (local1293 = arg0 - 1; local1293 >= 0; local1293--) {
			for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
				if (local1343 >= local1293 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		for (local1343 = 0; local1343 < arg0; local1343++) {
			for (@Pc(1392) int local1392 = arg0 - 1; local1392 >= 0; local1392--) {
				if (local1392 >= local1343 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V")
	public static void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static95.anInt2358 <= arg2 && arg2 <= Static299.anInt4491) {
			@Pc(19) int local19 = Static193.method3621(Static341.anInt6379, arg0, Static92.anInt2338);
			@Pc(25) int local25 = Static193.method3621(Static341.anInt6379, arg3, Static92.anInt2338);
			Static36.method1331(local25, local19, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
	public static void method804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static193.method3621(Static341.anInt6379, arg0, Static92.anInt2338);
		@Pc(17) int local17 = Static193.method3621(Static341.anInt6379, arg2, Static92.anInt2338);
		@Pc(23) int local23 = Static193.method3621(Static299.anInt4491, arg4, Static95.anInt2358);
		@Pc(29) int local29 = Static193.method3621(Static299.anInt4491, arg1, Static95.anInt2358);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static227.method7421(local23, arg3, local29, Static81.anIntArrayArray25[local31]);
		}
	}
}
