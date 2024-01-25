import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	public static boolean aBoolean622 = false;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
	public static boolean aBoolean623 = false;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static final int anInt7804 = 1401;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt7805 = 999999;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public static int anInt7806 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	public static void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 != 8 && arg5 != 16) {
			@Pc(172) Class186 local172 = Static26.aClass186ArrayArrayArray1[arg1][arg0][arg2];
			if (local172 == null) {
				local172 = new Class186(arg1);
			}
			if (arg5 == 1) {
				local172.aShort64 = (short) arg4;
				local172.aShort63 = (short) arg3;
			} else if (arg5 == 2) {
				local172.aShort62 = (short) arg4;
				local172.aShort61 = (short) arg3;
			}
			if (Static97.aBoolean220) {
				Static507.method7291();
			}
			return;
		}
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(54) int local54;
		@Pc(64) int local64;
		if (arg5 != 8) {
			local29 = Static190.anInt4138 + (arg0 << Static606.anInt10280);
			local34 = local29 - Static190.anInt4138;
			local38 = arg2 << Static606.anInt10280;
			local42 = Static190.anInt4138 + local38;
			local54 = Static150.aClass245Array2[arg1].method7583(arg2, arg0 + 1);
			local64 = Static150.aClass245Array2[arg1].method7583(arg2 + 1, arg0);
			Static170.aClass169Array1[Static201.anInt7302++] = new Class169(arg5, arg1, local29, local34, local34, local29, local54, local64, local64 - arg4, local54 - arg4, local38, local42, local42, local38);
			return;
		}
		local29 = arg0 << Static606.anInt10280;
		local34 = Static190.anInt4138 + local29;
		local38 = arg2 << Static606.anInt10280;
		local42 = local38 + Static190.anInt4138;
		local54 = Static150.aClass245Array2[arg1].method7583(arg2, arg0);
		local64 = Static150.aClass245Array2[arg1].method7583(arg2 + 1, arg0 - -1);
		Static170.aClass169Array1[Static201.anInt7302++] = new Class169(arg5, arg1, local29, local34, local34, local29, local54, local64, local64 - arg4, local54 + -arg4, local38, local42, local42, local38);
	}
}
