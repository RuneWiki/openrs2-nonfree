import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!sea;")
	public static Class308 aClass308_76;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
	public static final int[] anIntArray181 = new int[50];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!ba;")
	public static Class1_Sub9 method2976() {
		return Static587.anInt9699 == 0 ? new Class1_Sub9() : Static265.aClass1_Sub9Array1[--Static587.anInt9699];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Z")
	public static boolean method2977(@OriginalArg(0) int arg0) {
		Static218.anInt3983 = arg0 + 1 & 0xFFFF;
		Static337.aBoolean471 = true;
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!lj;I[IIIII)Lclient!nea;")
	public static Class46_Sub2_Sub1 method2978(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean412 || Static166.method6223(arg4) && Static166.method6223(arg1)) {
			return new Class46_Sub2_Sub1(arg0, 3553, arg4, arg1, false, arg2, arg5, 0);
		} else if (arg0.aBoolean436) {
			return new Class46_Sub2_Sub1(arg0, 34037, arg4, arg1, false, arg2, arg5, 0);
		} else {
			return new Class46_Sub2_Sub1(arg0, arg4, arg1, Static122.method2187(arg4), Static122.method2187(arg1), arg2);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!sr;IZILclient!sr;)I")
	public static int method2979(@OriginalArg(0) Class248_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class248_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg3.anInt8293;
			local14 = arg0.anInt8293;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static495.method6775(arg3.method6712().aString53, Static161.anInt3095, arg0.method6712().aString53);
		} else if (arg1 == 3) {
			if (arg3.aString93.equals("-")) {
				if (arg0.aString93.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString93.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static495.method6775(arg3.aString93, Static161.anInt3095, arg0.aString93);
			}
		} else if (arg1 == 4) {
			if (arg3.method6706()) {
				return arg0.method6706() ? 0 : 1;
			} else if (arg0.method6706()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method6705()) {
				return arg0.method6705() ? 0 : 1;
			} else if (arg0.method6705()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method6708()) {
				return arg0.method6708() ? 0 : 1;
			} else if (arg0.method6708()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method6704()) {
				return arg0.method6704() ? 0 : 1;
			} else if (arg0.method6704()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg3.anInt8306;
			local14 = arg0.anInt8306;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
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
			return arg3.anInt8307 - arg0.anInt8307;
		}
	}
}
