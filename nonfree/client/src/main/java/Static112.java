import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1345 = Static34.method846("Loaded config");

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1346 = Static34.method846("Privater Chat");

	@OriginalMember(owner = "client!wb", name = "dc", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1357 = Static34.method846("K");

	@OriginalMember(owner = "client!wb", name = "tb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1347 = aClass55_1357;

	@OriginalMember(owner = "client!wb", name = "wb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1348 = Static34.method846("Offline");

	@OriginalMember(owner = "client!wb", name = "xb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1349 = Static34.method846("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!wb", name = "zb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1350 = Static34.method846("Loading interfaces )2 ");

	@OriginalMember(owner = "client!wb", name = "Ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1351 = aClass55_1350;

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!wb", name = "Jb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1352 = Static34.method846("Neuer Benutzer");

	@OriginalMember(owner = "client!wb", name = "Nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1353 = Static34.method846("@lre@");

	@OriginalMember(owner = "client!wb", name = "Ob", descriptor = "I")
	public static int anInt3227 = 0;

	@OriginalMember(owner = "client!wb", name = "Pb", descriptor = "I")
	public static int anInt3228 = 3;

	@OriginalMember(owner = "client!wb", name = "Tb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1354 = Static34.method846("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!wb", name = "Ub", descriptor = "I")
	public static int anInt3231 = 0;

	@OriginalMember(owner = "client!wb", name = "Zb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1355 = Static34.method846("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!wb", name = "bc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1356 = aClass55_1345;

	@OriginalMember(owner = "client!wb", name = "fc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1358 = Static34.method846(")3");

	@OriginalMember(owner = "client!wb", name = "jc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1359 = aClass55_1357;

	@OriginalMember(owner = "client!wb", name = "qc", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1362 = Static34.method846("Drop");

	@OriginalMember(owner = "client!wb", name = "lc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1360 = aClass55_1362;

	@OriginalMember(owner = "client!wb", name = "nc", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!wb", name = "oc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1361 = Static34.method846("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!wb", name = "pc", descriptor = "I")
	public static int anInt3242 = 0;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public static void method2067() {
		aBigInteger2 = null;
		aClass55_1348 = null;
		aClass55_1358 = null;
		aClass55_1356 = null;
		aClass55_1360 = null;
		aClass55_1359 = null;
		aClass55_1350 = null;
		aClass55_1345 = null;
		aClass55_1346 = null;
		aClass55_1353 = null;
		aClass55_1355 = null;
		aClass55_1352 = null;
		aClass55_1349 = null;
		aClass55_1361 = null;
		aClass55_1351 = null;
		aClass55_1357 = null;
		aClass55_1347 = null;
		aClass55_1354 = null;
		aClass55_1362 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!se;")
	public static Class6_Sub2_Sub12 method2068(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub12 local10 = (Class6_Sub2_Sub12) Static33.aClass36_16.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static17.aClass40_15.method1243(arg0, 14);
		local10 = new Class6_Sub2_Sub12();
		if (local20 != null) {
			local10.method1796(new Class6_Sub1(local20));
		}
		Static33.aClass36_16.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public static void method2069(@OriginalArg(1) int arg0) {
		if (!Static22.method654(arg0)) {
			return;
		}
		@Pc(14) Class6_Sub2_Sub14[] local14 = Static9.aClass6_Sub2_Sub14ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local14.length; local25++) {
			@Pc(31) Class6_Sub2_Sub14 local31 = local14[local25];
			if (local31 != null) {
				local31.anInt2928 = 0;
				local31.anInt2927 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	public static void method2071() {
		@Pc(1) Class9 local1 = Static69.aClass9_1;
		synchronized (Static69.aClass9_1) {
			Static6.anInt275 = Static97.anInt2830;
			Static58.anInt1741 = Static70.anInt2073;
			Static27.anInt1358 = Static81.anInt2298;
			Static85.anInt2400 = Static58.anInt1735;
			Static68.anInt2013 = Static95.anInt2767;
			Static23.anInt1030 = Static85.anInt2384;
			Static15.aLong30 = Static58.aLong64;
			Static58.anInt1735 = 0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)I")
	public static int method2073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 >> 7;
		@Pc(7) int local7 = arg1 >> 7;
		if (local7 < 0 || local3 < 0 || local7 > 103 || local3 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg1 & 0x7F;
		@Pc(34) int local34 = arg0;
		if (arg0 < 3 && (Static43.aByteArrayArrayArray8[1][local7][local3] & 0x2) == 2) {
			local34 = arg0 + 1;
		}
		@Pc(79) int local79 = Static6.anIntArrayArrayArray1[local34][local7][local3] * (128 - local32) + Static6.anIntArrayArrayArray1[local34][local7 + 1][local3] * local32 >> 7;
		@Pc(117) int local117 = Static6.anIntArrayArrayArray1[local34][local7][local3 + 1] * (128 - local32) + local32 * Static6.anIntArrayArrayArray1[local34][local7 + 1][local3 + 1] >> 7;
		@Pc(121) int local121 = arg2 & 0x7F;
		return (128 - local121) * local79 + local117 * local121 >> 7;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(Z)V")
	public static void method2074() {
		if (!Static12.aBoolean31) {
			return;
		}
		Static106.anIntArray234 = null;
		Static4.aClass6_Sub2_Sub2_Sub1_20 = null;
		Static78.anIntArray218 = null;
		Static29.aClass21_8 = null;
		Static59.anIntArray179 = null;
		Static15.aClass6_Sub2_Sub2_Sub1_5 = null;
		Static107.aClass21_25 = null;
		Static7.aClass21_3 = null;
		Static103.aClass21_22 = null;
		Static22.anIntArray64 = null;
		Static111.aClass21_27 = null;
		Static92.anIntArray245 = null;
		Static32.anIntArray79 = null;
		Static35.aClass21_10 = null;
		Static54.anIntArray162 = null;
		Static50.aClass6_Sub2_Sub2_Sub1Array52 = null;
		Static45.aClass21_12 = null;
		Static27.aClass6_Sub2_Sub2_Sub2_6 = null;
		Static74.aClass6_Sub2_Sub2_Sub2_11 = null;
		Static77.aClass21_18 = null;
		Static29.aClass21_7 = null;
		Static57.anIntArray165 = null;
		Static77.method1536();
		Static32.method801(true);
		Static12.aBoolean31 = false;
	}
}
