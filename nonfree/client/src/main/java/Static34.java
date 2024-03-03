import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!bu", name = "K", descriptor = "Lclient!jd;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IC)Z", line = 664)
	public static boolean method1103(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Z", line = 1688)
	public static boolean method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static155.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static180.anInt3552) {
			return false;
		} else if (local7 == Static180.anInt3552) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static299.anInt6017;
			@Pc(26) int local26 = arg2 << Static299.anInt6017;
			if (Static43.method1425(local22 + 1, Static340.aClass6Array4[arg0].method5720(arg1, arg2), local26 + 1) && Static43.method1425(local22 + Class11_Sub5_Sub3.anInt4707 - 1, Static340.aClass6Array4[arg0].method5720(arg1 + 1, arg2), local26 + 1) && Static43.method1425(local22 + Class11_Sub5_Sub3.anInt4707 - 1, Static340.aClass6Array4[arg0].method5720(arg1 + 1, arg2 + 1), local26 + Class11_Sub5_Sub3.anInt4707 - 1) && Static43.method1425(local22 + 1, Static340.aClass6Array4[arg0].method5720(arg1, arg2 + 1), local26 + Class11_Sub5_Sub3.anInt4707 - 1)) {
				Static155.anIntArrayArrayArray9[arg0][arg1][arg2] = Static180.anInt3552;
				return true;
			} else {
				Static155.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static180.anInt3552;
				return false;
			}
		}
	}
}
