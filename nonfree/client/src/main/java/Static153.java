import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt3089 = 0;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString102 = "flash3:";

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method2438() {
		aLongArray7 = null;
		aString102 = null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method2439(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(25) char local25 = arg0.charAt(local13);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				local11[local13] = (byte) local25;
			} else if (local25 == '€') {
				local11[local13] = -128;
			} else if (local25 == '‚') {
				local11[local13] = -126;
			} else if (local25 == 'ƒ') {
				local11[local13] = -125;
			} else if (local25 == '„') {
				local11[local13] = -124;
			} else if (local25 == '…') {
				local11[local13] = -123;
			} else if (local25 == '†') {
				local11[local13] = -122;
			} else if (local25 == '‡') {
				local11[local13] = -121;
			} else if (local25 == 'ˆ') {
				local11[local13] = -120;
			} else if (local25 == '‰') {
				local11[local13] = -119;
			} else if (local25 == 'Š') {
				local11[local13] = -118;
			} else if (local25 == '‹') {
				local11[local13] = -117;
			} else if (local25 == 'Œ') {
				local11[local13] = -116;
			} else if (local25 == 'Ž') {
				local11[local13] = -114;
			} else if (local25 == '‘') {
				local11[local13] = -111;
			} else if (local25 == '’') {
				local11[local13] = -110;
			} else if (local25 == '“') {
				local11[local13] = -109;
			} else if (local25 == '”') {
				local11[local13] = -108;
			} else if (local25 == '•') {
				local11[local13] = -107;
			} else if (local25 == '–') {
				local11[local13] = -106;
			} else if (local25 == '—') {
				local11[local13] = -105;
			} else if (local25 == '˜') {
				local11[local13] = -104;
			} else if (local25 == '™') {
				local11[local13] = -103;
			} else if (local25 == 'š') {
				local11[local13] = -102;
			} else if (local25 == '›') {
				local11[local13] = -101;
			} else if (local25 == 'œ') {
				local11[local13] = -100;
			} else if (local25 == 'ž') {
				local11[local13] = -98;
			} else if (local25 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIIIII)V")
	public static void method2440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 + 1;
		Static129.method2127(arg1, arg4, arg2, Static234.anIntArrayArray40[arg3]);
		@Pc(21) int local21 = arg0 - 1;
		Static129.method2127(arg1, arg4, arg2, Static234.anIntArrayArray40[arg0]);
		for (@Pc(35) int local35 = local12; local35 <= local21; local35++) {
			@Pc(42) int[] local42 = Static234.anIntArrayArray40[local35];
			local42[arg4] = local42[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
	public static int method2442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = Static204.anIntArray354[Static37.method612(arg0, arg2)];
		if (arg1 > 0) {
			@Pc(26) int local26 = Static204.anInterface2_1.method1981(arg1 & 0xFFFF);
			@Pc(39) int local39;
			@Pc(59) int local59;
			if (local26 != 0) {
				if (arg2 < 0) {
					local39 = 0;
				} else if (arg2 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg2 * 131586;
				}
				if (local26 == 256) {
					local16 = local39;
				} else {
					local59 = 256 - local26;
					local16 = (local26 * (local39 & 0xFF00) + (local16 & 0xFF00) * local59 & 0xFF0000) + (local26 * (local39 & 0xFF00FF) + ((local16 & 0xFF00FF) * local59) & 0xFF00FF00) >> 8;
				}
			}
			local39 = Static204.anInterface2_1.method1982(arg1 & 0xFFFF);
			if (local39 != 0) {
				local39 += 256;
				@Pc(114) int local114 = local39 * (local16 & 0xFF);
				local59 = (local16 >> 8 & 0xFF) * local39;
				@Pc(130) int local130 = (local16 >> 16 & 0xFF) * local39;
				if (local114 > 65535) {
					local114 = 65535;
				}
				if (local130 > 65535) {
					local130 = 65535;
				}
				if (local59 > 65535) {
					local59 = 65535;
				}
				local16 = (local114 >> 8) + ((local130 & 0x6B00FF00) << 8) + (local59 & 0xFF00);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V")
	public static void method2444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg3 - arg4;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 == 0) {
			if (local6 != 0) {
				Static98.method1588(arg0, arg4, arg3, arg2);
			}
		} else if (local6 == 0) {
			Static224.method3574(arg0, arg2, arg4, arg1);
		} else {
			if (local6 < 0) {
				local6 = -local6;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(68) boolean local68 = local6 > local15;
			@Pc(74) int local74;
			@Pc(72) int local72;
			if (local68) {
				local72 = arg1;
				local74 = arg2;
				arg2 = arg4;
				arg4 = local74;
				arg1 = arg3;
				arg3 = local72;
			}
			if (arg1 < arg2) {
				local72 = arg4;
				local74 = arg2;
				arg2 = arg1;
				arg1 = local74;
				arg4 = arg3;
				arg3 = local72;
			}
			local74 = arg4;
			@Pc(108) int local108 = arg3 - arg4;
			if (local108 < 0) {
				local108 = -local108;
			}
			local72 = arg1 - arg2;
			@Pc(125) int local125 = -(local72 >> 1);
			@Pc(136) int local136 = arg3 <= arg4 ? -1 : 1;
			@Pc(140) int local140;
			if (local68) {
				for (local140 = arg2; local140 <= arg1; local140++) {
					local125 += local108;
					Static234.anIntArrayArray40[local140][local74] = arg0;
					if (local125 > 0) {
						local74 += local136;
						local125 -= local72;
					}
				}
			} else {
				for (local140 = arg2; local140 <= arg1; local140++) {
					Static234.anIntArrayArray40[local74][local140] = arg0;
					local125 += local108;
					if (local125 > 0) {
						local74 += local136;
						local125 -= local72;
					}
				}
			}
		}
	}
}
