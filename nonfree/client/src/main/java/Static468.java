import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qba", name = "G", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6844(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static463.anInt7895 >= 200 && !Static510.aBoolean660 || Static463.anInt7895 >= 200) {
			Static111.method1603(Static582.aClass335_12.method8349(Static323.anInt5795));
			return;
		}
		@Pc(34) String local34 = Static250.method3679(arg0);
		if (local34 == null) {
			return;
		}
		@Pc(91) String local91;
		for (@Pc(47) int local47 = 0; local47 < Static463.anInt7895; local47++) {
			@Pc(57) String local57 = Static250.method3679(Static444.aStringArray54[local47]);
			if (local57 != null && local57.equals(local34)) {
				Static111.method1603(arg0 + Static582.aClass335_39.method8349(Static323.anInt5795));
				return;
			}
			if (Static446.aStringArray57[local47] != null) {
				local91 = Static250.method3679(Static446.aStringArray57[local47]);
				if (local91 != null && local91.equals(local34)) {
					Static111.method1603(arg0 + Static582.aClass335_39.method8349(Static323.anInt5795));
					return;
				}
			}
		}
		for (@Pc(125) int local125 = 0; local125 < Static453.anInt7761; local125++) {
			local91 = Static250.method3679(Static197.aStringArray73[local125]);
			if (local91 != null && local91.equals(local34)) {
				Static111.method1603(Static582.aClass335_44.method8349(Static323.anInt5795) + arg0 + Static582.aClass335_45.method8349(Static323.anInt5795));
				return;
			}
			if (Static430.aStringArray43[local125] != null) {
				@Pc(174) String local174 = Static250.method3679(Static430.aStringArray43[local125]);
				if (local174 != null && local174.equals(local34)) {
					Static111.method1603(Static582.aClass335_44.method8349(Static323.anInt5795) + arg0 + Static582.aClass335_45.method8349(Static323.anInt5795));
					return;
				}
			}
		}
		if (Static250.method3679(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62).equals(local34)) {
			Static111.method1603(Static582.aClass335_42.method8349(Static323.anInt5795));
		} else {
			@Pc(236) Class5_Sub50 local236 = Static457.method6722(Static151.aClass387_30, Static80.aClass313_1);
			local236.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0));
			local236.aClass5_Sub23_Sub2_2.method8538(arg0);
			Static494.method7120(local236);
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method6845(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(27) char local27 = arg0.charAt(local13);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local13] = (byte) local27;
			} else if (local27 == '€') {
				local11[local13] = -128;
			} else if (local27 == '‚') {
				local11[local13] = -126;
			} else if (local27 == 'ƒ') {
				local11[local13] = -125;
			} else if (local27 == '„') {
				local11[local13] = -124;
			} else if (local27 == '…') {
				local11[local13] = -123;
			} else if (local27 == '†') {
				local11[local13] = -122;
			} else if (local27 == '‡') {
				local11[local13] = -121;
			} else if (local27 == 'ˆ') {
				local11[local13] = -120;
			} else if (local27 == '‰') {
				local11[local13] = -119;
			} else if (local27 == 'Š') {
				local11[local13] = -118;
			} else if (local27 == '‹') {
				local11[local13] = -117;
			} else if (local27 == 'Œ') {
				local11[local13] = -116;
			} else if (local27 == 'Ž') {
				local11[local13] = -114;
			} else if (local27 == '‘') {
				local11[local13] = -111;
			} else if (local27 == '’') {
				local11[local13] = -110;
			} else if (local27 == '“') {
				local11[local13] = -109;
			} else if (local27 == '”') {
				local11[local13] = -108;
			} else if (local27 == '•') {
				local11[local13] = -107;
			} else if (local27 == '–') {
				local11[local13] = -106;
			} else if (local27 == '—') {
				local11[local13] = -105;
			} else if (local27 == '˜') {
				local11[local13] = -104;
			} else if (local27 == '™') {
				local11[local13] = -103;
			} else if (local27 == 'š') {
				local11[local13] = -102;
			} else if (local27 == '›') {
				local11[local13] = -101;
			} else if (local27 == 'œ') {
				local11[local13] = -100;
			} else if (local27 == 'ž') {
				local11[local13] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZII)Z")
	public static boolean method6846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
