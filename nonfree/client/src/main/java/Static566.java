import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
	public static int anInt9784;

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_56 = new Class264(32);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIBII)Z")
	public static boolean method8152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 + arg3;
		@Pc(12) int local12 = arg1 + arg5;
		@Pc(16) int local16 = arg4 + arg0;
		if (!Static8.method51(local12, local16, local12, arg4, arg2, local8, local12, local16, arg2)) {
			return false;
		} else if (Static8.method51(local12, local16, local12, arg4, arg2, local8, local12, arg4, local8)) {
			if (arg2 >= Static335.anInt6337) {
				if (!Static8.method51(local12, local16, local12, local16, local8, local8, arg1, arg4, local8)) {
					return false;
				}
				if (!Static8.method51(arg1, arg4, local12, local16, local8, local8, arg1, arg4, local8)) {
					return false;
				}
			} else if (!Static8.method51(local12, local16, local12, local16, arg2, arg2, arg1, arg4, arg2)) {
				return false;
			} else if (!Static8.method51(arg1, arg4, local12, local16, arg2, arg2, arg1, arg4, arg2)) {
				return false;
			}
			if (Static496.anInt8826 > arg4) {
				if (!Static8.method51(local12, arg4, local12, arg4, arg2, local8, arg1, arg4, arg2)) {
					return false;
				}
				if (!Static8.method51(arg1, arg4, local12, arg4, arg2, local8, arg1, arg4, local8)) {
					return false;
				}
			} else if (!Static8.method51(local12, local16, local12, local16, arg2, local8, arg1, local16, arg2)) {
				return false;
			} else if (!Static8.method51(arg1, local16, local12, local16, arg2, local8, arg1, local16, local8)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method8154(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static55.method1186(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static55.method1186(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local49);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static306.method4483(local75)) {
				@Pc(83) char local83 = Static666.method9234(local75);
				if (local83 != '\u0000') {
					local62.append(local83);
				}
			}
		}
		if (local62.length() == 0) {
			return null;
		} else {
			return local62.toString();
		}
	}
}
