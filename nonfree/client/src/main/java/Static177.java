import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Lclient!tha;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_19 = new Class114();

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public static int anInt3581 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V")
	public static void method3067(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(46) int local46;
			@Pc(41) int local41;
			label45: do {
				while (true) {
					while (true) {
						local22 = local10.method2859();
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(112) int[] local112 = Static543.anIntArray653 = new int[6];
							local112[0] = local10.method2825();
							local112[1] = local10.method2825();
							local112[2] = local10.method2825();
							local112[3] = local10.method2825();
							local112[4] = local10.method2825();
							local112[5] = local10.method2825();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local41 = local10.method2859();
							Static187.anIntArray242 = new int[local41];
							for (local46 = 0; local46 < local41; local46++) {
								Static187.anIntArray242[local46] = local10.method2825();
								if (Static187.anIntArray242[local46] == 65535) {
									Static187.anIntArray242[local46] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local41 = local10.method2859();
			Static123.anIntArray179 = new int[local41];
			for (local46 = 0; local46 < local41; local46++) {
				Static123.anIntArray179[local46] = local10.method2825();
				if (Static123.anIntArray179[local46] == 65535) {
					Static123.anIntArray179[local46] = -1;
				}
			}
		}
	}
}
