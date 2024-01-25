import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "[[[Lclient!ffa;")
	public static Class97[][][] aClass97ArrayArrayArray4;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "Lclient!pd;")
	public static final Class250 aClass250_11 = new Class250(1);

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
	public static int[] anIntArray415 = new int[2];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZZIZI)V")
	public static void method5722(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static230.method3436(Static187.aClass51_Sub1Array1.length - 1, 0, arg2, arg3, arg1, arg0);
		Static502.anInt8698 = 0;
		Static197.aClass6_Sub17_8 = null;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIILjava/lang/String;B[B)I")
	public static int method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(28) char local28 = arg2.charAt(local12);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				arg3[local12 + arg1] = (byte) local28;
			} else if (local28 == '€') {
				arg3[local12 + arg1] = -128;
			} else if (local28 == '‚') {
				arg3[arg1 + local12] = -126;
			} else if (local28 == 'ƒ') {
				arg3[local12 + arg1] = -125;
			} else if (local28 == '„') {
				arg3[local12 + arg1] = -124;
			} else if (local28 == '…') {
				arg3[local12 + arg1] = -123;
			} else if (local28 == '†') {
				arg3[local12 + arg1] = -122;
			} else if (local28 == '‡') {
				arg3[arg1 + local12] = -121;
			} else if (local28 == 'ˆ') {
				arg3[arg1 + local12] = -120;
			} else if (local28 == '‰') {
				arg3[arg1 + local12] = -119;
			} else if (local28 == 'Š') {
				arg3[arg1 + local12] = -118;
			} else if (local28 == '‹') {
				arg3[local12 + arg1] = -117;
			} else if (local28 == 'Œ') {
				arg3[local12 + arg1] = -116;
			} else if (local28 == 'Ž') {
				arg3[local12 + arg1] = -114;
			} else if (local28 == '‘') {
				arg3[arg1 + local12] = -111;
			} else if (local28 == '’') {
				arg3[arg1 + local12] = -110;
			} else if (local28 == '“') {
				arg3[local12 + arg1] = -109;
			} else if (local28 == '”') {
				arg3[arg1 + local12] = -108;
			} else if (local28 == '•') {
				arg3[arg1 + local12] = -107;
			} else if (local28 == '–') {
				arg3[local12 + arg1] = -106;
			} else if (local28 == '—') {
				arg3[arg1 + local12] = -105;
			} else if (local28 == '˜') {
				arg3[local12 + arg1] = -104;
			} else if (local28 == '™') {
				arg3[local12 + arg1] = -103;
			} else if (local28 == 'š') {
				arg3[arg1 + local12] = -102;
			} else if (local28 == '›') {
				arg3[local12 + arg1] = -101;
			} else if (local28 == 'œ') {
				arg3[local12 + arg1] = -100;
			} else if (local28 == 'ž') {
				arg3[arg1 + local12] = -98;
			} else if (local28 == 'Ÿ') {
				arg3[arg1 + local12] = -97;
			} else {
				arg3[arg1 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	public static void method5725() {
		Static125.aClass85_147.method8293();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static234.aLongArray4[local10] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static294.aLongArray11[local28] = 0L;
		}
		Static183.anInt3776 = 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method5726(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static655.method5836(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
