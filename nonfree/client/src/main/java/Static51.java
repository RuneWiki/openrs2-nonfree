import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method1033() {
		if (Static230.aClass2_Sub54_15.aClass4_Sub17_1.method6114() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static125.anInt2441 - 4 & 0xFF);
		@Pc(25) int local25 = Static125.anInt2441 % Static222.anInt4533;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static668.anInt11370; local31++) {
				Static516.aByteArrayArrayArray18[local27][local25][local31] = local21;
			}
		}
		if (Static547.anInt9550 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static574.anIntArray509[local31] = -1000000;
			Static525.anIntArray472[local31] = 1000000;
			Static630.anIntArray400[local31] = 0;
			Static433.anIntArray397[local31] = 1000000;
			Static17.anIntArray439[local31] = 0;
		}
		@Pc(88) int local88 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
		@Pc(91) int local91 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
		@Pc(149) int local149;
		if (Static484.anInt8685 != 1 && Static5.anInt83 == -1) {
			local149 = Static10.method154(Static598.anInt10387, Static108.anInt1987, Static547.anInt9550);
			if (local149 - Static229.anInt4615 < 3200 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][Static108.anInt1987 >> 9][Static598.anInt10387 >> 9] & 0x4) != 0) {
				Static227.method4161(Static193.aClass291ArrayArrayArray2, 1, Static598.anInt10387 >> 9, false, Static108.anInt1987 >> 9);
			}
			return;
		}
		if (Static484.anInt8685 != 1) {
			local91 = Static533.anInt9359;
			local88 = Static5.anInt83;
		}
		if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local88 >> 9][local91 >> 9] & 0x4) != 0) {
			Static227.method4161(Static193.aClass291ArrayArrayArray2, 0, local91 >> 9, false, local88 >> 9);
		}
		if (Static550.anInt9633 >= 2560) {
			return;
		}
		local149 = Static108.anInt1987 >> 9;
		@Pc(153) int local153 = Static598.anInt10387 >> 9;
		@Pc(157) int local157 = local88 >> 9;
		@Pc(161) int local161 = local91 >> 9;
		@Pc(173) int local173;
		if (local157 > local149) {
			local173 = local157 - local149;
		} else {
			local173 = local149 - local157;
		}
		@Pc(191) int local191;
		if (local153 < local161) {
			local191 = local161 - local153;
		} else {
			local191 = local153 - local161;
		}
		if (local173 == 0 && local191 == 0 || -Static222.anInt4533 >= local173 || local173 >= Static222.anInt4533 || local191 <= -Static668.anInt11370 || Static668.anInt11370 <= local191) {
			Static165.method3319((Throwable) null, "RC: " + local149 + "," + local153 + " " + local157 + "," + local161 + " " + Static640.anInt11085 + "," + Static490.anInt8763);
			return;
		}
		@Pc(280) int local280;
		@Pc(282) int local282;
		if (local191 >= local173) {
			local280 = local173 * 65536 / local191;
			local282 = 32768;
			while (local153 != local161) {
				if (local153 < local161) {
					local153++;
				} else if (local161 < local153) {
					local153--;
				}
				if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local149][local153] & 0x4) != 0) {
					Static227.method4161(Static193.aClass291ArrayArrayArray2, 1, local153, false, local149);
					break;
				}
				local282 += local280;
				if (local282 >= 65536) {
					if (local149 < local157) {
						local149++;
					} else if (local149 > local157) {
						local149--;
					}
					local282 -= 65536;
					if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local149][local153] & 0x4) != 0) {
						Static227.method4161(Static193.aClass291ArrayArrayArray2, 1, local153, false, local149);
						break;
					}
				}
			}
			return;
		}
		local280 = local191 * 65536 / local173;
		local282 = 32768;
		while (local149 != local157) {
			if (local149 < local157) {
				local149++;
			} else if (local157 < local149) {
				local149--;
			}
			if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local149][local153] & 0x4) != 0) {
				Static227.method4161(Static193.aClass291ArrayArrayArray2, 1, local153, false, local149);
				break;
			}
			local282 += local280;
			if (local282 >= 65536) {
				local282 -= 65536;
				if (local153 < local161) {
					local153++;
				} else if (local161 < local153) {
					local153--;
				}
				if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local149][local153] & 0x4) != 0) {
					Static227.method4161(Static193.aClass291ArrayArrayArray2, 1, local153, false, local149);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1035(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static340.anInt6395; local11++) {
			if (arg0.equalsIgnoreCase(Static438.aStringArray47[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29);
	}
}
