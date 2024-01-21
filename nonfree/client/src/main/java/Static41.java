import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ha", name = "Bc", descriptor = "I")
	public static int anInt1012;

	@OriginalMember(owner = "client!ha", name = "Ec", descriptor = "Lclient!na;")
	public static Class56 aClass56_18;

	@OriginalMember(owner = "client!ha", name = "Kc", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_14;

	@OriginalMember(owner = "client!ha", name = "Uc", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!ha", name = "Dc", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!ha", name = "Gc", descriptor = "I")
	public static int anInt1014 = 0;

	@OriginalMember(owner = "client!ha", name = "Yc", descriptor = "Lclient!pe;")
	private static Class65 aClass65_456 = Static119.method1462("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ha", name = "Mc", descriptor = "Lclient!pe;")
	public static Class65 aClass65_455 = aClass65_456;

	@OriginalMember(owner = "client!ha", name = "Oc", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array21 = new Class65[8];

	@OriginalMember(owner = "client!ha", name = "Tc", descriptor = "[I")
	public static int[] anIntArray117 = new int[100];

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public static void method727() {
		for (@Pc(6) Class2_Sub14 local6 = (Class2_Sub14) Static12.aClass13_5.method270(); local6 != null; local6 = (Class2_Sub14) Static12.aClass13_5.method273()) {
			if (local6.aClass2_Sub1_Sub15_1 != null) {
				local6.method1722();
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
	public static void method728() {
		aByteArray17 = null;
		aClass65Array21 = null;
		anIntArray117 = null;
		aClass65_456 = null;
		anIntArray118 = null;
		aClass56_Sub1_14 = null;
		aClass56_18 = null;
		aClass65_455 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!na;Lclient!pe;Lclient!pe;I)[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] method729(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(13) int local13 = arg0.method1690(arg1);
		@Pc(19) int local19 = arg0.method1667(arg2, local13);
		return Static101.method1656(arg0, local13, local19);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!gd;")
	public static RuntimeException_Sub1 method730(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString4 = local8.aString4 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}
}
