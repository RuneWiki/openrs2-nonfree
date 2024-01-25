import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ag;)V")
	public static void method3381(@OriginalArg(0) Class10_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort116; local2 <= arg0.aShort118; local2++) {
			for (@Pc(6) int local6 = arg0.aShort117; local6 <= arg0.aShort115; local6++) {
				@Pc(16) Class100 local16 = Static309.aClass100ArrayArrayArray2[arg0.aByte101][local2][local6];
				if (local16 != null) {
					@Pc(21) Class35 local21 = local16.aClass35_2;
					@Pc(23) Class35 local23 = null;
					while (local21 != null) {
						if (local21.aClass10_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass35_2 = local21.aClass35_1;
							} else {
								local23.aClass35_1 = local21.aClass35_1;
							}
							local21.method734();
							break;
						}
						local23 = local21;
						local21 = local21.aClass35_1;
					}
					local16.aByte36 = 0;
					for (@Pc(56) Class35 local56 = local16.aClass35_2; local56 != null; local56 = local56.aClass35_1) {
						local16.aByte36 = (byte) (local16.aByte36 | local56.anInt845);
					}
				}
			}
		}
	}
}
