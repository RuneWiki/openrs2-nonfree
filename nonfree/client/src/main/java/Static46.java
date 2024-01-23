import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	public static int anInt1375;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Lclient!hc;")
	public static Class51 aClass51_18;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	public static int anInt1376;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!hc;)V")
	public static void method960(@OriginalArg(1) Class51 arg0) {
		Static42.aClass51_16 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
	public static void method962() {
		Static165.aClass79_24.method2489();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static36.anIntArray57[arg1] = arg0;
		@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) Static145.aClass140_10.method4014((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub10(4611686018427387905L);
			Static145.aClass140_10.method4011(local19, (long) arg1);
		} else if (local19.aLong68 != 4611686018427387905L) {
			local19.aLong68 = Static31.method591() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIZZ)V")
	public static void method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		if (!arg5 && arg0 == Static165.anInt3877 && arg4 == Static261.anInt5479 && (Static171.anInt3993 == arg3 || Static25.method507())) {
			return;
		}
		Static165.anInt3877 = arg0;
		Static171.anInt3993 = arg3;
		Static261.anInt5479 = arg4;
		if (Static25.method507()) {
			Static171.anInt3993 = 0;
		}
		if (arg6) {
			Static168.method2918(28);
		} else {
			Static168.method2918(25);
		}
		Static179.method3059(true, Static136.aString218);
		@Pc(49) int local49 = Static64.anInt1786;
		Static64.anInt1786 = (arg0 - 6) * 8;
		@Pc(57) int local57 = Static29.anInt907;
		Static29.anInt907 = arg4 * 8 - 48;
		Static89.aClass1_Sub2_Sub11_1 = Static76.method1503(Static165.anInt3877 * 8, Static261.anInt5479 * 8);
		Static176.aClass151_1 = null;
		@Pc(81) int local81 = Static29.anInt907 - local57;
		@Pc(86) int local86 = Static64.anInt1786 - local49;
		@Pc(94) int local94;
		@Pc(100) Class9_Sub1_Sub2 local100;
		@Pc(104) int local104;
		if (arg6) {
			Static16.anInt4955 = 0;
			for (local94 = 0; local94 < 32768; local94++) {
				local100 = Static36.aClass9_Sub1_Sub2Array2[local94];
				if (local100 != null) {
					local100.anInt479 -= local81 * 128;
					local100.anInt427 -= local86 * 128;
					if (local100.anInt427 >= 0 && local100.anInt427 <= 13184 && local100.anInt479 >= 0 && local100.anInt479 <= 13184) {
						for (local104 = 0; local104 < 10; local104++) {
							local100.anIntArray43[local104] -= local86;
							local100.anIntArray41[local104] -= local81;
						}
						Static142.anIntArray260[Static16.anInt4955++] = local94;
					} else {
						Static36.aClass9_Sub1_Sub2Array2[local94].method223(null);
						Static36.aClass9_Sub1_Sub2Array2[local94] = null;
					}
				}
			}
		} else {
			for (local94 = 0; local94 < 32768; local94++) {
				local100 = Static36.aClass9_Sub1_Sub2Array2[local94];
				if (local100 != null) {
					for (local104 = 0; local104 < 10; local104++) {
						local100.anIntArray43[local104] -= local86;
						local100.anIntArray41[local104] -= local81;
					}
					local100.anInt479 -= local81 * 128;
					local100.anInt427 -= local86 * 128;
				}
			}
		}
		for (local94 = 0; local94 < 2048; local94++) {
			@Pc(253) Class9_Sub1_Sub1 local253 = Static147.aClass9_Sub1_Sub1Array1[local94];
			if (local253 != null) {
				for (local104 = 0; local104 < 10; local104++) {
					local253.anIntArray43[local104] -= local86;
					local253.anIntArray41[local104] -= local81;
				}
				local253.anInt427 -= local86 * 128;
				local253.anInt479 -= local81 * 128;
			}
		}
		@Pc(305) byte local305 = 104;
		@Pc(307) byte local307 = 0;
		Static137.anInt3321 = arg3;
		@Pc(315) byte local315 = 1;
		if (local86 < 0) {
			local305 = -1;
			local315 = -1;
			local307 = 103;
		}
		@Pc(328) byte local328 = 104;
		Static83.aClass9_Sub1_Sub1_1.method187(arg1, arg2, false);
		@Pc(336) byte local336 = 1;
		@Pc(338) byte local338 = 0;
		if (local81 < 0) {
			local338 = 103;
			local328 = -1;
			local336 = -1;
		}
		for (@Pc(348) int local348 = local307; local348 != local305; local348 += local315) {
			for (@Pc(352) int local352 = local338; local352 != local328; local352 += local336) {
				@Pc(358) int local358 = local86 + local348;
				@Pc(363) int local363 = local352 + local81;
				for (@Pc(365) int local365 = 0; local365 < 4; local365++) {
					if (local358 >= 0 && local363 >= 0 && local358 < 104 && local363 < 104) {
						Static138.aClass3ArrayArrayArray1[local365][local348][local352] = Static138.aClass3ArrayArrayArray1[local365][local358][local363];
					} else {
						Static138.aClass3ArrayArrayArray1[local365][local348][local352] = null;
					}
				}
			}
		}
		for (@Pc(435) Class1_Sub21 local435 = (Class1_Sub21) Static174.aClass3_17.method30(); local435 != null; local435 = (Class1_Sub21) Static174.aClass3_17.method33()) {
			local435.anInt4014 -= local86;
			local435.anInt4015 -= local81;
			if (local435.anInt4014 < 0 || local435.anInt4015 < 0 || local435.anInt4014 >= 104 || local435.anInt4015 >= 104) {
				local435.method4186();
			}
		}
		if (Static239.anInt5157 != 0) {
			Static239.anInt5157 -= local86;
			Static262.anInt5501 -= local81;
		}
		Static139.anInt5524 = 0;
		if (arg6) {
			Static232.anInt5102 -= local81;
			Static110.anInt2935 -= local81 * 128;
			Static34.anInt969 -= local86;
			Static111.anInt2947 -= local81;
			Static174.anInt4003 -= local86 * 128;
			Static261.anInt5482 -= local86;
		} else {
			Static61.anInt1682 = 1;
		}
		Static160.anInt3795 = -1;
		Static213.aClass3_21.method29();
		Static106.aClass3_12.method29();
	}
}
