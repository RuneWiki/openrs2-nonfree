import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ae;ZILclient!ae;I)I")
	public static int method3354(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class7_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		@Pc(16) int local16;
		if (arg3 == 1) {
			local13 = arg0.anInt81;
			local16 = arg2.anInt81;
			if (!arg1) {
				if (local16 == -1) {
					local16 = 2001;
				}
				if (local13 == -1) {
					local13 = 2001;
				}
			}
			return local13 - local16;
		} else if (arg3 == 2) {
			return Static208.method3670(arg2.method100().aString99, arg0.method100().aString99, Static56.anInt953);
		} else if (arg3 == 3) {
			if (arg0.aString1.equals("-")) {
				if (arg2.aString1.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString1.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static208.method3670(arg2.aString1, arg0.aString1, Static56.anInt953);
			}
		} else if (arg3 == 4) {
			if (arg0.method91()) {
				return arg2.method91() ? 0 : 1;
			} else if (arg2.method91()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg0.method94()) {
				return arg2.method94() ? 0 : 1;
			} else if (arg2.method94()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg0.method93()) {
				return arg2.method93() ? 0 : 1;
			} else if (arg2.method93()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg0.method97()) {
				return arg2.method97() ? 0 : 1;
			} else if (arg2.method97()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local13 = arg0.anInt93;
			local16 = arg2.anInt93;
			if (arg1) {
				if (local16 == 1000) {
					local16 = -1;
				}
				if (local13 == 1000) {
					local13 = -1;
				}
			} else {
				if (local16 == -1) {
					local16 = 1000;
				}
				if (local13 == -1) {
					local13 = 1000;
				}
			}
			return local13 - local16;
		} else {
			return arg0.anInt94 - arg2.anInt94;
		}
	}
}
