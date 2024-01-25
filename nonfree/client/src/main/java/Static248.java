import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public static int anInt4793 = -1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lclient!wh;")
	public static Class71_Sub8 method4080() {
		@Pc(12) Class71_Sub8 local12 = (Class71_Sub8) Static422.aClass273_7.method6250();
		if (local12 == null) {
			return new Class71_Sub8();
		} else {
			Static215.anInt4620--;
			return local12;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!sv;)V")
	public static void method4081(@OriginalArg(0) Class11_Sub5 arg0) {
		for (@Pc(2) int local2 = arg0.aShort95; local2 <= arg0.aShort94; local2++) {
			for (@Pc(6) int local6 = arg0.aShort93; local6 <= arg0.aShort92; local6++) {
				@Pc(16) Class162 local16 = Static294.aClass162ArrayArrayArray2[arg0.aByte100][local2][local6];
				if (local16 != null) {
					@Pc(21) Class199 local21 = local16.aClass199_1;
					@Pc(23) Class199 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub5_1 == arg0) {
							if (local23 == null) {
								local16.aClass199_1 = local21.aClass199_2;
							} else {
								local23.aClass199_2 = local21.aClass199_2;
							}
							local21.method4767();
							break;
						}
						local23 = local21;
						local21 = local21.aClass199_2;
					}
					local16.aByte62 = 0;
					for (@Pc(56) Class199 local56 = local16.aClass199_1; local56 != null; local56 = local56.aClass199_2) {
						local16.aByte62 = (byte) (local16.aByte62 | local56.anInt5745);
					}
				}
			}
		}
	}
}
