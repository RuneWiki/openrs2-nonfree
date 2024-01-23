import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!va", name = "O", descriptor = "Lclient!cm;")
	public static Class8_Sub1_Sub5 aClass8_Sub1_Sub5_4;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Lclient!ub;")
	public static Class163 aClass163_12;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "J")
	public static volatile long aLong195 = 0L;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
	public static void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class124 local9 = Static270.method4035(arg0);
		@Pc(12) int local12 = local9.anInt3757;
		@Pc(15) int local15 = local9.anInt3756;
		@Pc(18) int local18 = local9.anInt3754;
		@Pc(25) int local25 = Class8_Sub3_Sub9.anIntArray102[local15 - local12];
		if (arg1 < 0 || arg1 > local25) {
			arg1 = 0;
		}
		local25 <<= local12;
		Static90.method1462(local18, local25 & arg1 << local12 | ~local25 & Static8.anIntArray495[local18]);
	}
}
