import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!ij;")
	public static Class93 aClass93_77;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt3972 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static void method3522() {
		Static321.aBoolean519 = true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public static void method3524() {
		@Pc(5) Class109 local5 = Static39.aClass109_12;
		synchronized (Static39.aClass109_12) {
			Static39.aClass109_12.method2858();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V")
	public static void method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = Static161.method2842(arg4, Static346.anInt6668, Static75.anInt1447);
		@Pc(15) int local15 = Static161.method2842(arg1, Static346.anInt6668, Static75.anInt1447);
		@Pc(21) int local21 = Static161.method2842(arg5, Static353.anInt6760, Static163.anInt3234);
		@Pc(27) int local27 = Static161.method2842(arg0, Static353.anInt6760, Static163.anInt3234);
		@Pc(35) int local35 = Static161.method2842(arg2 + arg4, Static346.anInt6668, Static75.anInt1447);
		@Pc(43) int local43 = Static161.method2842(arg1 - arg2, Static346.anInt6668, Static75.anInt1447);
		for (@Pc(45) int local45 = local9; local45 < local35; local45++) {
			Static160.method2840(arg3, local27, local21, Static129.anIntArrayArray46[local45]);
		}
		for (@Pc(60) int local60 = local15; local60 > local43; local60--) {
			Static160.method2840(arg3, local27, local21, Static129.anIntArrayArray46[local60]);
		}
		@Pc(82) int local82 = Static161.method2842(arg5 + arg2, Static353.anInt6760, Static163.anInt3234);
		@Pc(91) int local91 = Static161.method2842(arg0 - arg2, Static353.anInt6760, Static163.anInt3234);
		for (@Pc(93) int local93 = local35; local93 <= local43; local93++) {
			@Pc(103) int[] local103 = Static129.anIntArrayArray46[local93];
			Static160.method2840(arg3, local82, local21, local103);
			Static160.method2840(arg3, local27, local91, local103);
		}
	}
}
