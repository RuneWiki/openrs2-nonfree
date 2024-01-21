import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!na;")
	public static Class56 aClass56_34;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_14;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt2520 = 0;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
	public static int[] anIntArray333 = new int[500];

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1071 = Static119.method1462("Passwort: ");

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1074 = Static119.method1462("Please enter your password)3");

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1072 = aClass65_1074;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1073 = Static119.method1462("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	public static int anInt2529 = 0;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	public static int anInt2532 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1822() {
		aByteArrayArrayArray5 = null;
		aClass65_1072 = null;
		aClass65_1073 = null;
		aClass65_1071 = null;
		aClass65_1074 = null;
		aClass2_Sub22_14 = null;
		aClass56_34 = null;
		anIntArray333 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([BZ)Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 method1823(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class2_Sub1_Sub4_Sub3_Sub1 local18 = new Class2_Sub1_Sub4_Sub3_Sub1(arg0, Static88.anIntArray256, Static128.anIntArray359, Static45.anIntArray130, Static100.anIntArray294, Static110.anIntArray328, Static76.aByteArrayArray6);
			Static37.method655();
			return local18;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
	public static int method1826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray344.length > arg0) {
			return local10.anIntArray344[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!na;ZLclient!na;Lclient!ie;Lclient!na;)Z")
	public static boolean method1828(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class2_Sub2_Sub2 arg2, @OriginalArg(4) Class56 arg3) {
		Static16.aClass56_31 = arg0;
		Static101.aClass56_33 = arg1;
		Static132.aClass2_Sub2_Sub2_2 = arg2;
		Static121.aClass56_38 = arg3;
		return true;
	}
}
