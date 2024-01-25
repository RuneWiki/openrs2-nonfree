import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!eg", name = "yb", descriptor = "Lclient!le;")
	public static Class204 aClass204_2;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method1867(@OriginalArg(0) Class126 arg0) {
		if (Static578.anInt9491 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 && (Static535.aClass156ArrayArrayArray2 != null && Static532.method7605(arg0, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125))) {
			Static578.anInt9491 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([J[IB)V")
	public static void method1869(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static508.method7363(arg0, arg0.length - 1, arg1, 0);
	}
}
