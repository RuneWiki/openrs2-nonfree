import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!t", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!t", name = "S", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "Lclient!ja;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1299 = Static161.method2971("This computers address has been blocked");

	@OriginalMember(owner = "client!t", name = "O", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1300 = Static161.method2971("::fpson");

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1301 = aClass13_1299;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1302 = Static161.method2971("event_opbase");

	@OriginalMember(owner = "client!t", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1303 = Static161.method2971("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(III)I")
	public static int method2753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static175.method2921(4, arg0 + 91923, arg1 + 45365) + (Static175.method2921(2, arg0 + 37821, arg1 + 10294) + -128 >> 1) + (Static175.method2921(1, arg0, arg1) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method2755() {
		aClass13_1300 = null;
		aClass13_1301 = null;
		aClass13_1299 = null;
		aClass13_1302 = null;
		aClass13_1303 = null;
		aClass1_Sub8_Sub1_3 = null;
		aShortArray44 = null;
		anIntArrayArrayArray7 = null;
	}
}
