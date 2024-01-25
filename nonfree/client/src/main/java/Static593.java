import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZZII)I")
	public static int method8342(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub16 local10 = Static148.method2357(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray171.length; local18++) {
			if (local10.anIntArray171[local18] >= 0 && Static266.aClass138_1.anInt4296 > local10.anIntArray171[local18]) {
				@Pc(43) Class347 local43 = Static266.aClass138_1.method3730(local10.anIntArray171[local18]);
				@Pc(53) int local53 = local43.method8245(Static26.aClass179_1.method5148(arg0).anInt6887, arg0);
				if (arg1) {
					local16 += local10.anIntArray173[local18] * local53;
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}
}
