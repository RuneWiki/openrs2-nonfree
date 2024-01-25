import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gda", name = "X", descriptor = "[J")
	public static final long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!gda", name = "Y", descriptor = "I")
	public static int anInt2895 = -1;

	@OriginalMember(owner = "client!gda", name = "Z", descriptor = "[Lclient!hr;")
	public static final Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array4 = new Class1_Sub1_Sub6[14];

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V")
	public static void method2461() {
		Static404.aClass39_7.method4915();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static80.aLongArray4[local12] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static119.aLongArray10[local24] = 0L;
		}
		Static263.anInt5057 = 0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)Z")
	public static boolean method2464(@OriginalArg(1) int arg0) {
		return arg0 == 18 || arg0 == 2 || arg0 == 1009 || arg0 == 4 || arg0 == 3;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!ge;I)Lclient!eba;")
	public static Class10_Sub2 method2465(@OriginalArg(0) Class1_Sub6 arg0) {
		return new Class10_Sub2(arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3920(), arg0.method3922());
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!jj;II)Z")
	public static boolean method2466(@OriginalArg(0) Class1_Sub6_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0.method3976(2);
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(110) int local110;
		@Pc(114) int local114;
		@Pc(120) int local120;
		if (local13 == 0) {
			if (arg0.method3976(1) != 0) {
				method2466(arg0, arg1);
			}
			local36 = arg0.method3976(6);
			local41 = arg0.method3976(6);
			@Pc(51) boolean local51 = arg0.method3976(1) == 1;
			if (local51) {
				Static384.anIntArray679[Static103.anInt2066++] = arg1;
			}
			if (Static349.aClass49_Sub2_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(74) Class210 local74 = Static534.aClass210Array1[arg1];
			@Pc(82) Class49_Sub2_Sub2_Sub1 local82 = Static349.aClass49_Sub2_Sub2_Sub1Array1[arg1] = new Class49_Sub2_Sub2_Sub1();
			local82.anInt4295 = arg1;
			if (Static243.aClass1_Sub6Array1[arg1] != null) {
				local82.method1533(Static243.aClass1_Sub6Array1[arg1]);
			}
			local82.method3784(local74.anInt6010, true);
			local82.anInt4323 = local74.anInt6012;
			local110 = local74.anInt6009;
			local114 = local110 >> 28;
			local120 = local110 >> 14 & 0xFF;
			local82.aBoolean111 = local74.aBoolean433;
			@Pc(128) int local128 = local110 & 0xFF;
			local82.aByteArray64[0] = Static166.aByteArray44[arg1];
			local82.aByte98 = (byte) local114;
			local82.method1540(local36 + (local120 << 6) - Static470.anInt7897, -Static534.anInt9007 + local41 + (local128 << 6));
			local82.aBoolean112 = false;
			Static534.aClass210Array1[arg1] = null;
			return true;
		} else if (local13 == 1) {
			local36 = arg0.method3976(2);
			local41 = Static534.aClass210Array1[arg1].anInt6009;
			Static534.aClass210Array1[arg1].anInt6009 = (local41 & 0xFFFFFFF) + (((local41 >> 28) + local36 & 0x3) << 28);
			return false;
		} else {
			@Pc(218) int local218;
			@Pc(223) int local223;
			@Pc(231) int local231;
			if (local13 != 2) {
				local36 = arg0.method3976(18);
				local41 = local36 >> 16;
				local218 = local36 >> 8 & 0xFF;
				local223 = local36 & 0xFF;
				local231 = Static534.aClass210Array1[arg1].anInt6009;
				local110 = local41 + (local231 >> 28) & 0x3;
				local114 = local218 + (local231 >> 14) & 0xFF;
				local120 = local231 + local223 & 0xFF;
				Static534.aClass210Array1[arg1].anInt6009 = local120 + (local110 << 28) + (local114 << 14);
				return false;
			}
			local36 = arg0.method3976(5);
			local41 = local36 >> 3;
			local218 = local36 & 0x7;
			local223 = Static534.aClass210Array1[arg1].anInt6009;
			local231 = local41 + (local223 >> 28) & 0x3;
			local110 = local223 >> 14 & 0xFF;
			local114 = local223 & 0xFF;
			if (local218 == 0) {
				local114--;
				local110--;
			}
			if (local218 == 1) {
				local114--;
			}
			if (local218 == 2) {
				local110++;
				local114--;
			}
			if (local218 == 3) {
				local110--;
			}
			if (local218 == 4) {
				local110++;
			}
			if (local218 == 5) {
				local114++;
				local110--;
			}
			if (local218 == 6) {
				local114++;
			}
			if (local218 == 7) {
				local114++;
				local110++;
			}
			Static534.aClass210Array1[arg1].anInt6009 = local114 + (local110 << 14) + (local231 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fu;")
	public static Class49_Sub2 method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class63 local14 = local7.aClass63_3; local14 != null; local14 = local14.aClass63_1) {
			@Pc(18) Class49_Sub2 local18 = local14.aClass49_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort117 == arg1 && local18.aShort116 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([[BLclient!jda;B)V")
	public static void method2468(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class149_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class1_Sub6 local35 = new Class1_Sub6(local28);
				local41 = Static9.anIntArray23[local22] >> 8;
				@Pc(47) int local47 = Static9.anIntArray23[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static470.anInt7897;
				@Pc(60) int local60 = local47 * 64 - Static534.anInt9007;
				Static63.method1142();
				arg1.method3872(Static470.anInt7897, Static534.anInt9007, local35, local60, local54, Static86.aClass91Array1);
				arg1.method3877(local17, Static513.aClass122_10, local35, local54, local60);
				if (!arg1.aBoolean310 && Static460.anInt7803 / 8 == local41 && Static212.anInt4105 / 8 == local47 && local17[0] != -1) {
					Static40.aClass117_1 = Static335.aClass41_1.method1031(local17[3], local17[0], Static482.aClass82_1, local17[2], local17[1]);
					Static101.anInt7613 = local17[4];
				}
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local20; local137++) {
			@Pc(150) int local150 = (Static9.anIntArray23[local137] >> 8) * 64 - Static470.anInt7897;
			local41 = (Static9.anIntArray23[local137] & 0xFF) * 64 - Static534.anInt9007;
			@Pc(165) byte[] local165 = arg0[local137];
			if (local165 == null && Static212.anInt4105 < 800) {
				Static63.method1142();
				arg1.method3869(local150, local41);
			}
		}
	}
}
