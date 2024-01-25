import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!tf;")
	public static Class17 aClass17_50;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method4928() {
		@Pc(8) int local8 = Static275.aByteArrayArray12.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static275.aByteArrayArray12[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static651.anInt10275; local20++) {
					if (Static472.anIntArray505[local10] == Static507.anIntArray542[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static507.anIntArray542[Static651.anInt10275] = Static472.anIntArray505[local10];
					local18 = Static651.anInt10275++;
				}
				@Pc(63) Class4_Sub11 local63 = new Class4_Sub11(Static275.aByteArrayArray12[local10]);
				@Pc(65) int local65 = 0;
				while (local63.anInt10466 < Static275.aByteArrayArray12[local10].length && local65 < 511 && Static105.anInt2131 < 1023) {
					@Pc(84) int local84 = local65++ << 6 | local18;
					@Pc(88) int local88 = local63.method8859();
					@Pc(92) int local92 = local88 >> 14;
					@Pc(98) int local98 = local88 >> 7 & 0x3F;
					@Pc(102) int local102 = local88 & 0x3F;
					@Pc(115) int local115 = local98 + (Static472.anIntArray505[local10] >> 8) * 64 - Static445.anInt6949;
					@Pc(128) int local128 = local102 + (Static472.anIntArray505[local10] & 0xFF) * 64 - Static321.anInt5000;
					@Pc(135) Class345 local135 = Static255.aClass380_1.method8596(local63.method8859());
					@Pc(142) Class4_Sub45 local142 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local84);
					if (local142 == null && (local135.aByte132 & 0x1) > 0 && local92 == Static431.anInt6799 && local115 >= 0 && Static224.anInt3557 > local115 + local135.anInt8812 && local128 >= 0 && Static267.anInt4309 > local128 + local135.anInt8812) {
						@Pc(182) Class3_Sub1_Sub2_Sub2_Sub2 local182 = new Class3_Sub1_Sub2_Sub2_Sub2();
						local182.anInt9961 = local84;
						@Pc(190) Class4_Sub45 local190 = new Class4_Sub45(local182);
						Static597.aClass66_41.method1985(local190, (long) local84);
						Static238.aClass4_Sub45Array1[Static15.anInt1571++] = local190;
						Static526.anIntArray558[Static105.anInt2131++] = local84;
						local182.anInt9983 = Static177.anInt3088;
						local182.method8537(local135);
						local182.method8515(local182.aClass345_1.anInt8812);
						local182.anInt9976 = local182.aClass345_1.anInt8799 << 3;
						local182.method8526(local182.aClass345_1.aByte126 + 4 << 11 & 0x3E06, true);
						local182.method8534(local128, local92, local115, local182.method8514(), true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
	public static int method4930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 4095 - arg1;
		} else if (local7 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
