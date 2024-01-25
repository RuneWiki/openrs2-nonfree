import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "D")
	public static double aDouble28;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "Lclient!fa;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Lclient!vca;")
	public static final Class353 aClass353_2 = new Class353();

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "Lclient!vca;")
	public static final Class353 aClass353_5 = new Class353();

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "Lclient!vca;")
	public static final Class353 aClass353_3 = new Class353();

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "Lclient!vca;")
	public static final Class353 aClass353_4 = new Class353();

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "[I")
	public static final int[] anIntArray592 = new int[13];

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	public static final int anInt10136 = 1339;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public static void method8179() {
		for (@Pc(7) int local7 = 0; local7 < Static239.aClass216ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static239.aClass216ArrayArray1[local7].length; local11++) {
				Static239.aClass216ArrayArray1[local7][local11] = Static605.aClass216_3;
			}
		}
	}
}
