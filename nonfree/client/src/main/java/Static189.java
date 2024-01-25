import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
	public static int anInt3555;

	@OriginalMember(owner = "client!gja", name = "F", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
	public static int anInt3553 = 64;

	@OriginalMember(owner = "client!gja", name = "p", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V")
	public static void method2971() {
		if (Static56.aClass14_Sub22_5.aClass21_Sub25_2.method8195() != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static274.anInt4757 - 4 & 0xFF);
		@Pc(29) int local29 = Static274.anInt4757 % Static26.anInt462;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static445.anInt6140; local35++) {
				Static539.aByteArrayArrayArray17[local31][local29][local35] = local25;
			}
		}
		if (Static586.anInt10060 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static666.anIntArray821[local35] = -1000000;
			Static230.anIntArray335[local35] = 1000000;
			Static241.anIntArray343[local35] = 0;
			Static616.anIntArray762[local35] = 1000000;
			Static563.anIntArray705[local35] = 0;
		}
		@Pc(90) int local90 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
		@Pc(93) int local93 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
		@Pc(106) int local106;
		if (Static378.anInt6935 != 1 && Static667.anInt11097 == -1) {
			local106 = Static152.method2434(Static233.anInt4273, Static586.anInt10060, Static74.anInt1618);
			if (local106 - Static396.anInt7302 < 3200 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][Static233.anInt4273 >> 9][Static74.anInt1618 >> 9] & 0x4) != 0) {
				Static454.method6568(Static233.anInt4273 >> 9, Static486.aClass58ArrayArrayArray2, 1, false, Static74.anInt1618 >> 9);
				return;
			}
			return;
		}
		if (Static378.anInt6935 != 1) {
			local90 = Static667.anInt11097;
			local93 = Static115.anInt2304;
		}
		if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local90 >> 9][local93 >> 9] & 0x4) != 0) {
			Static454.method6568(local90 >> 9, Static486.aClass58ArrayArrayArray2, 0, false, local93 >> 9);
		}
		if (Static668.anInt11106 >= 2560) {
			return;
		}
		local106 = Static233.anInt4273 >> 9;
		@Pc(188) int local188 = Static74.anInt1618 >> 9;
		@Pc(192) int local192 = local90 >> 9;
		@Pc(196) int local196 = local93 >> 9;
		@Pc(204) int local204;
		if (local192 <= local106) {
			local204 = local106 - local192;
		} else {
			local204 = local192 - local106;
		}
		@Pc(219) int local219;
		if (local188 >= local196) {
			local219 = local188 - local196;
		} else {
			local219 = local196 - local188;
		}
		if (local204 == 0 && local219 == 0 || local204 <= -Static26.anInt462 || Static26.anInt462 <= local204 || local219 <= -Static445.anInt6140 || Static445.anInt6140 <= local219) {
			Static524.method7532("RC: " + local106 + "," + local188 + " " + local192 + "," + local196 + " " + Static329.anInt6225 + "," + Static202.anInt3755, (Throwable) null);
			return;
		}
		@Pc(298) int local298;
		@Pc(300) int local300;
		if (local219 < local204) {
			local298 = local219 * 65536 / local204;
			local300 = 32768;
			while (local106 != local192) {
				if (local192 > local106) {
					local106++;
				} else if (local192 < local106) {
					local106--;
				}
				if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local106][local188] & 0x4) != 0) {
					Static454.method6568(local106, Static486.aClass58ArrayArrayArray2, 1, false, local188);
					return;
				}
				local300 += local298;
				if (local300 >= 65536) {
					local300 -= 65536;
					if (local196 > local188) {
						local188++;
					} else if (local196 < local188) {
						local188--;
					}
					if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local106][local188] & 0x4) != 0) {
						Static454.method6568(local106, Static486.aClass58ArrayArrayArray2, 1, false, local188);
						return;
					}
				}
			}
			return;
		}
		local298 = local204 * 65536 / local219;
		local300 = 32768;
		while (local196 != local188) {
			if (local188 < local196) {
				local188++;
			} else if (local196 < local188) {
				local188--;
			}
			if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local106][local188] & 0x4) != 0) {
				Static454.method6568(local106, Static486.aClass58ArrayArrayArray2, 1, false, local188);
				return;
			}
			local300 += local298;
			if (local300 >= 65536) {
				if (local192 > local106) {
					local106++;
				} else if (local192 < local106) {
					local106--;
				}
				local300 -= 65536;
				if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local106][local188] & 0x4) != 0) {
					Static454.method6568(local106, Static486.aClass58ArrayArrayArray2, 1, false, local188);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)I")
	public static int method2975(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2976(@OriginalArg(0) String arg0) {
		return Static621.aHashtable8.containsKey(arg0);
	}
}
