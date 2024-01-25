import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_54 = new Class316(55, 8);

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "Lclient!wn;")
	public static final Class349 aClass349_8 = new Class349();

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_66 = new Class98(64, -2);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
	public static void method3991() {
		Static429.aClass6_Sub12_Sub2_2.method6068();
		@Pc(13) int local13 = Static429.aClass6_Sub12_Sub2_2.method6061(8);
		@Pc(22) int local22;
		if (Static429.anInt7650 > local13) {
			for (local22 = local13; local22 < Static429.anInt7650; local22++) {
				Static464.anIntArray570[Static113.anInt1926++] = Static46.anIntArray36[local22];
			}
		}
		if (Static429.anInt7650 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static429.anInt7650 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(61) int local61 = Static46.anIntArray36[local22];
			@Pc(71) Class15_Sub2_Sub4_Sub1 local71 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) local61)).aClass15_Sub2_Sub4_Sub1_2;
			@Pc(76) int local76 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
			if (local76 == 0) {
				Static46.anIntArray36[Static429.anInt7650++] = local61;
				local71.anInt8966 = Static363.anInt6671;
			} else {
				@Pc(99) int local99 = Static429.aClass6_Sub12_Sub2_2.method6061(2);
				if (local99 == 0) {
					Static46.anIntArray36[Static429.anInt7650++] = local61;
					local71.anInt8966 = Static363.anInt6671;
					Static380.anIntArray494[Static314.anInt6059++] = local61;
				} else {
					@Pc(146) int local146;
					@Pc(156) int local156;
					if (local99 == 1) {
						Static46.anIntArray36[Static429.anInt7650++] = local61;
						local71.anInt8966 = Static363.anInt6671;
						local146 = Static429.aClass6_Sub12_Sub2_2.method6061(3);
						local71.method4291(1, local146);
						local156 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
						if (local156 == 1) {
							Static380.anIntArray494[Static314.anInt6059++] = local61;
						}
					} else if (local99 == 2) {
						Static46.anIntArray36[Static429.anInt7650++] = local61;
						local71.anInt8966 = Static363.anInt6671;
						if (Static429.aClass6_Sub12_Sub2_2.method6061(1) == 1) {
							local146 = Static429.aClass6_Sub12_Sub2_2.method6061(3);
							local71.method4291(2, local146);
							local156 = Static429.aClass6_Sub12_Sub2_2.method6061(3);
							local71.method4291(2, local156);
						} else {
							local146 = Static429.aClass6_Sub12_Sub2_2.method6061(3);
							local71.method4291(0, local146);
						}
						local146 = Static429.aClass6_Sub12_Sub2_2.method6061(1);
						if (local146 == 1) {
							Static380.anIntArray494[Static314.anInt6059++] = local61;
						}
					} else if (local99 == 3) {
						Static464.anIntArray570[Static113.anInt1926++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!va;I)V")
	public static void method3992(@OriginalArg(0) Class15_Sub2_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt8991 - Static363.anInt6671;
		@Pc(21) int local21 = arg0.lb * 512 + arg0.method7135() * 256;
		@Pc(32) int local32 = arg0.anInt8942 * 512 + arg0.method7135() * 256;
		arg0.anInt8913 += (local32 - arg0.anInt8913) / local9;
		arg0.anInt8995 = 0;
		arg0.anInt8911 += (local21 - arg0.anInt8911) / local9;
		if (arg0.anInt8986 == 0) {
			arg0.method7125(8192);
		}
		if (arg0.anInt8986 == 1) {
			arg0.method7125(12288);
		}
		if (arg0.anInt8986 == 2) {
			arg0.method7125(0);
		}
		if (arg0.anInt8986 == 3) {
			arg0.method7125(4096);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIII)V")
	public static void method3994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static502.method6952(Static205.anInt3906, arg1 + arg2, Static529.anInt9806);
		@Pc(35) int local35 = Static502.method6952(Static205.anInt3906, arg1 - arg2, Static529.anInt9806);
		Static264.method4006(local26, arg0, local35, Static155.anIntArrayArray32[arg3]);
		while (local7 < local9) {
			local18 += 2;
			local16 += local18;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if (local16 > 0) {
				local9--;
				local16 -= local9 << 1;
				local67 = arg3 - local9;
				local71 = local9 + arg3;
				if (Static133.anInt2531 <= local71 && local67 <= Static52.anInt1226) {
					local89 = Static502.method6952(Static205.anInt3906, local7 + arg1, Static529.anInt9806);
					local98 = Static502.method6952(Static205.anInt3906, arg1 - local7, Static529.anInt9806);
					if (local71 <= Static52.anInt1226) {
						Static264.method4006(local89, arg0, local98, Static155.anIntArrayArray32[local71]);
					}
					if (Static133.anInt2531 <= local67) {
						Static264.method4006(local89, arg0, local98, Static155.anIntArrayArray32[local67]);
					}
				}
			}
			local7++;
			local67 = arg3 - local7;
			local71 = local7 + arg3;
			if (local71 >= Static133.anInt2531 && local67 <= Static52.anInt1226) {
				local89 = Static502.method6952(Static205.anInt3906, arg1 + local9, Static529.anInt9806);
				local98 = Static502.method6952(Static205.anInt3906, arg1 - local9, Static529.anInt9806);
				if (local71 <= Static52.anInt1226) {
					Static264.method4006(local89, arg0, local98, Static155.anIntArrayArray32[local71]);
				}
				if (local67 >= Static133.anInt2531) {
					Static264.method4006(local89, arg0, local98, Static155.anIntArrayArray32[local67]);
				}
			}
		}
	}
}
