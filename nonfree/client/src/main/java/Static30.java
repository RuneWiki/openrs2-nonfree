import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
	public static int anInt498;

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "[[[Lclient!oh;")
	public static Class189[][][] aClass189ArrayArrayArray2;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	public static int anInt500;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	public static int anInt501;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_12 = new Class25(8, -1);

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean38 = Boolean.FALSE;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)Z")
	public static boolean method405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static393.method4744(arg1, arg0) | (arg1 & 0x800) != 0 || Static73.method1405(arg1, arg0);
	}
}
