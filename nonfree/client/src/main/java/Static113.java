import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "Lclient!ll;")
	public static Class114 aClass114_13;

	@OriginalMember(owner = "client!ho", name = "S", descriptor = "Lclient!wl;")
	public static Class193 aClass193_4;

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "Lclient!cc;")
	public static Class26 aClass26_22 = new Class26(64);

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public static int anInt2273 = 0;

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "[I")
	public static int[] anIntArray189 = new int[1000];

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
	public static int anInt2295 = 0;

	@OriginalMember(owner = "client!ho", name = "T", descriptor = "[I")
	public static int[] anIntArray190 = new int[14];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B[I[J)V")
	public static void method1806(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static37.method572(arg1.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1808(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}
}
