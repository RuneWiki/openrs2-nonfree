import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lclient!ah;")
	public static Class7 aClass7_12;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "J")
	public static long aLong20;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!ib;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_1 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "Z")
	public static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!ca", name = "jb", descriptor = "[I")
	public static int[] anIntArray144 = new int[25];

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public static void method566() {
		anIntArray144 = null;
		aClass3_Sub8_Sub1_1 = null;
		aClass7_12 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIII)V")
	public static void method567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static51.anInt1448 == 0 || arg0 == 0 || Static30.anInt957 >= 50) {
			return;
		}
		Static17.anIntArray135[Static30.anInt957] = arg2;
		Static24.anIntArray155[Static30.anInt957] = arg0;
		Static87.anIntArray421[Static30.anInt957] = arg1;
		Static43.aClass51Array1[Static30.anInt957] = null;
		Static96.anIntArray695[Static30.anInt957] = 0;
		Static30.anInt957++;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ah;IB)Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 method571(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		return Static162.method3012(arg0, arg2, arg1) ? Static70.method1647() : null;
	}
}
