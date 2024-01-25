import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
	public static boolean method4452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZII)Z")
	public static boolean method4453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4466(arg0, arg1) || method4469(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)Z")
	public static boolean method4454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20000) != 0 | method4480(arg0, arg1) || method4468(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)Z")
	public static boolean method4455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Z")
	public static boolean method4456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)Z")
	public static boolean method4457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(III)Z")
	public static boolean method4458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(III)Z")
	public static boolean method4459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4458(arg1, arg0) | (arg1 & 0x30000) != 0 || method4468(arg0, arg1) || method4478(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)Z")
	public static boolean method4460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)Z")
	public static boolean method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIB)Z")
	public static boolean method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IBI)Z")
	public static boolean method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(III)Z")
	public static boolean method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4463(arg0, arg1) | (arg1 & 0x38000) != 0 || method4482(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Z")
	public static boolean method4465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4460(arg1, arg0) | (arg0 & 0x38000) != 0 || method4482(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(IIB)Z")
	public static boolean method4466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(IIB)Z")
	public static boolean method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(IBI)Z")
	public static boolean method4468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method4461(arg1, arg0)) {
			return (arg1 & 0x5800) != 0 | method4462(arg1, arg0) | method4480(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (method4481(arg1, arg0) | method4474(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(IBI)Z")
	public static boolean method4469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4466(arg0, arg1) & method4452(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(III)Z")
	public static boolean method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method4481(arg1, arg0) | (arg1 & 0x8000) != 0 || method4479(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method4468(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(III)Z")
	public static boolean method4471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(III)Z")
	public static boolean method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(BII)Z")
	public static boolean method4473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 | method4455(arg0, arg1) || method4468(arg0, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(III)Z")
	private static boolean method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "(III)Z")
	public static boolean method4475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(BII)Z")
	public static boolean method4476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4457(arg1, arg0) | (arg0 & 0x38000) != 0 || method4482(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "(III)Z")
	public static boolean method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4462(arg0, arg1) || method4468(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IZI)Z")
	public static boolean method4478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4458(arg1, arg0) & method4456(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "(III)Z")
	public static boolean method4479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x1000) != 0 | method4481(arg0, arg1) | method4474(arg1, arg0)) & method4471(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "(III)Z")
	public static boolean method4480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "(III)Z")
	public static boolean method4481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(III)Z")
	public static boolean method4482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method4457(arg0, arg1) | method4460(arg0, arg1) | method4463(arg0, arg1)) & method4475(arg0, arg1);
	}
}
