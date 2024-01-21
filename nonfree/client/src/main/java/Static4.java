import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt1218;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_5;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!lb;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_543 = Static119.method1462("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_544 = Static119.method1462("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!pe;")
	private static Class65 aClass65_547 = Static119.method1462("No reply from loginserver)3");

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_545 = aClass65_547;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public static int anInt1223 = 0;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!l;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[I")
	public static int[] anIntArray156 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!pe;")
	private static Class65 aClass65_546 = Static119.method1462("Bad session id)3");

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
	public static boolean aBoolean49 = true;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_548 = Static119.method1462("Die Verbindung konnte");

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_549 = aClass65_546;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public static int anInt1236 = 0;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public static int anInt1241 = 1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method855() {
		@Pc(1) Object local1 = Static10.anObject65;
		synchronized (Static10.anObject65) {
			if (Static119.anInt1927 != 0) {
				Static119.anInt1927 = 1;
				try {
					Static10.anObject65.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BJ)V")
	public static void method856(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static91.anInt2030; local12++) {
			if (Static93.aLongArray5[local12] == arg0) {
				Static91.anInt2030--;
				for (@Pc(26) int local26 = local12; local26 < Static91.anInt2030; local26++) {
					Static88.aClass65Array45[local26] = Static88.aClass65Array45[local26 + 1];
					Static61.anIntArray178[local26] = Static61.anIntArray178[local26 + 1];
					Static93.aLongArray5[local26] = Static93.aLongArray5[local26 + 1];
					Static11.anIntArray163[local26] = Static11.anIntArray163[local26 + 1];
				}
				Static59.anInt1470 = Static8.anInt228;
				Static49.aClass2_Sub4_Sub1_1.method962(20);
				Static49.aClass2_Sub4_Sub1_1.method948(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)I")
	public static int method858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			arg0--;
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method860() {
		aClass65_548 = null;
		aClass65_549 = null;
		aClass65_545 = null;
		anIntArray157 = null;
		anIntArray156 = null;
		aClass47_3 = null;
		aClass65_543 = null;
		aClass65_544 = null;
		aClass2_Sub22_5 = null;
		aClass65_547 = null;
		aClass65_546 = null;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	public static void method867() {
		Static102.aClass8_51.method171();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lclient!qa;")
	public static Class2_Sub1_Sub11 method872(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub11 local6 = (Class2_Sub1_Sub11) Static95.aClass8_46.method172((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static35.aClass56_14.method1666(arg0, 10);
		local6 = new Class2_Sub1_Sub11();
		local6.anInt2093 = arg0;
		if (local29 != null) {
			local6.method1538(new Class2_Sub4(local29));
		}
		local6.method1533();
		if (local6.anInt2091 != -1) {
			local6.method1543(method872(local6.anInt2101), method872(local6.anInt2091));
		}
		if (!Static105.aBoolean99 && local6.aBoolean80) {
			local6.anInt2092 = 0;
			local6.aClass65Array49 = null;
			local6.aClass65Array48 = null;
			local6.aClass65_870 = Static62.aClass65_655;
		}
		Static95.aClass8_46.method176((long) arg0, local6);
		return local6;
	}
}
