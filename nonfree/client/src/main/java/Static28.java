import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
	public static int anInt888;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lclient!pa;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString39 = " has logged out.";

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3 local11 = Static138.aClass3ArrayArrayArray1[Static137.anInt3321][arg1][arg0];
		if (local11 == null) {
			Static35.method624(Static137.anInt3321, arg1, arg0);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class1_Sub2_Sub14 local27 = null;
		@Pc(32) Class1_Sub2_Sub14 local32;
		for (local32 = (Class1_Sub2_Sub14) local11.method30(); local32 != null; local32 = (Class1_Sub2_Sub14) local11.method33()) {
			@Pc(39) Class89 local39 = Static93.method2006(local32.aClass9_Sub2_1.anInt529);
			@Pc(42) int local42 = local39.anInt3673;
			if (local39.anInt3650 == 1) {
				local42 *= local32.aClass9_Sub2_1.anInt532 + 1;
			}
			if (local25 < local42) {
				local27 = local32;
				local25 = local42;
			}
		}
		if (local27 == null) {
			Static35.method624(Static137.anInt3321, arg1, arg0);
			return;
		}
		local11.method31(local27);
		local32 = (Class1_Sub2_Sub14) local11.method30();
		@Pc(89) Class9_Sub2 local89 = null;
		@Pc(91) Class9_Sub2 local91 = null;
		while (local32 != null) {
			@Pc(95) Class9_Sub2 local95 = local32.aClass9_Sub2_1;
			if (local95.anInt529 != local27.aClass9_Sub2_1.anInt529) {
				if (local89 == null) {
					local89 = local95;
				}
				if (local89.anInt529 != local95.anInt529 && local91 == null) {
					local91 = local95;
				}
			}
			local32 = (Class1_Sub2_Sub14) local11.method33();
		}
		@Pc(134) long local134 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static158.method2805(Static137.anInt3321, arg1, arg0, Static200.method3326(Static137.anInt3321, arg0 * 128 + 64, arg1 * 128 + 64), local27.aClass9_Sub2_1, local134, local89, local91);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;JIZZLjava/lang/String;IIZI)V")
	public static void method575(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub13 local28 = new Class1_Sub13(128);
		local28.method1766(10);
		local28.method1789((arg3 ? 4 : 0) | (arg4 ? 2 : 0) | (arg8 ? 1 : 0));
		local28.method1770(arg2);
		local28.method1754(local8[0]);
		local28.method1791(arg5);
		local28.method1754(local8[1]);
		local28.method1789(Static145.anInt3517);
		local28.method1766(arg9);
		local28.method1766(arg0);
		local28.method1754(local8[2]);
		local28.method1789(arg6);
		local28.method1789(arg7);
		local28.method1754(local8[3]);
		local28.method1804(Static101.aBigInteger1, Static208.aBigInteger2);
		@Pc(123) Class1_Sub13 local123 = new Class1_Sub13(350);
		local123.method1791(arg1);
		@Pc(136) int local136 = 8 - Static201.method3338(arg1) % 8;
		for (@Pc(138) int local138 = 0; local138 < local136; local138++) {
			local123.method1766((int) (Math.random() * 255.0D));
		}
		local123.method1762(local8);
		Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
		Static171.aClass1_Sub13_Sub1_3.method1766(22);
		Static171.aClass1_Sub13_Sub1_3.method1789(local28.anInt2395 + local123.anInt2395 + 2);
		Static171.aClass1_Sub13_Sub1_3.method1789(535);
		Static171.aClass1_Sub13_Sub1_3.method1771(local28.aByteArray29, local28.anInt2395);
		Static171.aClass1_Sub13_Sub1_3.method1771(local123.aByteArray29, local123.anInt2395);
		Static52.anInt1463 = 0;
		Static117.anInt3043 = 1;
		Static170.anInt3979 = 0;
		Static243.anInt5242 = -3;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIB)V")
	public static void method576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static150.anInt3860 = arg1;
		Static167.anInt3907 = 0;
		Static202.anInt4469 = 0;
		Static94.anInt4237 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/StringBuffer;CI)Ljava/lang/StringBuffer;")
	public static StringBuffer method577(@OriginalArg(1) StringBuffer arg0) {
		@Pc(4) int local4 = arg0.length();
		arg0.setLength(0);
		for (@Pc(18) int local18 = local4; local18 < 0; local18++) {
			arg0.setCharAt(local18, ' ');
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(B)V")
	public static void method580() {
		Static238.anInt5142 = 0;
		@Pc(8) int local8 = Static29.anInt907 + (Static83.aClass9_Sub1_Sub1_1.anInt479 >> 7);
		@Pc(15) int local15 = Static64.anInt1786 + (Static83.aClass9_Sub1_Sub1_1.anInt427 >> 7);
		if (local15 >= 3053 && local15 <= 3156 && local8 >= 3056 && local8 <= 3136) {
			Static238.anInt5142 = 1;
		}
		if (local15 >= 3072 && local15 <= 3118 && local8 >= 9492 && local8 <= 9535) {
			Static238.anInt5142 = 1;
		}
		if (Static238.anInt5142 == 1 && local15 >= 3139 && local15 <= 3199 && local8 >= 3008 && local8 <= 3062) {
			Static238.anInt5142 = 0;
		}
	}
}
