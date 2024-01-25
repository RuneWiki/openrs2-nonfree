import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_2 = new Class95(0, 1);

	@OriginalMember(owner = "client!fba", name = "cb", descriptor = "I")
	public static int anInt3344 = -1;

	@OriginalMember(owner = "client!fba", name = "jb", descriptor = "Lclient!ko;")
	public static final Class179 aClass179_11 = new Class179();

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "(B)Z")
	public static boolean method2722() {
		try {
			if (Static530.anInt9251 == 2) {
				if (Static459.aClass3_Sub22_2 == null) {
					Static459.aClass3_Sub22_2 = Static601.method3073(Static130.aClass284_126, Static508.anInt8798, Static530.anInt9247);
					if (Static459.aClass3_Sub22_2 == null) {
						return false;
					}
				}
				if (Static352.aClass20_1 == null) {
					Static352.aClass20_1 = new Class20(Static437.aClass284_125, Static476.aClass284_137);
				}
				@Pc(34) Class3_Sub16_Sub3 local34 = Static548.aClass3_Sub16_Sub3_4;
				if (Static533.aClass3_Sub16_Sub3_3 != null) {
					local34 = Static533.aClass3_Sub16_Sub3_3;
				}
				if (local34.method6133(Static459.aClass3_Sub22_2, Static430.aClass284_123, Static352.aClass20_1)) {
					Static548.aClass3_Sub16_Sub3_4 = local34;
					Static548.aClass3_Sub16_Sub3_4.method6134();
					@Pc(73) int local73;
					if (Static288.anInt5396 > 0) {
						Static530.anInt9251 = 3;
						Static548.aClass3_Sub16_Sub3_4.method6105(Static213.anInt4459 >= Static288.anInt5396 ? Static288.anInt5396 : Static213.anInt4459);
						for (local73 = 0; local73 < Static338.anIntArray341.length; local73++) {
							Static548.aClass3_Sub16_Sub3_4.method6100(Static338.anIntArray341[local73], local73);
							Static338.anIntArray341[local73] = 255;
						}
					} else {
						Static530.anInt9251 = 0;
						Static548.aClass3_Sub16_Sub3_4.method6105(Static213.anInt4459);
						for (local73 = 0; local73 < Static338.anIntArray341.length; local73++) {
							Static548.aClass3_Sub16_Sub3_4.method6100(Static338.anIntArray341[local73], local73);
							Static338.anIntArray341[local73] = 255;
						}
					}
					if (Static533.aClass3_Sub16_Sub3_3 == null) {
						if (Static72.aLong34 > 0L) {
							Static548.aClass3_Sub16_Sub3_4.method6108(Static72.aLong34, Static38.aBoolean94, Static459.aClass3_Sub22_2);
						} else {
							Static548.aClass3_Sub16_Sub3_4.method6115(Static459.aClass3_Sub22_2, Static38.aBoolean94);
						}
					}
					if (Static114.aClass58_1 != null) {
						Static114.aClass58_1.method5327(Static548.aClass3_Sub16_Sub3_4);
					}
					Static72.aLong34 = 0L;
					Static533.aClass3_Sub16_Sub3_3 = null;
					Static352.aClass20_1 = null;
					Static130.aClass284_126 = null;
					Static459.aClass3_Sub22_2 = null;
					return true;
				}
			}
		} catch (@Pc(162) Exception local162) {
			local162.printStackTrace();
			Static548.aClass3_Sub16_Sub3_4.method6125();
			Static130.aClass284_126 = null;
			Static352.aClass20_1 = null;
			Static459.aClass3_Sub22_2 = null;
			Static530.anInt9251 = 0;
			Static533.aClass3_Sub16_Sub3_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)Z")
	public static boolean method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static412.method5786(arg1, arg0) | (arg1 & 0x60000) != 0 || Static81.method1881(arg0, arg1) || Static164.method2974(arg1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!lr;Lclient!sp;IIIBLclient!pba;)V")
	public static void method2725(@OriginalArg(0) int arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class25_Sub2_Sub2_Sub5_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class25_Sub2_Sub2_Sub5_Sub1 arg6) {
		@Pc(7) Class3_Sub30 local7 = new Class3_Sub30();
		local7.anInt5180 = arg3 << 9;
		local7.anInt5181 = arg0 << 9;
		local7.anInt5184 = arg5;
		if (arg1 != null) {
			local7.aClass194_1 = arg1;
			@Pc(162) int local162 = arg1.anInt5845;
			@Pc(165) int local165 = arg1.anInt5830;
			if (arg4 == 1 || arg4 == 3) {
				local165 = arg1.anInt5845;
				local162 = arg1.anInt5830;
			}
			local7.aBoolean344 = arg1.aBoolean397;
			local7.anInt5192 = arg1.anInt5805 << 9;
			local7.anInt5186 = arg1.anInt5823;
			local7.anIntArray241 = arg1.anIntArray283;
			local7.anInt5188 = arg1.anInt5816;
			local7.anInt5189 = local162 + arg3 << 9;
			local7.anInt5190 = local165 + arg0 << 9;
			local7.anInt5187 = arg1.anInt5812;
			local7.anInt5183 = arg1.anInt5833;
			local7.aBoolean347 = arg1.aBoolean401;
			local7.anInt5179 = arg1.anInt5824;
			local7.anInt5191 = arg1.anInt5813;
			if (arg1.anIntArray286 != null) {
				local7.aBoolean346 = true;
				local7.method4156();
			}
			if (local7.anIntArray241 != null) {
				local7.anInt5182 = local7.anInt5179 + (int) ((double) (local7.anInt5191 - local7.anInt5179) * Math.random());
			}
			Static407.aClass244_54.method5570(local7);
		} else if (arg2 != null) {
			local7.aClass25_Sub2_Sub2_Sub5_Sub2_1 = arg2;
			@Pc(95) Class213 local95 = arg2.aClass213_1;
			if (local95.anIntArray345 != null) {
				local7.aBoolean346 = true;
				local95 = local95.method4998(Static206.aClass143_3);
			}
			if (local95 != null) {
				local7.anInt5189 = local95.anInt6196 + arg3 << 9;
				local7.anInt5190 = local95.anInt6196 + arg0 << 9;
				local7.anInt5188 = Static530.method7272(arg2);
				local7.aBoolean347 = local95.aBoolean442;
				local7.anInt5187 = local95.anInt6189;
				local7.anInt5183 = local95.anInt6206;
				local7.anInt5186 = local95.anInt6214;
				local7.anInt5192 = local95.anInt6188 << 9;
			}
			Static483.aClass244_60.method5570(local7);
		} else if (arg6 != null) {
			local7.aClass25_Sub2_Sub2_Sub5_Sub1_2 = arg6;
			local7.anInt5189 = arg3 + arg6.method6668() << 9;
			local7.anInt5190 = arg6.method6668() + arg0 << 9;
			local7.anInt5188 = Static392.method5562(arg6);
			local7.anInt5186 = 256;
			local7.anInt5183 = 256;
			local7.aBoolean347 = arg6.aBoolean496;
			local7.anInt5187 = arg6.anInt7174;
			local7.anInt5192 = arg6.anInt7154 << 9;
			Static66.aClass297_3.method6537((long) arg6.anInt8529, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method2726(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) byte[] local19 = new byte[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local19[local21] = (byte) local27;
			} else if (local27 == '€') {
				local19[local21] = -128;
			} else if (local27 == '‚') {
				local19[local21] = -126;
			} else if (local27 == 'ƒ') {
				local19[local21] = -125;
			} else if (local27 == '„') {
				local19[local21] = -124;
			} else if (local27 == '…') {
				local19[local21] = -123;
			} else if (local27 == '†') {
				local19[local21] = -122;
			} else if (local27 == '‡') {
				local19[local21] = -121;
			} else if (local27 == 'ˆ') {
				local19[local21] = -120;
			} else if (local27 == '‰') {
				local19[local21] = -119;
			} else if (local27 == 'Š') {
				local19[local21] = -118;
			} else if (local27 == '‹') {
				local19[local21] = -117;
			} else if (local27 == 'Œ') {
				local19[local21] = -116;
			} else if (local27 == 'Ž') {
				local19[local21] = -114;
			} else if (local27 == '‘') {
				local19[local21] = -111;
			} else if (local27 == '’') {
				local19[local21] = -110;
			} else if (local27 == '“') {
				local19[local21] = -109;
			} else if (local27 == '”') {
				local19[local21] = -108;
			} else if (local27 == '•') {
				local19[local21] = -107;
			} else if (local27 == '–') {
				local19[local21] = -106;
			} else if (local27 == '—') {
				local19[local21] = -105;
			} else if (local27 == '˜') {
				local19[local21] = -104;
			} else if (local27 == '™') {
				local19[local21] = -103;
			} else if (local27 == 'š') {
				local19[local21] = -102;
			} else if (local27 == '›') {
				local19[local21] = -101;
			} else if (local27 == 'œ') {
				local19[local21] = -100;
			} else if (local27 == 'ž') {
				local19[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local19[local21] = -97;
			} else {
				local19[local21] = 63;
			}
		}
		return local19;
	}
}
