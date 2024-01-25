import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!la;")
	public static Class208 aClass208_106;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "[Lclient!pi;")
	public static Class277[] aClass277Array1;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_83 = new Class387(10, 3);

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	public static int anInt7858 = -1;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
	public static int anInt7862 = -1;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg5;
		@Pc(14) int local14 = arg3 - arg0;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static646.method7025(Static569.anIntArrayArray54[local16], arg1, arg2, arg4);
		}
		for (@Pc(38) int local38 = arg3; local38 > local14; local38--) {
			Static646.method7025(Static569.anIntArrayArray54[local38], arg1, arg2, arg4);
		}
		@Pc(60) int local60 = arg1 + arg0;
		@Pc(65) int local65 = arg2 - arg0;
		for (@Pc(67) int local67 = local9; local67 <= local14; local67++) {
			@Pc(75) int[] local75 = Static569.anIntArrayArray54[local67];
			Static646.method7025(local75, arg1, local60, arg4);
			Static646.method7025(local75, local60, local65, arg6);
			Static646.method7025(local75, local65, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)V")
	public static void method6756(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub5_Sub6 local14 = Static478.method6972((long) arg0, 10);
		local14.method2686();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIILclient!ha;IB)V")
	public static void method6757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class57 arg3, @OriginalArg(6) int arg4) {
		Static617.aClass57_14 = arg3;
		Static422.aClass203_12 = Static617.aClass57_14.method7676();
		Static612.aClass203_14 = Static617.aClass57_14.method7676();
		Static296.aClass203_15 = Static617.aClass57_14.method7676();
		Static659.anInt10597 = 1;
		Static324.anInt10471 = arg2;
		Static625.anInt10198 = arg4;
		Static651.anInterface6_1 = null;
		Static649.anInt5978 = 2;
		Static53.anInt841 = 2;
		Static32.anInt566 = 0;
		Static213.anInt3473 = 0;
		Static558.method8061(arg1, arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class57 method6759(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface1 arg2) {
		return new Class57_Sub2(arg0, arg2, arg1);
	}
}
