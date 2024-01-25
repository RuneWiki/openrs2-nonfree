import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!gs;)Z")
	public static boolean method3451(@OriginalArg(1) Class123 arg0) {
		return arg0 == Static345.aClass123_12 || Static88.aClass123_2 == arg0 || arg0 == Static183.aClass123_5 || arg0 == Static364.aClass123_15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
	public static boolean method3452(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
	public static void method3454(@OriginalArg(0) int arg0) {
		Static49.anInt1353 = 2;
		Static518.anInt9045 = arg0;
		if (Static303.aString67 == null) {
			Static554.method7903(35);
		} else {
			@Pc(29) Class6_Sub26 local29 = new Class6_Sub26(Static115.method2331(Static375.method5954(Static303.aString67)));
			@Pc(33) long local33 = local29.method4935();
			Static196.aLong84 = local29.method4935();
			Static482.method7331("", true, Static141.method2654(local33));
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ep;)V")
	public static void method3455(@OriginalArg(1) Class93 arg0) {
		@Pc(7) Class93 local7 = Static145.method2679(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static228.anInt4744;
			local13 = Static180.anInt4051;
		} else {
			local11 = local7.anInt2777;
			local13 = local7.anInt2738;
		}
		Static327.method5258(local11, false, local13, arg0);
		Static300.method4868(local11, local13, arg0);
	}
}
