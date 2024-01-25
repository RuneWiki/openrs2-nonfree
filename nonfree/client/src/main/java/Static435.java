import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "Lclient!ha;")
	public static Class101 aClass101_11;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Lclient!dm;")
	public static Class76 aClass76_13;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public static int anInt7920 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BILclient!mha;ZLclient!mha;)I")
	public static int method7086(@OriginalArg(1) int arg0, @OriginalArg(2) Class234_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class234_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt7085;
			local12 = arg3.anInt7085;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static509.method7936(arg3.method6351().aString43, Static204.anInt8130, arg1.method6351().aString43);
		} else if (arg0 == 3) {
			if (arg1.aString86.equals("-")) {
				if (arg3.aString86.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString86.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static509.method7936(arg3.aString86, Static204.anInt8130, arg1.aString86);
			}
		} else if (arg0 == 4) {
			if (arg1.method6345()) {
				return arg3.method6345() ? 0 : 1;
			} else if (arg3.method6345()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method6347()) {
				return arg3.method6347() ? 0 : 1;
			} else if (arg3.method6347()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method6349()) {
				return arg3.method6349() ? 0 : 1;
			} else if (arg3.method6349()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method6344()) {
				return arg3.method6344() ? 0 : 1;
			} else if (arg3.method6344()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt7095;
			local12 = arg3.anInt7095;
			if (arg2) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
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
			return arg1.anInt7096 - arg3.anInt7096;
		}
	}
}
