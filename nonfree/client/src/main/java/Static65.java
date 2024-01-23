import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Close";

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "J")
	public static long aLong58 = 0L;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class20 local7 = Static222.method3674(arg0);
		@Pc(10) int local10 = local7.anInt911;
		@Pc(13) int local13 = local7.anInt906;
		@Pc(16) int local16 = local7.anInt905;
		@Pc(22) int local22 = Class142.anIntArray460[local16 - local13];
		if (arg1 < 0 || arg1 > local22) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static171.method2962(local10, ~local22 & Static91.anIntArray189[local10] | local22 & arg1 << local13);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method1284(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static60.aString96 = arg1;
		Static86.anInt2433 = arg0;
		Static150.aString251 = arg2;
		if (Static60.aString96.equals("") || Static150.aString251.equals("")) {
			Static169.anInt3963 = 3;
		} else if (Static136.anInt3373 == -1) {
			Static81.anInt2186 = 1;
			Static169.anInt3963 = -3;
			Static92.anInt2554 = 0;
			Static83.anInt2241 = 0;
			@Pc(40) Class1_Sub13 local40 = new Class1_Sub13(128);
			local40.method1766(10);
			local40.method1754((int) (Math.random() * 9.9999999E7D));
			local40.method1770(Static93.method2008(Static60.aString96));
			local40.method1754((int) (Math.random() * 9.9999999E7D));
			local40.method1791(Static150.aString251);
			local40.method1754((int) (Math.random() * 9.9999999E7D));
			local40.method1804(Static101.aBigInteger1, Static208.aBigInteger2);
			Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
			Static171.aClass1_Sub13_Sub1_3.method1766(24);
			Static171.aClass1_Sub13_Sub1_3.method1766(local40.anInt2395 + 2);
			Static171.aClass1_Sub13_Sub1_3.method1789(535);
			Static171.aClass1_Sub13_Sub1_3.method1771(local40.aByteArray29, local40.anInt2395);
		} else {
			Static131.method691();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
	public static int method1286(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static131.method689(arg0);
	}
}
