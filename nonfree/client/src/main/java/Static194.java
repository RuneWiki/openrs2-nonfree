import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public static int anInt4138;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public static int anInt4140;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!ge;")
	public static Class39 aClass39_23 = new Class39(64);

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1397 = Static200.method3116("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1398 = aClass60_1397;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1399 = Static200.method3116("<col=00ff00>");

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1400 = Static200.method3116("Hierhin gehen");

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1404 = Static200.method3116("Loaded fonts");

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1401 = aClass60_1404;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public static int anInt4139 = -1;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1402 = Static200.method3116("Walk here");

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[I")
	public static int[] anIntArray537 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1403 = Static200.method3116("Okay");

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1405 = aClass60_1402;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZI)V")
	public static void method3014(@OriginalArg(2) boolean arg0) {
		Static59.aBoolean76 = arg0;
		Static191.anInt4086 = 22050;
		Static209.anInt4485 = 2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ)I")
	public static int method3015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBZ)I")
	public static int method3016() {
		return Static43.anInt924 + Static165.anInt2955;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[B)V")
	public static void method3018(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = 0;
		while (true) {
			while (local11 < arg0.length) {
				@Pc(29) int local29 = (arg0[local11++] & 0xFF) * 64 - Static73.anInt1791;
				@Pc(41) int local41 = (arg0[local11++] & 0xFF) * 64 - Static153.anInt3417;
				@Pc(71) byte local71;
				@Pc(64) int local64;
				if (local29 > 0 && local41 > 0 && local29 + 64 < Static211.anInt3462 && local41 + 64 < Static30.anInt724) {
					local64 = local29 >> 6;
					@Pc(95) int local95 = Static30.anInt724 - local41 - 1 >> 6;
					for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
						for (@Pc(101) int local101 = -64; local101 < 0; local101++) {
							local71 = arg0[local11++];
							if (local71 != 0) {
								if (Static146.aByteArrayArrayArray6[local64][local95] == null) {
									Static146.aByteArrayArrayArray6[local64][local95] = new byte[4096];
								}
								Static146.aByteArrayArrayArray6[local64][local95][local97 + (-(local101 + 1) << 6)] = local71;
								@Pc(147) byte local147 = arg0[local11++];
								if (Static180.aByteArrayArrayArray9[local64][local95] == null) {
									Static180.aByteArrayArrayArray9[local64][local95] = new byte[4096];
								}
								Static180.aByteArrayArrayArray9[local64][local95][(-(local101 + 1) << 6) + local97] = local147;
							}
						}
					}
				} else {
					for (local64 = -4096; local64 < 0; local64++) {
						local71 = arg0[local11++];
						if (local71 != 0) {
							local11++;
						}
					}
				}
			}
			return;
		}
	}
}
