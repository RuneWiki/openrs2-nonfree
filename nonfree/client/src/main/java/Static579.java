import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IC)B")
	public static byte method7686(@OriginalArg(1) char arg0) {
		@Pc(38) byte local38;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local38 = (byte) arg0;
		} else if (arg0 == '€') {
			local38 = -128;
		} else if (arg0 == '‚') {
			local38 = -126;
		} else if (arg0 == 'ƒ') {
			local38 = -125;
		} else if (arg0 == '„') {
			local38 = -124;
		} else if (arg0 == '…') {
			local38 = -123;
		} else if (arg0 == '†') {
			local38 = -122;
		} else if (arg0 == '‡') {
			local38 = -121;
		} else if (arg0 == 'ˆ') {
			local38 = -120;
		} else if (arg0 == '‰') {
			local38 = -119;
		} else if (arg0 == 'Š') {
			local38 = -118;
		} else if (arg0 == '‹') {
			local38 = -117;
		} else if (arg0 == 'Œ') {
			local38 = -116;
		} else if (arg0 == 'Ž') {
			local38 = -114;
		} else if (arg0 == '‘') {
			local38 = -111;
		} else if (arg0 == '’') {
			local38 = -110;
		} else if (arg0 == '“') {
			local38 = -109;
		} else if (arg0 == '”') {
			local38 = -108;
		} else if (arg0 == '•') {
			local38 = -107;
		} else if (arg0 == '–') {
			local38 = -106;
		} else if (arg0 == '—') {
			local38 = -105;
		} else if (arg0 == '˜') {
			local38 = -104;
		} else if (arg0 == '™') {
			local38 = -103;
		} else if (arg0 == 'š') {
			local38 = -102;
		} else if (arg0 == '›') {
			local38 = -101;
		} else if (arg0 == 'œ') {
			local38 = -100;
		} else if (arg0 == 'ž') {
			local38 = -98;
		} else if (arg0 == 'Ÿ') {
			local38 = -97;
		} else {
			local38 = 63;
		}
		return local38;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
	public static void method7687() {
		if (!Static492.aBoolean481) {
			return;
		}
		while (true) {
			while (Static338.aClass133_Sub1Array2.length > Static558.anInt8941) {
				@Pc(26) Class133_Sub1 local26 = Static338.aClass133_Sub1Array2[Static558.anInt8941];
				if (local26 != null && local26.anInt4104 == -1) {
					if (Static347.aClass3_Sub5_1 == null) {
						Static347.aClass3_Sub5_1 = Static490.aClass102_3.method2797(local26.aString50);
					}
					@Pc(50) int local50 = Static347.aClass3_Sub5_1.anInt124;
					if (local50 == -1) {
						return;
					}
					Static558.anInt8941++;
					Static347.aClass3_Sub5_1 = null;
					local26.anInt4104 = local50;
				} else {
					Static558.anInt8941++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)Z")
	public static boolean method7688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
