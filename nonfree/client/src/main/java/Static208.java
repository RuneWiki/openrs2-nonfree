import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	public static int anInt6830;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_123 = new Class15("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "[S")
	public static short[] aShortArray113 = new short[256];

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_94 = new Class146(54, 3);

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "Lclient!up;")
	public static final Class250 aClass250_21 = new Class250(4, 3);

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "[S")
	public static final short[] aShortArray114 = new short[] { 23, 21, 11, 2, 49, 10, 20, 50 };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method5498(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub2_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class41 local8 = Static228.aClass41Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static18.anInt297; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static81.anInt1606; local15++) {
						local1 = local8.k(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static145.anInt2581;
							@Pc(32) int local32 = local12 << Static145.anInt2581;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class41 local41 = Static228.aClass41Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.l(local15, local12) - local41.l(local15, local12);
									@Pc(67) int local67 = local8.l(local15 + 1, local12) - local41.l(local15 + 1, local12);
									@Pc(85) int local85 = local8.l(local15 + 1, local12 + 1) - local41.l(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.l(local15, local12 + 1) - local41.l(local15, local12 + 1);
									local41.b(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIZIII)V")
	public static void method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg0;
		@Pc(21) int local21 = arg2 - arg0;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg2 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = (local61 - 3) * local53;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg2 - 1) * local100;
		@Pc(147) int local147 = local112;
		@Pc(153) int local153 = local108 * (local21 - 1);
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(204) int local204;
		if (arg6 >= Static254.anInt4211 && Static275.anInt4594 >= arg6) {
			@Pc(171) int[] local171 = Static267.anIntArrayArray50[arg6];
			local179 = Static39.method544(arg4 - arg1, Static62.anInt1114, Static207.anInt3632);
			local187 = Static39.method544(arg1 + arg4, Static62.anInt1114, Static207.anInt3632);
			local196 = Static39.method544(arg4 - local16, Static62.anInt1114, Static207.anInt3632);
			local204 = Static39.method544(arg4 + local16, Static62.anInt1114, Static207.anInt3632);
			Static249.method6044(local171, arg5, local196, local179);
			Static249.method6044(local171, arg3, local204, local196);
			Static249.method6044(local171, arg5, local187, local204);
		}
		while (local9 > 0) {
			@Pc(231) boolean local231 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local116;
					local78 += local134;
					local134 += local104;
					local7++;
					local116 += local104;
				}
			}
			if (local231) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local126;
						local96 += local147;
						local126 += local112;
						local11++;
						local147 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local147;
					local87 += local126;
					local126 += local112;
					local11++;
					local147 += local112;
				}
				local96 += -local132;
				local87 += -local153;
				local132 -= local108;
				local153 -= local108;
			}
			if (local78 < 0) {
				local70 += local116;
				local78 += local134;
				local134 += local104;
				local116 += local104;
				local7++;
			}
			local78 += -local122;
			local70 += -local140;
			local122 -= local100;
			local140 -= local100;
			local9--;
			local179 = arg6 - local9;
			local187 = local9 + arg6;
			if (Static254.anInt4211 <= local187 && local179 <= Static275.anInt4594) {
				local196 = Static39.method544(arg4 + local7, Static62.anInt1114, Static207.anInt3632);
				local204 = Static39.method544(arg4 - local7, Static62.anInt1114, Static207.anInt3632);
				if (local231) {
					@Pc(441) int local441 = Static39.method544(local11 + arg4, Static62.anInt1114, Static207.anInt3632);
					@Pc(450) int local450 = Static39.method544(arg4 - local11, Static62.anInt1114, Static207.anInt3632);
					@Pc(457) int[] local457;
					if (local179 >= Static254.anInt4211) {
						local457 = Static267.anIntArrayArray50[local179];
						Static249.method6044(local457, arg5, local450, local204);
						Static249.method6044(local457, arg3, local441, local450);
						Static249.method6044(local457, arg5, local196, local441);
					}
					if (local187 <= Static275.anInt4594) {
						local457 = Static267.anIntArrayArray50[local187];
						Static249.method6044(local457, arg5, local450, local204);
						Static249.method6044(local457, arg3, local441, local450);
						Static249.method6044(local457, arg5, local196, local441);
					}
				} else {
					if (Static254.anInt4211 <= local179) {
						Static249.method6044(Static267.anIntArrayArray50[local179], arg5, local196, local204);
					}
					if (local187 <= Static275.anInt4594) {
						Static249.method6044(Static267.anIntArrayArray50[local187], arg5, local196, local204);
					}
				}
			}
		}
	}
}
