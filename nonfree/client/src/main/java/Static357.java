import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
	public static boolean method527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method542(arg0, arg1) || method552(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)Z")
	public static boolean method528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method537(arg1, arg0)) {
			return (arg1 & 0x5800) != 0 | method536(arg1, arg0) | method551(arg1, arg0) ? true : (method540(arg0, arg1) | method543(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(III)Z")
	public static boolean method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(III)Z")
	public static boolean method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z")
	public static boolean method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(III)Z")
	public static boolean method532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method551(arg0, arg1) | (arg0 & 0x20000) != 0 || method528(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(III)Z")
	public static boolean method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!br", name = "g", descriptor = "(III)Z")
	public static boolean method534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!br", name = "h", descriptor = "(III)Z")
	public static boolean method535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIB)Z")
	public static boolean method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!br", name = "i", descriptor = "(III)Z")
	public static boolean method537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZI)Z")
	public static boolean method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method541(arg0, arg1) || method552(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "j", descriptor = "(III)Z")
	public static boolean method539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method534(arg0, arg1) | (arg0 & 0x30000) != 0 || method528(arg1, arg0) || method546(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)Z")
	public static boolean method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZII)Z")
	public static boolean method541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!br", name = "k", descriptor = "(III)Z")
	public static boolean method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!br", name = "l", descriptor = "(III)Z")
	private static boolean method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZ)Z")
	public static boolean method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x38000) != 0 | method555(arg0, arg1) || method552(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "m", descriptor = "(III)Z")
	public static boolean method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!br", name = "n", descriptor = "(III)Z")
	public static boolean method546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method534(arg0, arg1) & method556(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "o", descriptor = "(III)Z")
	public static boolean method547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method540(arg1, arg0) | (arg0 & 0x1000) != 0 | method543(arg1, arg0)) & method533(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)Z")
	public static boolean method548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 | method529(arg0, arg1) || method528(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "p", descriptor = "(III)Z")
	public static boolean method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method531(arg1, arg0) & method535(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "q", descriptor = "(III)Z")
	public static boolean method550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method531(arg0, arg1) || method549(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "r", descriptor = "(III)Z")
	public static boolean method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(BII)Z")
	public static boolean method552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method541(arg1, arg0) | method542(arg0, arg1) | method555(arg0, arg1)) & method557(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "s", descriptor = "(III)Z")
	public static boolean method553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method536(arg0, arg1) || method528(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(BII)Z")
	public static boolean method554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method540(arg0, arg1) | (arg1 & 0x8000) != 0 || method547(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method528(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IBI)Z")
	public static boolean method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!br", name = "t", descriptor = "(III)Z")
	public static boolean method556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(IBI)Z")
	public static boolean method557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
