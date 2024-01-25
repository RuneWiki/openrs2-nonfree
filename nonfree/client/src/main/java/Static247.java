import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Lclient!l;")
	public static Class143 aClass143_33;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
	public static int anInt7107;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public static int anInt7108;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public static int anInt7104 = 0;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public static int anInt7109 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIII)I")
	public static int method5816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 8 - arg1 - arg4;
		} else {
			return 7 + 1 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)[Lclient!ie;")
	public static Class112[] method5817() {
		return new Class112[] { Static323.aClass112_4, Static215.aClass112_3, Static122.aClass112_1 };
	}
}
