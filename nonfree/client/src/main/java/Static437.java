import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!haa;Z[[[BIB)Z")
	public static boolean method6518(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static39.aBoolean48) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt11184 >> Static110.anInt1858;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt11178 >> Static110.anInt1858;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class4_Sub3_Sub3) {
			local11 = ((Class4_Sub3_Sub3) arg0).aShort107;
			local18 = ((Class4_Sub3_Sub3) arg0).aShort110;
			local9 = ((Class4_Sub3_Sub3) arg0).aShort108;
			local16 = ((Class4_Sub3_Sub3) arg0).aShort109;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte147 < Static59.anInt987 && local39 >= Static318.anInt5565 && local39 < Static145.anInt2286 && local42 >= Static81.anInt1405 && local42 < Static297.anInt5328) {
					if ((arg2 == null || arg0.aByte146 < arg3 || arg2[arg0.aByte146][local39][local42] != arg4) && arg0.method9486() && !arg0.method9487(Static554.aClass144_12)) {
						return false;
					}
					if (!arg1 && local39 >= Static307.anInt5453 - 16 && local39 <= Static307.anInt5453 + 16 && local42 >= Static325.anInt5630 - 16 && local42 <= Static325.anInt5630 + 16) {
						if (Static326.aBoolean408) {
							Static100.aClass399Array1[Static207.anInt3641++].method9465(arg0);
							Static207.anInt3641 %= Static496.anInt8374;
						} else {
							arg0.method9490(Static554.aClass144_12);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public static void method6519(@OriginalArg(1) int arg0) {
		if (!Static558.method8063(arg0)) {
			return;
		}
		@Pc(18) Class299[] local18 = Static339.aClass299ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(25) Class299 local25 = local18[local20];
			if (local25 != null && local25.aClass181_11 != null) {
				local25.aClass181_11.method8942();
			}
		}
	}
}
