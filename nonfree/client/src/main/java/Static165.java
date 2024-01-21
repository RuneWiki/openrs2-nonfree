import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!re", name = "z", descriptor = "Lclient!ig;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_5;

	@OriginalMember(owner = "client!re", name = "Ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!re", name = "Hb", descriptor = "I")
	public static int anInt2257;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_828 = Static161.method2452("Passwort: ");

	@OriginalMember(owner = "client!re", name = "I", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_829 = Static161.method2452("Jul");

	@OriginalMember(owner = "client!re", name = "L", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_830 = Static161.method2452("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!re", name = "Jb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_841 = Static161.method2452("Jan");

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_834 = Static161.method2452("Feb");

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_832 = Static161.method2452("Mar");

	@OriginalMember(owner = "client!re", name = "nb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_838 = Static161.method2452("Apr");

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_833 = Static161.method2452("May");

	@OriginalMember(owner = "client!re", name = "Wb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_846 = Static161.method2452("Jun");

	@OriginalMember(owner = "client!re", name = "lb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_837 = Static161.method2452("Aug");

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_831 = Static161.method2452("Sep");

	@OriginalMember(owner = "client!re", name = "Vb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_845 = Static161.method2452("Oct");

	@OriginalMember(owner = "client!re", name = "Mb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_842 = Static161.method2452("Nov");

	@OriginalMember(owner = "client!re", name = "tb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_840 = Static161.method2452("Dec");

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array16 = new Class20[] { aClass20_841, aClass20_834, aClass20_832, aClass20_838, aClass20_833, aClass20_846, aClass20_829, aClass20_837, aClass20_831, aClass20_845, aClass20_842, aClass20_840 };

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_836 = Static161.method2452("skill)2");

	@OriginalMember(owner = "client!re", name = "pb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_839 = aClass20_836;

	@OriginalMember(owner = "client!re", name = "Zb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_847 = Static161.method2452("Loading fonts )2 ");

	@OriginalMember(owner = "client!re", name = "Nb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_843 = aClass20_847;

	@OriginalMember(owner = "client!re", name = "Pb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_844 = Static161.method2452("cookiehost");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Z")
	public static boolean method1746() {
		try {
			if (Static92.anInt1963 == 2) {
				if (Static29.aClass5_Sub18_1 == null) {
					Static29.aClass5_Sub18_1 = Static223.method1853(Static172.aClass23_68, Static183.anInt3678, Static113.anInt2383);
					if (Static29.aClass5_Sub18_1 == null) {
						return false;
					}
				}
				if (Static6.aClass18_1 == null) {
					Static6.aClass18_1 = new Class18(Static88.aClass23_37, Static31.aClass23_18);
				}
				if (Static154.aClass5_Sub11_Sub2_2.method1663(Static6.aClass18_1, Static55.aClass23_25, Static29.aClass5_Sub18_1)) {
					Static154.aClass5_Sub11_Sub2_2.method1645();
					Static154.aClass5_Sub11_Sub2_2.method1660(Static45.anInt1025);
					Static154.aClass5_Sub11_Sub2_2.method1653(Static29.aClass5_Sub18_1, Static38.aBoolean50);
					Static172.aClass23_68 = null;
					Static6.aClass18_1 = null;
					Static29.aClass5_Sub18_1 = null;
					Static92.anInt1963 = 0;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static154.aClass5_Sub11_Sub2_2.method1632();
			Static29.aClass5_Sub18_1 = null;
			Static172.aClass23_68 = null;
			Static6.aClass18_1 = null;
			Static92.anInt1963 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static18.anInt354 = arg0 * anInt2257 / arg1;
		Static212.anInt4113 = arg2 * Static131.anInt2727 / arg3;
		Static129.anInt2701 = -1;
		Static148.anInt3057 = -1;
		Static117.method1868();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B[B)V")
	public static void method1749(@OriginalArg(1) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (arg0.length > local3) {
				@Pc(18) int local18 = arg0[local3++] * 64 - Static207.anInt4070;
				@Pc(27) int local27 = arg0[local3++] * 64 - Static59.anInt1331;
				@Pc(53) int local53;
				@Pc(57) int local57;
				if (local18 > 0 && local27 > 0 && Static131.anInt2727 > local18 + 64 && local27 + 64 < anInt2257) {
					local53 = local18 >> 6;
					local57 = anInt2257 - local27 - 1 >> 6;
					for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
						for (@Pc(121) int local121 = -64; local121 < 0; local121++) {
							@Pc(128) byte local128 = arg0[local3++];
							if (local128 != 0) {
								@Pc(143) byte local143;
								if ((local128 & 0x1) == 1) {
									local143 = arg0[local3++];
									if (Static160.aByteArrayArrayArray12[local53][local57] == null) {
										Static160.aByteArrayArrayArray12[local53][local57] = new byte[4096];
									}
									Static160.aByteArrayArrayArray12[local53][local57][local117 + (-(local121 + 1) << 6)] = (byte) local143;
								}
								if ((local128 & 0x2) == 2) {
									local143 = arg0[local3++];
									if (Static62.aByteArrayArrayArray4[local53][local57] == null) {
										Static62.aByteArrayArrayArray4[local53][local57] = new byte[4096];
									}
									Static62.aByteArrayArrayArray4[local53][local57][(-(local121 + 1) << 6) + local117] = (byte) (local143 - 28);
								}
								if ((local128 & 0x4) == 4) {
									local3 += 3;
									@Pc(250) int local250 = ((arg0[local3 - 2] & 0xFF) << 8) + (((arg0[local3 - 3] & 0xFF) << 16) + (arg0[local3 - 1] & 0xFF));
									if (Static93.anIntArrayArrayArray9[local53][local57] == null) {
										Static93.anIntArrayArrayArray9[local53][local57] = new int[4096];
									}
									local250--;
									@Pc(268) Class5_Sub2_Sub7 local268 = Static63.method1046(local250);
									if (local268.anIntArray35 != null) {
										local268 = local268.method431();
										if (local268 == null || local268.anInt516 == -1) {
											continue;
										}
									}
									Static93.anIntArrayArrayArray9[local53][local57][local117 + (-(local121 + 1) << 6)] = local268.anInt542 + 1;
									@Pc(306) Class5_Sub12 local306 = new Class5_Sub12();
									local306.anInt1161 = local18;
									local306.anInt1157 = local268.anInt516;
									local306.anInt1160 = anInt2257 - local27;
									Static11.aClass91_1.method2686(local306);
								}
							}
						}
					}
				} else {
					for (local53 = 0; local53 < 64; local53++) {
						for (local57 = -64; local57 < 0; local57++) {
							@Pc(64) byte local64 = arg0[local3++];
							if (local64 != 0) {
								if ((local64 & 0x1) == 1) {
									local3++;
								}
								if ((local64 & 0x2) == 2) {
									local3++;
								}
								if ((local64 & 0x4) == 4) {
									local3 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}
}
