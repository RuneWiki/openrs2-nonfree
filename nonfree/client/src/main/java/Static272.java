import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!b;")
	public static Class20 aClass20_61;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	public static int anInt4752;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public static int anInt4750 = 100;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([Lclient!tr;I)V")
	public static void method4266(@OriginalArg(0) Class110[] arg0) {
		Static242.anInt4260 = arg0.length;
		Static371.aClass110Array14 = new Class110[Static242.anInt4260 + 10];
		Static72.anIntArray141 = new int[Static242.anInt4260 + 10];
		Static400.method1879(arg0, 0, Static371.aClass110Array14, 0, Static242.anInt4260);
		for (@Pc(26) int local26 = 0; local26 < Static242.anInt4260; local26++) {
			Static72.anIntArray141[local26] = Static371.aClass110Array14[local26].method5097();
		}
		for (@Pc(41) int local41 = Static242.anInt4260; local41 < Static371.aClass110Array14.length; local41++) {
			Static72.anIntArray141[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method4267() {
		@Pc(7) Class22[] local7 = Class38.aClass22Array3;
		synchronized (Class38.aClass22Array3) {
			for (@Pc(11) int local11 = 0; local11 < Class38.aClass22Array3.length; local11++) {
				Class38.aClass22Array3[local11] = new Class22();
				Static22.anIntArray37[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
	public static void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class80 local3 = new Class80();
		local3.anInt1983 = arg1 >> Static187.anInt3390;
		local3.anInt1987 = arg2 >> Static187.anInt3390;
		local3.anInt1981 = arg3 >> Static187.anInt3390;
		local3.anInt1989 = arg4 >> Static187.anInt3390;
		local3.anInt1990 = arg0;
		local3.anInt1979 = arg1;
		local3.anInt1996 = arg2;
		local3.anInt1986 = arg3;
		local3.anInt1985 = arg4;
		local3.anInt1991 = arg5;
		local3.anInt1982 = arg6;
		Static45.aClass80Array1[Static345.anInt5825++] = local3;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)Lclient!ee;")
	public static Class67 method4269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class67 local12 = new Class67();
		local12.anInt1637 = -1;
		local12.anInt1642 = arg0 + 5 + 1;
		local12.anInt1647 = arg1 + 5 + 1;
		local12.anInt1639 = -1;
		local12.anIntArrayArray19 = new int[local12.anInt1647][local12.anInt1642];
		local12.method1324();
		return local12;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZLclient!bj;)V")
	public static void method4270(@OriginalArg(0) int arg0, @OriginalArg(2) Class28_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt4339 > Static76.anInt1617) {
			Static301.method4677(arg1);
		} else if (Static76.anInt1617 <= arg1.anInt4368) {
			Static213.method3320(arg1);
		} else {
			Static319.method4841(arg1, false);
			local7 = Static385.anInt6435;
			local9 = Static366.anInt4859;
		}
		if (arg1.anInt5774 < 128 || arg1.anInt5766 < 128 || Static12.anInt161 * 128 - 128 <= arg1.anInt5774 || Static44.anInt787 * 128 - 128 <= arg1.anInt5766) {
			local9 = 0;
			local7 = -1;
			arg1.anInt4314 = -1;
			arg1.anInt4339 = 0;
			arg1.anInt4368 = 0;
			arg1.anInt4367 = -1;
			arg1.anInt5774 = arg1.anIntArray491[0] * 128 + arg1.method4009() * 64;
			arg1.anInt5766 = arg1.anIntArray490[0] * 128 + arg1.method4009() * 64;
			arg1.method4017();
		}
		if (Static226.aClass28_Sub1_Sub1_Sub2_2 == arg1 && (arg1.anInt5774 < 1536 || arg1.anInt5766 < 1536 || Static12.anInt161 * 128 - 1536 <= arg1.anInt5774 || Static44.anInt787 * 128 - 1536 <= arg1.anInt5766)) {
			arg1.anInt4314 = -1;
			local9 = 0;
			arg1.anInt4367 = -1;
			arg1.anInt4368 = 0;
			local7 = -1;
			arg1.anInt4339 = 0;
			arg1.anInt5774 = arg1.anIntArray491[0] * 128 + arg1.method4009() * 64;
			arg1.anInt5766 = arg1.anIntArray490[0] * 128 + arg1.method4009() * 64;
			arg1.method4017();
		}
		@Pc(209) int local209 = Static318.method1785(arg1);
		Static67.method1153(local9, local209, arg1, local7);
		Static312.method4797(arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IC)Z")
	public static boolean method4271(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
