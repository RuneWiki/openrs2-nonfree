import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
	public static final int[] anIntArray664 = new int[5];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	public static void method7283() {
		Static356.method5617();
		@Pc(17) int local17 = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586();
		if (local17 == 2) {
			Static231.method3614(Static485.aClass126_17, Static438.anInt7403, Static254.anInt4283);
		} else if (local17 == 3) {
			Static5.method65(Static208.anInt3630, Static485.aClass126_17, Static254.anInt4283, Static438.anInt7403, Static426.anInt7223);
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6584()) {
			Static249.method3873(Static181.aCanvas3);
		}
		if (Static485.aClass126_17 != null) {
			Static587.method8246();
		}
		Static605.aBoolean812 = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586() != 0;
		Static144.aBoolean196 = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6584();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!vfa;)Ljava/lang/String;")
	public static String method7286(@OriginalArg(1) Class357 arg0) {
		if (Static74.method1225(arg0).method8730() == 0) {
			return null;
		} else if (arg0.aString141 == null || arg0.aString141.trim().length() == 0) {
			return Static571.aBoolean764 ? "Hidden-use" : null;
		} else {
			return arg0.aString141;
		}
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(Z)V")
	public static void method7287() {
		Static625.aClass293_74.method6930();
	}
}
