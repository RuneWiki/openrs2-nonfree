import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "ld", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!av", name = "sd", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIBII[III)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static178.method2845(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static178.method2845(arg0)) {
			@Pc(45) int local45 = 0;
			@Pc(52) int local52 = arg0 > arg2 ? arg2 : arg0;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) int[] local62 = arg4;
			@Pc(67) int[] local67 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local45, arg5, arg2, arg0, 0, 32993, arg3, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(85) int local85 = 0;
				@Pc(87) int local87 = 0;
				@Pc(91) int local91 = arg2;
				for (@Pc(93) int local93 = 0; local93 < local60; local93++) {
					for (@Pc(97) int local97 = 0; local97 < local56; local97++) {
						@Pc(104) int local104 = local62[local87++];
						@Pc(109) int local109 = local62[local91++];
						@Pc(114) int local114 = local62[local87++];
						@Pc(120) int local120 = local104 >> 16 & 0xFF;
						@Pc(126) int local126 = local104 >> 24 & 0xFF;
						@Pc(131) int local131 = local62[local91++];
						@Pc(135) int local135 = local104 & 0xFF;
						@Pc(141) int local141 = local104 >> 8 & 0xFF;
						@Pc(149) int local149 = local141 + (local114 >> 8 & 0xFF);
						@Pc(157) int local157 = local126 + (local114 >> 24 & 0xFF);
						@Pc(165) int local165 = local120 + (local114 >> 16 & 0xFF);
						@Pc(171) int local171 = local135 + (local114 & 0xFF);
						@Pc(179) int local179 = local149 + (local109 >> 8 & 0xFF);
						@Pc(187) int local187 = local165 + (local109 >> 16 & 0xFF);
						@Pc(195) int local195 = local157 + (local109 >> 24 & 0xFF);
						@Pc(201) int local201 = local171 + (local109 & 0xFF);
						@Pc(209) int local209 = local195 + (local131 >> 24 & 0xFF);
						@Pc(217) int local217 = local187 + (local131 >> 16 & 0xFF);
						@Pc(225) int local225 = local179 + (local131 >> 8 & 0xFF);
						@Pc(231) int local231 = local201 + (local131 & 0xFF);
						local67[local85++] = (local225 & 0x3FC) << 6 | (local217 & 0x3FC) << 14 | (local209 & 0x3FC) << 22 | local231 >> 2 & 0xFF;
					}
					local87 += arg2;
					local91 += arg2;
				}
				@Pc(284) int[] local284 = local67;
				local67 = local62;
				arg2 = local56;
				arg0 = local60;
				local62 = local284;
				local60 >>= 0x1;
				local45++;
				local52 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIBIII)V")
	public static void method614(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static654.anInt10919 = arg0;
		Static394.anInt7291 = arg5;
		Static531.anInt9214 = arg4;
		Static585.anInt10024 = arg3;
		Static663.anInt11064 = arg2;
		if (arg1 && Static585.anInt10024 >= 100) {
			Static233.anInt4273 = Static654.anInt10919 * 512 + 256;
			Static74.anInt1618 = Static531.anInt9214 * 512 + 256;
			Static396.anInt7302 = Static152.method2434(Static233.anInt4273, Static586.anInt10060, Static74.anInt1618) - Static394.anInt7291;
		}
		Static115.anInt2304 = -1;
		Static667.anInt11097 = -1;
		Static378.anInt6935 = 2;
	}

	@OriginalMember(owner = "client!av", name = "n", descriptor = "(I)V")
	public static void method617() {
		if (Static397.anInt7311 < 0) {
			Static157.anInt3118 = -1;
			Static367.anInt6812 = -1;
			Static397.anInt7311 = 0;
		}
		if (Static498.anInt8801 < Static397.anInt7311) {
			Static157.anInt3118 = -1;
			Static367.anInt6812 = -1;
			Static397.anInt7311 = Static498.anInt8801;
		}
		if (Static517.anInt9046 < 0) {
			Static367.anInt6812 = -1;
			Static157.anInt3118 = -1;
			Static517.anInt9046 = 0;
		}
		if (Static517.anInt9046 > Static498.anInt8794) {
			Static517.anInt9046 = Static498.anInt8794;
			Static157.anInt3118 = -1;
			Static367.anInt6812 = -1;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!mi;BIIII)V")
	public static void method619(@OriginalArg(0) Class232 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1 || arg1 < 1 || arg3 > Static26.anInt462 - 2 || Static445.anInt6140 - 2 < arg1) {
			return;
		}
		if (Static486.aClass58ArrayArrayArray2 == null) {
			return;
		}
		@Pc(43) Interface19 local43 = Static143.aClass49_Sub1_1.method7524(arg2, arg4, arg1, arg3);
		if (local43 == null) {
			return;
		}
		if (local43 instanceof Class12_Sub2_Sub2_Sub3) {
			((Class12_Sub2_Sub2_Sub3) local43).method2907(arg0);
			return;
		}
		if (local43 instanceof Class12_Sub2_Sub4_Sub2) {
			((Class12_Sub2_Sub4_Sub2) local43).method6788(arg0);
			return;
		}
		if (local43 instanceof Class12_Sub2_Sub1_Sub2) {
			((Class12_Sub2_Sub1_Sub2) local43).method7614(arg0);
			return;
		}
		if (local43 instanceof Class12_Sub2_Sub3_Sub1) {
			((Class12_Sub2_Sub3_Sub1) local43).method1183(arg0);
			return;
		}
	}
}
