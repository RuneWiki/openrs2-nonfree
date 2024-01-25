import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!uu", name = "Y", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_212 = new Class151("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!uu", name = "W", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_213 = new Class151("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!uu", name = "X", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V")
	public static void method5233() {
		if (Static128.anInt2234 <= 0) {
			Static411.aString55 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static270.aStringArray36.length; local14++) {
			if (Static270.aStringArray36[local14].startsWith("--> ")) {
				local12++;
				if (Static128.anInt2234 == local12) {
					Static411.aString55 = Static270.aStringArray36[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5234(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)Lclient!id;")
	public static Class114_Sub1 method5235() {
		Static74.anInt1410 = 0;
		return Static369.method3949();
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
	public static void method5236() {
		@Pc(9) int local9 = Static253.anInt4091 * 128 + 64;
		@Pc(15) int local15 = Static65.anInt1146 * 128 + 64;
		@Pc(23) int local23 = Static183.method4175(local15, local9, Static138.anInt3548) - Static48.anInt803;
		if (Static149.anInt7379 >= 100) {
			Static278.anInt4391 = Static253.anInt4091 * 128 + 64;
			Static8.anInt7337 = Static65.anInt1146 * 128 + 64;
			Static5.anInt113 = Static183.method4175(Static8.anInt7337, Static278.anInt4391, Static138.anInt3548) - Static48.anInt803;
		} else {
			if (Static278.anInt4391 < local9) {
				Static278.anInt4391 += Static235.anInt3807 + Static149.anInt7379 * (local9 - Static278.anInt4391) / 1000;
				if (local9 < Static278.anInt4391) {
					Static278.anInt4391 = local9;
				}
			}
			if (local9 < Static278.anInt4391) {
				Static278.anInt4391 -= Static235.anInt3807 + (Static278.anInt4391 - local9) * Static149.anInt7379 / 1000;
				if (Static278.anInt4391 < local9) {
					Static278.anInt4391 = local9;
				}
			}
			if (local23 > Static5.anInt113) {
				Static5.anInt113 += Static235.anInt3807 + Static149.anInt7379 * (local23 - Static5.anInt113) / 1000;
				if (Static5.anInt113 > local23) {
					Static5.anInt113 = local23;
				}
			}
			if (Static8.anInt7337 < local15) {
				Static8.anInt7337 += Static149.anInt7379 * (local15 - Static8.anInt7337) / 1000 + Static235.anInt3807;
				if (local15 < Static8.anInt7337) {
					Static8.anInt7337 = local15;
				}
			}
			if (Static5.anInt113 > local23) {
				Static5.anInt113 -= (Static5.anInt113 - local23) * Static149.anInt7379 / 1000 + Static235.anInt3807;
				if (Static5.anInt113 < local23) {
					Static5.anInt113 = local23;
				}
			}
			if (local15 < Static8.anInt7337) {
				Static8.anInt7337 -= (Static8.anInt7337 - local15) * Static149.anInt7379 / 1000 + Static235.anInt3807;
				if (local15 > Static8.anInt7337) {
					Static8.anInt7337 = local15;
				}
			}
		}
		local9 = Static315.anInt5218 * 128 + 64;
		local15 = Static427.anInt7043 * 128 + 64;
		local23 = Static183.method4175(local15, local9, Static138.anInt3548) - Static365.anInt6176;
		@Pc(218) int local218 = local9 - Static278.anInt4391;
		@Pc(223) int local223 = local23 - Static5.anInt113;
		@Pc(228) int local228 = local15 - Static8.anInt7337;
		@Pc(244) int local244 = (int) Math.sqrt((double) (local218 * local218 + local228 * local228));
		@Pc(255) int local255 = (int) (Math.atan2((double) local223, (double) local244) * 2607.5945876176133D) & 0x3FFF;
		if (local255 < 1024) {
			local255 = 1024;
		}
		@Pc(273) int local273 = (int) (-2607.5945876176133D * Math.atan2((double) local218, (double) local228)) & 0x3FFF;
		if (local255 > 3072) {
			local255 = 3072;
		}
		if (local255 > Static401.anInt3623) {
			Static401.anInt3623 += Static71.anInt1332 + (local255 - Static401.anInt3623 >> 3) * Static388.anInt903 / 1000 << 3;
			if (Static401.anInt3623 > local255) {
				Static401.anInt3623 = local255;
			}
		}
		if (Static401.anInt3623 > local255) {
			Static401.anInt3623 -= Static71.anInt1332 + Static388.anInt903 * (Static401.anInt3623 - local255 >> 3) / 1000 << 3;
			if (local255 > Static401.anInt3623) {
				Static401.anInt3623 = local255;
			}
		}
		@Pc(348) int local348 = local273 - Static409.anInt6636;
		if (local348 > 8192) {
			local348 -= 16384;
		}
		if (local348 < -8192) {
			local348 += 16384;
		}
		local348 >>= 0x3;
		if (local348 > 0) {
			Static409.anInt6636 += Static388.anInt903 * local348 / 1000 + Static71.anInt1332 << 3;
			Static409.anInt6636 &= 0x3FFF;
		}
		if (local348 < 0) {
			Static409.anInt6636 -= -local348 * Static388.anInt903 / 1000 + Static71.anInt1332 << 3;
			Static409.anInt6636 &= 0x3FFF;
		}
		@Pc(407) int local407 = local273 - Static409.anInt6636;
		if (local407 > 8192) {
			local407 -= 16384;
		}
		if (local407 < -8192) {
			local407 += 16384;
		}
		if (local407 < 0 && local348 > 0 || local407 > 0 && local348 < 0) {
			Static409.anInt6636 = local273;
		}
		Static376.anInt6292 = 0;
	}
}
