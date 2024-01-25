import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "S")
	public static short aShort113 = 1;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
	public static void method6922() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static279.aBoolean329) {
			if (Static297.aBoolean346) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static620.aFloat209 < (float) local7) {
			Static620.aFloat209 = local7;
		}
		while (Static401.aFloat165 >= 16384.0F) {
			Static401.aFloat165 -= 16384.0F;
		}
		if ((float) local9 < Static620.aFloat209) {
			Static620.aFloat209 = local9;
		}
		while (Static401.aFloat165 < 0.0F) {
			Static401.aFloat165 += 16384.0F;
		}
		@Pc(57) int local57 = Static410.anInt7502 >> 9;
		@Pc(61) int local61 = Static528.anInt9022 >> 9;
		@Pc(67) int local67 = Static192.method3263(Static528.anInt9022, Static410.anInt7502, Static549.anInt9262);
		@Pc(69) int local69 = 0;
		@Pc(93) int local93;
		if (local57 > 3 && local61 > 3 && Static634.anInt10129 - 4 > local57 && local61 < Static638.anInt10172 - 4) {
			for (local93 = local57 - 4; local93 <= local57 + 4; local93++) {
				for (@Pc(99) int local99 = local61 - 4; local99 <= local61 + 4; local99++) {
					@Pc(103) int local103 = Static549.anInt9262;
					if (local103 < 3 && Static486.method7232(local99, local93)) {
						local103++;
					}
					@Pc(114) int local114 = 0;
					if (Static493.aClass81_Sub1_1.aByteArrayArrayArray9 != null && Static493.aClass81_Sub1_1.aByteArrayArrayArray9[local103] != null) {
						local114 = (Static493.aClass81_Sub1_1.aByteArrayArrayArray9[local103][local93][local99] & 0xFF) * 8 << 2;
					}
					if (Static364.aClass51Array3 != null && Static364.aClass51Array3[local103] != null) {
						@Pc(155) int local155 = local67 + local114 - Static364.aClass51Array3[local103].method7835(local93, local99);
						if (local155 > local69) {
							local69 = local155;
						}
					}
				}
			}
		}
		local93 = (local69 >> 2) * 1536;
		if (local93 > 786432) {
			local93 = 786432;
		}
		if (local93 < 262144) {
			local93 = 262144;
		}
		if (Static40.anInt1256 < local93) {
			Static40.anInt1256 += (local93 - Static40.anInt1256) / 24;
		} else if (local93 < Static40.anInt1256) {
			Static40.anInt1256 += (local93 - Static40.anInt1256) / 80;
		}
	}
}
