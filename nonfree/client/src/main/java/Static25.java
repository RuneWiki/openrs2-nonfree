import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_137;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static int[] anIntArray493;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt4763;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!ej;")
	public static Class31 aClass31_7;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt4767;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
	public static int[] anIntArray495 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!nb;ILclient!nb;ZZ)V")
	public static void method3299(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static117.aBoolean153 = arg3;
		Static18.aBoolean23 = arg2;
		Static176.aClass15_36 = arg0;
		Static157.aClass15_33 = arg1;
		Static70.aClass16_3 = new Class16(30);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method3300() {
		Static145.method2250();
		Static1.method2637();
		Static220.method3330();
		Static67.method1233();
		Static3.method54();
		Static53.method1052();
		Static14.method298();
		Static138.method2200();
		Static63.method1160();
		Static180.method2870();
		Static173.method2809();
		Static132.method2095();
		((Class36) Static155.anInterface1_1).method1140();
		Static30.aClass43_6.method1469();
		Static60.aClass15_Sub1_138.method389();
		Static198.aClass15_Sub1_122.method389();
		Static78.aClass15_Sub1_49.method389();
		Static11.aClass15_Sub1_12.method389();
		aClass15_Sub1_137.method389();
		Static86.aClass15_Sub1_57.method389();
		Static207.aClass15_Sub1_130.method389();
		Static200.aClass15_Sub1_125.method389();
		Static8.aClass15_Sub1_10.method389();
		Static118.aClass15_Sub1_75.method389();
		Static17.aClass15_Sub1_15.method389();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public static void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass103_1 = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([IB)[I")
	public static int[] method3302(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) int[] local16 = new int[arg0.length];
			Static225.method1841(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Lclient!lj;")
	public static Class60 method3303() {
		@Pc(25) Class60_Sub1 local25 = new Class60_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[0], Static120.anIntArray310[0], Static89.anIntArray224[0], Static60.anIntArray498[0], Static102.aByteArrayArray6[0], anIntArray494);
		Static212.method3255();
		return local25;
	}
}
