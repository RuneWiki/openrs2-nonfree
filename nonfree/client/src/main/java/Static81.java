import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	public static int anInt1388 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public static boolean method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!dv;IZLclient!dv;I)I")
	public static int method1220(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class88_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg2.anInt2143;
			local12 = arg0.anInt2143;
			if (!arg1) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static104.method1552(arg2.method1895().aString56, Static414.anInt9485, arg0.method1895().aString56);
		} else if (arg3 == 3) {
			if (arg2.aString20.equals("-")) {
				if (arg0.aString20.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString20.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static104.method1552(arg2.aString20, Static414.anInt9485, arg0.aString20);
			}
		} else if (arg3 == 4) {
			if (arg2.method1886()) {
				return arg0.method1886() ? 0 : 1;
			} else if (arg0.method1886()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method1891()) {
				return arg0.method1891() ? 0 : 1;
			} else if (arg0.method1891()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method1887()) {
				return arg0.method1887() ? 0 : 1;
			} else if (arg0.method1887()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method1888()) {
				return arg0.method1888() ? 0 : 1;
			} else if (arg0.method1888()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg2.anInt2150;
			local12 = arg0.anInt2150;
			if (arg1) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt2151 - arg0.anInt2151;
		}
	}
}
