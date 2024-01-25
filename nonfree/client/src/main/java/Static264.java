import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static int anInt4700;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt4696 = 0;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	public static boolean method4213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static287.aBoolean397) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static375.aClass62ArrayArray2[local13] == null || Static375.aClass62ArrayArray2[local13][local22] == null) {
			return false;
		}
		@Pc(40) Class62 local40 = Static375.aClass62ArrayArray2[local13][local22];
		@Pc(51) Class3_Sub4 local51;
		if (arg0 == -1 && local40.anInt1575 == 0) {
			for (local51 = (Class3_Sub4) Static47.aClass138_7.method3051(); local51 != null; local51 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
				if (local51.anInt808 == 12 || local51.anInt808 == 1004 || local51.anInt808 == 8 || local51.anInt808 == 11 || local51.anInt808 == 2) {
					for (@Pc(86) Class62 local86 = Static115.method1862(local51.anInt801); local86 != null; local86 = Static352.method5281(local86)) {
						if (local86.anInt1500 == local40.anInt1500) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class3_Sub4) Static47.aClass138_7.method3051(); local51 != null; local51 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
				if (arg0 == local51.anInt802 && local40.anInt1500 == local51.anInt801 && (local51.anInt808 == 12 || local51.anInt808 == 1004 || local51.anInt808 == 8 || local51.anInt808 == 11 || local51.anInt808 == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method4214(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method4215() {
		if (Static347.aClass155_9 == null) {
			return;
		}
		Static2.aClass22_1.method289();
		Static306.method4730();
		Static239.method5187();
		Static304.method2789();
		Static272.method4267();
		Static91.method2652();
		if (Static29.aClass101_3 != null) {
			Static29.aClass101_3.method2064();
		}
		Static125.method2014();
		Static73.method1286();
		Static259.method2662();
		Static348.method4050(false);
		Static239.method5186();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class28_Sub1_Sub1_Sub2 local39 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local33];
			if (local39 != null) {
				local39.aClass3_Sub32_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass75Array3.length; local46++) {
					local39.aClass75Array3[local46] = null;
				}
			}
		}
		for (@Pc(69) int local69 = 0; local69 < Static166.aClass28_Sub1_Sub1_Sub1Array41.length; local69++) {
			@Pc(75) Class28_Sub1_Sub1_Sub1 local75 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass75Array3.length; local79++) {
					local75.aClass75Array3[local79] = null;
				}
			}
		}
		Static347.aClass155_9.method4929();
		Static347.aClass155_9 = null;
	}
}
