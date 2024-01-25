import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "B")
	public static byte aByte78;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!mg;")
	public static Class160 aClass160_57;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
	public static final int[] anIntArray416 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_108 = new Class265(17, 15);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIILjava/lang/String;II)I")
	public static int method4102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(9) int local9 = arg2;
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(24) char local24 = arg3.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg0[arg1 + local16] = (byte) local24;
			} else if (local24 == '€') {
				arg0[local16 + arg1] = -128;
			} else if (local24 == '‚') {
				arg0[local16 + arg1] = -126;
			} else if (local24 == 'ƒ') {
				arg0[local16 + arg1] = -125;
			} else if (local24 == '„') {
				arg0[arg1 + local16] = -124;
			} else if (local24 == '…') {
				arg0[arg1 + local16] = -123;
			} else if (local24 == '†') {
				arg0[arg1 + local16] = -122;
			} else if (local24 == '‡') {
				arg0[local16 + arg1] = -121;
			} else if (local24 == 'ˆ') {
				arg0[arg1 + local16] = -120;
			} else if (local24 == '‰') {
				arg0[local16 + arg1] = -119;
			} else if (local24 == 'Š') {
				arg0[local16 + arg1] = -118;
			} else if (local24 == '‹') {
				arg0[arg1 + local16] = -117;
			} else if (local24 == 'Œ') {
				arg0[arg1 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg0[arg1 + local16] = -114;
			} else if (local24 == '‘') {
				arg0[arg1 + local16] = -111;
			} else if (local24 == '’') {
				arg0[local16 + arg1] = -110;
			} else if (local24 == '“') {
				arg0[local16 + arg1] = -109;
			} else if (local24 == '”') {
				arg0[local16 + arg1] = -108;
			} else if (local24 == '•') {
				arg0[local16 + arg1] = -107;
			} else if (local24 == '–') {
				arg0[arg1 + local16] = -106;
			} else if (local24 == '—') {
				arg0[arg1 + local16] = -105;
			} else if (local24 == '˜') {
				arg0[local16 + arg1] = -104;
			} else if (local24 == '™') {
				arg0[local16 + arg1] = -103;
			} else if (local24 == 'š') {
				arg0[arg1 + local16] = -102;
			} else if (local24 == '›') {
				arg0[arg1 + local16] = -101;
			} else if (local24 == 'œ') {
				arg0[arg1 + local16] = -100;
			} else if (local24 == 'ž') {
				arg0[local16 + arg1] = -98;
			} else if (local24 == 'Ÿ') {
				arg0[local16 + arg1] = -97;
			} else {
				arg0[arg1 + local16] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!em;)V")
	public static void method4104(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2249 == 5 && arg0.anInt2208 != -1) {
			Static224.method3517(Static33.aClass49_1, arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZLclient!la;ILclient!ya;I)V")
	public static void method4105(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class116 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5) {
		if (arg1) {
			Static346.aClass17_45.method5767((Static86.anInt4394 - Static346.aClass17_45.j()) / 2, (Static395.anInt6582 - Static346.aClass17_45.T()) / 2);
			Static163.aClass17_48.method5767((Static86.anInt4394 - Static163.aClass17_48.j()) / 2, 18);
		}
		arg2.method4821(arg5, (Static199.aClass10_22 == Static320.aClass10_28 ? Static119.aClass209_59 : Static374.aClass209_146).method4562(Static388.anInt6533), -1, Static395.anInt6582 / 2 - 26, Static86.anInt4394 / 2);
		@Pc(62) int local62 = Static395.anInt6582 / 2 - 18;
		arg4.method4426(Static86.anInt4394 / 2 - 152, local62, 304, 34, arg3, 0);
		arg4.method4426(Static86.anInt4394 / 2 - 151, local62 + 1, 302, 32, 0, 0);
		arg4.O(Static86.anInt4394 / 2 - 150, local62 + 2, Static209.anInt4079 * 3, 30, arg0, 0);
		arg4.O(Static86.anInt4394 / 2 + Static209.anInt4079 * 3 - 150, local62 - -2, 300 - Static209.anInt4079 * 3, 30, 0, 0);
		arg2.method4821(arg5, Static137.aString35, -1, Static395.anInt6582 / 2 + 4, Static86.anInt4394 / 2);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method4106() {
		if (Static133.anInt2851 < 0) {
			Static60.anInt1343 = -1;
			Static314.anInt5538 = -1;
			Static133.anInt2851 = 0;
		}
		if (Static88.anInt4519 < Static133.anInt2851) {
			Static60.anInt1343 = -1;
			Static133.anInt2851 = Static88.anInt4519;
			Static314.anInt5538 = -1;
		}
		if (Static129.anInt2786 < 0) {
			Static129.anInt2786 = 0;
			Static314.anInt5538 = -1;
			Static60.anInt1343 = -1;
		}
		if (Static88.anInt4522 < Static129.anInt2786) {
			Static60.anInt1343 = -1;
			Static314.anInt5538 = -1;
			Static129.anInt2786 = Static88.anInt4522;
		}
	}
}
