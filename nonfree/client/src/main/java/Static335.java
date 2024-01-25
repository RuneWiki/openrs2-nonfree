import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
	public static int anInt5661;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIIIBLclient!kn;)Z")
	public static boolean method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5) {
		if (!Static437.aBoolean537 || !Static631.aBoolean753) {
			return false;
		} else if (Static192.anInt3358 < 100) {
			return false;
		} else if (arg1 != arg2 || arg4 != arg3) {
			for (@Pc(53) int local53 = arg1; local53 <= arg2; local53++) {
				for (@Pc(57) int local57 = arg4; local57 <= arg3; local57++) {
					if (-Static28.anInt364 == Static519.anIntArrayArrayArray13[arg0][local53][local57]) {
						return false;
					}
				}
			}
			if (Static245.method8120(arg5)) {
				Static81.anInt1682++;
				return true;
			} else {
				return false;
			}
		} else if (!Static463.method6855(arg0, arg1, arg4)) {
			return false;
		} else if (Static245.method8120(arg5)) {
			Static81.anInt1682++;
			return true;
		} else {
			return false;
		}
	}
}
