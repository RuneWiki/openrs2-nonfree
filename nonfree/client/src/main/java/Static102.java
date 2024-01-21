import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray71;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	public static int anInt3088;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1429 = Static56.method816("Titelbild geladen)3");

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1430 = Static56.method816("VOLL");

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[Lclient!df;")
	public static Class8_Sub1_Sub1_Sub3[] aClass8_Sub1_Sub1_Sub3Array62 = new Class8_Sub1_Sub1_Sub3[4];

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public static int anInt3085 = 0;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1431 = Static56.method816("(U5");

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1432 = Static56.method816("p12_full");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public static int anInt3092 = 0;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public static void method2012() {
		aClass34_1429 = null;
		aClass34_1430 = null;
		aClass34_1432 = null;
		aClass34_1431 = null;
		aClass8_Sub1_Sub1_Sub3Array62 = null;
		aByteArrayArray71 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wf;II)I")
	public static int method2014(@OriginalArg(0) Class8_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray29 == null || arg0.anIntArrayArray29.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray29[arg1];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			while (true) {
				@Pc(35) int local35 = local24[local28++];
				@Pc(37) byte local37 = 0;
				@Pc(39) int local39 = 0;
				if (local35 == 0) {
					return local26;
				}
				if (local35 == 15) {
					local37 = 1;
				}
				if (local35 == 1) {
					local39 = Static92.anIntArray306[local24[local28++]];
				}
				if (local35 == 2) {
					local39 = Static117.anIntArray362[local24[local28++]];
				}
				if (local35 == 3) {
					local39 = Static84.anIntArray270[local24[local28++]];
				}
				@Pc(92) int local92;
				@Pc(103) Class8_Sub24 local103;
				@Pc(108) int local108;
				@Pc(120) int local120;
				if (local35 == 4) {
					local92 = local24[local28++] << 16;
					@Pc(99) int local99 = local92 + local24[local28++];
					local103 = Static113.method1614(local99);
					local108 = local24[local28++];
					if (local108 != -1 && (!Static7.method49(local108).aBoolean68 || Static16.aBoolean19)) {
						for (local120 = 0; local120 < local103.anIntArray414.length; local120++) {
							if (local103.anIntArray414[local120] == local108 + 1) {
								local39 += local103.anIntArray410[local120];
							}
						}
					}
				}
				if (local35 == 16) {
					local37 = 2;
				}
				if (local35 == 17) {
					local37 = 3;
				}
				if (local35 == 5) {
					local39 = Static78.anIntArray238[local24[local28++]];
				}
				if (local35 == 6) {
					local39 = Class28.anIntArray145[Static117.anIntArray362[local24[local28++]] - 1];
				}
				if (local35 == 7) {
					local39 = Static78.anIntArray238[local24[local28++]] * 100 / 46875;
				}
				if (local35 == 8) {
					local39 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1275;
				}
				if (local35 == 9) {
					for (local92 = 0; local92 < 25; local92++) {
						if (Static95.aBooleanArray18[local92]) {
							local39 += Static117.anIntArray362[local92];
						}
					}
				}
				if (local35 == 10) {
					local92 = local24[local28++] << 16;
					local92 += local24[local28++];
					local103 = Static113.method1614(local92);
					local108 = local24[local28++];
					if (local108 != -1 && (!Static7.method49(local108).aBoolean68 || Static16.aBoolean19)) {
						for (local120 = 0; local120 < local103.anIntArray414.length; local120++) {
							if (local108 + 1 == local103.anIntArray414[local120]) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local35 == 11) {
					local39 = Static10.anInt230;
				}
				if (local35 == 12) {
					local39 = Static108.anInt2487;
				}
				if (local35 == 13) {
					local92 = Static78.anIntArray238[local24[local28++]];
					@Pc(320) int local320 = local24[local28++];
					local39 = (local92 & 0x1 << local320) == 0 ? 0 : 1;
				}
				if (local35 == 14) {
					local92 = local24[local28++];
					local39 = Static23.method423(local92);
				}
				if (local35 == 18) {
					local39 = (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7) + Static82.anInt1959;
				}
				if (local35 == 19) {
					local39 = Static64.anInt2062 + (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7);
				}
				if (local35 == 20) {
					local39 = local24[local28++];
				}
				if (local37 == 0) {
					if (local30 == 0) {
						local26 += local39;
					}
					if (local30 == 1) {
						local26 -= local39;
					}
					if (local30 == 2 && local39 != 0) {
						local26 /= local39;
					}
					if (local30 == 3) {
						local26 *= local39;
					}
					local30 = 0;
				} else {
					local30 = local37;
				}
			}
		} catch (@Pc(418) Exception local418) {
			return -1;
		}
	}
}
