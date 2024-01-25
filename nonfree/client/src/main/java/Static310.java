import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)Lclient!kj;")
	public static Class11_Sub5_Sub2 method4451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class36 local16 = Static175.aClass36ArrayArrayArray1[arg1][arg0][arg2];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class11_Sub5_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class195 local27 = local16.aClass195_1; local27 != null; local27 = local27.aClass195_2) {
			@Pc(31) Class11_Sub5 local31 = local27.aClass11_Sub5_1;
			if (local31 instanceof Class11_Sub5_Sub2) {
				@Pc(37) Class11_Sub5_Sub2 local37 = (Class11_Sub5_Sub2) local31;
				@Pc(47) int local47 = local37.method6215() * 64 - 4;
				@Pc(55) int local55 = local37.anInt7626 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt7622 - local47 >> 7;
				@Pc(69) int local69 = local47 + local37.anInt7626 >> 7;
				@Pc(76) int local76 = local47 + local37.anInt7622 >> 7;
				if (local55 <= arg0 && local62 <= arg2 && local69 >= arg0 && arg2 <= local76) {
					@Pc(110) int local110 = (local69 + 1 - arg0) * (-arg2 + (local76 - -1));
					if (local24 < local110) {
						local24 = local110;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}
}
