import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array10;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
	public static void method3048(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static36.anInt1129 != -1) {
				Static167.method5985(Static36.anInt1129);
			}
			for (@Pc(16) Class6_Sub9 local16 = (Class6_Sub9) Static432.aClass74_33.method1889(); local16 != null; local16 = (Class6_Sub9) Static432.aClass74_33.method1881()) {
				if (!local16.method6531()) {
					local16 = (Class6_Sub9) Static432.aClass74_33.method1889();
					if (local16 == null) {
						break;
					}
				}
				Static37.method917(true, false, local16);
			}
			Static36.anInt1129 = -1;
			Static432.aClass74_33 = new Class74(8);
			Static400.method5913();
			Static36.anInt1129 = Static291.anInt5197;
			Static26.method687(false);
			Static206.method3172();
			Static166.method2750(Static36.anInt1129);
		}
		Static358.method5305();
		Static327.anInt5630 = -1;
		Static238.method3671(Static28.anInt815);
		Static302.aClass3_Sub2_Sub1_Sub2_2 = new Class3_Sub2_Sub1_Sub2();
		Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 = Static117.anInt2450 * 128 / 2;
		Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 = Static181.anInt3574 * 128 / 2;
		Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0] = Static181.anInt3574 / 2;
		Static229.anInt4187 = 0;
		Static157.anInt3220 = 0;
		Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0] = Static117.anInt2450 / 2;
		if (Static429.anInt7656 == 2) {
			Static157.anInt3220 = Static294.anInt5207 << 7;
			Static229.anInt4187 = Static315.anInt5489 << 7;
		} else {
			Static445.method6521();
		}
		Static245.method3817();
		if (Static157.anInt3220 == 0 || Static229.anInt4187 == 0) {
			Static100.method1818(10);
		} else {
			Static236.method3643();
			Static100.method1818(28);
		}
	}
}
