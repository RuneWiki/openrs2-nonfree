import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!we", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray59;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_184 = new Class268(2, -1);

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[I")
	public static final int[] anIntArray637 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method8750(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BB)V")
	public static void method8753(@OriginalArg(0) byte arg0) {
		if (Static312.aByteArrayArrayArray17 == null) {
			Static312.aByteArrayArrayArray17 = new byte[4][Static442.anInt7975][Static284.anInt7916];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static442.anInt7975; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static284.anInt7916; local22++) {
					Static312.aByteArrayArrayArray17[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public static void method8755(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub9 local16 = Static144.method2332(2, arg0);
		local16.method3722();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method8756(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static563.method8109(local6.width, local6.height);
		if (Static469.anInt8256 == 1) {
			Static117.aClass100_5.method8797(arg0, Static164.anInt3399, Static320.anInt6116);
		} else {
			Static117.aClass100_5.method8797(arg0, Static609.anInt10076, Static8.anInt159);
		}
	}
}
