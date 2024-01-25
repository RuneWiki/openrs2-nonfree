import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_46 = new Class303(2, 7);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!uk;[[B)V")
	public static void method3672(@OriginalArg(1) Class26_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub11 local30 = new Class3_Sub11(local23);
				local36 = Static403.anIntArray428[local17] >> 8;
				@Pc(42) int local42 = Static403.anIntArray428[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static335.anInt5608;
				@Pc(55) int local55 = local42 * 64 - Static246.anInt4344;
				Static236.method3658();
				arg0.method7107(local49, Static335.anInt5608, Static246.anInt4344, local30, Static460.aClass169Array3, local55);
				arg0.method7117(local55, local49, local30, Static505.aClass45_11, local12);
				if (!arg0.aBoolean662 && local36 == Static110.anInt2172 / 8 && local42 == Static132.anInt9449 / 8 && local12[0] != -1) {
					Static84.aClass350_1 = Static420.aClass356_1.method7704(local12[0], local12[2], Static508.aClass232_1, local12[1], local12[3]);
					Static330.anInt5541 = local12[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local15; local136++) {
			@Pc(148) int local148 = (Static403.anIntArray428[local136] >> 8) * 64 - Static335.anInt5608;
			local36 = (Static403.anIntArray428[local136] & 0xFF) * 64 - Static246.anInt4344;
			@Pc(163) byte[] local163 = arg1[local136];
			if (local163 == null && Static132.anInt9449 < 800) {
				Static236.method3658();
				arg0.method7111(local36, local148);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLjava/io/File;)[B")
	public static byte[] method3673(@OriginalArg(1) File arg0) {
		return Static119.method2464((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIII)I")
	public static int method3674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(23) int local23 = local7 >= 8 ? arg0 : arg2;
		@Pc(42) int local42 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg2 : arg1;
		return ((local7 & 0x1) == 0 ? local23 : -local23) + ((local7 & 0x2) == 0 ? local42 : -local42);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBIILjava/lang/String;I)I")
	public static int method3676(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg2 + local17] = (byte) local25;
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
				arg0[arg2 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg0[arg2 + local17] = -120;
			} else if (local25 == '‰') {
				arg0[local17 + arg2] = -119;
			} else if (local25 == 'Š') {
				arg0[arg2 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[arg2 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg0[local17 + arg2] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg2] = -114;
			} else if (local25 == '‘') {
				arg0[arg2 + local17] = -111;
			} else if (local25 == '’') {
				arg0[arg2 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg2 + local17] = -109;
			} else if (local25 == '”') {
				arg0[arg2 + local17] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg2] = -107;
			} else if (local25 == '–') {
				arg0[local17 + arg2] = -106;
			} else if (local25 == '—') {
				arg0[local17 + arg2] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg2] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg2] = -103;
			} else if (local25 == 'š') {
				arg0[arg2 + local17] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg0[arg2 + local17] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg2] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg2] = -97;
			} else {
				arg0[local17 + arg2] = 63;
			}
		}
		return local10;
	}
}
