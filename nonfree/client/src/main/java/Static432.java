import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public static int anInt7295;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "J")
	public static long aLong224 = 0L;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_52 = new Class227();

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
	public static final int[] anIntArray491 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	public static void method5705() {
		Static118.anInt2201 = 0;
		Static202.aClass227_21.method4981();
		Static17.aBoolean39 = false;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)Z")
	public static boolean method5707(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
