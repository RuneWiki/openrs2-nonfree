import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public static int anInt3100;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!f;")
	public static Class88 aClass88_10;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_49 = new Class90(106, -2);

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_6 = new Class221(64);

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "[Lclient!ql;")
	public static Class279[] aClass279Array1 = null;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "[I")
	public static int[] anIntArray148 = new int[1];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[SZ[Ljava/lang/String;I)V")
	public static void method2507(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) String local24 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local24;
		@Pc(38) short local38 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg0; local50++) {
			if (local24 == null || arg2[local50] != null && arg2[local50].compareTo(local24) < (local50 & 0x1)) {
				@Pc(75) String local75 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20] = local75;
				@Pc(89) short local89 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local89;
			}
		}
		arg2[arg0] = arg2[local20];
		arg2[local20] = local24;
		arg1[arg0] = arg1[local20];
		arg1[local20] = local38;
		method2507(local20 - 1, arg1, arg2, arg3);
		method2507(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!r;ILclient!fa;)V")
	public static void method2509(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Interface7 arg1) {
		if (Static572.aClass4_Sub6_Sub16_3 == null) {
			return;
		}
		if (Static142.anInt3092 < 10) {
			if (!Static572.aClass348_128.method7955(Static572.aClass4_Sub6_Sub16_3.aString167)) {
				Static142.anInt3092 = Static272.aClass348_136.method7967(Static572.aClass4_Sub6_Sub16_3.aString167) / 10;
				return;
			}
			Static458.method6740();
			Static142.anInt3092 = 10;
		}
		if (Static142.anInt3092 == 10) {
			Static572.anInt10056 = Static572.aClass4_Sub6_Sub16_3.anInt8096 >> 6 << 6;
			Static572.anInt10059 = Static572.aClass4_Sub6_Sub16_3.anInt8103 >> 6 << 6;
			Static572.anInt10062 = (Static572.aClass4_Sub6_Sub16_3.anInt8095 >> 6 << 6) + 64 - Static572.anInt10056;
			Static572.anInt10057 = (Static572.aClass4_Sub6_Sub16_3.anInt8105 >> 6 << 6) + 64 - Static572.anInt10059;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static572.aClass4_Sub6_Sub16_3.method6311(Static157.anInt3323 + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9), Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static242.anInt10133 + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9), local78)) {
				local80 = local78[1] - Static572.anInt10056;
				local82 = local78[2] - Static572.anInt10059;
			}
			if (!Static450.aBoolean604 && local80 >= 0 && Static572.anInt10062 > local80 && local82 >= 0 && local82 < Static572.anInt10057) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static43.anInt2490 = local80;
				Static555.anInt10135 = local82;
			} else if (Static158.anInt3337 == -1 || Static36.anInt1226 == -1) {
				Static572.aClass4_Sub6_Sub16_3.method6312(Static572.aClass4_Sub6_Sub16_3.anInt8097 >> 14 & 0x3FFF, local78, Static572.aClass4_Sub6_Sub16_3.anInt8097 & 0x3FFF);
				Static555.anInt10135 = local78[2] - Static572.anInt10059;
				Static43.anInt2490 = local78[1] - Static572.anInt10056;
			} else {
				Static572.aClass4_Sub6_Sub16_3.method6312(Static158.anInt3337, local78, Static36.anInt1226);
				Static36.anInt1226 = -1;
				Static158.anInt3337 = -1;
				Static450.aBoolean604 = false;
				if (local78 != null) {
					Static555.anInt10135 = local78[2] - Static572.anInt10059;
					Static43.anInt2490 = local78[1] - Static572.anInt10056;
				}
			}
			if (Static572.aClass4_Sub6_Sub16_3.anInt8093 == 37) {
				Static572.aFloat202 = 3.0F;
				Static572.aFloat201 = 3.0F;
			} else if (Static572.aClass4_Sub6_Sub16_3.anInt8093 == 50) {
				Static572.aFloat202 = 4.0F;
				Static572.aFloat201 = 4.0F;
			} else if (Static572.aClass4_Sub6_Sub16_3.anInt8093 == 75) {
				Static572.aFloat202 = 6.0F;
				Static572.aFloat201 = 6.0F;
			} else if (Static572.aClass4_Sub6_Sub16_3.anInt8093 == 100) {
				Static572.aFloat202 = 8.0F;
				Static572.aFloat201 = 8.0F;
			} else if (Static572.aClass4_Sub6_Sub16_3.anInt8093 == 200) {
				Static572.aFloat202 = 16.0F;
				Static572.aFloat201 = 16.0F;
			} else {
				Static572.aFloat202 = 8.0F;
				Static572.aFloat201 = 8.0F;
			}
			Static572.anInt10050 = (int) Static572.aFloat202 >> 1;
			Static572.aByteArrayArrayArray18 = Static114.method2102(Static572.anInt10050);
			Static279.method4473();
			Static572.method7750();
			Static308.aClass22_40 = new Class22();
			Static572.anInt10052 += (int) (Math.random() * 5.0D) - 2;
			if (Static572.anInt10052 < -8) {
				Static572.anInt10052 = -8;
			}
			Static572.anInt10051 += (int) (Math.random() * 5.0D) - 2;
			if (Static572.anInt10052 > 8) {
				Static572.anInt10052 = 8;
			}
			if (Static572.anInt10051 < -16) {
				Static572.anInt10051 = -16;
			}
			if (Static572.anInt10051 > 16) {
				Static572.anInt10051 = 16;
			}
			Static572.method7749(arg1, Static572.anInt10052 >> 2 << 10, Static572.anInt10051 >> 1);
			Static572.aClass121_4.method2679(256, 1024);
			Static572.aClass249_4.method5887(256, 256);
			Static572.aClass298_4.method6818(4096);
			Static420.aClass60_1.method1603(256);
			Static142.anInt3092 = 20;
		} else if (Static142.anInt3092 == 20) {
			Static260.method4123(true);
			Static572.method7762(arg0, Static572.anInt10052, Static572.anInt10051);
			Static142.anInt3092 = 60;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 60) {
			if (Static572.aClass348_128.method7970(Static572.aClass4_Sub6_Sub16_3.aString167 + "_staticelements")) {
				if (!Static572.aClass348_128.method7955(Static572.aClass4_Sub6_Sub16_3.aString167 + "_staticelements")) {
					return;
				}
				Static572.aClass42_3 = Static292.method4720(Static572.aClass4_Sub6_Sub16_3.aString167 + "_staticelements", Static258.aBoolean367, Static572.aClass348_128);
			} else {
				Static572.aClass42_3 = new Class42(0);
			}
			Static572.method7759();
			Static142.anInt3092 = 70;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 70) {
			Static343.aClass202_6 = new Class202(arg0, 11, true, Static201.aCanvas7);
			Static142.anInt3092 = 73;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 73) {
			Static79.aClass202_1 = new Class202(arg0, 12, true, Static201.aCanvas7);
			Static142.anInt3092 = 76;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 76) {
			Static233.aClass202_3 = new Class202(arg0, 14, true, Static201.aCanvas7);
			Static142.anInt3092 = 79;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 79) {
			Static229.aClass202_2 = new Class202(arg0, 17, true, Static201.aCanvas7);
			Static142.anInt3092 = 82;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 82) {
			Static409.aClass202_8 = new Class202(arg0, 19, true, Static201.aCanvas7);
			Static142.anInt3092 = 85;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 85) {
			Static280.aClass202_5 = new Class202(arg0, 22, true, Static201.aCanvas7);
			Static142.anInt3092 = 88;
			Static260.method4123(true);
			Static23.method882();
		} else if (Static142.anInt3092 == 88) {
			Static270.aClass202_4 = new Class202(arg0, 26, true, Static201.aCanvas7);
			Static142.anInt3092 = 91;
			Static260.method4123(true);
			Static23.method882();
		} else {
			Static399.aClass202_7 = new Class202(arg0, 30, true, Static201.aCanvas7);
			Static142.anInt3092 = 100;
			Static260.method4123(true);
			Static23.method882();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!ek;)Lclient!bca;")
	public static Class30_Sub1 method2512(@OriginalArg(1) Class4_Sub13 arg0) {
		return new Class30_Sub1(arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7043(), arg0.method7013(), arg0.method7013(), arg0.method7004());
	}
}
