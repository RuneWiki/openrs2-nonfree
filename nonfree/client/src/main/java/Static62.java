import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
	public static final int[] anIntArray72 = new int[50];

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_599 = Static193.method3027("Select a world");

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!oc;")
	public static Class70 aClass70_597 = aClass70_599;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public static int anInt1308 = 0;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_598 = Static193.method3027("Weiter");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static int anInt1310 = 0;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_600 = Static193.method3027("rot:");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
	public static int method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBI)V")
	public static void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg2 < arg1) {
			for (local18 = arg2; local18 < arg1; local18++) {
				Static157.anIntArrayArray24[local18][arg0] = arg3;
			}
		} else {
			for (local18 = arg1; local18 < arg2; local18++) {
				Static157.anIntArrayArray24[local18][arg0] = arg3;
			}
		}
	}
}
