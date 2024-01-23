import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_14;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public static int anInt343;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!sc;")
	private static Class107 aClass107_126 = Static231.method3737("white:");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_127 = aClass107_126;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt340 = 0;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt341 = 0;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_128 = aClass107_126;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_129 = Static231.method3737("compass");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIII)V")
	public static void method337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static91.anInt1982 == 0 || arg2 == 0 || Static204.anInt2501 >= 50 || arg0 == -1) {
			return;
		}
		Static173.anIntArray331[Static204.anInt2501] = arg0;
		Static195.anIntArray352[Static204.anInt2501] = arg2;
		Static157.anIntArray303[Static204.anInt2501] = arg1;
		Static87.aClass43Array1[Static204.anInt2501] = null;
		Static161.anIntArray308[Static204.anInt2501] = 0;
		Static204.anInt2501++;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method338() {
		Static166.anIntArrayArrayArray11 = Static55.anIntArrayArrayArray5;
		Static174.aClass1_Sub9ArrayArrayArray2 = Static216.aClass1_Sub9ArrayArrayArray3;
		Static11.anInt296 = Static174.aClass1_Sub9ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method342() {
		@Pc(5) Class102 local5 = Static146.aClass102_1;
		synchronized (Static146.aClass102_1) {
			Static182.anInt4083++;
			Static198.anInt4319 = Static180.anInt4993;
			Static220.anInt4822 = Static131.anInt2852;
			Static181.anInt4311 = Static134.anInt2938;
			Static95.anInt2075 = Static211.anInt4552;
			Static20.anInt2218 = Static170.anInt3702;
			Static161.anInt3533 = Static233.anInt5001;
			Static232.aLong155 = Static77.aLong61;
			Static211.anInt4552 = 0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!jb;ZLclient!eb;Lclient!jb;)V")
	public static void method343(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class28 arg2) {
		Static142.aClass28_55 = arg2;
		Static119.anInterface1_1 = arg1;
		Static59.aClass28_26 = arg0;
	}
}
