import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Lclient!qj;")
	public static Class165 aClass165_30;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
	public static int anInt1733;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
	public static final boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	public static int anInt1736 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)I")
	public static int method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg1;
			arg1 = local12;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg2 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg5;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZ)V")
	public static void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1007) {
			Static98.method1796(10, arg1, arg2);
		} else if (arg0 == 1009) {
			Static98.method1796(11, arg1, arg2);
		} else if (arg0 == 1012) {
			Static98.method1796(12, arg1, arg2);
		} else if (arg0 == 1005) {
			Static98.method1796(13, arg1, arg2);
		} else if (arg0 == 1011) {
			Static98.method1796(14, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!qj;)V")
	public static void method1691(@OriginalArg(1) Class165 arg0) {
		Static108.aClass165_44 = arg0;
	}
}
