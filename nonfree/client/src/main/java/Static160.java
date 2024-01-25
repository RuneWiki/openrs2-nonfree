import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!q;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	public static int anInt3053;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "Lclient!em;")
	public static final Class83 aClass83_71 = new Class83(5, 12);

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
	public static final int[] anIntArray140 = new int[32];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method2619(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg3 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg2 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local30; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local40; local51 < 0; local51++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lclient!sr;")
	public static Class248_Sub1 method2621(@OriginalArg(1) int arg0) {
		return Static369.aBoolean674 && Static253.anInt4668 <= arg0 && Static281.anInt5189 >= arg0 ? Static337.aClass248_Sub1Array2[arg0 - Static253.anInt4668] : null;
	}
}
