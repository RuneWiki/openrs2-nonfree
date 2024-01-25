import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!gb;")
	public static Class88 aClass88_2;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public static int anInt1309 = 1;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_41 = new Class12(104, -2);

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
	public static final int[] anIntArray63 = new int[200];

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_42 = new Class12(18, 3);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public static void method1145() {
		Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
		Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
		Static338.anInt5778 = 0;
		Static114.aClass12_56 = null;
		Static148.aClass12_78 = null;
		Static231.aClass12_112 = null;
		Static371.aClass12_160 = null;
		Static245.anInt4432 = 0;
		Static264.anInt4796 = 0;
		Static432.method5705();
		Static385.method5053();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static28.aClass25_Sub5_Sub1_Sub2Array1[local36] = null;
		}
		Static447.aClass25_Sub5_Sub1_Sub2_4 = null;
		for (@Pc(52) int local52 = 0; local52 < Static87.aClass25_Sub5_Sub1_Sub1Array6.length; local52++) {
			@Pc(58) Class25_Sub5_Sub1_Sub1 local58 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local52];
			if (local58 != null) {
				local58.anInt4238 = -1;
			}
		}
		Static233.method3344();
		Static333.anInt5693 = 1;
		Static203.method4783(9);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static369.aBooleanArray23[local81] = true;
		}
		Static107.method1707();
		Static195.aLong115 = 0L;
		Static247.aClass1_Sub42_1 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1146(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) byte[] local19 = new byte[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local19[local21] = (byte) local27;
			} else if (local27 == '€') {
				local19[local21] = -128;
			} else if (local27 == '‚') {
				local19[local21] = -126;
			} else if (local27 == 'ƒ') {
				local19[local21] = -125;
			} else if (local27 == '„') {
				local19[local21] = -124;
			} else if (local27 == '…') {
				local19[local21] = -123;
			} else if (local27 == '†') {
				local19[local21] = -122;
			} else if (local27 == '‡') {
				local19[local21] = -121;
			} else if (local27 == 'ˆ') {
				local19[local21] = -120;
			} else if (local27 == '‰') {
				local19[local21] = -119;
			} else if (local27 == 'Š') {
				local19[local21] = -118;
			} else if (local27 == '‹') {
				local19[local21] = -117;
			} else if (local27 == 'Œ') {
				local19[local21] = -116;
			} else if (local27 == 'Ž') {
				local19[local21] = -114;
			} else if (local27 == '‘') {
				local19[local21] = -111;
			} else if (local27 == '’') {
				local19[local21] = -110;
			} else if (local27 == '“') {
				local19[local21] = -109;
			} else if (local27 == '”') {
				local19[local21] = -108;
			} else if (local27 == '•') {
				local19[local21] = -107;
			} else if (local27 == '–') {
				local19[local21] = -106;
			} else if (local27 == '—') {
				local19[local21] = -105;
			} else if (local27 == '˜') {
				local19[local21] = -104;
			} else if (local27 == '™') {
				local19[local21] = -103;
			} else if (local27 == 'š') {
				local19[local21] = -102;
			} else if (local27 == '›') {
				local19[local21] = -101;
			} else if (local27 == 'œ') {
				local19[local21] = -100;
			} else if (local27 == 'ž') {
				local19[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local19[local21] = -97;
			} else {
				local19[local21] = 63;
			}
		}
		return local19;
	}
}
