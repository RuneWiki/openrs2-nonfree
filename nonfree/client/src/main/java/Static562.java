import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString109 = "";

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!op;II)J")
	public static long method7911(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(21) Class272 local21 = Static541.aClass349_4.method8123(arg1.method8587());
		@Pc(44) long local44 = (long) (arg1.method8588() << 14 | arg0 | arg2 << 7 | arg1.method8586() << 20 | 0x40000000);
		if (local21.anInt8270 == 0) {
			local44 |= local12;
		}
		if (local21.anInt8294 == 1) {
			local44 |= local10;
		}
		return local44 | (long) arg1.method8587() << 32;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIII)Z")
	public static boolean method7912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static20.aBoolean21 || !Static110.aBoolean234) {
			return false;
		} else if (Static314.anInt6404 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static467.anIntArrayArrayArray11[arg0][arg1][arg2];
			if (local22 == -Static398.anInt7623) {
				return false;
			} else if (Static398.anInt7623 == local22) {
				return true;
			} else if (Static524.aClass274Array3 == Static500.aClass274Array2) {
				return false;
			} else {
				@Pc(46) int local46 = arg1 << Static276.anInt5846;
				@Pc(50) int local50 = arg2 << Static276.anInt5846;
				if (Static531.method7550(Static500.aClass274Array2[arg0].method8041(arg1, arg2 + 1), local46 + 1, local46 - -Static325.anInt6512 + -1, Static500.aClass274Array2[arg0].method8041(arg1, arg2), local50 + 1, local46 + 1, Static325.anInt6512 + local50 - 1, Static500.aClass274Array2[arg0].method8041(arg1 + 1, arg2 + 1), Static325.anInt6512 + local50 - 1) && Static531.method7550(Static500.aClass274Array2[arg0].method8041(arg1 + 1, arg2 + 1), Static325.anInt6512 + local46 - 1, Static325.anInt6512 + -1 + local46, Static500.aClass274Array2[arg0].method8041(arg1, arg2), local50 + 1, local46 - -1, local50 + 1, Static500.aClass274Array2[arg0].method8041(arg1 + 1, arg2), Static325.anInt6512 + local50 - 1)) {
					Static106.anInt2655++;
					Static467.anIntArrayArrayArray11[arg0][arg1][arg2] = Static398.anInt7623;
					return true;
				} else {
					Static467.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static398.anInt7623;
					return false;
				}
			}
		}
	}
}
