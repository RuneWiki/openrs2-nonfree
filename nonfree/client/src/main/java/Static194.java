import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method3870(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class163 local9 = Static394.aClass163Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static394.aClass163Array1[local11] = Static394.aClass163Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class163(arg0, arg6, arg1, arg4, arg7, arg3, arg5, arg2);
		} else {
			local9.method4903(arg3, arg5, arg7, arg1, arg4, arg6, arg2, arg0);
		}
		Static234.anInt5310 = Static244.anInt5487;
		Static555.anInt9458++;
		Static394.aClass163Array1[0] = local9;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIBI)V")
	public static void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg2 - arg0;
		@Pc(18) int local18 = arg1 - arg3;
		if (local18 == 0) {
			if (local13 != 0) {
				Static121.method5579(arg0, arg4, arg2, arg3);
			}
		} else if (local13 == 0) {
			Static105.method2572(arg3, arg0, arg1, arg4);
		} else {
			if (local18 < 0) {
				local18 = -local18;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(70) boolean local70 = local13 > local18;
			@Pc(74) int local74;
			@Pc(76) int local76;
			if (local70) {
				local74 = arg3;
				local76 = arg1;
				arg3 = arg0;
				arg0 = local74;
				arg1 = arg2;
				arg2 = local76;
			}
			if (arg1 < arg3) {
				local74 = arg3;
				local76 = arg0;
				arg3 = arg1;
				arg0 = arg2;
				arg1 = local74;
				arg2 = local76;
			}
			local74 = arg0;
			local76 = arg1 - arg3;
			@Pc(115) int local115 = arg2 - arg0;
			@Pc(120) int local120 = -(local76 >> 1);
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(139) int local139 = arg0 >= arg2 ? -1 : 1;
			@Pc(143) int local143;
			if (local70) {
				for (local143 = arg3; local143 <= arg1; local143++) {
					local120 += local115;
					Static104.anIntArrayArray24[local143][local74] = arg4;
					if (local120 > 0) {
						local74 += local139;
						local120 -= local76;
					}
				}
			} else {
				for (local143 = arg3; local143 <= arg1; local143++) {
					Static104.anIntArrayArray24[local74][local143] = arg4;
					local120 += local115;
					if (local120 > 0) {
						local120 -= local76;
						local74 += local139;
					}
				}
			}
		}
	}
}
