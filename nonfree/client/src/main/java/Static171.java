import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "[S")
	public static short[] aShortArray24;

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "Lclient!gp;")
	public static Class91 aClass91_3;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Lclient!ek;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "Lclient!o;")
	public static Class13 aClass13_12;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "[I")
	public static final int[] anIntArray235 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	public static void method2405() {
		for (@Pc(7) int local7 = 0; local7 < Static208.anInt3488; local7++) {
			@Pc(13) Class64 local13 = Static147.aClass64Array1[local7];
			if (local13.aByte21 == 2) {
				if (local13.aClass2_Sub1_Sub3_1 == null) {
					local13.anInt1808 = Integer.MIN_VALUE;
				} else {
					Static421.aClass2_Sub1_Sub4_2.method3237(local13.aClass2_Sub1_Sub3_1);
				}
			}
		}
	}
}
