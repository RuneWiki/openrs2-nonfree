import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "[I")
	public static final int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	public static int anInt9010 = -1;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)Z")
	public static boolean method7521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static645.method8717(arg0, arg1) | (arg1 & 0x10000) != 0 || Static255.method3997(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static161.method2562(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)V")
	public static void method7523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static714.anInt11156 + arg2;
		@Pc(14) int local14 = arg0 + Static339.anInt5859;
		if (Static584.aClass262ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static362.anInt8653 || arg0 >= Static206.anInt11291 || Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0 && arg1 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
			return;
		}
		@Pc(72) long local72 = (long) (local9 | arg1 << 28 | local14 << 14);
		@Pc(78) Class3_Sub20 local78 = (Class3_Sub20) Static46.aClass136_5.method3503(local72);
		if (local78 == null) {
			Static612.method8353(arg1, arg2, arg0);
			return;
		}
		@Pc(93) Class3_Sub50 local93 = (Class3_Sub50) local78.aClass357_9.method8391();
		if (local93 == null) {
			Static612.method8353(arg1, arg2, arg0);
			return;
		}
		@Pc(108) Class19_Sub1_Sub4_Sub1 local108 = (Class19_Sub1_Sub4_Sub1) Static612.method8353(arg1, arg2, arg0);
		if (local108 == null) {
			local108 = new Class19_Sub1_Sub4_Sub1(arg2 << 9, Static639.aClass313Array2[arg1].method9095(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local108.anInt6890 = local108.anInt6897 = -1;
		}
		local108.anInt6899 = local93.anInt9936;
		local108.anInt6905 = local93.anInt9937;
		label56: while (true) {
			@Pc(153) Class3_Sub50 local153 = (Class3_Sub50) local78.aClass357_9.method8392();
			if (local153 == null) {
				break;
			}
			if (local108.anInt6905 != local153.anInt9937) {
				local108.anInt6896 = local153.anInt9936;
				local108.anInt6890 = local153.anInt9937;
				while (true) {
					@Pc(184) Class3_Sub50 local184 = (Class3_Sub50) local78.aClass357_9.method8392();
					if (local184 == null) {
						break label56;
					}
					if (local108.anInt6905 != local184.anInt9937 && local184.anInt9937 != local108.anInt6890) {
						local108.anInt6897 = local184.anInt9937;
						local108.anInt6902 = local184.anInt9936;
					}
				}
			}
		}
		@Pc(238) int local238 = Static505.method7237(arg1, (arg0 << 9) + 256, (arg2 << 9) + 256);
		local108.anInt6904 = 0;
		local108.anInt11211 = arg0 << 9;
		local108.aByte145 = (byte) arg1;
		local108.anInt11208 = local238;
		local108.anInt11204 = arg2 << 9;
		local108.aByte146 = (byte) arg1;
		if (Static135.method2226(arg2, arg0)) {
			local108.aByte145++;
		}
		Static347.method2340(arg1, arg2, arg0, local238, local108);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(FIIFFFFF)F")
	public static float method7524(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg5 - arg6;
		@Pc(16) float local16 = arg4 - arg0;
		@Pc(20) float local20 = arg2 - arg3;
		@Pc(22) float local22 = 0.0F;
		@Pc(24) float local24 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(44) float local44 = arg6 + local7 * local12;
			@Pc(50) float local50 = local16 * local7 + arg0;
			@Pc(56) float local56 = local20 * local7 + arg3;
			@Pc(61) int local61 = (int) local44 >> 9;
			@Pc(66) int local66 = (int) local56 >> 9;
			if (local61 > 0 && local66 > 0 && local61 < Static362.anInt8653 && local66 < Static206.anInt11291) {
				@Pc(89) int local89 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146;
				if (local89 < 3 && (Static6.aByteArrayArrayArray1[1][local61][local66] & 0x2) != 0) {
					local89++;
				}
				@Pc(117) int local117 = Static167.aClass313Array1[local89].method9096((int) local44, (int) local56);
				if ((float) local117 < local50) {
					if (arg1 < 2) {
						return local7;
					}
					return local7 + method7524(local24, arg1 + -1, local56, local34, local50, local44, local22) * 0.1F - 0.1F;
				}
			}
			local24 = local50;
			local22 = local44;
			local7 += 0.1F;
			local34 = local56;
		}
		return -1.0F;
	}
}
