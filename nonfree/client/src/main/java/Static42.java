import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public static int anInt1273;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!he;")
	public static final Class135 aClass135_2 = new Class135("LIVE", 0);

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "[Lclient!l;")
	public static final Class4_Sub1_Sub2_Sub1_Sub2[] aClass4_Sub1_Sub2_Sub1_Sub2Array1 = new Class4_Sub1_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([BIIILjava/lang/String;I)I")
	public static int method1354(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(15) int local15 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[local17 + arg2] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg2] = -128;
			} else if (local25 == '‚') {
				arg0[local17 + arg2] = -126;
			} else if (local25 == 'ƒ') {
				arg0[local17 + arg2] = -125;
			} else if (local25 == '„') {
				arg0[arg2 + local17] = -124;
			} else if (local25 == '…') {
				arg0[local17 + arg2] = -123;
			} else if (local25 == '†') {
				arg0[arg2 + local17] = -122;
			} else if (local25 == '‡') {
				arg0[local17 + arg2] = -121;
			} else if (local25 == 'ˆ') {
				arg0[arg2 + local17] = -120;
			} else if (local25 == '‰') {
				arg0[arg2 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[arg2 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[local17 + arg2] = -117;
			} else if (local25 == 'Œ') {
				arg0[arg2 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg2] = -114;
			} else if (local25 == '‘') {
				arg0[local17 + arg2] = -111;
			} else if (local25 == '’') {
				arg0[arg2 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg2 + local17] = -109;
			} else if (local25 == '”') {
				arg0[local17 + arg2] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg2] = -107;
			} else if (local25 == '–') {
				arg0[arg2 + local17] = -106;
			} else if (local25 == '—') {
				arg0[arg2 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg2] = -104;
			} else if (local25 == '™') {
				arg0[arg2 + local17] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg2] = -102;
			} else if (local25 == '›') {
				arg0[arg2 + local17] = -101;
			} else if (local25 == 'œ') {
				arg0[arg2 + local17] = -100;
			} else if (local25 == 'ž') {
				arg0[arg2 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg2] = -97;
			} else {
				arg0[arg2 + local17] = 63;
			}
		}
		return local15;
	}
}
