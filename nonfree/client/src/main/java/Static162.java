import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!o;")
	public static Class80 aClass80_7;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
	public static boolean aBoolean220 = false;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!os;")
	public static final Class182 aClass182_115 = new Class182("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_72 = new Class217(71, 2);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method2704() {
		for (@Pc(19) int local19 = 0; local19 < Static443.anInt7418; local19++) {
			@Pc(25) Class68 local25 = Static383.aClass68Array1[local19];
			@Pc(27) boolean local27 = false;
			@Pc(140) int local140;
			if (local25.aClass10_Sub7_Sub1_1 == null) {
				local25.anInt1950--;
				if (local25.anInt1950 < (local25.aByte14 == 2 ? -1500 : -10)) {
					local27 = true;
				} else {
					if (local25.aByte14 == 1 && local25.aClass251_1 == null) {
						local25.aClass251_1 = Static469.method5444(Static343.aClass187_105, local25.anInt1953, 0);
						if (local25.aClass251_1 == null) {
							continue;
						}
						local25.anInt1950 += local25.aClass251_1.method5443();
					} else if (local25.aByte14 == 2 && (local25.aClass10_Sub17_1 == null || local25.aClass10_Sub25_Sub1_1 == null)) {
						if (local25.aClass10_Sub17_1 == null) {
							local25.aClass10_Sub17_1 = Static112.method1959(Static203.aClass187_72, local25.anInt1953);
						}
						if (local25.aClass10_Sub17_1 == null) {
							continue;
						}
						if (local25.aClass10_Sub25_Sub1_1 == null) {
							local25.aClass10_Sub25_Sub1_1 = local25.aClass10_Sub17_1.method1960(new int[] { 22050 });
							if (local25.aClass10_Sub25_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local25.anInt1950 < 0) {
						if (local25.anInt1946 == 0) {
							local140 = Static361.aClass85_Sub1_1.anInt2481 * local25.anInt1947 >> 8;
						} else {
							@Pc(149) int local149 = local25.anInt1946 >> 24 & 0x3;
							if (local149 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) {
								@Pc(164) int local164 = (local25.anInt1946 & 0xFF) << 7;
								@Pc(171) int local171 = local25.anInt1946 >> 16 & 0xFF;
								@Pc(181) int local181 = (local171 << 7) + 64 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
								if (local181 < 0) {
									local181 = -local181;
								}
								@Pc(196) int local196 = local25.anInt1946 >> 8 & 0xFF;
								@Pc(206) int local206 = (local196 << 7) + 64 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
								if (local206 < 0) {
									local206 = -local206;
								}
								@Pc(220) int local220 = local181 + local206 - 128;
								if (local164 < local220) {
									local25.anInt1950 = -99999;
									continue;
								}
								if (local220 < 0) {
									local220 = 0;
								}
								local140 = local25.anInt1947 * (local164 - local220) * Static361.aClass85_Sub1_1.anInt2487 / local164 >> 8;
							} else {
								local140 = 0;
							}
						}
						if (local140 > 0) {
							@Pc(257) Class10_Sub25_Sub1 local257 = null;
							if (local25.aByte14 == 1) {
								local257 = local25.aClass251_1.method5445().method6029(Static267.aClass172_1);
							} else if (local25.aByte14 == 2) {
								local257 = local25.aClass10_Sub25_Sub1_1;
							}
							@Pc(285) Class10_Sub7_Sub1 local285 = local25.aClass10_Sub7_Sub1_1 = Static462.method604(local257, local140);
							local285.method623(local25.anInt1952 - 1);
							Static461.aClass10_Sub7_Sub2_5.method1844(local285);
						}
					}
				}
			} else if (!local25.aClass10_Sub7_Sub1_1.method6034()) {
				local27 = true;
			}
			if (local27) {
				Static443.anInt7418--;
				for (local140 = local19; local140 < Static443.anInt7418; local140++) {
					Static383.aClass68Array1[local140] = Static383.aClass68Array1[local140 + 1];
				}
				local19--;
			}
		}
		if (Static290.aBoolean344 && !Static133.method2301()) {
			if (Static361.aClass85_Sub1_1.anInt2496 != 0 && Static151.anInt3107 != -1) {
				Static163.method2712(Static151.anInt3107, Static361.aClass85_Sub1_1.anInt2496, Static43.aClass187_11);
			}
			Static290.aBoolean344 = false;
		} else if (Static361.aClass85_Sub1_1.anInt2496 != 0 && Static151.anInt3107 != -1 && !Static133.method2301()) {
			Static310.method4308(Static263.aClass27_96);
			Static337.aClass10_Sub8_Sub2_2.method2506(Static151.anInt3107);
			Static151.anInt3107 = -1;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII[III)V")
	public static void method2705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static131.method2284(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static131.method2284(arg5)) {
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg1 < arg5 ? arg1 : arg5;
			@Pc(60) int local60 = arg1 >> 1;
			@Pc(64) int local64 = arg5 >> 1;
			@Pc(66) int[] local66 = arg4;
			@Pc(71) int[] local71 = new int[local64 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local45, arg0, arg1, arg5, 0, 32993, arg2, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(95) int local95 = arg1;
				for (@Pc(97) int local97 = 0; local97 < local64; local97++) {
					for (@Pc(101) int local101 = 0; local101 < local60; local101++) {
						@Pc(108) int local108 = local66[local90++];
						@Pc(113) int local113 = local66[local95++];
						@Pc(118) int local118 = local66[local90++];
						@Pc(122) int local122 = local108 & 0xFF;
						@Pc(128) int local128 = local108 >> 8 & 0xFF;
						@Pc(134) int local134 = local108 >> 24 & 0xFF;
						@Pc(140) int local140 = local108 >> 16 & 0xFF;
						@Pc(145) int local145 = local66[local95++];
						@Pc(153) int local153 = local134 + (local118 >> 24 & 0xFF);
						@Pc(159) int local159 = local122 + (local118 & 0xFF);
						@Pc(167) int local167 = local140 + (local118 >> 16 & 0xFF);
						@Pc(175) int local175 = local128 + (local118 >> 8 & 0xFF);
						@Pc(183) int local183 = local167 + (local113 >> 16 & 0xFF);
						@Pc(191) int local191 = local153 + (local113 >> 24 & 0xFF);
						@Pc(199) int local199 = local175 + (local113 >> 8 & 0xFF);
						@Pc(205) int local205 = local159 + (local113 & 0xFF);
						@Pc(213) int local213 = local191 + (local145 >> 24 & 0xFF);
						@Pc(221) int local221 = local183 + (local145 >> 16 & 0xFF);
						@Pc(227) int local227 = local205 + (local145 & 0xFF);
						@Pc(235) int local235 = local199 + (local145 >> 8 & 0xFF);
						local71[local88++] = (local213 & 0x3FC) << 22 | (local221 & 0x3FC) << 14 | (local235 & 0x3FC) << 6 | local227 >> 2 & 0xFF;
					}
					local90 += arg1;
					local95 += arg1;
				}
				@Pc(288) int[] local288 = local71;
				local71 = local66;
				local66 = local288;
				arg1 = local60;
				arg5 = local64;
				local56 >>= 0x1;
				local64 >>= 0x1;
				local45++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2706(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static319.anInt5497 > 0) {
			local21 = Static97.aByteArrayArray9[--Static319.anInt5497];
			Static97.aByteArrayArray9[Static319.anInt5497] = null;
			return local21;
		} else if (arg0 == 5000 && Static381.anInt4535 > 0) {
			local21 = Static11.aByteArrayArray3[--Static381.anInt4535];
			Static11.aByteArrayArray3[Static381.anInt4535] = null;
			return local21;
		} else if (arg0 == 30000 && Static39.anInt634 > 0) {
			local21 = Static452.aByteArrayArray35[--Static39.anInt634];
			Static452.aByteArrayArray35[Static39.anInt634] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
