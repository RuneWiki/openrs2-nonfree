import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static395 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
	public static boolean method954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method971(arg0, arg1) & method962(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(III)Z")
	public static boolean method955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)Z")
	private static boolean method956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)Z")
	public static boolean method957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)Z")
	public static boolean method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method965(arg0, arg1) | (arg1 & 0x30000) != 0 || method975(arg1, arg0) || method963(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(III)Z")
	public static boolean method959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method969(arg1, arg0) | (arg0 & 0x400) != 0 || method975(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(III)Z")
	public static boolean method960(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method984(arg0, arg1) | method974(arg0, arg1) | method981(arg0, arg1)) & method978(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIB)Z")
	public static boolean method961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method984(arg1, arg0) || method960(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBI)Z")
	public static boolean method962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(III)Z")
	public static boolean method963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method965(arg0, arg1) & method972(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x1000) != 0 | method982(arg0, arg1) | method956(arg0, arg1)) & method967(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(III)Z")
	public static boolean method965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(III)Z")
	public static boolean method966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "(III)Z")
	public static boolean method967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIB)Z")
	public static boolean method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method971(arg1, arg0) || method954(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "(III)Z")
	public static boolean method969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "(III)Z")
	public static boolean method970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method974(arg1, arg0) || method960(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "(III)Z")
	public static boolean method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(BII)Z")
	public static boolean method972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "(III)Z")
	public static boolean method973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method966(arg0, arg1) || method975(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(IIB)Z")
	public static boolean method974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "(III)Z")
	public static boolean method975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method983(arg1, arg0)) {
			return (arg0 & 0x5800) != 0 | method966(arg0, arg1) | method976(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method982(arg1, arg0) | method956(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "(III)Z")
	public static boolean method976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IBI)Z")
	public static boolean method977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method976(arg1, arg0) | (arg1 & 0x20000) != 0 || method975(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "(III)Z")
	public static boolean method978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "(III)Z")
	public static boolean method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x8000) != 0 | method982(arg1, arg0) || method964(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method975(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIZ)Z")
	public static boolean method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method981(arg1, arg0) | (arg1 & 0x38000) != 0 || method960(arg1, arg0);
	}

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "(III)Z")
	public static boolean method981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "(III)Z")
	public static boolean method982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "(III)Z")
	public static boolean method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "(III)Z")
	public static boolean method984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
