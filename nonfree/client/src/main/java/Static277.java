import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!va", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = new String[500];

	@OriginalMember(owner = "client!va", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString185 = "cyan:";

	@OriginalMember(owner = "client!va", name = "O", descriptor = "Lclient!db;")
	public static Class31 aClass31_41 = new Class31(16);

	@OriginalMember(owner = "client!va", name = "R", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZI[Lclient!og;B)V")
	public static void method4260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class127[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(24) Class127 local24 = arg4[local7];
			if (local24 != null && local24.anInt3563 == arg3) {
				Static120.method1891(arg2, arg1, local24, arg0);
				Static282.method4508(arg1, arg0, local24);
				if (local24.anInt3628 > local24.anInt3600 - local24.anInt3595) {
					local24.anInt3628 = local24.anInt3600 - local24.anInt3595;
				}
				if (local24.anInt3628 < 0) {
					local24.anInt3628 = 0;
				}
				if (local24.anInt3583 > local24.anInt3631 - local24.anInt3567) {
					local24.anInt3583 = local24.anInt3631 - local24.anInt3567;
				}
				if (local24.anInt3583 < 0) {
					local24.anInt3583 = 0;
				}
				if (local24.anInt3570 == 0) {
					Static89.method1474(arg2, local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method4261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass125_1 != null && local7.aClass125_1.aLong118 == arg3) {
			return true;
		} else if (local7.aClass63_1 != null && local7.aClass63_1.aLong55 == arg3) {
			return true;
		} else if (local7.aClass167_1 != null && local7.aClass167_1.aLong178 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2570; local46++) {
				if (local7.aClass124Array2[local46].aLong114 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
