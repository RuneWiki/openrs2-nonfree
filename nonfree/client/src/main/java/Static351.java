import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
	public static final int[] anIntArray398 = new int[500];

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[4096];

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!ns;Lclient!ns;)V")
	public static void method5754(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_299 != null) {
			arg0.method8671();
		}
		arg0.aClass3_300 = arg1;
		arg0.aClass3_299 = arg1.aClass3_299;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!gaa;)Ljava/lang/String;")
	public static String method5755(@OriginalArg(1) Class108 arg0) {
		if (Static71.method1836(arg0).method1191() == 0) {
			return null;
		} else if (arg0.aString35 == null || arg0.aString35.trim().length() == 0) {
			return Static401.aBoolean650 ? "Hidden-use" : null;
		} else {
			return arg0.aString35;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
	public static void method5756(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub21 local12 = Static57.method8561(arg0, 8);
		local12.method8628();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIILclient!vl;)V")
	public static void method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub3_Sub5 arg3) {
		@Pc(4) Class106 local4 = Static139.method3134(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub3_Sub5_1 = arg3;
		@Pc(16) int local16 = Static500.aClass274Array2 == Static524.aClass274Array3 ? 1 : 0;
		if (arg3.method8570()) {
			if (arg3.method8579()) {
				arg3.aClass2_Sub3_23 = Static464.aClass2_Sub3Array6[local16];
				Static464.aClass2_Sub3Array6[local16] = arg3;
				return;
			}
			arg3.aClass2_Sub3_23 = Static44.aClass2_Sub3Array3[local16];
			Static44.aClass2_Sub3Array3[local16] = arg3;
			Static160.aBoolean330 = true;
			return;
		}
		arg3.aClass2_Sub3_23 = Static634.aClass2_Sub3Array7[local16];
		Static634.aClass2_Sub3Array7[local16] = arg3;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method5758() {
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.lb, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub14_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub25_2, 2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub25_1, 2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub12_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub16_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub22_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub17_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub13_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub4_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub20_1, 2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub7_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub26_1, 2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub28_1, 1);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub24_1, 0);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub24_2, 0);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub23_1, 2);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub29_1, 0);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub19_1, 0);
		Static295.method5069();
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub6_1, 0);
		Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub5_1, 4);
		Static379.method6035();
		Static34.method625();
		Static439.aBoolean678 = true;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!dfa;)I")
	public static int method5760(@OriginalArg(1) Class3_Sub15_Sub1 arg0) {
		@Pc(12) int local12 = arg0.method2432(2);
		@Pc(25) int local25;
		if (local12 == 0) {
			local25 = 0;
		} else if (local12 == 1) {
			local25 = arg0.method2432(5);
		} else if (local12 == 2) {
			local25 = arg0.method2432(8);
		} else {
			local25 = arg0.method2432(11);
		}
		return local25;
	}
}
