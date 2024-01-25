import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_73 = new Class6(82, -2);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IC)Z")
	public static boolean method4018(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static340.method5511(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static14.aCharArray1;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(23) char local23 = local16[local18];
				if (local23 == arg0) {
					return true;
				}
			}
			@Pc(39) char[] local39 = Static157.aCharArray2;
			for (@Pc(41) int local41 = 0; local41 < local39.length; local41++) {
				@Pc(46) char local46 = local39[local41];
				if (local46 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public static void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class206 local28 = Static313.aClass206ArrayArrayArray2[local9][arg0][arg1] = Static313.aClass206ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte73--;
				for (@Pc(40) Class168 local40 = local28.aClass168_2; local40 != null; local40 = local40.aClass168_1) {
					@Pc(44) Class47_Sub2 local44 = local40.aClass47_Sub2_2;
					if (local44.aShort115 == arg0 && local44.aShort117 == arg1) {
						local44.aByte94--;
					}
				}
			}
		}
		if (Static313.aClass206ArrayArrayArray2[0][arg0][arg1] == null) {
			Static313.aClass206ArrayArrayArray2[0][arg0][arg1] = new Class206(0, arg0, arg1);
			Static313.aClass206ArrayArrayArray2[0][arg0][arg1].aByte70 = 1;
		}
		Static313.aClass206ArrayArrayArray2[0][arg0][arg1].aClass206_1 = local7;
		Static313.aClass206ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
