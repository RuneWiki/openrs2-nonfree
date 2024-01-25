import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "S")
	public static short aShort73 = 32767;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_180 = new Class221(89, 5);

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	public static int anInt5453 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method4614(@OriginalArg(1) int arg0) {
		Static84.method1691();
		@Pc(10) int local10 = Static91.method1825(arg0).anInt1323;
		if (local10 == 0) {
			return;
		}
		@Pc(17) int local17 = Static181.anIntArray308[arg0];
		if (local10 == 5) {
			Static163.anInt3758 = local17;
		}
		if (local10 == 6) {
			Static357.anInt6815 = local17;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dr;IIIII[[[BIIIIII)V")
	public static void method4615(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg1 == 0 || arg7 == 0) {
			return;
		}
		if (arg1 == 9) {
			arg10 = arg10 + 1 & 0x3;
			arg1 = 1;
		}
		if (arg1 == 10) {
			arg1 = 1;
			arg10 = arg10 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg1 = 8;
			arg10 = arg10 + 3 & 0x3;
		}
		arg0.method3726(arg11, arg5, arg4, arg3, arg8, arg2, arg6[arg1 - 1][arg10], arg7, arg9);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static41.method4708(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (Static197.anInt4298 <= arg0 && Static38.anInt553 >= arg0) {
			@Pc(51) int[] local51 = Static364.anIntArrayArray57[arg0];
			local60 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - arg2);
			local68 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2 + arg1);
			local77 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local15);
			local85 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local15 + arg1);
			Static115.method2278(local51, local77, arg5, local60);
			Static115.method2278(local51, local85, arg4, local77);
			Static115.method2278(local51, local68, arg5, local85);
		}
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static266.anIntArray431[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(245) int local245;
			@Pc(254) int local254;
			@Pc(265) int[] local265;
			@Pc(149) int local149;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local149 = arg0 - local21;
				local60 = arg0 + local21;
				if (local60 >= Static197.anInt4298 && Static38.anInt553 >= local149) {
					if (local15 <= local21) {
						local68 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 + local10);
						local77 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local10);
						if (Static38.anInt553 >= local60) {
							Static115.method2278(Static364.anIntArrayArray57[local60], local68, arg5, local77);
						}
						if (Static197.anInt4298 <= local149) {
							Static115.method2278(Static364.anIntArrayArray57[local149], local68, arg5, local77);
						}
					} else {
						local68 = Static266.anIntArray431[local21];
						local77 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 + local10);
						local85 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local10);
						local245 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local68 + arg1);
						local254 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local68);
						if (local60 <= Static38.anInt553) {
							local265 = Static364.anIntArrayArray57[local60];
							Static115.method2278(local265, local254, arg5, local85);
							Static115.method2278(local265, local245, arg4, local254);
							Static115.method2278(local265, local77, arg5, local245);
						}
						if (Static197.anInt4298 <= local149) {
							local265 = Static364.anIntArrayArray57[local149];
							Static115.method2278(local265, local254, arg5, local85);
							Static115.method2278(local265, local245, arg4, local254);
							Static115.method2278(local265, local77, arg5, local245);
						}
					}
				}
			}
			local149 = arg0 - local10;
			local60 = local10 + arg0;
			if (Static197.anInt4298 <= local60 && local149 <= Static38.anInt553) {
				local68 = local21 + arg1;
				local77 = arg1 - local21;
				if (Static108.anInt2266 <= local68 && local77 <= Static205.anInt4504) {
					local68 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local68);
					local77 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local77);
					if (local15 > local10) {
						local85 = local10 > local26 ? Static266.anIntArray431[local10] : local26;
						local245 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local85 + arg1);
						local254 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 - local85);
						if (Static38.anInt553 >= local60) {
							local265 = Static364.anIntArrayArray57[local60];
							Static115.method2278(local265, local254, arg5, local77);
							Static115.method2278(local265, local245, arg4, local254);
							Static115.method2278(local265, local68, arg5, local245);
						}
						if (Static197.anInt4298 <= local149) {
							local265 = Static364.anIntArrayArray57[local149];
							Static115.method2278(local265, local254, arg5, local77);
							Static115.method2278(local265, local245, arg4, local254);
							Static115.method2278(local265, local68, arg5, local245);
						}
					} else {
						if (Static38.anInt553 >= local60) {
							Static115.method2278(Static364.anIntArrayArray57[local60], local68, arg5, local77);
						}
						if (Static197.anInt4298 <= local149) {
							Static115.method2278(Static364.anIntArrayArray57[local149], local68, arg5, local77);
						}
					}
				}
			}
		}
	}
}
