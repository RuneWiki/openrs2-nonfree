import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_177 = new Class129(28, 1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method5188(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static31.anInt622;
		@Pc(9) int[] local9 = Static334.anIntArray387;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class2_Sub1_Sub3_Sub2 local21 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static220.aClass2_Sub1_Sub3_Sub2_1 && local21.aString65 != null && local21.aString65.equalsIgnoreCase(arg1)) {
				local11 = true;
				if (arg0 == 1) {
					Static288.method3576(Static119.aClass194_60);
					Static281.aClass5_Sub15_Sub2_13.method5564(local9[local13]);
					Static281.aClass5_Sub15_Sub2_13.method5583(0);
				} else if (arg0 == 4) {
					Static288.method3576(Static4.aClass194_1);
					Static281.aClass5_Sub15_Sub2_13.method5566(local9[local13]);
					Static281.aClass5_Sub15_Sub2_13.method5602(0);
				} else if (arg0 == 5) {
					Static288.method3576(Static198.aClass194_54);
					Static281.aClass5_Sub15_Sub2_13.method5562(0);
					Static281.aClass5_Sub15_Sub2_13.method5566(local9[local13]);
				} else if (arg0 == 6) {
					Static288.method3576(Static464.aClass194_119);
					Static281.aClass5_Sub15_Sub2_13.method5583(0);
					Static281.aClass5_Sub15_Sub2_13.method5588(local9[local13]);
				} else if (arg0 == 7) {
					Static288.method3576(Static372.aClass194_100);
					Static281.aClass5_Sub15_Sub2_13.method5588(local9[local13]);
					Static281.aClass5_Sub15_Sub2_13.method5583(0);
				}
				break;
			}
		}
		if (!local11) {
			Static411.method5422(Static59.aClass198_18.method4012(Static38.anInt4834) + arg1);
		}
	}
}
