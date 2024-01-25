import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	public static final int anInt468 = 1401;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BILclient!in;)I")
	public static int method391(@OriginalArg(1) int arg0, @OriginalArg(2) Class160 arg1) {
		if (!Static67.method1098(arg1).method572(arg0) && arg1.lb == null) {
			return -1;
		} else if (arg1.anIntArray210 == null || arg0 >= arg1.anIntArray210.length) {
			return -1;
		} else {
			return arg1.anIntArray210[arg0];
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method392(@OriginalArg(0) Class78 arg0) {
		if (Static473.anInt8115 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 && (Static568.aClass360ArrayArrayArray22 != null && Static289.method4342(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, arg0))) {
			Static473.anInt8115 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([IIIIIIII)V")
	public static void method393(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static166.method6223(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static166.method6223(arg4)) {
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg2 >= arg4 ? arg4 : arg2;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(66) int local66 = arg4 >> 1;
			@Pc(68) int[] local68 = arg0;
			@Pc(73) int[] local73 = new int[local62 * local66];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local39, arg1, arg2, arg4, 0, 32993, arg3, local68, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(92) int local92 = 0;
				@Pc(94) int local94 = 0;
				@Pc(98) int local98 = arg2;
				@Pc(100) int[] local100 = local73;
				for (@Pc(102) int local102 = 0; local102 < local66; local102++) {
					for (@Pc(106) int local106 = 0; local106 < local62; local106++) {
						@Pc(113) int local113 = local68[local94++];
						@Pc(118) int local118 = local68[local94++];
						@Pc(123) int local123 = local68[local98++];
						@Pc(127) int local127 = local113 & 0xFF;
						@Pc(133) int local133 = local113 >> 16 & 0xFF;
						@Pc(139) int local139 = local113 >> 8 & 0xFF;
						@Pc(145) int local145 = local113 >> 24 & 0xFF;
						@Pc(150) int local150 = local68[local98++];
						@Pc(156) int local156 = local127 + (local118 & 0xFF);
						@Pc(164) int local164 = local133 + (local118 >> 16 & 0xFF);
						@Pc(172) int local172 = local139 + (local118 >> 8 & 0xFF);
						@Pc(180) int local180 = local145 + (local118 >> 24 & 0xFF);
						@Pc(188) int local188 = local180 + (local123 >> 24 & 0xFF);
						@Pc(196) int local196 = local172 + (local123 >> 8 & 0xFF);
						@Pc(202) int local202 = local156 + (local123 & 0xFF);
						@Pc(210) int local210 = local164 + (local123 >> 16 & 0xFF);
						@Pc(218) int local218 = local196 + (local150 >> 8 & 0xFF);
						@Pc(226) int local226 = local210 + (local150 >> 16 & 0xFF);
						@Pc(232) int local232 = local202 + (local150 & 0xFF);
						@Pc(240) int local240 = local188 + (local150 >> 24 & 0xFF);
						local73[local92++] = local232 >> 2 & 0xFF | (local218 & 0x3FC) << 6 | (local226 & 0x3FC) << 14 | (local240 & 0x3FC) << 22;
					}
					local98 += arg2;
					local94 += arg2;
				}
				local73 = local68;
				local68 = local100;
				arg4 = local66;
				arg2 = local62;
				local62 >>= 0x1;
				local39++;
				local50 >>= 0x1;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
