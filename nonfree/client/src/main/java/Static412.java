import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
	public static void method6490() {
		for (@Pc(3) int local3 = 0; local3 < Static128.anInt3432; local3++) {
			Static476.aClass372Array3[local3] = null;
		}
		Static128.anInt3432 = 0;
		@Pc(35) int local35;
		@Pc(39) int local39;
		for (@Pc(31) int local31 = 0; local31 < Static192.anInt4507; local31++) {
			for (local35 = 0; local35 < Static489.anInt8688; local35++) {
				for (local39 = 0; local39 < Static596.anInt10195; local39++) {
					@Pc(49) Class56 local49 = Static405.aClass56ArrayArrayArray2[local31][local39][local35];
					if (local49 != null) {
						if (local49.aShort23 > 0) {
							local49.aShort23 = (short) (local49.aShort23 * -1);
						}
						if (local49.aShort20 > 0) {
							local49.aShort20 = (short) (local49.aShort20 * -1);
						}
					}
				}
			}
		}
		for (local35 = 0; local35 < Static192.anInt4507; local35++) {
			for (local39 = 0; local39 < Static489.anInt8688; local39++) {
				for (@Pc(104) int local104 = 0; local104 < Static596.anInt10195; local104++) {
					@Pc(114) Class56 local114 = Static405.aClass56ArrayArrayArray2[local35][local104][local39];
					if (local114 != null) {
						@Pc(137) boolean local137 = Static405.aClass56ArrayArrayArray2[0][local104][local39] != null && Static405.aClass56ArrayArrayArray2[0][local104][local39].aClass56_1 != null;
						@Pc(145) int local145;
						@Pc(147) int local147;
						@Pc(161) Class56 local161;
						@Pc(169) int local169;
						@Pc(310) int local310;
						@Pc(324) int local324;
						@Pc(331) int local331;
						@Pc(347) int local347;
						@Pc(354) int local354;
						@Pc(358) int local358;
						@Pc(362) int local362;
						@Pc(369) int local369;
						@Pc(408) int local408;
						@Pc(412) int local412;
						if (local114.aShort20 < 0) {
							local145 = local39;
							local147 = local39;
							local161 = Static405.aClass56ArrayArrayArray2[local35][local104][local39 - 1];
							local169 = Static86.aClass86Array2[local35].method8086(local39, local104);
							while (local145 > 0 && local161 != null && local161.aShort20 < 0 && local161.aShort20 == local114.aShort20 && local114.aShort21 == local161.aShort21 && Static86.aClass86Array2[local35].method8086(local145 - 1, local104) == local169 && (local145 - 1 <= 0 || Static86.aClass86Array2[local35].method8086(local145 - 2, local104) == local169)) {
								local145--;
								local161 = Static405.aClass56ArrayArrayArray2[local35][local104][local145 - 1];
							}
							for (local161 = Static405.aClass56ArrayArrayArray2[local35][local104][local39 + 1]; Static596.anInt10195 > local147 && local161 != null && local161.aShort20 < 0 && local114.aShort20 == local161.aShort20 && local114.aShort21 == local161.aShort21 && Static86.aClass86Array2[local35].method8086(local147 + 1, local104) == local169 && (Static596.anInt10195 <= local147 + 1 || local169 == Static86.aClass86Array2[local35].method8086(local147 + 2, local104)); local161 = Static405.aClass56ArrayArrayArray2[local35][local104][local147 + 1]) {
								local147++;
							}
							local310 = local35 + 1 - local35;
							local324 = Static86.aClass86Array2[local137 ? local35 + 1 : local35].method8086(local145, local104);
							local331 = local310 * local114.aShort20 + local324;
							local347 = Static86.aClass86Array2[local137 ? local35 + 1 : local35].method8086(local147 + 1, local104);
							local354 = local347 + local310 * local114.aShort20;
							local358 = local104 << Static172.anInt4156;
							local362 = local145 << Static172.anInt4156;
							local369 = (local147 << Static172.anInt4156) + Static572.anInt9827;
							Static476.aClass372Array3[Static128.anInt3432++] = new Class372(1, local35, local114.aShort21 + local358, local358 - -local114.aShort21, local358 + local114.aShort21, local114.aShort21 + local358, local324, local347, local354, local331, local362, local369, local369, local362);
							for (local408 = local35; local408 <= local35; local408++) {
								for (local412 = local145; local412 <= local147; local412++) {
									Static405.aClass56ArrayArrayArray2[local408][local104][local412].aShort20 = (short) (Static405.aClass56ArrayArrayArray2[local408][local104][local412].aShort20 * -1);
								}
							}
						}
						if (local114.aShort23 < 0) {
							local145 = local104;
							local147 = local104;
							local161 = Static405.aClass56ArrayArrayArray2[local35][local104 - 1][local39];
							local169 = Static86.aClass86Array2[local35].method8086(local39, local104);
							while (local145 > 0 && local161 != null && local161.aShort23 < 0 && local161.aShort23 == local114.aShort23 && local161.aShort22 == local114.aShort22 && Static86.aClass86Array2[local35].method8086(local39, local145 - 1) == local169 && (local145 - 1 <= 0 || local169 == Static86.aClass86Array2[local35].method8086(local39, local145 - 2))) {
								local145--;
								local161 = Static405.aClass56ArrayArrayArray2[local35][local145 - 1][local39];
							}
							for (local161 = Static405.aClass56ArrayArrayArray2[local35][local104 + 1][local39]; Static489.anInt8688 > local147 && local161 != null && local161.aShort23 < 0 && local114.aShort23 == local161.aShort23 && local161.aShort22 == local114.aShort22 && Static86.aClass86Array2[local35].method8086(local39, local147 + 1) == local169 && (local147 + 1 >= Static489.anInt8688 || local169 == Static86.aClass86Array2[local35].method8086(local39, local147 + 2)); local161 = Static405.aClass56ArrayArrayArray2[local35][local147 + 1][local39]) {
								local147++;
							}
							local310 = local35 + 1 - local35;
							local324 = Static86.aClass86Array2[local137 ? local35 + 1 : local35].method8086(local39, local145);
							local331 = local114.aShort23 * local310 + local324;
							local347 = Static86.aClass86Array2[local137 ? local35 + 1 : local35].method8086(local39, local147 + 1);
							local354 = local347 + local310 * local114.aShort23;
							local358 = local145 << Static172.anInt4156;
							local362 = Static572.anInt9827 + (local147 << Static172.anInt4156);
							local369 = local39 << Static172.anInt4156;
							Static476.aClass372Array3[Static128.anInt3432++] = new Class372(2, local35, local358, local362, local362, local358, local324, local347, local354, local331, local114.aShort22 + local369, local369 - -local114.aShort22, local114.aShort22 + local369, local369 + local114.aShort22);
							for (local408 = local35; local408 <= local35; local408++) {
								for (local412 = local145; local412 <= local147; local412++) {
									Static405.aClass56ArrayArrayArray2[local408][local412][local39].aShort23 = (short) (Static405.aClass56ArrayArrayArray2[local408][local412][local39].aShort23 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static76.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ega;)V")
	public static void method6491(@OriginalArg(1) Class15_Sub3 arg0) {
		arg0.aClass15_Sub1_Sub2_Sub2_1 = null;
		if (Static426.anInt7993 < 20) {
			Static51.aClass123_1.method3539(arg0);
			Static426.anInt7993++;
		}
	}
}
