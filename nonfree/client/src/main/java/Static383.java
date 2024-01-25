import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lclient!vd;")
	public static Class353 aClass353_64;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_127 = new Class268(93, 6);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public static void method6172(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub2_Sub16 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class199 local8 = Static228.aClass199Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static608.anInt10072; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static544.anInt9353; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static643.anInt10682;
							@Pc(32) int local32 = local12 << Static643.anInt10682;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class199 local41 = Static228.aClass199Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8532(local15, local12) - local41.method8532(local15, local12);
									@Pc(71) int local71 = local8.method8532(local15 + 1, local12) - local41.method8532(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8532(local15 + 1, local12 + 1) - local41.method8532(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8532(local15, local12 + 1) - local41.method8532(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)I")
	public static int method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static174.method3208(arg0 + 91923, arg1 + 45365, 4) + (Static174.method3208(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static174.method3208(arg0, arg1, 1) - 128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}
}
