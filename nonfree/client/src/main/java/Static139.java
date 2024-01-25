import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIII)I")
	public static int method2732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method2733() {
		Static136.method2695(false);
		if (Static546.anInt9681 >= 0 && Static546.anInt9681 != 0) {
			Static547.method7956(Static546.anInt9681);
			Static546.anInt9681 = -1;
		}
	}
}
