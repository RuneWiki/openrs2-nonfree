import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public static int anInt1393;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Lclient!qi;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!er;")
	public static final Class69 aClass69_12 = new Class69(32);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
	public static final int[] anIntArray89 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	public static final int anInt1392 = 1406;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method1054() {
		for (@Pc(17) Class4_Sub36 local17 = (Class4_Sub36) Static193.aClass258_48.method5538(); local17 != null; local17 = (Class4_Sub36) Static193.aClass258_48.method5528()) {
			if (local17.anInt6029 == -1) {
				local17.anInt6034 = 0;
				if (local17.anInt6026 >= 0 && local17.anInt6039 >= 0 && Static126.anInt2569 > local17.anInt6026 && Static190.anInt3697 > local17.anInt6039) {
					Static413.method5426(local17);
				}
			} else {
				local17.method5854();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Lclient!jb;")
	public static Class126 method1056(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static320.aClass126ArrayArray2[local7] == null || Static320.aClass126ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static413.method5427(local7);
			if (!local30) {
				return null;
			}
		}
		return Static320.aClass126ArrayArray2[local7][local16];
	}
}
