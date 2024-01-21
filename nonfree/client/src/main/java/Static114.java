import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public static int anInt2667;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] aClass5_Sub1_Sub10_Sub1Array9;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!oa;")
	public static Class7 aClass7_81;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	public static int anInt2677;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1297 = Static38.method736("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1295 = aClass71_1297;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1296 = Static38.method736("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method1773() {
		aByteArrayArrayArray7 = null;
		aClass71_1295 = null;
		aClass71_1296 = null;
		anIntArray279 = null;
		aClass5_Sub1_Sub10_Sub1Array9 = null;
		aClass7_81 = null;
		aClass71_1297 = null;
		anIntArray278 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!me;)I")
	public static int method1774(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub11 arg1) {
		if (arg1.anIntArrayArray22 == null || arg1.anIntArrayArray22.length <= arg0) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(35) int[] local35 = arg1.anIntArrayArray22[arg0];
			while (true) {
				@Pc(40) int local40 = local35[local28++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local21;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 1) {
					local42 = Static62.anIntArray178[local35[local28++]];
				}
				if (local40 == 2) {
					local42 = Static26.anIntArray170[local35[local28++]];
				}
				if (local40 == 3) {
					local42 = Static5.anIntArray7[local35[local28++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(113) int local113;
				@Pc(126) Class5_Sub1_Sub11 local126;
				@Pc(131) int local131;
				@Pc(144) int local144;
				if (local40 == 4) {
					local113 = local35[local28++] << 16;
					@Pc(120) int local120 = local113 + local35[local28++];
					local126 = Static118.method1937(local120);
					local131 = local35[local28++];
					if (local131 != -1 && (!Static33.method691(local131).aBoolean127 || Static62.aBoolean67)) {
						for (local144 = 0; local144 < local126.anIntArray222.length; local144++) {
							if (local131 + 1 == local126.anIntArray222[local144]) {
								local42 += local126.anIntArray217[local144];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static23.anIntArray87[local35[local28++]];
				}
				if (local40 == 6) {
					local42 = Class5_Sub1_Sub4.anIntArray83[Static26.anIntArray170[local35[local28++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static23.anIntArray87[local35[local28++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2496;
				}
				if (local40 == 9) {
					for (local113 = 0; local113 < 25; local113++) {
						if (Static40.aBooleanArray6[local113]) {
							local42 += Static26.anIntArray170[local113];
						}
					}
				}
				if (local40 == 10) {
					local113 = local35[local28++] << 16;
					local113 += local35[local28++];
					local126 = Static118.method1937(local113);
					local131 = local35[local28++];
					if (local131 != -1 && (!Static33.method691(local131).aBoolean127 || Static62.aBoolean67)) {
						for (local144 = 0; local144 < local126.anIntArray222.length; local144++) {
							if (local131 + 1 == local126.anIntArray222[local144]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static117.anInt2910;
				}
				if (local40 == 12) {
					local42 = Static16.anInt515;
				}
				if (local40 == 13) {
					local113 = Static23.anIntArray87[local35[local28++]];
					@Pc(342) int local342 = local35[local28++];
					local42 = (0x1 << local342 & local113) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local113 = local35[local28++];
					local42 = Static104.method2007(local113);
				}
				if (local40 == 18) {
					local42 = (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 >> 7) + Static48.anInt1367;
				}
				if (local40 == 19) {
					local42 = Static76.anInt1884 + (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 >> 7);
				}
				if (local40 == 20) {
					local42 = local35[local28++];
				}
				if (local44 == 0) {
					if (local30 == 0) {
						local21 += local42;
					}
					if (local30 == 1) {
						local21 -= local42;
					}
					if (local30 == 2 && local42 != 0) {
						local21 /= local42;
					}
					if (local30 == 3) {
						local21 *= local42;
					}
					local30 = 0;
				} else {
					local30 = local44;
				}
			}
		} catch (@Pc(445) Exception local445) {
			return -1;
		}
	}
}
