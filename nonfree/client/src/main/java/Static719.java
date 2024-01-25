import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static719 {

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	public static int anInt10965;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Lclient!wo;")
	public static final Class2_Sub58 aClass2_Sub58_1 = new Class2_Sub58(0, 0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
	public static boolean method9569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method9571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 + arg3;
		@Pc(18) int local18 = arg5 + arg1;
		@Pc(23) int local23 = arg2 + arg4;
		if (!Static159.method2362(local18, local18, arg0, local23, arg2, local23, arg0, local14, local18)) {
			return false;
		} else if (Static159.method2362(local18, local18, arg0, local23, arg2, arg2, local14, local14, local18)) {
			if (arg0 < Static600.anInt9334) {
				if (!Static159.method2362(local18, arg1, arg0, local23, local23, arg2, arg0, arg0, local18)) {
					return false;
				}
				if (!Static159.method2362(local18, arg1, arg0, arg2, local23, arg2, arg0, arg0, arg1)) {
					return false;
				}
			} else if (!Static159.method2362(local18, arg1, local14, local23, local23, arg2, local14, local14, local18)) {
				return false;
			} else if (!Static159.method2362(local18, arg1, local14, arg2, local23, arg2, local14, local14, arg1)) {
				return false;
			}
			if (Static384.anInt6087 > arg2) {
				if (!Static159.method2362(local18, arg1, arg0, arg2, arg2, arg2, arg0, local14, local18)) {
					return false;
				}
				if (!Static159.method2362(local18, arg1, arg0, arg2, arg2, arg2, local14, local14, arg1)) {
					return false;
				}
			} else if (!Static159.method2362(local18, arg1, arg0, local23, local23, local23, arg0, local14, local18)) {
				return false;
			} else if (!Static159.method2362(local18, arg1, arg0, local23, local23, local23, local14, local14, arg1)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
