import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
	public static int anInt9847;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "Lclient!bo;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
	public static int anInt9845 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!fd;ZILclient!fd;)I")
	public static int method7963(@OriginalArg(1) Class98_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class98_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg0.anInt3674;
			local12 = arg3.anInt3674;
			if (!arg1) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static35.method7918(arg3.method3025().aString86, Static372.anInt7083, arg0.method3025().aString86);
		} else if (arg2 == 3) {
			if (arg0.aString40.equals("-")) {
				if (arg3.aString40.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString40.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static35.method7918(arg3.aString40, Static372.anInt7083, arg0.aString40);
			}
		} else if (arg2 == 4) {
			if (arg0.method3021()) {
				return arg3.method3021() ? 0 : 1;
			} else if (arg3.method3021()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method3020()) {
				return arg3.method3020() ? 0 : 1;
			} else if (arg3.method3020()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method3022()) {
				return arg3.method3022() ? 0 : 1;
			} else if (arg3.method3022()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method3019()) {
				return arg3.method3019() ? 0 : 1;
			} else if (arg3.method3019()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg0.anInt3681;
			local12 = arg3.anInt3681;
			if (arg1) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg0.anInt3682 - arg3.anInt3682;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method7964(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local20 - 2 >= local6 || Static291.method4857(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static291.method4857(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(74) byte[] local74 = new byte[local26];
		Static582.method8109(arg0, local74, 0);
		return local74;
	}
}
