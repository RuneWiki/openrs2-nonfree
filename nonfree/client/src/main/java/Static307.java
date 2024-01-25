import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_48 = new Class208(64, -1);

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_105 = new Class268(26, -2);

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public static int anInt5931 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBI)Z")
	public static boolean method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface12 local9 = (Interface12) Static245.method5549(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static123.method2041(local9) & true;
		}
		local9 = (Interface12) Static366.method5797(arg0, arg1, arg2, jn.class);
		if (local9 != null) {
			local11 &= Static123.method2041(local9);
		}
		local9 = (Interface12) Static158.method2999(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static123.method2041(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)Lclient!c;")
	public static Class20_Sub3 method5201(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class81[] local16 = Class100_Sub1.aClass81Array3;
		synchronized (Class100_Sub1.aClass81Array3) {
			@Pc(36) Class20_Sub3 local36;
			if (Class100_Sub1.aClass81Array3.length <= arg1 || Class100_Sub1.aClass81Array3[arg1].method2130()) {
				local36 = new Class20_Sub3();
				local36.aClass20_Sub4Array1 = new Class20_Sub4[arg1];
				for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
					local36.aClass20_Sub4Array1[local42] = new Class20_Sub4();
				}
			} else {
				local36 = (Class20_Sub3) Class100_Sub1.aClass81Array3[arg1].method2120();
				local36.method9004();
				@Pc(75) int local75 = Static317.anIntArray361[arg1]--;
			}
			local36.aBoolean82 = arg0;
			return local36;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5202(@OriginalArg(0) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static389.aBoolean497) {
			local7 = Static240.method4161();
			local9 = Static452.method6945();
		}
		@Pc(21) int local21 = local7 + Static29.anInt622;
		@Pc(25) int local25 = local9 + Static94.anInt1854;
		@Pc(27) int local27 = Static400.anInt7476;
		@Pc(31) int local31 = Static483.anInt8373 - 3;
		Static442.method6839(Static317.aClass192_24.method5299(anInt5931), arg0, local9 + Static94.anInt1854, Static29.anInt622 + local7, Static483.anInt8373, Static400.anInt7476);
		@Pc(55) int local55 = local7 + Static429.aClass71_1.method7701();
		@Pc(61) int local61 = local9 + Static429.aClass71_1.method7702();
		@Pc(65) int local65;
		@Pc(70) Class6_Sub2_Sub4 local70;
		@Pc(87) int local87;
		@Pc(262) int local262;
		@Pc(153) Class6_Sub2_Sub12 local153;
		@Pc(250) Class6_Sub2_Sub4 local250;
		if (Static165.aBoolean249) {
			local65 = 0;
			for (local153 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local153 != null; local153 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
				local87 = local65 * 16 + local25 + 13 + 20;
				if (local55 > local7 + Static29.anInt622 && local7 + Static29.anInt622 + Static400.anInt7476 > local55 && local87 - 13 < local61 && local61 < local87 + 4 && (local153.anInt5417 > 1 || ((Class6_Sub2_Sub4) local153.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66).aBoolean121)) {
					arg0.aa(local7 + Static29.anInt622, local87 - 12, Static400.anInt7476, 16, Static54.anInt954 | 255 - Static343.anInt6469 << 24, 1);
				}
				local65++;
			}
			if (Static72.aClass6_Sub2_Sub12_1 != null) {
				Static442.method6839(Static72.aClass6_Sub2_Sub12_1.aString58, arg0, Static617.anInt10189, Static195.anInt3962, Static457.anInt8136, Static282.anInt5632);
				local65 = 0;
				for (local250 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7242(); local250 != null; local250 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7241()) {
					local262 = local65 * 16 + Static617.anInt10189 + 13 + 20;
					if (local55 > Static195.anInt3962 && local55 < Static195.anInt3962 + Static282.anInt5632 && local61 > local262 - 13 && local262 + 4 > local61 && local250.aBoolean121) {
						arg0.aa(Static195.anInt3962, local262 - 12, Static282.anInt5632, 16, Static54.anInt954 | 255 - Static343.anInt6469 << 24, 1);
					}
					local65++;
				}
				Static368.method5824(Static282.anInt5632, arg0, Static195.anInt3962, Static617.anInt10189, Static457.anInt8136);
			}
		} else {
			local65 = 0;
			for (local70 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local70 != null; local70 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				local87 = (Static462.anInt8179 - local65 - 1) * 16 + local25 + 33;
				if (local7 + Static29.anInt622 < local55 && local7 + Static29.anInt622 + Static400.anInt7476 > local55 && local87 - 13 < local61 && local61 < local87 + 4 && local70.aBoolean121) {
					arg0.aa(Static29.anInt622 + local7, local87 + -12, Static400.anInt7476, 16, 255 - Static343.anInt6469 << 24 | Static54.anInt954, 1);
				}
				local65++;
			}
		}
		Static368.method5824(Static400.anInt7476, arg0, Static29.anInt622 + local7, Static94.anInt1854 - -local9, Static483.anInt8373);
		if (Static165.aBoolean249) {
			local65 = 0;
			for (local153 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7242(); local153 != null; local153 = (Class6_Sub2_Sub12) Static603.aClass286_12.method7241()) {
				local87 = local9 + Static94.anInt1854 + local65 * 16 + 13 + 20;
				local65++;
				if (local153.anInt5417 == 1) {
					Static80.method1402((Class6_Sub2_Sub4) local153.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66, local55, local9 + Static94.anInt1854, Static12.anInt226 | 0xFF000000, local61, Static483.anInt8373, local87, arg0, Static400.anInt7476, local7 + Static29.anInt622, Static531.anInt9189 | 0xFF000000);
				} else {
					Static600.method8453(Static400.anInt7476, local153, local7 + Static29.anInt622, arg0, local55, local9 + Static94.anInt1854, Static483.anInt8373, local61, local87, Static12.anInt226 | 0xFF000000, Static531.anInt9189 | 0xFF000000);
				}
			}
			if (Static72.aClass6_Sub2_Sub12_1 != null) {
				local65 = 0;
				for (local250 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7242(); local250 != null; local250 = (Class6_Sub2_Sub4) Static72.aClass6_Sub2_Sub12_1.aClass286_6.method7241()) {
					local262 = Static617.anInt10189 + local65 * 16 + 33;
					local65++;
					Static80.method1402(local250, local55, Static617.anInt10189, Static12.anInt226 | 0xFF000000, local61, Static457.anInt8136, local262, arg0, Static282.anInt5632, Static195.anInt3962, Static531.anInt9189 | 0xFF000000);
				}
				Static297.method6206(Static195.anInt3962, Static617.anInt10189, Static282.anInt5632, Static457.anInt8136);
			}
		} else {
			local65 = 0;
			for (local70 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local70 != null; local70 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				local87 = local25 + (Static462.anInt8179 - (local65 + 1)) * 16 + 13 + 20;
				Static80.method1402(local70, local55, local25, Static12.anInt226 | 0xFF000000, local61, local31, local87, arg0, local27, local21, Static531.anInt9189 | 0xFF000000);
				local65++;
			}
		}
		Static297.method6206(local7 + Static29.anInt622, local9 + Static94.anInt1854, Static400.anInt7476, Static483.anInt8373);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
	public static void method5203(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(7, arg0);
		local8.method3722();
	}
}
