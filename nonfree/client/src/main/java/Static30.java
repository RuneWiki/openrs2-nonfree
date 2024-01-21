import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "Z")
	public static boolean aBoolean34;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "[S")
	public static final short[] aShortArray19 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_613 = Static118.method2249("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!oc;")
	public static Class65 aClass65_612 = aClass65_613;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public static int anInt881 = 0;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_614 = Static118.method2249("(R");

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lclient!ej;")
	public static Class1_Sub2_Sub10 method579(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static38.aClass87_18.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static113.aClass60_23.method2340(Static147.method2647(arg0), Static20.method386(arg0));
		local10 = new Class1_Sub2_Sub10();
		if (local32 != null) {
			local10.method890(new Class1_Sub14(local32));
		}
		Static38.aClass87_18.method3068(local10, (long) arg0);
		return local10;
	}
}
