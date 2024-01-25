import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public static int anInt8005;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public static int anInt8006;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!so;")
	public static final Class314 aClass314_11 = new Class314(13, -1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ig;)Lclient!go;")
	public static Class6_Sub2_Sub1 method6636(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(9) Class6_Sub2 local9 = Static506.method7324(arg0);
		@Pc(13) int local13 = arg0.method8568();
		return new Class6_Sub2_Sub1(local9.aClass173_14, local9.aClass60_13, local9.anInt10332, local9.anInt10334, local9.anInt10335, local9.anInt10336, local9.anInt10339, local9.anInt10342, local9.anInt10337, local9.anInt4302, local9.anInt4299, local9.anInt4296, local9.anInt4298, local9.anInt4293, local9.anInt4300, local13);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ha;IILclient!tp;IIILclient!aa;)V")
	public static void method6637(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class331 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(10) Class17 local10 = Static612.aClass12_4.method136(arg2);
		if (local10 == null || !local10.aBoolean73 || !local10.method764(Static420.aClass77_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray17 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray17.length];
			@Pc(40) int local40;
			@Pc(53) int local53;
			@Pc(57) int local57;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (anInt8005 == 4) {
					local40 = (int) Static499.aFloat185 & 0x3FFF;
				} else {
					local40 = (int) Static499.aFloat185 + Static642.anInt10689 & 0x3FFF;
				}
				local53 = Class344.anIntArray579[local40];
				local57 = Class344.anIntArray578[local40];
				if (anInt8005 != 4) {
					local53 = local53 * 256 / (Static423.anInt7961 + 256);
					local57 = local57 * 256 / (Static423.anInt7961 + 256);
				}
				local28[local30 * 2] = (local57 * (arg0 + local10.anIntArray17[local30 * 2] * 4) + local53 * (local10.anIntArray17[local30 * 2 + 1] * 4 + arg5) >> 14) + arg3 + arg4.anInt9553 / 2;
				local28[local30 * 2 + 1] = arg6 + arg4.anInt9505 / 2 - ((local10.anIntArray17[local30 * 2 + 1] * 4 + arg5) * local57 - (local10.anIntArray17[local30 * 2] * 4 + arg0) * local53 >> 14);
			}
			Static463.method6961(arg1, local28, local10.anInt785, arg4.anIntArray519, arg4.anIntArray525);
			if (local10.anInt805 <= 0) {
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					arg1.method6058(local28[local40 * 2], local28[local40 * 2 + 1], local28[(local40 + 1) * 2], local28[(local40 + 1) * 2 + 1], local10.anIntArray18[local10.aByteArray3[local40] & 0xFF], arg7, arg3, arg6);
				}
				arg1.method6058(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anIntArray18[local10.aByteArray3[local10.aByteArray3.length - 1] & 0xFF], arg7, arg3, arg6);
			} else {
				@Pc(301) int local301;
				@Pc(309) int local309;
				@Pc(332) int local332;
				@Pc(344) int local344;
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					local53 = local28[local40 * 2];
					local57 = local28[local40 * 2 + 1];
					local301 = local28[(local40 + 1) * 2];
					local309 = local28[local40 * 2 + 3];
					if (local53 > local301) {
						local332 = local53;
						local53 = local301;
						local344 = local57;
						local57 = local309;
						local301 = local332;
						local309 = local344;
					} else if (local301 == local53 && local309 < local57) {
						local332 = local57;
						local57 = local309;
						local309 = local332;
					}
					arg1.method6113(local53, local57, local301, local309, local10.anIntArray18[local10.aByteArray3[local40] & 0xFF], arg7, arg3, arg6, local10.anInt805, local10.anInt781, local10.anInt787);
				}
				local53 = local28[local28.length - 2];
				local57 = local28[local28.length - 1];
				local301 = local28[0];
				local309 = local28[1];
				if (local301 < local53) {
					local332 = local53;
					local53 = local301;
					local344 = local57;
					local57 = local309;
					local301 = local332;
					local309 = local344;
				} else if (local301 == local53 && local57 > local309) {
					local332 = local57;
					local57 = local309;
					local309 = local332;
				}
				arg1.method6113(local53, local57, local301, local309, local10.anIntArray18[local10.aByteArray3[local10.aByteArray3.length - 1] & 0xFF], arg7, arg3, arg6, local10.anInt805, local10.anInt781, local10.anInt787);
			}
		}
		@Pc(466) Class21 local466 = null;
		if (local10.anInt783 != -1) {
			local466 = local10.method760(arg1, false);
			if (local466 != null) {
				Static605.method7726(arg0, arg4, arg6, arg3, arg5, arg7, local466);
			}
		}
		if (local10.aString8 == null) {
			return;
		}
		local30 = 0;
		if (local466 != null) {
			local30 = local466.method5783();
		}
		@Pc(500) Class27 local500 = Static87.aClass27_21;
		@Pc(502) Class345 local502 = Static184.aClass345_9;
		if (local10.anInt802 == 1) {
			local502 = Static446.aClass345_13;
			local500 = Static634.aClass27_19;
		}
		if (local10.anInt802 == 2) {
			local502 = Static469.aClass345_15;
			local500 = Static206.aClass27_20;
		}
		Static600.method8258(local10.anInt804, arg4, arg7, arg3, local30, local502, arg6, local10.aString8, arg5, arg0, local500);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method6639(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static600.anInt10226;
		@Pc(12) int local12 = Static261.anInt5609;
		if (arg0 && Static183.aBoolean308) {
			local10 <<= 0x1;
			local12 = -local10;
		}
		Static171.aClass16_5.f(local12, local10);
	}
}
