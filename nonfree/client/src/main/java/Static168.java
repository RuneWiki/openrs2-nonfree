import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!s;")
	public static Class88 aClass88_7;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array10;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!ge;")
	public static Class39 aClass39_20 = new Class39(16);

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt3648 = -1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!ah;")
	public static Class6 aClass6_14 = null;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!ge;")
	public static Class39 aClass39_21 = new Class39(64);

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1254 = Static200.method3116("Login server offline)3");

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int anInt3650 = 2;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1255 = aClass60_1254;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1256 = Static200.method3116(" more options");

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1257 = aClass60_1256;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lclient!v;")
	public static Class1_Sub1_Sub27 method2742(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub27 local10 = (Class1_Sub1_Sub27) Static194.aClass39_23.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static139.aClass7_29.method3242(11, arg0);
		local10 = new Class1_Sub1_Sub27();
		if (local25 != null) {
			local10.method3204(new Class1_Sub9(local25));
		}
		Static194.aClass39_23.method1152((long) arg0, local10);
		return local10;
	}
}
