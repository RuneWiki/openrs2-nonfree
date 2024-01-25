import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static363 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method3099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI)Z")
	public static boolean method3100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Z")
	public static boolean method3101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method3119(arg1, arg0)) {
			return method3115(arg1, arg0) | (arg1 & 0x5800) != 0 | method3107(arg1, arg0) ? true : (method3100(arg1, arg0) | method3112(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)Z")
	public static boolean method3102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Z")
	public static boolean method3103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3115(arg0, arg1) || method3101(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)Z")
	public static boolean method3104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3118(arg1, arg0) | (arg0 & 0x38000) != 0 || method3109(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIB)Z")
	public static boolean method3105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 | method3111(arg1, arg0) || method3101(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(III)Z")
	public static boolean method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(III)Z")
	public static boolean method3108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method3100(arg1, arg0) | (arg1 & 0x8000) != 0 || method3113(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method3101(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(III)Z")
	public static boolean method3109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method3102(arg1, arg0) | method3114(arg1, arg0) | method3118(arg1, arg0)) & method3099(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(III)Z")
	public static boolean method3110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3117(arg1, arg0) | (arg1 & 0x30000) != 0 || method3101(arg0, arg1) || method3128(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(III)Z")
	public static boolean method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)Z")
	private static boolean method3112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(III)Z")
	public static boolean method3113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x1000) != 0 | method3100(arg1, arg0) | method3112(arg0, arg1)) & method3106(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIB)Z")
	public static boolean method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(III)Z")
	public static boolean method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZI)Z")
	public static boolean method3116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IBI)Z")
	public static boolean method3117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(IBI)Z")
	public static boolean method3118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(IBI)Z")
	public static boolean method3119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(III)Z")
	public static boolean method3120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3114(arg1, arg0) | (arg0 & 0x38000) != 0 || method3109(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(IBI)Z")
	public static boolean method3121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3129(arg0, arg1) || method3125(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(IIB)Z")
	public static boolean method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3102(arg0, arg1) | (arg1 & 0x38000) != 0 || method3109(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(III)Z")
	public static boolean method3123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(III)Z")
	public static boolean method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20000) != 0 | method3107(arg0, arg1) || method3101(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "(III)Z")
	public static boolean method3125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3129(arg1, arg0) & method3116(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "(III)Z")
	public static boolean method3126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(III)Z")
	public static boolean method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIZ)Z")
	public static boolean method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3117(arg1, arg0) & method3126(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BII)Z")
	public static boolean method3129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
