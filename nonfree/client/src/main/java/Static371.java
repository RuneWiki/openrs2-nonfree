import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static371 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public static boolean method3284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x8000) != 0 | method3299(arg1, arg0) || method3286(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method3304(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
	public static boolean method3285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)Z")
	public static boolean method3286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x1000) != 0 | method3299(arg1, arg0) | method3295(arg1, arg0)) & method3289(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(III)Z")
	public static boolean method3287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20000) != 0 | method3306(arg1, arg0) || method3304(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(III)Z")
	public static boolean method3288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(III)Z")
	public static boolean method3289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(III)Z")
	public static boolean method3290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method3307(arg1, arg0) | method3310(arg0, arg1) | method3302(arg1, arg0)) & method3292(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)Z")
	public static boolean method3291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BII)Z")
	public static boolean method3292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BII)Z")
	public static boolean method3293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(III)Z")
	public static boolean method3294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3307(arg1, arg0) | (arg1 & 0x38000) != 0 || method3290(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(III)Z")
	private static boolean method3295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)Z")
	public static boolean method3296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3313(arg1, arg0) & method3291(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(III)Z")
	public static boolean method3297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)Z")
	public static boolean method3298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3302(arg0, arg1) | (arg0 & 0x38000) != 0 || method3290(arg1, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IZI)Z")
	public static boolean method3299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(BII)Z")
	public static boolean method3300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "(III)Z")
	public static boolean method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x30000) != 0 | method3288(arg1, arg0) || method3304(arg0, arg1) || method3303(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)Z")
	public static boolean method3302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "(III)Z")
	public static boolean method3303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3288(arg1, arg0) & method3300(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(III)Z")
	public static boolean method3304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method3297(arg0, arg1)) {
			return (arg1 & 0x5800) != 0 | method3312(arg0, arg1) | method3306(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (method3299(arg0, arg1) | method3295(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIB)Z")
	public static boolean method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3285(arg1, arg0) | (arg0 & 0x400) != 0 || method3304(arg1, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "(III)Z")
	public static boolean method3306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IBI)Z")
	public static boolean method3307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "(III)Z")
	public static boolean method3308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3313(arg0, arg1) || method3296(arg1, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(IBI)Z")
	public static boolean method3309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(IZI)Z")
	public static boolean method3310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(IBI)Z")
	public static boolean method3311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3312(arg0, arg1) || method3304(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "(III)Z")
	public static boolean method3312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "(III)Z")
	public static boolean method3313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "(III)Z")
	public static boolean method3314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method3310(arg1, arg0) || method3290(arg1, arg0);
	}
}
