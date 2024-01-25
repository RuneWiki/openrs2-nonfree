import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static int anInt4701;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!ud;")
	public static final Class239 aClass239_5 = new Class239("WTQA", 2);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ[BIII)Z")
	public static boolean method3581(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub30 local12 = new Class4_Sub30(arg1);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method4827();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method4844();
					if (local34 == 0) {
						continue label56;
					}
					local26 += local34 - 1;
					@Pc(61) int local61 = local26 & 0x3F;
					@Pc(67) int local67 = local26 >> 6 & 0x3F;
					@Pc(73) int local73 = local12.method4864() >> 2;
					@Pc(77) int local77 = arg2 + local67;
					@Pc(81) int local81 = arg0 + local61;
					if (local77 > 0 && local81 > 0 && local77 < arg4 - 1 && local81 < arg3 - 1) {
						@Pc(110) Class71 local110 = Static2.aClass74_13.method1683(local14);
						if (local73 != 22 || Static126.aClass67_Sub1_1.aBoolean389 || local110.anInt2194 != 0 || local110.anInt2197 == 1 || local110.aBoolean164) {
							if (!local110.method1632()) {
								local7 = false;
								Static235.anInt4317++;
							}
							local28 = true;
						}
					}
				}
				local34 = local12.method4844();
				if (local34 == 0) {
					break;
				}
				local12.method4864();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public static void method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static335.method4533(arg0 + arg1, arg2, arg1 - arg0, Static162.anIntArrayArray58[arg3]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static162.anIntArrayArray58[arg3 + local9];
				@Pc(66) int[] local66 = Static162.anIntArrayArray58[arg3 - local9];
				@Pc(70) int local70 = arg1 + local7;
				@Pc(74) int local74 = arg1 - local7;
				Static335.method4533(local70, arg2, local74, local59);
				Static335.method4533(local70, arg2, local74, local66);
			}
			@Pc(91) int local91 = arg1 + local9;
			@Pc(96) int local96 = arg1 - local9;
			@Pc(103) int[] local103 = Static162.anIntArrayArray58[arg3 + local7];
			@Pc(109) int[] local109 = Static162.anIntArrayArray58[arg3 - local7];
			Static335.method4533(local91, arg2, local96, local103);
			Static335.method4533(local91, arg2, local96, local109);
		}
	}
}
