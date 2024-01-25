import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public static int anInt2835;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static int anInt2834 = 0;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)I")
	public static int method2562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static29.aClass139Array6 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || Static400.anInt6818 - 1 < local11 || Static271.anInt5050 - 1 < local15) {
			return 0;
		}
		@Pc(37) int local37 = arg1;
		if (arg1 < 3 && (Static154.aByteArrayArrayArray15[1][local11][local15] & 0x2) != 0) {
			local37 = arg1 + 1;
		}
		return Static29.aClass139Array6[local37].method6890(arg2, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public static void method2563() {
		Static465.method6454();
	}
}
