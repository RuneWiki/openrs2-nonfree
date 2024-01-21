import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!de", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_444 = Static32.method683("mapedge");

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_445 = Static32.method683("VOLL");

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!lf;")
	private static Class49 aClass49_447 = Static32.method683("Error loading your profile)3");

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!lf;")
	public static Class49 aClass49_446 = aClass49_447;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public static int anInt858 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method689() {
		aBooleanArray4 = null;
		aClass49_447 = null;
		aClass49_446 = null;
		aClass49_444 = null;
		aClass49_445 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIIIJ)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub3 arg4, @OriginalArg(5) Class2_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class47 local6 = new Class47();
		local6.aLong89 = arg10;
		local6.anInt1947 = arg1 * 128 + 64;
		local6.anInt1937 = arg2 * 128 + 64;
		local6.anInt1936 = arg3;
		local6.aClass2_Sub2_Sub3_8 = arg4;
		local6.aClass2_Sub2_Sub3_9 = arg5;
		local6.anInt1941 = arg6;
		local6.anInt1942 = arg7;
		local6.anInt1943 = arg8;
		local6.anInt1944 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static72.aClass2_Sub1ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static72.aClass2_Sub1ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub1(local46, arg1, arg2);
			}
		}
		Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass47_1 = local6;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	public static void method691(@OriginalArg(0) int arg0) {
		if (Static95.anInt2009 == arg0) {
			return;
		}
		if (Static95.anInt2009 == 0) {
			Static81.method1396();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static42.anInt1028 = 0;
			Static30.anInt748 = 0;
			Static30.anInt742 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static41.aClass57_2 != null) {
			Static41.aClass57_2.method1892();
			Static41.aClass57_2 = null;
		}
		if (Static95.anInt2009 == 25) {
			Static88.anInt1863 = 1;
			Static125.anInt2749 = 0;
			Static45.anInt1054 = 0;
			Static152.anInt3279 = 0;
			Static122.anInt2560 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static53.method932(Static67.aClass11_Sub1_22, Static35.aClass11_Sub1_7, Static5.aCanvas1);
		} else {
			Static17.method2067();
		}
		Static95.anInt2009 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([Lclient!lf;I)Lclient!lf;")
	public static Class49 method692(@OriginalArg(0) Class49[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static27.method482(arg0.length, arg0, 0);
	}
}
