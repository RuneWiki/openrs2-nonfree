import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "Z")
	public static boolean aBoolean330;

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "[[Lclient!uaa;")
	public static Class345[][] aClass345ArrayArray1;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_4 = new Class139(7, 2);

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
	public static void method3370() {
		Static124.method2246();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIZIII)V")
	public static void method3372(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) Class371[] local12 = Static564.aClass371Array6;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class371 local20 = local12[local14];
			if (local20 != null && local20.anInt10324 == 2) {
				Static408.method5985(local20.anInt10316, local20.anInt10323, local20.anInt10322 * 2, arg3 >> 1, local20.anInt10320, arg2 >> 1);
				if (Static665.anIntArray475[0] > -1 && Static26.anInt350 % 20 < 10) {
					@Pc(67) Class50 local67 = Static375.aClass50Array10[local20.anInt10318];
					@Pc(75) int local75 = Static665.anIntArray475[0] + arg0 - 12;
					@Pc(84) int local84 = arg1 + Static665.anIntArray475[1] - 28;
					local67.method5996(local75, local84);
					Static520.method7366(local75, local84 + local67.method6010(), local84, local67.method6003() + local75);
				}
			}
		}
	}
}
