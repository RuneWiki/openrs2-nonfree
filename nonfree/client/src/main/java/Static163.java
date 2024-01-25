import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Lclient!s;")
	public static Class217 aClass217_73;

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "Lclient!s;")
	public static final Class217 aClass217_74 = new Class217(111, 6);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIILclient!ph;ZI)V")
	public static void method2712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class187 arg2) {
		Static285.aClass187_87 = arg2;
		Static124.anInt2565 = 10000;
		Static300.aBoolean350 = false;
		Static212.anInt4104 = arg1;
		Static152.anInt3124 = 1;
		Static345.anInt5874 = arg0;
		Static398.anInt6739 = 0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)V")
	public static void method2718(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static189.anInt3826 != -1) {
				Static176.method2939(Static189.anInt3826);
			}
			for (@Pc(15) Class10_Sub21 local15 = (Class10_Sub21) Static114.aClass167_12.method3702(); local15 != null; local15 = (Class10_Sub21) Static114.aClass167_12.method3708()) {
				if (!local15.method6034()) {
					local15 = (Class10_Sub21) Static114.aClass167_12.method3702();
					if (local15 == null) {
						break;
					}
				}
				Static153.method2607(false, local15, true);
			}
			Static189.anInt3826 = -1;
			Static114.aClass167_12 = new Class167(8);
			Static153.method2611();
			Static189.anInt3826 = Static336.anInt5674;
			Static241.method3528(false);
			Static448.method5473();
			Static79.method1503(Static189.anInt3826);
		}
		Static258.aBoolean308 = false;
		Static33.aString67 = "";
		Static2.aString1 = "";
		Static115.method2032();
		Static40.anInt656 = -1;
		Static45.method5779(Static78.anInt1647);
		Static263.aClass24_Sub3_Sub2_Sub2_4 = new Class24_Sub3_Sub2_Sub2();
		Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 = Static2.anInt7 * 128 / 2;
		Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 = Static17.anInt315 * 128 / 2;
		Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] = Static2.anInt7 / 2;
		Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0] = Static17.anInt315 / 2;
		Static50.anInt906 = 0;
		Static80.anInt1679 = 0;
		if (Static157.anInt3176 == 2) {
			Static80.anInt1679 = Static125.anInt2573 << 7;
			Static50.anInt906 = Static200.anInt3979 << 7;
		} else {
			Static59.method1021();
		}
		Static343.method4653();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZI)Z")
	public static boolean method2719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static107.method1886(arg0, arg1) | (arg0 & 0x60000) != 0 || Static445.method5935(arg0, arg1) || Static457.method6053(arg0, arg1);
	}
}
