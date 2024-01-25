import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public static int anInt3225;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public static int anInt3226;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!vh;")
	public static Class250 aClass250_40;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	public static int anInt3236;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "[Lclient!tl;")
	public static Class226[] aClass226Array1;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "[I")
	public static final int[] anIntArray273 = new int[4096];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!tr;)Z")
	public static boolean method2763(@OriginalArg(1) Class231 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean443) {
			return false;
		} else if (!arg0.method5358(Static7.anInterface12_2)) {
			return false;
		} else if (Static114.aClass27_16.method553((long) arg0.anInt6840) == null) {
			return Static442.aClass27_30.method553((long) arg0.anInt6858) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Lclient!vq;")
	public static Class196_Sub1 method2767() {
		return Static412.aClass196_Sub1Array2.length > Static78.anInt1546 ? Static412.aClass196_Sub1Array2[Static78.anInt1546++] : null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!a;B)V")
	public static void method2768(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method144();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static187.anInt4913; local12++) {
			local18 = Static256.anIntArray370[local12];
			if ((Static291.aByteArray67[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static291.aByteArray67[local18] = (byte) (Static291.aByteArray67[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method146(1);
					if (local46 == 0) {
						local7 = Static420.method5636(arg0);
						Static291.aByteArray67[local18] = (byte) (Static291.aByteArray67[local18] | 0x2);
					} else {
						Static14.method306(arg0, local18);
					}
				}
			}
		}
		arg0.method148();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method144();
		@Pc(136) int local136;
		for (local18 = 0; local18 < Static187.anInt4913; local18++) {
			local46 = Static256.anIntArray370[local18];
			if ((Static291.aByteArray67[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static291.aByteArray67[local46] = (byte) (Static291.aByteArray67[local46] | 0x2);
				} else {
					local136 = arg0.method146(1);
					if (local136 == 0) {
						local7 = Static420.method5636(arg0);
						Static291.aByteArray67[local46] = (byte) (Static291.aByteArray67[local46] | 0x2);
					} else {
						Static14.method306(arg0, local46);
					}
				}
			}
		}
		arg0.method148();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method144();
		@Pc(216) int local216;
		for (local46 = 0; local46 < Static288.anInt5040; local46++) {
			local136 = Static122.anIntArray196[local46];
			if ((Static291.aByteArray67[local136] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static291.aByteArray67[local136] = (byte) (Static291.aByteArray67[local136] | 0x2);
				} else {
					local216 = arg0.method146(1);
					if (local216 == 0) {
						local7 = Static420.method5636(arg0);
						Static291.aByteArray67[local136] = (byte) (Static291.aByteArray67[local136] | 0x2);
					} else if (Static313.method4476(local136, arg0)) {
						Static291.aByteArray67[local136] = (byte) (Static291.aByteArray67[local136] | 0x2);
					}
				}
			}
		}
		arg0.method148();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method144();
		for (local136 = 0; local136 < Static288.anInt5040; local136++) {
			local216 = Static122.anIntArray196[local136];
			if ((Static291.aByteArray67[local216] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static291.aByteArray67[local216] = (byte) (Static291.aByteArray67[local216] | 0x2);
				} else {
					@Pc(307) int local307 = arg0.method146(1);
					if (local307 == 0) {
						local7 = Static420.method5636(arg0);
						Static291.aByteArray67[local216] = (byte) (Static291.aByteArray67[local216] | 0x2);
					} else if (Static313.method4476(local216, arg0)) {
						Static291.aByteArray67[local216] = (byte) (Static291.aByteArray67[local216] | 0x2);
					}
				}
			}
		}
		arg0.method148();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static288.anInt5040 = 0;
		Static187.anInt4913 = 0;
		for (local216 = 1; local216 < 2048; local216++) {
			Static291.aByteArray67[local216] = (byte) (Static291.aByteArray67[local216] >> 1);
			@Pc(375) Class26_Sub2_Sub2_Sub1 local375 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local216];
			if (local375 == null) {
				Static122.anIntArray196[Static288.anInt5040++] = local216;
			} else {
				Static256.anIntArray370[Static187.anInt4913++] = local216;
			}
		}
	}
}
