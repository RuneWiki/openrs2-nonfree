import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "Z")
	public static boolean aBoolean4;

	@OriginalMember(owner = "client!aca", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	public static int anInt103;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_4 = new Class186(41, 3);

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "Z")
	public static final boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "[I")
	public static final int[] anIntArray3 = new int[250];

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	public static void method104() {
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_2, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_1, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_2, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub29_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub16_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub9_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub19_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub3_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub26_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub18_1, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub28_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub30_1, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub11_1, 1);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_2, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub5_1, 2);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub21_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub12_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub27_1, 1);
		Static662.method8298();
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub24_1, 0);
		Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub1_1, 4);
		Static523.method7451();
		Static538.method6234();
		Static169.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)I")
	public static int method106(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(162) int local162 = (int) (local60 * 256.0D);
		@Pc(167) int local167 = (int) (local62 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(190) int local190 = (int) (local68 * 256.0D);
		if (local190 < 0) {
			local190 = 0;
		} else if (local190 > 255) {
			local190 = 255;
		}
		if (local190 > 243) {
			local167 >>= 0x4;
		} else if (local190 > 217) {
			local167 >>= 0x3;
		} else if (local190 > 192) {
			local167 >>= 0x2;
		} else if (local190 > 179) {
			local167 >>= 0x1;
		}
		return (local190 >> 1) + (local167 >> 5 << 7) + ((local162 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "(I)V")
	public static void method107() {
		Static652.aClass338_60.method8051();
		Static190.aClass338_16.method8051();
	}
}
