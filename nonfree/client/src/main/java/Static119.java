import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!nh", name = "Cb", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!nh", name = "Db", descriptor = "[S")
	public static short[] aShortArray31;

	@OriginalMember(owner = "client!nh", name = "Gb", descriptor = "Lclient!fa;")
	public static Class1_Sub9 aClass1_Sub9_2;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!rb;")
	public static Class1_Sub21 aClass1_Sub21_1 = new Class1_Sub21(0, 0);

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1089 = Static49.method1293(" seconds)3");

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1090 = Static49.method1293("Loaded wordpack");

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1092 = aClass70_1089;

	@OriginalMember(owner = "client!nh", name = "mb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1093 = aClass70_1090;

	@OriginalMember(owner = "client!nh", name = "Ab", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1094 = Static49.method1293("wave:");

	@OriginalMember(owner = "client!nh", name = "Bb", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!nh", name = "Eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1095 = aClass70_1094;

	@OriginalMember(owner = "client!nh", name = "Fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1096 = aClass70_1094;

	@OriginalMember(owner = "client!nh", name = "Hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1097 = Static49.method1293("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!nh", name = "Ib", descriptor = "Lclient!ig;")
	public static Class39 aClass39_35 = null;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!rf;Lclient!rf;IILclient!rf;)V")
	public static void method2422(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class70 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static136.anIntArray337[local3] = Static136.anIntArray337[local3 - 1];
			Static18.aClass70Array5[local3] = Static18.aClass70Array5[local3 - 1];
			Static169.aClass70Array22[local3] = Static169.aClass70Array22[local3 - 1];
			Static102.aClass70Array15[local3] = Static102.aClass70Array15[local3 - 1];
		}
		Static126.anInt827 = Static58.anInt1875;
		Static18.aClass70Array5[0] = arg3;
		Static136.anIntArray337[0] = arg2;
		Static127.anInt3384++;
		Static169.aClass70Array22[0] = arg0;
		Static102.aClass70Array15[0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method2426() {
		aClass1_Sub21_1 = null;
		aClass70_1089 = null;
		aClass70_1093 = null;
		aShortArray31 = null;
		aClass70_1092 = null;
		aClass70_1095 = null;
		aClass1_Sub9_2 = null;
		aClass70_1096 = null;
		aClass39_35 = null;
		aClass70_1094 = null;
		aClass70_1090 = null;
		aClass70_1097 = null;
		anIntArray319 = null;
	}
}
