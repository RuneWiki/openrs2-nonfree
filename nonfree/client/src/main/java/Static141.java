import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "J")
	public static long aLong108;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!v;")
	public static final Class91 aClass91_14 = new Class91();

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1972 = Static118.method2249("glow1:");

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1967 = aClass65_1972;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt3425 = -1;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1971 = Static118.method2249("cyan:");

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1968 = aClass65_1971;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1969 = aClass65_1972;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1970 = aClass65_1971;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1975 = Static118.method2249("This computers address has been blocked");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1973 = aClass65_1975;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1974 = Static118.method2249("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1976 = Static118.method2249("Cabbage");

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1977 = Static118.method2249("Angreifen");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method2614(@OriginalArg(1) Class65 arg0) {
		Static124.aClass65_1741 = arg0;
		Static101.method1916();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!gd;Lclient!nd;IB)V")
	public static void method2615(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class60_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) byte[] local1 = null;
		@Pc(7) Class91 local7 = Static124.aClass91_11;
		synchronized (Static124.aClass91_11) {
			for (@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) Static124.aClass91_11.method3148(); local16 != null; local16 = (Class1_Sub25) Static124.aClass91_11.method3150()) {
				if ((long) arg2 == local16.aLong150 && arg0 == local16.aClass32_4 && local16.anInt4184 == 0) {
					local1 = local16.aByteArray49;
					break;
				}
			}
		}
		if (local1 == null) {
			@Pc(64) byte[] local64 = arg0.method1105(arg2);
			arg1.method2351(arg0, arg2, local64, true);
		} else {
			arg1.method2351(arg0, arg2, local1, true);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
	public static void method2618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) ((arg0 << 16) + arg1);
		@Pc(20) Class1_Sub2_Sub21 local20 = (Class1_Sub2_Sub21) Static19.aClass99_1.method3292(local14);
		if (local20 != null) {
			Static49.aClass22_1.method724(local20);
		}
	}
}
