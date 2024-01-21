import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public static int anInt4271 = 0;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1221 = Static181.method2795("(U3");

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1224 = Static181.method2795("glow2:");

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1222 = aClass83_1224;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1223 = Static181.method2795("k");

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "[S")
	public static short[] aShortArray60 = new short[256];

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public static int anInt4272 = 0;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1226 = Static181.method2795("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1227 = aClass83_1224;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3246(@OriginalArg(1) Class24_Sub4 arg0) {
		if (Static13.anInt386 == arg0.anInt3308 || arg0.anInt3336 == -1 || arg0.anInt3297 != 0 || arg0.anInt3305 + 1 > Static213.method3229(arg0.anInt3336).anIntArray229[arg0.anInt3313]) {
			@Pc(37) int local37 = arg0.anInt3308 - arg0.anInt3294;
			@Pc(43) int local43 = Static13.anInt386 - arg0.anInt3294;
			@Pc(53) int local53 = arg0.anInt3332 * 64 + arg0.anInt3315 * 128;
			@Pc(63) int local63 = arg0.anInt3332 * 64 + arg0.anInt3325 * 128;
			@Pc(73) int local73 = arg0.anInt3332 * 64 + arg0.anInt3314 * 128;
			arg0.anInt3316 = (local53 * (local37 - local43) + local63 * local43) / local37;
			@Pc(99) int local99 = arg0.anInt3329 * 128 + arg0.anInt3332 * 64;
			arg0.anInt3349 = (local73 * (local37 - local43) + local99 * local43) / local37;
		}
		if (arg0.anInt3347 == 0) {
			arg0.anInt3318 = 1024;
		}
		arg0.anInt3339 = 0;
		if (arg0.anInt3347 == 1) {
			arg0.anInt3318 = 1536;
		}
		if (arg0.anInt3347 == 2) {
			arg0.anInt3318 = 0;
		}
		if (arg0.anInt3347 == 3) {
			arg0.anInt3318 = 512;
		}
		arg0.anInt3331 = arg0.anInt3318;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI)V")
	public static void method3247(@OriginalArg(0) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (local3 < arg0.length) {
				@Pc(26) int local26 = (arg0[local3++] & 0xFF) * 64 - Static154.anInt3114;
				@Pc(37) int local37 = (arg0[local3++] & 0xFF) * 64 - Static57.anInt1431;
				@Pc(60) byte local60;
				@Pc(53) int local53;
				if (local26 > 0 && local37 > 0 && local26 + 64 < Static127.anInt2810 && local37 + 64 < Static177.anInt3615) {
					local53 = local26 >> 6;
					@Pc(87) int local87 = Static177.anInt3615 - local37 - 1 >> 6;
					for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
						for (@Pc(93) int local93 = -64; local93 < 0; local93++) {
							local60 = arg0[local3++];
							if (local60 != 0) {
								if (Static89.aByteArrayArrayArray95[local53][local87] == null) {
									Static89.aByteArrayArrayArray95[local53][local87] = new byte[4096];
								}
								Static89.aByteArrayArrayArray95[local53][local87][local89 + (-(local93 + 1) << 6)] = local60;
								@Pc(135) byte local135 = arg0[local3++];
								if (Static176.aByteArrayArrayArray68[local53][local87] == null) {
									Static176.aByteArrayArrayArray68[local53][local87] = new byte[4096];
								}
								Static176.aByteArrayArrayArray68[local53][local87][local89 + (-(local93 + 1) << 6)] = local135;
							}
						}
					}
				} else {
					for (local53 = -4096; local53 < 0; local53++) {
						local60 = arg0[local3++];
						if (local60 != 0) {
							local3++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3249(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
