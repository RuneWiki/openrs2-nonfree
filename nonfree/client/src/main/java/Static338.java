import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray40;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!vl;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public static int anInt6454;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	public static String method5445(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static321.anInterface2_5 != null) {
			@Pc(12) String local12 = Static321.anInterface2_5.method2419(arg2, arg0, arg1);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!ao;IILclient!ao;)I")
	public static int method5446(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class10_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg3.anInt264;
			local12 = arg1.anInt264;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static103.method2298(arg1.method240().aString52, arg3.method240().aString52, Static180.anInt3835);
		} else if (arg2 == 3) {
			if (arg3.aString3.equals("-")) {
				if (arg1.aString3.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString3.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static103.method2298(arg1.aString3, arg3.aString3, Static180.anInt3835);
			}
		} else if (arg2 == 4) {
			if (arg3.method233()) {
				return arg1.method233() ? 0 : 1;
			} else if (arg1.method233()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method238()) {
				return arg1.method238() ? 0 : 1;
			} else if (arg1.method238()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method234()) {
				return arg1.method234() ? 0 : 1;
			} else if (arg1.method234()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method239()) {
				return arg1.method239() ? 0 : 1;
			} else if (arg1.method239()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg3.anInt272;
			local12 = arg1.anInt272;
			if (arg0) {
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
			return arg3.anInt274 - arg1.anInt274;
		}
	}
}
