import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "[S")
	public static short[] aShortArray71;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_70 = new Class200(91, 8);

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "J")
	public static final long aLong159 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)I")
	public static int method4513(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(156) int local156 = (int) (local60 * 256.0D);
		@Pc(161) int local161 = (int) (local62 * 256.0D);
		@Pc(166) int local166 = (int) (local68 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		if (local166 > 243) {
			local161 >>= 0x4;
		} else if (local166 > 217) {
			local161 >>= 0x3;
		} else if (local166 > 192) {
			local161 >>= 0x2;
		} else if (local166 > 179) {
			local161 >>= 0x1;
		}
		return (local166 >> 1) + ((local156 & 0xFF) >> 2 << 10) + (local161 >> 5 << 7);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIII)Z")
	public static boolean method4514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static400.aClass39_9.method7254(arg0, arg2, arg1, Static342.anIntArray396);
		@Pc(13) int local13 = Static342.anIntArray396[2];
		if (local13 < 50) {
			return false;
		} else {
			Static342.anIntArray396[2] = local13;
			Static342.anIntArray396[0] = Static380.anInt7104 * Static342.anIntArray396[0] / local13 + Static436.anInt7858;
			Static342.anIntArray396[1] = Static449.anInt7993 * Static342.anIntArray396[1] / local13 + Static289.anInt8542;
			return true;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIILclient!aca;)V")
	public static void method4516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4) {
		@Pc(4) Class77 local4 = Static323.method5276(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8916 = (arg1 << Static308.anInt5834) + Static161.anInt3180;
		arg4.anInt8915 = arg3;
		arg4.anInt8911 = (arg2 << Static308.anInt5834) + Static161.anInt3180;
		local4.aClass4_Sub1_Sub1_1 = arg4;
		@Pc(33) int local33 = Static364.aClass51Array3 == Static2.aClass51Array1 ? 1 : 0;
		if (arg4.method7693()) {
			if (arg4.method7702()) {
				Static368.aClass4_Sub1ArrayArray2[local33][Static62.anIntArray650[local33]++] = arg4;
				return;
			}
			Static276.aClass4_Sub1ArrayArray1[local33][Static93.anIntArray83[local33]++] = arg4;
			Static585.aBoolean690 = true;
			return;
		}
		Static491.aClass4_Sub1ArrayArray3[local33][Static582.anIntArray612[local33]++] = arg4;
	}
}
