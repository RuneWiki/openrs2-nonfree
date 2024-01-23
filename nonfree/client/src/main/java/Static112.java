import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	public static int anInt2084;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	public static int method1748() {
		return Static266.aBoolean410 && Static246.aBooleanArray15[81] && Static29.anInt626 > 2 ? Static64.anIntArray148[Static29.anInt626 - 2] : Static64.anIntArray148[Static29.anInt626 - 1];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	public static void method1749(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(2, arg0);
		local4.method1853();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!qm;I)V")
	public static void method1750(@OriginalArg(0) Class6_Sub6_Sub2 arg0) {
		@Pc(18) Class1_Sub6 local18 = (Class1_Sub6) Static94.aClass22_10.method633(Static136.method2158(arg0.aString147));
		if (local18 == null) {
			return;
		}
		if (local18.aClass1_Sub8_Sub1_1 != null) {
			Static28.aClass1_Sub8_Sub3_1.method2409(local18.aClass1_Sub8_Sub1_1);
			local18.aClass1_Sub8_Sub1_1 = null;
		}
		local18.method4534();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BB)[B")
	public static byte[] method1751(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) byte[] local11 = new byte[local8];
		Static300.method484(arg0, 0, local11, 0, local8);
		return local11;
	}
}
