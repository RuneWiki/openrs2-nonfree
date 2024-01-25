import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	public static int anInt2139;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "Lclient!wn;")
	public static Class95 aClass95_8;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_26 = new Class109(64);

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
	public static final int[] anIntArray207 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[BZIILjava/lang/String;)I")
	public static int method2015(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(8) int local8 = arg2;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(17) char local17 = arg3.charAt(local10);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg0[local10 + arg1] = (byte) local17;
			} else if (local17 == '€') {
				arg0[arg1 + local10] = -128;
			} else if (local17 == '‚') {
				arg0[local10 + arg1] = -126;
			} else if (local17 == 'ƒ') {
				arg0[arg1 + local10] = -125;
			} else if (local17 == '„') {
				arg0[arg1 + local10] = -124;
			} else if (local17 == '…') {
				arg0[local10 + arg1] = -123;
			} else if (local17 == '†') {
				arg0[arg1 + local10] = -122;
			} else if (local17 == '‡') {
				arg0[arg1 + local10] = -121;
			} else if (local17 == 'ˆ') {
				arg0[arg1 + local10] = -120;
			} else if (local17 == '‰') {
				arg0[arg1 + local10] = -119;
			} else if (local17 == 'Š') {
				arg0[arg1 + local10] = -118;
			} else if (local17 == '‹') {
				arg0[local10 + arg1] = -117;
			} else if (local17 == 'Œ') {
				arg0[local10 + arg1] = -116;
			} else if (local17 == 'Ž') {
				arg0[local10 + arg1] = -114;
			} else if (local17 == '‘') {
				arg0[local10 + arg1] = -111;
			} else if (local17 == '’') {
				arg0[arg1 + local10] = -110;
			} else if (local17 == '“') {
				arg0[local10 + arg1] = -109;
			} else if (local17 == '”') {
				arg0[arg1 + local10] = -108;
			} else if (local17 == '•') {
				arg0[local10 + arg1] = -107;
			} else if (local17 == '–') {
				arg0[local10 + arg1] = -106;
			} else if (local17 == '—') {
				arg0[arg1 + local10] = -105;
			} else if (local17 == '˜') {
				arg0[local10 + arg1] = -104;
			} else if (local17 == '™') {
				arg0[arg1 + local10] = -103;
			} else if (local17 == 'š') {
				arg0[arg1 + local10] = -102;
			} else if (local17 == '›') {
				arg0[local10 + arg1] = -101;
			} else if (local17 == 'œ') {
				arg0[local10 + arg1] = -100;
			} else if (local17 == 'ž') {
				arg0[arg1 + local10] = -98;
			} else if (local17 == 'Ÿ') {
				arg0[arg1 + local10] = -97;
			} else {
				arg0[arg1 + local10] = 63;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIB)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static226.anInt4453 == 0 || arg1 == 0 || Static139.anInt2692 >= 50 || arg2 == -1) {
			return;
		}
		Static9.anIntArray41[Static139.anInt2692] = arg2;
		Static350.anIntArray636[Static139.anInt2692] = arg1;
		Static190.anIntArray57[Static139.anInt2692] = arg0;
		Static270.aClass50Array1[Static139.anInt2692] = null;
		Static127.anIntArray243[Static139.anInt2692] = 0;
		Static316.anIntArray443[Static139.anInt2692] = arg3;
		Static139.anInt2692++;
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public static void method2018() {
		@Pc(5) Class109 local5 = Static41.aClass109_14;
		synchronized (Static41.aClass109_14) {
			Static41.aClass109_14.method2858();
		}
	}
}
