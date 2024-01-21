import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!pb;")
	public static Class40 aClass40_17;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_422 = Static34.method846("Members object");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_423 = aClass55_422;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt1134 = 0;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt1138 = 0;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
	public static int method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method738() {
		Static14.aClass21_4.method1445();
		Static81.anIntArray230 = Static30.method790(Static81.anIntArray230);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method739() {
		aClass55_422 = null;
		aClass40_17 = null;
		aClass55_423 = null;
		aLongArray2 = null;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method740() {
		Static47.aClass36_19.method1155();
		Static41.aClass36_17.method1155();
	}
}
