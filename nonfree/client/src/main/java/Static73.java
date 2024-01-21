import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "Lclient!pb;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_607 = Static120.method2057("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_608 = Static120.method2057("::fps ");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method1274() {
		while (true) {
			if (Static21.aClass1_Sub8_Sub1_1.method364(Static98.anInt2162) >= 27) {
				@Pc(14) int local14 = Static21.aClass1_Sub8_Sub1_1.method375(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local14] == null) {
						local19 = true;
						Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local14] = new Class1_Sub2_Sub1_Sub3_Sub2();
					}
					@Pc(35) Class1_Sub2_Sub1_Sub3_Sub2 local35 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local14];
					Static85.anIntArray15[Static35.anInt962++] = local14;
					local35.anInt3022 = Static142.anInt3104;
					@Pc(51) int local51 = Static21.aClass1_Sub8_Sub1_1.method375(1);
					if (local51 == 1) {
						Static90.anIntArray221[Static77.anInt1829++] = local14;
					}
					@Pc(69) int local69 = Static21.aClass1_Sub8_Sub1_1.method375(1);
					@Pc(74) int local74 = Static21.aClass1_Sub8_Sub1_1.method375(5);
					if (local74 > 15) {
						local74 -= 32;
					}
					local35.aClass1_Sub2_Sub5_1 = Static171.method3011(Static21.aClass1_Sub8_Sub1_1.method375(14));
					@Pc(95) int local95 = Static135.anIntArray230[Static21.aClass1_Sub8_Sub1_1.method375(3)];
					if (local19) {
						local35.anInt3049 = local35.anInt3048 = local95;
					}
					@Pc(108) int local108 = Static21.aClass1_Sub8_Sub1_1.method375(5);
					local35.anInt3017 = local35.aClass1_Sub2_Sub5_1.anInt1018;
					local35.anInt3055 = local35.aClass1_Sub2_Sub5_1.anInt1004;
					local35.anInt3036 = local35.aClass1_Sub2_Sub5_1.anInt1021;
					if (local108 > 15) {
						local108 -= 32;
					}
					local35.anInt3033 = local35.aClass1_Sub2_Sub5_1.anInt996;
					local35.anInt3041 = local35.aClass1_Sub2_Sub5_1.anInt1006;
					local35.anInt3051 = local35.aClass1_Sub2_Sub5_1.anInt1010;
					local35.anInt3034 = local35.aClass1_Sub2_Sub5_1.anInt1001;
					if (local35.anInt3041 == 0) {
						local35.anInt3048 = 0;
					}
					local35.anInt3061 = local35.aClass1_Sub2_Sub5_1.anInt1008;
					local35.anInt3009 = local35.aClass1_Sub2_Sub5_1.anInt1019;
					local35.method2362(local108 + Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray324[0], Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anIntArray326[0] + local74, local69 == 1);
					continue;
				}
			}
			Static21.aClass1_Sub8_Sub1_1.method367();
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLclient!j;I)V")
	public static void method1275(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class41 arg1) {
		if (Static160.aClass41_4 != null) {
			try {
				Static160.aClass41_4.method1340();
			} catch (@Pc(12) Exception local12) {
			}
			Static160.aClass41_4 = null;
		}
		Static160.aClass41_4 = arg1;
		Static147.method2503(arg0);
		Static44.aClass1_Sub8_1 = null;
		Static2.aClass1_Sub2_Sub10_1 = null;
		Static54.anInt1298 = 0;
		Static106.aClass1_Sub8_4.anInt446 = 0;
		while (true) {
			@Pc(33) Class1_Sub2_Sub10 local33 = (Class1_Sub2_Sub10) Static187.aClass5_13.method140();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub2_Sub10) Static153.aClass5_10.method140();
					if (local33 == null) {
						if (Static115.aByte5 != 0) {
							try {
								@Pc(88) Class1_Sub8 local88 = new Class1_Sub8(4);
								local88.method331(4);
								local88.method331(Static115.aByte5);
								local88.method337(0);
								Static160.aClass41_4.method1339(4, local88.aByteArray3);
							} catch (@Pc(109) IOException local109) {
								try {
									Static160.aClass41_4.method1340();
								} catch (@Pc(114) Exception local114) {
								}
								Static40.anInt1052++;
								Static160.aClass41_4 = null;
							}
						}
						Static14.anInt289 = 0;
						Static60.aLong48 = Static23.method507();
						return;
					}
					Static2.aClass71_1.method2255(local33);
					Static71.aClass5_5.method138(local33, local33.aLong148);
					Static129.anInt2840--;
					Static117.anInt4121++;
				}
			}
			Static9.aClass5_3.method138(local33, local33.aLong148);
			Static66.anInt1658++;
			Static6.anInt149--;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public static void method1276() {
		aClass81_608 = null;
		aClass81_607 = null;
		anIntArray154 = null;
		anIntArray156 = null;
		aClass66_2 = null;
		anIntArray155 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!ub;")
	public static Class1_Sub2_Sub18 method1277(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = (Class1_Sub2_Sub18) Static17.aClass59_3.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static149.aClass82_60.method2942(arg0, 12);
		local10 = new Class1_Sub2_Sub18();
		if (local25 != null) {
			local10.method2895(new Class1_Sub8(local25));
		}
		local10.method2896();
		Static17.aClass59_3.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BI)[B")
	public static byte[] method1278(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(12) int local12 = local8.method336();
		@Pc(16) int local16 = local8.method347();
		if (local16 < 0 || Static147.anInt3267 != 0 && Static147.anInt3267 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(38) byte[] local38 = new byte[local16];
			local8.method319(local16, local38);
			return local38;
		} else {
			@Pc(52) int local52 = local8.method347();
			if (local52 < 0 || Static147.anInt3267 != 0 && Static147.anInt3267 < local52) {
				throw new RuntimeException();
			}
			@Pc(66) byte[] local66 = new byte[local52];
			if (local12 == 1) {
				Static76.method1330(local66, local52, arg0, local16);
			} else {
				Static60.aClass60_1.method2024(local8, local66);
			}
			return local66;
		}
	}
}
