import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1309 = Static69.method1231("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1310 = Static69.method1231("Spieler");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!je;")
	private static Class40 aClass40_1318 = Static69.method1231("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1311 = aClass40_1318;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!je;")
	private static Class40 aClass40_1312 = Static69.method1231("cyan:");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_1313 = Static69.method1231("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt2473 = 0;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_1314 = aClass40_1318;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1315 = Static69.method1231("null");

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_1316 = aClass40_1312;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_1317 = aClass40_1312;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_1319 = Static69.method1231("(U3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] method1791() {
		@Pc(8) Class2_Sub1_Sub2_Sub1[] local8 = new Class2_Sub1_Sub2_Sub1[Static12.anInt3050];
		for (@Pc(10) int local10 = 0; local10 < Static12.anInt3050; local10++) {
			@Pc(20) Class2_Sub1_Sub2_Sub1 local20 = local8[local10] = new Class2_Sub1_Sub2_Sub1();
			local20.anInt1633 = Static16.anInt410;
			local20.anInt1634 = Static10.anInt2972;
			local20.anInt1630 = Static3.anIntArray5[local10];
			local20.anInt1635 = Static105.anIntArray287[local10];
			local20.anInt1632 = Static3.anIntArray6[local10];
			local20.anInt1631 = Static57.anIntArray149[local10];
			local20.anIntArray164 = Static69.anIntArray205;
			local20.aByteArray19 = Static127.aByteArrayArray9[local10];
		}
		Static126.method2088();
		return local8;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method1792() {
		aClass40_1319 = null;
		aClass40_1315 = null;
		aClass40_1310 = null;
		aClass40_1317 = null;
		aClass40_1316 = null;
		aClass40_1318 = null;
		aClass40_1313 = null;
		aClass40_1311 = null;
		aClass40_1314 = null;
		aClass40_1312 = null;
		aClass40_1309 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)I")
	public static int method1793(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public static void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub1_Sub5 local12 = Static64.method1142(arg1);
		@Pc(15) int local15 = local12.anInt1397;
		@Pc(18) int local18 = local12.anInt1399;
		@Pc(21) int local21 = local12.anInt1393;
		@Pc(27) int local27 = Class1.anIntArray1[local21 - local18];
		if (arg0 < 0 || local27 < arg0) {
			arg0 = 0;
		}
		local27 <<= local18;
		Static35.anIntArray96[local15] = local27 & arg0 << local18 | ~local27 & Static35.anIntArray96[local15];
	}
}
