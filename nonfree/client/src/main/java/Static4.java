import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
	public static int anInt95;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_1 = new Class114("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
	public static int method208(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(13) int local13 = arg1;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg3[local15 + arg2] = (byte) local22;
			} else if (local22 == '€') {
				arg3[arg2 + local15] = -128;
			} else if (local22 == '‚') {
				arg3[local15 + arg2] = -126;
			} else if (local22 == 'ƒ') {
				arg3[arg2 + local15] = -125;
			} else if (local22 == '„') {
				arg3[arg2 + local15] = -124;
			} else if (local22 == '…') {
				arg3[local15 + arg2] = -123;
			} else if (local22 == '†') {
				arg3[local15 + arg2] = -122;
			} else if (local22 == '‡') {
				arg3[local15 + arg2] = -121;
			} else if (local22 == 'ˆ') {
				arg3[arg2 + local15] = -120;
			} else if (local22 == '‰') {
				arg3[local15 + arg2] = -119;
			} else if (local22 == 'Š') {
				arg3[arg2 + local15] = -118;
			} else if (local22 == '‹') {
				arg3[arg2 + local15] = -117;
			} else if (local22 == 'Œ') {
				arg3[local15 + arg2] = -116;
			} else if (local22 == 'Ž') {
				arg3[arg2 + local15] = -114;
			} else if (local22 == '‘') {
				arg3[arg2 + local15] = -111;
			} else if (local22 == '’') {
				arg3[local15 + arg2] = -110;
			} else if (local22 == '“') {
				arg3[local15 + arg2] = -109;
			} else if (local22 == '”') {
				arg3[arg2 + local15] = -108;
			} else if (local22 == '•') {
				arg3[local15 + arg2] = -107;
			} else if (local22 == '–') {
				arg3[arg2 + local15] = -106;
			} else if (local22 == '—') {
				arg3[local15 + arg2] = -105;
			} else if (local22 == '˜') {
				arg3[arg2 + local15] = -104;
			} else if (local22 == '™') {
				arg3[local15 + arg2] = -103;
			} else if (local22 == 'š') {
				arg3[arg2 + local15] = -102;
			} else if (local22 == '›') {
				arg3[local15 + arg2] = -101;
			} else if (local22 == 'œ') {
				arg3[local15 + arg2] = -100;
			} else if (local22 == 'ž') {
				arg3[local15 + arg2] = -98;
			} else if (local22 == 'Ÿ') {
				arg3[local15 + arg2] = -97;
			} else {
				arg3[arg2 + local15] = 63;
			}
		}
		return local13;
	}
}
