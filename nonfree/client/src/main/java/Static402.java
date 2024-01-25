import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z")
	public static boolean method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)Z")
	public static boolean method3131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3143(arg1, arg0) & method3154(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BII)Z")
	public static boolean method3132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3160(arg1, arg0) | (arg1 & 0x20000) != 0 || method3136(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)Z")
	private static boolean method3133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)Z")
	public static boolean method3134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(III)Z")
	public static boolean method3135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(III)Z")
	public static boolean method3136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method3153(arg0, arg1)) {
			return method3130(arg1, arg0) | (arg0 & 0x5800) != 0 | method3160(arg0, arg1) ? true : (method3135(arg0, arg1) | method3133(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(III)Z")
	public static boolean method3137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(III)Z")
	public static boolean method3138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method3137(arg0, arg1) | method3148(arg0, arg1) | method3157(arg0, arg1)) & method3140(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IBI)Z")
	public static boolean method3139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3143(arg1, arg0) | (arg0 & 0x30000) != 0 || method3136(arg0, arg1) || method3131(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)Z")
	public static boolean method3140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(III)Z")
	public static boolean method3141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(BII)Z")
	public static boolean method3142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "(III)Z")
	public static boolean method3143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "(III)Z")
	public static boolean method3144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "(III)Z")
	public static boolean method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method3137(arg0, arg1) || method3138(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZI)Z")
	public static boolean method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x1000) != 0 | method3135(arg0, arg1) | method3133(arg1, arg0)) & method3142(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIB)Z")
	public static boolean method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method3148(arg0, arg1) || method3138(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(IBI)Z")
	public static boolean method3148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "(III)Z")
	public static boolean method3149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "(III)Z")
	public static boolean method3150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3141(arg0, arg1) & method3156(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "(III)Z")
	public static boolean method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3157(arg1, arg0) | (arg0 & 0x38000) != 0 || method3138(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(BII)Z")
	public static boolean method3152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3141(arg0, arg1) || method3150(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "(III)Z")
	public static boolean method3153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "(III)Z")
	public static boolean method3154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(BII)Z")
	public static boolean method3155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 | method3134(arg1, arg0) || method3136(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "(III)Z")
	public static boolean method3156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "(III)Z")
	public static boolean method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IZI)Z")
	public static boolean method3158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method3135(arg0, arg1) | (arg0 & 0x8000) != 0 || method3146(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method3136(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIB)Z")
	public static boolean method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3130(arg0, arg1) || method3136(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "(III)Z")
	public static boolean method3160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
