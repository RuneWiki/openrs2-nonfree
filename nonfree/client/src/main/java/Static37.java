import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "F", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)I")
	public static int method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static205.aClass46Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static18.anInt5706 - 1 || local15 > Static80.anInt1367 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && (Static267.aByteArrayArrayArray8[1][local11][local15] & 0x2) != 0) {
			local41 = arg2 + 1;
		}
		return Static205.aClass46Array1[local41].sa(arg1, arg0);
	}
}
