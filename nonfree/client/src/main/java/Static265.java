import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_183 = new Class62("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_12 = new Class213(7, 6);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!g;)V")
	public static void method4508(@OriginalArg(1) Class83 arg0) {
		Static129.anInt2810 = arg0.method1961("titlebg");
		Static145.anInt5346 = arg0.method1961("logo");
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 + arg5;
		@Pc(18) int local18 = arg1 - arg4;
		for (@Pc(20) int local20 = arg5; local20 < local9; local20++) {
			Static307.method5019(Static152.anIntArrayArray30[local20], arg0, arg2, arg3);
		}
		for (@Pc(36) int local36 = arg1; local36 > local18; local36--) {
			Static307.method5019(Static152.anIntArrayArray30[local36], arg0, arg2, arg3);
		}
		@Pc(59) int local59 = arg0 - arg4;
		@Pc(63) int local63 = arg4 + arg3;
		for (@Pc(65) int local65 = local9; local65 <= local18; local65++) {
			@Pc(71) int[] local71 = Static152.anIntArrayArray30[local65];
			Static307.method5019(local71, local63, arg2, arg3);
			Static307.method5019(local71, arg0, arg2, local59);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!pt;Lclient!pt;Z)V")
	public static void method4511(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_243 != null) {
			arg1.method6130();
		}
		arg1.aClass2_244 = arg0;
		arg1.aClass2_243 = arg0.aClass2_243;
		arg1.aClass2_243.aClass2_244 = arg1;
		arg1.aClass2_244.aClass2_243 = arg1;
	}
}
