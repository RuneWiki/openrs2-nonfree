import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	public static int anInt3600;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!fj", name = "mb", descriptor = "Lclient!ve;")
	public static Class69 aClass69_32;

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1057 = Static81.method1507("null");

	@OriginalMember(owner = "client!fj", name = "X", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1058 = Static81.method1507("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!fj", name = "nb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1059 = aClass24_1058;

	@OriginalMember(owner = "client!fj", name = "vb", descriptor = "I")
	public static int anInt3643 = 1;

	@OriginalMember(owner = "client!fj", name = "Eb", descriptor = "I")
	public static int anInt3652 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V")
	public static void method2786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static194.anInt4325 == 0 || arg2 == 0 || Static66.anInt1660 >= 50 || arg1 == -1) {
			return;
		}
		Static143.anIntArray270[Static66.anInt1660] = arg1;
		Static48.anIntArray102[Static66.anInt1660] = arg2;
		Static66.anIntArray143[Static66.anInt1660] = arg0;
		Static20.aClass11Array1[Static66.anInt1660] = null;
		Static79.anIntArray163[Static66.anInt1660] = 0;
		Static66.anInt1660++;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBLclient!ve;)Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2 method2792(@OriginalArg(0) int arg0, @OriginalArg(3) Class69 arg1) {
		return Static149.method2564(arg0, 0, arg1) ? Static61.method1190() : null;
	}
}
