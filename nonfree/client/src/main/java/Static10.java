import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	public static int anInt225;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!ud;")
	public static Class8_Sub20_Sub1 aClass8_Sub20_Sub1_1 = new Class8_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
	public static int[] anIntArray26 = new int[100];

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
	public static int anInt226 = 0;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "[I")
	public static int[] anIntArray27 = new int[5];

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_136 = Static56.method816("Loaded config");

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!ic;")
	public static Class34 aClass34_133 = aClass34_136;

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
	public static int anInt230 = 0;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_134 = Static56.method816("scrollbar");

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_135 = Static56.method816("Konfig geladen)3");

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lclient!ic;")
	public static Class34 aClass34_137 = Static56.method816("rot:");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method109() {
		aClass34_135 = null;
		aClass34_133 = null;
		aClass8_Sub20_Sub1_1 = null;
		anIntArray27 = null;
		anIntArray26 = null;
		aClass34_134 = null;
		aClass34_136 = null;
		aClass34_137 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!dd;I)[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] method110(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return Static134.method2026(arg2, arg0, arg1) ? Static16.method246() : null;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method111() {
		if (Static93.aClass25_4 != null) {
			Static93.aClass25_4.method588();
			Static93.aClass25_4 = null;
		}
		Static39.method596();
		Static3.aClass64_1.method1411();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static97.aClass42Array1[local24].method1029();
		}
		System.gc();
		Static53.method779();
		Static74.anInt1780 = -1;
		Static60.aBoolean63 = false;
		Static16.method247();
		Static82.method1201(10);
	}
}
