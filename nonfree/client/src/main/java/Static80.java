import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_647 = Static158.method3034("scroll:");

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!ob;")
	public static Class60 aClass60_644 = aClass60_647;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[S")
	public static final short[] aShortArray44 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_645 = Static158.method3034("hel");

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_646 = Static158.method3034("headicons_pk");

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_648 = Static158.method3034("Einloggen");

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
	public static int anInt2383 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_649 = aClass60_647;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lclient!ob;")
	public static Class60 method1892(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static72.method1661(arg0) : Static151.aClass60_742;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static30.anInt901 == 0 || arg0 == 0 || Static40.anInt1296 >= 50 || arg1 == -1) {
			return;
		}
		Static161.anIntArray443[Static40.anInt1296] = arg1;
		Static81.anIntArray268[Static40.anInt1296] = arg0;
		Static49.anIntArray144[Static40.anInt1296] = arg2;
		Static94.aClass23Array1[Static40.anInt1296] = null;
		Static96.anIntArray355[Static40.anInt1296] = 0;
		Static40.anInt1296++;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ca;II)V")
	public static void method1895(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static79.aClass2_Sub3_2 == null) {
			Static47.method2316(null, true, 255, (byte) 0, 0, 255);
			Static151.aClass13_Sub1Array2[arg1] = arg0;
		} else {
			Static79.aClass2_Sub3_2.anInt273 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static79.aClass2_Sub3_2.method206();
			@Pc(22) int local22 = Static79.aClass2_Sub3_2.method206();
			arg0.method543(local16, local22);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method1896() {
		Static122.aClass89_47.method3439();
		Static113.aClass89_43.method3439();
	}
}
