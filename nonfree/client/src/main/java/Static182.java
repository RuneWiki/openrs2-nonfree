import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
	public static int anInt3561;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[Lclient!cu;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_106 = new Class272(26, 0);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public static void method3149() {
		if (Static278.aClass3_Sub13_Sub1_1.method4481(Static260.anInt4932) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static337.anInt5983 - 4 & 0xFF);
		@Pc(25) int local25 = Static337.anInt5983 % Static400.anInt6818;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static271.anInt5050; local31++) {
				Static55.aByteArrayArrayArray2[local27][local25][local31] = local21;
			}
		}
		if (Static209.anInt8182 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static76.anIntArray123[local31] = -1000000;
			Static368.anIntArray498[local31] = 1000000;
			Static334.anIntArray462[local31] = 0;
			Static280.anIntArray383[local31] = 1000000;
			Static336.anIntArray464[local31] = 0;
		}
		@Pc(97) int local97 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
		@Pc(100) int local100 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
		@Pc(112) int local112;
		if (Static446.anInt7363 != 1 && Static471.anInt7695 == -1) {
			local112 = Static130.method2562(Static233.anInt4431, Static209.anInt8182, Static421.anInt7061);
			if (local112 - Static545.anInt8633 < 3200 && (Static154.aByteArrayArrayArray15[Static209.anInt8182][Static421.anInt7061 >> 9][Static233.anInt4431 >> 9] & 0x4) != 0) {
				Static384.method5671(Static421.anInt7061 >> 9, false, Static554.aClass63ArrayArrayArray4, Static233.anInt4431 >> 9, 1);
				return;
			}
			return;
		}
		if (Static446.anInt7363 != 1) {
			local97 = Static471.anInt7695;
			local100 = Static205.anInt4130;
		}
		if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local97 >> 9][local100 >> 9] & 0x4) != 0) {
			Static384.method5671(local97 >> 9, false, Static554.aClass63ArrayArrayArray4, local100 >> 9, 0);
		}
		if (Static37.anInt878 >= 2560) {
			return;
		}
		local112 = Static421.anInt7061 >> 9;
		@Pc(199) int local199 = Static233.anInt4431 >> 9;
		@Pc(203) int local203 = local97 >> 9;
		@Pc(207) int local207 = local100 >> 9;
		@Pc(218) int local218;
		if (local203 > local112) {
			local218 = local203 - local112;
		} else {
			local218 = local112 - local203;
		}
		@Pc(233) int local233;
		if (local199 < local207) {
			local233 = local207 - local199;
		} else {
			local233 = local199 - local207;
		}
		if (local218 == 0 && local233 == 0 || -Static400.anInt6818 >= local218 || Static400.anInt6818 <= local218 || local233 <= -Static271.anInt5050 || Static271.anInt5050 <= local233) {
			Static379.method5607("RC: " + local112 + "," + local199 + " " + local203 + "," + local207 + " " + Static529.anInt8344 + "," + Static463.anInt7588, null);
			return;
		}
		@Pc(316) int local316;
		@Pc(318) int local318;
		if (local218 > local233) {
			local316 = local233 * 65536 / local218;
			local318 = 32768;
			while (local203 != local112) {
				if (local203 > local112) {
					local112++;
				} else if (local112 > local203) {
					local112--;
				}
				if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local112][local199] & 0x4) != 0) {
					Static384.method5671(local112, false, Static554.aClass63ArrayArrayArray4, local199, 1);
					return;
				}
				local318 += local316;
				if (local318 >= 65536) {
					local318 -= 65536;
					if (local207 > local199) {
						local199++;
					} else if (local199 > local207) {
						local199--;
					}
					if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local112][local199] & 0x4) != 0) {
						Static384.method5671(local112, false, Static554.aClass63ArrayArrayArray4, local199, 1);
						return;
					}
				}
			}
			return;
		}
		local316 = local218 * 65536 / local233;
		local318 = 32768;
		while (local199 != local207) {
			if (local207 > local199) {
				local199++;
			} else if (local199 > local207) {
				local199--;
			}
			if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local112][local199] & 0x4) != 0) {
				Static384.method5671(local112, false, Static554.aClass63ArrayArrayArray4, local199, 1);
				return;
			}
			local318 += local316;
			if (local318 >= 65536) {
				local318 -= 65536;
				if (local203 > local112) {
					local112++;
				} else if (local112 > local203) {
					local112--;
				}
				if ((Static154.aByteArrayArrayArray15[Static209.anInt8182][local112][local199] & 0x4) != 0) {
					Static384.method5671(local112, false, Static554.aClass63ArrayArrayArray4, local199, 1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)[Lclient!fca;")
	public static Class92[] method3150() {
		return new Class92[] { Static115.aClass92_1, Static115.aClass92_2, Static115.aClass92_3, Static115.aClass92_4, Static115.aClass92_5, Static115.aClass92_6, Static115.aClass92_7, Static115.aClass92_8, Static115.aClass92_9, Static115.aClass92_10, Static115.aClass92_11, Static115.aClass92_12, Static115.aClass92_13, Static115.aClass92_14 };
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!qh;B)Lclient!mr;")
	public static Class218 method3151(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method3118();
		@Pc(14) Class300 local14 = Static175.method3039()[arg0.method3118()];
		@Pc(21) Class140 local21 = Static53.method999()[arg0.method3118()];
		@Pc(25) int local25 = arg0.method3107();
		@Pc(29) int local29 = arg0.method3107();
		@Pc(33) int local33 = arg0.method3109();
		@Pc(37) int local37 = arg0.method3109();
		@Pc(41) int local41 = arg0.method3116();
		@Pc(45) int local45 = arg0.method3116();
		@Pc(57) int local57 = arg0.method3116();
		@Pc(68) boolean local68 = arg0.method3118() == 1;
		return new Class218(local7, local14, local21, local25, local29, local33, local37, local41, local45, local57, local68);
	}
}
