import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[B")
	public static final byte[] aByteArray72 = new byte[520];

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt4657 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method4307() {
		if (Static287.aClass101_1 == null) {
			return;
		}
		while (true) {
			while (Static96.anInt1766 < Static139.aClass64_Sub1Array1.length) {
				@Pc(21) Class64_Sub1 local21 = Static139.aClass64_Sub1Array1[Static96.anInt1766];
				if (local21 != null && local21.anInt2865 == -1) {
					if (Static65.aClass6_Sub13_1 == null) {
						Static65.aClass6_Sub13_1 = Static287.aClass101_1.method2598(local21.aString125);
					}
					@Pc(47) int local47 = Static65.aClass6_Sub13_1.anInt1618;
					if (local47 == -1) {
						return;
					}
					Static65.aClass6_Sub13_1 = null;
					local21.anInt2865 = local47;
					Static96.anInt1766++;
				} else {
					Static96.anInt1766++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)I")
	public static int method4308(@OriginalArg(0) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(160) int local160 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		@Pc(170) int local170 = (int) (local68 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return (local170 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method4309(@OriginalArg(1) Class53 arg0) {
		Static192.aClass53_95 = arg0;
	}
}
