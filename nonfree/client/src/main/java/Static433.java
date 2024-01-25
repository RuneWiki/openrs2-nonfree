import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public static final int[] anIntArray440 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(CBI)I")
	public static int method6716(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(16) char local16 = Character.toLowerCase(arg0);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method6718() {
		if (Static155.aClass8_Sub25_6.aClass36_Sub3_2.method2233() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static609.anInt9845 - 4 & 0xFF);
		@Pc(25) int local25 = Static609.anInt9845 % Static372.anInt7082;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static218.anInt5023; local36++) {
				Static28.aByteArrayArrayArray7[local32][local25][local36] = local21;
			}
		}
		if (Static128.anInt3428 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static86.anIntArray106[local36] = -1000000;
			Static303.anIntArray353[local36] = 1000000;
			Static37.anIntArray51[local36] = 0;
			Static389.anIntArray409[local36] = 1000000;
			Static82.anIntArray101[local36] = 0;
		}
		@Pc(95) int local95 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
		@Pc(98) int local98 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
		@Pc(112) int local112;
		if (Static427.anInt8005 != 1 && Static460.anInt8416 == -1) {
			local112 = Static177.method3098(Static377.anInt7114, Static637.anInt10650, Static128.anInt3428);
			if (local112 - Static504.anInt8868 < 3200 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][Static637.anInt10650 >> 9][Static377.anInt7114 >> 9] & 0x4) != 0) {
				Static419.method6583(Static405.aClass56ArrayArrayArray2, 1, false, Static377.anInt7114 >> 9, Static637.anInt10650 >> 9);
				return;
			}
			return;
		}
		if (Static427.anInt8005 != 1) {
			local95 = Static460.anInt8416;
			local98 = Static621.anInt10407;
		}
		if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local95 >> 9][local98 >> 9] & 0x4) != 0) {
			Static419.method6583(Static405.aClass56ArrayArrayArray2, 0, false, local98 >> 9, local95 >> 9);
		}
		if (Static443.anInt8245 >= 2560) {
			return;
		}
		local112 = Static637.anInt10650 >> 9;
		@Pc(199) int local199 = Static377.anInt7114 >> 9;
		@Pc(203) int local203 = local95 >> 9;
		@Pc(207) int local207 = local98 >> 9;
		@Pc(219) int local219;
		if (local112 >= local203) {
			local219 = local112 - local203;
		} else {
			local219 = local203 - local112;
		}
		@Pc(237) int local237;
		if (local199 < local207) {
			local237 = local207 - local199;
		} else {
			local237 = local199 - local207;
		}
		if (local219 == 0 && local237 == 0 || local219 <= -Static372.anInt7082 || Static372.anInt7082 <= local219 || -Static218.anInt5023 >= local237 || Static218.anInt5023 <= local237) {
			Static596.method8231("RC: " + local112 + "," + local199 + " " + local203 + "," + local207 + " " + Static628.anInt10493 + "," + Static594.anInt10160, null);
			return;
		}
		@Pc(322) int local322;
		@Pc(324) int local324;
		if (local237 >= local219) {
			local322 = local219 * 65536 / local237;
			local324 = 32768;
			while (local207 != local199) {
				if (local207 > local199) {
					local199++;
				} else if (local199 > local207) {
					local199--;
				}
				if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local112][local199] & 0x4) != 0) {
					Static419.method6583(Static405.aClass56ArrayArrayArray2, 1, false, local199, local112);
					return;
				}
				local324 += local322;
				if (local324 >= 65536) {
					local324 -= 65536;
					if (local203 > local112) {
						local112++;
					} else if (local203 < local112) {
						local112--;
					}
					if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local112][local199] & 0x4) != 0) {
						Static419.method6583(Static405.aClass56ArrayArrayArray2, 1, false, local199, local112);
						return;
					}
				}
			}
			return;
		}
		local322 = local237 * 65536 / local219;
		local324 = 32768;
		while (local203 != local112) {
			if (local112 < local203) {
				local112++;
			} else if (local203 < local112) {
				local112--;
			}
			if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local112][local199] & 0x4) != 0) {
				Static419.method6583(Static405.aClass56ArrayArrayArray2, 1, false, local199, local112);
				return;
			}
			local324 += local322;
			if (local324 >= 65536) {
				if (local207 > local199) {
					local199++;
				} else if (local199 > local207) {
					local199--;
				}
				local324 -= 65536;
				if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local112][local199] & 0x4) != 0) {
					Static419.method6583(Static405.aClass56ArrayArrayArray2, 1, false, local199, local112);
					return;
				}
			}
		}
	}
}
