import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_12;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!ai;")
	private static Class6 aClass6_850 = Static38.method685("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_849 = aClass6_850;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_851 = Static38.method685("<col=00ff80>");

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_852 = Static38.method685(":trade:");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!nc;I)V")
	public static void method1965(@OriginalArg(0) Class58 arg0) {
		Static89.aClass58_1 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1966() {
		aClass6_850 = null;
		anIntArray258 = null;
		anIntArray257 = null;
		aClass6_852 = null;
		aClass6_849 = null;
		aBooleanArray11 = null;
		aClass10_Sub1_12 = null;
		aClass6_851 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1967() {
		Static77.aClass17_9.method509();
		Static126.aClass17_17.method509();
	}
}
