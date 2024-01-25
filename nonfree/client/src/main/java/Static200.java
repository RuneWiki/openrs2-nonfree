import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public static int anInt3817;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_60 = new Class40("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static283.anInt5788 = arg4;
		Static416.anInt7368 = arg0;
		Static398.anInt7149 = arg5;
		Static389.anInt7025 = arg2;
		Static267.anInt5244 = arg1;
		Static255.anInt5114 = arg3;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method3290(@OriginalArg(1) String arg0) {
		return Static374.method5620(arg0, 16);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
	public static int method3291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static372.method2813(arg1 - 1, arg0 + -1) + Static372.method2813(arg1 + 1, arg0 + -1) + Static372.method2813(arg1 + -1, arg0 + 1) + Static372.method2813(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static372.method2813(arg1 - 1, arg0) + Static372.method2813(arg1 + 1, arg0) + Static372.method2813(arg1, arg0 + -1) + Static372.method2813(arg1, arg0 + 1);
		@Pc(79) int local79 = Static372.method2813(arg1, arg0);
		return local79 / 4 + local74 / 8 + local45 / 16;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method3292(@OriginalArg(1) int arg0) {
		Static207.anInt3884 = arg0;
		Static291.aClass288_41.method6744();
	}
}
