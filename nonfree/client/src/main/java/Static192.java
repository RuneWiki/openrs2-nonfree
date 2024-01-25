import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
	public static boolean method2758() {
		@Pc(5) boolean local5 = true;
		if (Static82.aClass301_1 == null) {
			if (Static471.aClass50_136.method897(Static509.anInt5959)) {
				Static82.aClass301_1 = Static684.method7235(Static471.aClass50_136, Static509.anInt5959);
			} else {
				local5 = false;
			}
		}
		if (Static613.aClass301_3 == null) {
			if (Static471.aClass50_136.method897(Static366.anInt6507)) {
				Static613.aClass301_3 = Static684.method7235(Static471.aClass50_136, Static366.anInt6507);
			} else {
				local5 = false;
			}
		}
		if (Static270.aClass301_2 == null) {
			if (Static471.aClass50_136.method897(Static526.anInt8724)) {
				Static270.aClass301_2 = Static684.method7235(Static471.aClass50_136, Static526.anInt8724);
			} else {
				local5 = false;
			}
		}
		if (Static380.aClass198_9 == null) {
			if (Static253.aClass50_66.method897(Static174.anInt2874)) {
				Static380.aClass198_9 = Static249.method3522(Static253.aClass50_66, Static174.anInt2874);
			} else {
				local5 = false;
			}
		}
		if (Static242.aClass301Array3 == null) {
			if (Static471.aClass50_136.method897(Static174.anInt2874)) {
				Static242.aClass301Array3 = Static684.method7229(Static471.aClass50_136, Static174.anInt2874);
			} else {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hk;ZZ)V")
	public static void method2759(@OriginalArg(0) Class5_Sub14_Sub4 arg0) {
		Static549.aClass107_3.method8604(arg0);
		Static18.method273(Static647.aClass50_113, Static2.aClass50_3, Static491.aClass50_146, Static549.aClass107_3, arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
	public static void method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 * Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364() >> 8;
		if (local12 == 0 || arg1 == -1) {
			return;
		}
		if (!Static26.aBoolean13 && Static367.anInt6416 != -1 && Static70.method1031() && !Static102.method1693()) {
			Static409.aClass5_Sub14_Sub4_22 = Static212.method3059();
			@Pc(38) Class5_Sub14_Sub4 local38 = Static373.method5519(Static409.aClass5_Sub14_Sub4_22);
			method2759(local38);
		}
		Static550.method7596(Static537.aClass50_186, local12, arg1);
		Static254.method3575(-1, 255);
		Static26.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([SII)[S")
	public static short[] method2761(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static685.method8327(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
