import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public static int anInt244;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!ic;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!al;")
	public static final Class19 aClass19_1 = new Class19(1);

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!al;")
	public static final Class19 aClass19_2 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!al;")
	public static final Class19 aClass19_3 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!al;")
	public static final Class19 aClass19_4 = new Class19(1);

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!al;")
	public static final Class19 aClass19_5 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!al;")
	public static final Class19 aClass19_6 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!al;")
	public static final Class19 aClass19_7 = new Class19(2);

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!al;")
	public static final Class19 aClass19_8 = new Class19(4);

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!l;")
	public static final Class213 aClass213_1 = new Class213();

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!mda;")
	public static final Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)Z")
	public static boolean method286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static218.method3768(arg1, arg0) || Static282.method4747(arg1, arg0);
	}
}
