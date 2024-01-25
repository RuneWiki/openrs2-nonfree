import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	public static int anInt9705;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!em;")
	public static final Class82 aClass82_16 = new Class82(1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public static void method8016(@OriginalArg(1) int arg0) {
		Static331.anInt6610 = 2;
		Static231.anInt5230 = arg0;
		if (Static226.aString47 == null) {
			Static142.method3164(35);
		} else {
			@Pc(25) Class3_Sub15 local25 = new Class3_Sub15(Static425.method7358(Static453.method6836(Static226.aString47)));
			@Pc(29) long local29 = local25.method8400();
			Static510.aLong222 = local25.method8400();
			Static192.method3818(Static123.method2859(local29), true, "");
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!gba;Lclient!qca;Lclient!ha;B)V")
	public static void method8018(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class33 arg2) {
		@Pc(10) Class5 local10 = arg1.method6797(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7588();
		if (local16 < local10.method7580()) {
			local16 = local10.method7580();
		}
		@Pc(28) int local28 = arg0.anInt4119;
		@Pc(31) int local31 = arg0.anInt4116;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg1.aString90 != null) {
			local33 = Static89.aClass315_7.method7573(null, null, Static346.aStringArray28, arg1.aString90);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static346.aStringArray28[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static483.aClass29_8.method731(local57);
				if (local78 > local35) {
					local35 = local78;
				}
			}
			local37 = local33 * Static483.aClass29_8.method732() + Static483.aClass29_8.method734() / 2;
		}
		local51 = local16 / 2 + arg0.anInt4119;
		if (local28 < local16 + Static361.anInt2220) {
			local51 = Static361.anInt2220 + local16 / 2 + local35 / 2 + 10 + 5;
			local28 = Static361.anInt2220;
		} else if (Static361.anInt2231 - local16 < local28) {
			local28 = Static361.anInt2231 - local16;
			local51 = Static361.anInt2231 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		@Pc(171) int local171 = arg0.anInt4116;
		if (local16 + Static361.anInt2222 > local31) {
			local171 = Static361.anInt2222 + local16 / 2 + 10;
			local31 = Static361.anInt2222;
		} else if (local31 > Static361.anInt2227 - local16) {
			local31 = Static361.anInt2227 - local16;
			local171 = Static361.anInt2227 - local37 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg0.anInt4119), (double) (local31 - arg0.anInt4116)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7579((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		if (arg1.aString90 != null) {
			local257 = local51 - local35 / 2 - 5;
			local259 = local171;
			local268 = local171 + local33 * Static483.aClass29_8.method732() + 3;
			local266 = local257 + local35 + 10;
			if (arg1.anInt8141 != 0) {
				arg2.method6209(local171, local266 - local257, -local171 + local268, local257, arg1.anInt8141);
			}
			if (arg1.anInt8142 != 0) {
				arg2.method6156(local266 - local257, local257, local268 - local171, arg1.anInt8142, local171);
			}
			for (@Pc(335) int local335 = 0; local335 < local33; local335++) {
				@Pc(341) String local341 = Static346.aStringArray28[local335];
				if (local335 < local33 - 1) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static483.aClass29_8.method730(arg2, local341, local51, local171, arg1.anInt8166);
				local171 += Static483.aClass29_8.method732();
			}
		}
		if (arg1.anInt8151 == -1 && arg1.aString90 == null) {
			return;
		}
		@Pc(388) Class3_Sub42 local388 = new Class3_Sub42(arg0);
		local16 >>= 0x1;
		local388.anInt9027 = local259;
		local388.anInt9029 = local268;
		local388.anInt9024 = local31 - local16;
		local388.anInt9033 = local28 - local16;
		local388.anInt9026 = local28 + local16;
		local388.anInt9030 = local31 + local16;
		local388.anInt9031 = local257;
		local388.anInt9025 = local266;
		Static529.aClass276_54.method6906(local388);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(FBFFFFFI)F")
	public static float method8019(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg5 - arg3;
		@Pc(16) float local16 = arg1 - arg2;
		@Pc(21) float local21 = arg4 - arg0;
		@Pc(23) float local23 = 0.0F;
		@Pc(25) float local25 = 0.0F;
		@Pc(27) float local27 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = arg3 + local7 * local11;
			@Pc(49) float local49 = local7 * local16 + arg2;
			@Pc(55) float local55 = local21 * local7 + arg0;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && local60 < Static394.anInt7540 && Static462.anInt8391 > local65) {
				@Pc(85) int local85 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128;
				if (local85 < 3 && (Static244.aByteArrayArrayArray10[1][local60][local65] & 0x2) != 0) {
					local85++;
				}
				@Pc(112) int local112 = Static445.aClass274Array1[local85].method8043((int) local55, (int) local43);
				if (local49 > (float) local112) {
					if (arg6 >= 2) {
						return local7 + method8019(local27, local49, local25, local23, local55, local43, arg6 + -1) * 0.1F - 0.1F;
					}
					return local7;
				}
			}
			local27 = local55;
			local7 += 0.1F;
			local25 = local49;
			local23 = local43;
		}
		return -1.0F;
	}
}
