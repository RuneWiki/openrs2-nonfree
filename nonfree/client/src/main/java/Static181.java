import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array20;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1565 = Static146.method2172("Cancel");

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1563 = aClass77_1565;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array13 = new Class2_Sub2_Sub3_Sub2[1000];

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	public static int anInt4599 = -1;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9 = new int[4][13][13];

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public static final int anInt4601 = 0;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int anInt4605 = 0;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1564 = Static146.method2172("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method3011() {
		if (!Static108.aBoolean112) {
			return;
		}
		Static4.aClass2_Sub2_Sub3_Sub3Array19 = null;
		Static132.aClass2_Sub2_Sub3_Sub3_6 = null;
		Static159.anIntArray569 = null;
		Static75.aClass2_Sub2_Sub3_Sub3Array12 = null;
		Static94.anIntArray386 = null;
		Static126.aClass2_Sub2_Sub3_Sub2Array6 = null;
		Static119.aClass2_Sub2_Sub3_Sub3_5 = null;
		Static86.aClass2_Sub2_Sub3_Sub3Array13 = null;
		Static124.aClass2_Sub2_Sub3_Sub2_5 = null;
		Static48.aClass2_Sub2_Sub3_Sub2_1 = null;
		Static27.anIntArray104 = null;
		Static1.anIntArray1 = null;
		Static1.anIntArray3 = null;
		Static112.aClass2_Sub2_Sub3_Sub3_3 = null;
		Static45.aClass2_Sub2_Sub3_Sub3Array7 = null;
		Static119.aClass2_Sub2_Sub3_Sub3_4 = null;
		Static16.anIntArray72 = null;
		aClass2_Sub2_Sub3_Sub3Array20 = null;
		Static134.anIntArray480 = null;
		Static163.aClass2_Sub2_Sub3_Sub2_7 = null;
		Static141.aClass2_Sub2_Sub3_Sub2_6 = null;
		Static133.anIntArray476 = null;
		Static86.method1586();
		Static176.method2956(true);
		Static108.aBoolean112 = false;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public static void method3013() {
		aClass77_1563 = null;
		anIntArrayArrayArray9 = null;
		aClass2_Sub2_Sub3_Sub3Array20 = null;
		aClass77_1564 = null;
		aClass77_1565 = null;
		aClass2_Sub2_Sub3_Sub2Array13 = null;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)I")
	public static int method3017() {
		return 6;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBZZZ)Lclient!qd;")
	public static Class43_Sub1 method3018(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class64 local1 = null;
		if (Static91.aClass89_2 != null) {
			local1 = new Class64(arg0, Static91.aClass89_2, Static157.aClass89Array1[arg0], 1000000);
		}
		return new Class43_Sub1(local1, Static179.aClass64_4, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)V")
	public static void method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class10 local11 = Static53.aClass10ArrayArrayArray1[Static54.anInt1472][arg0][arg1];
		if (local11 == null) {
			Static172.aClass60_1.method2083(Static54.anInt1472, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub2_Sub1_Sub4 local23 = null;
		@Pc(28) Class2_Sub2_Sub1_Sub4 local28;
		for (local28 = (Class2_Sub2_Sub1_Sub4) local11.method444(); local28 != null; local28 = (Class2_Sub2_Sub1_Sub4) local11.method451()) {
			@Pc(34) Class2_Sub2_Sub9 local34 = Static158.method2689(local28.anInt3104);
			@Pc(37) int local37 = local34.anInt1794;
			if (local34.anInt1795 == 1) {
				local37 *= local28.anInt3107 + 1;
			}
			if (local21 < local37) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static172.aClass60_1.method2083(Static54.anInt1472, arg0, arg1);
			return;
		}
		local11.method447(local23);
		local28 = (Class2_Sub2_Sub1_Sub4) local11.method444();
		@Pc(87) Class2_Sub2_Sub1_Sub4 local87 = null;
		@Pc(89) Class2_Sub2_Sub1_Sub4 local89 = null;
		@Pc(102) int local102 = arg0 + (arg1 << 7) + 1610612736;
		while (local28 != null) {
			if (local28.anInt3104 != local23.anInt3104) {
				if (local89 == null) {
					local89 = local28;
				}
				if (local89.anInt3104 != local28.anInt3104 && local87 == null) {
					local87 = local28;
				}
			}
			local28 = (Class2_Sub2_Sub1_Sub4) local11.method451();
		}
		Static172.aClass60_1.method2057(Static54.anInt1472, arg0, arg1, Static161.method2725(arg0 * 128 + 64, Static54.anInt1472, arg1 * 128 + 64), local23, local102, local89, local87);
	}
}
