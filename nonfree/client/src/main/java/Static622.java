import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z")
	public static boolean method8537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIJI)V")
	public static void method8538(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static223.method4038(0, local15, true, 0, arg2, arg0, local22, 0);
			return;
		}
		@Pc(53) Class125 local53 = Static290.aClass163_5.method4124(121, local29);
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (local22 == 0 || local22 == 2) {
			local65 = local53.lb;
			local68 = local53.anInt3614;
		} else {
			local65 = local53.anInt3614;
			local68 = local53.lb;
		}
		@Pc(79) int local79 = local53.anInt3571;
		if (local22 != 0) {
			local79 = (local79 << local22 & 0xF) + (local79 >> 4 - local22);
		}
		Static223.method4038(local79, 0, true, local65, arg2, arg0, 0, local68);
	}
}
