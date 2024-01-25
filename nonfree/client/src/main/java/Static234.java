import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static234 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_34 = new Class268(64);

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt4001 = 0;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt4003 = 0;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public static void method3419() {
		if (Static345.anInt5823 == 6) {
			Static168.method2583(false);
		} else {
			Static401.aClass116_2 = Static328.aClass116_1;
			Static328.aClass116_1 = null;
			Static393.method5432(12);
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)V")
	public static void method3420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static389.aClass227ArrayArrayArray3 = Static137.aClass227ArrayArrayArray1;
			Static178.aClass55Array1 = Static349.aClass55Array3;
		} else {
			Static389.aClass227ArrayArrayArray3 = Static257.aClass227ArrayArrayArray4;
			Static178.aClass55Array1 = Static182.aClass55Array2;
		}
		Static174.anInt3263 = Static389.aClass227ArrayArrayArray3.length;
	}
}
