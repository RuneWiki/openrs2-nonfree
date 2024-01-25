import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_152 = new Class126(45, -1);

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_4 = new Class7();

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "[I")
	public static int[] anIntArray475 = new int[2];

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(25) int local25 = arg6 - arg5;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = arg6 * arg6;
		@Pc(37) int local37 = local20 * local20;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = local45 + local29 * (1 - local61);
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(91) int local91 = local53 + (1 - local65) * local37;
		@Pc(100) int local100 = local41 - local57 * (local65 - 1);
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = local49 * (local61 - 3);
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg6 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (arg3 >= Static255.anInt4818 && Static658.anInt10079 >= arg3) {
			@Pc(160) int[] local160 = Static299.anIntArrayArray58[arg3];
			local169 = Static400.method5735(Static303.anInt9951, arg0 - arg1, Static408.anInt6951);
			local177 = Static400.method5735(Static303.anInt9951, arg0 + arg1, Static408.anInt6951);
			local186 = Static400.method5735(Static303.anInt9951, arg0 - local20, Static408.anInt6951);
			local194 = Static400.method5735(Static303.anInt9951, arg0 + local20, Static408.anInt6951);
			Static526.method7369(local160, local186, local169, arg2);
			Static526.method7369(local160, local194, local186, arg4);
			Static526.method7369(local160, local177, local194, arg2);
		}
		@Pc(218) int local218 = (local25 - 1) * local112;
		while (local9 > 0) {
			@Pc(227) boolean local227 = local25 >= local9;
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local120;
					local82 += local138;
					local7++;
					local138 += local108;
					local120 += local108;
				}
			}
			if (local227) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local130;
						local100 += local146;
						local130 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local91 += local130;
					local146 += local116;
					local11++;
					local130 += local116;
				}
				local100 += -local136;
				local91 += -local218;
				local218 -= local112;
				local136 -= local112;
			}
			if (local82 < 0) {
				local82 += local138;
				local74 += local120;
				local7++;
				local138 += local108;
				local120 += local108;
			}
			local74 += -local144;
			local82 += -local126;
			local144 -= local104;
			local126 -= local104;
			local9--;
			local169 = arg3 - local9;
			local177 = arg3 + local9;
			if (local177 >= Static255.anInt4818 && local169 <= Static658.anInt10079) {
				local186 = Static400.method5735(Static303.anInt9951, arg0 + local7, Static408.anInt6951);
				local194 = Static400.method5735(Static303.anInt9951, arg0 - local7, Static408.anInt6951);
				if (local227) {
					@Pc(407) int local407 = Static400.method5735(Static303.anInt9951, arg0 + local11, Static408.anInt6951);
					@Pc(415) int local415 = Static400.method5735(Static303.anInt9951, arg0 - local11, Static408.anInt6951);
					@Pc(426) int[] local426;
					if (Static255.anInt4818 <= local169) {
						local426 = Static299.anIntArrayArray58[local169];
						Static526.method7369(local426, local415, local194, arg2);
						Static526.method7369(local426, local407, local415, arg4);
						Static526.method7369(local426, local186, local407, arg2);
					}
					if (Static658.anInt10079 >= local177) {
						local426 = Static299.anIntArrayArray58[local177];
						Static526.method7369(local426, local415, local194, arg2);
						Static526.method7369(local426, local407, local415, arg4);
						Static526.method7369(local426, local186, local407, arg2);
					}
				} else {
					if (local169 >= Static255.anInt4818) {
						Static526.method7369(Static299.anIntArrayArray58[local169], local186, local194, arg2);
					}
					if (Static658.anInt10079 >= local177) {
						Static526.method7369(Static299.anIntArrayArray58[local177], local186, local194, arg2);
					}
				}
			}
		}
	}
}
