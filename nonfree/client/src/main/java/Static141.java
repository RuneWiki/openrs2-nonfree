import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!c;")
	public static Class5 aClass5_29;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Z")
	public static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	public static int anInt6334 = 0;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)[Lclient!tr;")
	public static Class200[] method5354() {
		if (Static115.aClass200Array2 == null) {
			@Pc(7) Class200[] local7 = Static177.method3701(Static15.aClass143_1);
			@Pc(11) Class200[] local11 = new Class200[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(66) int local66;
			@Pc(72) Class200 local72;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class200 local21 = local7[local15];
				if ((local21.anInt6074 <= 0 || local21.anInt6074 >= 24) && local21.anInt6071 >= 800 && local21.anInt6072 >= 600 && (Static257.anInt5344 >= 96 || Static306.anInt6046 != 0 || local21.anInt6071 <= 1024 && local21.anInt6072 <= 768)) {
					for (local66 = 0; local66 < local13; local66++) {
						local72 = local11[local66];
						if (local21.anInt6071 == local72.anInt6071 && local72.anInt6072 == local21.anInt6072) {
							if (local72.anInt6074 < local21.anInt6074) {
								local11[local66] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static115.aClass200Array2 = new Class200[local13];
			Static361.method1334(local11, 0, Static115.aClass200Array2, 0, local13);
			@Pc(132) int[] local132 = new int[Static115.aClass200Array2.length];
			for (local66 = 0; local66 < Static115.aClass200Array2.length; local66++) {
				local72 = Static115.aClass200Array2[local66];
				local132[local66] = local72.anInt6072 * local72.anInt6071;
			}
			Static257.method4647(local132, Static115.aClass200Array2);
		}
		return Static115.aClass200Array2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIB)V")
	public static void method5358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(31) int local31 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg0 + arg3);
		@Pc(40) int local40 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 - arg0);
		Static39.method919(arg2, Static344.anIntArrayArray65[arg1], local31, local40);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(71) int local71;
			@Pc(75) int local75;
			@Pc(93) int local93;
			@Pc(102) int local102;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local71 = arg1 - local9;
				local75 = arg1 + local9;
				if (local75 >= Static197.anInt4211 && Static326.anInt2469 >= local71) {
					local93 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 + local7);
					local102 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 - local7);
					if (local75 <= Static326.anInt2469) {
						Static39.method919(arg2, Static344.anIntArrayArray65[local75], local93, local102);
					}
					if (local71 >= Static197.anInt4211) {
						Static39.method919(arg2, Static344.anIntArrayArray65[local71], local93, local102);
					}
				}
			}
			local7++;
			local71 = arg1 - local7;
			local75 = local7 + arg1;
			if (local75 >= Static197.anInt4211 && Static326.anInt2469 >= local71) {
				local93 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, local9 + arg3);
				local102 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg3 - local9);
				if (local75 <= Static326.anInt2469) {
					Static39.method919(arg2, Static344.anIntArrayArray65[local75], local93, local102);
				}
				if (Static197.anInt4211 <= local71) {
					Static39.method919(arg2, Static344.anIntArrayArray65[local71], local93, local102);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public static void method5359() {
		Static36.aClass87_9.method2485();
	}
}
