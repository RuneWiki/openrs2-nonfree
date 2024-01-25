import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public static int anInt2228;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "[I")
	public static final int[] anIntArray116 = new int[14];

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[I")
	public static final int[] anIntArray117 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method2018() {
		Static8.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ib;ZLclient!ib;IZ)I")
	public static int method2019(@OriginalArg(0) Class160_Sub1 arg0, @OriginalArg(2) Class160_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg0.anInt3879;
			local14 = arg1.anInt3879;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static350.method5216(arg0.method3444().aString2, Static259.anInt4113, arg1.method3444().aString2);
		} else if (arg2 == 3) {
			if (arg0.aString33.equals("-")) {
				if (arg1.aString33.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString33.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static350.method5216(arg0.aString33, Static259.anInt4113, arg1.aString33);
			}
		} else if (arg2 == 4) {
			if (arg0.method3436()) {
				return arg1.method3436() ? 0 : 1;
			} else if (arg1.method3436()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method3441()) {
				return arg1.method3441() ? 0 : 1;
			} else if (arg1.method3441()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method3439()) {
				return arg1.method3439() ? 0 : 1;
			} else if (arg1.method3439()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method3438()) {
				return arg1.method3438() ? 0 : 1;
			} else if (arg1.method3438()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg0.anInt3897;
			local14 = arg1.anInt3897;
			if (arg3) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg0.anInt3895 - arg1.anInt3895;
		}
	}
}
