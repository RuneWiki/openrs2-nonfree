import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!na", name = "Cb", descriptor = "Lclient!je;")
	public static Class44 aClass44_5;

	@OriginalMember(owner = "client!na", name = "lc", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!na", name = "ec", descriptor = "Lclient!ah;")
	public static Class1_Sub3 aClass1_Sub3_3 = new Class1_Sub3(0, 0);

	@OriginalMember(owner = "client!na", name = "jc", descriptor = "Lclient!ed;")
	private static Class23 aClass23_677 = Static169.method2903("Unable to find ");

	@OriginalMember(owner = "client!na", name = "sc", descriptor = "Lclient!ed;")
	private static Class23 aClass23_680 = Static169.method2903("Drop");

	@OriginalMember(owner = "client!na", name = "oc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_678 = aClass23_680;

	@OriginalMember(owner = "client!na", name = "qc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_679 = Static169.method2903("titlebutton");

	@OriginalMember(owner = "client!na", name = "rc", descriptor = "I")
	public static int anInt1866 = 0;

	@OriginalMember(owner = "client!na", name = "tc", descriptor = "[I")
	public static int[] anIntArray251 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!na", name = "uc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_681 = aClass23_677;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(I)V")
	public static void method1218() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static79.anInt2155];
		for (@Pc(12) int local12 = 0; local12 < Static79.anInt2155; local12++) {
			@Pc(18) Class1_Sub1_Sub7 local18 = Static2.method118(local12);
			if (local18.anInt1144 >= 0 || local18.anInt1130 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static40.anIntArray130 = new int[local7];
		for (@Pc(41) int local41 = 0; local41 < local7; local41++) {
			Static40.anIntArray130[local41] = local10[local41];
		}
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(I)V")
	public static void method1220() {
		anIntArray251 = null;
		aClass23_680 = null;
		aClass1_Sub3_3 = null;
		aClass23_679 = null;
		aClass44_5 = null;
		aClass23_678 = null;
		aClass23_677 = null;
		aClass23_681 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	public static int method1225(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub6 local11 = Static87.method576(arg0);
		@Pc(14) int local14 = local11.anInt883;
		@Pc(17) int local17 = local11.anInt882;
		@Pc(20) int local20 = local11.anInt887;
		@Pc(27) int local27 = Class1_Sub22.anIntArray520[local17 - local14];
		return Static27.anIntArray108[local20] >> local14 & local27;
	}
}
