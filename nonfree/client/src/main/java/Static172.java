import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
	public static int anInt3367;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_150 = new Class22(46, -1);

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	public static final int anInt3366 = 12;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_18 = new Class68(10);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static202.aClass164ArrayArrayArray5[0][arg1][arg2] != null && Static202.aClass164ArrayArrayArray5[0][arg1][arg2].aClass164_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static202.aClass164ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(46) Class164 local46 = Static202.aClass164ArrayArrayArray5[local22][arg1][arg2] = new Class164(local22, arg1, arg2);
				if (local20) {
					local46.aByte53++;
				}
			}
		}
	}
}
