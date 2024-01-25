import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_143 = new Class158("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZZII)Lclient!qs;")
	public static Class211 method4270(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class195 local10 = null;
		if (Static372.aClass187_4 != null) {
			local10 = new Class195(arg2, Static372.aClass187_4, Static257.aClass187Array1[arg2], 1000000);
		}
		Static304.aClass111_Sub1Array2[arg2] = Static88.aClass162_1.method3640(Static169.aClass195_4, arg2, local10);
		if (arg0) {
			Static304.aClass111_Sub1Array2[arg2].method2684();
		}
		return new Class211(Static304.aClass111_Sub1Array2[arg2], arg1, 1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ec;Lclient!ec;Z)V")
	public static void method4271(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1) {
		Static32.method677(Static276.aClass177_76);
		Static433.aClass1_Sub3_Sub1_11.method1197(arg1.anInt2135);
		Static433.aClass1_Sub3_Sub1_11.method1184(arg0.anInt2188);
		Static433.aClass1_Sub3_Sub1_11.method1227(arg1.anInt2188);
		Static433.aClass1_Sub3_Sub1_11.method1227(arg0.anInt2136);
		Static433.aClass1_Sub3_Sub1_11.method1205(arg1.anInt2136);
		Static433.aClass1_Sub3_Sub1_11.method1167(arg0.anInt2135);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BIILclient!ch;)V")
	public static void method4272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30_Sub1_Sub1_Sub2 arg2) {
		if (arg2.anInt1303 == arg0 && arg0 != -1) {
			@Pc(15) Class235 local15 = Static107.aClass239_1.method5420(arg0);
			@Pc(18) int local18 = local15.anInt6852;
			if (local18 == 1) {
				arg2.anInt1267 = 1;
				arg2.anInt1294 = 0;
				arg2.anInt1260 = 0;
				arg2.anInt1271 = arg1;
				arg2.anInt1245 = 0;
				Static290.method4258(arg2.anInt7488, arg2.anInt1294, arg2.aByte102, arg2.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg2, local15);
			}
			if (local18 == 2) {
				arg2.anInt1245 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1303 == -1 || Static107.aClass239_1.method5420(arg0).anInt6856 >= Static107.aClass239_1.method5420(arg2.anInt1303).anInt6856) {
			arg2.anInt1271 = arg1;
			arg2.anInt1267 = 1;
			arg2.anInt1245 = 0;
			arg2.anInt1294 = 0;
			arg2.anInt1303 = arg0;
			arg2.anInt1315 = arg2.anInt1314;
			arg2.anInt1260 = 0;
			if (arg2.anInt1303 != -1) {
				Static290.method4258(arg2.anInt7488, arg2.anInt1294, arg2.aByte102, arg2.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2 == arg2, Static107.aClass239_1.method5420(arg2.anInt1303));
			}
		}
	}
}
