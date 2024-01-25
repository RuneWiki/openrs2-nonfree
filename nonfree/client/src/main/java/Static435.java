import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_158 = new Class239(68, 3);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_62 = new Class249();

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static final int anInt7950 = Static451.method6881(1600);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BBII)[B")
	public static byte[] method6664(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static553.method3373(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method6665() {
		Static499.method7335(false);
		if (Static397.anInt7574 >= 0 && Static397.anInt7574 != 0) {
			Static233.method6719(Static397.anInt7574);
			Static397.anInt7574 = -1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
	public static int method6666(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg3.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg0[arg1 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg0[local12 + arg1] = -128;
			} else if (local20 == '‚') {
				arg0[local12 + arg1] = -126;
			} else if (local20 == 'ƒ') {
				arg0[arg1 + local12] = -125;
			} else if (local20 == '„') {
				arg0[local12 + arg1] = -124;
			} else if (local20 == '…') {
				arg0[local12 + arg1] = -123;
			} else if (local20 == '†') {
				arg0[local12 + arg1] = -122;
			} else if (local20 == '‡') {
				arg0[arg1 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg0[local12 + arg1] = -120;
			} else if (local20 == '‰') {
				arg0[local12 + arg1] = -119;
			} else if (local20 == 'Š') {
				arg0[arg1 + local12] = -118;
			} else if (local20 == '‹') {
				arg0[arg1 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg0[arg1 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg0[arg1 + local12] = -114;
			} else if (local20 == '‘') {
				arg0[arg1 + local12] = -111;
			} else if (local20 == '’') {
				arg0[local12 + arg1] = -110;
			} else if (local20 == '“') {
				arg0[local12 + arg1] = -109;
			} else if (local20 == '”') {
				arg0[local12 + arg1] = -108;
			} else if (local20 == '•') {
				arg0[arg1 + local12] = -107;
			} else if (local20 == '–') {
				arg0[local12 + arg1] = -106;
			} else if (local20 == '—') {
				arg0[local12 + arg1] = -105;
			} else if (local20 == '˜') {
				arg0[local12 + arg1] = -104;
			} else if (local20 == '™') {
				arg0[arg1 + local12] = -103;
			} else if (local20 == 'š') {
				arg0[local12 + arg1] = -102;
			} else if (local20 == '›') {
				arg0[arg1 + local12] = -101;
			} else if (local20 == 'œ') {
				arg0[arg1 + local12] = -100;
			} else if (local20 == 'ž') {
				arg0[local12 + arg1] = -98;
			} else if (local20 == 'Ÿ') {
				arg0[arg1 + local12] = -97;
			} else {
				arg0[local12 + arg1] = 63;
			}
		}
		return local10;
	}
}
