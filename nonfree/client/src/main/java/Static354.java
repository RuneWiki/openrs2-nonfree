import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	public static void method5132(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub4_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class12 local8 = Static64.aClass12Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static245.anInt4308; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static209.anInt3602; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static185.anInt3178;
							@Pc(32) int local32 = local12 << Static185.anInt3178;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class12 local41 = Static64.aClass12Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7846(local15, local12) - local41.method7846(local15, local12);
									@Pc(71) int local71 = local8.method7846(local15 + 1, local12) - local41.method7846(local15 + 1, local12);
									@Pc(91) int local91 = local8.method7846(local15 + 1, local12 + 1) - local41.method7846(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method7846(local15, local12 + 1) - local41.method7846(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	public static void method5133() {
		for (@Pc(3) int local3 = 0; local3 < Static90.aByteArrayArrayArray2.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static90.aByteArrayArrayArray2[0].length; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static90.aByteArrayArrayArray2[0][0].length; local13++) {
					Static90.aByteArrayArrayArray2[local3][local9][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)Z")
	public static boolean method5134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static267.aBoolean292 || !Static322.aBoolean345) {
			return false;
		} else if (Static339.anInt5857 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static188.anIntArrayArrayArray16[arg2][arg0][arg1];
			if (local22 == -Static237.anInt4278) {
				return false;
			} else if (Static237.anInt4278 == local22) {
				return true;
			} else if (Static68.aClass12Array2 == Static289.aClass12Array3) {
				return false;
			} else {
				@Pc(42) int local42 = arg0 << Static185.anInt3178;
				@Pc(46) int local46 = arg1 << Static185.anInt3178;
				if (Static641.method8755(local46 + 1, local42 + 1, local42 + 1, Static289.aClass12Array3[arg2].method7846(arg0, arg1), Static655.anInt10510 + local42 - 1, Static289.aClass12Array3[arg2].method7846(arg0 + 1, arg1 - -1), Static289.aClass12Array3[arg2].method7846(arg0, arg1 + 1), local46 + Static655.anInt10510 - 1, local46 - -Static655.anInt10510 + -1) && Static641.method8755(local46 + 1, local42 + 1, Static655.anInt10510 + local42 - 1, Static289.aClass12Array3[arg2].method7846(arg0, arg1), local42 + Static655.anInt10510 - 1, Static289.aClass12Array3[arg2].method7846(arg0 + 1, arg1), Static289.aClass12Array3[arg2].method7846(arg0 + 1, arg1 + 1), Static655.anInt10510 + local46 - 1, local46 + 1)) {
					Static70.anInt1336++;
					Static188.anIntArrayArrayArray16[arg2][arg0][arg1] = Static237.anInt4278;
					return true;
				} else {
					Static188.anIntArrayArrayArray16[arg2][arg0][arg1] = -Static237.anInt4278;
					return false;
				}
			}
		}
	}
}
