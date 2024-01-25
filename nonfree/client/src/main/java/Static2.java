import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!hba;")
	public static final Class121 aClass121_1 = new Class121(2);

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	public static int method175() {
		return 6;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method176() {
		Static227.aClass277_35.method7026();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)I")
	public static int method177(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return local45 + (arg0 & 0xFF80);
		}
	}
}
