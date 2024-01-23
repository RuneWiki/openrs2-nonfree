import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!fe;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString247 = "flash1:";

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString248 = "wishes to trade with you.";

	@OriginalMember(owner = "client!o", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIILclient!sa;IJZ)Z")
	public static boolean method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static242.method3984(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
	public static void method2854() {
		Static157.aClass79_20.method2487();
		Static96.aClass79_14.method2487();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lclient!md;")
	public static Class85 method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class85 local14 = local7.aClass85_1;
			local7.aClass85_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/lang/String;Lclient!se;)Ljava/lang/String;")
	public static String method2858(@OriginalArg(1) String arg0, @OriginalArg(2) Class122 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(20) int local20 = arg0.indexOf("%1");
			if (local20 == -1) {
				while (true) {
					local20 = arg0.indexOf("%2");
					if (local20 == -1) {
						while (true) {
							local20 = arg0.indexOf("%3");
							if (local20 == -1) {
								while (true) {
									local20 = arg0.indexOf("%4");
									if (local20 == -1) {
										while (true) {
											local20 = arg0.indexOf("%5");
											if (local20 == -1) {
												while (true) {
													local20 = arg0.indexOf("%dns");
													if (local20 == -1) {
														return arg0;
													}
													@Pc(194) String local194 = "";
													if (Static3.aClass145_1 != null) {
														if (Static3.aClass145_1.anObject7 == null) {
															local194 = Static47.method968(Static3.aClass145_1.anInt5356);
														} else {
															local194 = (String) Static3.aClass145_1.anObject7;
														}
													}
													arg0 = arg0.substring(0, local20) + local194 + arg0.substring(local20 + 4);
												}
											}
											arg0 = arg0.substring(0, local20) + Static147.method2679(Static233.method3880(arg1, 4)) + arg0.substring(local20 + 2);
										}
									}
									arg0 = arg0.substring(0, local20) + Static147.method2679(Static233.method3880(arg1, 3)) + arg0.substring(local20 + 2);
								}
							}
							arg0 = arg0.substring(0, local20) + Static147.method2679(Static233.method3880(arg1, 2)) + arg0.substring(local20 + 2);
						}
					}
					arg0 = arg0.substring(0, local20) + Static147.method2679(Static233.method3880(arg1, 1)) + arg0.substring(local20 + 2);
				}
			}
			arg0 = arg0.substring(0, local20) + Static147.method2679(Static233.method3880(arg1, 0)) + arg0.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V")
	public static void method2862() {
		Static33.aBoolean264 = true;
		Static157.aLong118 = 0L;
		Static252.anInt5357 = 0;
		Static120.aClass27_1.anInt1017 = 0;
		Static15.aBoolean29 = true;
		Static184.method3135();
		Static143.anInt3466 = 0;
		Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
		Static117.anInt3040 = -1;
		Static196.anInt1185 = 0;
		Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
		Static69.anInt1874 = 0;
		Static221.anInt4829 = -1;
		Static9.anInt373 = -1;
		Static100.anInt2738 = -1;
		for (@Pc(3300) int local3300 = 0; local3300 < Static75.aClass116Array1.length; local3300++) {
			Static75.aClass116Array1[local3300] = null;
		}
		Static230.anInt5417 = 0;
		Static259.aBoolean280 = false;
		Static2.method25(0);
		for (@Pc(3326) int local3326 = 0; local3326 < 100; local3326++) {
			Static134.aStringArray27[local3326] = null;
		}
		Static139.anInt5524 = 0;
		Static239.anInt5157 = 0;
		Static183.anInt5174 = 0;
		Static238.anInt5146 = 0;
		Static129.anInt3253 = (int) (Math.random() * 100.0D) - 50;
		Static88.aBoolean138 = false;
		Static16.anInt4955 = 0;
		Static121.anInt3108 = 0;
		Static198.anInt4590 = (int) (Math.random() * 80.0D) - 40;
		Static196.anInt1178 = 0;
		Static193.anInt4297 = (int) (Math.random() * 110.0D) - 55;
		Static230.aFloat51 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static160.anInt3795 = -1;
		Static44.anInt1333 = (int) (Math.random() * 30.0D) - 20;
		Static83.anInt2232 = (int) (Math.random() * 120.0D) - 60;
		Static262.anInt5501 = 0;
		for (@Pc(3403) int local3403 = 0; local3403 < 2048; local3403++) {
			Static147.aClass9_Sub1_Sub1Array1[local3403] = null;
			Static73.aClass1_Sub13Array1[local3403] = null;
		}
		for (@Pc(3419) int local3419 = 0; local3419 < 32768; local3419++) {
			Static36.aClass9_Sub1_Sub2Array2[local3419] = null;
		}
		Static83.aClass9_Sub1_Sub1_1 = Static147.aClass9_Sub1_Sub1Array1[2047] = new Class9_Sub1_Sub1();
		Static106.aClass3_12.method29();
		Static213.aClass3_21.method29();
		@Pc(3447) int local3447;
		@Pc(3455) int local3455;
		if (Static138.aClass3ArrayArrayArray1 != null) {
			for (local3447 = 0; local3447 < 4; local3447++) {
				for (@Pc(3451) int local3451 = 0; local3451 < 104; local3451++) {
					for (local3455 = 0; local3455 < 104; local3455++) {
						Static138.aClass3ArrayArrayArray1[local3447][local3451][local3455] = null;
					}
				}
			}
		}
		Static174.aClass3_17 = new Class3();
		Static149.anInt3577 = 0;
		Static265.anInt5544 = 0;
		Static174.method2988();
		Static208.method3462();
		Static111.anInt2947 = 0;
		Static261.anInt5482 = 0;
		Static10.anInt384 = 0;
		Static57.anInt1588 = 0;
		Static34.anInt969 = 0;
		Static259.anInt5472 = 0;
		Static260.anInt2793 = 0;
		Static38.anInt1012 = 0;
		Static83.anInt2246 = 0;
		Static232.anInt5102 = 0;
		for (local3447 = 0; local3447 < Static155.anIntArray274.length; local3447++) {
			Static155.anIntArray274[local3447] = -1;
		}
		if (Static140.anInt3388 != -1) {
			Static15.method253(Static140.anInt3388);
		}
		for (@Pc(3539) Class1_Sub5 local3539 = (Class1_Sub5) Static204.aClass140_13.method4012(); local3539 != null; local3539 = (Class1_Sub5) Static204.aClass140_13.method4013()) {
			Static263.method4207(local3539, true);
		}
		Static140.anInt3388 = -1;
		Static204.aClass140_13 = new Class140(8);
		Static21.method405();
		Static259.aBoolean280 = false;
		Static230.anInt5417 = 0;
		Static58.aClass122_6 = null;
		Static76.aClass94_2.method2819(null, false, new int[5], -1, -1);
		for (local3455 = 0; local3455 < 8; local3455++) {
			Static85.aStringArray15[local3455] = null;
			Static129.aBooleanArray11[local3455] = false;
			Static10.anIntArray36[local3455] = -1;
		}
		Static148.method209();
		Static19.aBoolean36 = true;
		for (@Pc(3604) int local3604 = 0; local3604 < 100; local3604++) {
			Static198.aBooleanArray19[local3604] = true;
		}
		Static131.anInt1067 = 0;
		Static202.aString302 = null;
		Static138.aClass1_Sub20Array1 = null;
		for (@Pc(3622) int local3622 = 0; local3622 < 6; local3622++) {
			Static131.aClass105Array2[local3622] = new Class105();
		}
		for (@Pc(3636) int local3636 = 0; local3636 < 25; local3636++) {
			Static48.anIntArray106[local3636] = 0;
			Static259.anIntArray466[local3636] = 0;
			Static195.anIntArray339[local3636] = 0;
		}
		Static89.aBoolean139 = true;
		Static208.aString315 = Static128.aString206;
		Static175.anInt4027 = 0;
		Static74.aShortArray28 = Static238.aShortArray68 = Static115.aShortArray45 = Static250.aShortArray69 = new short[256];
		Static178.aBoolean200 = false;
		Static25.method508();
		Static4.aBoolean4 = false;
		Static181.method3122();
	}
}
