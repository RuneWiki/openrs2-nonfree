import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!es", name = "H", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!es", name = "I", descriptor = "[I")
	public static final int[] anIntArray140 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!es", name = "P", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_29 = new Class286(59, -1);

	@OriginalMember(owner = "client!es", name = "w", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
	public static void method2547() {
		@Pc(8) Class3_Sub28_Sub2 local8 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		local8.method5343();
		@Pc(24) int local24 = local8.method5344(8);
		@Pc(33) int local33;
		if (local24 < Static337.anInt5854) {
			for (local33 = local24; local33 < Static337.anInt5854; local33++) {
				Static629.anIntArray581[Static303.anInt5468++] = Static101.anIntArray95[local33];
			}
		}
		if (local24 > Static337.anInt5854) {
			throw new RuntimeException("gnpov1");
		}
		Static337.anInt5854 = 0;
		for (local33 = 0; local33 < local24; local33++) {
			@Pc(74) int local74 = Static101.anIntArray95[local33];
			@Pc(82) Class19_Sub1_Sub3_Sub2_Sub1 local82 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) local74)).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			@Pc(87) int local87 = local8.method5344(1);
			if (local87 == 0) {
				Static101.anIntArray95[Static337.anInt5854++] = local74;
				local82.anInt7815 = Static517.anInt8809;
			} else {
				@Pc(112) int local112 = local8.method5344(2);
				if (local112 == 0) {
					Static101.anIntArray95[Static337.anInt5854++] = local74;
					local82.anInt7815 = Static517.anInt8809;
					Static6.anIntArray3[Static48.anInt822++] = local74;
				} else {
					@Pc(158) int local158;
					@Pc(168) int local168;
					if (local112 == 1) {
						Static101.anIntArray95[Static337.anInt5854++] = local74;
						local82.anInt7815 = Static517.anInt8809;
						local158 = local8.method5344(3);
						local82.method3435(local158, 1);
						local168 = local8.method5344(1);
						if (local168 == 1) {
							Static6.anIntArray3[Static48.anInt822++] = local74;
						}
					} else if (local112 == 2) {
						Static101.anIntArray95[Static337.anInt5854++] = local74;
						local82.anInt7815 = Static517.anInt8809;
						if (local8.method5344(1) == 1) {
							local158 = local8.method5344(3);
							local82.method3435(local158, 2);
							local168 = local8.method5344(3);
							local82.method3435(local168, 2);
						} else {
							local158 = local8.method5344(3);
							local82.method3435(local158, 0);
						}
						local158 = local8.method5344(1);
						if (local158 == 1) {
							Static6.anIntArray3[Static48.anInt822++] = local74;
						}
					} else if (local112 == 3) {
						Static629.anIntArray581[Static303.anInt5468++] = local74;
					}
				}
			}
		}
	}
}
