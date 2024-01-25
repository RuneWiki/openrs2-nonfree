import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_134 = new Class98(40, 10);

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("8b1388604eedbe953e057ac7a41bb8ba727ef3f12f43ca7d9fc7430fcd5ffe07dce0d4aef4faf510ce928692b8bbcd1c9c40630bebff4193e2b46c9d814abb69", 16);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
	public static int method6427(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[I[IB)V")
	public static void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg1; local55++) {
			if (arg3[local55] < (local55 & local53) + local20) {
				@Pc(70) int local70 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local70;
				@Pc(84) int local84 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local84;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method6428(arg0, local16 - 1, arg2, arg3);
		method6428(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	public static void method6436() {
		Static512.method7030(Static58.aClass6_Sub17_Sub1_1.anInt9291);
		@Pc(17) int local17 = (Static378.anInt6923 >> 12) + (Static150.anInt2792 >> 3);
		Static391.anInt7128 = Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 = 0;
		@Pc(30) int local30 = (Static208.anInt3949 >> 12) + (Static154.anInt2878 >> 3);
		Static461.aClass15_Sub2_Sub4_Sub2_2.method7146(8, 8);
		Static16.anIntArrayArray3 = new int[18][4];
		Static369.aByteArrayArray19 = new byte[18][];
		Static468.anIntArray577 = new int[18];
		Static287.aByteArrayArray13 = new byte[18][];
		Static185.anIntArray306 = new int[18];
		Static98.aByteArrayArray6 = new byte[18][];
		Static492.aByteArrayArray27 = new byte[18][];
		Static345.anIntArray457 = new int[18];
		Static401.anIntArray504 = new int[18];
		Static77.anIntArray115 = new int[18];
		Static187.anIntArray312 = new int[18];
		Static501.aByteArrayArray28 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(96) int local96;
		for (@Pc(85) int local85 = (local17 - (Static18.anInt5706 >> 4)) / 8; local85 <= ((Static18.anInt5706 >> 4) + local17) / 8; local85++) {
			for (local96 = (local30 - (Static80.anInt1367 >> 4)) / 8; local96 <= ((Static80.anInt1367 >> 4) + local30) / 8; local96++) {
				@Pc(104) int local104 = local96 + (local85 << 8);
				Static468.anIntArray577[local76] = local104;
				Static345.anIntArray457[local76] = Static88.aClass248_15.method5777("m" + local85 + "_" + local96);
				Static185.anIntArray306[local76] = Static88.aClass248_15.method5777("l" + local85 + "_" + local96);
				Static77.anIntArray115[local76] = Static88.aClass248_15.method5777("n" + local85 + "_" + local96);
				Static401.anIntArray504[local76] = Static88.aClass248_15.method5777("um" + local85 + "_" + local96);
				Static187.anIntArray312[local76] = Static88.aClass248_15.method5777("ul" + local85 + "_" + local96);
				if (Static77.anIntArray115[local76] == -1) {
					Static345.anIntArray457[local76] = -1;
					Static185.anIntArray306[local76] = -1;
					Static401.anIntArray504[local76] = -1;
					Static187.anIntArray312[local76] = -1;
				}
				local76++;
			}
		}
		for (local96 = local76; local96 < Static77.anIntArray115.length; local96++) {
			Static77.anIntArray115[local96] = -1;
			Static345.anIntArray457[local96] = -1;
			Static185.anIntArray306[local96] = -1;
			Static401.anIntArray504[local96] = -1;
			Static187.anIntArray312[local96] = -1;
		}
		@Pc(284) byte local284;
		if (Static375.anInt9162 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static424.method5985(local30, false, local17, local284);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIB)V")
	public static void method6439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg2 << 1;
		@Pc(46) int local46 = local29 + local21 * (1 - local37);
		@Pc(55) int local55 = local25 - (local37 - 1) * local33;
		@Pc(59) int local59 = local21 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg2 << 1) - 3);
		@Pc(85) int local85 = local63;
		Static264.method4006(arg3 + arg0, arg1, arg3 - arg0, Static155.anIntArrayArray32[arg4]);
		@Pc(105) int local105 = local59 * (arg2 - 1);
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local46 += local71;
					local55 += local85;
					local7++;
					local71 += local63;
					local85 += local63;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local71 += local63;
				local7++;
				local85 += local63;
			}
			local46 += -local105;
			local55 += -local79;
			local9--;
			local79 -= local59;
			local105 -= local59;
			@Pc(179) int local179 = arg4 - local9;
			@Pc(184) int local184 = arg4 + local9;
			@Pc(188) int local188 = local7 + arg3;
			@Pc(193) int local193 = arg3 - local7;
			Static264.method4006(local188, arg1, local193, Static155.anIntArrayArray32[local179]);
			Static264.method4006(local188, arg1, local193, Static155.anIntArrayArray32[local184]);
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(Z)[I")
	public static int[] method6441() {
		return new int[] { Static297.anInt5459, Static448.anInt7921, Static141.anInt2743 };
	}
}
