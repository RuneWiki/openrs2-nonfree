import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	public static int anInt773 = -1;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_26 = new Class136(56, 5);

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_27 = new Class136(2, 4);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!rs;ILclient!rs;ZI)I")
	public static int method798(@OriginalArg(0) Class166_Sub1 arg0, @OriginalArg(2) Class166_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg1.anInt8516;
			local12 = arg0.anInt8516;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static356.method5615(arg1.method7337().aString20, Static321.anInt5554, arg0.method7337().aString20);
		} else if (arg3 == 3) {
			if (arg1.aString120.equals("-")) {
				if (arg0.aString120.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString120.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static356.method5615(arg1.aString120, Static321.anInt5554, arg0.aString120);
			}
		} else if (arg3 == 4) {
			if (arg1.method7334()) {
				return arg0.method7334() ? 0 : 1;
			} else if (arg0.method7334()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method7333()) {
				return arg0.method7333() ? 0 : 1;
			} else if (arg0.method7333()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method7332()) {
				return arg0.method7332() ? 0 : 1;
			} else if (arg0.method7332()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method7335()) {
				return arg0.method7335() ? 0 : 1;
			} else if (arg0.method7335()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg1.anInt8521;
			local12 = arg0.anInt8521;
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
			return arg1.anInt8518 - arg0.anInt8518;
		}
	}
}
