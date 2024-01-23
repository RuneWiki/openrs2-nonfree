import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static237 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[Lclient!rc;")
	public static Class145[] aClass145Array2;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt4589 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[Lclient!sf;")
	public static Class4_Sub2_Sub19[] aClass4_Sub2_Sub19Array4 = new Class4_Sub2_Sub19[14];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)V")
	public static void method3672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static299.anInt5561 = Static132.anInt2785 + Static92.anInt1912 - arg1 - 1;
		Static92.anInt1911 = arg0 - Static81.anInt4033;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method3673() {
		aClass4_Sub2_Sub19Array4 = null;
		aClass145Array2 = null;
	}
}
