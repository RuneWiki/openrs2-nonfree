import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!os", name = "C", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "Lclient!nd;")
	public static Class238 aClass238_210;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_131 = new Class145(74, 11);

	@OriginalMember(owner = "client!os", name = "z", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_10 = new Class312("", 11);

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	public static int anInt7337 = -1;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_132 = new Class145(51, 16);

	@OriginalMember(owner = "client!os", name = "E", descriptor = "[I")
	public static final int[] anIntArray499 = new int[13];

	@OriginalMember(owner = "client!os", name = "F", descriptor = "[B")
	public static final byte[] aByteArray78 = new byte[520];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6396(@OriginalArg(1) Class13 arg0) {
		for (@Pc(14) Class16_Sub7 local14 = (Class16_Sub7) Static518.aClass19_9.method562(); local14 != null; local14 = (Class16_Sub7) Static518.aClass19_9.method558()) {
			if (local14.aBoolean489) {
				local14.method5993(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILjava/lang/String;I[B)I")
	public static int method6397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(8) int local8 = arg1;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(28) char local28 = arg2.charAt(local21);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				arg3[local21 + arg0] = (byte) local28;
			} else if (local28 == '€') {
				arg3[local21 + arg0] = -128;
			} else if (local28 == '‚') {
				arg3[arg0 + local21] = -126;
			} else if (local28 == 'ƒ') {
				arg3[arg0 + local21] = -125;
			} else if (local28 == '„') {
				arg3[arg0 + local21] = -124;
			} else if (local28 == '…') {
				arg3[arg0 + local21] = -123;
			} else if (local28 == '†') {
				arg3[arg0 + local21] = -122;
			} else if (local28 == '‡') {
				arg3[local21 + arg0] = -121;
			} else if (local28 == 'ˆ') {
				arg3[arg0 + local21] = -120;
			} else if (local28 == '‰') {
				arg3[arg0 + local21] = -119;
			} else if (local28 == 'Š') {
				arg3[arg0 + local21] = -118;
			} else if (local28 == '‹') {
				arg3[local21 + arg0] = -117;
			} else if (local28 == 'Œ') {
				arg3[arg0 + local21] = -116;
			} else if (local28 == 'Ž') {
				arg3[arg0 + local21] = -114;
			} else if (local28 == '‘') {
				arg3[local21 + arg0] = -111;
			} else if (local28 == '’') {
				arg3[local21 + arg0] = -110;
			} else if (local28 == '“') {
				arg3[arg0 + local21] = -109;
			} else if (local28 == '”') {
				arg3[arg0 + local21] = -108;
			} else if (local28 == '•') {
				arg3[local21 + arg0] = -107;
			} else if (local28 == '–') {
				arg3[arg0 + local21] = -106;
			} else if (local28 == '—') {
				arg3[arg0 + local21] = -105;
			} else if (local28 == '˜') {
				arg3[arg0 + local21] = -104;
			} else if (local28 == '™') {
				arg3[arg0 + local21] = -103;
			} else if (local28 == 'š') {
				arg3[local21 + arg0] = -102;
			} else if (local28 == '›') {
				arg3[local21 + arg0] = -101;
			} else if (local28 == 'œ') {
				arg3[arg0 + local21] = -100;
			} else if (local28 == 'ž') {
				arg3[arg0 + local21] = -98;
			} else if (local28 == 'Ÿ') {
				arg3[arg0 + local21] = -97;
			} else {
				arg3[local21 + arg0] = 63;
			}
		}
		return local8;
	}
}
