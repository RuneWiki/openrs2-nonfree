import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!av", name = "bb", descriptor = "I")
	public static int anInt346;

	@OriginalMember(owner = "client!av", name = "p", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_17 = new Class235(73, 0);

	@OriginalMember(owner = "client!av", name = "Ab", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_5 = new Class187(8);

	@OriginalMember(owner = "client!av", name = "Bb", descriptor = "I")
	public static int anInt356 = 0;

	@OriginalMember(owner = "client!av", name = "Db", descriptor = "[I")
	public static final int[] anIntArray43 = new int[500];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public static void method274() {
		Static442.method6111(Static93.aClass341_8);
		Static525.anInt8857++;
		if (Static490.aBoolean630 && Static388.aBoolean537) {
			@Pc(28) int local28 = Static166.aClass25_1.method4783();
			@Pc(34) int local34 = Static166.aClass25_1.method4788();
			local28 -= Static571.anInt9433;
			local34 -= Static467.anInt7995;
			if (Static60.anInt1133 > local28) {
				local28 = Static60.anInt1133;
			}
			if (Static93.aClass341_8.anInt9300 + local28 > Static60.anInt1133 - -Static303.aClass341_13.anInt9300) {
				local28 = Static303.aClass341_13.anInt9300 + Static60.anInt1133 - Static93.aClass341_8.anInt9300;
			}
			if (local34 < Static72.anInt1425) {
				local34 = Static72.anInt1425;
			}
			if (Static93.aClass341_8.anInt9248 + local34 > Static303.aClass341_13.anInt9248 + Static72.anInt1425) {
				local34 = Static303.aClass341_13.anInt9248 + Static72.anInt1425 - Static93.aClass341_8.anInt9248;
			}
			@Pc(100) int local100 = Static303.aClass341_13.anInt9267 + local28 - Static60.anInt1133;
			@Pc(108) int local108 = local34 + Static303.aClass341_13.anInt9256 - Static72.anInt1425;
			@Pc(171) Class1_Sub15 local171;
			if (Static166.aClass25_1.method4777()) {
				if (Static93.aClass341_8.anInt9287 < Static525.anInt8857) {
					@Pc(121) int local121 = local28 - Static70.anInt1405;
					@Pc(126) int local126 = local34 - Static574.anInt9480;
					if (Static93.aClass341_8.anInt9265 < local121 || -Static93.aClass341_8.anInt9265 > local121 || Static93.aClass341_8.anInt9265 < local126 || local126 < -Static93.aClass341_8.anInt9265) {
						Static468.aBoolean614 = true;
					}
				}
				if (Static93.aClass341_8.anObjectArray10 != null && Static468.aBoolean614) {
					local171 = new Class1_Sub15();
					local171.anInt2002 = local108;
					local171.aClass341_10 = Static93.aClass341_8;
					local171.anInt2003 = local100;
					local171.anObjectArray1 = Static93.aClass341_8.anObjectArray10;
					Static80.method1451(local171);
					return;
				}
			} else {
				if (Static468.aBoolean614) {
					Static50.method827();
					if (Static93.aClass341_8.anObjectArray16 != null) {
						local171 = new Class1_Sub15();
						local171.aClass341_9 = Static519.aClass341_20;
						local171.anObjectArray1 = Static93.aClass341_8.anObjectArray16;
						local171.aClass341_10 = Static93.aClass341_8;
						local171.anInt2002 = local108;
						local171.anInt2003 = local100;
						Static80.method1451(local171);
					}
					if (Static519.aClass341_20 != null && Static63.method1146(Static93.aClass341_8) != null) {
						Static147.method2161(Static93.aClass341_8, Static519.aClass341_20);
					}
				} else if ((Static543.anInt9075 == 1 || Static86.method1502()) && Static337.anInt8004 > 2) {
					Static90.method1580(Static571.anInt9433 + Static70.anInt1405, Static574.anInt9480 + Static467.anInt7995);
				} else if (Static260.method3768()) {
					Static90.method1580(Static571.anInt9433 + Static70.anInt1405, Static574.anInt9480 + Static467.anInt7995);
				}
				Static93.aClass341_8 = null;
			}
		} else if (Static525.anInt8857 > 1) {
			Static93.aClass341_8 = null;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
	public static void method281() {
		if (Static287.aFloat117 < 1024.0F) {
			Static287.aFloat117 = 1024.0F;
		}
		if (Static287.aFloat117 > 3072.0F) {
			Static287.aFloat117 = 3072.0F;
		}
		while (Static167.aFloat59 >= 16384.0F) {
			Static167.aFloat59 -= 16384.0F;
		}
		while (Static167.aFloat59 < 0.0F) {
			Static167.aFloat59 += 16384.0F;
		}
		@Pc(41) int local41 = Static417.anInt7669 >> 9;
		@Pc(45) int local45 = Static301.anInt5198 >> 9;
		@Pc(51) int local51 = Static66.method1191(Static417.anInt7669, Static433.anInt7592, Static301.anInt5198);
		@Pc(53) int local53 = 0;
		@Pc(85) int local85;
		if (local41 > 3 && local45 > 3 && Static71.anInt1410 - 4 > local41 && local45 < Static471.anInt8012 - 4) {
			for (local85 = local41 - 4; local85 <= local41 + 4; local85++) {
				for (@Pc(91) int local91 = local45 - 4; local91 <= local45 + 4; local91++) {
					@Pc(95) int local95 = Static433.anInt7592;
					if (local95 < 3 && Static466.method6426(local91, local85)) {
						local95++;
					}
					@Pc(106) int local106 = 0;
					if (Static343.aClass26_Sub1_3.aByteArrayArrayArray10 != null && Static343.aClass26_Sub1_3.aByteArrayArrayArray10[local95] != null) {
						local106 = (Static343.aClass26_Sub1_3.aByteArrayArrayArray10[local95][local85][local91] & 0xFF) * 8;
					}
					if (Static199.aClass47Array1 != null && Static199.aClass47Array1[local95] != null) {
						@Pc(146) int local146 = local106 + local51 - Static199.aClass47Array1[local95].method7545(local85, local91);
						if (local146 > local53) {
							local53 = local146;
						}
					}
				}
			}
		}
		local85 = (local53 >> 2) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (Static348.anInt5785 < local85) {
			Static348.anInt5785 += (local85 - Static348.anInt5785) / 24;
		} else if (local85 < Static348.anInt5785) {
			Static348.anInt5785 += (local85 - Static348.anInt5785) / 80;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z")
	public static boolean method283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static406.method5635(arg1, arg0) | (arg1 & 0x800) != 0 || Static330.method4520(arg1, arg0);
	}
}
