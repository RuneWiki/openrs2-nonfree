import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!pk;")
	public static Class132 aClass132_14;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public static int anInt884 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[I")
	public static int[] anIntArray62 = new int[2];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILclient!tk;I)V")
	public static void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class159 arg2, @OriginalArg(4) int arg3) {
		if (Static116.aBoolean188) {
			Static126.method1993(arg3, arg1, arg2.anInt5123 + arg3, arg2.anInt5121 + arg1);
		}
		if (Static242.anInt4842 >= 3) {
			if (Static116.aBoolean188) {
				@Pc(24) Class8_Sub1_Sub7 local24 = arg2.method3892(false);
				if (local24 != null) {
					local24.method2811(arg3, arg1);
				}
			} else {
				Static103.method1685(arg3, arg1, arg2.anIntArray410, arg2.anIntArray409);
			}
		} else if (Static116.aBoolean188) {
			((Class8_Sub1_Sub7_Sub2) Static207.aClass8_Sub1_Sub7_7).method2817(arg3, arg1, arg2.anInt5123, arg2.anInt5121, Static207.aClass8_Sub1_Sub7_7.anInt3602 / 2, Static207.aClass8_Sub1_Sub7_7.anInt3603 / 2, (int) Static82.aFloat20, 256, (Class8_Sub1_Sub7_Sub2) arg2.method3892(false));
		} else {
			((Class8_Sub1_Sub7_Sub1) Static207.aClass8_Sub1_Sub7_7).method1636(arg3, arg1, arg2.anInt5123, arg2.anInt5121, Static207.aClass8_Sub1_Sub7_7.anInt3602 / 2, Static207.aClass8_Sub1_Sub7_7.anInt3603 / 2, (int) Static82.aFloat20, arg2.anIntArray410, arg2.anIntArray409);
		}
		Static44.aBooleanArray3[arg0] = true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method624(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				local11[local13] = (byte) local20;
			} else if (local20 == '€') {
				local11[local13] = -128;
			} else if (local20 == '‚') {
				local11[local13] = -126;
			} else if (local20 == 'ƒ') {
				local11[local13] = -125;
			} else if (local20 == '„') {
				local11[local13] = -124;
			} else if (local20 == '…') {
				local11[local13] = -123;
			} else if (local20 == '†') {
				local11[local13] = -122;
			} else if (local20 == '‡') {
				local11[local13] = -121;
			} else if (local20 == 'ˆ') {
				local11[local13] = -120;
			} else if (local20 == '‰') {
				local11[local13] = -119;
			} else if (local20 == 'Š') {
				local11[local13] = -118;
			} else if (local20 == '‹') {
				local11[local13] = -117;
			} else if (local20 == 'Œ') {
				local11[local13] = -116;
			} else if (local20 == 'Ž') {
				local11[local13] = -114;
			} else if (local20 == '‘') {
				local11[local13] = -111;
			} else if (local20 == '’') {
				local11[local13] = -110;
			} else if (local20 == '“') {
				local11[local13] = -109;
			} else if (local20 == '”') {
				local11[local13] = -108;
			} else if (local20 == '•') {
				local11[local13] = -107;
			} else if (local20 == '–') {
				local11[local13] = -106;
			} else if (local20 == '—') {
				local11[local13] = -105;
			} else if (local20 == '˜') {
				local11[local13] = -104;
			} else if (local20 == '™') {
				local11[local13] = -103;
			} else if (local20 == 'š') {
				local11[local13] = -102;
			} else if (local20 == '›') {
				local11[local13] = -101;
			} else if (local20 == 'œ') {
				local11[local13] = -100;
			} else if (local20 == 'ž') {
				local11[local13] = -98;
			} else if (local20 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ZZI)I")
	public static int method625(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(25) boolean local25 = false;
		@Pc(28) int local28 = arg0.length();
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		for (@Pc(39) int local39 = 0; local39 < local28; local39++) {
			@Pc(46) char local46 = arg0.charAt(local39);
			if (local39 == 0) {
				if (local46 == '-') {
					local25 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(72) int local72;
			if (local46 >= '0' && local46 <= '9') {
				local72 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local72 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local72 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local72) {
				throw new NumberFormatException();
			}
			if (local25) {
				local72 = -local72;
			}
			@Pc(119) int local119 = arg1 * local32 + local72;
			if (local119 / arg1 != local32) {
				throw new NumberFormatException();
			}
			local32 = local119;
			local30 = true;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public static void method626() {
		Static160.aClass61_27.method1379();
		Static222.aClass61_41.method1379();
		Static203.aClass61_37.method1379();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!pk;I)Lclient!wd;")
	public static Class8_Sub1_Sub7 method627(@OriginalArg(2) Class132 arg0, @OriginalArg(3) int arg1) {
		return Static247.method4168(arg0, 0, arg1) ? Static54.method869() : null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 method628() {
		@Pc(13) int local13 = Static135.anIntArray225[0] * Static92.anIntArray130[0];
		@Pc(22) byte[] local22 = Static232.aByteArrayArray15[0];
		@Pc(66) Class8_Sub1_Sub7_Sub1 local66;
		if (Static247.aBooleanArray26[0]) {
			@Pc(72) byte[] local72 = Static241.aByteArrayArray16[0];
			@Pc(75) int[] local75 = new int[local13];
			for (@Pc(77) int local77 = 0; local77 < local13; local77++) {
				local75[local77] = (local72[local77] & 0xFF) << 24 | Static147.anIntArray236[local22[local77] & 0xFF];
			}
			local66 = new Class8_Sub1_Sub7_Sub1_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], local75);
		} else {
			@Pc(29) int[] local29 = new int[local13];
			for (@Pc(31) int local31 = 0; local31 < local13; local31++) {
				local29[local31] = Static147.anIntArray236[local22[local31] & 0xFF];
			}
			local66 = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], local29);
		}
		Static147.method2386();
		return local66;
	}
}
