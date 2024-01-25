import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "[Lclient!na;")
	public static Class106[] aClass106Array4;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_7 = new Class180(5, 15);

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_77 = new Class81(7, -2);

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "S")
	public static short aShort39 = 256;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_48 = new Class44(2, -1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!ii;Lclient!ii;ZZ)I")
	public static int method2772(@OriginalArg(0) int arg0, @OriginalArg(1) Class23_Sub1 arg1, @OriginalArg(2) Class23_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg0 == 1) {
			local11 = arg2.anInt3267;
			local14 = arg1.anInt3267;
			if (!arg3) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static346.method4859(Static272.anInt7537, arg2.method2638().aString20, arg1.method2638().aString20);
		} else if (arg0 == 3) {
			if (arg2.aString22.equals("-")) {
				if (arg1.aString22.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString22.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static346.method4859(Static272.anInt7537, arg2.aString22, arg1.aString22);
			}
		} else if (arg0 == 4) {
			if (arg2.method2630()) {
				return arg1.method2630() ? 0 : 1;
			} else if (arg1.method2630()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method2634()) {
				return arg1.method2634() ? 0 : 1;
			} else if (arg1.method2634()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method2632()) {
				return arg1.method2632() ? 0 : 1;
			} else if (arg1.method2632()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method2629()) {
				return arg1.method2629() ? 0 : 1;
			} else if (arg1.method2629()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local11 = arg2.anInt3277;
			local14 = arg1.anInt3277;
			if (arg3) {
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
			return arg2.anInt3274 - arg1.anInt3274;
		}
	}
}
