import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "J")
	public static long aLong303;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)I")
	public static int method8830(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBII)I")
	public static int method8831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static582.aClass35Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(20) int local20 = arg0 >> 9;
		if (local11 < 0 || local20 < 0 || local11 > Static98.anInt361 - 1 || Static438.anInt7120 - 1 < local20) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static315.aByteArrayArrayArray13[1][local11][local20] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static582.aClass35Array3[local48].method7452(arg1, arg0);
	}
}
