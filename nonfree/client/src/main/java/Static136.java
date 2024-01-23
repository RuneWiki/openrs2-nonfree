import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray26;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	public static int anInt3074 = 0;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[Lclient!bb;")
	public static Class15[] aClass15Array1 = new Class15[6];

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "Lclient!kn;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_2 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	public static int anInt3082 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIIILjava/lang/String;B)I")
	public static int method2346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(5) int local5 = arg2;
		for (@Pc(18) int local18 = 0; local18 < local5; local18++) {
			@Pc(31) char local31 = arg3.charAt(local18);
			if (local31 > '\u0000' && local31 < '\u0080' || !(local31 < ' ' || local31 > 'ÿ')) {
				arg0[arg1 + local18] = (byte) local31;
			} else if (local31 == '€') {
				arg0[local18 + arg1] = -128;
			} else if (local31 == '‚') {
				arg0[local18 + arg1] = -126;
			} else if (local31 == 'ƒ') {
				arg0[arg1 + local18] = -125;
			} else if (local31 == '„') {
				arg0[arg1 + local18] = -124;
			} else if (local31 == '…') {
				arg0[local18 + arg1] = -123;
			} else if (local31 == '†') {
				arg0[arg1 + local18] = -122;
			} else if (local31 == '‡') {
				arg0[arg1 + local18] = -121;
			} else if (local31 == 'ˆ') {
				arg0[local18 + arg1] = -120;
			} else if (local31 == '‰') {
				arg0[arg1 + local18] = -119;
			} else if (local31 == 'Š') {
				arg0[arg1 + local18] = -118;
			} else if (local31 == '‹') {
				arg0[arg1 + local18] = -117;
			} else if (local31 == 'Œ') {
				arg0[local18 + arg1] = -116;
			} else if (local31 == 'Ž') {
				arg0[local18 + arg1] = -114;
			} else if (local31 == '‘') {
				arg0[local18 + arg1] = -111;
			} else if (local31 == '’') {
				arg0[arg1 + local18] = -110;
			} else if (local31 == '“') {
				arg0[local18 + arg1] = -109;
			} else if (local31 == '”') {
				arg0[arg1 + local18] = -108;
			} else if (local31 == '•') {
				arg0[arg1 + local18] = -107;
			} else if (local31 == '–') {
				arg0[local18 + arg1] = -106;
			} else if (local31 == '—') {
				arg0[local18 + arg1] = -105;
			} else if (local31 == '˜') {
				arg0[local18 + arg1] = -104;
			} else if (local31 == '™') {
				arg0[arg1 + local18] = -103;
			} else if (local31 == 'š') {
				arg0[arg1 + local18] = -102;
			} else if (local31 == '›') {
				arg0[local18 + arg1] = -101;
			} else if (local31 == 'œ') {
				arg0[local18 + arg1] = -100;
			} else if (local31 == 'ž') {
				arg0[arg1 + local18] = -98;
			} else if (local31 == 'Ÿ') {
				arg0[local18 + arg1] = -97;
			} else {
				arg0[arg1 + local18] = 63;
			}
		}
		return local5;
	}
}
