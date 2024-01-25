import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	public static int anInt3623;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public static void method3034() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static449.aBoolean538) {
			local9 = 4096;
			if (Static612.aBoolean725) {
				local7 = 2048;
			}
		}
		if ((float) local7 > Static339.aFloat100) {
			Static339.aFloat100 = local7;
		}
		if (Static339.aFloat100 > (float) local9) {
			Static339.aFloat100 = local9;
		}
		while (Static440.aFloat144 >= 16384.0F) {
			Static440.aFloat144 -= 16384.0F;
		}
		while (Static440.aFloat144 < 0.0F) {
			Static440.aFloat144 += 16384.0F;
		}
		@Pc(57) int local57 = Static203.anInt3426 >> 9;
		@Pc(61) int local61 = Static263.anInt4236 >> 9;
		@Pc(67) int local67 = Static504.method6917(Static203.anInt3426, Static91.anInt1705, Static263.anInt4236);
		@Pc(69) int local69 = 0;
		@Pc(95) int local95;
		if (local57 > 3 && local61 > 3 && Static228.anInt3704 - 4 > local57 && Static162.anInt2911 - 4 > local61) {
			for (local95 = local57 - 4; local95 <= local57 + 4; local95++) {
				for (@Pc(101) int local101 = local61 - 4; local101 <= local61 + 4; local101++) {
					@Pc(105) int local105 = Static91.anInt1705;
					if (local105 < 3 && Static181.method2642(local101, local95)) {
						local105++;
					}
					@Pc(118) int local118 = 0;
					if (Static365.aClass275_Sub1_2.aByteArrayArrayArray17 != null && Static365.aClass275_Sub1_2.aByteArrayArrayArray17[local105] != null) {
						local118 = (Static365.aClass275_Sub1_2.aByteArrayArrayArray17[local105][local95][local101] & 0xFF) * 8 << 2;
					}
					if (Static314.aClass76Array2 != null && Static314.aClass76Array2[local105] != null) {
						@Pc(160) int local160 = local118 + local67 - Static314.aClass76Array2[local105].method7396(local101, local95);
						if (local160 > local69) {
							local69 = local160;
						}
					}
				}
			}
		}
		local95 = (local69 >> 2) * 1536;
		if (local95 > 786432) {
			local95 = 786432;
		}
		if (local95 < 262144) {
			local95 = 262144;
		}
		if (Static167.anInt2956 < local95) {
			Static167.anInt2956 += (local95 - Static167.anInt2956) / 24;
		} else if (local95 < Static167.anInt2956) {
			Static167.anInt2956 += (local95 - Static167.anInt2956) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public static void method3035(@OriginalArg(0) int arg0) {
		if (arg0 == Static612.anInt9862) {
			return;
		}
		Static228.anInt3704 = Static162.anInt2911 = Static393.anIntArray461[arg0];
		Static130.method1833();
		Static37.anIntArrayArrayArray1 = new int[4][Static228.anInt3704 >> 3][Static162.anInt2911 >> 3];
		Static559.anIntArrayArray63 = new int[Static228.anInt3704][Static162.anInt2911];
		Static544.anIntArrayArray65 = new int[Static228.anInt3704][Static162.anInt2911];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static230.aClass240Array1[local40] = Static353.method4721(Static162.anInt2911, Static228.anInt3704);
		}
		Static148.aByteArrayArrayArray4 = new byte[4][Static228.anInt3704][Static162.anInt2911];
		Static437.method5997(Static228.anInt3704, Static162.anInt2911);
		Static66.method8416(Static192.aClass95_4, Static228.anInt3704 >> 3, Static162.anInt2911 >> 3);
		Static612.anInt9862 = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!kha;IILclient!am;IILclient!kc;)V")
	public static void method3036(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class13_Sub1_Sub1_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class13_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(19) Class2_Sub33 local19 = new Class2_Sub33();
		local19.anInt5988 = arg0 << 9;
		local19.anInt5981 = arg2;
		local19.anInt5974 = arg4 << 9;
		if (arg1 != null) {
			local19.aClass191_1 = arg1;
			@Pc(168) int local168 = arg1.anInt4814;
			@Pc(171) int local171 = arg1.anInt4817;
			if (arg5 == 1 || arg5 == 3) {
				local168 = arg1.anInt4817;
				local171 = arg1.anInt4814;
			}
			local19.aBoolean435 = arg1.aBoolean337;
			local19.anInt5984 = arg1.lb;
			local19.anInt5978 = arg1.anInt4783;
			local19.anIntArray438 = arg1.anIntArray321;
			local19.anInt5976 = arg1.anInt4785;
			local19.aBoolean433 = arg1.aBoolean348;
			local19.anInt5987 = arg4 + local168 << 9;
			local19.anInt5975 = arg1.anInt4825;
			local19.anInt5989 = arg1.anInt4811;
			local19.anInt5973 = arg1.anInt4778 << 9;
			local19.anInt5979 = arg1.anInt4787;
			local19.anInt5985 = local171 + arg0 << 9;
			if (arg1.anIntArray323 != null) {
				local19.aBoolean434 = true;
				local19.method5117();
			}
			if (local19.anIntArray438 != null) {
				local19.anInt5990 = local19.anInt5975 + (int) (Math.random() * (double) (local19.anInt5989 - local19.anInt5975));
			}
			Static371.aClass109_36.method2323(local19);
			return;
		}
		if (arg3 != null) {
			local19.aClass13_Sub1_Sub1_Sub1_Sub1_1 = arg3;
			@Pc(42) Class150 local42 = arg3.aClass150_1;
			if (local42.anIntArray262 != null) {
				local19.aBoolean434 = true;
				local42 = local42.method3196(Static431.aClass205_1);
			}
			if (local42 != null) {
				local19.anInt5985 = arg0 + local42.anInt3793 << 9;
				local19.anInt5987 = arg4 + local42.anInt3793 << 9;
				local19.anInt5976 = Static15.method228(arg3);
				local19.anInt5973 = local42.anInt3780 << 9;
				local19.anInt5979 = local42.anInt3815;
				local19.aBoolean433 = local42.aBoolean274;
				local19.anInt5984 = local42.anInt3805;
				local19.anInt5978 = local42.anInt3811;
			}
			Static164.aClass109_27.method2323(local19);
			return;
		}
		if (arg6 == null) {
			return;
		}
		local19.aClass13_Sub1_Sub1_Sub1_Sub2_2 = arg6;
		local19.anInt5987 = arg6.method3950() + arg4 << 9;
		local19.anInt5985 = arg0 + arg6.method3950() << 9;
		local19.anInt5976 = Static210.method2941(arg6);
		local19.aBoolean433 = arg6.aBoolean324;
		local19.anInt5978 = 256;
		local19.anInt5973 = arg6.anInt4674 << 9;
		local19.anInt5984 = arg6.anInt4642;
		local19.anInt5979 = 256;
		Static221.aClass118_18.method2601(local19, (long) arg6.anInt4582);
		return;
	}
}
