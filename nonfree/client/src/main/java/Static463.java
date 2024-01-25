import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_150 = new Class268(110, 6);

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_55 = new Class8();

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public static int anInt8194 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!cha;ZLclient!cha;)I")
	public static int method7062(@OriginalArg(0) int arg0, @OriginalArg(2) Class51_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class51_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg3.anInt1506;
			local14 = arg1.anInt1506;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static194.method3454(arg3.method1289().aString115, Static307.anInt5931, arg1.method1289().aString115);
		} else if (arg0 == 3) {
			if (arg3.aString14.equals("-")) {
				if (arg1.aString14.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString14.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static194.method3454(arg3.aString14, Static307.anInt5931, arg1.aString14);
			}
		} else if (arg0 == 4) {
			if (arg3.method1287()) {
				return arg1.method1287() ? 0 : 1;
			} else if (arg1.method1287()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method1288()) {
				return arg1.method1288() ? 0 : 1;
			} else if (arg1.method1288()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method1284()) {
				return arg1.method1284() ? 0 : 1;
			} else if (arg1.method1284()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method1285()) {
				return arg1.method1285() ? 0 : 1;
			} else if (arg1.method1285()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg3.anInt1513;
			local14 = arg1.anInt1513;
			if (arg2) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt1514 - arg1.anInt1514;
		}
	}
}
