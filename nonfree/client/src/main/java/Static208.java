import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "J")
	public static long aLong126;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	public static void method3578() {
		@Pc(5) Class128 local5 = null;
		try {
			@Pc(11) Class157 local11 = Static150.aClass183_3.method4157("2", true);
			while (local11.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (local11.anInt4667 == 1) {
				local5 = (Class128) local11.anObject13;
				@Pc(38) Class1_Sub3 local38 = new Class1_Sub3(Static266.anInt5157 * 6 + 3);
				local38.method1208(1);
				local38.method1227(Static266.anInt5157);
				for (@Pc(48) int local48 = 0; local48 < Static31.anIntArray221.length; local48++) {
					if (Static398.aBooleanArray23[local48]) {
						local38.method1227(local48);
						local38.method1197(Static31.anIntArray221[local48]);
					}
				}
				local5.method3089(local38.anInt1710, 0, local38.aByteArray14);
			}
		} catch (@Pc(78) Exception local78) {
		}
		try {
			if (local5 != null) {
				local5.method3091();
			}
		} catch (@Pc(85) Exception local85) {
		}
		Static14.aLong8 = Static250.method3737();
		Static334.aBoolean390 = false;
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
	public static void method3584() {
		if (Static26.aFloat5 < 1024.0F) {
			Static26.aFloat5 = 1024.0F;
		}
		if (Static26.aFloat5 > 3072.0F) {
			Static26.aFloat5 = 3072.0F;
		}
		while (Static267.aFloat83 >= 16384.0F) {
			Static267.aFloat83 -= 16384.0F;
		}
		while (Static267.aFloat83 < 0.0F) {
			Static267.aFloat83 += 16384.0F;
		}
		@Pc(42) int local42 = Static162.anInt3418 >> 7;
		@Pc(46) int local46 = Static323.anInt5976 >> 7;
		@Pc(52) int local52 = Static227.method3475(Static162.anInt3418, Static323.anInt5976, Static426.anInt1486);
		@Pc(54) int local54 = 0;
		@Pc(82) int local82;
		if (local42 > 3 && local46 > 3 && Static209.anInt4283 - 4 > local42 && Static211.anInt4295 - 4 > local46) {
			for (local82 = local42 - 4; local82 <= local42 + 4; local82++) {
				for (@Pc(87) int local87 = local46 - 4; local87 <= local46 + 4; local87++) {
					@Pc(90) int local90 = Static426.anInt1486;
					if (local90 < 3 && Static457.method6172(local87, local82)) {
						local90++;
					}
					@Pc(101) int local101 = 0;
					if (Static349.aClass29_Sub1_5.aByteArrayArrayArray7 != null && Static349.aClass29_Sub1_5.aByteArrayArrayArray7[local90] != null) {
						local101 = (Static349.aClass29_Sub1_5.aByteArrayArrayArray7[local90][local82][local87] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local101 + local52 - Static396.aClass96Array5[local90].ua(local82, local87);
					if (local54 < local133) {
						local54 = local133;
					}
				}
			}
		}
		local82 = (local54 >> 0) * 1536;
		if (local82 > 786432) {
			local82 = 786432;
		}
		if (local82 < 262144) {
			local82 = 262144;
		}
		if (Static3.anInt49 < local82) {
			Static3.anInt49 += (local82 - Static3.anInt49) / 24;
		} else if (local82 < Static3.anInt49) {
			Static3.anInt49 += (local82 - Static3.anInt49) / 80;
		}
	}
}
