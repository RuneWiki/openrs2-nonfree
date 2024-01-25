import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public static int anInt2796;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!em;IZ)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2) {
		Static361.anInt6115 = arg0;
		Static266.aClass68_11 = arg1;
		Static261.anInt4884 = arg2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V")
	public static void method2224(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 16);
		local13.method4545();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method2226() {
		if (Static12.aClass79_Sub1_1.method3962(Static399.anInt6653) != 2) {
			return;
		}
		@Pc(29) byte local29 = (byte) (Static356.anInt6044 - 4 & 0xFF);
		@Pc(33) int local33 = Static356.anInt6044 % Static229.anInt4427;
		@Pc(39) int local39;
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < Static379.anInt6422; local39++) {
				Static231.aByteArrayArrayArray9[local35][local33][local39] = local29;
			}
		}
		if (Static383.anInt6436 == 3) {
			return;
		}
		for (local39 = 0; local39 < 2; local39++) {
			Static195.anIntArray333[local39] = -1000000;
			Static236.anIntArray382[local39] = 1000000;
			Static245.anIntArray552[local39] = 0;
			Static434.anIntArray604[local39] = 1000000;
			Static217.anIntArray358[local39] = 0;
		}
		@Pc(98) int local98;
		if (Static159.anInt3195 != 1) {
			local98 = Static85.method1695(Static383.anInt6436, Static23.anInt567, Static364.anInt6270);
			if (local98 - Static355.anInt6031 < 800 && (Static227.aByteArrayArrayArray8[Static383.anInt6436][Static364.anInt6270 >> 7][Static23.anInt567 >> 7] & 0x4) != 0) {
				Static218.method3410(1, false, Static23.anInt567 >> 7, Static364.anInt6270 >> 7, Static440.aClass106ArrayArrayArray3);
				return;
			}
			return;
		}
		if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7][Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7] & 0x4) != 0) {
			Static218.method3410(0, false, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7, Static440.aClass106ArrayArrayArray3);
		}
		if (Static119.anInt2680 >= 2560) {
			return;
		}
		local98 = Static364.anInt6270 >> 7;
		@Pc(173) int local173 = Static23.anInt567 >> 7;
		@Pc(178) int local178 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7;
		@Pc(183) int local183 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7;
		@Pc(191) int local191;
		if (local98 < local178) {
			local191 = local178 - local98;
		} else {
			local191 = local98 - local178;
		}
		@Pc(209) int local209;
		if (local183 > local173) {
			local209 = local183 - local173;
		} else {
			local209 = local173 - local183;
		}
		if (local191 == 0 && local209 == 0 || -Static229.anInt4427 >= local191 || Static229.anInt4427 <= local191 || -Static379.anInt6422 >= local209 || local209 >= Static379.anInt6422) {
			Static361.method4904(null, "RC: " + local98 + "," + local173 + " " + local178 + "," + local183 + " " + Static48.anInt962 + "," + Static324.anInt5624);
			return;
		}
		@Pc(279) int local279;
		@Pc(281) int local281;
		if (local209 < local191) {
			local279 = local209 * 65536 / local191;
			local281 = 32768;
			while (local98 != local178) {
				if (local98 < local178) {
					local98++;
				} else if (local178 < local98) {
					local98--;
				}
				if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][local98][local173] & 0x4) != 0) {
					Static218.method3410(1, false, local173, local98, Static440.aClass106ArrayArrayArray3);
					return;
				}
				local281 += local279;
				if (local281 >= 65536) {
					local281 -= 65536;
					if (local173 < local183) {
						local173++;
					} else if (local173 > local183) {
						local173--;
					}
					if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][local98][local173] & 0x4) != 0) {
						Static218.method3410(1, false, local173, local98, Static440.aClass106ArrayArrayArray3);
						return;
					}
				}
			}
			return;
		}
		local279 = local191 * 65536 / local209;
		local281 = 32768;
		while (local173 != local183) {
			if (local173 < local183) {
				local173++;
			} else if (local183 < local173) {
				local173--;
			}
			if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][local98][local173] & 0x4) != 0) {
				Static218.method3410(1, false, local173, local98, Static440.aClass106ArrayArrayArray3);
				return;
			}
			local281 += local279;
			if (local281 >= 65536) {
				local281 -= 65536;
				if (local178 > local98) {
					local98++;
				} else if (local98 > local178) {
					local98--;
				}
				if ((Static227.aByteArrayArrayArray8[Static383.anInt6436][local98][local173] & 0x4) != 0) {
					Static218.method3410(1, false, local173, local98, Static440.aClass106ArrayArrayArray3);
					return;
				}
			}
		}
	}
}
