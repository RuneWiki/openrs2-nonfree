import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z")
	public static boolean method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x38000) != 0 | method423(arg0, arg1) || method408(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Z")
	public static boolean method399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method402(arg1, arg0) | (arg0 & 0x30000) != 0 || method420(arg0, arg1) || method406(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)Z")
	public static boolean method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method426(arg0, arg1) | (arg1 & 0x20000) != 0 || method420(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)Z")
	public static boolean method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IBI)Z")
	public static boolean method402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)Z")
	public static boolean method403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method427(arg0, arg1) | (arg1 & 0x1000) != 0 | method419(arg0, arg1)) & method414(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)Z")
	public static boolean method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(III)Z")
	public static boolean method405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)Z")
	public static boolean method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method402(arg0, arg1) & method412(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(III)Z")
	public static boolean method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method417(arg1, arg0) & method405(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(III)Z")
	public static boolean method408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method418(arg1, arg0) | method423(arg0, arg1) | method413(arg0, arg1)) & method425(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(BII)Z")
	public static boolean method409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method413(arg0, arg1) | (arg0 & 0x38000) != 0 || method408(arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(III)Z")
	public static boolean method410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(IBI)Z")
	public static boolean method411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method401(arg0, arg1) | (arg1 & 0x400) != 0 || method420(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(IBI)Z")
	public static boolean method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(III)Z")
	public static boolean method413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IZI)Z")
	public static boolean method414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(III)Z")
	public static boolean method415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method416(arg1, arg0) || method420(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIB)Z")
	public static boolean method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "(III)Z")
	public static boolean method417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "(III)Z")
	public static boolean method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(III)Z")
	private static boolean method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "(III)Z")
	public static boolean method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method421(arg1, arg0)) {
			return method416(arg0, arg1) | (arg0 & 0x5800) != 0 | method426(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (method427(arg1, arg0) | method419(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZII)Z")
	public static boolean method421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "(III)Z")
	public static boolean method422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method427(arg0, arg1) || method403(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method420(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "(III)Z")
	public static boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(III)Z")
	public static boolean method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method417(arg0, arg1) || method407(arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZ)Z")
	public static boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "(III)Z")
	public static boolean method426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(IBI)Z")
	public static boolean method427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "(III)Z")
	public static boolean method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method418(arg0, arg1) || method408(arg1, arg0);
	}
}
