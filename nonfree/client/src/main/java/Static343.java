import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_112 = new Class133(19, 12);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "F")
	public static float aFloat198 = 1024.0F;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	public static int anInt6460 = 2;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt6462 = 1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static279.aClass290ArrayArrayArray7[0][arg1][arg2] != null && Static279.aClass290ArrayArrayArray7[0][arg1][arg2].aClass290_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static279.aClass290ArrayArrayArray7[local22][arg1][arg2] == null) {
				@Pc(46) Class290 local46 = Static279.aClass290ArrayArrayArray7[local22][arg1][arg2] = new Class290(local22, arg1, arg2);
				if (local20) {
					local46.aByte95++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)I")
	public static int method5438(@OriginalArg(0) int arg0) {
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
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(159) int local159 = (int) (local60 * 256.0D);
		@Pc(172) int local172 = (int) (local62 * 256.0D);
		@Pc(177) int local177 = (int) (local68 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local177 < 0) {
			local177 = 0;
		} else if (local177 > 255) {
			local177 = 255;
		}
		if (local177 > 243) {
			local172 >>= 0x4;
		} else if (local177 > 217) {
			local172 >>= 0x3;
		} else if (local177 > 192) {
			local172 >>= 0x2;
		} else if (local177 > 179) {
			local172 >>= 0x1;
		}
		return (local177 >> 1) + ((local159 & 0xFF) >> 2 << 10) + (local172 >> 5 << 7);
	}
}
