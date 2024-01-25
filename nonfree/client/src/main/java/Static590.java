import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static int anInt10098;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "J")
	public static long aLong264;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "[Lclient!ak;")
	public static final Class14_Sub3_Sub1[] aClass14_Sub3_Sub1Array4 = new Class14_Sub3_Sub1[14];

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[Lclient!wm;")
	public static final Class390[] aClass390Array1 = new Class390[8];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[BILjava/lang/String;I)I")
	public static int method8408(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(21) int local21 = arg3;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(31) char local31 = arg2.charAt(local23);
			if (local31 > '\u0000' && local31 < '\u0080' || !(local31 < ' ' || local31 > 'ÿ')) {
				arg0[local23 + arg1] = (byte) local31;
			} else if (local31 == '€') {
				arg0[local23 + arg1] = -128;
			} else if (local31 == '‚') {
				arg0[arg1 + local23] = -126;
			} else if (local31 == 'ƒ') {
				arg0[arg1 + local23] = -125;
			} else if (local31 == '„') {
				arg0[arg1 + local23] = -124;
			} else if (local31 == '…') {
				arg0[arg1 + local23] = -123;
			} else if (local31 == '†') {
				arg0[arg1 + local23] = -122;
			} else if (local31 == '‡') {
				arg0[local23 + arg1] = -121;
			} else if (local31 == 'ˆ') {
				arg0[local23 + arg1] = -120;
			} else if (local31 == '‰') {
				arg0[arg1 + local23] = -119;
			} else if (local31 == 'Š') {
				arg0[arg1 + local23] = -118;
			} else if (local31 == '‹') {
				arg0[local23 + arg1] = -117;
			} else if (local31 == 'Œ') {
				arg0[local23 + arg1] = -116;
			} else if (local31 == 'Ž') {
				arg0[local23 + arg1] = -114;
			} else if (local31 == '‘') {
				arg0[arg1 + local23] = -111;
			} else if (local31 == '’') {
				arg0[arg1 + local23] = -110;
			} else if (local31 == '“') {
				arg0[arg1 + local23] = -109;
			} else if (local31 == '”') {
				arg0[arg1 + local23] = -108;
			} else if (local31 == '•') {
				arg0[arg1 + local23] = -107;
			} else if (local31 == '–') {
				arg0[local23 + arg1] = -106;
			} else if (local31 == '—') {
				arg0[arg1 + local23] = -105;
			} else if (local31 == '˜') {
				arg0[arg1 + local23] = -104;
			} else if (local31 == '™') {
				arg0[local23 + arg1] = -103;
			} else if (local31 == 'š') {
				arg0[arg1 + local23] = -102;
			} else if (local31 == '›') {
				arg0[arg1 + local23] = -101;
			} else if (local31 == 'œ') {
				arg0[arg1 + local23] = -100;
			} else if (local31 == 'ž') {
				arg0[arg1 + local23] = -98;
			} else if (local31 == 'Ÿ') {
				arg0[arg1 + local23] = -97;
			} else {
				arg0[arg1 + local23] = 63;
			}
		}
		return local21;
	}
}
