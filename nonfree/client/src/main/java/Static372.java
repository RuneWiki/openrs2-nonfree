import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "[Lclient!ns;")
	public static Class25_Sub5[] aClass25_Sub5Array2;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
	public static final int[] anIntArray421 = new int[1000];

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	public static int anInt6263 = 0;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "[B")
	public static final byte[] aByteArray84 = new byte[2048];

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
	public static int anInt6266 = 0;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V")
	public static void method4930() {
		Static336.aClass1_Sub28_Sub1_2.method3077();
		@Pc(15) int local15 = Static336.aClass1_Sub28_Sub1_2.method3084(8);
		@Pc(24) int local24;
		if (local15 < Static328.anInt5608) {
			for (local24 = local15; local24 < Static328.anInt5608; local24++) {
				Static334.anIntArray391[Static78.anInt3517++] = Static31.anIntArray30[local24];
			}
		}
		if (Static328.anInt5608 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static328.anInt5608 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(63) int local63 = Static31.anIntArray30[local24];
			@Pc(67) Class25_Sub5_Sub1_Sub1 local67 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local63];
			@Pc(72) int local72 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
			if (local72 == 0) {
				Static31.anIntArray30[Static328.anInt5608++] = local63;
				local67.anInt4298 = Static236.anInt4213;
			} else {
				@Pc(95) int local95 = Static336.aClass1_Sub28_Sub1_2.method3084(2);
				if (local95 == 0) {
					Static31.anIntArray30[Static328.anInt5608++] = local63;
					local67.anInt4298 = Static236.anInt4213;
					Static377.anIntArray423[Static383.anInt6392++] = local63;
				} else {
					@Pc(142) int local142;
					@Pc(154) int local154;
					if (local95 == 1) {
						Static31.anIntArray30[Static328.anInt5608++] = local63;
						local67.anInt4298 = Static236.anInt4213;
						local142 = Static336.aClass1_Sub28_Sub1_2.method3084(3);
						local67.method2595(local142, 1);
						local154 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
						if (local154 == 1) {
							Static377.anIntArray423[Static383.anInt6392++] = local63;
						}
					} else if (local95 == 2) {
						Static31.anIntArray30[Static328.anInt5608++] = local63;
						local67.anInt4298 = Static236.anInt4213;
						if (Static336.aClass1_Sub28_Sub1_2.method3084(1) == 1) {
							local142 = Static336.aClass1_Sub28_Sub1_2.method3084(3);
							local67.method2595(local142, 2);
							local154 = Static336.aClass1_Sub28_Sub1_2.method3084(3);
							local67.method2595(local154, 2);
						} else {
							local142 = Static336.aClass1_Sub28_Sub1_2.method3084(3);
							local67.method2595(local142, 0);
						}
						local142 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
						if (local142 == 1) {
							Static377.anIntArray423[Static383.anInt6392++] = local63;
						}
					} else if (local95 == 3) {
						Static334.anIntArray391[Static78.anInt3517++] = local63;
					}
				}
			}
		}
	}
}
