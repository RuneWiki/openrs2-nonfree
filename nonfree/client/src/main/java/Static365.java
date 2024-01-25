import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z")
	public static boolean method2362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2367(arg0, arg1) & method2382(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)Z")
	public static boolean method2363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method2383(arg1, arg0) | (arg0 & 0x8000) != 0 || method2364(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method2377(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)Z")
	public static boolean method2364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method2383(arg0, arg1) | (arg1 & 0x1000) != 0 | method2388(arg1, arg0)) & method2370(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(III)Z")
	public static boolean method2365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 | method2376(arg0, arg1) || method2377(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(III)Z")
	public static boolean method2366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(III)Z")
	public static boolean method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(III)Z")
	public static boolean method2368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2369(arg0, arg1) || method2378(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(III)Z")
	public static boolean method2369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "(III)Z")
	public static boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
	public static boolean method2371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(III)Z")
	public static boolean method2372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "(III)Z")
	public static boolean method2373(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)Z")
	public static boolean method2374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2372(arg0, arg1) | (arg0 & 0x38000) != 0 || method2378(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "(III)Z")
	public static boolean method2375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x30000) != 0 | method2373(arg0, arg1) || method2377(arg1, arg0) || method2390(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)Z")
	public static boolean method2376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "(III)Z")
	public static boolean method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method2384(arg0, arg1)) {
			return (arg0 & 0x5800) != 0 | method2371(arg0, arg1) | method2380(arg1, arg0) ? true : (method2383(arg1, arg0) | method2388(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "(III)Z")
	public static boolean method2378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method2369(arg0, arg1) | method2391(arg0, arg1) | method2372(arg0, arg1)) & method2381(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IZI)Z")
	public static boolean method2379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2367(arg0, arg1) || method2362(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "(III)Z")
	public static boolean method2380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Z")
	public static boolean method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIB)Z")
	public static boolean method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(IIB)Z")
	public static boolean method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "(III)Z")
	public static boolean method2384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(BII)Z")
	public static boolean method2385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(IIB)Z")
	public static boolean method2386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2380(arg1, arg0) | (arg0 & 0x20000) != 0 || method2377(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "(III)Z")
	public static boolean method2387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(IZI)Z")
	private static boolean method2388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(IIB)Z")
	public static boolean method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2391(arg1, arg0) | (arg1 & 0x38000) != 0 || method2378(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "(III)Z")
	public static boolean method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2373(arg1, arg0) & method2387(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(IZI)Z")
	public static boolean method2391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IBI)Z")
	public static boolean method2392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2371(arg1, arg0) || method2377(arg1, arg0);
	}
}
