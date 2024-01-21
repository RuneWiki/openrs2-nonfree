import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
	public static int anInt979;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lclient!v;")
	private static Class62 aClass62_409 = Static45.method753("Please try again)3");

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	public static int anInt974 = -1;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Lclient!v;")
	private static Class62 aClass62_412 = Static45.method753("Loading config )2 ");

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_410 = aClass62_412;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "Lclient!v;")
	public static Class62 aClass62_411 = Static45.method753("p11_full");

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	public static int anInt975 = 0;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "Lclient!v;")
	private static Class62 aClass62_414 = Static45.method753("Login");

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_413 = aClass62_414;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_415 = Static45.method753("Missbrauch melden");

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lclient!v;")
	public static Class62 aClass62_416 = aClass62_409;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZI)I")
	public static int method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static44.aByteArrayArrayArray6[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static44.aByteArrayArrayArray6[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	public static void method597() {
		@Pc(6) Object local6 = Static76.anObject2;
		synchronized (Static76.anObject2) {
			if (Static48.anInt1375 != 0) {
				Static48.anInt1375 = 1;
				try {
					Static76.anObject2.wait();
				} catch (@Pc(19) InterruptedException local19) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method598() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static72.anIntArray204[local9 + 32512] = 255;
			}
		}
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(61) int local61;
		for (local16 = 0; local16 < 100; local16++) {
			local48 = (int) (Math.random() * 124.0D) + 2;
			local55 = (int) (Math.random() * 128.0D) + 128;
			local61 = local48 + (local55 << 7);
			Static72.anIntArray204[local61] = 192;
		}
		for (local48 = 1; local48 < 255; local48++) {
			for (local55 = 1; local55 < 127; local55++) {
				local61 = local55 + (local48 << 7);
				Static15.anIntArray46[local61] = (Static72.anIntArray204[local61 - 128] + Static72.anIntArray204[local61 + 1] + Static72.anIntArray204[local61 + -1] + Static72.anIntArray204[local61 + 128]) / 4;
			}
		}
		Static71.anInt1944 += 128;
		if (Static75.anIntArray229.length < Static71.anInt1944) {
			local55 = (int) (Math.random() * 12.0D);
			Static71.anInt1944 -= Static75.anIntArray229.length;
			Static95.method1611(Static21.aClass3_Sub1_Sub1_Sub1Array1[local55]);
		}
		@Pc(164) int local164;
		for (local55 = 1; local55 < 255; local55++) {
			for (local61 = 1; local61 < 127; local61++) {
				local164 = (local55 << 7) + local61;
				@Pc(184) int local184 = Static15.anIntArray46[local164 + 128] - Static75.anIntArray229[Static75.anIntArray229.length - 1 & Static71.anInt1944 + local164] / 5;
				if (local184 < 0) {
					local184 = 0;
				}
				Static72.anIntArray204[local164] = local184;
			}
		}
		for (local61 = 0; local61 < 255; local61++) {
			Static72.anIntArray203[local61] = Static72.anIntArray203[local61 + 1];
		}
		Static72.anIntArray203[255] = (int) (Math.sin((double) Static12.anInt451 / 14.0D) * 16.0D + Math.sin((double) Static12.anInt451 / 15.0D) * 14.0D + Math.sin((double) Static12.anInt451 / 16.0D) * 12.0D);
		if (Static33.anInt1088 > 0) {
			Static33.anInt1088 -= 4;
		}
		if (Static92.anInt2450 > 0) {
			Static92.anInt2450 -= 4;
		}
		if (Static33.anInt1088 != 0 || Static92.anInt2450 != 0) {
			return;
		}
		local164 = (int) (Math.random() * 2000.0D);
		if (local164 == 1) {
			Static92.anInt2450 = 1024;
		}
		if (local164 == 0) {
			Static33.anInt1088 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method599() {
		aClass62_411 = null;
		aClass62_414 = null;
		aClass62_412 = null;
		aClass62_409 = null;
		aClass62_416 = null;
		aClass62_410 = null;
		aClass62_415 = null;
		aClass62_413 = null;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)I")
	public static int method600() {
		@Pc(9) int local9 = Static91.method1541(Static96.anInt2555, Static4.anInt187, Static27.anInt818);
		return local9 - Static23.anInt752 >= 800 || (Static44.aByteArrayArrayArray6[Static27.anInt818][Static96.anInt2555 >> 7][Static4.anInt187 >> 7] & 0x4) == 0 ? 3 : Static27.anInt818;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!fe;Lclient!v;)Lclient!v;")
	public static Class62 method601(@OriginalArg(1) Class3_Sub1_Sub6 arg0, @OriginalArg(2) Class62 arg1) {
		if (arg1.method1697(Static36.aClass62_475) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(22) int local22 = arg1.method1697(Static61.aClass62_724);
			if (local22 == -1) {
				while (true) {
					local22 = arg1.method1697(Static17.aClass62_1294);
					if (local22 == -1) {
						while (true) {
							local22 = arg1.method1697(Static104.aClass62_1251);
							if (local22 == -1) {
								while (true) {
									local22 = arg1.method1697(Static6.aClass62_88);
									if (local22 == -1) {
										while (true) {
											local22 = arg1.method1697(Static10.aClass62_974);
											if (local22 == -1) {
												while (true) {
													local22 = arg1.method1697(Static76.aClass62_904);
													if (local22 == -1) {
														return arg1;
													}
													@Pc(236) Class62 local236 = Static41.aClass62_513;
													if (Static99.aClass54_7 != null) {
														local236 = Static20.method471(Static99.aClass54_7.anInt2218);
														try {
															if (Static99.aClass54_7.anObject3 != null) {
																@Pc(252) byte[] local252 = ((String) Static99.aClass54_7.anObject3).getBytes("ISO-8859-1");
																local236 = Static77.method1255(local252.length, local252, 0);
															}
														} catch (@Pc(261) UnsupportedEncodingException local261) {
														}
													}
													arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), local236, arg1.method1702(local22 + 4) });
												}
											}
											arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), Static24.method506(Static99.method1654(4, arg0)), arg1.method1702(local22 + 2) });
										}
									}
									arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), Static24.method506(Static99.method1654(3, arg0)), arg1.method1702(local22 + 2) });
								}
							}
							arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), Static24.method506(Static99.method1654(2, arg0)), arg1.method1702(local22 + 2) });
						}
					}
					arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), Static24.method506(Static99.method1654(1, arg0)), arg1.method1702(local22 + 2) });
				}
			}
			arg1 = Static49.method782(new Class62[] { arg1.method1693(local22, 0), Static24.method506(Static99.method1654(0, arg0)), arg1.method1702(local22 + 2) });
		}
	}
}
