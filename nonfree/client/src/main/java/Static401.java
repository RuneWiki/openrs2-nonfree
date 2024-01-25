import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)Z")
	public static boolean method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 | method3648(arg0, arg1) || method3668(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(IIB)Z")
	public static boolean method3648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Z")
	public static boolean method3649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z")
	public static boolean method3650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(BII)Z")
	public static boolean method3651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3655(arg0, arg1) | (arg1 & 0x38000) != 0 || method3656(arg1, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Z")
	public static boolean method3652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3674(arg1, arg0) || method3667(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)Z")
	public static boolean method3653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(III)Z")
	public static boolean method3654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(BII)Z")
	public static boolean method3655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(III)Z")
	public static boolean method3656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method3669(arg0, arg1) | method3650(arg0, arg1) | method3655(arg1, arg0)) & method3657(arg1, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(III)Z")
	public static boolean method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(IIB)Z")
	public static boolean method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method3664(arg1, arg0) | (arg0 & 0x1000) != 0 | method3666(arg1, arg0)) & method3665(arg1, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(III)Z")
	public static boolean method3659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3654(arg0, arg1) & method3670(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(BII)Z")
	public static boolean method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method3650(arg0, arg1) || method3656(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(III)Z")
	public static boolean method3661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZI)Z")
	public static boolean method3662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method3669(arg0, arg1) || method3656(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "(III)Z")
	public static boolean method3663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(IBI)Z")
	public static boolean method3664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "(III)Z")
	public static boolean method3665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(IBI)Z")
	private static boolean method3666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "(III)Z")
	public static boolean method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3674(arg1, arg0) & method3661(arg1, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(IIB)Z")
	public static boolean method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method3676(arg1, arg0)) {
			return method3653(arg0, arg1) | (arg1 & 0x5800) != 0 | method3663(arg0, arg1) ? true : (method3664(arg0, arg1) | method3666(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "(III)Z")
	public static boolean method3670(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "(III)Z")
	public static boolean method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x30000) != 0 | method3654(arg0, arg1) || method3668(arg0, arg1) || method3659(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(BII)Z")
	public static boolean method3672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3653(arg0, arg1) || method3668(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(BII)Z")
	public static boolean method3673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method3664(arg0, arg1) || method3658(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method3668(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "(III)Z")
	public static boolean method3674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "(III)Z")
	public static boolean method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20000) != 0 | method3663(arg1, arg0) || method3668(arg1, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "(III)Z")
	public static boolean method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "(III)Z")
	public static boolean method3677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
