import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public static int anInt6873 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!za;)V")
	public static void method5434(@OriginalArg(1) Class200 arg0) {
		if (Static18.anInt395 < 2 && !Static423.aBoolean478 || Static387.aClass76_14 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static423.aBoolean478 && Static18.anInt395 < 2) {
			local36 = Static240.aString73 + Static172.aClass198_61.method4012(Static38.anInt4834) + Static21.aString3 + " ->";
		} else if (Static2.aBoolean506 && Static188.aClass80_1.method1723(81) && Static18.anInt395 > 2) {
			local36 = Static381.method3064((Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268.aClass5_268);
		} else {
			@Pc(65) Class5_Sub41 local65 = (Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268;
			local36 = Static381.method3064(local65);
			@Pc(71) int[] local71 = null;
			if (Static403.method5362(local65.anInt6815)) {
				local71 = Static306.aClass67_3.method1452((int) local65.aLong215).anIntArray50;
			} else if (local65.anInt6820 != -1) {
				local71 = Static306.aClass67_3.method1452(local65.anInt6820).anIntArray50;
			} else if (Static449.method5910(local65.anInt6815)) {
				@Pc(114) Class5_Sub7 local114 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local65.aLong215);
				if (local114 != null) {
					@Pc(119) Class2_Sub1_Sub3_Sub1 local119 = local114.aClass2_Sub1_Sub3_Sub1_1;
					@Pc(122) Class131 local122 = local119.aClass131_1;
					if (local122.anIntArray209 != null) {
						local122 = local122.method2781(Static408.aClass39_1);
					}
					if (local122 != null) {
						local71 = local122.anIntArray211;
					}
				}
			} else if (Static464.method5865(local65.anInt6815)) {
				@Pc(160) Class114 local160;
				if (local65.anInt6815 == 1003) {
					local160 = Static398.aClass256_4.method5782((int) local65.aLong215);
				} else {
					local160 = Static398.aClass256_4.method5782((int) (local65.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local160.anIntArray170 != null) {
					local160 = local160.method2393(Static408.aClass39_1);
				}
				if (local160 != null) {
					local71 = local160.anIntArray167;
				}
			}
			if (local71 != null) {
				local36 = local36 + Static211.method2803(local71);
			}
		}
		if (Static18.anInt395 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static18.anInt395 - 2) + Static224.aClass198_60.method4012(Static38.anInt4834);
		}
		if (Static442.aClass76_15 != null) {
			@Pc(262) Class23 local262 = Static442.aClass76_15.method1692(arg0);
			if (local262 == null) {
				local262 = Static56.aClass23_1;
			}
			local262.method5749(Static223.anInt3726, Static442.aClass76_15.anInt2106, local36, Static170.anInt2907, Static442.aClass76_15.anInt2120, Static442.aClass76_15.anInt2119, Static442.aClass76_15.anInt2054, Static209.anInt3495, Static324.aClass49Array11, Static442.aClass76_15.anInt2127, Static442.aClass76_15.anInt2056, Static393.aRandom3, Static417.anIntArray475, Static352.anIntArray443);
			Static258.method3330(Static352.anIntArray443[3], Static352.anIntArray443[0], Static352.anIntArray443[1], Static352.anIntArray443[2]);
		} else if (Static8.aClass76_1 != null && Static217.aClass197_2 == Static60.aClass197_1) {
			@Pc(243) int local243 = Static56.aClass23_1.method5750(Static324.aClass49Array11, local36, Static209.anInt3495, Static417.anIntArray475, Static236.anInt3872 + 16, Static393.aRandom3, Static6.anInt107 + 4);
			Static258.method3330(16, Static6.anInt107 + 4, Static236.anInt3872, local243 + Static21.aClass14_1.method286(local36));
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method5435(@OriginalArg(0) Class200 arg0) {
		@Pc(7) int local7 = Static285.anInt4431;
		@Pc(9) int local9 = Static381.anInt3882;
		@Pc(11) int local11 = Static78.anInt4643;
		@Pc(13) int local13 = Static335.anInt5447;
		arg0.method5856(local9, -10660793, local11, local13, local7);
		arg0.method5856(local9 + 1, -16777216, -2 + local11, 16, local7 + 1);
		arg0.method5857(local7 + 1, local9 + 18, local11 - 2, local13 + -19, -16777216);
		Static56.aClass23_1.method5744(-1, Static226.aClass198_62.method4012(Static38.anInt4834), -10660793, local7 + 3, local9 + 14);
		@Pc(76) int local76 = Static290.aClass66_1.method5965();
		@Pc(80) int local80 = Static290.aClass66_1.method5974();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class5_Sub41 local87 = (Class5_Sub41) Static122.aClass177_13.method3618(); local87 != null; local87 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			@Pc(102) int local102 = (Static18.anInt395 - local82 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local76 > local7 && local76 < local7 + local11 && local102 - 13 < local80 && local80 < local102 + 3 && local87.aBoolean457) {
				local104 = -256;
			}
			@Pc(137) int[] local137 = null;
			if (Static403.method5362(local87.anInt6815)) {
				local137 = Static306.aClass67_3.method1452((int) local87.aLong215).anIntArray50;
			} else if (local87.anInt6820 != -1) {
				local137 = Static306.aClass67_3.method1452(local87.anInt6820).anIntArray50;
			} else if (Static449.method5910(local87.anInt6815)) {
				@Pc(222) Class5_Sub7 local222 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local87.aLong215);
				if (local222 != null) {
					@Pc(227) Class2_Sub1_Sub3_Sub1 local227 = local222.aClass2_Sub1_Sub3_Sub1_1;
					@Pc(230) Class131 local230 = local227.aClass131_1;
					if (local230.anIntArray209 != null) {
						local230 = local230.method2781(Static408.aClass39_1);
					}
					if (local230 != null) {
						local137 = local230.anIntArray211;
					}
				}
			} else if (Static464.method5865(local87.anInt6815)) {
				@Pc(191) Class114 local191;
				if (local87.anInt6815 == 1003) {
					local191 = Static398.aClass256_4.method5782((int) local87.aLong215);
				} else {
					local191 = Static398.aClass256_4.method5782((int) (local87.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local191.anIntArray170 != null) {
					local191 = local191.method2393(Static408.aClass39_1);
				}
				if (local191 != null) {
					local137 = local191.anIntArray167;
				}
			}
			@Pc(247) String local247 = Static381.method3064(local87);
			if (local137 != null) {
				local247 = local247 + Static211.method2803(local137);
			}
			Static56.aClass23_1.method5740(local102, Static417.anIntArray475, local104, Static324.aClass49Array11, local7 + 3, local247);
			local82++;
			if (local87.aBoolean458) {
				Static18.aClass49_1.method5785(local7 + Static21.aClass14_1.method286(local247) + 5, local102 + -12);
			}
		}
		Static285.method3516(Static78.anInt4643, Static285.anInt4431, Static335.anInt5447, Static381.anInt3882);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)I")
	public static int method5436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}
}
