import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fja", name = "D", descriptor = "I")
	public static int anInt3311 = 0;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIII)I")
	public static int method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static121.aClass21Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || Static158.anInt927 - 1 < local11 || local15 > Static515.anInt8292 - 1) {
			return 0;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 < 3 && (Static90.aByteArrayArrayArray25[1][local11][local15] & 0x2) != 0) {
			local53 = arg0 + 1;
		}
		return Static121.aClass21Array2[local53].method7980(arg2, arg1);
	}
}
