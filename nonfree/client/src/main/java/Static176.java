import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int anInt3607;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray68;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	public static volatile int anInt3605 = 0;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1037 = Static181.method2795("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1038 = Static181.method2795("Passwort: ");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public static int anInt3611 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lclient!ij;")
	public static Class2_Sub2_Sub14 method2703(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub14 local18 = (Class2_Sub2_Sub14) Static18.aClass86_27.method2643((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static52.aClass28_59.method852(arg0, 4);
		local18 = new Class2_Sub2_Sub14();
		if (local28 != null) {
			local18.method1493(new Class2_Sub3(local28), arg0);
		}
		Static18.aClass86_27.method2647(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ae;III)V")
	public static void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static170.anInt3526 >= 3) {
			Static126.method2122(arg0, arg2, arg1.anIntArray16, arg1.anIntArray6);
		} else {
			((Class2_Sub2_Sub17_Sub1) Static138.aClass2_Sub2_Sub17_5).method1925(arg0, arg2, arg1.anInt157, arg1.anInt100, Static138.aClass2_Sub2_Sub17_5.anInt2527 / 2, Static138.aClass2_Sub2_Sub17_5.anInt2524 / 2, Static210.anInt4184, arg1.anIntArray16, arg1.anIntArray6);
		}
		Static162.aBooleanArray28[arg3] = true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 method2705() {
		@Pc(9) byte[] local9 = Static151.aByteArrayArray14[0];
		@Pc(17) int local17 = Static131.anIntArray284[0] * Static163.anIntArray314[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = Static153.anIntArray317[local9[local22] & 0xFF];
		}
		@Pc(57) Class2_Sub2_Sub17_Sub1 local57 = new Class2_Sub2_Sub17_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[0], Static124.anIntArray251[0], Static163.anIntArray314[0], Static131.anIntArray284[0], local20);
		Static17.method372();
		return local57;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
	public static int method2707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static82.method1477(arg1 - 1, arg0 + -1) + Static82.method1477(arg1 + 1, arg0 - 1) + Static82.method1477(arg1 - 1, arg0 + 1) + Static82.method1477(arg1 + 1, arg0 + 1);
		@Pc(77) int local77 = Static82.method1477(arg1 - 1, arg0) + Static82.method1477(arg1 + 1, arg0) + Static82.method1477(arg1, arg0 - 1) + Static82.method1477(arg1, arg0 + 1);
		@Pc(82) int local82 = Static82.method1477(arg1, arg0);
		return local82 / 4 + local47 / 16 + local77 / 8;
	}
}
