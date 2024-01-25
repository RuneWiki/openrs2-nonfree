import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(JJ)J")
	public static long method5086(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIBIZ)I")
	public static int method5087(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class6_Sub15 local10 = Static519.method7596(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray173.length; local18++) {
			if (local10.anIntArray173[local18] >= 0 && Static98.aClass203_1.anInt5738 > local10.anIntArray173[local18]) {
				@Pc(44) Class145 local44 = Static98.aClass203_1.method4899(local10.anIntArray173[local18]);
				@Pc(54) int local54 = local44.method3852(Static499.aClass118_2.method3497(arg1).anInt2851, arg1);
				if (arg0) {
					local16 += local54 * local10.anIntArray174[local18];
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!mu;Lclient!mu;I)V")
	public static void method5093(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg0.aClass6_284 != null) {
			arg0.method8151();
		}
		arg0.aClass6_283 = arg1;
		arg0.aClass6_284 = arg1.aClass6_284;
		arg0.aClass6_284.aClass6_283 = arg0;
		arg0.aClass6_283.aClass6_284 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class6_Sub4_Sub6 local12 = Static68.method1408(3, arg0);
		local12.method3826();
		local12.aString50 = arg1;
	}
}
