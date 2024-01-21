import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt1089;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static final int anInt1084 = 3353893;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!mb;")
	private static Class45 aClass45_505 = Static63.method1251("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_504 = aClass45_505;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!sa;")
	public static Class67 aClass67_10 = new Class67(30);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_506 = Static63.method1251("Handel akzeptieren");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "[I")
	public static int[] anIntArray177 = new int[50];

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt1088 = -1;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!s;")
	public static Class66 aClass66_6 = new Class66(512);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method796() {
		Static89.aClass67_20.method1819();
		Static71.aClass67_16.method1819();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!sd;Lclient!sd;)V")
	public static void method797(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1) {
		Static114.aClass29_79 = arg0;
		Static105.aClass29_66 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lclient!ia;")
	public static Class5_Sub2_Sub8 method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class5_Sub2_Sub8 local3 = Static80.method1507(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass5_Sub2_Sub8Array1 == null || arg1 >= local3.aClass5_Sub2_Sub8Array1.length) {
			return null;
		} else {
			return local3.aClass5_Sub2_Sub8Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public static void method799() {
		anIntArray177 = null;
		aClass45_506 = null;
		aClass66_6 = null;
		aClass67_10 = null;
		anIntArray176 = null;
		aClass45_504 = null;
		aClass45_505 = null;
	}
}
