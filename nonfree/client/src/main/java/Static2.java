import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!bd;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_8 = Static129.method2060("Password: ");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_6 = aClass61_8;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_7 = Static129.method2060("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static int[] anIntArray1 = new int[1000];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt19 = -1;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array2 = new Class61[1000];

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt22 = 0;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_9 = Static129.method2060("Mem:");

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_10 = Static129.method2060("<col=00ff80>");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_11 = Static129.method2060("mapedge");

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_12 = Static129.method2060("Nehmen");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public static int anInt23 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)I")
	public static int method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >>> 31;
		return (local11 + arg0) / arg1 - local11;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method9() {
		aClass61_8 = null;
		aClass61_6 = null;
		anIntArray3 = null;
		aClass61Array2 = null;
		anIntArray1 = null;
		aClass61_7 = null;
		aClass61_12 = null;
		aClass61_10 = null;
		aClass10_2 = null;
		aClass61_11 = null;
		aClass61_9 = null;
	}
}
