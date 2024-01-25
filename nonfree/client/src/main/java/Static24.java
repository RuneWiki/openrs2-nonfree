import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Lclient!iq;")
	public static Class104 aClass104_33;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "I")
	private static int anInt745;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	private static int anInt746;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_13 = new Class140("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!be", name = "I", descriptor = "[I")
	public static final int[] anIntArray71 = new int[30];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method859(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static80.method1631(0, arg0.length - 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Lclient!mr;")
	public static Class1_Sub2_Sub3 method868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class51 local11 = Static196.aClass51ArrayArrayArray3[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class1_Sub2_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class11 local27 = local11.aClass11_2; local27 != null; local27 = local27.aClass11_1) {
			@Pc(31) Class1_Sub2 local31 = local27.aClass1_Sub2_1;
			if (local31 instanceof Class1_Sub2_Sub3) {
				@Pc(37) Class1_Sub2_Sub3 local37 = (Class1_Sub2_Sub3) local31;
				@Pc(47) int local47 = (local37.method5787() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt6893 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt6888 - local47 >> 7;
				@Pc(71) int local71 = local37.anInt6893 + local47 >> 7;
				@Pc(79) int local79 = local37.anInt6888 + local47 >> 7;
				if (arg0 >= local55 && local63 <= arg2 && arg0 <= local71 && local79 >= arg2) {
					@Pc(108) int local108 = (local71 + 1 - arg0) * ((local79 - arg2) + 1);
					if (local19 < local108) {
						local17 = local37;
						local19 = local108;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!be", name = "providesignlink", descriptor = "(Lclient!sc;)V")
	private static void method871(@OriginalArg(0) Class179 arg0) {
		Static62.aClass179_2 = arg0;
		Static227.aClass179_5 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method873(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static16.anInt274 = arg0;
	}
}
