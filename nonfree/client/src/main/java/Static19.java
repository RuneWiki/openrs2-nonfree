import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!ud;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_307 = Static15.method178("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_308 = aClass23_307;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_309 = Static15.method178("invback");

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_310 = Static15.method178(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_311 = Static15.method178("@yel@");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static int anInt494 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!gd;")
	public static Class23 method274(@OriginalArg(1) int arg0) {
		return Static112.method1917(false, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method275() {
		aClass65_1 = null;
		aBigInteger1 = null;
		aClass23_309 = null;
		aClass23_311 = null;
		aClass23_308 = null;
		aClass23_310 = null;
		aClass23_307 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method276() {
		Static110.method1904();
		Static2.method1416();
		Static16.method191();
		Static100.method1671();
		Static72.method1293();
		Static31.method507();
		Static84.method1468();
		Static106.method1795();
		Static46.method974();
		Static68.method216();
		Static35.method596();
		Static10.method113();
		((Class47) Static93.anInterface2_1).method1334();
		Static20.aClass5_19.method99();
		Static35.aClass55_Sub1_5.method1863();
		Static36.aClass55_Sub1_6.method1863();
		Static25.aClass55_Sub1_3.method1863();
		Static33.aClass55_Sub1_4.method1863();
		Static65.aClass55_Sub1_12.method1863();
		Static42.aClass55_Sub1_7.method1863();
		Static90.aClass55_Sub1_17.method1863();
		Static89.aClass55_Sub1_16.method1863();
		Static3.aClass55_Sub1_1.method1863();
		Static87.aClass55_Sub1_18.method1863();
		Static82.aClass55_Sub1_14.method1863();
		Static114.aClass55_Sub1_19.method1863();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method277() {
		Static40.anInt1397 = 0;
		Static104.anInt2686 = 0;
		Static79.anInt2135 = -1;
		Static44.anInt1486 = -1;
		Static26.anInt803 = 0;
		Static74.aBoolean90 = false;
		Static96.anInt1794 = -1;
		Static66.anInt1971 = 0;
		Static39.anInt1382 = 0;
		Static37.anInt1300 = -1;
		Static40.anInt1400 = 0;
		Static76.aClass1_Sub5_Sub1_2.anInt1266 = 0;
		Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3.length; local35++) {
			if (Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local35] != null) {
				Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local35].anInt2174 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local57++) {
			if (Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local57] != null) {
				Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local57].anInt2174 = -1;
			}
		}
		Static9.method102();
		Static89.method1524(30);
	}
}
