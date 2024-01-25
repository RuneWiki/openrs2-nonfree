import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public static int anInt4907;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	public static int anInt4908;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
	public static int anInt4912;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
	public static int anInt4914;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public static int anInt4916;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_130 = new Class77(10, -1);

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "S")
	public static short aShort68 = 1;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_148 = new Class41(21, 2);

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Z")
	public static final boolean aBoolean350 = false;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public static final int anInt4915 = 50;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
	public static final int[] anIntArray604 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[anInt4915];

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "[I")
	public static final int[] anIntArray605 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "[I")
	public static final int[] anIntArray606 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "Lclient!fl;")
	public static final Class75 aClass75_3 = new Class75("LIVE", 0);

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "[I")
	public static final int[] anIntArray607 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "[I")
	public static final int[] anIntArray608 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
	public static final int[] anIntArray609 = new int[anInt4915];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	public static void method4295(@OriginalArg(0) boolean arg0) {
		Static335.aBoolean450 = arg0;
		if (Static11.aClass123_5 != null) {
			Static11.aClass123_5.method2710(!Static43.method900());
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method4296(@OriginalArg(1) Class17 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(59) int local59;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (Static64.aClass17_3 == arg0) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local22 = (local12 >> 4 & 0xF) + Static362.anInt6403 * 2;
			local30 = (local12 & 0xF) + Static203.anInt3730 * 2;
			local37 = local22 + Static85.aClass2_Sub13_Sub2_11.method4217();
			local43 = local30 + Static85.aClass2_Sub13_Sub2_11.method4217();
			local47 = Static85.aClass2_Sub13_Sub2_11.method4251();
			local51 = Static85.aClass2_Sub13_Sub2_11.method4251();
			local55 = Static85.aClass2_Sub13_Sub2_11.method4245();
			local59 = Static85.aClass2_Sub13_Sub2_11.method4217();
			local65 = Static85.aClass2_Sub13_Sub2_11.method4240() * 4;
			local69 = Static85.aClass2_Sub13_Sub2_11.method4245();
			local73 = Static85.aClass2_Sub13_Sub2_11.method4245();
			local77 = Static85.aClass2_Sub13_Sub2_11.method4240();
			@Pc(81) int local81 = Static85.aClass2_Sub13_Sub2_11.method4240();
			if (local77 == 255) {
				local77 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < Static392.anInt6751 * 2 && Static392.anInt6751 * 2 > local30 && local37 >= 0 && local43 >= 0 && Static307.anInt5484 * 2 > local37 && Static307.anInt5484 * 2 > local43 && local55 != 65535) {
				local37 *= 64;
				local30 = local30 * 64;
				local43 *= 64;
				local22 *= 64;
				if (local47 != 0) {
					@Pc(166) int local166;
					@Pc(175) Class12_Sub1_Sub2 local175;
					@Pc(160) int local160;
					@Pc(170) int local170;
					if (local47 < 0) {
						local160 = -local47 - 1;
						local166 = local160 >> 11 & 0xF;
						local170 = local160 & 0x7FF;
						if (local170 == Static194.anInt3441) {
							local175 = Static267.aClass12_Sub1_Sub2_Sub2_1;
						} else {
							local175 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local170];
						}
					} else {
						local160 = local47 - 1;
						local170 = local160 & 0x7FF;
						local166 = local160 >> 11 & 0xF;
						local175 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local170];
					}
					if (local175 != null) {
						@Pc(207) Class170 local207 = local175.method4711();
						if (local207.anIntArrayArray36 != null && local207.anIntArrayArray36[local166] != null) {
							local170 = local207.anIntArrayArray36[local166][0];
							@Pc(229) int local229 = local207.anIntArrayArray36[local166][2];
							@Pc(234) int local234 = local175.aClass32_7.method773();
							@Pc(238) int local238 = Class104.anIntArray705[local234];
							@Pc(242) int local242 = Class104.anIntArray706[local234];
							@Pc(252) int local252 = local170 * local242 + local238 * local229 >> 15;
							@Pc(262) int local262 = local229 * local242 - local238 * local170 >> 15;
							local30 += local262;
							local22 += local252;
							local59 -= local207.anIntArrayArray36[local166][1];
						}
					}
				}
				@Pc(306) Class12_Sub1_Sub1 local306 = new Class12_Sub1_Sub1(local55, Static294.anInt5252, local22, local30, Static18.method508(local30, Static294.anInt5252, local22) - local59, Static295.anInt5281 + local69, local73 + Static295.anInt5281, local77, local81, local51, local65);
				local306.method305(local37, local43, Static18.method508(local43, Static294.anInt5252, local37) - local65, local69 + Static295.anInt5281);
				Static82.aClass210_14.method5044(new Class2_Sub1_Sub12(local306));
			}
		} else if (arg0 == Static320.aClass17_17) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local22 = Static362.anInt6403 + (local12 >> 4 & 0x7);
			local30 = (local12 & 0x7) + Static203.anInt3730;
			local37 = Static85.aClass2_Sub13_Sub2_11.method4245();
			if (local37 == 65535) {
				local37 = -1;
			}
			local43 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local47 = local43 >> 4 & 0xF;
			local51 = local43 & 0x7;
			local55 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local59 = Static85.aClass2_Sub13_Sub2_11.method4240();
			if (local22 >= 0 && local30 >= 0 && local22 < Static392.anInt6751 && local30 < Static307.anInt5484) {
				local65 = local47 + 1;
				if (local22 - local65 <= Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] && Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] <= local22 + local65 && Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0] >= local30 - local65 && local30 + local65 >= Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0] && Static16.anInt400 != 0 && local51 > 0 && Static98.anInt1946 < 50 && local37 != -1) {
					Static133.anIntArray281[Static98.anInt1946] = local37;
					Static17.anIntArray80[Static98.anInt1946] = local51;
					Static299.anIntArray651[Static98.anInt1946] = local55;
					Static146.aClass236Array1[Static98.anInt1946] = null;
					Static21.anIntArray96[Static98.anInt1946] = (Static294.anInt5252 << 24) + local47 - (-(local22 << 16) - (local30 << 8));
					Static198.anIntArray440[Static98.anInt1946] = local59;
					Static98.anInt1946++;
				}
			}
		} else if (Static321.aClass17_18 == arg0) {
			Static85.aClass2_Sub13_Sub2_11.method4240();
			local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local22 = (local12 >> 4 & 0x7) + Static362.anInt6403;
			local30 = (local12 & 0x7) + Static203.anInt3730;
			local37 = Static85.aClass2_Sub13_Sub2_11.method4245();
			local43 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local47 = Static85.aClass2_Sub13_Sub2_11.method4235();
			@Pc(551) String local551 = Static85.aClass2_Sub13_Sub2_11.method4201();
			Static127.method2275(local47, local37, local551, Static294.anInt5252, local30, local43, local22);
		} else if (Static286.aClass17_16 == arg0) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4196();
			local22 = Static362.anInt6403 + (local12 >> 4 & 0x7);
			local30 = Static203.anInt3730 + (local12 & 0x7);
			local37 = Static85.aClass2_Sub13_Sub2_11.method4196();
			local43 = local37 >> 2;
			local47 = local37 & 0x3;
			local51 = Static223.anIntArray504[local43];
			local55 = Static85.aClass2_Sub13_Sub2_11.method4245();
			if (local22 >= 0 && local30 >= 0 && Static392.anInt6751 > local22 && local30 < Static307.anInt5484) {
				Static77.method1394(local43, Static294.anInt5252, local22, local51, local55, local47, local30);
			}
		} else if (Static255.aClass17_7 == arg0) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4229();
			local22 = Static85.aClass2_Sub13_Sub2_11.method4220();
			local30 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local37 = Static362.anInt6403 + (local30 >> 4 & 0x7);
			local43 = Static203.anInt3730 + (local30 & 0x7);
			local47 = Static85.aClass2_Sub13_Sub2_11.method4229();
			if (local37 >= 0 && local43 >= 0 && Static392.anInt6751 > local37 && local43 < Static307.anInt5484 && local12 != Static194.anInt3441) {
				Static211.method3584(new Class2_Sub8(local47, local22), local43, local37, Static294.anInt5252);
				Static45.method2431(local43, Static294.anInt5252, local37);
			}
		} else if (Static217.aClass17_14 == arg0) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4245();
			local22 = Static85.aClass2_Sub13_Sub2_11.method4240();
			Static11.aClass123_5.method2703(local12).method815(local22);
		} else if (Static119.aClass17_10 == arg0) {
			local12 = Static85.aClass2_Sub13_Sub2_11.method4193();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local37 = Static223.anIntArray504[local22];
			local43 = Static85.aClass2_Sub13_Sub2_11.method4240();
			local47 = (local43 >> 4 & 0x7) + Static362.anInt6403;
			local51 = Static203.anInt3730 + (local43 & 0x7);
			if (local47 >= 0 && local51 >= 0 && local47 < Static392.anInt6751 && Static307.anInt5484 > local51) {
				Static77.method1394(local22, Static294.anInt5252, local47, local37, -1, local30, local51);
			}
		} else {
			@Pc(960) Class12_Sub1_Sub1 local960;
			if (Static358.aClass17_19 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local22 = Static362.anInt6403 + (local12 >> 4 & 0x7);
				local30 = (local12 & 0x7) + Static203.anInt3730;
				local37 = local22 + Static85.aClass2_Sub13_Sub2_11.method4217();
				local43 = local30 + Static85.aClass2_Sub13_Sub2_11.method4217();
				local47 = Static85.aClass2_Sub13_Sub2_11.method4251();
				local51 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local55 = Static85.aClass2_Sub13_Sub2_11.method4240() * 4;
				local59 = Static85.aClass2_Sub13_Sub2_11.method4240() * 4;
				local65 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local69 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local73 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local77 = Static85.aClass2_Sub13_Sub2_11.method4240();
				if (local73 == 255) {
					local73 = -1;
				}
				if (local22 >= 0 && local30 >= 0 && Static392.anInt6751 > local22 && local30 < Static307.anInt5484 && local37 >= 0 && local43 >= 0 && local37 < Static392.anInt6751 && local43 < Static307.anInt5484 && local51 != 65535) {
					local30 = local30 * 128 + 64;
					local22 = local22 * 128 + 64;
					local43 = local43 * 128 + 64;
					local37 = local37 * 128 + 64;
					local960 = new Class12_Sub1_Sub1(local51, Static294.anInt5252, local22, local30, Static18.method508(local30, Static294.anInt5252, local22) - local55, local65 + Static295.anInt5281, Static295.anInt5281 + local69, local73, local77, local47, local59);
					local960.method305(local37, local43, Static18.method508(local43, Static294.anInt5252, local37) - local59, Static295.anInt5281 + local65);
					Static82.aClass210_14.method5044(new Class2_Sub1_Sub12(local960));
				}
			} else if (Static73.aClass17_6 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local22 = (local12 >> 4 & 0x7) + Static362.anInt6403;
				local30 = (local12 & 0x7) + Static203.anInt3730;
				local37 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local43 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local47 = Static85.aClass2_Sub13_Sub2_11.method4245();
				if (Static147.aClass214_14 != null && local22 >= 0 && local30 >= 0 && local22 < Static392.anInt6751 && Static307.anInt5484 > local30) {
					@Pc(1057) Class2_Sub5 local1057 = (Class2_Sub5) Static147.aClass214_14.method5059((long) (Static294.anInt5252 << 28 | local30 << 14 | local22));
					if (local1057 != null) {
						for (@Pc(1065) Class2_Sub8 local1065 = (Class2_Sub8) local1057.aClass210_5.method5035(); local1065 != null; local1065 = (Class2_Sub8) local1057.aClass210_5.method5037()) {
							if (local1065.anInt683 == (local37 & 0x7FFF) && local1065.anInt687 == local43) {
								local1065.method5745();
								local1065.anInt687 = local47;
								Static211.method3584(local1065, local30, local22, Static294.anInt5252);
								break;
							}
						}
						Static45.method2431(local30, Static294.anInt5252, local22);
					}
				}
			} else if (Static170.aClass17_13 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local22 = Static85.aClass2_Sub13_Sub2_11.method4193();
				local30 = (local22 >> 4 & 0x7) + Static362.anInt6403;
				local37 = Static203.anInt3730 + (local22 & 0x7);
				if (local30 >= 0 && local37 >= 0 && Static392.anInt6751 > local30 && local37 < Static307.anInt5484) {
					@Pc(1163) Class2_Sub5 local1163 = (Class2_Sub5) Static147.aClass214_14.method5059((long) (Static294.anInt5252 << 28 | local37 << 14 | local30));
					if (local1163 != null) {
						for (@Pc(1171) Class2_Sub8 local1171 = (Class2_Sub8) local1163.aClass210_5.method5035(); local1171 != null; local1171 = (Class2_Sub8) local1163.aClass210_5.method5037()) {
							if ((local12 & 0x7FFF) == local1171.anInt683) {
								local1171.method5745();
								break;
							}
						}
						if (local1163.aClass210_5.method5040()) {
							local1163.method5745();
						}
						Static45.method2431(local37, Static294.anInt5252, local30);
					}
				}
			} else if (Static231.aClass17_15 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local22 = Static362.anInt6403 * 2 + (local12 >> 4 & 0xF);
				local30 = (local12 & 0xF) + Static203.anInt3730 * 2;
				local37 = local22 + Static85.aClass2_Sub13_Sub2_11.method4217();
				local43 = local30 + Static85.aClass2_Sub13_Sub2_11.method4217();
				local47 = Static85.aClass2_Sub13_Sub2_11.method4251();
				local51 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local55 = Static85.aClass2_Sub13_Sub2_11.method4240() * 4;
				local59 = Static85.aClass2_Sub13_Sub2_11.method4240() * 4;
				local65 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local69 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local73 = Static85.aClass2_Sub13_Sub2_11.method4240();
				if (local73 == 255) {
					local73 = -1;
				}
				local77 = Static85.aClass2_Sub13_Sub2_11.method4240();
				if (local22 >= 0 && local30 >= 0 && Static392.anInt6751 * 2 > local22 && local30 < Static392.anInt6751 * 2 && local37 >= 0 && local43 >= 0 && Static307.anInt5484 * 2 > local37 && local43 < Static307.anInt5484 * 2 && local51 != 65535) {
					local30 *= 64;
					local43 = local43 * 64;
					local22 *= 64;
					local37 = local37 * 64;
					local960 = new Class12_Sub1_Sub1(local51, Static294.anInt5252, local22, local30, Static18.method508(local30, Static294.anInt5252, local22) - local55, local65 - -Static295.anInt5281, Static295.anInt5281 + local69, local73, local77, local47, local59);
					local960.method305(local37, local43, Static18.method508(local43, Static294.anInt5252, local37) - local59, Static295.anInt5281 + local65);
					Static82.aClass210_14.method5044(new Class2_Sub1_Sub12(local960));
				}
			} else if (Static115.aClass17_9 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4249();
				local22 = local12 >> 2;
				local30 = local12 & 0x3;
				local37 = Static85.aClass2_Sub13_Sub2_11.method4237();
				local43 = Static85.aClass2_Sub13_Sub2_11.method4245();
				@Pc(1435) byte local1435 = Static85.aClass2_Sub13_Sub2_11.method4217();
				local51 = Static85.aClass2_Sub13_Sub2_11.method4196();
				local55 = (local51 >> 4 & 0x7) + Static362.anInt6403;
				local59 = Static203.anInt3730 + (local51 & 0x7);
				local65 = Static85.aClass2_Sub13_Sub2_11.method4237();
				local69 = Static85.aClass2_Sub13_Sub2_11.method4222();
				@Pc(1465) byte local1465 = Static85.aClass2_Sub13_Sub2_11.method4217();
				@Pc(1469) byte local1469 = Static85.aClass2_Sub13_Sub2_11.method4246();
				@Pc(1473) byte local1473 = Static85.aClass2_Sub13_Sub2_11.method4217();
				if (!Static304.aClass82_4.method4543()) {
					Static173.method2825(local65, local1465, local55, local43, local37, local69, local1473, local1469, local22, local59, local30, local1435, Static294.anInt5252);
				}
			} else if (Static277.aClass17_11 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4196();
				local22 = (local12 >> 4 & 0x7) + Static362.anInt6403;
				local30 = Static203.anInt3730 + (local12 & 0x7);
				local37 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local43 = local37 >> 2;
				local47 = local37 & 0x3;
				local51 = Static223.anIntArray504[local43];
				local55 = Static85.aClass2_Sub13_Sub2_11.method4220();
				if (local55 == 65535) {
					local55 = -1;
				}
				Static80.method1434(local43, local55, local47, local30, local51, Static294.anInt5252, local22);
			} else if (arg0 == Static154.aClass17_12) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4220();
				local22 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local30 = Static362.anInt6403 + (local22 >> 4 & 0x7);
				local37 = Static203.anInt3730 + (local22 & 0x7);
				local43 = Static85.aClass2_Sub13_Sub2_11.method4245();
				if (local30 >= 0 && local37 >= 0 && Static392.anInt6751 > local30 && local37 < Static307.anInt5484) {
					Static211.method3584(new Class2_Sub8(local12, local43), local37, local30, Static294.anInt5252);
					Static45.method2431(local37, Static294.anInt5252, local30);
				}
			} else if (Static98.aClass17_8 == arg0) {
				local12 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local22 = Static362.anInt6403 + (local12 >> 4 & 0x7);
				local30 = Static203.anInt3730 + (local12 & 0x7);
				local37 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local43 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local47 = Static85.aClass2_Sub13_Sub2_11.method4245();
				if (local22 >= 0 && local30 >= 0 && local22 < Static392.anInt6751 && local30 < Static307.anInt5484) {
					local51 = local22 * 128 + 64;
					local55 = local30 * 128 + 64;
					@Pc(1710) Class12_Sub1_Sub6 local1710 = new Class12_Sub1_Sub6(local37, local47, Static295.anInt5281, Static294.anInt5252, local51, Static18.method508(local55, Static294.anInt5252, local51) - local43, local55, local22, local22, local30, local30);
					Static237.aClass210_31.method5044(new Class2_Sub1_Sub16(local1710));
				}
			} else {
				Static235.method3843("T3 - " + arg0, null);
				Static321.method4949();
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([[BLclient!uq;B)V")
	public static void method4297(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class134_Sub1 arg1) {
		@Pc(8) int local8 = Static371.aByteArrayArray22.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(28) int local28 = (Static372.anIntArray785[local10] >> 8) * 64 - Static376.anInt6607;
				@Pc(39) int local39 = (Static372.anIntArray785[local10] & 0xFF) * 64 - Static133.anInt2474;
				Static209.method3549();
				arg1.method5430(local28, local16, Static190.aClass239Array1, Static304.aClass82_4, local39);
			}
		}
	}
}
