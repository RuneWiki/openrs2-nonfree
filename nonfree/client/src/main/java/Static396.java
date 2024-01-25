import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z")
	public static boolean method2771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2788(arg1, arg0) & method2777(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)Z")
	public static boolean method2772(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)Z")
	public static boolean method2773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x8000) != 0 | method2798(arg1, arg0) || method2796(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method2776(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(III)Z")
	public static boolean method2774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2790(arg0, arg1) & method2783(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(III)Z")
	public static boolean method2776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method2775(arg1, arg0)) {
			return (arg0 & 0x5800) != 0 | method2793(arg0, arg1) | method2786(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method2798(arg0, arg1) | method2780(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(III)Z")
	public static boolean method2777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "(III)Z")
	public static boolean method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2786(arg1, arg0) | (arg1 & 0x20000) != 0 || method2776(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZI)Z")
	public static boolean method2779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2799(arg0, arg1) || method2781(arg0, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)Z")
	private static boolean method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Z")
	public static boolean method2781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method2789(arg1, arg0) | method2799(arg0, arg1) | method2772(arg1, arg0)) & method2801(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)Z")
	public static boolean method2782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZI)Z")
	public static boolean method2783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIB)Z")
	public static boolean method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x38000) != 0 | method2789(arg1, arg0) || method2781(arg0, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IBI)Z")
	public static boolean method2785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2788(arg0, arg1) || method2771(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Z")
	public static boolean method2786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(ZII)Z")
	public static boolean method2787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "(III)Z")
	public static boolean method2788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "(III)Z")
	public static boolean method2789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "(III)Z")
	public static boolean method2790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "(III)Z")
	public static boolean method2791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2772(arg1, arg0) | (arg0 & 0x38000) != 0 || method2781(arg0, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "(III)Z")
	public static boolean method2792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2790(arg1, arg0) | (arg0 & 0x30000) != 0 || method2776(arg0, arg1) || method2774(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "(III)Z")
	public static boolean method2793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(BII)Z")
	public static boolean method2794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "(III)Z")
	public static boolean method2795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2793(arg0, arg1) || method2776(arg0, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "(III)Z")
	public static boolean method2796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x1000) != 0 | method2798(arg1, arg0) | method2780(arg1, arg0)) & method2787(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IBI)Z")
	public static boolean method2797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2800(arg0, arg1) | (arg1 & 0x400) != 0 || method2776(arg1, arg0);
	}

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "(III)Z")
	public static boolean method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(BII)Z")
	public static boolean method2799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "(III)Z")
	public static boolean method2800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIB)Z")
	public static boolean method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
