import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_105 = new Class119(10, -1);

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method3840() {
		if (Static180.aFloat27 < 1024.0F) {
			Static180.aFloat27 = 1024.0F;
		}
		while (Static252.aFloat47 >= 16384.0F) {
			Static252.aFloat47 -= 16384.0F;
		}
		if (Static180.aFloat27 > 3072.0F) {
			Static180.aFloat27 = 3072.0F;
		}
		while (Static252.aFloat47 < 0.0F) {
			Static252.aFloat47 += 16384.0F;
		}
		@Pc(37) int local37 = Static35.anInt1000 >> 7;
		@Pc(41) int local41 = Static215.anInt4111 >> 7;
		@Pc(47) int local47 = Static231.method3482(Static6.anInt93, Static35.anInt1000, Static215.anInt4111);
		@Pc(54) int local54 = 0;
		@Pc(84) int local84;
		if (local37 > 3 && local41 > 3 && local37 < Static40.anInt1089 - 4 && local41 < Static44.anInt7276 - 4) {
			for (local84 = local37 - 4; local84 <= local37 + 4; local84++) {
				for (@Pc(89) int local89 = local41 - 4; local89 <= local41 + 4; local89++) {
					@Pc(92) int local92 = Static6.anInt93;
					if (local92 < 3 && Static309.method4307(local84, local89)) {
						local92++;
					}
					@Pc(103) int local103 = 0;
					if (Static381.aClass105_Sub1_3.aByteArrayArrayArray12 != null && Static381.aClass105_Sub1_3.aByteArrayArrayArray12[local92] != null) {
						local103 = (Static381.aClass105_Sub1_3.aByteArrayArrayArray12[local92][local84][local89] & 0xFF) * 8;
					}
					@Pc(136) int local136 = local47 + local103 - Static444.aClass159Array3[local92].I(local84, local89);
					if (local54 < local136) {
						local54 = local136;
					}
				}
			}
		}
		local84 = (local54 >> 0) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (Static62.anInt1594 < local84) {
			Static62.anInt1594 += (local84 - Static62.anInt1594) / 24;
		} else if (local84 < Static62.anInt1594) {
			Static62.anInt1594 += (local84 - Static62.anInt1594) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
	public static int method3841(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(29) int local29 = (local15 & 0x33333333) + (local15 >>> 2 & 0xB3333333);
		@Pc(38) int local38 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
