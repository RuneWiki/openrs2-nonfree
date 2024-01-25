import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!ed;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_4 = new Class340("", 17);

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
	public static final int[] anIntArray152 = new int[3];

	@OriginalMember(owner = "client!es", name = "j", descriptor = "I")
	public static int anInt2717 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIII)I")
	public static int method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}
}
