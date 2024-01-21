import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_32;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public static int anInt1168 = 0;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_554 = Static108.method1915("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!jb;")
	public static Class33 aClass33_13 = new Class33(50);

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static int anInt1177 = 0;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_557 = Static108.method1915("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_555 = aClass39_557;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	public static int anInt1178 = 0;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_556 = Static108.method1915("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIILclient!wa;I)V")
	public static void method700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub18 arg3, @OriginalArg(5) int arg4) {
		@Pc(3) Class1_Sub6 local3 = new Class1_Sub6();
		local3.anInt759 = arg1 * 128;
		local3.anInt757 = arg3.anInt3043;
		local3.anInt758 = arg3.anInt3034;
		@Pc(23) int local23 = arg3.anInt3039;
		local3.anInt755 = arg3.anInt3045 * 128;
		local3.anIntArray111 = arg3.anIntArray474;
		local3.anInt760 = arg4 * 128;
		local3.anInt752 = arg3.anInt3044;
		@Pc(45) int local45 = arg3.anInt3029;
		if (arg0 == 1 || arg0 == 3) {
			local45 = arg3.anInt3039;
			local23 = arg3.anInt3029;
		}
		local3.anInt753 = (arg1 + local45) * 128;
		local3.anInt762 = arg2;
		local3.anInt768 = (arg4 + local23) * 128;
		if (arg3.anIntArray477 != null) {
			local3.aClass1_Sub1_Sub18_1 = arg3;
			local3.method424();
		}
		Static120.aClass31_69.method1005(local3);
		if (local3.anIntArray111 != null) {
			local3.anInt769 = local3.anInt752 + (int) ((double) (local3.anInt758 - local3.anInt752) * Math.random());
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method701(@OriginalArg(0) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static128.anInt3156 > 0) {
			local23 = Static76.aByteArrayArray7[--Static128.anInt3156];
			Static76.aByteArrayArray7[Static128.anInt3156] = null;
			return local23;
		} else if (arg0 == 5000 && Static44.anInt1239 > 0) {
			local23 = Static48.aByteArrayArray5[--Static44.anInt1239];
			Static48.aByteArrayArray5[Static44.anInt1239] = null;
			return local23;
		} else if (arg0 == 30000 && Static37.anInt1124 > 0) {
			local23 = Static65.aByteArrayArray6[--Static37.anInt1124];
			Static65.aByteArrayArray6[Static37.anInt1124] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method702() {
		try {
			if (Static25.anInt837 == 1) {
				@Pc(18) int local18 = Static76.aClass1_Sub8_Sub4_2.method1743();
				if (local18 > 0 && Static76.aClass1_Sub8_Sub4_2.method1758()) {
					local18 -= Static49.anInt1364;
					if (local18 < 0) {
						local18 = 0;
					}
					Static76.aClass1_Sub8_Sub4_2.method1768(local18);
				} else {
					Static76.aClass1_Sub8_Sub4_2.method1750();
					Static76.aClass1_Sub8_Sub4_2.method1753();
					Static114.aClass1_Sub10_1 = null;
					if (Static90.aClass62_26 == null) {
						Static25.anInt837 = 0;
					} else {
						Static25.anInt837 = 2;
					}
					Static127.aClass21_1 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static76.aClass1_Sub8_Sub4_2.method1750();
			Static90.aClass62_26 = null;
			Static114.aClass1_Sub10_1 = null;
			Static25.anInt837 = 0;
			Static127.aClass21_1 = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method703() {
		Static16.aClass33_35.method1034();
		Static107.aClass33_37.method1034();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method704() {
		if (!Static99.aBoolean197) {
			return;
		}
		Static79.aClass6_18 = null;
		Static48.anIntArray181 = null;
		Static107.aClass1_Sub1_Sub4_Sub1Array10 = null;
		Static95.aClass1_Sub1_Sub4_Sub4_7 = null;
		Static12.aClass1_Sub1_Sub4_Sub1_9 = null;
		Static68.aClass1_Sub1_Sub4_Sub4_5 = null;
		Static77.aClass1_Sub1_Sub4_Sub1Array9 = null;
		Static53.aClass1_Sub1_Sub4_Sub4Array7 = null;
		Static70.aClass1_Sub1_Sub4_Sub1Array7 = null;
		Static49.anIntArray186 = null;
		Static101.anIntArray395 = null;
		Static32.aClass1_Sub1_Sub4_Sub1_13 = null;
		Static51.anIntArray195 = null;
		Static101.anIntArray392 = null;
		Static73.aClass1_Sub1_Sub4_Sub1_36 = null;
		Static41.anIntArray472 = null;
		Static31.aClass1_Sub1_Sub4_Sub1Array3 = null;
		Static62.anIntArray461 = null;
		Static101.anIntArray394 = null;
		Static52.aClass1_Sub1_Sub4_Sub1Array5 = null;
		Static57.aClass1_Sub1_Sub4_Sub1_31 = null;
		Static98.method1720();
		Static95.method2002(true);
		Static99.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method705() {
		aClass39_555 = null;
		aClass33_13 = null;
		aClass39_557 = null;
		aClass39_554 = null;
		aClass39_556 = null;
		aClass62_Sub1_32 = null;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
	public static boolean method706() {
		try {
			if (Static25.anInt837 == 2) {
				if (Static114.aClass1_Sub10_1 == null) {
					Static114.aClass1_Sub10_1 = Static132.method1115(Static90.aClass62_26, Static29.anInt972, Static35.anInt1070);
					if (Static114.aClass1_Sub10_1 == null) {
						return false;
					}
				}
				if (Static127.aClass21_1 == null) {
					Static127.aClass21_1 = new Class21(Static67.aClass62_19, Static22.aClass62_5);
				}
				if (Static76.aClass1_Sub8_Sub4_2.method1771(Static127.aClass21_1, Static114.aClass1_Sub10_1, Static116.aClass62_31)) {
					Static76.aClass1_Sub8_Sub4_2.method1746();
					Static76.aClass1_Sub8_Sub4_2.method1768(Static121.anInt2969);
					Static76.aClass1_Sub8_Sub4_2.method1774(Static114.aClass1_Sub10_1, Static13.aBoolean48);
					Static114.aClass1_Sub10_1 = null;
					Static25.anInt837 = 0;
					Static90.aClass62_26 = null;
					Static127.aClass21_1 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static76.aClass1_Sub8_Sub4_2.method1750();
			Static90.aClass62_26 = null;
			Static25.anInt837 = 0;
			Static114.aClass1_Sub10_1 = null;
			Static127.aClass21_1 = null;
		}
		return false;
	}
}
