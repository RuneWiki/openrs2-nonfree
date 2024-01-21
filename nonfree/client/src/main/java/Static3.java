import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!si;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public static int anInt138;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "D")
	public static double aDouble4 = -1.0D;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!vb;Z)V")
	public static void method94(@OriginalArg(0) Class2_Sub25 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt4166 == 0) {
			local5 = Static77.method2472(arg0.anInt4159, arg0.anInt4168, arg0.anInt4163);
		}
		if (arg0.anInt4166 == 1) {
			local5 = Static179.method2595(arg0.anInt4159, arg0.anInt4168, arg0.anInt4163);
		}
		if (arg0.anInt4166 == 2) {
			local5 = Static47.method728(arg0.anInt4159, arg0.anInt4168, arg0.anInt4163);
		}
		@Pc(49) int local49 = -1;
		if (arg0.anInt4166 == 3) {
			local5 = Static59.method819(arg0.anInt4159, arg0.anInt4168, arg0.anInt4163);
		}
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (local5 != 0L) {
			local65 = (int) local5 >> 20 & 0x3;
			local49 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local67 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt4160 = local49;
		arg0.anInt4164 = local65;
		arg0.anInt4158 = local67;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ii;)I")
	public static int method95(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		if (arg1.anIntArrayArray16 == null || arg0 >= arg1.anIntArrayArray16.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray16[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local24[local31++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local33;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 1) {
					local42 = Static54.anIntArray88[local24[local31++]];
				}
				if (local40 == 2) {
					local42 = Static184.anIntArray195[local24[local31++]];
				}
				if (local40 == 3) {
					local42 = Static176.anIntArray323[local24[local31++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(116) int local116;
				@Pc(127) Class47 local127;
				@Pc(132) int local132;
				@Pc(145) int local145;
				if (local40 == 4) {
					local116 = local24[local31++] << 16;
					@Pc(123) int local123 = local116 + local24[local31++];
					local127 = Static143.method2159(local123);
					local132 = local24[local31++];
					if (local132 != -1 && (!Static52.method774(local132).aBoolean194 || Static36.aBoolean36)) {
						for (local145 = 0; local145 < local127.anIntArray169.length; local145++) {
							if (local132 + 1 == local127.anIntArray169[local145]) {
								local42 += local127.anIntArray166[local145];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static71.anIntArray123[local24[local31++]];
				}
				if (local40 == 6) {
					local42 = Class71_Sub1.anIntArray270[Static184.anIntArray195[local24[local31++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static71.anIntArray123[local24[local31++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static186.aClass7_Sub2_Sub2_1.anInt3117;
				}
				if (local40 == 9) {
					for (local116 = 0; local116 < 25; local116++) {
						if (Static42.aBooleanArray24[local116]) {
							local42 += Static184.anIntArray195[local116];
						}
					}
				}
				if (local40 == 10) {
					local116 = local24[local31++] << 16;
					local116 += local24[local31++];
					local127 = Static143.method2159(local116);
					local132 = local24[local31++];
					if (local132 != -1 && (!Static52.method774(local132).aBoolean194 || Static36.aBoolean36)) {
						for (local145 = 0; local145 < local127.anIntArray169.length; local145++) {
							if (local127.anIntArray169[local145] == local132 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static51.anInt1099;
				}
				if (local40 == 12) {
					local42 = Static193.anInt4004;
				}
				if (local40 == 13) {
					local116 = Static71.anIntArray123[local24[local31++]];
					@Pc(341) int local341 = local24[local31++];
					local42 = (local116 & 0x1 << local341) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local116 = local24[local31++];
					local42 = Static88.method1238(local116);
				}
				if (local40 == 18) {
					local42 = (Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7) + Static116.anInt2535;
				}
				if (local40 == 19) {
					local42 = (Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7) + Static153.anInt3278;
				}
				if (local40 == 20) {
					local42 = local24[local31++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local33 += local42;
					}
					if (local35 == 1) {
						local33 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local33 /= local42;
					}
					if (local35 == 3) {
						local33 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(445) Exception local445) {
			return -1;
		}
	}
}
