import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "[S")
	public static short[] aShortArray111;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "[I")
	public static final int[] anIntArray518 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "F")
	public static float aFloat71 = 1024.0F;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!rj;Lclient!rj;)V")
	public static void method5214(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg1.aClass2_Sub7_54 != null) {
			arg1.method6085();
		}
		arg1.aClass2_Sub7_54 = arg0;
		arg1.aClass2_Sub7_53 = arg0.aClass2_Sub7_53;
		arg1.aClass2_Sub7_54.aClass2_Sub7_53 = arg1;
		arg1.aClass2_Sub7_53.aClass2_Sub7_54 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(III)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static45.aClass188ArrayArrayArray5[0][arg1][arg2] != null && Static45.aClass188ArrayArrayArray5[0][arg1][arg2].aClass188_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static45.aClass188ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(46) Class188 local46 = Static45.aClass188ArrayArrayArray5[local22][arg1][arg2] = new Class188(local22, arg1, arg2);
				if (local20) {
					local46.aByte43++;
				}
			}
		}
	}
}
