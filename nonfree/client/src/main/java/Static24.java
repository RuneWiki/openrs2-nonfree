import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!ah;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Lclient!qh;")
	public static Class1_Sub5_Sub18 aClass1_Sub5_Sub18_1;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
	public static int[] anIntArray55 = new int[3];

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt490 = 0;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString16 = "yellow:";

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public static volatile int anInt491 = -1;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!pn;")
	public static Class1_Sub25 aClass1_Sub25_1 = new Class1_Sub25(0, 0);

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!mi;")
	public static Class112 aClass112_2 = new Class112(64);

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public static int anInt500 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method473() {
		Static167.aClass119_12 = null;
		Static87.anInt1879 = 2;
		Static1.aBoolean6 = false;
		Static118.anInt2421 = 0;
		Static289.anInt5257 = -1;
		Static101.anInt2158 = -1;
		Static63.anInt1315 = 1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	public static void method474(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static71.aBoolean165 && arg0) {
			local11 = Static295.aByteArrayArray21;
			local13 = 1;
		} else {
			local13 = 4;
			local11 = Static120.aByteArrayArray8;
		}
		@Pc(27) int local27 = local11.length;
		@Pc(29) int local29;
		@Pc(54) int local54;
		for (local29 = 0; local29 < local27; local29++) {
			@Pc(38) int[] local38 = null;
			@Pc(42) byte[] local42 = local11[local29];
			@Pc(48) int local48 = Static135.anIntArray209[local29] >> 8;
			local54 = Static135.anIntArray209[local29] & 0xFF;
			@Pc(61) int local61 = local54 * 64 - Static135.anInt2659;
			@Pc(67) int local67 = local48 * 64 - Static38.anInt714;
			if (local42 != null) {
				Static246.method3875();
				local38 = Static295.method4415(Static122.aClass60Array1, local61, Static135.anInt2659, local67, Static38.anInt714, arg0, local42);
			}
			if (!arg0 && Static130.anInt2581 / 8 == local48 && Static133.anInt2638 / 8 == local54) {
				if (local38 == null) {
					Static57.anInt1224 = -1;
				} else {
					Static57.anInt1224 = local38[0];
					Static44.anInt1030 = local38[4];
					Static277.anInt5091 = local38[1];
					Static310.anInt5533 = local38[2];
					Static296.anInt828 = local38[3];
				}
			}
		}
		for (local29 = 0; local29 < local27; local29++) {
			@Pc(140) int local140 = (Static135.anIntArray209[local29] >> 8) * 64 - Static38.anInt714;
			@Pc(151) int local151 = (Static135.anIntArray209[local29] & 0xFF) * 64 - Static135.anInt2659;
			@Pc(155) byte[] local155 = local11[local29];
			if (local155 == null && Static133.anInt2638 < 800) {
				Static246.method3875();
				for (local54 = 0; local54 < local13; local54++) {
					Static64.method1132(local140, 64, 64, local151, local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!nm;Z)V")
	public static void method475(@OriginalArg(0) Class119 arg0) {
		Static86.aClass119_37 = arg0;
		Static110.anInt2280 = Static86.aClass119_37.method3217(4);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ZILclient!nm;)Lclient!ho;")
	public static Class78 method476(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class119 arg2) {
		@Pc(10) int local10 = arg2.method3241(arg0);
		if (local10 == -1) {
			return new Class78(0);
		}
		@Pc(24) int[] local24 = arg2.method3246(local10);
		@Pc(30) Class78 local30 = new Class78(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt2253 > local32) {
				@Pc(50) Class1_Sub13 local50 = new Class1_Sub13(arg2.method3235(local24[local34++], local10));
				@Pc(54) int local54 = local50.method1860();
				@Pc(58) int local58 = local50.method1879();
				@Pc(62) int local62 = local50.method1853();
				if (!arg1 && local62 == 1) {
					local30.anInt2253--;
				} else {
					local30.anIntArray157[local32] = local54;
					local30.aClass1_Sub5_Sub1Array1[local32] = new Class1_Sub5_Sub1();
					local30.aClass1_Sub5_Sub1Array1[local32].anInt359 = local58;
					local32++;
				}
			}
			return local30;
		}
	}
}
