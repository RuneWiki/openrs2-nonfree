import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_4;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_51 = new Class98(5, -2);

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public static int anInt3848 = 1;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z[[BLclient!op;)V")
	public static void method3336(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class238_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub12 local30 = new Class6_Sub12(local23);
				local36 = Static468.anIntArray577[local17] >> 8;
				@Pc(42) int local42 = Static468.anIntArray577[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static150.anInt2792;
				@Pc(56) int local56 = local42 * 64 - Static154.anInt2878;
				Static262.method3999();
				arg1.method5541(local56, Static30.aClass138Array1, Static154.anInt2878, local49, local30, Static150.anInt2792);
				arg1.method5556(local49, local12, Static554.aClass90_12, local30, local56);
				if (!arg1.aBoolean476 && local36 == Static300.anInt5494 / 8 && Static582.anInt8003 / 8 == local42 && local12[0] != -1) {
					Static145.aClass141_1 = Static57.aClass14_1.method207(local12[3], local12[2], Static376.aClass116_1, local12[1], local12[0]);
					Static122.anInt2116 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(143) int local143 = (Static468.anIntArray577[local131] >> 8) * 64 - Static150.anInt2792;
			local36 = (Static468.anIntArray577[local131] & 0xFF) * 64 - Static154.anInt2878;
			@Pc(158) byte[] local158 = arg0[local131];
			if (local158 == null && Static582.anInt8003 < 800) {
				Static262.method3999();
				arg1.method5535(local143, local36);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	public static void method3337() {
		@Pc(9) int local9 = Static429.aClass6_Sub12_Sub2_2.method6011();
		@Pc(18) boolean local18 = Static429.aClass6_Sub12_Sub2_2.method6014() == 1;
		@Pc(22) int local22 = Static429.aClass6_Sub12_Sub2_2.method6044();
		@Pc(26) int local26 = Static429.aClass6_Sub12_Sub2_2.method6044();
		Static126.anInt2172 = Static429.aClass6_Sub12_Sub2_2.method6014();
		Static173.method2710();
		Static512.method7030(local9);
		Static429.aClass6_Sub12_Sub2_2.method6068();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static18.anInt5706 >> 3; local44++) {
				for (local48 = 0; local48 < Static80.anInt1367 >> 3; local48++) {
					local55 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
					if (local55 == 1) {
						Static245.anIntArrayArrayArray1[local40][local44][local48] = Static429.aClass6_Sub12_Sub2_2.method6061(26);
					} else {
						Static245.anIntArrayArrayArray1[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static429.aClass6_Sub12_Sub2_2.method6065();
		local44 = (Static207.anInt3929 - Static429.aClass6_Sub12_Sub2_2.anInt7556) / 16;
		Static16.anIntArrayArray3 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static16.anIntArrayArray3[local48][local55] = Static429.aClass6_Sub12_Sub2_2.method6015();
			}
		}
		Static468.anIntArray577 = new int[local44];
		Static185.anIntArray306 = new int[local44];
		Static187.anIntArray312 = new int[local44];
		Static492.aByteArrayArray27 = new byte[local44][];
		Static287.aByteArrayArray13 = new byte[local44][];
		Static501.aByteArrayArray28 = new byte[local44][];
		Static98.aByteArrayArray6 = new byte[local44][];
		Static77.anIntArray115 = null;
		Static401.anIntArray504 = new int[local44];
		Static345.anIntArray457 = new int[local44];
		Static369.aByteArrayArray19 = null;
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(182) int local182 = 0; local182 < Static18.anInt5706 >> 3; local182++) {
				for (@Pc(186) int local186 = 0; local186 < Static80.anInt1367 >> 3; local186++) {
					@Pc(196) int local196 = Static245.anIntArrayArrayArray1[local55][local182][local186];
					if (local196 != -1) {
						@Pc(205) int local205 = local196 >> 14 & 0x3FF;
						@Pc(211) int local211 = local196 >> 3 & 0x7FF;
						@Pc(221) int local221 = (local205 / 8 << 8) + local211 / 8;
						for (@Pc(223) int local223 = 0; local223 < local44; local223++) {
							if (Static468.anIntArray577[local223] == local221) {
								local221 = -1;
								break;
							}
						}
						if (local221 != -1) {
							Static468.anIntArray577[local44] = local221;
							@Pc(255) int local255 = local221 >> 8 & 0xFF;
							@Pc(259) int local259 = local221 & 0xFF;
							Static345.anIntArray457[local44] = Static88.aClass248_15.method5777("m" + local255 + "_" + local259);
							Static185.anIntArray306[local44] = Static88.aClass248_15.method5777("l" + local255 + "_" + local259);
							Static401.anIntArray504[local44] = Static88.aClass248_15.method5777("um" + local255 + "_" + local259);
							Static187.anIntArray312[local44] = Static88.aClass248_15.method5777("ul" + local255 + "_" + local259);
							local44++;
						}
					}
				}
			}
		}
		Static424.method5985(local22, local18, local26, 11);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZ)V")
	public static void method3338(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static554.aClass90_12 = Static359.method7473(0, Static77.aCanvas1, Static58.aClass6_Sub17_Sub1_1.anInt9282 * 2, Static347.aClass248_58, Static214.anInterface2_13);
		} else {
			if (arg1) {
				Static554.aClass90_12 = Static359.method7473(0, Static77.aCanvas1, 0, Static347.aClass248_58, Static214.anInterface2_13);
				Static554.aClass90_12.D(0);
				@Pc(27) Class202 local27 = Static129.method1978(Static550.aClass248_107, Static448.anInt7921);
				@Pc(36) Class82 local36 = Static554.aClass90_12.method7523(local27, Static593.method4140(Static114.aClass248_20, Static448.anInt7921));
				Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28), local36, true);
				Static540.method7136();
				Static554.aClass90_12.method7462();
			}
			try {
				Static554.aClass90_12 = Static359.method7473(arg0, Static77.aCanvas1, Static58.aClass6_Sub17_Sub1_1.anInt9282 * 2, Static347.aClass248_58, Static214.anInterface2_13);
				if (Static554.aClass90_12.method7452()) {
					@Pc(65) boolean local65 = true;
					try {
						local65 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(75) Throwable local75) {
					}
					@Pc(81) Class6_Sub2 local81;
					if (local65) {
						local81 = Static554.aClass90_12.method7451(146800640);
					} else {
						local81 = Static554.aClass90_12.method7451(104857600);
					}
					Static554.aClass90_12.method7449(local81);
				}
			} catch (@Pc(92) Throwable local92) {
				arg0 = 0;
				Static554.aClass90_12 = Static359.method7473(0, Static77.aCanvas1, 0, Static347.aClass248_58, Static214.anInterface2_13);
			}
		}
		Static79.anInt2700 = arg0;
		Static575.method7860();
		if (!Static554.aClass90_12.method7513()) {
			anInt3848 = 1;
		}
		Static554.aClass90_12.method7478(anInt3848);
		Static554.aClass90_12.method7491(0);
		Static554.aClass90_12.JA(32);
		Static211.aClass93_7 = Static554.aClass90_12.method7518();
		Static445.aClass93_8 = Static554.aClass90_12.method7518();
		Static117.method1837();
		Static554.aClass90_12.method7483(!Static58.aClass6_Sub17_Sub1_1.aBoolean601);
		if (Static554.aClass90_12.method7485()) {
			Static287.method4362(Static58.aClass6_Sub17_Sub1_1.aBoolean603);
		}
		Static376.method5504(Static80.anInt1367 >> 3, Static18.anInt5706 >> 3, Static554.aClass90_12);
		Static323.method4986();
		Static258.aBoolean348 = true;
		Static334.aClass178Array1 = null;
		Static252.aBoolean341 = false;
	}
}
