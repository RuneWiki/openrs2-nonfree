import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
	public static int anInt5089;

	@OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
	public static int anInt5093 = 0;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)I")
	public static int method4420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBII)V")
	public static void method4423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1003) {
			Static164.method3187(10, arg1, arg0);
		} else if (arg2 == 1010) {
			Static164.method3187(11, arg1, arg0);
		} else if (arg2 == 1006) {
			Static164.method3187(12, arg1, arg0);
		} else if (arg2 == 1012) {
			Static164.method3187(13, arg1, arg0);
		} else if (arg2 == 1009) {
			Static164.method3187(14, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "(B)V")
	public static void method4424() {
		for (@Pc(18) Class4_Sub32 local18 = (Class4_Sub32) Static82.aClass116_11.method3270(); local18 != null; local18 = (Class4_Sub32) Static82.aClass116_11.method3272()) {
			if (local18.anInt4728 == -1) {
				local18.anInt4727 = 0;
				Static63.method1311(local18);
			} else {
				local18.method5687();
			}
		}
	}
}
