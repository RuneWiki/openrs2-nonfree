import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	public static boolean aBoolean323;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[S")
	public static short[] aShortArray47;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_18 = new Class269(13, 7);

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_86 = new Class12(94, -1);

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method2383() {
		for (@Pc(15) Class1_Sub19 local15 = (Class1_Sub19) Static202.aClass227_21.method4967(); local15 != null; local15 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			if (Static96.method2905(local15.anInt2416)) {
				Static65.method1077(local15);
			}
		}
		if (Static118.anInt2201 == 1) {
			Static145.method1627();
			return;
		}
		Static384.method5031(Static187.anInt3228, Static387.anInt6440, Static413.anInt6778, Static129.anInt2365);
		@Pc(51) int local51 = Static451.aClass89_10.method1995(Static420.aClass119_169.method2673(Static394.anInt6582));
		for (@Pc(56) Class1_Sub19 local56 = (Class1_Sub19) Static202.aClass227_21.method4967(); local56 != null; local56 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			@Pc(62) int local62 = Static125.method1994(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static413.anInt6778 = local51 + 8;
		Static387.anInt6440 = (Static382.aBoolean780 ? 26 : 22) + Static118.anInt2201 * 16;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!jk;BI)I")
	public static int method2384(@OriginalArg(0) Class124 arg0, @OriginalArg(2) int arg1) {
		if (!Static55.method970(arg0).method2817(arg1) && arg0.anObjectArray28 == null) {
			return -1;
		} else if (arg0.anIntArray215 == null || arg1 >= arg0.anIntArray215.length) {
			return -1;
		} else {
			return arg0.anIntArray215[arg1];
		}
	}
}
