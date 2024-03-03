import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIII)I", line = 5)
	public static int method3212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg1 : arg2;
		@Pc(40) int local40 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg1 : arg0) : arg2;
		return ((local7 & 0x2) == 0 ? local40 : -local40) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!wm;)V", line = 40)
	public static void method3213(@OriginalArg(0) Class19 arg0) {
		for (@Pc(1) int local1 = Class2_Sub3_Sub9.anInt1622; local1 < Static86.anInt1912; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static68.anInt1682; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static196.anInt3769; local7++) {
					@Pc(16) Class67 local16 = Static307.aClass67ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class11_Sub1 local21 = local16.aClass11_Sub1_3;
						@Pc(24) Class11_Sub1 local24 = local16.aClass11_Sub1_2;
						if (local21 != null && local21.method6077()) {
							Static238.method4404(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6077()) {
								Static238.method4404(arg0, local24, local1, local4, local7, 1, 1);
								local24.method6076(0, 0, 0, arg0, false, local21);
								local24.method6070();
							}
							local21.method6070();
						}
						for (@Pc(70) Class22 local70 = local16.aClass22_2; local70 != null; local70 = local70.aClass22_1) {
							@Pc(74) Class11_Sub5 local74 = local70.aClass11_Sub5_1;
							if (local74 != null && local74.method6077()) {
								Static238.method4404(arg0, local74, local1, local4, local7, local74.aShort104 + 1 - local74.aShort103, local74.aShort102 - local74.aShort101 + 1);
								local74.method6070();
							}
						}
						@Pc(111) Class11_Sub2 local111 = local16.aClass11_Sub2_2;
						if (local111 != null && local111.method6077()) {
							Static31.method990(arg0, local111, local1, local4, local7);
							local111.method6070();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZIII)V", line = 118)
	public static void method3214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class84[] local7 = Class41.aClass84Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class84 local17 = local7[local9];
			if (local17 != null && local17.anInt2352 == 2) {
				Static114.method2396(local17.anInt2356, arg2 >> 1, local17.anInt2353 + (local17.anInt2361 - Static139.anInt2716 << 7), local17.anInt2359 * 2, arg0 >> 1, (local17.anInt2349 - Static154.anInt3136 << 7) + local17.anInt2347);
				if (Class153.anIntArray231[0] > -1 && Class83.anInt2345 % 20 < 10) {
					Static213.aClass13Array16[local17.anInt2360].method6386(arg1 + Class153.anIntArray231[0] - 12, Class153.anIntArray231[1] + arg3 - 28);
				}
			}
		}
	}
}
