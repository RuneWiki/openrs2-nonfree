import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!uu", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_127 = new Class15("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_101 = new Class146(10, 7);

	@OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
	public static int anInt7060 = 0;

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
	public static int anInt7061 = 0;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z")
	public static boolean method5662(@OriginalArg(0) int arg0) {
		if (arg0 == 25 || arg0 == 13 || arg0 == 19 || arg0 == 8 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!hd;I)V")
	public static void method5663(@OriginalArg(0) Class110 arg0) {
		@Pc(9) Class110 local9 = Static9.method3940(arg0);
		@Pc(20) int local20;
		@Pc(18) int local18;
		if (local9 == null) {
			local18 = Static120.anInt2134;
			local20 = Static345.anInt5723;
		} else {
			local20 = local9.anInt2617;
			local18 = local9.anInt2590;
		}
		Static115.method1686(local18, arg0, false, local20);
		Static31.method432(local20, arg0, local18);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V")
	public static void method5664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(7) int local7 = arg0 << 3;
		Static109.aFloat75 = local3;
		Static439.aFloat99 = local7;
		if (Static97.anInt1791 == 2) {
			Static226.anInt3896 = 0;
			Static133.anInt2435 = local7;
			Static411.anInt6947 = local3;
		}
		Static167.method2319();
		Static333.aBoolean386 = true;
	}
}
