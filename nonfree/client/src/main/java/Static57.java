import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!h", name = "X", descriptor = "I")
	public static int anInt4556;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "I")
	public static int anInt4543 = -1;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "[I")
	public static int[] anIntArray641 = new int[128];

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	public static int anInt4549 = -1;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!na;")
	public static Class2_Sub17 aClass2_Sub17_39 = new Class2_Sub17(0, 0);

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1549 = Static146.method2172("<)4col>");

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1550 = Static146.method2172("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1551 = Static146.method2172("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method2981() {
		Static13.aClass10_15 = new Class10();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!sg;ZLclient!sg;IILclient!ke;)V")
	public static void method2985(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(5) Class43 arg2) {
		@Pc(13) int local13 = arg2.method2206(arg0);
		@Pc(19) int local19 = arg2.method2215(local13, arg1);
		Static58.method1066(arg2, local19, 255, local13);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!v;)V")
	public static void method2988(@OriginalArg(1) Class2_Sub2_Sub1_Sub6 arg0) {
		if (Static143.anInt3513 == arg0.anInt4414 || arg0.anInt4399 == -1 || arg0.anInt4376 != 0 || arg0.anInt4394 + 1 > Static140.method2333(arg0.anInt4399).anIntArray549[arg0.anInt4406]) {
			@Pc(32) int local32 = Static143.anInt3513 - arg0.anInt4396;
			@Pc(39) int local39 = arg0.anInt4414 - arg0.anInt4396;
			@Pc(49) int local49 = arg0.anInt4409 * 64 + arg0.anInt4392 * 128;
			@Pc(60) int local60 = arg0.anInt4377 * 128 + arg0.anInt4409 * 64;
			@Pc(70) int local70 = arg0.anInt4409 * 64 + arg0.anInt4381 * 128;
			@Pc(80) int local80 = arg0.anInt4409 * 64 + arg0.anInt4374 * 128;
			arg0.anInt4385 = (local60 * (local39 - local32) + local32 * local80) / local39;
			arg0.anInt4400 = (local70 * local32 + (local39 - local32) * local49) / local39;
		}
		if (arg0.anInt4423 == 0) {
			arg0.anInt4387 = 1024;
		}
		arg0.anInt4378 = 0;
		if (arg0.anInt4423 == 1) {
			arg0.anInt4387 = 1536;
		}
		if (arg0.anInt4423 == 2) {
			arg0.anInt4387 = 0;
		}
		if (arg0.anInt4423 == 3) {
			arg0.anInt4387 = 512;
		}
		arg0.anInt4415 = arg0.anInt4387;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!tc;IZIII)V")
	public static void method2989(@OriginalArg(0) Class2_Sub2_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static90.anInt2345 >= 50 || (arg0.anIntArray547 == null || arg3 >= arg0.anIntArray547.length)) {
			return;
		}
		@Pc(37) int local37 = arg0.anIntArray547[arg3];
		if (local37 == 0) {
			return;
		}
		@Pc(47) int local47 = local37 >> 8;
		@Pc(53) int local53 = local37 >> 4 & 0x7;
		@Pc(57) int local57 = local37 & 0xF;
		if (local57 == 0) {
			if (arg2) {
				Static164.method2753(0, local53, local47);
			}
		} else if (Static18.anInt617 != 0) {
			Static103.anIntArray402[Static90.anInt2345] = local47;
			Static59.anIntArray239[Static90.anInt2345] = local53;
			Static139.anIntArray504[Static90.anInt2345] = 0;
			Static46.aClass76Array1[Static90.anInt2345] = null;
			@Pc(95) int local95 = (arg1 - 64) / 128;
			@Pc(101) int local101 = (arg4 - 64) / 128;
			Static79.anIntArray351[Static90.anInt2345] = local57 + (local101 << 8) + (local95 << 16);
			Static90.anInt2345++;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BIII[Lclient!vb;IBI)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class86[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg1 + local7 > 0 && local7 + arg1 < 103 && arg8 + local11 > 0 && local11 + arg8 < 103) {
					arg6[arg3].anIntArrayArray36[arg1 + local7][arg8 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(85) Class2_Sub18 local85 = new Class2_Sub18(arg2);
		for (@Pc(87) int local87 = 0; local87 < 4; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					if (arg0 == local87 && local91 >= arg5 && arg5 + 8 > local91 && local95 >= arg7 && local95 < arg7 + 8) {
						Static31.method612(Static145.method2442(local95 & 0x7, local91 & 0x7, arg4) + arg1, arg3, arg8 + Static97.method1761(local91 & 0x7, arg4, local95 & 0x7), local85, arg4, 0, 0);
					} else {
						Static31.method612(-1, 0, -1, local85, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method2994(@OriginalArg(1) Class66 arg0) {
		if (arg0.anInt3180 == Static92.anInt2379) {
			Static103.aBooleanArray9[arg0.anInt3213] = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method2995() {
		anIntArray641 = null;
		aClass77_1551 = null;
		aClass77_1549 = null;
		aClass2_Sub17_39 = null;
		aClass77_1550 = null;
	}
}
