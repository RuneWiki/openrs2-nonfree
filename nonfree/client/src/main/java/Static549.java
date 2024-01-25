import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZIIIIII)V")
	public static void method7769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(8) Class387[] local8 = Static672.aClass387Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class387 local16 = local8[local10];
			if (local16 != null && local16.anInt10809 == 2) {
				Static186.method2831(arg3 >> 1, local16.anInt10813 * 2, arg2 >> 1, local16.anInt10805, local16.anInt10815, local16.anInt10808);
				if (Static335.anIntArray331[0] > -1 && Static269.anInt4883 % 20 < 10) {
					@Pc(69) Class9 local69 = Static430.aClass9Array26[local16.anInt10810];
					@Pc(77) int local77 = Static335.anIntArray331[0] + arg1 - 12;
					@Pc(85) int local85 = arg0 + Static335.anIntArray331[1] - 28;
					local69.method8617(local77, local85);
					Static30.method402(local85, local77 + local69.method8619(), local77, local85 + local69.method8613());
				}
			}
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!fga;I)V")
	public static void method7770(@OriginalArg(0) Class3_Sub22 arg0) {
		arg0.aBoolean804 = false;
		if (arg0.aClass3_Sub33_6 != null) {
			arg0.aClass3_Sub33_6.anInt6919 = 0;
		}
		for (@Pc(20) Class3_Sub22 local20 = arg0.method9305(); local20 != null; local20 = arg0.method9303()) {
			method7770(local20);
		}
		if (true) {
			;
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BI)Z")
	public static boolean method7771(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9 || arg0 == 10;
	}
}
