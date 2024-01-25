import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!kka", name = "l", descriptor = "Z")
	public static final boolean aBoolean361 = false;

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_17 = new Class320(17);

	@OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
	public static int anInt5569 = 0;

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4926(@OriginalArg(0) Class22 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static347.aBoolean360) {
			local7 = Static308.method4570();
			local9 = Static541.method7180();
		}
		@Pc(21) int local21 = local7 + Static123.anInt2492;
		@Pc(25) int local25 = local9 + Static177.anInt3132;
		@Pc(27) int local27 = Static332.anInt5338;
		@Pc(31) int local31 = Static284.anInt4357 - 3;
		Static319.method4666(local9 + Static177.anInt3132, local7 + Static123.anInt2492, Static430.aClass257_24.method5699(Static456.anInt7118), Static332.anInt5338, Static284.anInt4357, arg0);
		@Pc(55) int local55 = Static334.aClass18_1.method4192() + local7;
		@Pc(61) int local61 = Static334.aClass18_1.method4196() + local9;
		@Pc(65) int local65;
		@Pc(70) Class3_Sub7_Sub10 local70;
		@Pc(87) int local87;
		@Pc(307) int local307;
		@Pc(167) Class3_Sub7_Sub5 local167;
		@Pc(292) Class3_Sub7_Sub10 local292;
		if (Static228.aBoolean744) {
			local65 = 0;
			for (local167 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local167 != null; local167 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
				local87 = local65 * 16 + local25 + 13 + 20;
				if (local7 + Static123.anInt2492 < local55 && Static123.anInt2492 + local7 + Static332.anInt5338 > local55 && local61 > local87 - 13 && local87 + 4 > local61 && (local167.anInt2315 > 1 || ((Class3_Sub7_Sub10) local167.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67).aBoolean245)) {
					arg0.aa(Static123.anInt2492 + local7, local87 - 12, Static332.anInt5338, 16, 255 - Static591.anInt8978 << 24 | Static302.anInt4870, 1);
				}
				local65++;
			}
			if (Static15.aClass3_Sub7_Sub5_1 != null) {
				Static319.method4666(Static225.anInt3682, Static440.anInt6770, Static15.aClass3_Sub7_Sub5_1.aString40, Static331.anInt5337, Static558.anInt8545, arg0);
				local65 = 0;
				for (local292 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3334(); local292 != null; local292 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3332()) {
					local307 = Static225.anInt3682 + local65 * 16 + 33;
					local65++;
					if (Static440.anInt6770 < local55 && local55 < Static440.anInt6770 + Static331.anInt5337 && local61 > local307 - 13 && local61 < local307 + 4 && local292.aBoolean245) {
						arg0.aa(Static440.anInt6770, local307 - 12, Static331.anInt5337, 16, 255 - Static591.anInt8978 << 24 | Static302.anInt4870, 1);
					}
				}
				Static40.method1152(Static440.anInt6770, Static331.anInt5337, arg0, Static558.anInt8545, Static225.anInt3682);
			}
		} else {
			local65 = 0;
			for (local70 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local70 != null; local70 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				local87 = (Static716.anInt11158 - local65 - 1) * 16 + local25 + 20 + 13;
				local65++;
				if (local7 + Static123.anInt2492 < local55 && local55 < Static123.anInt2492 + local7 + Static332.anInt5338 && local61 > local87 - 13 && local61 < local87 + 4 && local70.aBoolean245) {
					arg0.aa(Static123.anInt2492 + local7, local87 + -12, Static332.anInt5338, 16, 255 - Static591.anInt8978 << 24 | Static302.anInt4870, 1);
				}
			}
		}
		Static40.method1152(Static123.anInt2492 + local7, Static332.anInt5338, arg0, Static284.anInt4357, local9 + Static177.anInt3132);
		if (Static228.aBoolean744) {
			local65 = 0;
			for (local167 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local167 != null; local167 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
				local87 = local65 * 16 + Static177.anInt3132 + local9 + 33;
				if (local167.anInt2315 == 1) {
					Static695.method6730(Static587.anInt8945 | 0xFF000000, (Class3_Sub7_Sub10) local167.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67, Static284.anInt4357, Static177.anInt3132 + local9, local61, local55, Static123.anInt2492 + local7, arg0, Static119.anInt6371 | 0xFF000000, Static332.anInt5338, local87);
				} else {
					Static435.method5754(local55, local61, Static284.anInt4357, local87, arg0, local167, local7 + Static123.anInt2492, Static177.anInt3132 + local9, Static332.anInt5338, Static119.anInt6371 | 0xFF000000, Static587.anInt8945 | 0xFF000000);
				}
				local65++;
			}
			if (Static15.aClass3_Sub7_Sub5_1 != null) {
				local65 = 0;
				for (local292 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3334(); local292 != null; local292 = (Class3_Sub7_Sub10) Static15.aClass3_Sub7_Sub5_1.aClass147_1.method3332()) {
					local307 = Static225.anInt3682 + local65 * 16 + 20 + 13;
					Static695.method6730(Static587.anInt8945 | 0xFF000000, local292, Static558.anInt8545, Static225.anInt3682, local61, local55, Static440.anInt6770, arg0, Static119.anInt6371 | 0xFF000000, Static331.anInt5337, local307);
					local65++;
				}
				Static630.method8287(Static331.anInt5337, Static558.anInt8545, Static225.anInt3682, Static440.anInt6770);
			}
		} else {
			local65 = 0;
			for (local70 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local70 != null; local70 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				local87 = local25 + (-local65 + (Static716.anInt11158 - 1)) * 16 + 33;
				local65++;
				Static695.method6730(Static587.anInt8945 | 0xFF000000, local70, local31, local25, local61, local55, local21, arg0, Static119.anInt6371 | 0xFF000000, local27, local87);
			}
		}
		Static630.method8287(Static332.anInt5338, Static284.anInt4357, Static177.anInt3132 + local9, local7 + Static123.anInt2492);
	}
}
