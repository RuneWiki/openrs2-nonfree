import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!sh;")
	public static Class213 aClass213_17;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public static int anInt5903;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
	public static int anInt5907;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "Lclient!b;")
	public static Class20 aClass20_92;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
	public static int anInt5905 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ck;II)V")
	public static void method5279(@OriginalArg(0) Class3_Sub5_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method859(1) == 1;
		if (local17) {
			Static231.anIntArray441[Static20.anInt242++] = arg1;
		}
		@Pc(32) int local32 = arg0.method859(2);
		@Pc(36) Class28_Sub1_Sub1_Sub2 local36 = Static308.aClass28_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(152) int local152;
			if (local32 == 1) {
				local142 = arg0.method859(3);
				local147 = local36.anIntArray491[0];
				local152 = local36.anIntArray490[0];
				if (local142 == 0) {
					local152--;
					local147--;
				} else if (local142 == 1) {
					local152--;
				} else if (local142 == 2) {
					local147++;
					local152--;
				} else if (local142 == 3) {
					local147--;
				} else if (local142 == 4) {
					local147++;
				} else if (local142 == 5) {
					local147--;
					local152++;
				} else if (local142 == 6) {
					local152++;
				} else if (local142 == 7) {
					local147++;
					local152++;
				}
				if (local17) {
					local36.anInt4397 = local147;
					local36.aBoolean343 = true;
					local36.anInt4390 = local152;
				} else {
					local36.method4025(local147, local152, Static338.aByteArray81[arg1]);
				}
			} else if (local32 == 2) {
				local142 = arg0.method859(4);
				local147 = local36.anIntArray491[0];
				local152 = local36.anIntArray490[0];
				if (local142 == 0) {
					local147 -= 2;
					local152 -= 2;
				} else if (local142 == 1) {
					local152 -= 2;
					local147--;
				} else if (local142 == 2) {
					local152 -= 2;
				} else if (local142 == 3) {
					local147++;
					local152 -= 2;
				} else if (local142 == 4) {
					local147 += 2;
					local152 -= 2;
				} else if (local142 == 5) {
					local152--;
					local147 -= 2;
				} else if (local142 == 6) {
					local152--;
					local147 += 2;
				} else if (local142 == 7) {
					local147 -= 2;
				} else if (local142 == 8) {
					local147 += 2;
				} else if (local142 == 9) {
					local147 -= 2;
					local152++;
				} else if (local142 == 10) {
					local147 += 2;
					local152++;
				} else if (local142 == 11) {
					local152 += 2;
					local147 -= 2;
				} else if (local142 == 12) {
					local152 += 2;
					local147--;
				} else if (local142 == 13) {
					local152 += 2;
				} else if (local142 == 14) {
					local152 += 2;
					local147++;
				} else if (local142 == 15) {
					local147 += 2;
					local152 += 2;
				}
				if (local17) {
					local36.anInt4397 = local147;
					local36.aBoolean343 = true;
					local36.anInt4390 = local152;
				} else {
					local36.method4025(local147, local152, Static338.aByteArray81[arg1]);
				}
			} else {
				local142 = arg0.method859(1);
				@Pc(405) int local405;
				@Pc(413) int local413;
				@Pc(426) int local426;
				@Pc(433) int local433;
				if (local142 == 0) {
					local147 = arg0.method859(12);
					local152 = local147 >> 10;
					local405 = local147 >> 5 & 0x1F;
					if (local405 > 15) {
						local405 -= 32;
					}
					local413 = local147 & 0x1F;
					if (local413 > 15) {
						local413 -= 32;
					}
					local426 = local405 + local36.anIntArray491[0];
					local433 = local413 + local36.anIntArray490[0];
					if (local17) {
						local36.anInt4390 = local433;
						local36.aBoolean343 = true;
						local36.anInt4397 = local426;
					} else {
						local36.method4025(local426, local433, Static338.aByteArray81[arg1]);
					}
					local36.aByte73 = (byte) (local152 + local36.aByte73 & 0x3);
					if (arg1 == Static376.anInt6265) {
						Static363.anInt6170 = local36.aByte73;
					}
				} else {
					local147 = arg0.method859(30);
					local152 = local147 >> 28;
					local405 = local147 >> 14 & 0x3FFF;
					local413 = local147 & 0x3FFF;
					local426 = (local405 + local36.anIntArray491[0] + Static21.anInt265 & 0x3FFF) - Static21.anInt265;
					local433 = (local413 + Static103.anInt2044 + local36.anIntArray490[0] & 0x3FFF) - Static103.anInt2044;
					if (local17) {
						local36.anInt4390 = local433;
						local36.anInt4397 = local426;
						local36.aBoolean343 = true;
					} else {
						local36.method4025(local426, local433, Static338.aByteArray81[arg1]);
					}
					local36.aByte73 = (byte) (local36.aByte73 + local152 & 0x3);
					if (arg1 == Static376.anInt6265) {
						Static363.anInt6170 = local36.aByte73;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean343 = false;
		} else if (arg1 == Static376.anInt6265) {
			throw new RuntimeException("s:lr");
		} else {
			Static166.anIntArray674[arg1] = (local36.anIntArray490[0] + Static103.anInt2044 >> 6) + (local36.anIntArray491[0] + Static21.anInt265 >> 6 << 14) + (local36.aByte73 << 28);
			if (local36.anInt4380 == -1) {
				Static186.anIntArray372[arg1] = local36.aClass251_7.method5710();
			} else {
				Static186.anIntArray372[arg1] = local36.anInt4380;
			}
			Static109.anIntArray212[arg1] = local36.anInt4347;
			if (local36.anInt4403 > 0) {
				Static281.method4463(local36);
			}
			Static308.aClass28_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method859(1) != 0) {
				Static207.method1893(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!qo;)Z")
	public static boolean method5280(@OriginalArg(1) Class196 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean394) {
			return false;
		} else if (!arg0.method4505(Static42.anInterface9_2)) {
			return false;
		} else if (Static20.aClass44_3.method942((long) arg0.anInt5023) == null) {
			return Static25.aClass44_5.method942((long) arg0.anInt5001) == null;
		} else {
			return false;
		}
	}
}
