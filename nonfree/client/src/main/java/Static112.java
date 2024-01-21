import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 aClass1_Sub1_Sub6_Sub2_14;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1717 = Static15.method178("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1718 = Static15.method178("Menge eingeben:");

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray75 = new int[104][104];

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1719 = Static15.method178("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1720 = Static15.method178("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1721 = Static15.method178("Handel akzeptieren");

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public static final int anInt2928 = 3353893;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1722 = aClass23_1720;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1723 = Static15.method178("Absender:");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public static void method1915() {
		aClass23_1719 = null;
		aByteArrayArray10 = null;
		aClass23_1718 = null;
		aClass23_1723 = null;
		aClass23_1720 = null;
		anIntArrayArray75 = null;
		aClass23_1722 = null;
		aClass1_Sub1_Sub6_Sub2_14 = null;
		aClass23_1721 = null;
		aClass23_1717 = null;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public static void method1916() {
		@Pc(7) int local7 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 + Static27.anInt854;
		@Pc(12) int local12 = Static60.anInt1813 + Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196;
		if (Static83.anInt2320 - local12 < -500 || Static83.anInt2320 - local12 > 500 || Static77.anInt2102 - local7 < -500 || Static77.anInt2102 - local7 > 500) {
			Static83.anInt2320 = local12;
			Static77.anInt2102 = local7;
		}
		if (Static83.anInt2320 != local12) {
			Static83.anInt2320 += (local12 - Static83.anInt2320) / 16;
		}
		@Pc(61) int local61 = Static83.anInt2320 >> 7;
		@Pc(68) int local68 = 0;
		if (Static77.anInt2102 != local7) {
			Static77.anInt2102 += (local7 - Static77.anInt2102) / 16;
		}
		@Pc(84) int local84 = Static77.anInt2102 >> 7;
		if (Static90.aBooleanArray10[96]) {
			Static10.anInt207 += (-Static10.anInt207 - 24) / 2;
		} else if (Static90.aBooleanArray10[97]) {
			Static10.anInt207 += (24 - Static10.anInt207) / 2;
		} else {
			Static10.anInt207 /= 2;
		}
		if (Static90.aBooleanArray10[98]) {
			Static105.anInt2694 += (12 - Static105.anInt2694) / 2;
		} else if (Static90.aBooleanArray10[99]) {
			Static105.anInt2694 += (-Static105.anInt2694 - 12) / 2;
		} else {
			Static105.anInt2694 /= 2;
		}
		Static3.anInt133 = Static10.anInt207 / 2 + Static3.anInt133 & 0x7FF;
		Static13.anInt233 += Static105.anInt2694 / 2;
		if (Static13.anInt233 < 128) {
			Static13.anInt233 = 128;
		}
		if (Static13.anInt233 > 383) {
			Static13.anInt233 = 383;
		}
		@Pc(182) int local182 = Static48.method987(Static77.anInt2102, Static83.anInt2320, Static79.anInt2137);
		@Pc(200) int local200;
		if (local61 > 3 && local84 > 3 && local61 < 100 && local84 < 100) {
			for (local200 = local61 - 4; local200 <= local61 + 4; local200++) {
				for (@Pc(206) int local206 = local84 - 4; local206 <= local84 + 4; local206++) {
					@Pc(210) int local210 = Static79.anInt2137;
					if (local210 < 3 && (Static95.aByteArrayArrayArray5[1][local200][local206] & 0x2) == 2) {
						local210++;
					}
					@Pc(239) int local239 = local182 - Static72.anIntArrayArrayArray5[local210][local200][local206];
					if (local68 < local239) {
						local68 = local239;
					}
				}
			}
		}
		local200 = local68 * 192;
		if (local200 > 98048) {
			local200 = 98048;
		}
		if (local200 < 32768) {
			local200 = 32768;
		}
		if (Static49.anInt1439 < local200) {
			Static49.anInt1439 += (local200 - Static49.anInt1439) / 24;
		} else if (local200 < Static49.anInt1439) {
			Static49.anInt1439 += (local200 - Static49.anInt1439) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIBI)Lclient!gd;")
	public static Class23 method1917(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 1;
		for (@Pc(17) int local17 = arg1 / 10; local17 != 0; local17 /= 10) {
			local5++;
		}
		@Pc(27) int local27 = local5;
		if (arg1 < 0 || arg0) {
			local27 = local5 + 1;
		}
		@Pc(38) byte[] local38 = new byte[local27];
		if (arg1 < 0) {
			local38[0] = 45;
		} else if (arg0) {
			local38[0] = 43;
		}
		for (@Pc(56) int local56 = 0; local56 < local5; local56++) {
			@Pc(61) int local61 = arg1 % 10;
			if (local61 < 0) {
				local61 = -local61;
			}
			if (local61 > 9) {
				local61 += 39;
			}
			local38[local27 - local56 - 1] = (byte) (local61 + 48);
			arg1 /= 10;
		}
		@Pc(100) Class23 local100 = new Class23();
		local100.anInt965 = local27;
		local100.aByteArray4 = local38;
		return local100;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB[B)I")
	public static int method1918(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static49.method895(arg0, arg1, 0);
	}
}
