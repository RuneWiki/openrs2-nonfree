import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lk", name = "tb", descriptor = "J")
	public static long aLong133;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "[I")
	public static final int[] anIntArray273 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
	public static int anInt4096 = -1;

	@OriginalMember(owner = "client!lk", name = "nb", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_114 = new Class12(25, 11);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wk;I)V")
	public static void method3334(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub5_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt4285 > Static236.anInt4213) {
			Static3.method4556(arg1);
		} else if (Static236.anInt4213 > arg1.anInt4244) {
			Static286.method3943(false, arg1);
			local9 = Static289.anInt5060;
			local7 = Static428.anInt7227;
		} else {
			Static114.method1806(arg1);
		}
		if (arg1.anInt5518 < 128 || arg1.anInt5514 < 128 || arg1.anInt5518 >= (Static296.anInt5187 - 1) * 128 || arg1.anInt5514 >= (Static206.anInt3607 - 1) * 128) {
			arg1.anInt4270 = -1;
			local7 = -1;
			arg1.anInt4283 = -1;
			local9 = 0;
			arg1.anInt4244 = 0;
			arg1.anInt4285 = 0;
			arg1.anInt4267 = -1;
			arg1.anInt5518 = arg1.anIntArray283[0] * 128 + arg1.method3427() * 64;
			arg1.anInt5514 = arg1.anIntArray284[0] * 128 + arg1.method3427() * 64;
			arg1.method3429();
		}
		if (arg1 == Static447.aClass25_Sub5_Sub1_Sub2_4 && (arg1.anInt5518 < 1536 || arg1.anInt5514 < 1536 || Static296.anInt5187 * 128 - 1536 <= arg1.anInt5518 || (Static206.anInt3607 - 12) * 128 <= arg1.anInt5514)) {
			arg1.anInt4244 = 0;
			arg1.anInt4270 = -1;
			local9 = 0;
			arg1.anInt4267 = -1;
			arg1.anInt4283 = -1;
			local7 = -1;
			arg1.anInt4285 = 0;
			arg1.anInt5518 = arg1.anIntArray283[0] * 128 + arg1.method3427() * 64;
			arg1.anInt5514 = arg1.anIntArray284[0] * 128 + arg1.method3427() * 64;
			arg1.method3429();
		}
		@Pc(207) int local207 = Static426.method5638(arg1);
		Static312.method4242(arg1, local9, local207, local7);
		Static169.method2395(arg1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3338(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(arg1.length() + local14);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method3339() {
		@Pc(9) int local9 = Static336.aClass1_Sub28_Sub1_2.method5363();
		@Pc(13) int local13 = Static336.aClass1_Sub28_Sub1_2.method5336();
		Static226.anInt4010 = Static336.aClass1_Sub28_Sub1_2.method5363();
		@Pc(28) boolean local28 = Static336.aClass1_Sub28_Sub1_2.method5390() == 1;
		@Pc(32) int local32 = Static336.aClass1_Sub28_Sub1_2.method5375();
		Static392.method5127(local9);
		Static336.aClass1_Sub28_Sub1_2.method3077();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static296.anInt5187 >> 3; local44++) {
				for (local48 = 0; local48 < Static206.anInt3607 >> 3; local48++) {
					local55 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
					if (local55 == 1) {
						Static166.anIntArrayArrayArray2[local40][local44][local48] = Static336.aClass1_Sub28_Sub1_2.method3084(26);
					} else {
						Static166.anIntArrayArrayArray2[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static336.aClass1_Sub28_Sub1_2.method3083();
		local44 = (Static245.anInt4432 - Static336.aClass1_Sub28_Sub1_2.anInt6812) / 16;
		Static337.anIntArrayArray50 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static337.anIntArrayArray50[local48][local55] = Static336.aClass1_Sub28_Sub1_2.method5355();
			}
		}
		Static118.anIntArray145 = new int[local44];
		Static266.aByteArrayArray18 = new byte[local44][];
		Static208.anIntArray226 = null;
		Static163.aByteArrayArray24 = new byte[local44][];
		Static385.anIntArray429 = new int[local44];
		Static139.anIntArray166 = new int[local44];
		Static354.anIntArray417 = new int[local44];
		Static333.aByteArrayArray22 = new byte[local44][];
		Static248.anIntArray298 = new int[local44];
		Static407.aByteArrayArray29 = new byte[local44][];
		Static151.aByteArrayArray9 = null;
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(180) int local180 = 0; local180 < Static296.anInt5187 >> 3; local180++) {
				for (@Pc(184) int local184 = 0; local184 < Static206.anInt3607 >> 3; local184++) {
					@Pc(194) int local194 = Static166.anIntArrayArrayArray2[local55][local180][local184];
					if (local194 != -1) {
						@Pc(204) int local204 = local194 >> 14 & 0x3FF;
						@Pc(210) int local210 = local194 >> 3 & 0x7FF;
						@Pc(220) int local220 = local210 / 8 + (local204 / 8 << 8);
						for (@Pc(222) int local222 = 0; local222 < local44; local222++) {
							if (Static248.anIntArray298[local222] == local220) {
								local220 = -1;
								break;
							}
						}
						if (local220 != -1) {
							Static248.anIntArray298[local44] = local220;
							@Pc(254) int local254 = local220 >> 8 & 0xFF;
							@Pc(258) int local258 = local220 & 0xFF;
							Static139.anIntArray166[local44] = Static206.aClass82_50.method1835("m" + local254 + "_" + local258);
							Static118.anIntArray145[local44] = Static206.aClass82_50.method1835("l" + local254 + "_" + local258);
							Static354.anIntArray417[local44] = Static206.aClass82_50.method1835("um" + local254 + "_" + local258);
							Static385.anIntArray429[local44] = Static206.aClass82_50.method1835("ul" + local254 + "_" + local258);
							local44++;
						}
					}
				}
			}
		}
		Static56.method981(10, local13, local28, local32);
	}
}
