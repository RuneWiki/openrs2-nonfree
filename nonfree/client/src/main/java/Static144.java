import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2347(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static439.anInt7133;
		@Pc(9) int[] local9 = Static294.anIntArray593;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class34_Sub1_Sub1_Sub2_Sub1 local21 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && local21 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 && local21.aString25 != null && local21.aString25.equalsIgnoreCase(arg0)) {
				local11 = true;
				@Pc(53) Class3_Sub37 local53;
				if (arg1 == 1) {
					local53 = Static90.method1509(Static645.aClass240_111, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7941(local9[local13]);
					local53.aClass3_Sub4_Sub1_2.method7904(0);
					Static301.method2678(local53);
				} else if (arg1 == 4) {
					local53 = Static90.method1509(Static27.aClass240_9, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7904(0);
					local53.aClass3_Sub4_Sub1_2.method7936(local9[local13]);
					Static301.method2678(local53);
				} else if (arg1 == 5) {
					local53 = Static90.method1509(Static548.aClass240_95, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7936(local9[local13]);
					local53.aClass3_Sub4_Sub1_2.method7955(0);
					Static301.method2678(local53);
				} else if (arg1 == 6) {
					local53 = Static90.method1509(Static470.aClass240_79, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7936(local9[local13]);
					local53.aClass3_Sub4_Sub1_2.method7955(0);
					Static301.method2678(local53);
				} else if (arg1 == 7) {
					local53 = Static90.method1509(Static29.aClass240_12, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7936(local9[local13]);
					local53.aClass3_Sub4_Sub1_2.method7904(0);
					Static301.method2678(local53);
				} else if (arg1 == 9) {
					local53 = Static90.method1509(Static317.aClass240_53, Static226.aClass144_2);
					local53.aClass3_Sub4_Sub1_2.method7936(local9[local13]);
					local53.aClass3_Sub4_Sub1_2.method7948(0);
					Static301.method2678(local53);
				}
				break;
			}
		}
		if (!local11) {
			Static342.method4988(Static114.aClass84_21.method1729(Static654.anInt10668) + arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!dt;Lclient!ec;II)V")
	public static void method2348(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub43 local14 = new Class3_Sub43();
		local14.anInt8226 = arg0.method7954();
		local14.anInt8229 = arg0.method7895();
		local14.anIntArray437 = new int[local14.anInt8226];
		local14.aClass338Array2 = new Class338[local14.anInt8226];
		local14.aByteArrayArrayArray15 = new byte[local14.anInt8226][][];
		local14.anIntArray438 = new int[local14.anInt8226];
		local14.anIntArray436 = new int[local14.anInt8226];
		local14.aClass338Array1 = new Class338[local14.anInt8226];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt8226; local56++) {
			try {
				@Pc(62) int local62 = arg0.method7954();
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(92) int local92;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local84 = arg0.method7922();
					local88 = arg0.method7922();
					local92 = 0;
					if (local62 == 1) {
						local92 = arg0.method7895();
					}
					local14.anIntArray438[local56] = local62;
					local14.anIntArray436[local56] = local92;
					local14.aClass338Array1[local56] = arg1.method1885(local88, Static673.method8968(local84));
				} else if (local62 == 3 || local62 == 4) {
					local84 = arg0.method7922();
					local88 = arg0.method7922();
					local92 = arg0.method7954();
					@Pc(95) String[] local95 = new String[local92];
					for (@Pc(97) int local97 = 0; local97 < local92; local97++) {
						local95[local97] = arg0.method7922();
					}
					@Pc(116) byte[][] local116 = new byte[local92][];
					@Pc(127) int local127;
					if (local62 == 3) {
						for (@Pc(121) int local121 = 0; local121 < local92; local121++) {
							local127 = arg0.method7895();
							local116[local121] = new byte[local127];
							arg0.method7958(0, local116[local121], local127);
						}
					}
					local14.anIntArray438[local56] = local62;
					@Pc(156) Class[] local156 = new Class[local92];
					for (local127 = 0; local127 < local92; local127++) {
						local156[local127] = Static673.method8968(local95[local127]);
					}
					local14.aClass338Array2[local56] = arg1.method1875(local156, Static673.method8968(local84), local88);
					local14.aByteArrayArrayArray15[local56] = local116;
				}
			} catch (@Pc(235) ClassNotFoundException local235) {
				local14.anIntArray437[local56] = -1;
			} catch (@Pc(242) SecurityException local242) {
				local14.anIntArray437[local56] = -2;
			} catch (@Pc(249) NullPointerException local249) {
				local14.anIntArray437[local56] = -3;
			} catch (@Pc(256) Exception local256) {
				local14.anIntArray437[local56] = -4;
			} catch (@Pc(263) Throwable local263) {
				local14.anIntArray437[local56] = -5;
			}
		}
		Static174.aClass302_16.method6613(local14);
	}
}
