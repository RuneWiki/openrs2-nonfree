import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	public static int anInt4048;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!ao;")
	public static Class8_Sub4 aClass8_Sub4_2;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public static int anInt4050;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[C")
	public static char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pk;Lclient!pk;ILclient!pk;)V")
	public static void method3087(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) Class132 arg2) {
		Static69.aClass132_26 = arg0;
		Static75.aClass132_27 = arg1;
		Static178.aClass132_62 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method3088(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = arg1 ? 32768 : 0;
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(24) short[] local24 = new short[16];
		@Pc(32) int local32 = local14 + (arg1 ? Static227.anInt4630 : Static12.anInt286);
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = local14; local36 < local32; local36++) {
			@Pc(47) Class8_Sub1_Sub12 local47 = Static115.method1854(local36);
			if (local47.aBoolean336 && local47.method3129().toLowerCase().indexOf(local21) != -1) {
				if (local34 >= 50) {
					Static170.aShortArray27 = null;
					Static234.anInt4711 = -1;
					return;
				}
				if (local34 >= local24.length) {
					@Pc(84) short[] local84 = new short[local24.length * 2];
					for (@Pc(86) int local86 = 0; local86 < local34; local86++) {
						local84[local86] = local24[local86];
					}
					local24 = local84;
				}
				local24[local34++] = (short) local36;
			}
		}
		Static234.anInt4711 = local34;
		Static208.anInt4316 = 0;
		Static170.aShortArray27 = local24;
		@Pc(122) String[] local122 = new String[Static234.anInt4711];
		for (@Pc(124) int local124 = 0; local124 < Static234.anInt4711; local124++) {
			local122[local124] = Static115.method1854(local24[local124]).method3129();
		}
		Static254.method3805(local122, Static170.aShortArray27);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method3090(@OriginalArg(0) Class8_Sub2 arg0) {
		@Pc(5) int local5 = arg0.method2382();
		Static228.aClass39Array1 = new Class39[local5];
		@Pc(10) int local10;
		for (local10 = 0; local10 < local5; local10++) {
			Static228.aClass39Array1[local10] = new Class39();
			Static228.aClass39Array1[local10].anInt1150 = arg0.method2382();
			Static228.aClass39Array1[local10].aString45 = arg0.method2364();
		}
		Static270.anInt5333 = arg0.method2382();
		Static10.anInt104 = arg0.method2382();
		Static94.anInt1963 = arg0.method2382();
		Static91.aClass13_Sub1Array2 = new Class13_Sub1[Static10.anInt104 + 1 - Static270.anInt5333];
		for (local10 = 0; local10 < Static94.anInt1963; local10++) {
			@Pc(68) int local68 = arg0.method2382();
			@Pc(76) Class13_Sub1 local76 = Static91.aClass13_Sub1Array2[local68] = new Class13_Sub1();
			local76.anInt3520 = arg0.method2334();
			local76.anInt3515 = arg0.method2352();
			local76.anInt3528 = local68 + Static270.anInt5333;
			local76.aString124 = arg0.method2364();
			local76.aString123 = arg0.method2364();
		}
		Static285.anInt5618 = arg0.method2352();
		Static158.aBoolean272 = true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	public static void method3091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class141 local13 = local7.aClass141_1;
		if (local13 != null) {
			local13.anInt4613 = local13.anInt4613 * arg3 / 16;
			local13.anInt4607 = local13.anInt4607 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lclient!kl;")
	public static Class97 method3092(@OriginalArg(1) int arg0) {
		@Pc(10) Class97 local10 = (Class97) Static59.aClass61_9.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static239.aClass132_81.method3194(1, arg0);
		local10 = new Class97();
		if (local22 != null) {
			local10.method2242(new Class8_Sub2(local22), arg0);
		}
		Static59.aClass61_9.method1377((long) arg0, local10);
		return local10;
	}
}
