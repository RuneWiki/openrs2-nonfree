import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	public static int anInt368;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_10 = new Class220(10, 2, 2, 0);

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public static int anInt358 = 0;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_5 = new Class198("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIBI)I")
	public static int method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg0;
			arg0 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg1 - arg3;
		} else if (local7 == 2) {
			return 8 - arg5 - arg0;
		} else {
			return arg3;
		}
	}
}
