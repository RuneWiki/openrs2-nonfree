import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public static int anInt6600;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!os;")
	public static final Class182 aClass182_225 = new Class182("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZ[Lclient!gh;I)V")
	public static void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class89[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class89 local19 = arg3[local13];
			if (local19 != null && local19.anInt2694 == arg1) {
				Static396.method5261(arg2, arg4, arg0, local19);
				Static429.method5681(arg4, local19, arg0);
				if (local19.anInt2689 - local19.anInt2703 < local19.anInt2725) {
					local19.anInt2725 = local19.anInt2689 - local19.anInt2703;
				}
				if (local19.anInt2725 < 0) {
					local19.anInt2725 = 0;
				}
				if (local19.anInt2708 - local19.anInt2682 < local19.anInt2699) {
					local19.anInt2699 = local19.anInt2708 - local19.anInt2682;
				}
				if (local19.anInt2699 < 0) {
					local19.anInt2699 = 0;
				}
				if (local19.anInt2727 == 0) {
					Static344.method4658(arg2, local19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static397.method5273(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg5;
		@Pc(26) int local26 = -arg5;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (arg1 >= Static319.anInt5496 && Static160.anInt3220 >= arg1) {
			@Pc(49) int[] local49 = Class10_Sub10_Sub1.lb[arg1];
			local58 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - arg5);
			local67 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 + arg5);
			local76 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - local14);
			local84 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local14 + arg0);
			Static212.method3267(local58, local76, arg2, local49);
			Static212.method3267(local76, local84, arg4, local49);
			Static212.method3267(local84, local67, arg2, local49);
		}
		while (local10 < local23) {
			local35 += 2;
			local33 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				Static267.anIntArray463[local28] = local10;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(192) int local192;
			@Pc(201) int local201;
			@Pc(212) int[] local212;
			@Pc(148) int local148;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local148 = arg1 - local23;
				local58 = arg1 + local23;
				if (Static319.anInt5496 <= local58 && local148 <= Static160.anInt3220) {
					if (local14 > local23) {
						local67 = Static267.anIntArray463[local23];
						local76 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 + local10);
						local84 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - local10);
						local192 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local67 + arg0);
						local201 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - local67);
						if (local58 <= Static160.anInt3220) {
							local212 = Class10_Sub10_Sub1.lb[local58];
							Static212.method3267(local84, local201, arg2, local212);
							Static212.method3267(local201, local192, arg4, local212);
							Static212.method3267(local192, local76, arg2, local212);
						}
						if (local148 >= Static319.anInt5496) {
							local212 = Class10_Sub10_Sub1.lb[local148];
							Static212.method3267(local84, local201, arg2, local212);
							Static212.method3267(local201, local192, arg4, local212);
							Static212.method3267(local192, local76, arg2, local212);
						}
					} else {
						local67 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local10 + arg0);
						local76 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - local10);
						if (Static160.anInt3220 >= local58) {
							Static212.method3267(local76, local67, arg2, Class10_Sub10_Sub1.lb[local58]);
						}
						if (Static319.anInt5496 <= local148) {
							Static212.method3267(local76, local67, arg2, Class10_Sub10_Sub1.lb[local148]);
						}
					}
				}
			}
			local148 = arg1 - local10;
			local58 = arg1 + local10;
			if (local58 >= Static319.anInt5496 && local148 <= Static160.anInt3220) {
				local67 = local23 + arg0;
				local76 = arg0 - local23;
				if (Static115.anInt2362 <= local67 && Static146.anInt3034 >= local76) {
					local67 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local67);
					local76 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, local76);
					if (local10 < local14) {
						local84 = local10 > local28 ? Static267.anIntArray463[local10] : local28;
						local192 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 + local84);
						local201 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg0 - local84);
						if (Static160.anInt3220 >= local58) {
							local212 = Class10_Sub10_Sub1.lb[local58];
							Static212.method3267(local76, local201, arg2, local212);
							Static212.method3267(local201, local192, arg4, local212);
							Static212.method3267(local192, local67, arg2, local212);
						}
						if (Static319.anInt5496 <= local148) {
							local212 = Class10_Sub10_Sub1.lb[local148];
							Static212.method3267(local76, local201, arg2, local212);
							Static212.method3267(local201, local192, arg4, local212);
							Static212.method3267(local192, local67, arg2, local212);
						}
					} else {
						if (Static160.anInt3220 >= local58) {
							Static212.method3267(local76, local67, arg2, Class10_Sub10_Sub1.lb[local58]);
						}
						if (local148 >= Static319.anInt5496) {
							Static212.method3267(local76, local67, arg2, Class10_Sub10_Sub1.lb[local148]);
						}
					}
				}
			}
		}
	}
}
