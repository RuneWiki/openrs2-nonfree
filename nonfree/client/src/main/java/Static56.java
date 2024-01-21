import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt1471;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt1466 = -1;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
	public static int[] anIntArray145 = new int[128];

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array5 = new Class40[100];

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public static int anInt1479 = 0;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_7 = null;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!je;")
	public static Class40 aClass40_731 = Static69.method1231("Fps:");

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_732 = Static69.method1231("null");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method994() {
		Static88.aClass3_14 = new Class3();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method998() {
		Static42.aBoolean78 = false;
		Static34.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!je;Lclient!je;ILclient!je;)V")
	public static void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(4) Class40 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static10.anIntArray352[local3] = Static10.anIntArray352[local3 - 1];
			Static31.aClass40Array2[local3] = Static31.aClass40Array2[local3 - 1];
			Static127.aClass40Array24[local3] = Static127.aClass40Array24[local3 - 1];
			Static120.aClass40Array21[local3] = Static120.aClass40Array21[local3 - 1];
		}
		anInt1475++;
		Static97.anInt2440 = Static70.anInt1886;
		Static10.anIntArray352[0] = arg0;
		Static31.aClass40Array2[0] = arg2;
		Static127.aClass40Array24[0] = arg3;
		Static120.aClass40Array21[0] = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method1002() {
		anIntArray145 = null;
		aClass40Array5 = null;
		aClass2_Sub13_7 = null;
		anIntArray148 = null;
		aClass40_732 = null;
		aClass40_731 = null;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)I")
	public static int method1004() {
		@Pc(9) int local9 = Static93.method1730(Static83.anInt2155, Static105.anInt2531, Static127.anInt2944);
		return local9 - Static2.anInt101 >= 800 || (Static66.aByteArrayArrayArray10[Static105.anInt2531][Static83.anInt2155 >> 7][Static127.anInt2944 >> 7] & 0x4) == 0 ? 3 : Static105.anInt2531;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!je;Lclient!je;Lclient!je;B)V")
	public static void method1005(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		Static87.aClass40_660 = arg1;
		Static87.aClass40_668 = arg2;
		Static87.aClass40_662 = arg0;
	}
}
