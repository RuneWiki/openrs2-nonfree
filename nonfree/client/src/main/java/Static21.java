import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "[S")
	public static short[] aShortArray11;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!qe;")
	private static Class78 aClass78_75 = Static199.method3560(" from your friend list first)3");

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_76 = aClass78_75;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_77 = Static199.method3560("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!wc;")
	public static Class110 aClass110_2 = new Class110(16);

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	public static int[] anIntArray52 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int anInt401 = 0;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_78 = Static199.method3560("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_79 = Static199.method3560("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
	public static int method291(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B)I")
	public static int method292(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static189.method3491(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([BI)V")
	public static void method294(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (arg0.length > local7) {
				@Pc(23) int local23 = arg0[local7++] * 64 - Static221.anInt4795;
				@Pc(32) int local32 = arg0[local7++] * 64 - Static45.anInt815;
				@Pc(53) int local53;
				@Pc(61) int local61;
				if (local23 > 0 && local32 > 0 && local23 + 64 < Static151.anInt3457 && Static30.anInt547 > local32 + 64) {
					local53 = local23 >> 6;
					local61 = Static30.anInt547 - local32 - 1 >> 6;
					for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
						for (@Pc(67) int local67 = -64; local67 < 0; local67++) {
							@Pc(74) byte local74 = arg0[local7++];
							if (local74 != 0) {
								@Pc(89) byte local89;
								if ((local74 & 0x1) == 1) {
									local89 = arg0[local7++];
									if (Static188.aByteArrayArrayArray14[local53][local61] == null) {
										Static188.aByteArrayArrayArray14[local53][local61] = new byte[4096];
									}
									Static188.aByteArrayArrayArray14[local53][local61][(-(local67 + 1) << 6) + local63] = (byte) local89;
								}
								if ((local74 & 0x2) == 2) {
									local89 = arg0[local7++];
									if (Static129.aByteArrayArrayArray9[local53][local61] == null) {
										Static129.aByteArrayArrayArray9[local53][local61] = new byte[4096];
									}
									Static129.aByteArrayArrayArray9[local53][local61][(-(local67 + 1) << 6) + local63] = (byte) (local89 - 28);
								}
								if ((local74 & 0x4) == 4) {
									local7 += 3;
									@Pc(200) int local200 = ((arg0[local7 - 3] & 0xFF) << 16) - (-((arg0[local7 - 2] & 0xFF) << 8) - (arg0[local7 - 1] & 0xFF));
									if (Static35.anIntArrayArrayArray2[local53][local61] == null) {
										Static35.anIntArrayArrayArray2[local53][local61] = new int[4096];
									}
									local200--;
									@Pc(218) Class2_Sub3_Sub17 local218 = Static121.method3984(local200);
									if (local218.anIntArray413 != null) {
										local218 = local218.method1867();
										if (local218 == null || local218.anInt2391 == -1) {
											continue;
										}
									}
									Static35.anIntArrayArrayArray2[local53][local61][(-(local67 + 1) << 6) + local63] = local218.anInt2402 + 1;
									@Pc(256) Class2_Sub9 local256 = new Class2_Sub9();
									local256.anInt563 = local218.anInt2391;
									local256.anInt572 = Static30.anInt547 - local32;
									local256.anInt570 = local23;
									Static114.aClass44_27.method1355(local256);
								}
							}
						}
					}
				} else {
					for (local53 = 0; local53 < 64; local53++) {
						for (local61 = -64; local61 < 0; local61++) {
							@Pc(297) byte local297 = arg0[local7++];
							if (local297 != 0) {
								if ((local297 & 0x1) == 1) {
									local7++;
								}
								if ((local297 & 0x2) == 2) {
									local7++;
								}
								if ((local297 & 0x4) == 4) {
									local7 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method295(@OriginalArg(0) int arg0) {
		Static43.anInt795 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static173.anInt3981; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static159.anInt4174; local6++) {
				if (Static226.aClass2_Sub12ArrayArrayArray3[arg0][local3][local6] == null) {
					Static226.aClass2_Sub12ArrayArrayArray3[arg0][local3][local6] = new Class2_Sub12(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZJ)V")
	public static void method296(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static161.aClass2_Sub23_Sub1_5.method2155(235);
			Static161.aClass2_Sub23_Sub1_5.method2103(arg0);
		}
	}
}
