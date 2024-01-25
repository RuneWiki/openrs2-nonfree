import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
	public static int anInt541;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Lclient!cu;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "Lclient!u;")
	public static final Class352 aClass352_2 = new Class352("LIVE", "", "", 0);

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
	public static int anInt542 = 0;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BII)Z")
	public static boolean method528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILclient!ha;IIIB)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((Static664.aClass49_38 == null || Static432.aClass49_28 == null || Static270.aClass49_23 == null) && Static583.aClass223_113.method5285(Static605.anInt9557) && Static583.aClass223_113.method5285(Static186.anInt3732) && Static583.aClass223_113.method5285(Static79.anInt1141)) {
			@Pc(37) Class64 local37 = Static691.method1249(Static583.aClass223_113, Static186.anInt3732, 0);
			Static432.aClass49_28 = arg2.method6714(local37, true);
			local37.method1240();
			Static190.aClass49_9 = arg2.method6714(local37, true);
			Static664.aClass49_38 = arg2.method6714(Static691.method1249(Static583.aClass223_113, Static605.anInt9557, 0), true);
			@Pc(62) Class64 local62 = Static691.method1249(Static583.aClass223_113, Static79.anInt1141, 0);
			Static270.aClass49_23 = arg2.method6714(local62, true);
			local62.method1240();
			Static382.aClass49_26 = arg2.method6714(local62, true);
		}
		if (Static664.aClass49_38 == null || Static432.aClass49_28 == null || Static270.aClass49_23 == null) {
			return;
		}
		@Pc(99) int local99 = (arg0 - Static270.aClass49_23.method8988() * 2) / Static664.aClass49_38.method8988();
		for (@Pc(101) int local101 = 0; local101 < local99; local101++) {
			Static664.aClass49_38.method8997(arg1 + Static270.aClass49_23.method8988() + Static664.aClass49_38.method8988() * local101, -Static664.aClass49_38.method8993() + arg4 + arg3);
		}
		@Pc(144) int local144 = (arg3 - Static270.aClass49_23.method8993() - 20) / Static432.aClass49_28.method8993();
		for (@Pc(146) int local146 = 0; local146 < local144; local146++) {
			Static432.aClass49_28.method8997(arg1, arg4 + local146 * Static432.aClass49_28.method8993() + 20);
			Static190.aClass49_9.method8997(arg1 + arg0 - Static190.aClass49_9.method8988(), arg4 + 20 + Static432.aClass49_28.method8993() * local146);
		}
		Static270.aClass49_23.method8997(arg1, arg3 + arg4 - Static270.aClass49_23.method8993());
		Static382.aClass49_26.method8997(arg1 + arg0 - Static270.aClass49_23.method8988(), -Static270.aClass49_23.method8993() + arg3 + arg4);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method530() {
		@Pc(5) Class359 local5 = Static535.aClass359_24;
		synchronized (Static535.aClass359_24) {
			Static535.aClass359_24.method8511();
		}
		local5 = Static296.aClass359_42;
		synchronized (Static296.aClass359_42) {
			Static296.aClass359_42.method8511();
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V")
	public static void method531() {
		@Pc(15) Class6_Sub13 local15 = Static30.method353(Static615.aClass241_115, Static525.aClass260_4.aClass270_2);
		Static525.aClass260_4.method6404(local15);
		for (@Pc(31) Class6_Sub25 local31 = (Class6_Sub25) Static477.aClass74_31.method1404(); local31 != null; local31 = (Class6_Sub25) Static477.aClass74_31.method1405()) {
			if (!local31.method9050()) {
				local31 = (Class6_Sub25) Static477.aClass74_31.method1404();
				if (local31 == null) {
					break;
				}
			}
			if (local31.anInt5008 == 0) {
				Static133.method2562(local31, true, true);
			}
		}
		if (Static339.aClass381_8 != null) {
			Static168.method3312(Static339.aClass381_8);
			Static339.aClass381_8 = null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
	public static void method532() {
		if (Static37.anInt498 == 3) {
			Static307.method4889(4);
		} else if (Static37.anInt498 == 7) {
			Static307.method4889(8);
		} else if (Static37.anInt498 == 9) {
			Static307.method4889(10);
		} else if (Static37.anInt498 == 11) {
			Static307.method4889(12);
		}
	}
}
