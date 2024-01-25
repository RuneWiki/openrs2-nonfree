import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public static final int anInt9233 = Static126.method2629(1600);

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
	public static void method7539() {
		Static235.aClass94_6.method2952();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method7541(@OriginalArg(0) Class6_Sub8_Sub1 arg0) {
		arg0.method1511();
		@Pc(10) int local10 = Static238.anInt5268;
		@Pc(20) Class9_Sub4_Sub2_Sub1_Sub2 local20 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local10] = new Class9_Sub4_Sub2_Sub1_Sub2();
		local20.anInt4299 = local10;
		@Pc(28) int local28 = arg0.method1512(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray197[0] = local39 - Static477.anInt8412;
		@Pc(50) int local50 = local28 & 0x3FFF;
		local20.anInt10360 = (local20.anIntArray197[0] << 9) + (local20.method3620() << 8);
		local20.anIntArray198[0] = local50 - Static227.anInt5049;
		local20.anInt10357 = (local20.anIntArray198[0] << 9) + (local20.method3620() << 8);
		Static86.anInt10575 = local20.aByte135 = local20.aByte134 = local33;
		if (Static3.method52(local20.anIntArray198[0], local20.anIntArray197[0])) {
			local20.aByte134++;
		}
		if (Static387.aClass6_Sub8Array1[local10] != null) {
			local20.method3641(Static387.aClass6_Sub8Array1[local10]);
		}
		Static6.anInt462 = 0;
		Static551.anIntArray503[Static6.anInt462++] = local10;
		Static290.aByteArray39[local10] = 0;
		Static82.anInt2604 = 0;
		for (@Pc(143) int local143 = 1; local143 < 2048; local143++) {
			if (local143 != local10) {
				@Pc(157) int local157 = arg0.method1512(18);
				@Pc(161) int local161 = local157 >> 16;
				@Pc(167) int local167 = local157 >> 8 & 0xFF;
				@Pc(171) int local171 = local157 & 0xFF;
				@Pc(179) Class379 local179 = Static530.aClass379Array1[local143] = new Class379();
				local179.anInt10723 = (local161 << 28) - (-(local167 << 14) - local171);
				local179.aBoolean845 = false;
				local179.anInt10724 = -1;
				local179.anInt10721 = 0;
				Static450.anIntArray425[Static82.anInt2604++] = local143;
				Static290.aByteArray39[local143] = 0;
			}
		}
		arg0.method1509();
	}
}
