import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!fe;")
	public static Class29 aClass29_63;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt3156;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "J")
	public static long aLong156;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1774 = Static28.method504("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1775 = Static28.method504("Unable to connect)3");

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1776 = aClass39_1775;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1777 = Static28.method504("<col=ffffff>");

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1778 = Static28.method504("Versteckt");

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1779 = aClass39_1775;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt3160 = 0;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1780 = Static28.method504("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!c;")
	public static Class12 aClass12_88 = new Class12(64);

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt3163 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lclient!ja;")
	public static Class39 method2187(@OriginalArg(0) int arg0) {
		@Pc(14) Class39 local14 = Static29.method510(arg0);
		for (@Pc(20) int local20 = local14.method953() - 3; local20 > 0; local20 -= 3) {
			local14 = Static62.method1123(new Class39[] { local14.method938(local20, 0), Static112.aClass39_1467, local14.method964(local20) });
		}
		if (local14.method953() > 9) {
			return Static62.method1123(new Class39[] { Static118.aClass39_1545, local14.method938(local14.method953() - 8, 0), Static25.aClass39_1787, Static82.aClass39_1044, local14, Static71.aClass39_918 });
		} else if (local14.method953() > 6) {
			return Static62.method1123(new Class39[] { Static27.aClass39_393, local14.method938(local14.method953() - 4, 0), Static117.aClass39_1543, Static82.aClass39_1044, local14, Static71.aClass39_918 });
		} else {
			return Static62.method1123(new Class39[] { Static77.aClass39_988, local14, Static70.aClass39_916 });
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Lclient!ff;")
	public static Class4_Sub2_Sub6 method2188(@OriginalArg(0) int arg0) {
		@Pc(6) Class4_Sub2_Sub6 local6 = (Class4_Sub2_Sub6) Static41.aClass12_27.method235((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static23.aClass20_17.method474(5, arg0);
		local6 = new Class4_Sub2_Sub6();
		if (local20 != null) {
			local6.method626(new Class4_Sub16(local20));
		}
		Static41.aClass12_27.method234(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method2190() {
		aClass39_1774 = null;
		aClass12_88 = null;
		aClass39_1776 = null;
		aClass39_1780 = null;
		aClass39_1775 = null;
		aClass39_1779 = null;
		aClass29_63 = null;
		aClass39_1777 = null;
		aClass39_1778 = null;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lclient!ja;")
	public static Class39 method2191(@OriginalArg(0) int arg0) {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1481 = 0;
		local7.aByteArray10 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method2192() {
		try {
			if (Static40.anInt1002 == 1) {
				@Pc(15) int local15 = Static80.aClass4_Sub1_Sub1_2.method83();
				if (local15 > 0 && Static80.aClass4_Sub1_Sub1_2.method82()) {
					local15 -= Static54.anInt1478;
					if (local15 < 0) {
						local15 = 0;
					}
					Static80.aClass4_Sub1_Sub1_2.method88(local15);
				} else {
					Static80.aClass4_Sub1_Sub1_2.method80();
					Static80.aClass4_Sub1_Sub1_2.method61();
					if (Static14.aClass20_10 == null) {
						Static40.anInt1002 = 0;
					} else {
						Static40.anInt1002 = 2;
					}
					Static7.aClass13_1 = null;
					Static120.aClass4_Sub4_1 = null;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static80.aClass4_Sub1_Sub1_2.method80();
			Static120.aClass4_Sub4_1 = null;
			Static40.anInt1002 = 0;
			Static7.aClass13_1 = null;
			Static14.aClass20_10 = null;
		}
	}
}
