import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public static int anInt5883;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	public static void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static159.anInt3286 = arg2;
		Static58.anInt969 = arg4;
		Static238.anInt4330 = arg3;
		Static465.anInt8650 = arg0;
		Static233.anInt4216 = arg1;
		if (Static233.anInt4216 >= 100) {
			@Pc(28) int local28 = Static465.anInt8650 * 512 + 256;
			@Pc(34) int local34 = Static58.anInt969 * 512 + 256;
			@Pc(42) int local42 = Static501.method5641(local28, Static13.anInt231, local34) - Static238.anInt4330;
			@Pc(46) int local46 = local28 - Static24.anInt387;
			@Pc(51) int local51 = local42 - Static209.anInt3913;
			@Pc(56) int local56 = local34 - Static110.anInt2624;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local46 * local46));
			Static232.anInt4203 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static261.anInt5009 = (int) (Math.atan2((double) local46, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			if (Static232.anInt4203 < 1024) {
				Static232.anInt4203 = 1024;
			}
			Static458.anInt8547 = 0;
			if (Static232.anInt4203 > 3072) {
				Static232.anInt4203 = 3072;
			}
		}
		Static214.anInt3969 = -1;
		Static326.anInt6302 = -1;
		Static166.anInt3419 = 2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	public static void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static371.method5959(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(34) int local34 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (Static290.anInt5903 <= arg0 && Static530.anInt9437 >= arg0) {
			@Pc(57) int[] local57 = Static46.anIntArrayArray4[arg0];
			local66 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - arg3);
			local74 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 + arg3);
			local82 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - local15);
			local91 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 + local15);
			Static306.method5239(local57, local82, arg5, local66);
			Static306.method5239(local57, local91, arg4, local82);
			Static306.method5239(local57, local74, arg5, local91);
		}
		@Pc(111) int local111 = -1;
		while (local10 < local21) {
			local111 += 2;
			local39 += 2;
			local24 += local39;
			local37 += local111;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static115.anIntArray123[local34] = local10;
			}
			local10++;
			@Pc(208) int local208;
			@Pc(217) int local217;
			@Pc(224) int[] local224;
			@Pc(159) int local159;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local159 = arg0 - local21;
				local66 = arg0 + local21;
				if (local66 >= Static290.anInt5903 && local159 <= Static530.anInt9437) {
					if (local15 > local21) {
						local74 = Static115.anIntArray123[local21];
						local82 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local10 + arg2);
						local91 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - local10);
						local208 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local74 + arg2);
						local217 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - local74);
						if (Static530.anInt9437 >= local66) {
							local224 = Static46.anIntArrayArray4[local66];
							Static306.method5239(local224, local217, arg5, local91);
							Static306.method5239(local224, local208, arg4, local217);
							Static306.method5239(local224, local82, arg5, local208);
						}
						if (Static290.anInt5903 <= local159) {
							local224 = Static46.anIntArrayArray4[local159];
							Static306.method5239(local224, local217, arg5, local91);
							Static306.method5239(local224, local208, arg4, local217);
							Static306.method5239(local224, local82, arg5, local208);
						}
					} else {
						local74 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 + local10);
						local82 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - local10);
						if (Static530.anInt9437 >= local66) {
							Static306.method5239(Static46.anIntArrayArray4[local66], local74, arg5, local82);
						}
						if (Static290.anInt5903 <= local159) {
							Static306.method5239(Static46.anIntArrayArray4[local159], local74, arg5, local82);
						}
					}
				}
			}
			local159 = arg0 - local10;
			local66 = arg0 + local10;
			if (local66 >= Static290.anInt5903 && local159 <= Static530.anInt9437) {
				local74 = local21 + arg2;
				local82 = arg2 - local21;
				if (Static486.anInt8866 <= local74 && local82 <= Static214.anInt3975) {
					local74 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local74);
					local82 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local82);
					if (local15 <= local10) {
						if (local66 <= Static530.anInt9437) {
							Static306.method5239(Static46.anIntArrayArray4[local66], local74, arg5, local82);
						}
						if (local159 >= Static290.anInt5903) {
							Static306.method5239(Static46.anIntArrayArray4[local159], local74, arg5, local82);
						}
					} else {
						local91 = local34 < local10 ? Static115.anIntArray123[local10] : local34;
						local208 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, local91 + arg2);
						local217 = Static322.method5335(Static486.anInt8866, Static214.anInt3975, arg2 - local91);
						if (local66 <= Static530.anInt9437) {
							local224 = Static46.anIntArrayArray4[local66];
							Static306.method5239(local224, local217, arg5, local82);
							Static306.method5239(local224, local208, arg4, local217);
							Static306.method5239(local224, local74, arg5, local208);
						}
						if (Static290.anInt5903 <= local159) {
							local224 = Static46.anIntArrayArray4[local159];
							Static306.method5239(local224, local217, arg5, local82);
							Static306.method5239(local224, local208, arg4, local217);
							Static306.method5239(local224, local74, arg5, local208);
						}
					}
				}
			}
		}
	}
}
