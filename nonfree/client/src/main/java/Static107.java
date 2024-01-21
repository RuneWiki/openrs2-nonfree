import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array9;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1548 = Static118.method2249("Connection timed out)3");

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1545 = aClass65_1548;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1546 = Static118.method2249("leuchten1:");

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1547 = Static118.method2249("Konfig geladen)3");

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt2621 = 0;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1549 = Static118.method2249("Mem:");

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public static int anInt2627 = 10;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public static int anInt2630 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!sd;IIZLclient!sd;)Lclient!sg;")
	public static Class1_Sub2_Sub22 method1972(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class60 arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(10) int[] local10 = arg2.method2320(arg1);
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(21) byte[] local21 = arg2.method2336(local10[local12], arg1);
			if (local21 == null) {
				local5 = false;
			} else {
				@Pc(40) int local40 = (local21[0] & 0xFF) << 8 | local21[1] & 0xFF;
				@Pc(48) byte[] local48 = arg0.method2336(0, local40);
				if (local48 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub22(arg2, arg0, arg1, false);
		} catch (@Pc(93) Exception local93) {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!sd;Lclient!sd;I)V")
	public static void method1974(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1) {
		Static53.aClass60_12 = arg0;
		Static33.aClass60_6 = arg1;
		Static209.anInt4437 = Static33.aClass60_6.method2342(3);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(21) int local21 = arg2 - arg6;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(42) int local42 = local16 * local16;
		@Pc(46) int local46 = local21 * local21;
		@Pc(50) int local50 = local29 << 1;
		@Pc(54) int local54 = local46 << 1;
		@Pc(58) int local58 = local25 << 1;
		@Pc(62) int local62 = local42 << 1;
		@Pc(66) int local66 = arg2 << 1;
		@Pc(70) int local70 = local21 << 1;
		@Pc(79) int local79 = local25 * (1 - local66) + local50;
		@Pc(88) int local88 = local29 - (local66 - 1) * local58;
		@Pc(98) int local98 = (1 - local70) * local42 + local54;
		@Pc(107) int local107 = local46 - local62 * (local70 - 1);
		@Pc(111) int local111 = local25 << 2;
		@Pc(115) int local115 = local42 << 2;
		@Pc(119) int local119 = local29 << 2;
		@Pc(123) int local123 = local46 << 2;
		@Pc(127) int local127 = local50 * 3;
		@Pc(133) int local133 = local58 * (local66 - 3);
		@Pc(137) int local137 = local54 * 3;
		@Pc(143) int local143 = (local70 - 3) * local62;
		@Pc(149) int local149 = (arg2 - 1) * local111;
		@Pc(151) int local151 = local123;
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (arg3 >= Static206.anInt4385 && Static133.anInt3309 >= arg3) {
			@Pc(169) int[] local169 = Static40.anIntArrayArray11[arg3];
			local178 = Static100.method1896(Static23.anInt685, arg0 - arg5, Static71.anInt1744);
			local186 = Static100.method1896(Static23.anInt685, arg5 + arg0, Static71.anInt1744);
			local194 = Static100.method1896(Static23.anInt685, arg0 - local16, Static71.anInt1744);
			local202 = Static100.method1896(Static23.anInt685, arg0 + local16, Static71.anInt1744);
			Static51.method893(arg4, local169, local194, local178);
			Static51.method893(arg1, local169, local202, local194);
			Static51.method893(arg4, local169, local186, local202);
		}
		@Pc(224) int local224 = local119;
		@Pc(230) int local230 = (local21 - 1) * local115;
		while (local9 > 0) {
			if (local79 < 0) {
				while (local79 < 0) {
					local88 += local224;
					local79 += local127;
					local7++;
					local224 += local119;
					local127 += local119;
				}
			}
			if (local88 < 0) {
				local7++;
				local79 += local127;
				local127 += local119;
				local88 += local224;
				local224 += local119;
			}
			local79 += -local149;
			local149 -= local111;
			local88 += -local133;
			local133 -= local111;
			@Pc(312) boolean local312 = local9 <= local21;
			local9--;
			local178 = arg3 - local9;
			local186 = local9 + arg3;
			if (local312) {
				if (local98 < 0) {
					while (local98 < 0) {
						local11++;
						local98 += local137;
						local107 += local151;
						local151 += local123;
						local137 += local123;
					}
				}
				if (local107 < 0) {
					local107 += local151;
					local98 += local137;
					local137 += local123;
					local11++;
					local151 += local123;
				}
				local98 += -local230;
				local107 += -local143;
				local230 -= local115;
				local143 -= local115;
			}
			if (Static206.anInt4385 <= local186 && Static133.anInt3309 >= local178) {
				local194 = Static100.method1896(Static23.anInt685, arg0 + local7, Static71.anInt1744);
				local202 = Static100.method1896(Static23.anInt685, arg0 - local7, Static71.anInt1744);
				if (local312) {
					@Pc(451) int local451 = Static100.method1896(Static23.anInt685, local11 + arg0, Static71.anInt1744);
					@Pc(461) int local461 = Static100.method1896(Static23.anInt685, arg0 - local11, Static71.anInt1744);
					@Pc(468) int[] local468;
					if (Static206.anInt4385 <= local178) {
						local468 = Static40.anIntArrayArray11[local178];
						Static51.method893(arg4, local468, local461, local202);
						Static51.method893(arg1, local468, local451, local461);
						Static51.method893(arg4, local468, local194, local451);
					}
					if (local186 <= Static133.anInt3309) {
						local468 = Static40.anIntArrayArray11[local186];
						Static51.method893(arg4, local468, local461, local202);
						Static51.method893(arg1, local468, local451, local461);
						Static51.method893(arg4, local468, local194, local451);
					}
				} else {
					if (Static206.anInt4385 <= local178) {
						Static51.method893(arg4, Static40.anIntArrayArray11[local178], local194, local202);
					}
					if (local186 <= Static133.anInt3309) {
						Static51.method893(arg4, Static40.anIntArrayArray11[local186], local194, local202);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass10_1 != null && local7.aClass10_1.aLong20 == arg3) {
			return true;
		} else if (local7.aClass88_1 != null && local7.aClass88_1.aLong138 == arg3) {
			return true;
		} else if (local7.aClass33_1 != null && local7.aClass33_1.aLong53 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1677; local46++) {
				if (local7.aClass54Array2[local46].aLong83 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1977(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static161.method2762(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static164.aClass14_4.anApplet1 != null) {
				@Pc(106) Class34 local106 = Static164.aClass14_4.method624(new URL(Static164.aClass14_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static134.anInt3339 + "&u=" + Static141.aLong108 + "&v1=" + Static32.aString1 + "&v2=" + Static32.aString3 + "&e=" + local5));
				while (local106.anInt1727 == 0) {
					Static135.method2569(1L);
				}
				if (local106.anInt1727 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local106.anObject1;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
