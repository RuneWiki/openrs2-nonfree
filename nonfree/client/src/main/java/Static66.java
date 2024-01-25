import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)I")
	public static int method1200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static372.aClass106Array11 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 7;
		@Pc(20) int local20 = arg2 >> 7;
		if (local16 < 0 || local20 < 0 || local16 > Static81.anInt1950 - 1 || local20 > Static171.anInt3288 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg0;
		if (arg0 < 3 && (Static367.aByteArrayArrayArray16[1][local16][local20] & 0x2) != 0) {
			local41 = arg0 + 1;
		}
		return Static372.aClass106Array11[local41].va(arg1, arg2);
	}
}
