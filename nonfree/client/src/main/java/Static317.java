import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!uu;")
	public static Class250 aClass250_79;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!of;")
	public static final Class174 aClass174_153 = new Class174("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public static int anInt5362 = 0;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_130 = new Class163(31, 8);

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Lclient!co;")
	public static final Class35 aClass35_6 = new Class35("WTI", 5);

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	public static int anInt5364 = -1;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Lclient!of;")
	public static final Class174 aClass174_154 = new Class174("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static431.method5861(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(44) int local44 = -1;
		@Pc(48) int[] local48 = Static296.anIntArrayArray42[arg5];
		@Pc(53) int local53 = arg3 - local15;
		Static201.method3084(local48, arg3 - arg1, local53, arg0);
		@Pc(66) int local66 = local15 + arg3;
		Static201.method3084(local48, local53, local66, arg4);
		Static201.method3084(local48, local66, arg3 + arg1, arg0);
		while (local10 < local24) {
			local44 += 2;
			local42 += 2;
			local27 += local42;
			local40 += local44;
			if (local40 >= 0 && local29 >= 1) {
				Static123.anIntArray102[local29] = local10;
				local29--;
				local40 -= local29 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(132) int[] local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(181) int local181;
			@Pc(186) int local186;
			@Pc(191) int local191;
			if (local27 >= 0) {
				local24--;
				if (local15 <= local24) {
					local125 = Static296.anIntArrayArray42[local24 + arg5];
					local132 = Static296.anIntArrayArray42[arg5 - local24];
					local136 = local10 + arg3;
					local141 = arg3 - local10;
					Static201.method3084(local125, local141, local136, arg0);
					Static201.method3084(local132, local141, local136, arg0);
				} else {
					local125 = Static296.anIntArrayArray42[local24 + arg5];
					local132 = Static296.anIntArrayArray42[arg5 - local24];
					local136 = Static123.anIntArray102[local24];
					local141 = local10 + arg3;
					local181 = arg3 - local10;
					local186 = arg3 + local136;
					local191 = arg3 - local136;
					Static201.method3084(local125, local181, local191, arg0);
					Static201.method3084(local125, local191, local186, arg4);
					Static201.method3084(local125, local186, local141, arg0);
					Static201.method3084(local132, local181, local191, arg0);
					Static201.method3084(local132, local191, local186, arg4);
					Static201.method3084(local132, local186, local141, arg0);
				}
				local27 -= local24 << 1;
			}
			local125 = Static296.anIntArrayArray42[local10 + arg5];
			local132 = Static296.anIntArrayArray42[arg5 - local10];
			local136 = arg3 + local24;
			local141 = arg3 - local24;
			if (local15 <= local10) {
				Static201.method3084(local125, local141, local136, arg0);
				Static201.method3084(local132, local141, local136, arg0);
			} else {
				local181 = local29 >= local10 ? local29 : Static123.anIntArray102[local10];
				local186 = local181 + arg3;
				local191 = arg3 - local181;
				Static201.method3084(local125, local141, local191, arg0);
				Static201.method3084(local125, local191, local186, arg4);
				Static201.method3084(local125, local186, local136, arg0);
				Static201.method3084(local132, local141, local191, arg0);
				Static201.method3084(local132, local191, local186, arg4);
				Static201.method3084(local132, local186, local136, arg0);
			}
		}
	}
}
