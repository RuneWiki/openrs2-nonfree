import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
	public static boolean method3378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)Z")
	public static boolean method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3378(arg1, arg0) || method3401(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)Z")
	public static boolean method3380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)Z")
	public static boolean method3381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIB)Z")
	public static boolean method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZI)Z")
	public static boolean method3383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3394(arg0, arg1) | (arg1 & 0x38000) != 0 || method3397(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)Z")
	public static boolean method3384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(III)Z")
	public static boolean method3385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(III)Z")
	public static boolean method3386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x1000) != 0 | method3408(arg1, arg0) | method3404(arg0, arg1)) & method3403(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(III)Z")
	public static boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20000) != 0 | method3382(arg1, arg0) || method3401(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IBI)Z")
	public static boolean method3388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(III)Z")
	public static boolean method3389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(III)Z")
	public static boolean method3390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3381(arg1, arg0) | (arg1 & 0x30000) != 0 || method3401(arg1, arg0) || method3402(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(III)Z")
	public static boolean method3391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3388(arg0, arg1) || method3395(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "(III)Z")
	public static boolean method3392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)Z")
	public static boolean method3393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "(III)Z")
	public static boolean method3394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BII)Z")
	public static boolean method3395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3388(arg1, arg0) & method3380(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "(III)Z")
	public static boolean method3396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 | method3385(arg1, arg0) || method3401(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "(III)Z")
	public static boolean method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method3393(arg0, arg1) | method3398(arg0, arg1) | method3394(arg1, arg0)) & method3405(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "(III)Z")
	public static boolean method3398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "(III)Z")
	public static boolean method3399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3398(arg0, arg1) | (arg0 & 0x38000) != 0 || method3397(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "(III)Z")
	public static boolean method3400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "(III)Z")
	public static boolean method3401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method3400(arg1, arg0)) {
			return method3378(arg1, arg0) | (arg0 & 0x5800) != 0 | method3382(arg1, arg0) ? true : (method3408(arg1, arg0) | method3404(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(IBI)Z")
	public static boolean method3402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3381(arg0, arg1) & method3389(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IZI)Z")
	public static boolean method3403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(IBI)Z")
	private static boolean method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "(III)Z")
	public static boolean method3405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "(III)Z")
	public static boolean method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method3393(arg1, arg0) || method3397(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(IBI)Z")
	public static boolean method3407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method3408(arg0, arg1) || method3386(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method3401(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "(III)Z")
	public static boolean method3408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
