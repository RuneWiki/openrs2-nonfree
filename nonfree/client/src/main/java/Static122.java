import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lclient!md;")
	public static final Interface10[] anInterface10Array1 = new Interface10[75];

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_13 = new Class177();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/String;ILclient!um;)Lclient!lq;")
	public static Class153 method1731(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class243 arg2) {
		@Pc(12) int local12 = arg2.method5461(arg1);
		if (local12 == -1) {
			return new Class153(0);
		}
		@Pc(28) int[] local28 = arg2.method5467(local12);
		@Pc(34) Class153 local34 = new Class153(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(43) int local43 = 0;
		while (true) {
			while (local34.anInt3938 > local36) {
				@Pc(57) Class5_Sub15 local57 = new Class5_Sub15(arg2.method5455(local28[local43++], local12));
				@Pc(61) int local61 = local57.method5603();
				@Pc(65) int local65 = local57.method5598();
				@Pc(69) int local69 = local57.method5539();
				if (!arg0 && local69 == 1) {
					local34.anInt3938--;
				} else {
					local34.anIntArray252[local36] = local61;
					local34.anIntArray253[local36] = local65;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILclient!ue;)V")
	public static void method1733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub41 arg2) {
		if (arg2 == null || arg2 == aClass177_13.aClass5_167) {
			return;
		}
		@Pc(18) int local18 = arg2.anInt6818;
		@Pc(21) int local21 = arg2.anInt6819;
		@Pc(24) int local24 = arg2.anInt6815;
		@Pc(28) int local28 = (int) arg2.aLong215;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(37) long local37 = arg2.aLong215;
		@Pc(47) Class76 local47;
		if (local24 == 2) {
			local47 = Static371.method4859(local21, local18);
			if (local47 != null) {
				Static289.method3586();
				@Pc(54) Class5_Sub40 local54 = Static55.method885(local47);
				Static205.method2745(local54.method5384(), local47, local54.anInt6801);
				Static240.aString73 = Static184.method2504(local47);
				Static21.aString3 = local47.aString17 + "<col=ffffff>";
				if (Static240.aString73 == null) {
					Static240.aString73 = "Null";
				}
			}
			return;
		}
		if (local24 == 47 && Static192.aClass76_9 == null) {
			Static394.method5134(local18, local21);
			Static192.aClass76_9 = Static371.method4859(local21, local18);
			Static53.method833(Static192.aClass76_9);
		}
		@Pc(107) Class2_Sub1_Sub3_Sub2 local107;
		if (local24 == 8) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static133.anInt2318 = 2;
				Static35.anInt4181 = arg0;
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				Static288.method3576(Static464.aClass194_119);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5588(local28);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 1004) {
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static133.anInt2318 = 2;
			Static458.anInt7494 = arg1;
			Static288.method3576(Static235.aClass194_64);
			Static281.aClass5_Sub15_Sub2_13.method5588((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5564(local18 + Static31.anInt618);
			Static281.aClass5_Sub15_Sub2_13.method5564(local21 + Static226.anInt3768);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 22) {
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static458.anInt7494 = arg1;
			Static133.anInt2318 = 2;
			Static288.method3576(Static125.aClass194_31);
			Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5588((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static281.aClass5_Sub15_Sub2_13.method5552(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5566(Static226.anInt3768 + local21);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 50) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				Static133.anInt2318 = 2;
				Static35.anInt4181 = arg0;
				Static288.method3576(Static15.aClass194_6);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 30) {
			Static35.anInt4181 = arg0;
			Static190.anInt3182 = 0;
			Static458.anInt7494 = arg1;
			Static133.anInt2318 = 2;
			Static288.method3576(Static417.aClass194_113);
			Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5588((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static226.anInt3768 + local21);
			Static281.aClass5_Sub15_Sub2_13.method5564(local18 + Static31.anInt618);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 10) {
			Static35.anInt4181 = arg0;
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 2;
			Static288.method3576(Static394.aClass194_108);
			Static281.aClass5_Sub15_Sub2_13.method5566(local18 + Static31.anInt618);
			Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5564(Static226.anInt3768 + local21);
			Static281.aClass5_Sub15_Sub2_13.method5588((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 1003) {
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static133.anInt2318 = 2;
			Static458.anInt7494 = arg1;
			Static288.method3576(Static55.aClass194_13);
			Static281.aClass5_Sub15_Sub2_13.method5566(local28);
		}
		if (local24 == 59) {
			Static133.anInt2318 = 2;
			Static35.anInt4181 = arg0;
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static288.method3576(Static289.aClass194_80);
			Static281.aClass5_Sub15_Sub2_13.method5552(Static226.anInt3768 + local21);
			Static281.aClass5_Sub15_Sub2_13.method5552(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5566(local28);
			Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static56.method925(local21, local18);
		}
		if (local24 == 48) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static35.anInt4181 = arg0;
				Static133.anInt2318 = 2;
				Static458.anInt7494 = arg1;
				Static190.anInt3182 = 0;
				Static288.method3576(Static372.aClass194_100);
				Static281.aClass5_Sub15_Sub2_13.method5588(local28);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 4) {
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 2;
			Static35.anInt4181 = arg0;
			Static288.method3576(Static330.aClass194_90);
			Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5552(local18 + Static31.anInt618);
			Static281.aClass5_Sub15_Sub2_13.method5566(local21 + Static226.anInt3768);
			Static281.aClass5_Sub15_Sub2_13.method5564(local28);
			Static56.method925(local21, local18);
		}
		if (local24 == 46) {
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static133.anInt2318 = 2;
			Static288.method3576(Static194.aClass194_52);
			Static281.aClass5_Sub15_Sub2_13.method5588(local18 + Static31.anInt618);
			Static281.aClass5_Sub15_Sub2_13.method5588(local21 + Static226.anInt3768);
			Static281.aClass5_Sub15_Sub2_13.method5588(local28);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static56.method925(local21, local18);
		}
		if (local24 == 23 || local24 == 1008) {
			Static356.method4613(arg2.aString72, local18, local21, local28);
		}
		if (local24 == 25) {
			local47 = Static371.method4859(local21, local18);
			if (local47 != null) {
				Static409.method5398(local47);
			}
		}
		@Pc(760) Class2_Sub1_Sub3_Sub1 local760;
		@Pc(755) Class5_Sub7 local755;
		if (local24 == 1012) {
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 2;
			Static35.anInt4181 = arg0;
			Static458.anInt7494 = arg1;
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				@Pc(763) Class131 local763 = local760.aClass131_1;
				if (local763.anIntArray209 != null) {
					local763 = local763.method2781(Static408.aClass39_1);
				}
				if (local763 != null) {
					Static288.method3576(Static392.aClass194_107);
					Static281.aClass5_Sub15_Sub2_13.method5566(local763.anInt3478);
				}
			}
		}
		if (local24 == 3) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static190.anInt3182 = 0;
				Static133.anInt2318 = 2;
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static288.method3576(Static198.aClass194_54);
				Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 16) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static133.anInt2318 = 2;
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static190.anInt3182 = 0;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static288.method3576(Static425.aClass194_117);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (local24 == 13) {
			Static133.anInt2318 = 2;
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static458.anInt7494 = arg1;
			Static288.method3576(Static198.aClass194_53);
			Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5550(Static143.anInt2595);
			Static281.aClass5_Sub15_Sub2_13.method5566(Static127.anInt2221);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
			Static281.aClass5_Sub15_Sub2_13.method5566(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6126);
		}
		if (local24 == 6) {
			if (Static189.anInt3178 > 0 && Static188.aClass80_1.method1723(82) && Static188.aClass80_1.method1723(81)) {
				Static16.method275(Static226.anInt3768 + local21, local18 + Static31.anInt618, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105);
			} else {
				Static355.method4594(local28, local18, local21);
				if (local28 == 1) {
					Static281.aClass5_Sub15_Sub2_13.method5583(-1);
					Static281.aClass5_Sub15_Sub2_13.method5583(-1);
					Static281.aClass5_Sub15_Sub2_13.method5566((int) Static99.aFloat33);
					Static281.aClass5_Sub15_Sub2_13.method5583(57);
					Static281.aClass5_Sub15_Sub2_13.method5583(Static65.anInt5018);
					Static281.aClass5_Sub15_Sub2_13.method5583(Static430.anInt7181);
					Static281.aClass5_Sub15_Sub2_13.method5583(89);
					Static281.aClass5_Sub15_Sub2_13.method5566(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500);
					Static281.aClass5_Sub15_Sub2_13.method5566(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502);
					Static281.aClass5_Sub15_Sub2_13.method5583(63);
				} else {
					Static133.anInt2318 = 1;
					Static458.anInt7494 = arg1;
					Static190.anInt3182 = 0;
					Static35.anInt4181 = arg0;
				}
				Static159.method2246(-4, 1, 0, local18, 1, true, local21, 0);
			}
		}
		if (local24 == 60) {
			Static35.anInt4181 = arg0;
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 2;
			Static458.anInt7494 = arg1;
			Static288.method3576(Static208.aClass194_55);
			Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static226.anInt3768 + local21);
			Static281.aClass5_Sub15_Sub2_13.method5552(local28);
			Static281.aClass5_Sub15_Sub2_13.method5564(local18 + Static31.anInt618);
			Static56.method925(local21, local18);
		}
		if (local24 == 44) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static35.anInt4181 = arg0;
				Static458.anInt7494 = arg1;
				Static133.anInt2318 = 2;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static190.anInt3182 = 0;
				Static288.method3576(Static73.aClass194_18);
				Static281.aClass5_Sub15_Sub2_13.method5564(local28);
				Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (local24 == 1007) {
			Static133.anInt2318 = 2;
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static288.method3576(Static57.aClass194_14);
			Static281.aClass5_Sub15_Sub2_13.method5566(local28);
		}
		if (local24 == 21) {
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 1;
			Static458.anInt7494 = arg1;
			Static35.anInt4181 = arg0;
			Static288.method3576(Static215.aClass194_58);
			Static281.aClass5_Sub15_Sub2_13.method5550(Static143.anInt2595);
			Static281.aClass5_Sub15_Sub2_13.method5566(local21 + Static226.anInt3768);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static127.anInt2221);
			Static281.aClass5_Sub15_Sub2_13.method5566(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
			Static159.method2246(-4, 1, 0, local18, 1, true, local21, 0);
		}
		if (local24 == 9) {
			Static458.anInt7494 = arg1;
			Static35.anInt4181 = arg0;
			Static133.anInt2318 = 2;
			Static190.anInt3182 = 0;
			Static288.method3576(Static396.aClass194_109);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5588(local28);
			Static281.aClass5_Sub15_Sub2_13.method5550(Static143.anInt2595);
			Static281.aClass5_Sub15_Sub2_13.method5552(Static127.anInt2221);
			Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5564(local21 + Static226.anInt3768);
			Static56.method925(local21, local18);
		}
		if (local24 == 1010 || local24 == 1006 || local24 == 1001 || local24 == 1009 || local24 == 1002) {
			Static63.method994(local18, local24, local28);
		}
		if (local24 == 17) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static190.anInt3182 = 0;
				Static133.anInt2318 = 2;
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static288.method3576(Static119.aClass194_60);
				Static281.aClass5_Sub15_Sub2_13.method5564(local28);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 58) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static133.anInt2318 = 2;
				Static35.anInt4181 = arg0;
				Static288.method3576(Static42.aClass194_11);
				Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (local24 == 15) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static133.anInt2318 = 2;
				Static288.method3576(Static174.aClass194_51);
				Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 11) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static35.anInt4181 = arg0;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static133.anInt2318 = 2;
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				Static288.method3576(Static158.aClass194_39);
				Static281.aClass5_Sub15_Sub2_13.method5562(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5561(Static143.anInt2595);
				Static281.aClass5_Sub15_Sub2_13.method5564(Static127.anInt2221);
				Static281.aClass5_Sub15_Sub2_13.method5566(Static374.anInt6237);
				Static281.aClass5_Sub15_Sub2_13.method5588(local28);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (local24 == 5) {
			Static458.anInt7494 = arg1;
			Static133.anInt2318 = 2;
			Static35.anInt4181 = arg0;
			Static190.anInt3182 = 0;
			Static288.method3576(Static380.aClass194_105);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5564(local18 + Static31.anInt618);
			Static281.aClass5_Sub15_Sub2_13.method5564(local21 + Static226.anInt3768);
			Static281.aClass5_Sub15_Sub2_13.method5564(local28);
			Static56.method925(local21, local18);
		}
		if (local24 == 49) {
			Static190.anInt3182 = 0;
			Static133.anInt2318 = 2;
			Static458.anInt7494 = arg1;
			Static35.anInt4181 = arg0;
			Static288.method3576(Static54.aClass194_12);
			Static281.aClass5_Sub15_Sub2_13.method5588((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static281.aClass5_Sub15_Sub2_13.method5564(Static127.anInt2221);
			Static281.aClass5_Sub15_Sub2_13.method5588(local21 + Static226.anInt3768);
			Static281.aClass5_Sub15_Sub2_13.method5583(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5580(Static143.anInt2595);
			Static281.aClass5_Sub15_Sub2_13.method5564(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5564(Static374.anInt6237);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 45) {
			if (Static189.anInt3178 > 0 && Static188.aClass80_1.method1723(82) && Static188.aClass80_1.method1723(81)) {
				Static16.method275(local21 + Static226.anInt3768, local18 + Static31.anInt618, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105);
			} else {
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static190.anInt3182 = 0;
				Static133.anInt2318 = 1;
				Static288.method3576(Static224.aClass194_62);
				Static281.aClass5_Sub15_Sub2_13.method5566(local18 + Static31.anInt618);
				Static281.aClass5_Sub15_Sub2_13.method5588(Static226.anInt3768 + local21);
			}
		}
		if (local24 == 20) {
			Static458.anInt7494 = arg1;
			Static190.anInt3182 = 0;
			Static35.anInt4181 = arg0;
			Static133.anInt2318 = 2;
			Static288.method3576(Static247.aClass194_67);
			Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
			Static281.aClass5_Sub15_Sub2_13.method5566((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static281.aClass5_Sub15_Sub2_13.method5588(Static31.anInt618 + local18);
			Static281.aClass5_Sub15_Sub2_13.method5552(Static226.anInt3768 + local21);
			Static401.method1727(local37, local18, local21);
		}
		if (local24 == 19) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static133.anInt2318 = 2;
				Static190.anInt3182 = 0;
				Static288.method3576(Static4.aClass194_1);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 51) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static458.anInt7494 = arg1;
				Static35.anInt4181 = arg0;
				Static190.anInt3182 = 0;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static133.anInt2318 = 2;
				Static288.method3576(Static159.aClass194_41);
				Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5552(local28);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (local24 == 18) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static35.anInt4181 = arg0;
				Static190.anInt3182 = 0;
				Static458.anInt7494 = arg1;
				Static133.anInt2318 = 2;
				Static288.method3576(Static217.aClass194_61);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static281.aClass5_Sub15_Sub2_13.method5596(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 12) {
			local107 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local28];
			if (local107 != null) {
				Static133.anInt2318 = 2;
				Static35.anInt4181 = arg0;
				Static458.anInt7494 = arg1;
				Static190.anInt3182 = 0;
				Static288.method3576(Static198.aClass194_53);
				Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5550(Static143.anInt2595);
				Static281.aClass5_Sub15_Sub2_13.method5566(Static127.anInt2221);
				Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
				Static281.aClass5_Sub15_Sub2_13.method5566(local28);
				Static159.method2246(-2, local107.method4913(), 0, local107.anIntArray434[0], local107.method4913(), true, local107.anIntArray433[0], 0);
			}
		}
		if (local24 == 57) {
			local755 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local28);
			if (local755 != null) {
				Static190.anInt3182 = 0;
				Static133.anInt2318 = 2;
				Static35.anInt4181 = arg0;
				local760 = local755.aClass2_Sub1_Sub3_Sub1_1;
				Static458.anInt7494 = arg1;
				Static288.method3576(Static345.aClass194_96);
				Static281.aClass5_Sub15_Sub2_13.method5564(local28);
				Static281.aClass5_Sub15_Sub2_13.method5602(Static188.aClass80_1.method1723(82) ? 1 : 0);
				Static159.method2246(-2, local760.method4913(), 0, local760.anIntArray434[0], local760.method4913(), true, local760.anIntArray433[0], 0);
			}
		}
		if (Static423.aBoolean478) {
			Static289.method3586();
		}
		if (Static78.aClass76_10 != null && Static285.anInt4433 == 0) {
			Static53.method833(Static78.aClass76_10);
		}
	}
}
