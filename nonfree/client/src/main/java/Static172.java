import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
	public static int anInt3651 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!kr;IILclient!np;Z)V")
	public static void method3204(@OriginalArg(0) Class138 arg0, @OriginalArg(3) Class155 arg1) {
		Static299.aClass138_37.method3046();
		if (Static214.aBoolean272) {
			return;
		}
		for (@Pc(21) Class3_Sub41 local21 = (Class3_Sub41) arg0.method3051(); local21 != null; local21 = (Class3_Sub41) arg0.method3050()) {
			@Pc(29) Class196 local29 = Static42.aClass195_2.method4500(local21.anInt6279);
			if (Static270.method5280(local29)) {
				@Pc(41) boolean local41 = Static109.method1781(local21, arg1, local29);
				if (local41) {
					Static6.method89(local21, arg1, local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	public static void method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static69.aClass48ArrayArrayArray1[0][arg1][arg2] != null && Static69.aClass48ArrayArrayArray1[0][arg1][arg2].aClass48_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static69.aClass48ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class48 local46 = Static69.aClass48ArrayArrayArray1[local22][arg1][arg2] = new Class48(local22, arg1, arg2);
				if (local20) {
					local46.aByte14++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)I")
	public static int method3207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
