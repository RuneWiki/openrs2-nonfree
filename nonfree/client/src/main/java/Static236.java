import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
	public static boolean aBoolean325;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
	public static int anInt4342 = -1;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "[Lclient!qfa;")
	public static final Class283[] aClass283Array1 = new Class283[6];

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public static int anInt4344 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILclient!or;Lclient!aa;Lclient!vr;II)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class260 arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static428.anInt6834 == 4) {
			local14 = (int) Static618.aFloat207 & 0x3FFF;
		} else {
			local14 = (int) Static618.aFloat207 + Static490.anInt8101 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt6963 / 2, arg3.anInt6971 / 2) + 10;
		@Pc(43) int local43 = arg1 * arg1 + arg0 * arg0;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(57) int local57 = Class3_Sub20.anIntArray206[local14];
		@Pc(61) int local61 = Class3_Sub20.anIntArray204[local14];
		if (Static428.anInt6834 != 4) {
			local61 = local61 * 256 / (Static663.anInt10571 + 256);
			local57 = local57 * 256 / (Static663.anInt10571 + 256);
		}
		@Pc(92) int local92 = arg0 * local61 + local57 * arg1 >> 14;
		@Pc(103) int local103 = local61 * arg1 - local57 * arg0 >> 14;
		arg5.method7647(local92 + arg3.anInt6963 / 2 + arg6 - arg5.method7645() / 2, arg2 - -(arg3.anInt6971 / 2) + (-local103 - arg5.method7658() / 2), arg4, arg6, arg2);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIILclient!bba;BI)V")
	public static void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class28_Sub1_Sub1_Sub1 arg3) {
		Static113.method2113(arg3.anInt10731, arg1, arg3.anInt10729, arg0, arg3.aByte174, 0, arg2);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
	public static int method3940(@OriginalArg(0) int arg0) {
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
		@Pc(58) double local58 = local14;
		if (local14 < local23) {
			local58 = local23;
		}
		if (local30 > local58) {
			local58 = local30;
		}
		@Pc(72) double local72 = 0.0D;
		@Pc(74) double local74 = 0.0D;
		@Pc(80) double local80 = (local58 + local32) / 2.0D;
		if (local58 != local32) {
			if (local80 < 0.5D) {
				local74 = (local58 - local32) / (local58 + local32);
			}
			if (local80 >= 0.5D) {
				local74 = (local58 - local32) / (2.0D - local32 - local58);
			}
			if (local14 == local58) {
				local72 = (local23 - local30) / (local58 - local32);
			} else if (local58 == local23) {
				local72 = (local30 - local14) / (-local32 + local58) + 2.0D;
			} else if (local30 == local58) {
				local72 = (local14 - local23) / (-local32 + local58) + 4.0D;
			}
		}
		local72 /= 6.0D;
		@Pc(170) int local170 = (int) (local72 * 256.0D);
		@Pc(175) int local175 = (int) (local74 * 256.0D);
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		@Pc(193) int local193 = (int) (local80 * 256.0D);
		if (local193 < 0) {
			local193 = 0;
		} else if (local193 > 255) {
			local193 = 255;
		}
		if (local193 > 243) {
			local175 >>= 0x4;
		} else if (local193 > 217) {
			local175 >>= 0x3;
		} else if (local193 > 192) {
			local175 >>= 0x2;
		} else if (local193 > 179) {
			local175 >>= 0x1;
		}
		return ((local170 >> 2 & 0x3F) << 10) - (-(local175 >> 5 << 7) - (local193 >> 1));
	}
}
