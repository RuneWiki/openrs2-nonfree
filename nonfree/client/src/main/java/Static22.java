import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!au", name = "P", descriptor = "Lclient!fi;")
	public static Class76 aClass76_2;

	@OriginalMember(owner = "client!au", name = "bb", descriptor = "Lclient!wk;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!au", name = "V", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_10 = new Class129(36, 8);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)I")
	public static int method374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg0;
		} else {
			return 8 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BIII)I")
	public static int method375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V")
	public static void method377() {
		@Pc(5) Class44 local5 = Static74.aClass44_9;
		synchronized (Static74.aClass44_9) {
			Static74.aClass44_9.method1024();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)I")
	public static int method378(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = arg0 & 0x3F;
		@Pc(22) int local22 = arg0 >> 6 & 0x3;
		if (local16 == 18) {
			if (local22 == 0) {
				return 1;
			}
			if (local22 == 1) {
				return 2;
			}
			if (local22 == 2) {
				return 4;
			}
			if (local22 == 3) {
				return 8;
			}
		} else if (local16 == 19 || local16 == 21) {
			if (local22 == 0) {
				return 16;
			}
			if (local22 == 1) {
				return 32;
			}
			if (local22 == 2) {
				return 64;
			}
			if (local22 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
