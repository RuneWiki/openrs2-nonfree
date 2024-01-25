import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt5394;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString342;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!rk;")
	public static Class180 aClass180_72;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt5393 = -1;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
	public static int[] anIntArray692 = new int[2];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!u;ILclient!u;I)I")
	public static int method4550(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class187_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class187_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg1.anInt5942;
			local14 = arg3.anInt5942;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static341.method5545(arg3.method5040().aString250, Static177.anInt3637, arg1.method5040().aString250);
		} else if (arg2 == 3) {
			if (arg1.aString383.equals("-")) {
				if (arg3.aString383.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString383.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static341.method5545(arg3.aString383, Static177.anInt3637, arg1.aString383);
			}
		} else if (arg2 == 4) {
			if (arg1.method5029()) {
				return arg3.method5029() ? 0 : 1;
			} else if (arg3.method5029()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method5037()) {
				return arg3.method5037() ? 0 : 1;
			} else if (arg3.method5037()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method5036()) {
				return arg3.method5036() ? 0 : 1;
			} else if (arg3.method5036()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method5031()) {
				return arg3.method5031() ? 0 : 1;
			} else if (arg3.method5031()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg1.anInt5953;
			local14 = arg3.anInt5953;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
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
			return arg1.anInt5950 - arg3.anInt5950;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public static void method4551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass22_Sub4_1 != null) {
			local7.aClass22_Sub4_1 = null;
		}
		if (local7.aClass22_Sub4_2 != null) {
			local7.aClass22_Sub4_2 = null;
		}
	}
}
