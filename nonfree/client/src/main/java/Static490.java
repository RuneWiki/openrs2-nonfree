import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)Z")
	public static boolean method6708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static190.method3451(arg0, arg1) || Static516.method7139(arg1, arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ba;ZIILclient!qt;I)V")
	public static void method6709(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class277 arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg3.method6208(arg0.EA(), arg2, arg0.M(), arg1, arg4, arg0.K(), arg0.DA(), arg0.ZA(), arg0.LA(), arg0.ha());
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)Z")
	public static boolean method6711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public static void method6712() {
		for (@Pc(6) Class98_Sub4 local6 = (Class98_Sub4) Static158.aClass40_3.method1137(); local6 != null; local6 = (Class98_Sub4) Static158.aClass40_3.method1137()) {
			Static154.method2912(local6);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Static294.anInt5492;
			local31 = Static294.anInt5492;
		}
		Static67.method1357();
		for (@Pc(48) int local48 = local31; local48 <= local30; local48++) {
			Static67.method1367();
			Static67.method1352(local48);
			Static67.method1360(local48);
		}
		Static67.method1351();
		Static67.method1353();
	}
}
