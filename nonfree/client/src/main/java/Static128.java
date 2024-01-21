import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_40 = Static151.method2243(" is already on your friend list)3");

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_39 = aClass62_40;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt149 = 0;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_41 = Static151.method2243(" )2> ");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!oc;ILclient!u;)V")
	public static void method106(@OriginalArg(0) int arg0, @OriginalArg(1) Class71_Sub1 arg1, @OriginalArg(3) Class98 arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class13 local14 = Static115.aClass13_7;
		synchronized (Static115.aClass13_7) {
			for (@Pc(21) Class2_Sub26 local21 = (Class2_Sub26) Static115.aClass13_7.method303(); local21 != null; local21 = (Class2_Sub26) Static115.aClass13_7.method309()) {
				if (local21.aLong148 == (long) arg0 && local21.aClass98_4 == arg2 && local21.anInt4228 == 0) {
					local12 = local21.aByteArray50;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(71) byte[] local71 = arg2.method2722(arg0);
			arg1.method2146(true, arg0, local71, arg2);
		} else {
			arg1.method2146(true, arg0, local12, arg2);
		}
	}
}
