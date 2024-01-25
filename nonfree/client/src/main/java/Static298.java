import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!laa", name = "Y", descriptor = "Lclient!sw;")
	public static Class309 aClass309_6;

	@OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
	public static int anInt5561 = 0;

	@OriginalMember(owner = "client!laa", name = "R", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_91 = new Class287(64, 8);

	@OriginalMember(owner = "client!laa", name = "U", descriptor = "I")
	public static final int anInt5567 = 0;

	@OriginalMember(owner = "client!laa", name = "V", descriptor = "[Lclient!vl;")
	public static Class346[] aClass346Array1 = null;

	@OriginalMember(owner = "client!laa", name = "W", descriptor = "I")
	public static int anInt5568 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)I")
	public static int method4527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4529(@OriginalArg(0) String arg0) {
		return Static546.method7485(wl.class, arg0);
	}
}
