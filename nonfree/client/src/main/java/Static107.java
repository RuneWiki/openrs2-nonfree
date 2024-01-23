import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public static int anInt2466 = 0;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_798 = Static200.method3116("Benutzen");

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "Lclient!kh;")
	public static Class60 aClass60_799 = Static200.method3116("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "Lclient!kh;")
	public static Class60 aClass60_800 = Static200.method3116("Mitglieder)2Welt");

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "Lclient!db;")
	public static Class19 aClass19_10 = new Class19();

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "Lclient!kh;")
	public static Class60 aClass60_801 = Static200.method3116("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "Lclient!kh;")
	public static Class60 aClass60_802 = Static200.method3116("gr-Un:");

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIBI)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static130.anInt2847 = arg0;
		Static214.anInt4572 = 0;
		Static200.anInt4273 = arg1;
		Static141.anInt3163 = 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
	public static int method1853(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Z")
	public static boolean method1854() {
		@Pc(13) Class42 local13 = Static85.aClass42_1;
		synchronized (Static85.aClass42_1) {
			if (Static82.anInt1945 == Static141.anInt3165) {
				return false;
			} else {
				Static199.anInt4262 = Static36.anIntArray508[Static141.anInt3165];
				Static128.anInt2812 = Static177.anIntArray498[Static141.anInt3165];
				Static141.anInt3165 = Static141.anInt3165 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZIIBLclient!vb;)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) Class7_Sub1 arg5) {
		@Pc(16) long local16 = (long) (arg1 + (arg3 << 16));
		@Pc(22) Class1_Sub1_Sub20 local22 = (Class1_Sub1_Sub20) Static85.aClass33_5.method1071(local16);
		if (local22 != null) {
			return;
		}
		local22 = (Class1_Sub1_Sub20) Static204.aClass33_17.method1071(local16);
		if (local22 != null) {
			return;
		}
		local22 = (Class1_Sub1_Sub20) Static25.aClass33_2.method1071(local16);
		if (local22 == null) {
			if (!arg2) {
				local22 = (Class1_Sub1_Sub20) Static64.aClass33_3.method1071(local16);
				if (local22 != null) {
					return;
				}
			}
			local22 = new Class1_Sub1_Sub20();
			local22.aClass7_Sub1_21 = arg5;
			local22.anInt3283 = arg0;
			local22.aByte10 = arg4;
			if (arg2) {
				Static85.aClass33_5.method1072(local16, local22);
				Static43.anInt924++;
			} else {
				Static34.aClass52_1.method1671(local22);
				Static25.aClass33_2.method1072(local16, local22);
				Static32.anInt813++;
			}
		} else if (arg2) {
			local22.method3434();
			Static85.aClass33_5.method1072(local16, local22);
			Static43.anInt924++;
			Static32.anInt813--;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Lclient!ah;")
	public static Class6 method1857(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static82.aClass6ArrayArray1[local7] == null || Static82.aClass6ArrayArray1[local7][local16] == null) {
			@Pc(30) boolean local30 = Static199.method3112(local7);
			if (!local30) {
				return null;
			}
		}
		return Static82.aClass6ArrayArray1[local7][local16];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)I")
	public static int method1858(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public static void method1859() {
		Static157.aClass39_19.method1158();
		Static60.aClass27_35.method963();
		Static141.aClass39_15.method1158();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!kh;Lclient!ah;)Lclient!kh;")
	public static Class60 method1860(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.method1815(Static38.aClass60_291) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(24) int local24 = arg0.method1815(Static191.aClass60_1378);
			if (local24 == -1) {
				while (true) {
					local24 = arg0.method1815(Static124.aClass60_938);
					if (local24 == -1) {
						while (true) {
							local24 = arg0.method1815(Static94.aClass60_705);
							if (local24 == -1) {
								while (true) {
									local24 = arg0.method1815(Static85.aClass60_657);
									if (local24 == -1) {
										while (true) {
											local24 = arg0.method1815(Static64.aClass60_506);
											if (local24 == -1) {
												while (true) {
													local24 = arg0.method1815(Static146.aClass60_1130);
													if (local24 == -1) {
														return arg0;
													}
													@Pc(237) Class60 local237 = Static149.aClass60_1155;
													if (Static140.aClass36_7 != null) {
														local237 = Static50.method1423(Static140.aClass36_7.anInt1501);
														try {
															if (Static140.aClass36_7.anObject2 != null) {
																@Pc(253) byte[] local253 = ((String) Static140.aClass36_7.anObject2).getBytes("ISO-8859-1");
																local237 = Static102.method1755(local253.length, 0, local253);
															}
														} catch (@Pc(262) UnsupportedEncodingException local262) {
														}
													}
													arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), local237, arg0.method1818(local24 + 4) });
												}
											}
											arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), Static115.method1975(Static28.method2168(4, arg1)), arg0.method1818(local24 + 2) });
										}
									}
									arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), Static115.method1975(Static28.method2168(3, arg1)), arg0.method1818(local24 + 2) });
								}
							}
							arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), Static115.method1975(Static28.method2168(2, arg1)), arg0.method1818(local24 + 2) });
						}
					}
					arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), Static115.method1975(Static28.method2168(1, arg1)), arg0.method1818(local24 + 2) });
				}
			}
			arg0 = Static34.method611(new Class60[] { arg0.method1797(0, local24), Static115.method1975(Static28.method2168(0, arg1)), arg0.method1818(local24 + 2) });
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	public static void method1861() {
		Static188.aClass27_106.method963();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)V")
	public static void method1862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static104.method1768(arg0 - arg3, arg0 - -arg3, arg4, Static148.anIntArrayArray78[arg1]);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg2;
		@Pc(27) int local27 = arg3 * arg3;
		@Pc(31) int local31 = local27 << 1;
		@Pc(44) int local44 = arg2 << 1;
		@Pc(48) int local48 = arg2 * arg2;
		@Pc(52) int local52 = local27 << 2;
		@Pc(61) int local61 = local48 - (local44 - 1) * local31;
		@Pc(65) int local65 = local48 << 2;
		@Pc(71) int local71 = local65;
		@Pc(79) int local79 = ((arg2 << 1) - 3) * local31;
		@Pc(83) int local83 = local48 << 1;
		@Pc(91) int local91 = local27 * (1 - local44) + local83;
		@Pc(97) int local97 = (arg2 - 1) * local52;
		@Pc(105) int local105 = local83 * 3;
		while (local23 > 0) {
			if (local91 < 0) {
				while (local91 < 0) {
					local91 += local105;
					local61 += local71;
					local105 += local65;
					local71 += local65;
					local21++;
				}
			}
			if (local61 < 0) {
				local21++;
				local91 += local105;
				local105 += local65;
				local61 += local71;
				local71 += local65;
			}
			local23--;
			@Pc(158) int local158 = arg1 - local23;
			local91 += -local97;
			local61 += -local79;
			local97 -= local52;
			local79 -= local52;
			@Pc(180) int local180 = arg1 + local23;
			@Pc(184) int local184 = local21 + arg0;
			@Pc(188) int local188 = arg0 - local21;
			Static104.method1768(local188, local184, arg4, Static148.anIntArrayArray78[local158]);
			Static104.method1768(local188, local184, arg4, Static148.anIntArrayArray78[local180]);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)I")
	public static int method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg1) {
			return arg0;
		} else if (arg1 <= arg2) {
			return arg1;
		} else {
			return arg2;
		}
	}
}
