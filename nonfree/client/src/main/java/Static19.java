import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
	public static int anInt644;

	@OriginalMember(owner = "client!ce", name = "vb", descriptor = "I")
	public static volatile int anInt648 = 0;

	@OriginalMember(owner = "client!ce", name = "wb", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 6, 0, 0, -2, 0, 0, 0, -1, 0, 0, 3, 0, 5, 0, 2, 0, 5, 4, -1, 11, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 3, 3, 0, 0, 11, 0, 0, 0, 5, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 6, 7, 0, 0, 0, 0, 6, -2, -1, 0, 6, 4, -2, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 5, 0, 0, 0, 0, -2, 0, 7, 0, 2, 3, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 2, 12, 0, 0, 0, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 6, 4, 0, 0, 2, 0, -1, 0, 0, 0, -2, 6, 6, 0, 4, 2, 2, 1, 0, -2, 0, 0, 0, 0, 6, 0, 0, -2, 14, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 1, 2, 10, 0, 0, 2, 0, 0, 0, -2, 1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 6, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 15, 0, 0, -2, 0, 1, 7, 6, 0, 0, 0 };

	@OriginalMember(owner = "client!ce", name = "xb", descriptor = "Lclient!af;")
	public static Class5 aClass5_319 = Static45.method1937("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!ce", name = "zb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public static void method480(@OriginalArg(0) int arg0) {
		if (Static125.anInt3198 == 0) {
			Static2.aClass1_Sub1_Sub3_1.method1176(arg0);
		} else {
			Static70.anInt1621 = arg0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)I")
	public static int method481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(17) int local17 = method481(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local17 *= arg0;
			}
			return local17;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!sa;Lclient!r;)V")
	public static void method482(@OriginalArg(0) int arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class41_Sub1 arg2) {
		@Pc(12) Class1_Sub19 local12 = new Class1_Sub19();
		local12.aLong95 = arg0;
		local12.aClass70_3 = arg1;
		local12.anInt2528 = 1;
		local12.aClass41_Sub1_18 = arg2;
		@Pc(27) Class53 local27 = Static8.aClass53_4;
		synchronized (Static8.aClass53_4) {
			Static8.aClass53_4.method1449(local12);
		}
		Static11.method290();
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	public static void method483() {
		for (@Pc(12) int local12 = 0; local12 < Static86.anInt2184; local12++) {
			@Pc(18) int local18 = Static20.anIntArray83[local12];
			@Pc(22) Class1_Sub3_Sub4_Sub2_Sub1 local22 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = Static79.aClass1_Sub20_Sub1_2.method2053();
			if ((local26 & 0x2) != 0) {
				local26 += Static79.aClass1_Sub20_Sub1_2.method2053() << 8;
			}
			Static59.method1062(local18, local26, local22);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
	public static int method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static17.method423(4, arg1 + 91923, arg0 + 45365) + (Static17.method423(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static17.method423(1, arg1, arg0) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
	public static void method485() {
		aClass5_319 = null;
		aBooleanArray9 = null;
		anIntArray82 = null;
	}
}
