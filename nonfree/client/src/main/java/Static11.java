import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	public static int anInt391;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "Lclient!sc;")
	private static Class66 aClass66_240 = Static106.method1849("Unable to connect)3");

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_238 = aClass66_240;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lclient!sc;")
	private static Class66 aClass66_242 = Static106.method1849("Use");

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "Lclient!sc;")
	public static Class66 aClass66_241 = aClass66_242;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
	public static int anInt397 = 10;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
	public static int[] anIntArray68 = new int[2000];

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "Lclient!sc;")
	public static Class66 aClass66_243 = Static106.method1849("Einloggen");

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!sc;")
	public static Class66 aClass66_244 = aClass66_240;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public static int anInt398 = 0;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "Lclient!rb;")
	public static Class60 aClass60_24 = new Class60(260);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)Lclient!nc;")
	public static Class1_Sub1_Sub8 method358(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub8 local6 = (Class1_Sub1_Sub8) Static128.aClass60_89.method1745((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static43.aClass5_38.method107(arg0, 8);
		local6 = new Class1_Sub1_Sub8();
		if (local20 != null) {
			local6.method1422(new Class1_Sub12(local20));
		}
		Static128.aClass60_89.method1741((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(BLclient!he;)Z")
	public static boolean method359(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(2) int local2 = arg0.anInt1329;
		if (local2 == 205) {
			Static9.anInt347 = 250;
			return true;
		}
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (local2 >= 300 && local2 <= 313) {
			local29 = (local2 - 300) / 2;
			local33 = local2 & 0x1;
			Static112.aClass38_2.method1258(local29, local33 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local29 = (local2 - 314) / 2;
			local33 = local2 & 0x1;
			Static112.aClass38_2.method1257(local29, local33 == 1);
		}
		if (local2 == 324) {
			Static112.aClass38_2.method1259(false);
		}
		if (local2 == 325) {
			Static112.aClass38_2.method1259(true);
		}
		if (local2 == 326) {
			Static127.aClass1_Sub12_Sub1_2.method1227(186);
			Static112.aClass38_2.method1260(Static127.aClass1_Sub12_Sub1_2);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method360() {
		aCalendar1 = null;
		aClass66_241 = null;
		aClass66_244 = null;
		aClass66_242 = null;
		aClass66_240 = null;
		aClass66_243 = null;
		anIntArray68 = null;
		aClass60_24 = null;
		aClass66_238 = null;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method361() {
		if (Static7.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static2.anIntArray17[220] = 74;
			Static2.anIntArray17[190] = 72;
			Static2.anIntArray17[189] = 26;
			Static2.anIntArray17[222] = 59;
			Static2.anIntArray17[187] = 27;
			Static2.anIntArray17[186] = 57;
			Static2.anIntArray17[188] = 71;
			Static2.anIntArray17[219] = 42;
			Static2.anIntArray17[191] = 73;
			Static2.anIntArray17[192] = 58;
			Static2.anIntArray17[223] = 28;
			Static2.anIntArray17[221] = 43;
			return;
		}
		if (Static7.aMethod2 == null) {
			Static2.anIntArray17[192] = 58;
			Static2.anIntArray17[222] = 59;
		} else {
			Static2.anIntArray17[192] = 28;
			Static2.anIntArray17[222] = 58;
			Static2.anIntArray17[520] = 59;
		}
		Static2.anIntArray17[45] = 26;
		Static2.anIntArray17[46] = 72;
		Static2.anIntArray17[93] = 43;
		Static2.anIntArray17[47] = 73;
		Static2.anIntArray17[61] = 27;
		Static2.anIntArray17[92] = 74;
		Static2.anIntArray17[59] = 57;
		Static2.anIntArray17[44] = 71;
		Static2.anIntArray17[91] = 42;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILclient!mc;)Lclient!sc;")
	public static Class66 method362(@OriginalArg(2) Class1_Sub12 arg0) {
		try {
			@Pc(12) Class66 local12 = new Class66();
			local12.anInt2583 = arg0.method1180();
			if (local12.anInt2583 > 32767) {
				local12.anInt2583 = 32767;
			}
			local12.aByteArray29 = new byte[local12.anInt2583];
			arg0.anInt1694 += Static122.aClass64_1.method1793(local12.aByteArray29, arg0.anInt1694, 0, local12.anInt2583, arg0.aByteArray12);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static88.aClass66_1280;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method363() {
		Static89.aClass60_71.method1747();
	}
}
