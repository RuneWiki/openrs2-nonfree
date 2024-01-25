import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "Lclient!kfa;")
	public static final Class178 aClass178_11 = new Class178();

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "Lclient!us;")
	public static final Class344 aClass344_117 = new Class344(13, 8);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IILclient!jaa;ZLclient!jaa;)I")
	public static int method7970(@OriginalArg(0) int arg0, @OriginalArg(2) Class153_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class153_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt5574;
			local12 = arg3.anInt5574;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static297.method5116(arg3.method4765().aString19, Static380.anInt7247, arg1.method4765().aString19);
		} else if (arg0 == 3) {
			if (arg1.aString51.equals("-")) {
				if (arg3.aString51.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString51.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static297.method5116(arg3.aString51, Static380.anInt7247, arg1.aString51);
			}
		} else if (arg0 == 4) {
			if (arg1.method4757()) {
				return arg3.method4757() ? 0 : 1;
			} else if (arg3.method4757()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method4753()) {
				return arg3.method4753() ? 0 : 1;
			} else if (arg3.method4753()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method4755()) {
				return arg3.method4755() ? 0 : 1;
			} else if (arg3.method4755()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method4754()) {
				return arg3.method4754() ? 0 : 1;
			} else if (arg3.method4754()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt5585;
			local12 = arg3.anInt5585;
			if (arg2) {
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
			return arg1.anInt5586 - arg3.anInt5586;
		}
	}
}
