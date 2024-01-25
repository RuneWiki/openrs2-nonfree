import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public static int anInt9147 = -1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!uq;Z[[[BIB)Z")
	public static boolean method7853(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static120.aBoolean206) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10152 >> Static485.anInt8241;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10158 >> Static485.anInt8241;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class9_Sub2_Sub1) {
			local10 = ((Class9_Sub2_Sub1) arg0).aShort127;
			local17 = ((Class9_Sub2_Sub1) arg0).aShort125;
			local8 = ((Class9_Sub2_Sub1) arg0).aShort126;
			local15 = ((Class9_Sub2_Sub1) arg0).aShort124;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte128 < Static603.anInt9778 && local38 >= Static451.anInt7672 && local38 < Static244.anInt4815 && local41 >= Static584.anInt9489 && local41 < Static307.anInt5985) {
					if ((arg2 == null || arg0.aByte127 < arg3 || arg2[arg0.aByte127][local38][local41] != arg4) && arg0.method8602() && !arg0.method8608(Static568.aClass82_14)) {
						return false;
					}
					if (!arg1 && local38 >= Static281.anInt5392 - 16 && local38 <= Static281.anInt5392 + 16 && local41 >= Static394.anInt7055 - 16 && local41 <= Static394.anInt7055 + 16) {
						if (Static302.aBoolean437) {
							Static197.aClass250Array1[Static365.anInt6737++].method6328(arg0);
							Static365.anInt6737 %= Static376.anInt10191;
						} else {
							arg0.method8600(Static568.aClass82_14);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method7854(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public static void method7855() {
		@Pc(9) int local9 = Static221.anInt10164 * 512 + 256;
		@Pc(15) int local15 = Static397.anInt7107 * 512 + 256;
		@Pc(24) int local24 = Static594.method8211(local9, local15, Static65.anInt1298) - Static419.anInt7338;
		if (Static72.anInt1437 >= 100) {
			Static419.anInt7345 = Static221.anInt10164 * 512 + 256;
			Static522.anInt8849 = Static397.anInt7107 * 512 + 256;
			Static13.anInt232 = Static594.method8211(Static419.anInt7345, Static522.anInt8849, Static65.anInt1298) - Static419.anInt7338;
		} else {
			if (local9 > Static419.anInt7345) {
				Static419.anInt7345 += Static254.anInt1414 + Static72.anInt1437 * (local9 - Static419.anInt7345) / 1000;
				if (local9 < Static419.anInt7345) {
					Static419.anInt7345 = local9;
				}
			}
			if (local24 > Static13.anInt232) {
				Static13.anInt232 += Static254.anInt1414 + Static72.anInt1437 * (local24 - Static13.anInt232) / 1000;
				if (Static13.anInt232 > local24) {
					Static13.anInt232 = local24;
				}
			}
			if (Static419.anInt7345 > local9) {
				Static419.anInt7345 -= (Static419.anInt7345 - local9) * Static72.anInt1437 / 1000 + Static254.anInt1414;
				if (local9 > Static419.anInt7345) {
					Static419.anInt7345 = local9;
				}
			}
			if (Static522.anInt8849 < local15) {
				Static522.anInt8849 += (local15 - Static522.anInt8849) * Static72.anInt1437 / 1000 + Static254.anInt1414;
				if (local15 < Static522.anInt8849) {
					Static522.anInt8849 = local15;
				}
			}
			if (local24 < Static13.anInt232) {
				Static13.anInt232 -= Static72.anInt1437 * (Static13.anInt232 - local24) / 1000 + Static254.anInt1414;
				if (local24 > Static13.anInt232) {
					Static13.anInt232 = local24;
				}
			}
			if (local15 < Static522.anInt8849) {
				Static522.anInt8849 -= Static254.anInt1414 + (Static522.anInt8849 - local15) * Static72.anInt1437 / 1000;
				if (Static522.anInt8849 < local15) {
					Static522.anInt8849 = local15;
				}
			}
		}
		local9 = Static348.anInt6489 * 512 + 256;
		local15 = Static540.anInt9071 * 512 + 256;
		local24 = Static594.method8211(local9, local15, Static65.anInt1298) - Static134.anInt2813;
		@Pc(225) int local225 = local9 - Static419.anInt7345;
		@Pc(230) int local230 = local24 - Static13.anInt232;
		@Pc(234) int local234 = local15 - Static522.anInt8849;
		@Pc(246) int local246 = (int) Math.sqrt((double) (local225 * local225 + local234 * local234));
		@Pc(257) int local257 = (int) (Math.atan2((double) local230, (double) local246) * 2607.5945876176133D) & 0x3FFF;
		@Pc(268) int local268 = (int) (-2607.5945876176133D * Math.atan2((double) local225, (double) local234)) & 0x3FFF;
		if (local257 < 1024) {
			local257 = 1024;
		}
		if (local257 > 3072) {
			local257 = 3072;
		}
		if (Static253.anInt4961 < local257) {
			Static253.anInt4961 += Static481.anInt8219 * (local257 - Static253.anInt4961 >> 3) / 1000 + Static164.anInt3252 << 3;
			if (local257 < Static253.anInt4961) {
				Static253.anInt4961 = local257;
			}
		}
		if (Static253.anInt4961 > local257) {
			Static253.anInt4961 -= Static164.anInt3252 + (Static253.anInt4961 - local257 >> 3) * Static481.anInt8219 / 1000 << 3;
			if (Static253.anInt4961 < local257) {
				Static253.anInt4961 = local257;
			}
		}
		@Pc(341) int local341 = local268 - Static35.anInt545;
		if (local341 > 8192) {
			local341 -= 16384;
		}
		if (local341 < -8192) {
			local341 += 16384;
		}
		local341 >>= 0x3;
		if (local341 > 0) {
			Static35.anInt545 += Static164.anInt3252 + local341 * Static481.anInt8219 / 1000 << 3;
			Static35.anInt545 &= 0x3FFF;
		}
		if (local341 < 0) {
			Static35.anInt545 -= -local341 * Static481.anInt8219 / 1000 + Static164.anInt3252 << 3;
			Static35.anInt545 &= 0x3FFF;
		}
		@Pc(398) int local398 = local268 - Static35.anInt545;
		if (local398 > 8192) {
			local398 -= 16384;
		}
		if (local398 < -8192) {
			local398 += 16384;
		}
		if (local398 < 0 && local341 > 0 || local398 > 0 && local341 < 0) {
			Static35.anInt545 = local268;
		}
		Static330.anInt6250 = 0;
	}
}
