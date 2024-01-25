import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!st", name = "d", descriptor = "J")
	public static long aLong264;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	public static int anInt9286;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	public static int anInt9283 = 0;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "I")
	public static int anInt9285 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I")
	public static int method7827(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local74 < 0.5D) {
				local68 = (local46 - local32) / (local46 + local32);
			}
			if (local74 >= 0.5D) {
				local68 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local66 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local66 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local66 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local66 /= 6.0D;
		@Pc(162) int local162 = (int) (local66 * 256.0D);
		@Pc(167) int local167 = (int) (local68 * 256.0D);
		@Pc(172) int local172 = (int) (local74 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local167 >>= 0x4;
		} else if (local172 > 217) {
			local167 >>= 0x3;
		} else if (local172 > 192) {
			local167 >>= 0x2;
		} else if (local172 > 179) {
			local167 >>= 0x1;
		}
		return (local172 >> 1) + (local167 >> 5 << 7) + ((local162 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method7828() {
		if (Static277.aBoolean303 || Static593.aClass6_Sub4_Sub12_4 == null) {
			return "";
		} else if ((Static593.aClass6_Sub4_Sub12_4.aString98 == null || Static593.aClass6_Sub4_Sub12_4.aString98.length() == 0) && Static593.aClass6_Sub4_Sub12_4.aString99 != null && Static593.aClass6_Sub4_Sub12_4.aString99.length() > 0) {
			return Static593.aClass6_Sub4_Sub12_4.aString99;
		} else {
			return Static593.aClass6_Sub4_Sub12_4.aString98;
		}
	}
}
