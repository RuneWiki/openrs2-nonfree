import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z")
	public static boolean method2085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
	public static boolean method2086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method2094(arg1, arg0) || method2089(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(III)Z")
	public static boolean method2087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 | method2090(arg0, arg1) || method2110(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(III)Z")
	public static boolean method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method2094(arg0, arg1) | method2087(arg0, arg1) | method2104(arg1, arg0)) & method2105(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(III)Z")
	public static boolean method2090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZII)Z")
	private static boolean method2091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(III)Z")
	public static boolean method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(III)Z")
	public static boolean method2093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(III)Z")
	public static boolean method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(ZII)Z")
	public static boolean method2095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2085(arg0, arg1) & method2114(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "(III)Z")
	public static boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method2111(arg1, arg0) || method2109(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method2110(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
	public static boolean method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x30000) != 0 | method2085(arg1, arg0) || method2110(arg0, arg1) || method2095(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "(III)Z")
	public static boolean method2098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)Z")
	public static boolean method2099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2087(arg0, arg1) || method2089(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "(III)Z")
	public static boolean method2100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(ZII)Z")
	public static boolean method2101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2104(arg1, arg0) || method2089(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)Z")
	public static boolean method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "(III)Z")
	public static boolean method2103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2115(arg1, arg0) || method2108(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "(III)Z")
	public static boolean method2104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(ZII)Z")
	public static boolean method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(IIZ)Z")
	public static boolean method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(IBI)Z")
	public static boolean method2107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "(III)Z")
	public static boolean method2108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2115(arg1, arg0) & method2098(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(IZI)Z")
	public static boolean method2109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x1000) != 0 | method2111(arg0, arg1) | method2091(arg1, arg0)) & method2092(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(BII)Z")
	public static boolean method2110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method2107(arg1, arg0)) {
			return (arg1 & 0x5800) != 0 | method2100(arg1, arg0) | method2106(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (method2111(arg1, arg0) | method2091(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "(III)Z")
	public static boolean method2111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(IIB)Z")
	public static boolean method2112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2100(arg0, arg1) || method2110(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "(III)Z")
	public static boolean method2113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2106(arg0, arg1) | (arg1 & 0x20000) != 0 || method2110(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "(III)Z")
	public static boolean method2114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "(III)Z")
	public static boolean method2115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
