import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!r;")
	public static Class205 aClass205_5;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!go;IZLclient!go;)I")
	public static int method5296(@OriginalArg(1) Class91_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class91_Sub1 arg3) {
		@Pc(15) int local15;
		@Pc(18) int local18;
		if (arg1 == 1) {
			local15 = arg0.anInt2654;
			local18 = arg3.anInt2654;
			if (!arg2) {
				if (local15 == -1) {
					local15 = 2001;
				}
				if (local18 == -1) {
					local18 = 2001;
				}
			}
			return local15 - local18;
		} else if (arg1 == 2) {
			return Static312.method4440(Static341.anInt5770, arg3.method2306().aString26, arg0.method2306().aString26);
		} else if (arg1 == 3) {
			if (arg0.aString20.equals("-")) {
				if (arg3.aString20.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString20.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static312.method4440(Static341.anInt5770, arg3.aString20, arg0.aString20);
			}
		} else if (arg1 == 4) {
			if (arg0.method2302()) {
				return arg3.method2302() ? 0 : 1;
			} else if (arg3.method2302()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method2299()) {
				return arg3.method2299() ? 0 : 1;
			} else if (arg3.method2299()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method2303()) {
				return arg3.method2303() ? 0 : 1;
			} else if (arg3.method2303()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method2305()) {
				return arg3.method2305() ? 0 : 1;
			} else if (arg3.method2305()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local15 = arg0.anInt2665;
			local18 = arg3.anInt2665;
			if (arg2) {
				if (local18 == 1000) {
					local18 = -1;
				}
				if (local15 == 1000) {
					local15 = -1;
				}
			} else {
				if (local18 == -1) {
					local18 = 1000;
				}
				if (local15 == -1) {
					local15 = 1000;
				}
			}
			return local15 - local18;
		} else {
			return arg0.anInt2662 - arg3.anInt2662;
		}
	}
}
