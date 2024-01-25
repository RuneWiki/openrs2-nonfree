import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!dn;")
	public static Class69 aClass69_4;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "Lclient!lq;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "Lclient!pp;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!af", name = "ob", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_1 = new Class39(14, 1);

	@OriginalMember(owner = "client!af", name = "V", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_2 = new Class39(15, 4);

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_3 = new Class39(16, -2);

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_4 = new Class39(17, 0);

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_5 = new Class39(18, -2);

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_6 = new Class39(19, -2);

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_7 = new Class39(20, 6);

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_8 = new Class39(21, 9);

	@OriginalMember(owner = "client!af", name = "db", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_9 = new Class39(22, -2);

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_10 = new Class39(23, 4);

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_11 = new Class39(24, -1);

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_12 = new Class39(25, -2);

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_13 = new Class39(26, 0);

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "Lclient!bv;")
	public static final Class39 aClass39_14 = new Class39(27, 0);

	@OriginalMember(owner = "client!af", name = "nb", descriptor = "[Lclient!pg;")
	public static final Class226[] aClass226Array1 = new Class226[16];

	@OriginalMember(owner = "client!af", name = "pb", descriptor = "I")
	public static int anInt280 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!lp;IIII)V")
	public static void method477(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static475.method7398(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static501.anInt9458) {
			Static475.method7398(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static475.method7398(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static420.anInt7323) {
			Static475.method7398(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static420.anInt7323) {
			Static475.method7398(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static501.anInt9458 && arg4 <= Static420.anInt7323) {
			Static475.method7398(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static475.method7398(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static501.anInt9458 && arg4 > 0) {
			Static475.method7398(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
	public static int method479(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
