import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Z")
	public static boolean method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method4747(arg0, arg1)) {
			return (arg1 & 0x5800) != 0 | method4728(arg1, arg0) | method4729(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (method4748(arg0, arg1) | method4731(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)Z")
	public static boolean method4724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4725(arg1, arg0) || method4745(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z")
	public static boolean method4725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIZ)Z")
	public static boolean method4726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)Z")
	public static boolean method4727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4722(arg0, arg1) | (arg0 & 0x38000) != 0 || method4749(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIB)Z")
	public static boolean method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IBI)Z")
	public static boolean method4729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z")
	public static boolean method4730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method4748(arg1, arg0) | (arg0 & 0x1000) != 0 | method4731(arg1, arg0)) & method4739(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(III)Z")
	private static boolean method4731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(IBI)Z")
	public static boolean method4732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(III)Z")
	public static boolean method4733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4728(arg1, arg0) || method4723(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(III)Z")
	public static boolean method4734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4732(arg0, arg1) & method4744(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(BII)Z")
	public static boolean method4735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method4748(arg1, arg0) | (arg0 & 0x8000) != 0 || method4730(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method4723(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(III)Z")
	public static boolean method4736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(IBI)Z")
	public static boolean method4737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 | method4751(arg0, arg1) || method4723(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(III)Z")
	public static boolean method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method4743(arg1, arg0) || method4749(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(IBI)Z")
	public static boolean method4739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(III)Z")
	public static boolean method4740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(III)Z")
	public static boolean method4741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method4740(arg0, arg1) || method4749(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZI)Z")
	public static boolean method4742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(IBI)Z")
	public static boolean method4743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "(III)Z")
	public static boolean method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "(III)Z")
	public static boolean method4745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4725(arg1, arg0) & method4750(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IZI)Z")
	public static boolean method4746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x30000) != 0 | method4732(arg1, arg0) || method4723(arg0, arg1) || method4734(arg1, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "(III)Z")
	public static boolean method4747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(BII)Z")
	public static boolean method4748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "(III)Z")
	public static boolean method4749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method4740(arg1, arg0) | method4722(arg1, arg0) | method4743(arg1, arg0)) & method4742(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "(III)Z")
	public static boolean method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(IBI)Z")
	public static boolean method4751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(IBI)Z")
	public static boolean method4752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20000) != 0 | method4729(arg1, arg0) || method4723(arg1, arg0);
	}
}
