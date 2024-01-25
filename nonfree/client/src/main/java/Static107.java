import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!um;")
	public static Class243 aClass243_62;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "[[[Lclient!vt;")
	public static Class258[][][] aClass258ArrayArrayArray2;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array5;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_50 = new Class129(0, 6);

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!hv;")
	public static final Class107 aClass107_4 = new Class107();

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_51 = new Class129(60, 8);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I")
	public static int method1477(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method1478(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static410.aClass125Array3 == Static408.aClass125Array2) {
			return;
		}
		@Pc(9) int local9 = Static110.aClass125Array1[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class125 local22 = Static110.aClass125Array1[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
