import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method2281() {
		if (Static170.aFloat181 < 1024.0F) {
			Static170.aFloat181 = 1024.0F;
		}
		if (Static170.aFloat181 > 3072.0F) {
			Static170.aFloat181 = 3072.0F;
		}
		while (Static533.aFloat188 >= 16384.0F) {
			Static533.aFloat188 -= 16384.0F;
		}
		while (Static533.aFloat188 < 0.0F) {
			Static533.aFloat188 += 16384.0F;
		}
		@Pc(42) int local42 = Static189.anInt3761 >> 9;
		@Pc(46) int local46 = Static65.anInt1699 >> 9;
		@Pc(54) int local54 = Static274.method4782(Static65.anInt1699, Static212.anInt4380, Static189.anInt3761);
		@Pc(56) int local56 = 0;
		@Pc(84) int local84;
		if (local42 > 3 && local46 > 3 && Static460.anInt8640 - 4 > local42 && Static292.anInt7682 - 4 > local46) {
			for (local84 = local42 - 4; local84 <= local42 + 4; local84++) {
				for (@Pc(89) int local89 = local46 - 4; local89 <= local46 + 4; local89++) {
					@Pc(92) int local92 = Static212.anInt4380;
					if (local92 < 3 && Static503.method7578(local84, local89)) {
						local92++;
					}
					@Pc(103) int local103 = 0;
					if (Static231.aClass152_Sub1_1.aByteArrayArrayArray18 != null && Static231.aClass152_Sub1_1.aByteArrayArrayArray18[local92] != null) {
						local103 = (Static231.aClass152_Sub1_1.aByteArrayArrayArray18[local92][local84][local89] & 0xFF) * 8;
					}
					@Pc(136) int local136 = local103 + local54 - Static224.aClass4Array3[local92].JA(local84, local89);
					if (local56 < local136) {
						local56 = local136;
					}
				}
			}
		}
		local84 = (local56 >> 2) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (local84 > Static486.anInt9077) {
			Static486.anInt9077 += (local84 - Static486.anInt9077) / 24;
		} else if (local84 < Static486.anInt9077) {
			Static486.anInt9077 += (local84 - Static486.anInt9077) / 80;
		}
	}
}
