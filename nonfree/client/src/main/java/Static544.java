import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_131 = new Class71(8, -1);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	public static void method7671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static109.anInt2865;
		if (local10 == 0) {
			return;
		}
		if (local10 == 1) {
			Static111.anInt2920 = arg3;
			Static109.anInt2865 = 2;
			Static19.anInt3645 = arg2;
			Static348.anInt6739 = arg0;
			Static624.anInt10429 = arg1;
		} else if (local10 == 2) {
			if (arg1 > Static624.anInt10429) {
				Static624.anInt10429 = arg1;
			}
			if (Static111.anInt2920 > arg3) {
				Static111.anInt2920 = arg3;
			}
			if (arg2 > Static19.anInt3645) {
				Static19.anInt3645 = arg2;
			}
			if (arg0 < Static348.anInt6739) {
				Static348.anInt6739 = arg0;
			}
		}
	}
}
