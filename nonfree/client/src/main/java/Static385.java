import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array31;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "Lclient!tja;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
	public static int anInt7281 = 0;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method6484(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg3 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg1 + 7) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local18;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BB)V")
	public static void method6486(@OriginalArg(1) byte arg0) {
		if (Static516.aByteArrayArrayArray18 == null) {
			Static516.aByteArrayArrayArray18 = new byte[4][Static222.anInt4533][Static668.anInt11370];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static222.anInt4533; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static668.anInt11370; local22++) {
					Static516.aByteArrayArrayArray18[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ll;I)Z")
	public static boolean method6487(@OriginalArg(0) Class218 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean505) {
			return false;
		} else if (!arg0.method6003(Static331.anInterface15_2)) {
			return false;
		} else if (Static137.aClass335_10.method8357((long) arg0.anInt6688) == null) {
			return Static377.aClass335_23.method8357((long) arg0.anInt6683) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!ol;)Lclient!bb;")
	public static Class26_Sub1 method6488(@OriginalArg(1) Class2_Sub8 arg0) {
		return new Class26_Sub1(arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5161(), arg0.method5161(), arg0.method5203());
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)Z")
	public static boolean method6490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface23 local11 = (Interface23) Static584.method4102(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static463.method7434(local11) & true;
		}
		local11 = (Interface23) Static174.method3415(arg1, arg2, arg0, vu.class);
		if (local11 != null) {
			local5 &= Static463.method7434(local11);
		}
		local11 = (Interface23) Static428.method7017(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static463.method7434(local11);
		}
		return local5;
	}
}
