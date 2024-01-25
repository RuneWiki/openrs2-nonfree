import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "[[[Lclient!ce;")
	public static Class36[][][] aClass36ArrayArrayArray3;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!gn;")
	public static final Class97 aClass97_5 = new Class97();

	@OriginalMember(owner = "client!pl", name = "T", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_13 = new Class163(6, 2);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!hw;I)Lclient!jh;")
	public static Class133 method4500(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) Class133 local7 = new Class133();
		local7.anInt3381 = arg0.method6148();
		local7.aClass2_Sub1_Sub2_1 = Static230.aClass179_2.method3930(local7.anInt3381);
		return local7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZ)I")
	public static int method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBII)I")
	public static int method4504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4505(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local10++;
			} else if (local23 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ec;Lclient!ec;IZI)I")
	public static int method4507(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class65_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg1.anInt1480;
			local12 = arg0.anInt1480;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static228.method4888(arg0.method1364().aString42, Static80.anInt6195, arg1.method1364().aString42);
		} else if (arg3 == 3) {
			if (arg1.aString11.equals("-")) {
				if (arg0.aString11.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString11.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static228.method4888(arg0.aString11, Static80.anInt6195, arg1.aString11);
			}
		} else if (arg3 == 4) {
			if (arg1.method1360()) {
				return arg0.method1360() ? 0 : 1;
			} else if (arg0.method1360()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method1358()) {
				return arg0.method1358() ? 0 : 1;
			} else if (arg0.method1358()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method1352()) {
				return arg0.method1352() ? 0 : 1;
			} else if (arg0.method1352()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method1362()) {
				return arg0.method1362() ? 0 : 1;
			} else if (arg0.method1362()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg1.anInt1485;
			local12 = arg0.anInt1485;
			if (arg2) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt1486 - arg0.anInt1486;
		}
	}
}
