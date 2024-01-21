import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt1324;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!dc;")
	public static Class1_Sub5 aClass1_Sub5_31;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[[Lclient!ob;")
	public static Class1_Sub2_Sub14[][] aClass1_Sub2_Sub14ArrayArray1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_566 = Static78.method1313("<col=c0ff00>");

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!fc;")
	private static Class25 aClass25_571 = Static78.method1313("Connection timed out)3");

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_567 = aClass25_571;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!fc;")
	private static Class25 aClass25_568 = Static78.method1313("Connecting to friendserver");

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_569 = aClass25_568;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_570 = Static78.method1313("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method1045() {
		aClass25_566 = null;
		aClass1_Sub5_31 = null;
		aClass25_570 = null;
		aClass25_567 = null;
		aClass1_Sub2_Sub14ArrayArray1 = null;
		aClass25_568 = null;
		aClass25_571 = null;
		aClass25_569 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIII)I")
	public static int method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg2;
		return (arg2 * (arg1 & 0xFF00) + local8 * (arg0 & 0xFF00) & 0xFF0000) + (arg2 * (arg1 & 0xFF00FF) + local8 * (arg0 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}
}
