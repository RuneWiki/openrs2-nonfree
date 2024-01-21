import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "J")
	public static long aLong14;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!sd;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!ae;")
	private static Class5 aClass5_273 = Static56.method972("No reply from loginserver)3");

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!ae;")
	public static Class5 aClass5_268 = aClass5_273;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ae;")
	private static Class5 aClass5_269 = Static56.method972("Loaded gamescreen");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!ae;")
	private static Class5 aClass5_270 = Static56.method972("level)2");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	public static int[] anIntArray64 = new int[100];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static int anInt602 = 0;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_271 = aClass5_270;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_272 = Static56.method972("Loading config )2 ");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_274 = null;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt604 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static int[] anIntArray65 = new int[] { 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 6, -1, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 8, 6, 0, 0, -1, 0, 7, 0, 5, 2, 0, 3, 0, 0, 1, 6, 0, 3, 3, 0, 0, 7, 6, 6, 2, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 5, 6, 6, 0, 0, 0, 6, 0, 2, 0, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 14, -1, 0, 0, 2, 0, 0, 0, 10, 0, 0, 2, 0, 0, 0, 0, 0, 4, 10, 1, 2, 0, 0, 0, 0, 4, 5, 4, -1, 0, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, -2, 2, 0, 5, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, 1, 6, -2, 0, 2, 0, 8, 0, 5, 0, 1, 0, -2, 0, 0, 6, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	public static int[] anIntArray66 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_275 = aClass5_272;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!ae;")
	public static Class5 aClass5_276 = aClass5_269;

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method396() {
		aClass5_272 = null;
		aClass5_276 = null;
		aClass5_268 = null;
		aClass5_275 = null;
		aClass5_273 = null;
		aClass5_270 = null;
		aClass5_271 = null;
		anIntArray66 = null;
		anIntArray64 = null;
		aClass5_274 = null;
		aClass2_3 = null;
		aClass5_269 = null;
		anIntArray65 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!bf;)Z")
	public static boolean method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(7) byte[] local7 = arg2.method1882(arg0, arg1);
		if (local7 == null) {
			return false;
		} else {
			Static69.method1183(local7);
			return true;
		}
	}
}
