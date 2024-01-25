import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public static int anInt6381;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!vg;")
	public static Class250 aClass250_12 = null;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
	public static void method4910() {
		Static293.method3822();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!mv;I)V")
	public static void method4911(@OriginalArg(0) Class1_Sub11_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3352();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static31.anInt624; local12++) {
			local18 = Static363.anIntArray373[local12];
			if ((Static251.aByteArray43[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static251.aByteArray43[local18] = (byte) (Static251.aByteArray43[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method3347(1);
					if (local46 == 0) {
						local7 = Static17.method271(arg0);
						Static251.aByteArray43[local18] = (byte) (Static251.aByteArray43[local18] | 0x2);
					} else {
						Static404.method5025(local18, arg0);
					}
				}
			}
		}
		arg0.method3348();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3352();
		@Pc(129) int local129;
		for (local18 = 0; local18 < Static31.anInt624; local18++) {
			local46 = Static363.anIntArray373[local18];
			if ((Static251.aByteArray43[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static251.aByteArray43[local46] = (byte) (Static251.aByteArray43[local46] | 0x2);
				} else {
					local129 = arg0.method3347(1);
					if (local129 == 0) {
						local7 = Static17.method271(arg0);
						Static251.aByteArray43[local46] = (byte) (Static251.aByteArray43[local46] | 0x2);
					} else {
						Static404.method5025(local46, arg0);
					}
				}
			}
		}
		arg0.method3348();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3352();
		@Pc(210) int local210;
		for (local46 = 0; local46 < Static272.anInt4302; local46++) {
			local129 = Static97.anIntArray78[local46];
			if ((Static251.aByteArray43[local129] & 0x1) != 0) {
				if (local7 > 0) {
					Static251.aByteArray43[local129] = (byte) (Static251.aByteArray43[local129] | 0x2);
					local7--;
				} else {
					local210 = arg0.method3347(1);
					if (local210 == 0) {
						local7 = Static17.method271(arg0);
						Static251.aByteArray43[local129] = (byte) (Static251.aByteArray43[local129] | 0x2);
					} else if (Static233.method3071(arg0, local129)) {
						Static251.aByteArray43[local129] = (byte) (Static251.aByteArray43[local129] | 0x2);
					}
				}
			}
		}
		arg0.method3348();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3352();
		for (local129 = 0; local129 < Static272.anInt4302; local129++) {
			local210 = Static97.anIntArray78[local129];
			if ((Static251.aByteArray43[local210] & 0x1) == 0) {
				if (local7 > 0) {
					Static251.aByteArray43[local210] = (byte) (Static251.aByteArray43[local210] | 0x2);
					local7--;
				} else {
					@Pc(302) int local302 = arg0.method3347(1);
					if (local302 == 0) {
						local7 = Static17.method271(arg0);
						Static251.aByteArray43[local210] = (byte) (Static251.aByteArray43[local210] | 0x2);
					} else if (Static233.method3071(arg0, local210)) {
						Static251.aByteArray43[local210] = (byte) (Static251.aByteArray43[local210] | 0x2);
					}
				}
			}
		}
		arg0.method3348();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static272.anInt4302 = 0;
		Static31.anInt624 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			Static251.aByteArray43[local210] = (byte) (Static251.aByteArray43[local210] >> 1);
			@Pc(374) Class20_Sub3_Sub3_Sub1 local374 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local210];
			if (local374 == null) {
				Static97.anIntArray78[Static272.anInt4302++] = local210;
			} else {
				Static363.anIntArray373[Static31.anInt624++] = local210;
			}
		}
	}
}
