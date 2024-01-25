import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
	public static int[] anIntArray415;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "[[Lclient!at;")
	public static Class16[][] aClass16ArrayArray4;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "Lclient!at;")
	public static Class16 aClass16_15 = null;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
	public static void method3884() {
		if (Static416.aClass163_10 != null) {
			Static416.aClass163_10.method5554();
			Static211.aClass92_4 = null;
			Static416.aClass163_10 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Z")
	public static boolean method3886(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 30 || arg0 == 47 || arg0 == 44 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)Lclient!ho;")
	public static Class2_Sub5_Sub5 method3888(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5_Sub5 local10 = (Class2_Sub5_Sub5) Static370.aClass85_3.method1935((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static96.aClass54_29.method1126(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static212.method2824(local20);
			Static370.aClass85_3.method1934((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)V")
	public static void method3889(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(3, arg0);
		local8.method3101();
	}
}
