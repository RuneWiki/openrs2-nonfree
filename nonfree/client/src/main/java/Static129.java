import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!wt;")
	public static Class1_Sub51 aClass1_Sub51_3;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Lclient!pu;")
	public static Class270 aClass270_30;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!lca;")
	public static final Class203 aClass203_5 = new Class203(4);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
	public static void method2017() {
		Static515.aClass110Array1 = null;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!r;BIILclient!et;I)V")
	public static void method2018(@OriginalArg(0) Class134 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class281 local9 = Static521.aClass257_4.method5590(arg3.anInt2421);
		if (local9.anInt7676 == -1) {
			return;
		}
		if (arg3.aBoolean179) {
			@Pc(22) int local22 = arg4 + arg3.anInt2415;
			arg4 = local22 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class22 local38 = local9.method6114(arg4, arg3.aBoolean184, arg0);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg3.anInt2403;
		@Pc(47) int local47 = arg3.anInt2387;
		if ((arg4 & 0x1) == 1) {
			local47 = arg3.anInt2403;
			local44 = arg3.anInt2387;
		}
		@Pc(67) int local67 = local38.A();
		@Pc(70) int local70 = local38.ca();
		if (local9.aBoolean592) {
			local67 = local44 * 4;
			local70 = local47 * 4;
		}
		if (local9.anInt7677 == 0) {
			local38.method7653(arg1, arg2 - (local47 - 1) * 4, local67, local70);
		} else {
			local38.method7654(arg1, arg2 - (local47 - 1) * 4, local67, local70, 0, local9.anInt7677 | 0xFF000000, 1);
		}
	}
}
