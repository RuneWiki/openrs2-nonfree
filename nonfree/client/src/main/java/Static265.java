import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!km;")
	public static Class91 aClass91_190;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!km;")
	public static Class91 aClass91_191;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
	public static int[] anIntArray460 = new int[128];

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString304 = "Loaded textures";

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!qc;")
	public static Class135 aClass135_38 = new Class135(64);

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt5181 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public static void method4054(@OriginalArg(1) long arg0) {
		@Pc(6) int local6 = Static52.anInt1182 + Static197.aClass14_Sub2_Sub1_2.anInt4680;
		if (!Static19.aBoolean30) {
			Static298.aFloat58 += (float) arg0 * Static88.aFloat10 / 40.0F;
			Static125.aFloat20 += Static3.aFloat1 * (float) arg0 / 40.0F;
		}
		@Pc(31) int local31 = Static78.anInt1744 + Static197.aClass14_Sub2_Sub1_2.anInt4630;
		if (Static92.anInt2083 - local6 < -500 || Static92.anInt2083 - local6 > 500 || Static114.anInt2610 - local31 < -500 || Static114.anInt2610 - local31 > 500) {
			Static92.anInt2083 = local6;
			Static114.anInt2610 = local31;
		}
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (local6 != Static92.anInt2083) {
			local76 = local6 - Static92.anInt2083;
			local84 = (int) ((long) local76 * arg0 / 320L);
			if (local76 > 0) {
				if (local84 == 0) {
					local84 = 1;
				} else if (local76 < local84) {
					local84 = local76;
				}
			} else if (local84 == 0) {
				local84 = -1;
			} else if (local76 > local84) {
				local84 = local76;
			}
			Static92.anInt2083 += local84;
		}
		if (Static114.anInt2610 != local31) {
			local76 = local31 - Static114.anInt2610;
			local84 = (int) ((long) local76 * arg0 / 320L);
			if (local76 > 0) {
				if (local84 == 0) {
					local84 = 1;
				} else if (local84 > local76) {
					local84 = local76;
				}
			} else if (local84 == 0) {
				local84 = -1;
			} else if (local76 > local84) {
				local84 = local76;
			}
			Static114.anInt2610 += local84;
		}
		Static148.method2587();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method4055(@OriginalArg(0) Class1_Sub11 arg0) {
		label84: while (true) {
			if (arg0.aByteArray47.length > arg0.anInt3264) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method2690() == 1) {
					local21 = true;
					local25 = arg0.method2690();
					local23 = arg0.method2690();
				}
				@Pc(46) int local46 = arg0.method2690();
				@Pc(50) int local50 = arg0.method2690();
				@Pc(56) int local56 = local46 * 64 - Static264.anInt5177;
				@Pc(67) int local67 = Static95.anInt2218 + Static254.anInt4979 - local50 * 64 - 1;
				@Pc(99) byte local99;
				@Pc(84) int local84;
				if (local56 >= 0 && local67 - 63 >= 0 && local56 + 63 < Static164.anInt3508 && local67 < Static95.anInt2218) {
					@Pc(119) int local119 = local67 >> 6;
					local84 = local56 >> 6;
					@Pc(125) int local125 = 0;
					while (true) {
						if (local125 >= 64) {
							continue label84;
						}
						for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
							if (!local21 || local125 >= local25 * 8 && local125 < local25 * 8 + 8 && local23 * 8 <= local130 && local23 * 8 + 8 > local130) {
								local99 = arg0.method2663();
								if (local99 != 0) {
									if (Static198.aByteArrayArrayArray2[local84][local119] == null) {
										Static198.aByteArrayArrayArray2[local84][local119] = new byte[4096];
									}
									Static198.aByteArrayArrayArray2[local84][local119][local125 + (63 - local130 << 6)] = local99;
									@Pc(212) byte local212 = arg0.method2663();
									if (Static230.aByteArrayArrayArray15[local84][local119] == null) {
										Static230.aByteArrayArrayArray15[local84][local119] = new byte[4096];
									}
									Static230.aByteArrayArrayArray15[local84][local119][local125 + (63 - local130 << 6)] = local212;
								}
							}
						}
						local125++;
					}
				}
				local84 = 0;
				while (true) {
					if ((local21 ? 64 : 4096) <= local84) {
						continue label84;
					}
					local99 = arg0.method2663();
					if (local99 != 0) {
						arg0.anInt3264++;
					}
					local84++;
				}
			}
			return;
		}
	}
}
