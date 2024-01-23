import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!g;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString38 = "Loaded interfaces";

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!en;")
	public static Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public static int anInt892 = 0;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
	public static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class144 local7 = Static220.method3665(arg0);
		@Pc(10) int local10 = local7.anInt4650;
		@Pc(13) int local13 = local7.anInt4657;
		@Pc(16) int local16 = local7.anInt4655;
		@Pc(22) int local22 = Class146.anIntArray470[local13 - local16];
		if (arg1 < 0 || local22 < arg1) {
			arg1 = 0;
		}
		local22 <<= local16;
		Static101.method1744(local10, ~local22 & Static64.anIntArray134[local10] | local22 & arg1 << local16);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZIILclient!ek;)V")
	public static void method654(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class42 arg2) {
		Static95.aClass42_23 = arg2;
		Static9.anInt3025 = arg1;
		Static130.anInt2976 = 2;
		Static154.anInt3461 = 0;
		Static205.anInt4269 = arg0;
		Static88.aBoolean137 = false;
		Static73.anInt1821 = 1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIZ)V")
	public static void method655(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static38.anInt954 = 104;
		Static232.anInt4680 = 104;
		Static243.anInt4841 = arg0;
		Static86.aClass2_Sub13ArrayArrayArray2 = new Class2_Sub13[4][Static38.anInt954][Static232.anInt4680];
		Static300.anIntArrayArrayArray15 = new int[4][Static38.anInt954 + 1][Static232.anInt4680 + 1];
		if (Static116.aBoolean184) {
			Static296.aClass2_Sub32ArrayArray4 = new Class2_Sub32[4][];
		}
		if (arg1) {
			Static136.aClass2_Sub13ArrayArrayArray3 = new Class2_Sub13[1][Static38.anInt954][Static232.anInt4680];
			Static170.anIntArrayArray23 = new int[Static38.anInt954][Static232.anInt4680];
			Static85.anIntArrayArrayArray4 = new int[1][Static38.anInt954 + 1][Static232.anInt4680 + 1];
			if (Static116.aBoolean184) {
				Static89.aClass2_Sub32ArrayArray3 = new Class2_Sub32[1][];
			}
		} else {
			Static136.aClass2_Sub13ArrayArrayArray3 = null;
			Static170.anIntArrayArray23 = null;
			Static85.anIntArrayArrayArray4 = null;
			Static89.aClass2_Sub32ArrayArray3 = null;
		}
		Static211.method3515(false);
		Static254.aClass150Array2 = new Class150[500];
		Static166.anInt3672 = 0;
		Static71.aClass150Array1 = new Class150[500];
		Static236.anInt4758 = 0;
		Static308.anIntArrayArrayArray16 = new int[4][Static38.anInt954 + 1][Static232.anInt4680 + 1];
		Static315.aClass170Array3 = new Class170[5000];
		Static273.anInt5430 = 0;
		Static285.aClass170Array2 = new Class170[100];
		Static6.aBooleanArrayArray1 = new boolean[Static243.anInt4841 + Static243.anInt4841 + 1][Static243.anInt4841 + Static243.anInt4841 + 1];
		Static269.aBooleanArrayArray4 = new boolean[Static243.anInt4841 + Static243.anInt4841 + 2][Static243.anInt4841 + Static243.anInt4841 + 2];
		Static76.aByteArrayArrayArray5 = new byte[4][Static38.anInt954][Static232.anInt4680];
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method658(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(3, arg0);
		local8.method2052();
		local8.aString95 = arg1;
	}
}
