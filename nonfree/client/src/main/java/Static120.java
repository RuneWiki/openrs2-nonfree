import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ij", name = "R", descriptor = "Lclient!uh;")
	public static Class178 aClass178_1;

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
	public static int anInt2263 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!rg;IIII)V")
	public static void method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) Class40 local9 = Static96.method1438(arg3);
		if (local9 == null || !local9.aBoolean88 || !local9.method978()) {
			return;
		}
		@Pc(37) int local37;
		if (local9.anIntArray108 != null) {
			@Pc(35) int[] local35 = new int[local9.anIntArray108.length];
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				@Pc(53) int local53;
				if (Static25.anInt467 == 4) {
					local53 = (int) Static84.aFloat21 & 0x7FF;
				} else {
					local53 = Static241.anInt4889 + (int) Static84.aFloat21 & 0x7FF;
				}
				@Pc(66) int local66 = Class11.anIntArray27[local53];
				@Pc(70) int local70 = Class11.anIntArray26[local53];
				if (Static25.anInt467 != 4) {
					local66 = local66 * 256 / (Static125.anInt2421 + 256);
					local70 = local70 * 256 / (Static125.anInt2421 + 256);
				}
				local35[local37 * 2] = arg2.anInt4773 / 2 + arg4 + ((local9.anIntArray108[local37 * 2 - -1] * 4 + arg5) * local70 + local66 * (arg0 - -(local9.anIntArray108[local37 * 2] * 4)) >> 16);
				local35[local37 * 2 + 1] = arg2.anInt4751 / 2 + arg1 - (-((local9.anIntArray108[local37 * 2] * 4 + arg0) * local70) + local66 * (local9.anIntArray108[local37 * 2 + 1] * 4 + arg5) >> 16);
			}
			if (Static283.aBoolean393) {
				Static182.method3058(local35, local9.anInt1152, local9.anInt1152 >>> 24, arg2.anIntArray509, arg2.anIntArray523);
			} else {
				Static207.method3452(local35, local9.anInt1152, local9.anInt1152 >>> 24, arg2.anIntArray509, arg2.anIntArray523);
			}
			for (local37 = 0; local37 < local35.length / 2 - 1; local37++) {
				if (Static283.aBoolean393) {
					Static234.method3971(local35[local37 * 2], local35[local37 * 2 + 1], local35[(local37 + 1) * 2], local35[(local37 + 1) * 2 + 1], local9.anInt1168, local9.anInt1168 >>> 24, (Class3_Sub4_Sub12_Sub1) arg2.method4000(false));
				} else {
					Static143.method2447(local35[local37 * 2], local35[local37 * 2 + 1], local35[(local37 + 1) * 2], local35[(local37 + 1) * 2 + 1], local9.anInt1168, local9.anInt1168 >>> 24, arg2.anIntArray509, arg2.anIntArray523);
				}
			}
			if (Static283.aBoolean393) {
				Static234.method3971(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local9.anInt1168, local9.anInt1168 >>> 24, (Class3_Sub4_Sub12_Sub1) arg2.method4000(false));
			} else {
				Static143.method2447(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local9.anInt1168, local9.anInt1168 >>> 24, arg2.anIntArray509, arg2.anIntArray523);
			}
		}
		@Pc(374) Class81 local374 = null;
		if (local9.anInt1169 != -1) {
			local374 = local9.method981(false, false);
			if (local374 != null) {
				Static165.method2734(local374, arg0, arg1, arg5, arg2, arg4);
			}
		}
		if (local9.aString48 == null) {
			return;
		}
		local37 = 0;
		if (local374 != null) {
			local37 = local374.anInt2796;
		}
		@Pc(411) Class3_Sub4_Sub2 local411 = Static25.aClass3_Sub4_Sub2_4;
		if (local9.anInt1148 == 1) {
			local411 = Static248.aClass3_Sub4_Sub2_11;
		}
		if (local9.anInt1148 == 2) {
			local411 = Static224.aClass3_Sub4_Sub2_14;
		}
		Static256.method4337(local9.anInt1173, local9.aString48, local37, arg4, arg1, local411, arg5, arg2, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)B")
	public static byte method2007(@OriginalArg(1) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local30 = (byte) arg0;
		} else if (arg0 == '€') {
			local30 = -128;
		} else if (arg0 == '‚') {
			local30 = -126;
		} else if (arg0 == 'ƒ') {
			local30 = -125;
		} else if (arg0 == '„') {
			local30 = -124;
		} else if (arg0 == '…') {
			local30 = -123;
		} else if (arg0 == '†') {
			local30 = -122;
		} else if (arg0 == '‡') {
			local30 = -121;
		} else if (arg0 == 'ˆ') {
			local30 = -120;
		} else if (arg0 == '‰') {
			local30 = -119;
		} else if (arg0 == 'Š') {
			local30 = -118;
		} else if (arg0 == '‹') {
			local30 = -117;
		} else if (arg0 == 'Œ') {
			local30 = -116;
		} else if (arg0 == 'Ž') {
			local30 = -114;
		} else if (arg0 == '‘') {
			local30 = -111;
		} else if (arg0 == '’') {
			local30 = -110;
		} else if (arg0 == '“') {
			local30 = -109;
		} else if (arg0 == '”') {
			local30 = -108;
		} else if (arg0 == '•') {
			local30 = -107;
		} else if (arg0 == '–') {
			local30 = -106;
		} else if (arg0 == '—') {
			local30 = -105;
		} else if (arg0 == '˜') {
			local30 = -104;
		} else if (arg0 == '™') {
			local30 = -103;
		} else if (arg0 == 'š') {
			local30 = -102;
		} else if (arg0 == '›') {
			local30 = -101;
		} else if (arg0 == 'œ') {
			local30 = -100;
		} else if (arg0 == 'ž') {
			local30 = -98;
		} else if (arg0 == 'Ÿ') {
			local30 = -97;
		} else {
			local30 = 63;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method2008(@OriginalArg(0) int arg0) {
		Static296.aFloatArray29[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static296.aFloatArray29[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static296.aFloatArray29[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static7.method135(3);
		Static7.method135(4);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method2009(@OriginalArg(1) Class155 arg0) {
		Static131.anInt2477 = arg0.method4120("titlebg");
		Static198.anInt3861 = arg0.method4120("logo");
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
	public static void method2010(@OriginalArg(0) int arg0) {
		Static92.anInt1674 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static295.anInt4973; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static307.anInt6023; local8++) {
				if (Static146.aClass3_Sub25ArrayArrayArray7[arg0][local3][local8] == null) {
					Static146.aClass3_Sub25ArrayArrayArray7[arg0][local3][local8] = new Class3_Sub25(arg0, local3, local8);
				}
			}
		}
	}
}
