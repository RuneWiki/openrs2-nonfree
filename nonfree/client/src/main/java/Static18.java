import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Lclient!ke;")
	public static Class132 method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static25.aClass132ArrayArrayArray1[0][arg1][arg2] != null && Static25.aClass132ArrayArrayArray1[0][arg1][arg2].aClass132_1 != null;
			if (local28 && arg0 >= Static337.anInt5599 - 1) {
				return null;
			}
			Static59.method970(arg0, arg1, arg2);
		}
		return Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2855(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static56.anInt1157; local16++) {
			if (arg0.equalsIgnoreCase(Static262.aStringArray88[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static267.aStringArray64[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZI)Z")
	public static boolean method2856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(13) Class236 local13 = Static54.aClass153_1.method3081(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method5075(arg1);
	}
}
