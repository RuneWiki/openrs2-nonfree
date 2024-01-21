import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_12;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!sb;")
	public static Class25 aClass25_75;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_13;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "Lclient!sb;")
	public static Class25 aClass25_76;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array14 = new Class4[1000];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_840 = Static75.method1216("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_841 = Static75.method1216("::");

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public static int anInt1650 = -1;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!dd;")
	public static Class20 aClass20_8 = new Class20();

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_842 = Static75.method1216("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public static int anInt1652 = 0;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!ad;")
	private static Class4 aClass4_847 = Static75.method1216("Loading wordpack )2 ");

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!ad;")
	public static Class4 aClass4_843 = aClass4_847;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "Lclient!ad;")
	public static Class4 aClass4_844 = Static75.method1216("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!n", name = "D", descriptor = "Lclient!ad;")
	public static Class4 aClass4_845 = Static75.method1216("Einloggen");

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!ad;")
	public static Class4 aClass4_846 = Static75.method1216("p12_full");

	@OriginalMember(owner = "client!n", name = "I", descriptor = "I")
	public static int anInt1653 = 0;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "Lclient!ad;")
	private static Class4 aClass4_848 = Static75.method1216("Loading sprites )2 ");

	@OriginalMember(owner = "client!n", name = "L", descriptor = "Lclient!bb;")
	public static Class8 aClass8_22 = new Class8(260);

	@OriginalMember(owner = "client!n", name = "M", descriptor = "Lclient!ad;")
	public static Class4 aClass4_849 = aClass4_848;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZLclient!rd;IIIB)V")
	public static synchronized void method1102(@OriginalArg(1) int arg0, @OriginalArg(3) Class64 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static11.method1927()) {
			return;
		}
		Static56.aBoolean97 = false;
		Static60.anInt1461 = arg3;
		Static95.anInt2237 = -1;
		Static21.aBoolean32 = true;
		Static27.anInt826 = 10;
		Static17.aClass64_14 = arg1;
		Static81.anInt1904 = arg0;
		Static39.anInt1074 = 0;
		Static70.anInt1683 = arg2;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ad;ZLclient!rd;Lclient!ad;III)V")
	public static synchronized void method1103(@OriginalArg(1) Class4 arg0, @OriginalArg(3) Class64 arg1, @OriginalArg(4) Class4 arg2, @OriginalArg(7) int arg3) {
		if (Static11.method1927()) {
			@Pc(12) int local12 = arg1.method1638(arg0);
			@Pc(18) int local18 = arg1.method1626(local12, arg2);
			method1102(local18, arg1, local12, arg3);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1104() {
		if (Static77.anInt1842 != 1) {
			return;
		}
		if (Static4.anInt194 >= 6 && Static4.anInt194 <= 106 && Static91.anInt2055 >= 467 && Static91.anInt2055 <= 499) {
			Static58.anInt1429 = (Static58.anInt1429 + 1) % 4;
			Static46.aBoolean243 = true;
			Static86.aBoolean153 = true;
			Static5.aClass3_Sub4_Sub1_1.method464(24);
			Static5.aClass3_Sub4_Sub1_1.method423(Static58.anInt1429);
			Static5.aClass3_Sub4_Sub1_1.method423(Static55.anInt1391);
			Static5.aClass3_Sub4_Sub1_1.method423(Static44.anInt1146);
		}
		if (Static4.anInt194 >= 135 && Static4.anInt194 <= 235 && Static91.anInt2055 >= 467 && Static91.anInt2055 <= 499) {
			Static55.anInt1391 = (Static55.anInt1391 + 1) % 3;
			Static86.aBoolean153 = true;
			Static46.aBoolean243 = true;
			Static5.aClass3_Sub4_Sub1_1.method464(24);
			Static5.aClass3_Sub4_Sub1_1.method423(Static58.anInt1429);
			Static5.aClass3_Sub4_Sub1_1.method423(Static55.anInt1391);
			Static5.aClass3_Sub4_Sub1_1.method423(Static44.anInt1146);
		}
		if (Static4.anInt194 >= 273 && Static4.anInt194 <= 373 && Static91.anInt2055 >= 467 && Static91.anInt2055 <= 499) {
			Static44.anInt1146 = (Static44.anInt1146 + 1) % 3;
			Static46.aBoolean243 = true;
			Static86.aBoolean153 = true;
			Static5.aClass3_Sub4_Sub1_1.method464(24);
			Static5.aClass3_Sub4_Sub1_1.method423(Static58.anInt1429);
			Static5.aClass3_Sub4_Sub1_1.method423(Static55.anInt1391);
			Static5.aClass3_Sub4_Sub1_1.method423(Static44.anInt1146);
		}
		if (Static4.anInt194 < 412 || Static4.anInt194 > 512 || Static91.anInt2055 < 467 || Static91.anInt2055 > 499) {
			return;
		}
		if (Static48.anInt1201 != -1) {
			Static21.method296(Static23.aClass4_258, Static113.aClass4_1604, 0);
			return;
		}
		Static42.method795();
		if (Static23.anInt514 != -1) {
			Static70.aBoolean130 = false;
			Static72.anInt1740 = Static48.anInt1201 = Static23.anInt514;
			Static113.aClass4_1602 = Static113.aClass4_1604;
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	public static synchronized void method1105() {
		if (!Static11.method1927()) {
			return;
		}
		if (Static21.aBoolean32) {
			@Pc(23) byte[] local23 = Static38.method1912(Static39.anInt1074, Static17.aClass64_14, Static70.anInt1683, Static81.anInt1904);
			if (local23 != null) {
				if (Static27.anInt826 >= 0) {
					Static29.method616(Static27.anInt826, local23, Static60.anInt1461, Static56.aBoolean97);
				} else if (Static95.anInt2237 < 0) {
					Static25.method494(Static56.aBoolean97, local23, Static60.anInt1461);
				} else {
					Static44.method807(Static56.aBoolean97, Static60.anInt1461, local23, Static95.anInt2237);
				}
				Static17.aClass64_14 = null;
				Static21.aBoolean32 = false;
			}
		}
		Static87.method993();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static synchronized void method1106() {
		if (Static11.method1927()) {
			Static9.method200();
			Static17.aClass64_14 = null;
			Static21.aBoolean32 = false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lclient!m;")
	public static Class3_Sub1_Sub6 method1107(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub6 local6 = (Class3_Sub1_Sub6) Static13.aClass8_6.method195((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static95.aClass64_64.method1625(12, arg0);
		local6 = new Class3_Sub1_Sub6();
		if (local27 != null) {
			local6.method1081(new Class3_Sub4(local27));
		}
		local6.method1074();
		Static13.aClass8_6.method199((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZILclient!rd;ZI)V")
	public static synchronized void method1108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class64 arg3) {
		if (!Static11.method1927()) {
			return;
		}
		Static27.anInt826 = -1;
		Static21.aBoolean32 = true;
		Static60.anInt1461 = arg1;
		Static56.aBoolean97 = false;
		Static70.anInt1683 = arg0;
		Static17.aClass64_14 = arg3;
		Static81.anInt1904 = 0;
		Static95.anInt2237 = -1;
		Static39.anInt1074 = arg2;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method1109() {
		aClass4_844 = null;
		aClass4_846 = null;
		aClass4_845 = null;
		aClass4_848 = null;
		aClass4_847 = null;
		aClass8_22 = null;
		aClass4_849 = null;
		aClass64_Sub1_13 = null;
		aClass4_841 = null;
		anIntArray231 = null;
		aClass4_840 = null;
		aBigInteger2 = null;
		aClass4_842 = null;
		aClass4Array14 = null;
		aClass4_843 = null;
		aClass64_Sub1_12 = null;
		aClass25_75 = null;
		aClass20_8 = null;
		aClass25_76 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static synchronized void method1110() {
		Static38.method1910();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)V")
	public static synchronized void method1111() {
		if (Static11.method1927()) {
			Static5.method143();
			Static17.aClass64_14 = null;
			Static21.aBoolean32 = false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)Lclient!ga;")
	public static Class3_Sub1_Sub3 method1112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) long local13 = (long) ((arg1 << 16) + arg0);
		@Pc(19) Class3_Sub1_Sub3 local19 = (Class3_Sub1_Sub3) Static87.aClass8_19.method195(local13);
		if (local19 != null) {
			return local19;
		}
		@Pc(48) byte[] local48 = Static96.aClass64_Sub1_14.method1622(Static60.method1012(new Class4[] { Static93.method1632(arg1), Static85.aClass4_1116, Static93.method1632(arg0) }), Static91.aClass4_1161);
		@Pc(53) Class3_Sub4 local53 = new Class3_Sub4(local48);
		local19 = new Class3_Sub1_Sub3();
		local53.anInt627 = local53.aByteArray4.length - 12;
		@Pc(66) int local66 = 0;
		@Pc(70) int local70 = local53.method438();
		local19.anInt1036 = local53.method459();
		local19.anInt1031 = local53.method459();
		local19.anInt1034 = local53.method459();
		local19.anInt1037 = local53.method459();
		local19.anIntArray98 = new int[local70];
		local19.anIntArray97 = new int[local70];
		local53.anInt627 = 0;
		local19.aClass4Array8 = new Class4[local70];
		while (local53.aByteArray4.length - 12 > local53.anInt627) {
			@Pc(119) int local119 = local53.method459();
			if (local119 == 3) {
				local19.aClass4Array8[local66] = local53.method417();
			} else if (local119 >= 100 || local119 == 21 || local119 == 38 || local119 == 39) {
				local19.anIntArray98[local66] = local53.method446();
			} else {
				local19.anIntArray98[local66] = local53.method438();
			}
			local19.anIntArray97[local66++] = local119;
		}
		Static87.aClass8_19.method199(local13, local19);
		return local19;
	}
}
