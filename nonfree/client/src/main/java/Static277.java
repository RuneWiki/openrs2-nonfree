import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt5015;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public static int anInt5010 = -1;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method4359(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				local11[local19] = (byte) local25;
			} else if (local25 == '€') {
				local11[local19] = -128;
			} else if (local25 == '‚') {
				local11[local19] = -126;
			} else if (local25 == 'ƒ') {
				local11[local19] = -125;
			} else if (local25 == '„') {
				local11[local19] = -124;
			} else if (local25 == '…') {
				local11[local19] = -123;
			} else if (local25 == '†') {
				local11[local19] = -122;
			} else if (local25 == '‡') {
				local11[local19] = -121;
			} else if (local25 == 'ˆ') {
				local11[local19] = -120;
			} else if (local25 == '‰') {
				local11[local19] = -119;
			} else if (local25 == 'Š') {
				local11[local19] = -118;
			} else if (local25 == '‹') {
				local11[local19] = -117;
			} else if (local25 == 'Œ') {
				local11[local19] = -116;
			} else if (local25 == 'Ž') {
				local11[local19] = -114;
			} else if (local25 == '‘') {
				local11[local19] = -111;
			} else if (local25 == '’') {
				local11[local19] = -110;
			} else if (local25 == '“') {
				local11[local19] = -109;
			} else if (local25 == '”') {
				local11[local19] = -108;
			} else if (local25 == '•') {
				local11[local19] = -107;
			} else if (local25 == '–') {
				local11[local19] = -106;
			} else if (local25 == '—') {
				local11[local19] = -105;
			} else if (local25 == '˜') {
				local11[local19] = -104;
			} else if (local25 == '™') {
				local11[local19] = -103;
			} else if (local25 == 'š') {
				local11[local19] = -102;
			} else if (local25 == '›') {
				local11[local19] = -101;
			} else if (local25 == 'œ') {
				local11[local19] = -100;
			} else if (local25 == 'ž') {
				local11[local19] = -98;
			} else if (local25 == 'Ÿ') {
				local11[local19] = -97;
			} else {
				local11[local19] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qa;Lclient!dda;BLclient!dda;)V")
	public static void method4361(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(3) Class53 arg2) {
		Static182.aClass52_7 = Static337.method5338(Static281.anInt5177, arg2);
		Static301.aClass47_3 = arg0.method6078(Static182.aClass52_7, Static558.method6365(arg1, Static281.anInt5177));
		Static124.aClass52_6 = Static337.method5338(Static184.anInt3392, arg2);
		Static477.aClass47_4 = arg0.method6078(Static124.aClass52_6, Static558.method6365(arg1, Static184.anInt3392));
		Static188.aClass52_2 = Static337.method5338(Static16.anInt363, arg2);
		Static175.aClass47_1 = arg0.method6078(Static188.aClass52_2, Static558.method6365(arg1, Static16.anInt363));
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
	public static void method4362(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static99.aBooleanArray13[arg0]) {
			Static298.aClass53_85.method1610(arg0);
			Static235.aClass310ArrayArray2[arg0] = null;
			Static196.aClass310ArrayArray1[arg0] = null;
			Static99.aBooleanArray13[arg0] = false;
		}
	}
}
