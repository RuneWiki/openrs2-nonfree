import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Lclient!ha;")
	public static Class35 aClass35_27;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Lclient!laa;")
	public static Class1_Sub2 method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub2_2;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
	public static void method5986() {
		if (Static281.aClass2_Sub19_Sub1_1.method2160(Static266.anInt4923) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static313.anInt6819 - 4 & 0xFF);
		@Pc(23) int local23 = Static313.anInt6819 % Static363.anInt1158;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static511.anInt8889; local29++) {
				Static139.aByteArrayArrayArray8[local25][local23][local29] = local19;
			}
		}
		if (Static208.anInt3742 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static415.anIntArray592[local29] = -1000000;
			Static358.anIntArray519[local29] = 1000000;
			Static261.anIntArray438[local29] = 0;
			Static211.anIntArray607[local29] = 1000000;
			Static92.anIntArray139[local29] = 0;
		}
		@Pc(99) int local99;
		if (Static427.anInt7875 != 1) {
			local99 = Static200.method3233(Static208.anInt3742, Static187.anInt3432, Static353.anInt5258);
			if (local99 - Static329.anInt3848 < 800 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][Static187.anInt3432 >> 7][Static353.anInt5258 >> 7] & 0x4) != 0) {
				Static140.method2476(Static187.anInt3432 >> 7, 1, Static399.aClass262ArrayArrayArray2, false, Static353.anInt5258 >> 7);
				return;
			}
			return;
		}
		if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7][Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7] & 0x4) != 0) {
			Static140.method2476(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7, 0, Static399.aClass262ArrayArrayArray2, false, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7);
		}
		if (Static209.anInt3769 >= 2560) {
			return;
		}
		local99 = Static187.anInt3432 >> 7;
		@Pc(181) int local181 = Static353.anInt5258 >> 7;
		@Pc(186) int local186 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7;
		@Pc(191) int local191 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7;
		@Pc(199) int local199;
		if (local186 > local99) {
			local199 = local186 - local99;
		} else {
			local199 = local99 - local186;
		}
		@Pc(218) int local218;
		if (local191 > local181) {
			local218 = local191 - local181;
		} else {
			local218 = local181 - local191;
		}
		if (local199 == 0 && local218 == 0 || local199 <= -Static363.anInt1158 || Static363.anInt1158 <= local199 || local218 <= -Static511.anInt8889 || local218 >= Static511.anInt8889) {
			Static459.method6984("RC: " + local99 + "," + local181 + " " + local186 + "," + local191 + " " + Static238.anInt4280 + "," + Static371.anInt6936, null);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local218 < local199) {
			local295 = local218 * 65536 / local199;
			local297 = 32768;
			while (local99 != local186) {
				if (local99 < local186) {
					local99++;
				} else if (local186 < local99) {
					local99--;
				}
				if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][local99][local181] & 0x4) != 0) {
					Static140.method2476(local99, 1, Static399.aClass262ArrayArrayArray2, false, local181);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					local297 -= 65536;
					if (local191 > local181) {
						local181++;
					} else if (local181 > local191) {
						local181--;
					}
					if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][local99][local181] & 0x4) != 0) {
						Static140.method2476(local99, 1, Static399.aClass262ArrayArrayArray2, false, local181);
						return;
					}
				}
			}
			return;
		}
		local295 = local199 * 65536 / local218;
		local297 = 32768;
		while (local191 != local181) {
			if (local191 > local181) {
				local181++;
			} else if (local191 < local181) {
				local181--;
			}
			if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][local99][local181] & 0x4) != 0) {
				Static140.method2476(local99, 1, Static399.aClass262ArrayArrayArray2, false, local181);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				local297 -= 65536;
				if (local99 < local186) {
					local99++;
				} else if (local99 > local186) {
					local99--;
				}
				if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][local99][local181] & 0x4) != 0) {
					Static140.method2476(local99, 1, Static399.aClass262ArrayArrayArray2, false, local181);
					return;
				}
			}
		}
	}
}
