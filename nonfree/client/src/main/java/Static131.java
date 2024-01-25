import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public static int anInt2515;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_36 = new Class341(81, 8);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method2328() {
		Static428.method7019(false);
		if (Static86.anInt1618 >= 0 && Static86.anInt1618 != 0) {
			Static389.method6560(false, Static86.anInt1618);
			Static86.anInt1618 = -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!uf;IBLclient!aa;IIILclient!mq;)V")
	public static void method2330(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class71 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static484.anInt8685 == 4) {
			local17 = (int) Static278.aFloat108 & 0x3FFF;
		} else {
			local17 = (int) Static278.aFloat108 + Static275.anInt5119 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg0.anInt10395 / 2, arg0.anInt10465 / 2) + 10;
		@Pc(44) int local44 = arg5 * arg5 + arg4 * arg4;
		if (local36 * local36 < local44) {
			return;
		}
		@Pc(66) int local66 = Class12_Sub2.anIntArray204[local17];
		@Pc(70) int local70 = Class12_Sub2.anIntArray203[local17];
		if (Static484.anInt8685 != 4) {
			local70 = local70 * 256 / (Static199.anInt4199 + 256);
			local66 = local66 * 256 / (Static199.anInt4199 + 256);
		}
		@Pc(99) int local99 = local66 * arg4 + local70 * arg5 >> 14;
		@Pc(109) int local109 = local70 * arg4 - local66 * arg5 >> 14;
		arg6.method7708(local99 + arg0.anInt10395 / 2 + arg1 - arg6.method7709() / 2, -local109 + arg3 + (arg0.anInt10465 / 2 - arg6.method7711() / 2), arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(CZ)B")
	public static byte method2331(@OriginalArg(0) char arg0) {
		@Pc(25) byte local25;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local25 = (byte) arg0;
		} else if (arg0 == '€') {
			local25 = -128;
		} else if (arg0 == '‚') {
			local25 = -126;
		} else if (arg0 == 'ƒ') {
			local25 = -125;
		} else if (arg0 == '„') {
			local25 = -124;
		} else if (arg0 == '…') {
			local25 = -123;
		} else if (arg0 == '†') {
			local25 = -122;
		} else if (arg0 == '‡') {
			local25 = -121;
		} else if (arg0 == 'ˆ') {
			local25 = -120;
		} else if (arg0 == '‰') {
			local25 = -119;
		} else if (arg0 == 'Š') {
			local25 = -118;
		} else if (arg0 == '‹') {
			local25 = -117;
		} else if (arg0 == 'Œ') {
			local25 = -116;
		} else if (arg0 == 'Ž') {
			local25 = -114;
		} else if (arg0 == '‘') {
			local25 = -111;
		} else if (arg0 == '’') {
			local25 = -110;
		} else if (arg0 == '“') {
			local25 = -109;
		} else if (arg0 == '”') {
			local25 = -108;
		} else if (arg0 == '•') {
			local25 = -107;
		} else if (arg0 == '–') {
			local25 = -106;
		} else if (arg0 == '—') {
			local25 = -105;
		} else if (arg0 == '˜') {
			local25 = -104;
		} else if (arg0 == '™') {
			local25 = -103;
		} else if (arg0 == 'š') {
			local25 = -102;
		} else if (arg0 == '›') {
			local25 = -101;
		} else if (arg0 == 'œ') {
			local25 = -100;
		} else if (arg0 == 'ž') {
			local25 = -98;
		} else if (arg0 == 'Ÿ') {
			local25 = -97;
		} else {
			local25 = 63;
		}
		return local25;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)I")
	public static int method2332(@OriginalArg(0) boolean arg0) {
		if (Static11.anIntArray3 == null) {
			return 0;
		} else if (arg0 || Static320.aClass91Array8 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static11.anIntArray3.length; local27++) {
				@Pc(33) int local33 = Static11.anIntArray3[local27];
				if (Static446.aClass124_92.method3627(local33)) {
					local20++;
				}
				if (Static638.aClass124_130.method3627(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static11.anIntArray3.length * 2;
		}
	}
}
