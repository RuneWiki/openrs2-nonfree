import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	public static int anInt2883;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array10;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
	public static int anInt2882 = 0;

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1156 = method2047("Enter your username (V password)3");

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1155 = aClass60_1156;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1157 = method2047("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1158 = method2047("Die Verbindung konnte");

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
	public static int anInt2897 = 0;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
	public static int anInt2898 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!q;B)Z")
	public static boolean method2040(@OriginalArg(0) Class4_Sub17 arg0) {
		if (arg0.anIntArray218 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray218.length; local12++) {
			@Pc(26) int local26 = Static41.method699(arg0, local12);
			@Pc(31) int local31 = arg0.anIntArray222[local12];
			if (arg0.anIntArray218[local12] == 2) {
				if (local26 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray218[local12] == 3) {
				if (local31 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray218[local12] == 4) {
				if (local31 == local26) {
					return false;
				}
			} else if (local31 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)I")
	public static int method2041(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method2042() {
		Static59.aClass48_37.method1393();
		Static62.aClass48_38.method1393();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public static void method2043() {
		aClass60_1158 = null;
		aClass60_1156 = null;
		aClass60_1155 = null;
		aClass4_Sub4_Sub3_Sub1Array10 = null;
		aClass60_1157 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Lclient!ma;")
	public static Class4_Sub4_Sub9 method2045(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub9 local10 = (Class4_Sub4_Sub9) Static84.aClass48_47.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static123.aClass40_87.method1110(arg0, 1);
		local10 = new Class4_Sub4_Sub9();
		if (local20 != null) {
			local10.method1355(arg0, new Class4_Sub13(local20));
		}
		local10.method1354();
		Static84.aClass48_47.method1392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I")
	public static int method2046(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub4_Sub4 local15 = Static89.method1525(arg0);
		@Pc(18) int local18 = local15.anInt1030;
		@Pc(21) int local21 = local15.anInt1034;
		@Pc(24) int local24 = local15.anInt1038;
		@Pc(31) int local31 = Class4_Sub4_Sub1_Sub2.anIntArray289[local24 - local21];
		return Static62.anIntArray168[local18] >> local21 & local31;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;)Lclient!qc;")
	public static Class60 method2047(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class60 local13 = new Class60();
		local13.aByteArray89 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local9 > local19) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(43) int local43 = local6[local19++] & 0xFF;
				local13.aByteArray89[local13.anInt2310++] = (byte) (local27 * 43 + local43 - 1720 - 48);
			} else if (local27 != 0) {
				local13.aByteArray89[local13.anInt2310++] = (byte) local27;
			}
		}
		local13.method1652();
		return local13.method1637();
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public static void method2048() {
		for (@Pc(14) Class4_Sub18 local14 = (Class4_Sub18) Static111.aClass66_12.method1838(); local14 != null; local14 = (Class4_Sub18) Static111.aClass66_12.method1831()) {
			@Pc(19) int local19 = local14.anInt2402;
			if (Static27.method520(local19)) {
				@Pc(25) boolean local25 = true;
				@Pc(29) Class4_Sub17[] local29 = Static82.aClass4_Sub17ArrayArray1[local19];
				for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
					if (local29[local31] != null) {
						local25 = local29[local31].aBoolean103;
						break;
					}
				}
				if (!local25) {
					@Pc(55) int local55 = (int) local14.aLong100;
					@Pc(59) Class4_Sub17 local59 = Static16.method283(local55);
					if (local59 != null) {
						Static130.method2133(local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	public static void method2049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class4_Sub21 local6 = (Class4_Sub21) Static8.aClass70_2.method1939(); local6 != null; local6 = (Class4_Sub21) Static8.aClass70_2.method1936()) {
			if (local6.anInt2769 != -1 || local6.anIntArray302 != null) {
				@Pc(17) int local17 = 0;
				if (local6.anInt2774 < arg1) {
					local17 = arg1 - local6.anInt2774;
				} else if (arg1 < local6.anInt2766) {
					local17 = local6.anInt2766 - arg1;
				}
				if (arg2 > local6.anInt2777) {
					local17 += arg2 - local6.anInt2777;
				} else if (local6.anInt2772 > arg2) {
					local17 += local6.anInt2772 - arg2;
				}
				if (local17 - 64 > local6.anInt2767 || Static107.anInt2537 == 0 || local6.anInt2770 != arg0) {
					if (local6.aClass4_Sub2_Sub1_3 != null) {
						Static119.aClass4_Sub2_Sub3_2.method750(local6.aClass4_Sub2_Sub1_3);
						local6.aClass4_Sub2_Sub1_3 = null;
					}
					if (local6.aClass4_Sub2_Sub1_2 != null) {
						Static119.aClass4_Sub2_Sub3_2.method750(local6.aClass4_Sub2_Sub1_2);
						local6.aClass4_Sub2_Sub1_2 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(126) int local126 = Static107.anInt2537 * (local6.anInt2767 - local17) / local6.anInt2767;
					if (local6.aClass4_Sub2_Sub1_3 != null) {
						local6.aClass4_Sub2_Sub1_3.method100(local126);
					} else if (local6.anInt2769 >= 0) {
						@Pc(144) Class73 local144 = Static137.method2006(Static2.aClass40_Sub1_9, local6.anInt2769, 0);
						if (local144 != null) {
							@Pc(151) Class4_Sub1_Sub1 local151 = local144.method2005().method707(Static37.aClass77_1);
							@Pc(156) Class4_Sub2_Sub1 local156 = Static132.method106(local151, local126);
							local156.method86(-1);
							Static119.aClass4_Sub2_Sub3_2.method749(local156);
							local6.aClass4_Sub2_Sub1_3 = local156;
						}
					}
					if (local6.aClass4_Sub2_Sub1_2 != null) {
						local6.aClass4_Sub2_Sub1_2.method100(local126);
						if (!local6.aClass4_Sub2_Sub1_2.method2125()) {
							local6.aClass4_Sub2_Sub1_2 = null;
						}
					} else if (local6.anIntArray302 != null && (local6.anInt2765 -= arg3) <= 0) {
						@Pc(204) int local204 = (int) ((double) local6.anIntArray302.length * Math.random());
						@Pc(212) Class73 local212 = Static137.method2006(Static2.aClass40_Sub1_9, local6.anIntArray302[local204], 0);
						if (local212 != null) {
							@Pc(219) Class4_Sub1_Sub1 local219 = local212.method2005().method707(Static37.aClass77_1);
							@Pc(224) Class4_Sub2_Sub1 local224 = Static132.method106(local219, local126);
							local224.method86(0);
							Static119.aClass4_Sub2_Sub3_2.method749(local224);
							local6.anInt2765 = local6.anInt2779 + (int) ((double) (local6.anInt2764 - local6.anInt2779) * Math.random());
							local6.aClass4_Sub2_Sub1_2 = local224;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
	public static void method2051() {
		Static44.aBoolean41 = true;
		Static61.aBoolean57 = true;
	}
}
