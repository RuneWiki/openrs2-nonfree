import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString341 = "Connection lost.";

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString342 = "red:";

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "[F")
	public static float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "[I")
	public static int[] anIntArray445 = new int[128];

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method3611() {
		if (Static241.method3782() || Static204.anInt4430 == Static185.anInt4085) {
			Static167.method2738();
			if (Static102.anInt860 != Static185.anInt4085) {
				Static254.method3876();
			}
		} else {
			Static229.method3621(Static185.anInt4085, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], false, Static288.anInt5790, Static279.anInt5604, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], false);
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method3612() {
		@Pc(9) int local9 = Static176.aClass1_Sub3_Sub5_2.method3510(Static8.aString19);
		@Pc(11) int local11;
		@Pc(20) int local20;
		for (local11 = 0; local11 < Static181.anInt3973; local11++) {
			local20 = Static176.aClass1_Sub3_Sub5_2.method3510(Static56.method1051(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		local9 += 8;
		local11 = Static181.anInt3973 * 15 + 21;
		local20 = Static57.anInt6304 - local9 / 2;
		if (Static38.anInt950 < local20 + local9) {
			local20 = Static38.anInt950 - local9;
		}
		@Pc(79) int local79 = Static107.anInt1674;
		if (local20 < 0) {
			local20 = 0;
		}
		if (local11 + local79 > Static270.anInt5412) {
			local79 = Static270.anInt5412 - local11;
		}
		if (local79 < 0) {
			local79 = 0;
		}
		if (Static163.anInt3550 == 1) {
			if (Static114.anInt2473 == Static57.anInt6304 && Static107.anInt1674 == Static63.anInt1366) {
				Static303.anInt6021 = local79;
				Static175.anInt266 = (Static161.aBoolean230 ? 26 : 22) + Static181.anInt3973 * 15;
				Static128.aBoolean171 = true;
				Static96.anInt2211 = local20;
				Static163.anInt3550 = 0;
				Static60.anInt1307 = local9;
			}
		} else if (Static57.anInt6304 == Static89.anInt5976 && Static94.anInt2165 == Static107.anInt1674) {
			Static303.anInt6021 = local79;
			Static96.anInt2211 = local20;
			Static163.anInt3550 = 0;
			Static60.anInt1307 = local9;
			Static128.aBoolean171 = true;
			Static175.anInt266 = (Static161.aBoolean230 ? 26 : 22) + Static181.anInt3973 * 15;
		} else {
			Static63.anInt1366 = Static94.anInt2165;
			Static163.anInt3550 = 1;
			Static114.anInt2473 = Static89.anInt5976;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILclient!hd;Lclient!hd;IIJ)V")
	public static void method3614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) Class2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class136 local8 = new Class136();
		local8.aLong182 = arg8;
		local8.anInt4699 = arg1 * 128 + 64;
		local8.anInt4697 = arg2 * 128 + 64;
		local8.anInt4701 = arg3;
		local8.aClass2_10 = arg4;
		local8.aClass2_9 = arg5;
		local8.anInt4700 = arg6;
		local8.anInt4694 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static7.aClass1_Sub2ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static7.aClass1_Sub2ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub2(local42, arg1, arg2);
			}
		}
		Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass136_1 = local8;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method3615(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static253.aClass185_1);
		arg0.removeMouseMotionListener(Static253.aClass185_1);
		arg0.removeFocusListener(Static253.aClass185_1);
		Static252.anInt5112 = 0;
	}
}
