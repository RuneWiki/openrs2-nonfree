import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
	public static final int[] anIntArray377 = new int[6];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	public static void method3953(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static87.anInt1951 - Static529.anInt9508;
		if (local8 >= 100) {
			Static115.anInt2304 = -1;
			Static667.anInt11097 = -1;
			Static378.anInt6935 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static2.aFloat1;
		if (Static258.anInt4460 >> 8 > local21) {
			local21 = Static258.anInt4460 >> 8;
		}
		if (Static569.aBooleanArray26[4] && Static111.anIntArray174[4] + 128 > local21) {
			local21 = Static111.anIntArray174[4] + 128;
		}
		@Pc(60) int local60 = (int) Static543.aFloat228 + Static97.anInt2095 & 0x3FFF;
		Static443.method6486((local21 >> 3) * 3 + 600 << 2, Static59.anInt1432, local60, arg0, local21, Static152.method2434(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998, Static586.anInt10060, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002) - 200, Static569.anInt9811);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static396.anInt7302 = (int) ((float) Static341.anInt6382 + local104 * (float) (Static396.anInt7302 - Static341.anInt6382));
		Static233.anInt4273 = (int) ((float) (Static233.anInt4273 - Static354.anInt6540) * local104 + (float) Static354.anInt6540);
		Static74.anInt1618 = (int) ((float) Static193.anInt3600 + local104 * (float) (Static74.anInt1618 - Static193.anInt3600));
		Static668.anInt11106 = (int) ((float) (Static668.anInt11106 - Static179.anInt3446) * local104 + (float) Static179.anInt3446);
		@Pc(156) int local156 = Static219.anInt4123 - Static219.anInt4122;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static219.anInt4123 = (int) ((float) local156 * local104 + (float) Static219.anInt4122);
		Static219.anInt4123 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBI)Z")
	public static boolean method3954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static317.method5006(arg0, arg1) & Static156.method2526(arg1, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method3955() {
		Static350.anImage3 = null;
		Static657.aFont1 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3957(@OriginalArg(2) String arg0) {
		Static149.method5512("", "", arg0, 4, 0, "");
	}
}
