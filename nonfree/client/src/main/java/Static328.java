import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray143 = new String[5];

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_213 = new Class184(41, 18);

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!qa;Lclient!dn;B)V")
	public static void method4780(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class56 arg1) {
		if (Static112.aBoolean440) {
			return;
		}
		arg0.M(0);
		Static367.aClass22_18 = arg0.method2590(Static460.method3988(arg1, Static97.anInt2135));
		Static367.aClass22_18.method6074((Static385.anInt6686 - Static367.aClass22_18.ja()) / 2, (Static120.anInt2616 - Static367.aClass22_18.JA()) / 2);
		Static267.aClass22_13 = arg0.method2590(Static460.method3988(arg1, Static376.anInt7413));
		Static267.aClass22_13.method6074((Static385.anInt6686 - Static267.aClass22_13.ja()) / 2, 18);
		Static112.aBoolean440 = true;
	}
}
