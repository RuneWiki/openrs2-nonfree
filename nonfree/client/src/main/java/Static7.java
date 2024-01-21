import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!gd;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
	public static boolean aBoolean17;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public static int anInt281;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!fc;")
	public static Class21 aClass21_3;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
	public static int[] anIntArray19 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!rc;")
	private static Class55 aClass55_127 = Static34.method846("You have only just left another world)3");

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_121 = aClass55_127;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!rc;")
	private static Class55 aClass55_122 = Static34.method846("From");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!rc;")
	private static Class55 aClass55_123 = Static34.method846("Hidden");

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_124 = aClass55_123;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_125 = Static34.method846("(U");

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_126 = aClass55_122;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	public static int anInt286 = 0;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public static int anInt292 = -1;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_128 = Static34.method846("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Z")
	public static boolean aBoolean18 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIII)Lclient!rc;")
	public static Class55 method245(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class55 local9 = new Class55();
		local9.aByteArray12 = new byte[arg2];
		local9.anInt2411 = 0;
		for (@Pc(23) int local23 = arg1; local23 < arg2 + arg1; local23++) {
			if (arg0[local23] != 0) {
				local9.aByteArray12[local9.anInt2411++] = arg0[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method249() {
		aClass55_126 = null;
		aClass55_123 = null;
		aClass25_1 = null;
		aClass55_124 = null;
		aClass55_122 = null;
		aClass21_3 = null;
		anIntArray19 = null;
		aClass55_121 = null;
		aClass55_127 = null;
		aClass55_128 = null;
		aClass55_125 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public static boolean method250(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 method251() {
		@Pc(9) Class6_Sub2_Sub2_Sub2 local9 = new Class6_Sub2_Sub2_Sub2();
		local9.anInt992 = Static88.anInt3274;
		local9.anInt993 = Static94.anInt2642;
		local9.anInt990 = Static34.anIntArray80[0];
		local9.anInt995 = Static94.anIntArray248[0];
		local9.anInt994 = Static72.anIntArray195[0];
		local9.anInt991 = Static38.anIntArray95[0];
		@Pc(44) byte[] local44 = Static67.aByteArrayArray6[0];
		@Pc(50) int local50 = local9.anInt994 * local9.anInt991;
		local9.anIntArray62 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local9.anIntArray62[local56] = Static44.anIntArray257[local44[local56] & 0xFF];
		}
		Static6.method238();
		return local9;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BZILclient!jc;)V")
	public static void method252(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32 arg2) {
		@Pc(12) Class6_Sub8 local12 = new Class6_Sub8();
		local12.aByteArray7 = arg0;
		local12.anInt1568 = 0;
		local12.aLong114 = arg1;
		local12.aClass32_2 = arg2;
		@Pc(27) Class3 local27 = Static90.aClass3_6;
		synchronized (Static90.aClass3_6) {
			Static90.aClass3_6.method23(local12);
		}
		Static10.method445();
	}
}
