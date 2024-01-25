import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public static int anInt1925;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_26 = new Class90(44, -2);

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "[I")
	public static final int[] anIntArray86 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([[[Lclient!ko;I)V")
	public static void method1606(@OriginalArg(0) Class182[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class182[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class182 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass21_Sub1_Sub5_1 instanceof Interface21) {
							((Interface21) local27.aClass21_Sub1_Sub5_1).method7284();
						}
						if (local27.aClass21_Sub1_Sub3_2 instanceof Interface21) {
							((Interface21) local27.aClass21_Sub1_Sub3_2).method7284();
						}
						if (local27.aClass21_Sub1_Sub3_1 instanceof Interface21) {
							((Interface21) local27.aClass21_Sub1_Sub3_1).method7284();
						}
						if (local27.aClass21_Sub1_Sub2_1 instanceof Interface21) {
							((Interface21) local27.aClass21_Sub1_Sub2_1).method7284();
						}
						if (local27.aClass21_Sub1_Sub2_2 instanceof Interface21) {
							((Interface21) local27.aClass21_Sub1_Sub2_2).method7284();
						}
						for (@Pc(79) Class192 local79 = local27.aClass192_2; local79 != null; local79 = local79.aClass192_3) {
							@Pc(84) Class21_Sub1_Sub1 local84 = local79.aClass21_Sub1_Sub1_1;
							if (local84 instanceof Interface21) {
								((Interface21) local84).method7284();
							}
						}
					}
				}
			}
		}
	}
}
