import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
	public static boolean method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x30000) != 0 | method4394(arg0, arg1) || method4378(arg1, arg0) || method4389(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII)Z")
	public static boolean method4375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)Z")
	public static boolean method4376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)Z")
	public static boolean method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4386(arg1, arg0) | (arg0 & 0x38000) != 0 || method4387(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(III)Z")
	public static boolean method4378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method4399(arg0, arg1)) {
			return (arg0 & 0x5800) != 0 | method4382(arg1, arg0) | method4397(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method4383(arg1, arg0) | method4393(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(III)Z")
	public static boolean method4379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x8000) != 0 | method4383(arg1, arg0) || method4396(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method4378(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(III)Z")
	public static boolean method4380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4401(arg1, arg0) || method4392(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(III)Z")
	public static boolean method4381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(III)Z")
	public static boolean method4382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(III)Z")
	public static boolean method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(III)Z")
	public static boolean method4384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)Z")
	public static boolean method4385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(III)Z")
	public static boolean method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "(III)Z")
	public static boolean method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method4384(arg0, arg1) | method4386(arg0, arg1) | method4400(arg1, arg0)) & method4385(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "(III)Z")
	public static boolean method4388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(III)Z")
	public static boolean method4389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4394(arg0, arg1) & method4376(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IBI)Z")
	public static boolean method4390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4397(arg1, arg0) | (arg1 & 0x20000) != 0 || method4378(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIB)Z")
	public static boolean method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(III)Z")
	public static boolean method4392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4401(arg0, arg1) & method4391(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "(III)Z")
	private static boolean method4393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "(III)Z")
	public static boolean method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(ZII)Z")
	public static boolean method4395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method4384(arg1, arg0) || method4387(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(ZII)Z")
	public static boolean method4396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x1000) != 0 | method4383(arg0, arg1) | method4393(arg0, arg1)) & method4388(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)Z")
	public static boolean method4397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(III)Z")
	public static boolean method4398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4381(arg0, arg1) | (arg0 & 0x400) != 0 || method4378(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(III)Z")
	public static boolean method4399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "(III)Z")
	public static boolean method4400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIB)Z")
	public static boolean method4401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "(III)Z")
	public static boolean method4402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method4400(arg0, arg1) || method4387(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "(III)Z")
	public static boolean method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "(III)Z")
	public static boolean method4404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4382(arg1, arg0) || method4378(arg0, arg1);
	}
}
