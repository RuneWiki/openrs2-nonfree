import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt1870;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_1 = new Class157(14, 0);

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_2 = new Class157(15, 4);

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_3 = new Class157(16, -2);

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_4 = new Class157(17, 0);

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_5 = new Class157(19, -2);

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_6 = new Class157(22, -2);

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_7 = new Class157(23, 4);

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_8 = new Class157(24, -1);

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_9 = new Class157(26, 0);

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_10 = new Class157(27, 0);

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_11 = new Class157(28, -2);

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_12 = new Class157(29, -2);

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!hm;")
	public static final Class157 aClass157_13 = new Class157(30, -2);

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public static int anInt1871 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public static boolean method1731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 8 || arg0 == 12 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
	public static int method1733(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(36) int local36 = (arg0 * local19 >> 12) + 40960;
		return local36 * local13 >> 12;
	}
}
