import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt10443;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!wia;")
	public static Class386 aClass386_129;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt10442 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIIII)V")
	public static void method8711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class390[] local7 = Static590.aClass390Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class390 local15 = local7[local9];
			if (local15 != null && local15.anInt11100 == 2) {
				Static11.method438(local15.anInt11109 * 2, local15.anInt11102, local15.anInt11107, arg1 >> 1, local15.anInt11105, arg3 >> 1);
				if (Static599.anIntArray449[0] > -1 && Static87.anInt1951 % 20 < 10) {
					@Pc(58) Class20 local58 = Static399.aClass20Array10[local15.anInt11098];
					@Pc(66) int local66 = Static599.anIntArray449[0] + arg0 - 12;
					@Pc(74) int local74 = Static599.anIntArray449[1] + arg2 - 28;
					local58.method7399(local66, local74);
					Static357.method5407(local66, local74, local74 + local58.method7408(), local58.method7394() + local66);
				}
			}
		}
	}
}
