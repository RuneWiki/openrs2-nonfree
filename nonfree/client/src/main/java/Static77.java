import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public static int anInt1822;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_560 = Static81.method1507("(U");

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "[Lclient!sd;")
	public static final Class88[] aClass88Array1 = new Class88[6];

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
	public static final int[] anIntArray159 = new int[128];

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public static int anInt1820 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
	public static int method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lclient!dj;")
	public static Class24 method1424(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static175.method3020(arg0) : Static83.aClass24_595;
	}
}
