import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "[I")
	public static final int[] anIntArray34 = new int[25];

	@OriginalMember(owner = "client!ap", name = "N", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_6 = new Class231("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ap", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString2 = "";

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method313(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static112.aClass171_29.anInt4582 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		@Pc(74) int local74;
		for (@Pc(16) int local16 = 0; local16 < Static413.aClass271_2.anInt7603; local16++) {
			@Pc(22) Class218 local22 = Static413.aClass271_2.method6193(local16);
			if ((!arg1 || local22.aBoolean433) && local22.anInt6302 == -1 && local22.anInt6281 == -1 && local22.anInt6297 == 0 && local22.aString65.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static166.aShortArray44 = null;
					Static249.anInt4280 = -1;
					return;
				}
				if (local12.length <= local14) {
					@Pc(72) short[] local72 = new short[local12.length * 2];
					for (local74 = 0; local74 < local14; local74++) {
						local72[local74] = local12[local74];
					}
					local12 = local72;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static222.anInt3732 = 0;
		Static249.anInt4280 = local14;
		Static166.aShortArray44 = local12;
		@Pc(119) String[] local119 = new String[Static249.anInt4280];
		for (local74 = 0; local74 < Static249.anInt4280; local74++) {
			local119[local74] = Static413.aClass271_2.method6193(local12[local74]).aString65;
		}
		Static88.method3520(Static166.aShortArray44, local119);
		Static112.aClass171_29.method3667();
		Static112.aClass171_29.anInt4582 = 2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public static void method314(@OriginalArg(0) int arg0) {
		if (Static195.method2779(arg0)) {
			Static283.method4015(-1, Static188.aClass93ArrayArray4[arg0]);
		}
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(B)V")
	public static void method315() {
		if (Static273.anInt4956 == -1 || Static220.anInt3722 == -1) {
			return;
		}
		@Pc(23) int local23 = Static118.anInt2008 + ((Static384.anInt6628 - Static118.anInt2008) * Static346.anInt6132 >> 16);
		Static346.anInt6132 += local23;
		if (Static346.anInt6132 < 65535) {
			Static135.aBoolean92 = false;
			Static387.aBoolean453 = false;
		} else {
			Static346.anInt6132 = 65535;
			if (Static387.aBoolean453) {
				Static135.aBoolean92 = false;
			} else {
				Static135.aBoolean92 = true;
			}
			Static387.aBoolean453 = true;
		}
		@Pc(53) float local53 = (float) Static346.anInt6132 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static204.anInt3496 * 2;
		@Pc(86) int local86;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static43.anIntArrayArrayArray3[Static273.anInt4956][local60][local62] * 3;
			local86 = Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 1][local62] * 3;
			local119 = (Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 2][local62] + Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 2][local62] - Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 3][local62]) * 3;
			local127 = Static43.anIntArrayArrayArray3[Static273.anInt4956][local60][local62];
			local132 = local86 - local74;
			local141 = local119 + local74 - local86 * 2;
			local159 = Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 2][local62] + local86 - local127 - local119;
			local56[local62] = (float) local127 + local53 * ((float) local132 + local53 * ((float) local141 + (float) local159 * local53));
		}
		Static263.anInt4619 = (int) local56[0] - Static386.anInt7205 * 128;
		Static260.anInt4601 = (int) local56[1] * -1;
		Static120.anInt2052 = (int) local56[2] - Static153.anInt2798 * 128;
		@Pc(215) float[] local215 = new float[3];
		local86 = Static269.anInt2104 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static43.anIntArrayArrayArray3[Static220.anInt3722][local86][local119] * 3;
			local132 = Static43.anIntArrayArrayArray3[Static220.anInt3722][local86 + 1][local119] * 3;
			local141 = (Static43.anIntArrayArrayArray3[Static220.anInt3722][local86 + 2][local119] + Static43.anIntArrayArrayArray3[Static220.anInt3722][local86 + 2][local119] - Static43.anIntArrayArrayArray3[Static220.anInt3722][local86 + 3][local119]) * 3;
			local159 = Static43.anIntArrayArrayArray3[Static220.anInt3722][local86][local119];
			@Pc(291) int local291 = local132 - local127;
			@Pc(300) int local300 = local141 + local127 - local132 * 2;
			@Pc(317) int local317 = Static43.anIntArrayArrayArray3[Static220.anInt3722][local86 + 2][local119] + local132 - local159 - local141;
			local215[local119] = local53 * ((float) local291 + (local53 * (float) local317 + (float) local300) * local53) + (float) local159;
		}
		@Pc(352) float local352 = local215[0] - local56[0];
		@Pc(367) float local367 = (local215[1] - local56[1]) * -1.0F;
		@Pc(375) float local375 = local215[2] - local56[2];
		@Pc(385) double local385 = Math.sqrt((double) (local352 * local352 + local375 * local375));
		Static213.anInt3662 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static144.anInt2665 = (int) (-Math.atan2((double) local352, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static68.anInt1160 = ((Static43.anIntArrayArrayArray3[Static273.anInt4956][local60 + 2][3] - Static43.anIntArrayArrayArray3[Static273.anInt4956][local60][3]) * Static346.anInt6132 >> 16) + Static43.anIntArrayArrayArray3[Static273.anInt4956][local60][3];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IC)B")
	public static byte method316(@OriginalArg(1) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}
}
