import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "Lclient!gj;")
	public static Class143 aClass143_87;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_9 = new Class239("", 10);

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "[Lclient!fl;")
	public static final Class23_Sub2_Sub1_Sub2_Sub1[] aClass23_Sub2_Sub1_Sub2_Sub1Array1 = new Class23_Sub2_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	public static int anInt6225 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)Lclient!aba;")
	public static Class4 method5220() {
		return new Class4(1, false);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIBI[B)Z")
	public static boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg1 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg0 + 7) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
