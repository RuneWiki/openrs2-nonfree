import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "Nb", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!ud", name = "Wb", descriptor = "Lclient!dd;")
	public static Class14 aClass14_29;

	@OriginalMember(owner = "client!ud", name = "cc", descriptor = "I")
	public static int anInt2889;

	@OriginalMember(owner = "client!ud", name = "Kb", descriptor = "[Lclient!ie;")
	public static Class35[] aClass35Array1 = new Class35[16];

	@OriginalMember(owner = "client!ud", name = "Ob", descriptor = "I")
	public static final int anInt2879 = 3353893;

	@OriginalMember(owner = "client!ud", name = "Ub", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1321 = null;

	@OriginalMember(owner = "client!ud", name = "ic", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1325 = Static56.method816("Login");

	@OriginalMember(owner = "client!ud", name = "Vb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1322 = aClass34_1325;

	@OriginalMember(owner = "client!ud", name = "bc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1323 = Static56.method816("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ud", name = "fc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1324 = Static56.method816("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ud", name = "kc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1326 = Static56.method816(":trade:");

	@OriginalMember(owner = "client!ud", name = "mc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1327 = Static56.method816("Stufe)2");

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)Lclient!sb;")
	public static Class8_Sub1_Sub17 method1896(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub17 local10 = (Class8_Sub1_Sub17) Static15.aClass48_11.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static97.aClass14_22.method1156(arg0, 14);
		local10 = new Class8_Sub1_Sub17();
		if (local20 != null) {
			local10.method1529(new Class8_Sub20(local20));
		}
		Static15.aClass48_11.method1097(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
	public static void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static47.anInt1277 != 0 && arg0 != -1) {
			Static86.method1302(0, Static47.anInt1277, Static77.aClass14_Sub1_13, arg0);
			Static60.aBoolean63 = true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	public static boolean method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BIIBI[Lclient!kd;III)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg4 + local7 > 0 && arg4 + local7 < 103 && local11 + arg8 > 0 && local11 + arg8 < 103) {
					arg5[arg0].anIntArrayArray12[local7 + arg4][arg8 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(84) Class8_Sub20 local84 = new Class8_Sub20(arg1);
		for (@Pc(86) int local86 = 0; local86 < 4; local86++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					if (local86 == arg6 && local98 >= arg3 && arg3 + 8 > local98 && local102 >= arg7 && local102 < arg7 + 8) {
						Static125.method1973(local84, arg0, arg8 + Static51.method769(local102 & 0x7, arg2, local98 & 0x7), 0, 0, Static39.method598(arg2, local98 & 0x7, local102 & 0x7) + arg4, arg2);
					} else {
						Static125.method1973(local84, 0, -1, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "(B)V")
	public static void method1902() {
		Static58.aClass48_29.method1101();
		Static88.aClass48_44.method1101();
		Static109.aClass48_50.method1101();
		Static93.aClass48_41.method1101();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZILclient!dd;Lclient!dd;Z)Lclient!he;")
	public static Class8_Sub1_Sub11 method1903(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(16) int[] local16 = arg1.method1153(arg0);
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(28) byte[] local28 = arg1.method1162(arg0, local16[local18]);
			if (local28 == null) {
				local7 = false;
			} else {
				@Pc(48) int local48 = (local28[0] & 0xFF) << 8 | local28[1] & 0xFF;
				@Pc(56) byte[] local56 = arg2.method1162(local48, 0);
				if (local56 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class8_Sub1_Sub11(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "(I)V")
	public static void method1908() {
		aClass34_1327 = null;
		aClass35Array1 = null;
		aClass34_1324 = null;
		aClass34_1322 = null;
		aClass14_29 = null;
		aClass34_1321 = null;
		aClass34_1325 = null;
		aClass34_1326 = null;
		aClass34_1323 = null;
	}

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "(II)Z")
	public static boolean method1910(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
