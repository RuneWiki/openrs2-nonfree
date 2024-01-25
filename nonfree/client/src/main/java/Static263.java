import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!fl;")
	public static Class116_Sub1 aClass116_Sub1_3;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
	public static final int[] anIntArray271 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_82 = new Class322(124, -1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!eea;Z)V")
	public static void method4528(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2469();
		@Pc(20) int local20;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static661.anInt10532; local12++) {
			local20 = Static591.anIntArray611[local12];
			if ((Static313.aByteArray52[local20] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static313.aByteArray52[local20] = (byte) (Static313.aByteArray52[local20] | 0x2);
				} else {
					local49 = arg0.method2468(1);
					if (local49 == 0) {
						local7 = Static519.method7509(arg0);
						Static313.aByteArray52[local20] = (byte) (Static313.aByteArray52[local20] | 0x2);
					} else {
						Static32.method422(local20, arg0);
					}
				}
			}
		}
		arg0.method2472();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2469();
		@Pc(138) int local138;
		for (local20 = 0; local20 < Static661.anInt10532; local20++) {
			local49 = Static591.anIntArray611[local20];
			if ((Static313.aByteArray52[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static313.aByteArray52[local49] = (byte) (Static313.aByteArray52[local49] | 0x2);
					local7--;
				} else {
					local138 = arg0.method2468(1);
					if (local138 == 0) {
						local7 = Static519.method7509(arg0);
						Static313.aByteArray52[local49] = (byte) (Static313.aByteArray52[local49] | 0x2);
					} else {
						Static32.method422(local49, arg0);
					}
				}
			}
		}
		arg0.method2472();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2469();
		@Pc(237) int local237;
		for (local49 = 0; local49 < Static215.anInt4264; local49++) {
			local138 = Static541.anIntArray602[local49];
			if ((Static313.aByteArray52[local138] & 0x1) != 0) {
				if (local7 > 0) {
					Static313.aByteArray52[local138] = (byte) (Static313.aByteArray52[local138] | 0x2);
					local7--;
				} else {
					local237 = arg0.method2468(1);
					if (local237 == 0) {
						local7 = Static519.method7509(arg0);
						Static313.aByteArray52[local138] = (byte) (Static313.aByteArray52[local138] | 0x2);
					} else if (Static511.method7381(arg0, local138)) {
						Static313.aByteArray52[local138] = (byte) (Static313.aByteArray52[local138] | 0x2);
					}
				}
			}
		}
		arg0.method2472();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2469();
		for (local138 = 0; local138 < Static215.anInt4264; local138++) {
			local237 = Static541.anIntArray602[local138];
			if ((Static313.aByteArray52[local237] & 0x1) == 0) {
				if (local7 > 0) {
					Static313.aByteArray52[local237] = (byte) (Static313.aByteArray52[local237] | 0x2);
					local7--;
				} else {
					@Pc(344) int local344 = arg0.method2468(1);
					if (local344 == 0) {
						local7 = Static519.method7509(arg0);
						Static313.aByteArray52[local237] = (byte) (Static313.aByteArray52[local237] | 0x2);
					} else if (Static511.method7381(arg0, local237)) {
						Static313.aByteArray52[local237] = (byte) (Static313.aByteArray52[local237] | 0x2);
					}
				}
			}
		}
		arg0.method2472();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static661.anInt10532 = 0;
		Static215.anInt4264 = 0;
		for (local237 = 1; local237 < 2048; local237++) {
			Static313.aByteArray52[local237] = (byte) (Static313.aByteArray52[local237] >> 1);
			@Pc(435) Class60_Sub1_Sub1_Sub3_Sub1 local435 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local237];
			if (local435 == null) {
				Static541.anIntArray602[Static215.anInt4264++] = local237;
			} else {
				Static591.anIntArray611[Static661.anInt10532++] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method4529(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static510.aBoolean717) {
			try {
				@Pc(25) Class56 local25 = (Class56) Class.forName("cha").getDeclaredConstructor().newInstance();
				local25.method974(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static510.aBoolean717 = true;
			}
		}
		return arg0;
	}
}
