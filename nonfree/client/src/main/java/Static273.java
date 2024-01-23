import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public static int anInt5556 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public static void method4494() {
		Static249.aClass3_Sub26_Sub1_3.method3960();
		@Pc(9) int local9 = Static249.aClass3_Sub26_Sub1_3.method3962(8);
		@Pc(18) int local18;
		if (Static118.anInt2202 > local9) {
			for (local18 = local9; local18 < Static118.anInt2202; local18++) {
				Static103.anIntArray192[Static192.anInt3770++] = Static253.anIntArray547[local18];
			}
		}
		if (Static118.anInt2202 < local9) {
			throw new RuntimeException("gnpov1");
		}
		Static118.anInt2202 = 0;
		for (local18 = 0; local18 < local9; local18++) {
			@Pc(70) int local70 = Static253.anIntArray547[local18];
			@Pc(74) Class10_Sub5_Sub2 local74 = Static110.aClass10_Sub5_Sub2Array1[local70];
			@Pc(79) int local79 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			if (local79 == 0) {
				Static253.anIntArray547[Static118.anInt2202++] = local70;
				local74.anInt5095 = Static124.anInt2371;
			} else {
				@Pc(99) int local99 = Static249.aClass3_Sub26_Sub1_3.method3962(2);
				if (local99 == 0) {
					Static253.anIntArray547[Static118.anInt2202++] = local70;
					local74.anInt5095 = Static124.anInt2371;
					Static178.anIntArray405[Static11.anInt5178++] = local70;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local99 == 1) {
						Static253.anIntArray547[Static118.anInt2202++] = local70;
						local74.anInt5095 = Static124.anInt2371;
						local148 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
						local74.method4196(local148, 1);
						local158 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
						if (local158 == 1) {
							Static178.anIntArray405[Static11.anInt5178++] = local70;
						}
					} else if (local99 == 2) {
						Static253.anIntArray547[Static118.anInt2202++] = local70;
						local74.anInt5095 = Static124.anInt2371;
						if (Static249.aClass3_Sub26_Sub1_3.method3962(1) == 1) {
							local148 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local74.method4196(local148, 2);
							local158 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local74.method4196(local158, 2);
						} else {
							local148 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local74.method4196(local148, 0);
						}
						local148 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
						if (local148 == 1) {
							Static178.anIntArray405[Static11.anInt5178++] = local70;
						}
					} else if (local99 == 3) {
						Static103.anIntArray192[Static192.anInt3770++] = local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg6 - 334;
		@Pc(19) int local19 = 2048 - arg2 & 0x7FF;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(44) int local44 = Static308.aShort51 + (Static109.aShort34 - Static308.aShort51) * local3 / 100;
		@Pc(51) int local51 = 2048 - arg5 & 0x7FF;
		@Pc(53) int local53 = 0;
		@Pc(59) int local59 = local44 * arg1 >> 8;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local59;
		@Pc(77) int local77;
		@Pc(73) int local73;
		if (local19 != 0) {
			local73 = Class11.anIntArray27[local19];
			local77 = Class11.anIntArray26[local19];
			local61 = -local59 * local77 >> 16;
			local63 = local59 * local73 >> 16;
		}
		if (local51 != 0) {
			local77 = Class11.anIntArray26[local51];
			local53 = local63 * local77 >> 16;
			local73 = Class11.anIntArray27[local51];
			local63 = local63 * local73 >> 16;
		}
		Static230.anInt4492 = arg0 - local53;
		Static173.anInt3251 = arg3 - local63;
		Static113.anInt2103 = arg5;
		Static79.anInt1912 = arg2;
		Static224.anInt6075 = arg4 - local61;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V")
	public static void method4496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static79.anInt1913 = arg0 - Static228.anInt1431;
		Static9.anInt187 = Static228.anInt1435 + Static228.anInt1432 - arg1 - 1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!rg;B)Z")
	public static boolean method4497(@OriginalArg(0) Class151 arg0) {
		if (arg0.anInt4797 == 205) {
			Static137.anInt2643 = 250;
			return true;
		} else {
			return false;
		}
	}
}
