import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public static int anInt3206;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static int anInt3198 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!km;IIB)[Lclient!bc;")
	private static Class12[] method2585(@OriginalArg(0) Class91 arg0, @OriginalArg(2) int arg1) {
		return Static240.method3698(0, arg1, arg0) ? Static163.method2822() : null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	public static void method2586(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg0, 6);
		local8.method3911();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method2587() {
		if (Static125.aFloat20 < 128.0F) {
			Static125.aFloat20 = 128.0F;
		}
		@Pc(15) int local15 = Static92.anInt2083 >> 7;
		if (Static125.aFloat20 > 383.0F) {
			Static125.aFloat20 = 383.0F;
		}
		@Pc(26) int local26 = Static114.anInt2610 >> 7;
		while (Static298.aFloat58 >= 2048.0F) {
			Static298.aFloat58 -= 2048.0F;
		}
		while (Static298.aFloat58 < 0.0F) {
			Static298.aFloat58 += 2048.0F;
		}
		@Pc(52) int local52 = Static20.method383(Static114.anInt2610, Static140.anInt3034, Static92.anInt2083);
		@Pc(54) int local54 = 0;
		@Pc(75) int local75;
		if (local15 > 3 && local26 > 3 && local15 < 100 && local26 < 100) {
			for (local75 = local15 - 4; local75 <= local15 + 4; local75++) {
				for (@Pc(84) int local84 = local26 - 4; local84 <= local26 + 4; local84++) {
					@Pc(95) int local95 = Static140.anInt3034;
					if (local95 < 3 && (Static260.aByteArrayArrayArray25[1][local75][local84] & 0x2) == 2) {
						local95++;
					}
					@Pc(133) int local133 = local52 + (Static106.aByteArrayArrayArray17[local95][local75][local84] & 0xFF) * 8 - Static55.anIntArrayArrayArray3[local95][local75][local84];
					if (local133 > local54) {
						local54 = local133;
					}
				}
			}
		}
		local75 = local54 * 192;
		if (local75 > 98048) {
			local75 = 98048;
		}
		if (local75 < 32768) {
			local75 = 32768;
		}
		if (local75 > Static196.anInt2438) {
			Static196.anInt2438 += (local75 - Static196.anInt2438) / 24;
		} else if (Static196.anInt2438 > local75) {
			Static196.anInt2438 += (local75 - Static196.anInt2438) / 80;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!km;)V")
	public static void method2588(@OriginalArg(1) Class91 arg0) {
		Static93.aClass1_Sub2_Sub11_Sub2Array1 = Static6.method206(arg0, Static127.anInt2834);
		Static211.aClass1_Sub2_Sub11Array7 = Static200.method3247(arg0, Static113.anInt2603);
		Static284.aClass1_Sub2_Sub11Array12 = Static200.method3247(arg0, Static260.anInt5628);
		Static248.aClass1_Sub2_Sub11Array10 = Static200.method3247(arg0, Static34.anInt797);
		Static232.aClass1_Sub2_Sub11Array9 = Static200.method3247(arg0, Static220.anInt4365);
		Static135.aClass1_Sub2_Sub11Array3 = Static200.method3247(arg0, Static72.anInt1529);
		Static111.aClass1_Sub2_Sub11Array2 = Static200.method3247(arg0, Static172.anInt3654);
		Static171.aClass1_Sub2_Sub11_15 = Static255.method3910(arg0, Static188.anInt3902);
		Static108.aClass1_Sub2_Sub11Array1 = Static55.method1043(Static114.anInt2621, arg0);
		Static262.aClass1_Sub2_Sub11Array11 = Static55.method1043(Static112.anInt2575, arg0);
		Static178.aClass12Array5 = method2585(arg0, Static187.anInt3896);
		Static221.aClass12Array6 = method2585(arg0, Static170.anInt3634);
		Static39.aClass1_Sub2_Sub1_1.method452(Static221.aClass12Array6, null);
		Static88.aClass1_Sub2_Sub1_2.method452(Static221.aClass12Array6, null);
		Static134.aClass1_Sub2_Sub1_3.method452(Static221.aClass12Array6, null);
		if (Static277.aBoolean412) {
			Static292.aClass12_Sub2Array2 = Static226.method3553(arg0, Static238.anInt3834);
			for (@Pc(103) int local103 = 0; local103 < Static292.aClass12_Sub2Array2.length; local103++) {
				Static292.aClass12_Sub2Array2[local103].method3939();
			}
		}
		@Pc(124) Class1_Sub2_Sub11_Sub2 local124 = Static109.method2013(arg0, Static223.anInt4419, 0);
		local124.method3783();
		if (Static277.aBoolean412) {
			Static77.aClass1_Sub2_Sub11_8 = new Class1_Sub2_Sub11_Sub1(local124);
		} else {
			Static77.aClass1_Sub2_Sub11_8 = local124;
		}
		@Pc(143) Class1_Sub2_Sub11_Sub2[] local143 = Static6.method206(arg0, Static139.anInt3024);
		@Pc(145) int local145;
		for (local145 = 0; local145 < local143.length; local145++) {
			local143[local145].method3783();
		}
		if (Static277.aBoolean412) {
			Static183.aClass1_Sub2_Sub11Array8 = new Class1_Sub2_Sub11[local143.length];
			for (local145 = 0; local145 < local143.length; local145++) {
				Static183.aClass1_Sub2_Sub11Array8[local145] = new Class1_Sub2_Sub11_Sub1(local143[local145]);
			}
		} else {
			Static183.aClass1_Sub2_Sub11Array8 = local143;
		}
		@Pc(199) int local199 = (int) (Math.random() * 21.0D) - 10;
		local145 = (int) (Math.random() * 21.0D) - 10;
		@Pc(213) int local213 = (int) (Math.random() * 21.0D) - 10;
		@Pc(220) int local220 = (int) (Math.random() * 41.0D) - 20;
		@Pc(222) int local222;
		for (local222 = 0; local222 < Static93.aClass1_Sub2_Sub11_Sub2Array1.length; local222++) {
			Static93.aClass1_Sub2_Sub11_Sub2Array1[local222].method3795(local220 + local145, local199 - -local220, local213 + local220);
		}
		if (Static277.aBoolean412) {
			Static194.aClass1_Sub2_Sub11Array6 = new Class1_Sub2_Sub11[Static93.aClass1_Sub2_Sub11_Sub2Array1.length];
			for (local222 = 0; local222 < Static93.aClass1_Sub2_Sub11_Sub2Array1.length; local222++) {
				Static194.aClass1_Sub2_Sub11Array6[local222] = new Class1_Sub2_Sub11_Sub1(Static93.aClass1_Sub2_Sub11_Sub2Array1[local222]);
			}
		} else {
			Static194.aClass1_Sub2_Sub11Array6 = Static93.aClass1_Sub2_Sub11_Sub2Array1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIB)I")
	public static int method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		} else {
			@Pc(18) int local18 = 128 - arg0;
			@Pc(36) int local36 = (arg2 >>> 7 & 0x1FE01FE) * arg0 + local18 * (arg1 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(50) int local50 = arg0 * (arg2 & 0xFF00FF) + local18 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			return (local50 >> 7) + local36;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;JIIIZLjava/lang/String;ZBI)V")
	public static void method2596(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) String arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub11 local28 = new Class1_Sub11(128);
		local28.method2655(10);
		local28.method2660((arg0 ? 4 : 0) | (arg8 ? 1 : 0) | (arg6 ? 2 : 0));
		local28.method2673(arg2);
		local28.method2659(local8[0]);
		local28.method2628(arg7);
		local28.method2659(local8[1]);
		local28.method2660(Static98.anInt2315);
		local28.method2655(arg9);
		local28.method2655(arg3);
		local28.method2659(local8[2]);
		local28.method2660(arg5);
		local28.method2660(arg4);
		local28.method2659(local8[3]);
		local28.method2687(Static233.aBigInteger2, Static87.aBigInteger1);
		@Pc(126) Class1_Sub11 local126 = new Class1_Sub11(350);
		local126.method2628(arg1);
		@Pc(140) int local140 = 8 - Static88.method1533(arg1) % 8;
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			local126.method2655((int) (Math.random() * 255.0D));
		}
		local126.method2625(local8);
		Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
		Static283.aClass1_Sub11_Sub1_3.method2655(22);
		Static283.aClass1_Sub11_Sub1_3.method2660(local28.anInt3264 + local126.anInt3264 + 2);
		Static283.aClass1_Sub11_Sub1_3.method2660(541);
		Static283.aClass1_Sub11_Sub1_3.method2689(local28.anInt3264, local28.aByteArray47);
		Static283.aClass1_Sub11_Sub1_3.method2689(local126.anInt3264, local126.aByteArray47);
		Static264.anInt5178 = 0;
		Static239.anInt4742 = 1;
		Static64.anInt1382 = -3;
		Static178.anInt3968 = 0;
	}
}
