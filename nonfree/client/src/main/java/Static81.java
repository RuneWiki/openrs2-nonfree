import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!da;")
	public static Class15 aClass15_71;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger47 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt2904 = 1;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1346 = Static24.method441("Accept challenge");

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1345 = aClass65_1346;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1347 = Static24.method441("(U5");

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1348 = Static24.method441("Weiter");

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	public static int anInt2913 = 0;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "[B")
	public static byte[] aByteArray71 = new byte[520];

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1349 = Static24.method441("backright2");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "[I")
	public static int[] anIntArray414 = new int[25];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method1796() {
		aBigInteger47 = null;
		aClass15_71 = null;
		aByteArray71 = null;
		aClass65_1345 = null;
		aClass65_1348 = null;
		aClass65_1346 = null;
		aClass65_1349 = null;
		aClass65_1347 = null;
		anIntArray414 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 method1797() {
		@Pc(5) Class2_Sub1_Sub4_Sub2 local5 = new Class2_Sub1_Sub4_Sub2();
		local5.anInt763 = Static82.anInt2367;
		local5.anInt760 = Static90.anInt1399;
		local5.anInt762 = Static28.anIntArray110[0];
		local5.anInt761 = Static17.anIntArray79[0];
		local5.anInt764 = Static98.anIntArray404[0];
		local5.anInt759 = Static24.anIntArray98[0];
		@Pc(39) byte[] local39 = Static101.aByteArrayArray9[0];
		@Pc(45) int local45 = local5.anInt759 * local5.anInt764;
		local5.anIntArray105 = new int[local45];
		for (@Pc(56) int local56 = 0; local56 < local45; local56++) {
			local5.anIntArray105[local56] = Static28.anIntArray109[local39[local56] & 0xFF];
		}
		Static13.method284();
		return local5;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!k;)V")
	public static void method1798(@OriginalArg(1) Class33 arg0) {
		Static105.aClass33_43 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1799() {
		try {
			@Pc(6) Graphics local6 = Static70.aCanvas1.getGraphics();
			Static89.aClass15_60.method1104(357, local6, 17);
		} catch (@Pc(22) Exception local22) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!ab;Lclient!wb;)Lclient!wb;")
	public static Class65 method1800(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) Class65 arg1) {
		if (arg1.method1775(Static89.aClass65_1151) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(17) int local17 = arg1.method1775(Static107.aClass65_1298);
			if (local17 == -1) {
				while (true) {
					local17 = arg1.method1775(Static108.aClass65_1328);
					if (local17 == -1) {
						while (true) {
							local17 = arg1.method1775(Static97.aClass65_1206);
							if (local17 == -1) {
								while (true) {
									local17 = arg1.method1775(Static27.aClass65_372);
									if (local17 == -1) {
										while (true) {
											local17 = arg1.method1775(aClass65_1347);
											if (local17 == -1) {
												while (true) {
													local17 = arg1.method1775(Static26.aClass65_1351);
													if (local17 == -1) {
														return arg1;
													}
													@Pc(229) Class65 local229 = Static8.aClass65_145;
													if (Static4.aClass20_1 != null) {
														local229 = Static16.method314(Static4.aClass20_1.anInt1158);
														try {
															if (Static4.aClass20_1.anObject4 != null) {
																@Pc(245) byte[] local245 = ((String) Static4.aClass20_1.anObject4).getBytes("ISO-8859-1");
																local229 = Static4.method100(local245, local245.length, 0);
															}
														} catch (@Pc(254) UnsupportedEncodingException local254) {
														}
													}
													arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), local229, arg1.method1779(local17 + 4) });
												}
											}
											arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), Static99.method1568(Static110.method1845(4, arg0)), arg1.method1779(local17 + 2) });
										}
									}
									arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), Static99.method1568(Static110.method1845(3, arg0)), arg1.method1779(local17 + 2) });
								}
							}
							arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), Static99.method1568(Static110.method1845(2, arg0)), arg1.method1779(local17 + 2) });
						}
					}
					arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), Static99.method1568(Static110.method1845(1, arg0)), arg1.method1779(local17 + 2) });
				}
			}
			arg1 = Static13.method282(new Class65[] { arg1.method1772(local17, 0), Static99.method1568(Static110.method1845(0, arg0)), arg1.method1779(local17 + 2) });
		}
	}
}
