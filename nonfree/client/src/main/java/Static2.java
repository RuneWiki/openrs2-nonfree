import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "fb", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
	public static int anInt90;

	@OriginalMember(owner = "client!aa", name = "tb", descriptor = "Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 aClass2_Sub1_Sub4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "sb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_46 = Static119.method1462("This world is full)3");

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_43 = aClass65_46;

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "Lclient!pe;")
	public static Class65 aClass65_44 = Static119.method1462("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "[I")
	public static int[] anIntArray7 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "Z")
	public static volatile boolean aBoolean3 = true;

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_45 = Static119.method1462("Wordpack geladen)3");

	@OriginalMember(owner = "client!aa", name = "vb", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!ae;BI)V")
	public static void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (Static50.anInt1215 >= 50 || Static7.anInt221 == 0 || (arg2.anIntArray17 == null || arg0 >= arg2.anIntArray17.length)) {
			return;
		}
		@Pc(30) int local30 = arg2.anIntArray17[arg0];
		if (local30 == 0) {
			return;
		}
		@Pc(37) int local37 = local30 >> 8;
		Static128.anIntArray360[Static50.anInt1215] = local37;
		@Pc(47) int local47 = local30 >> 4 & 0x7;
		@Pc(53) int local53 = (arg3 - 64) / 128;
		@Pc(57) int local57 = local30 & 0xF;
		Static34.anIntArray99[Static50.anInt1215] = local47;
		@Pc(67) int local67 = (arg1 - 64) / 128;
		Static110.anIntArray327[Static50.anInt1215] = 0;
		Static130.aClass44Array1[Static50.anInt1215] = null;
		Static115.anIntArray336[Static50.anInt1215] = (local53 << 16) + (local67 << 8) + local57;
		Static50.anInt1215++;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
	public static void method63() {
		aClass65_44 = null;
		aClass65_45 = null;
		aClass2_Sub1_Sub4_Sub3_Sub1_1 = null;
		anIntArray8 = null;
		aClass65_46 = null;
		aClass65_43 = null;
		anIntArray7 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
	public static void method64(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static38.aBooleanArray7[arg0]) {
			return;
		}
		Static89.aClass56_29.method1672(arg0);
		if (Static95.aClass2_Sub22ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < Static95.aClass2_Sub22ArrayArray1[arg0].length; local36++) {
			if (Static95.aClass2_Sub22ArrayArray1[arg0][local36] != null) {
				if (Static95.aClass2_Sub22ArrayArray1[arg0][local36].anInt2813 == 2) {
					local34 = false;
				} else {
					Static95.aClass2_Sub22ArrayArray1[arg0][local36] = null;
				}
			}
		}
		if (local34) {
			Static95.aClass2_Sub22ArrayArray1[arg0] = null;
		}
		Static38.aBooleanArray7[arg0] = false;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)V")
	public static void method65(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!re;B)V")
	public static void method66(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub1 arg1) {
		if (Static104.aClass2_Sub4_38 == null) {
			Static30.method603(null, 0, (byte) 0, 255, 255, true);
			Static59.aClass56_Sub1Array1[arg0] = arg1;
		} else {
			Static104.aClass2_Sub4_38.anInt1298 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static104.aClass2_Sub4_38.method903();
			@Pc(20) int local20 = Static104.aClass2_Sub4_38.method903();
			arg1.method1693(local20, local16);
		}
	}
}
