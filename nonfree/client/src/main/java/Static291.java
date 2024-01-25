import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public static int anInt5640 = 0;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
	public static boolean aBoolean430 = true;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_192 = new Class18(80, 7);

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
	public static int anInt5646 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([J[IB)V")
	public static void method5123(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static247.method4691(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!at;Ljava/lang/String;I)I")
	public static int method5125(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt2219;
		@Pc(10) byte[] local10 = method5126(arg1);
		arg0.method2159(local10.length);
		arg0.anInt2219 += Static237.aClass215_3.method5758(arg0.anInt2219, local10, 0, local10.length, arg0.aByteArray41);
		return arg0.anInt2219 - local6;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private static byte[] method5126(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local21] = (byte) local27;
			} else if (local27 == '€') {
				local11[local21] = -128;
			} else if (local27 == '‚') {
				local11[local21] = -126;
			} else if (local27 == 'ƒ') {
				local11[local21] = -125;
			} else if (local27 == '„') {
				local11[local21] = -124;
			} else if (local27 == '…') {
				local11[local21] = -123;
			} else if (local27 == '†') {
				local11[local21] = -122;
			} else if (local27 == '‡') {
				local11[local21] = -121;
			} else if (local27 == 'ˆ') {
				local11[local21] = -120;
			} else if (local27 == '‰') {
				local11[local21] = -119;
			} else if (local27 == 'Š') {
				local11[local21] = -118;
			} else if (local27 == '‹') {
				local11[local21] = -117;
			} else if (local27 == 'Œ') {
				local11[local21] = -116;
			} else if (local27 == 'Ž') {
				local11[local21] = -114;
			} else if (local27 == '‘') {
				local11[local21] = -111;
			} else if (local27 == '’') {
				local11[local21] = -110;
			} else if (local27 == '“') {
				local11[local21] = -109;
			} else if (local27 == '”') {
				local11[local21] = -108;
			} else if (local27 == '•') {
				local11[local21] = -107;
			} else if (local27 == '–') {
				local11[local21] = -106;
			} else if (local27 == '—') {
				local11[local21] = -105;
			} else if (local27 == '˜') {
				local11[local21] = -104;
			} else if (local27 == '™') {
				local11[local21] = -103;
			} else if (local27 == 'š') {
				local11[local21] = -102;
			} else if (local27 == '›') {
				local11[local21] = -101;
			} else if (local27 == 'œ') {
				local11[local21] = -100;
			} else if (local27 == 'ž') {
				local11[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local21] = -97;
			} else {
				local11[local21] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!df;)V")
	public static void method5127(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(25) int local25 = Static91.aClass80_20.method2538(250, arg1, null);
		@Pc(34) int local34 = Static91.aClass80_20.method2535(arg1, null, 250) * 13;
		Static9.aClass63_1.method4653(6, 6, local25 + 8, local34 + 4 + 4, -16777216, 0);
		Static9.aClass63_1.method4645(6, 6, local25 + 4 + 4, 4 + 4 + local34, -1, 0);
		arg2.method6026(-1, 10, 0, 0, 1, null, -1, 0, null, 10, local25, null, local34, arg1, 1);
		Static128.method5289(6, 6, local34 + 4 + 4, local25 + 8);
		if (arg0) {
			Static9.aClass63_1.method4647();
		}
	}
}
