import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Lclient!vo;")
	public static Class213 aClass213_1;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "[I")
	public static final int[] anIntArray126 = new int[2500];

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!gs;")
	public static final Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt1116 = 0;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString38 = "Starting 3d Library";

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_6 = new Class195();

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Lclient!oa;")
	public static Class145 method1111(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static259.aClass140_132;
		@Pc(14) Class145 local14;
		synchronized (Static259.aClass140_132) {
			local14 = (Class145) Static259.aClass140_132.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(41) byte[] local41 = Static144.aClass165_50.method4508(Static92.method1719(arg0), Static87.method1677(arg0));
		local14 = new Class145();
		if (local41 != null) {
			local14.method3980(new Class1_Sub7(local41));
		}
		@Pc(56) Class140 local56 = Static259.aClass140_132;
		synchronized (Static259.aClass140_132) {
			Static259.aClass140_132.method3817((long) arg0, local14);
			return local14;
		}
	}
}
