import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
	public static int anInt4329 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	public static void method3925() {
		Static498.anInt10141 = -2;
		Static260.anInt4398 = 0;
		Static466.anInt7667 = -2;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3927(@OriginalArg(0) String arg0) {
		if (!Static624.aBoolean698 || (Static173.anInt3449 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(24) int local24 = Static393.anInt6147;
		@Pc(26) int[] local26 = Static430.anIntArray612;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(36) Class28_Sub1_Sub1_Sub1_Sub1 local36 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local26[local28]];
			if (local36.aString123 != null && local36.aString123.equalsIgnoreCase(arg0) && (local36 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 && (Static173.anInt3449 & 0x10) != 0 || local36 != null && (Static173.anInt3449 & 0x8) != 0)) {
				@Pc(66) Class3_Sub34 local66 = Static172.method3123(Static163.aClass375_1, Static630.aClass218_150);
				local66.aClass3_Sub25_Sub1_2.method8595(Static531.anInt8767);
				local66.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
				local66.aClass3_Sub25_Sub1_2.method8596(local26[local28]);
				local66.aClass3_Sub25_Sub1_2.method8616(Static658.anInt10730);
				local66.aClass3_Sub25_Sub1_2.method8614(0);
				Static441.method6275(local66);
				Static471.method6829(0, local36.method9314(), -2, local36.anIntArray955[0], local36.anIntArray956[0], local36.method9314(), 0, true);
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static381.method5445(Static601.aClass346_23.method8440(Static609.anInt9834) + arg0);
		}
		if (Static624.aBoolean698) {
			Static632.method8816();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method3928() {
		if (Static594.aClass45Array1 == null) {
			Static594.aClass45Array1 = Static55.method1211();
			Static615.aClass45_23 = Static594.aClass45Array1[0];
			Static258.aLong141 = Static524.method7320();
		}
		if (Static578.aClass193_1 == null) {
			Static201.method3623();
		}
		@Pc(23) Class45 local23 = Static615.aClass45_23;
		@Pc(31) int local31 = Static579.method8156();
		if (local23 == Static615.aClass45_23) {
			Static421.aString68 = Static615.aClass45_23.aClass346_1.method8440(Static609.anInt9834);
			if (Static615.aClass45_23.aBoolean84) {
				Static340.anInt5689 = local31 * (Static615.aClass45_23.anInt1148 - Static615.aClass45_23.anInt1154) / 100 + Static615.aClass45_23.anInt1154;
			}
			if (Static615.aClass45_23.aBoolean83) {
				Static421.aString68 = Static421.aString68 + Static340.anInt5689 + "%";
			}
		} else if (Static615.aClass45_23 == Static55.aClass45_21) {
			Static578.aClass193_1 = null;
			Static553.method7892(3);
		} else {
			Static421.aString68 = local23.aClass346_2.method8440(Static609.anInt9834);
			if (Static615.aClass45_23.aBoolean83) {
				Static421.aString68 = Static421.aString68 + local23.anInt1148 + "%";
			}
			Static340.anInt5689 = local23.anInt1148;
			if (Static615.aClass45_23.aBoolean84 || local23.aBoolean84) {
				Static258.aLong141 = Static524.method7320();
			}
		}
		if (Static578.aClass193_1 == null) {
			return;
		}
		Static578.aClass193_1.method4869(Static421.aString68, Static615.aClass45_23, Static340.anInt5689, Static258.aLong141);
		if (Static155.anInterface19Array1 == null) {
			return;
		}
		for (@Pc(131) int local131 = Static87.anInt1709 + 1; local131 < Static155.anInterface19Array1.length; local131++) {
			if (Static155.anInterface19Array1[local131].method2899() >= 100 && Static87.anInt1709 == local131 - 1 && Static406.anInt6454 >= 1 && Static578.aClass193_1.method4860()) {
				try {
					Static155.anInterface19Array1[local131].method2900();
				} catch (@Pc(163) Exception local163) {
					Static155.anInterface19Array1 = null;
					return;
				}
				Static578.aClass193_1.method4858(Static155.anInterface19Array1[local131]);
				Static87.anInt1709++;
				if (Static87.anInt1709 >= Static155.anInterface19Array1.length - 1 && Static155.anInterface19Array1.length > 1) {
					Static87.anInt1709 = Static559.aClass44_1.method1161() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/lang/String;IIZ[B)I")
	public static int method3931(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(13) int local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg1.charAt(local15);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg3[local15 + arg2] = (byte) local22;
			} else if (local22 == '€') {
				arg3[arg2 + local15] = -128;
			} else if (local22 == '‚') {
				arg3[local15 + arg2] = -126;
			} else if (local22 == 'ƒ') {
				arg3[arg2 + local15] = -125;
			} else if (local22 == '„') {
				arg3[local15 + arg2] = -124;
			} else if (local22 == '…') {
				arg3[arg2 + local15] = -123;
			} else if (local22 == '†') {
				arg3[arg2 + local15] = -122;
			} else if (local22 == '‡') {
				arg3[arg2 + local15] = -121;
			} else if (local22 == 'ˆ') {
				arg3[local15 + arg2] = -120;
			} else if (local22 == '‰') {
				arg3[local15 + arg2] = -119;
			} else if (local22 == 'Š') {
				arg3[local15 + arg2] = -118;
			} else if (local22 == '‹') {
				arg3[local15 + arg2] = -117;
			} else if (local22 == 'Œ') {
				arg3[local15 + arg2] = -116;
			} else if (local22 == 'Ž') {
				arg3[local15 + arg2] = -114;
			} else if (local22 == '‘') {
				arg3[arg2 + local15] = -111;
			} else if (local22 == '’') {
				arg3[local15 + arg2] = -110;
			} else if (local22 == '“') {
				arg3[arg2 + local15] = -109;
			} else if (local22 == '”') {
				arg3[arg2 + local15] = -108;
			} else if (local22 == '•') {
				arg3[local15 + arg2] = -107;
			} else if (local22 == '–') {
				arg3[local15 + arg2] = -106;
			} else if (local22 == '—') {
				arg3[arg2 + local15] = -105;
			} else if (local22 == '˜') {
				arg3[local15 + arg2] = -104;
			} else if (local22 == '™') {
				arg3[arg2 + local15] = -103;
			} else if (local22 == 'š') {
				arg3[local15 + arg2] = -102;
			} else if (local22 == '›') {
				arg3[local15 + arg2] = -101;
			} else if (local22 == 'œ') {
				arg3[arg2 + local15] = -100;
			} else if (local22 == 'ž') {
				arg3[arg2 + local15] = -98;
			} else if (local22 == 'Ÿ') {
				arg3[arg2 + local15] = -97;
			} else {
				arg3[arg2 + local15] = 63;
			}
		}
		return local13;
	}
}
