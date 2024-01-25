import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!ul;")
	public static Class246 aClass246_162;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_11;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt5202 = 0;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
	public static final int[] anIntArray449 = new int[13];

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)I")
	public static int method4312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static105.aClass149Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg2 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static195.anInt3537 - 1 || Static118.anInt2419 - 1 < local15) {
			return 0;
		}
		@Pc(33) int local33 = arg0;
		if (arg0 < 3 && (Static2.aByteArrayArrayArray1[1][local11][local15] & 0x2) != 0) {
			local33 = arg0 + 1;
		}
		return Static105.aClass149Array1[local33].a(arg1, arg2);
	}
}
