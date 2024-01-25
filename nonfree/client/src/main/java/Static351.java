import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public static int anInt5993 = 0;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	public static final int anInt5996 = 1407;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public static void method4848() {
		if (Static216.aBoolean272) {
			return;
		}
		if (Static389.aClass128_Sub1_1.aBoolean233) {
			Static144.aFloat36 = (int) Static144.aFloat36 + 47 & 0xFFFFFFF0;
		} else {
			Static8.aFloat3 += (12.0F - Static8.aFloat3) / 2.0F;
		}
		Static255.aBoolean311 = true;
		Static216.aBoolean272 = true;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	public static int method4849() {
		return 6;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg0, 2);
		local13.method202();
		local13.aString1 = arg1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIZ)I")
	public static int method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static411.anInt7188 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static7.anInt2566;
		@Pc(30) int local30 = arg0 - Static7.anInt2576;
		for (@Pc(35) Class1_Sub28 local35 = (Class1_Sub28) Static7.aClass266_18.method6000(); local35 != null; local35 = (Class1_Sub28) Static7.aClass266_18.method5994()) {
			if (local35.anInt4274 == arg1) {
				@Pc(44) int local44 = local35.anInt4277;
				@Pc(47) int local47 = local35.anInt4275;
				@Pc(57) int local57 = Static7.anInt2566 + local44 << 14 | Static7.anInt2576 + local47;
				@Pc(77) int local77 = (local21 - local44) * (-local44 + local21) + (local30 - local47) * (-local47 + local30);
				if (local14 < 0 || local77 < local16) {
					local14 = local57;
					local16 = local77;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	public static void method4852() {
		Static148.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLclient!em;II)V")
	public static void method4853(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static8.aClass266_2.aClass1_255) {
			return;
		}
		@Pc(19) int local19 = arg0.anInt1760;
		@Pc(22) int local22 = arg0.anInt1759;
		@Pc(25) int local25 = arg0.anInt1758;
		@Pc(29) int local29 = (int) arg0.aLong50;
		@Pc(32) long local32 = arg0.aLong50;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(45) Class26_Sub2_Sub2_Sub1 local45;
		if (local25 == 21) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static258.anInt7179 = 2;
				Static105.anInt1938 = arg2;
				Static203.anInt3696 = arg1;
				Static158.anInt2678 = 0;
				Static55.method989(Static22.aClass131_102);
				Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4103(Static304.anInt5407);
				Static232.aClass1_Sub1_Sub1_2.method4103(local29);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static14.anInt338);
				Static232.aClass1_Sub1_Sub1_2.method4132(Static107.anInt1974);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		@Pc(117) Class26_Sub2_Sub2_Sub2 local117;
		if (local25 == 22) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static258.anInt7179 = 2;
				Static158.anInt2678 = 0;
				Static203.anInt3696 = arg1;
				Static105.anInt1938 = arg2;
				Static55.method989(Static64.aClass131_45);
				Static232.aClass1_Sub1_Sub1_2.method4103(local29);
				Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 10) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static203.anInt3696 = arg1;
				Static158.anInt2678 = 0;
				Static258.anInt7179 = 2;
				Static105.anInt1938 = arg2;
				Static55.method989(Static356.aClass131_151);
				Static232.aClass1_Sub1_Sub1_2.method4092(local29);
				Static232.aClass1_Sub1_Sub1_2.method4125(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 1009) {
			Static158.anInt2678 = 0;
			Static203.anInt3696 = arg1;
			Static258.anInt7179 = 2;
			Static105.anInt1938 = arg2;
			Static55.method989(Static295.aClass131_132);
			Static232.aClass1_Sub1_Sub1_2.method4125(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static437.anInt7555 + local19);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static134.anInt5502 + local22);
			Static232.aClass1_Sub1_Sub1_2.method4103((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static313.method4473(local19, local32, local22);
		}
		@Pc(295) Class219 local295;
		if (local25 == 57) {
			local295 = Static78.method1356(local22, local19);
			if (local295 != null) {
				Static82.method1412();
				@Pc(302) Class1_Sub43 local302 = Static53.method916(local295);
				Static389.method5312(local302.method5784(), local295, local302.anInt7463);
				Static233.aString33 = Static437.method5858(local295);
				Static254.aString36 = local295.aString44 + "<col=ffffff>";
				if (Static233.aString33 == null) {
					Static233.aString33 = "Null";
				}
			}
			return;
		}
		if (local25 == 58) {
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static158.anInt2678 = 0;
			Static203.anInt3696 = arg1;
			Static55.method989(Static405.aClass131_181);
			Static232.aClass1_Sub1_Sub1_2.method4103(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4101((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static437.anInt7555 + local19);
			Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static313.method4473(local19, local32, local22);
		}
		if (local25 == 6) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static258.anInt7179 = 2;
				Static158.anInt2678 = 0;
				Static105.anInt1938 = arg2;
				Static203.anInt3696 = arg1;
				Static55.method989(Static20.aClass131_12);
				Static232.aClass1_Sub1_Sub1_2.method4125(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4092(local29);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 1012) {
			Static203.anInt3696 = arg1;
			Static105.anInt1938 = arg2;
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 2;
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				@Pc(471) Class66 local471 = local117.aClass66_1;
				if (local471.anIntArray152 != null) {
					local471 = local471.method1454(Static51.aClass79_1);
				}
				if (local471 != null) {
					Static55.method989(Static36.aClass131_24);
					Static232.aClass1_Sub1_Sub1_2.method4101(local471.anInt1718);
				}
			}
		}
		if (local25 == 5) {
			local295 = Static78.method1356(local22, local19);
			if (local295 != null) {
				Static85.method1424(local295);
			}
		}
		if (local25 == 48) {
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 2;
			Static105.anInt1938 = arg2;
			Static203.anInt3696 = arg1;
			Static55.method989(Static110.aClass131_76);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static437.anInt7555 + local19);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static134.anInt5502 + local22);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4103(local29);
			Static236.method4579(local22, local19);
		}
		if (local25 == 45) {
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static55.method989(Static240.aClass131_114);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static437.anInt7555 + local19);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(local29);
			Static232.aClass1_Sub1_Sub1_2.method4103(local22 + Static134.anInt5502);
			Static236.method4579(local22, local19);
		}
		if (local25 == 17) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static105.anInt1938 = arg2;
				Static158.anInt2678 = 0;
				Static203.anInt3696 = arg1;
				Static258.anInt7179 = 2;
				Static55.method989(Static8.aClass131_4);
				Static232.aClass1_Sub1_Sub1_2.method4101(local29);
				Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 19) {
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 1;
			Static105.anInt1938 = arg2;
			Static55.method989(Static35.aClass131_61);
			Static232.aClass1_Sub1_Sub1_2.method4101(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4101(Static304.anInt5407);
			Static232.aClass1_Sub1_Sub1_2.method4101(local19 + Static437.anInt7555);
			Static232.aClass1_Sub1_Sub1_2.method4132(Static107.anInt1974);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static14.anInt338);
			Static52.method875(local19, 1, 1, true, 0, 0, -4, local22);
		}
		if (local25 == 23 && Static419.aClass219_18 == null) {
			Static151.method2289(local22, local19);
			Static419.aClass219_18 = Static78.method1356(local22, local19);
			Static355.method4895(Static419.aClass219_18);
		}
		if (local25 == 20 || local25 == 1010) {
			Static48.method816(local29, arg0.aString12, local19, local22);
		}
		if (local25 == 46) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static158.anInt2678 = 0;
				Static203.anInt3696 = arg1;
				Static105.anInt1938 = arg2;
				Static258.anInt7179 = 2;
				Static55.method989(Static114.aClass131_63);
				Static232.aClass1_Sub1_Sub1_2.method4125(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4101(local29);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 12) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static105.anInt1938 = arg2;
				Static258.anInt7179 = 2;
				Static203.anInt3696 = arg1;
				Static158.anInt2678 = 0;
				Static55.method989(Static51.aClass131_34);
				Static232.aClass1_Sub1_Sub1_2.method4092(local29);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 51) {
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 2;
			Static105.anInt1938 = arg2;
			Static203.anInt3696 = arg1;
			Static55.method989(Static22.aClass131_102);
			Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static304.anInt5407);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7097);
			Static232.aClass1_Sub1_Sub1_2.method4101(Static14.anInt338);
			Static232.aClass1_Sub1_Sub1_2.method4132(Static107.anInt1974);
		}
		if (local25 == 60) {
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static55.method989(Static228.aClass131_110);
			Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(local19 + Static437.anInt7555);
			Static232.aClass1_Sub1_Sub1_2.method4144(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static232.aClass1_Sub1_Sub1_2.method4101(Static134.anInt5502 + local22);
			Static313.method4473(local19, local32, local22);
		}
		if (local25 == 30) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static158.anInt2678 = 0;
				Static105.anInt1938 = arg2;
				Static258.anInt7179 = 2;
				Static203.anInt3696 = arg1;
				Static55.method989(Static68.aClass131_48);
				Static232.aClass1_Sub1_Sub1_2.method4125(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4101(local29);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 4) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static203.anInt3696 = arg1;
				Static158.anInt2678 = 0;
				Static258.anInt7179 = 2;
				Static105.anInt1938 = arg2;
				Static55.method989(Static359.aClass131_154);
				Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4092(local29);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 3) {
			Static105.anInt1938 = arg2;
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static55.method989(Static372.aClass131_185);
			Static232.aClass1_Sub1_Sub1_2.method4092(local29);
			Static232.aClass1_Sub1_Sub1_2.method4101(local19 + Static437.anInt7555);
			Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static134.anInt5502 + local22);
			Static236.method4579(local22, local19);
		}
		if (local25 == 49) {
			if (Static82.anInt1625 > 0 && Static102.aClass163_1.method3809(82) && Static102.aClass163_1.method3809(81)) {
				Static363.method4978(local22 + Static134.anInt5502, Static437.anInt7555 - -local19, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95);
			} else {
				Static105.anInt1938 = arg2;
				Static203.anInt3696 = arg1;
				Static258.anInt7179 = 1;
				Static158.anInt2678 = 0;
				Static55.method989(Static312.aClass131_141);
				Static232.aClass1_Sub1_Sub1_2.method4092(Static437.anInt7555 + local19);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static134.anInt5502 + local22);
			}
		}
		if (local25 == 11) {
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static105.anInt1938 = arg2;
			Static55.method989(Static359.aClass131_155);
			Static232.aClass1_Sub1_Sub1_2.method4144(Static134.anInt5502 + local22);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4103(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static232.aClass1_Sub1_Sub1_2.method4103(local19 + Static437.anInt7555);
			Static313.method4473(local19, local32, local22);
		}
		if (local25 == 13) {
			Static105.anInt1938 = arg2;
			Static158.anInt2678 = 0;
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static55.method989(Static282.aClass131_128);
			Static232.aClass1_Sub1_Sub1_2.method4144(local29);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4144(Static437.anInt7555 + local19);
			Static236.method4579(local22, local19);
		}
		if (local25 == 18) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static158.anInt2678 = 0;
				Static203.anInt3696 = arg1;
				Static105.anInt1938 = arg2;
				Static258.anInt7179 = 2;
				Static55.method989(Static314.aClass131_103);
				Static232.aClass1_Sub1_Sub1_2.method4101(local29);
				Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 16) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static258.anInt7179 = 2;
				Static158.anInt2678 = 0;
				Static105.anInt1938 = arg2;
				Static203.anInt3696 = arg1;
				Static55.method989(Static294.aClass131_148);
				Static232.aClass1_Sub1_Sub1_2.method4144(local29);
				Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 25) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static203.anInt3696 = arg1;
				Static258.anInt7179 = 2;
				Static105.anInt1938 = arg2;
				Static158.anInt2678 = 0;
				Static55.method989(Static339.aClass131_149);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static14.anInt338);
				Static232.aClass1_Sub1_Sub1_2.method4103(local29);
				Static232.aClass1_Sub1_Sub1_2.method4101(Static304.anInt5407);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4132(Static107.anInt1974);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 47) {
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static55.method989(Static144.aClass131_72);
			Static232.aClass1_Sub1_Sub1_2.method4092(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static134.anInt5502 + local22);
			Static232.aClass1_Sub1_Sub1_2.method4103(local19 + Static437.anInt7555);
			Static313.method4473(local19, local32, local22);
		}
		if (local25 == 50) {
			Static203.anInt3696 = arg1;
			Static258.anInt7179 = 2;
			Static158.anInt2678 = 0;
			Static105.anInt1938 = arg2;
			Static55.method989(Static199.aClass131_96);
			Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(local29);
			Static232.aClass1_Sub1_Sub1_2.method4103(local19 + Static437.anInt7555);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static304.anInt5407);
			Static232.aClass1_Sub1_Sub1_2.method4103(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4105(Static107.anInt1974);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static14.anInt338);
			Static236.method4579(local22, local19);
		}
		if (local25 == 8) {
			if (Static82.anInt1625 > 0 && Static102.aClass163_1.method3809(82) && Static102.aClass163_1.method3809(81)) {
				Static363.method4978(Static134.anInt5502 + local22, local19 + Static437.anInt7555, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95);
			} else {
				Static82.method1404(local19, local29, local22);
				if (local29 == 1) {
					Static232.aClass1_Sub1_Sub1_2.method4115(-1);
					Static232.aClass1_Sub1_Sub1_2.method4115(-1);
					Static232.aClass1_Sub1_Sub1_2.method4101((int) Static274.aFloat78);
					Static232.aClass1_Sub1_Sub1_2.method4115(57);
					Static232.aClass1_Sub1_Sub1_2.method4115(Static182.anInt7140);
					Static232.aClass1_Sub1_Sub1_2.method4115(Static427.anInt7386);
					Static232.aClass1_Sub1_Sub1_2.method4115(89);
					Static232.aClass1_Sub1_Sub1_2.method4101(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068);
					Static232.aClass1_Sub1_Sub1_2.method4101(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065);
					Static232.aClass1_Sub1_Sub1_2.method4115(63);
				} else {
					Static203.anInt3696 = arg1;
					Static105.anInt1938 = arg2;
					Static158.anInt2678 = 0;
					Static258.anInt7179 = 1;
				}
				Static52.method875(local19, 1, 1, true, 0, 0, -4, local22);
			}
		}
		if (local25 == 1004 || local25 == 1001 || local25 == 1007 || local25 == 1006 || local25 == 1002) {
			Static108.method1666(local19, local29, local25);
		}
		if (local25 == 1011) {
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static55.method989(Static377.aClass131_165);
			Static232.aClass1_Sub1_Sub1_2.method4101(local29);
		}
		if (local25 == 9) {
			Static258.anInt7179 = 2;
			Static105.anInt1938 = arg2;
			Static203.anInt3696 = arg1;
			Static158.anInt2678 = 0;
			Static55.method989(Static87.aClass131_54);
			Static232.aClass1_Sub1_Sub1_2.method4103(Static304.anInt5407);
			Static232.aClass1_Sub1_Sub1_2.method4105(Static107.anInt1974);
			Static232.aClass1_Sub1_Sub1_2.method4092(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4144(Static14.anInt338);
			Static232.aClass1_Sub1_Sub1_2.method4092((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static232.aClass1_Sub1_Sub1_2.method4092(local19 + Static437.anInt7555);
			Static313.method4473(local19, local32, local22);
		}
		if (local25 == 44) {
			local45 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local29];
			if (local45 != null) {
				Static158.anInt2678 = 0;
				Static258.anInt7179 = 2;
				Static203.anInt3696 = arg1;
				Static105.anInt1938 = arg2;
				Static55.method989(Static144.aClass131_73);
				Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4103(local29);
				Static52.method875(local45.anIntArray590[0], local45.method5535(), local45.method5535(), true, 0, 0, -2, local45.anIntArray589[0]);
			}
		}
		if (local25 == 2) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static258.anInt7179 = 2;
				Static105.anInt1938 = arg2;
				Static203.anInt3696 = arg1;
				Static158.anInt2678 = 0;
				Static55.method989(Static382.aClass131_168);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4103(local29);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 15) {
			local117 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local29];
			if (local117 != null) {
				Static105.anInt1938 = arg2;
				Static158.anInt2678 = 0;
				Static258.anInt7179 = 2;
				Static203.anInt3696 = arg1;
				Static55.method989(Static118.aClass131_105);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static102.aClass163_1.method3809(82) ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4144(local29);
				Static52.method875(local117.anIntArray590[0], local117.method5535(), local117.method5535(), true, 0, 0, -2, local117.anIntArray589[0]);
			}
		}
		if (local25 == 59) {
			Static158.anInt2678 = 0;
			Static105.anInt1938 = arg2;
			Static203.anInt3696 = arg1;
			Static258.anInt7179 = 2;
			Static55.method989(Static203.aClass131_98);
			Static232.aClass1_Sub1_Sub1_2.method4092(local29);
			Static232.aClass1_Sub1_Sub1_2.method4092(local22 + Static134.anInt5502);
			Static232.aClass1_Sub1_Sub1_2.method4092(Static437.anInt7555 + local19);
			Static232.aClass1_Sub1_Sub1_2.method4117(Static102.aClass163_1.method3809(82) ? 1 : 0);
			Static236.method4579(local22, local19);
		}
		if (local25 == 1003) {
			Static105.anInt1938 = arg2;
			Static258.anInt7179 = 2;
			Static158.anInt2678 = 0;
			Static203.anInt3696 = arg1;
			Static55.method989(Static234.aClass131_112);
			Static232.aClass1_Sub1_Sub1_2.method4101(local29);
		}
		if (Static138.aBoolean128) {
			Static82.method1412();
		}
		if (Static221.aClass219_12 != null && Static167.anInt3120 == 0) {
			Static355.method4895(Static221.aClass219_12);
		}
	}
}
