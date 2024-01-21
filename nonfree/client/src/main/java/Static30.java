import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fd", name = "sb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_9;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "Lclient!wc;")
	public static Class4 aClass4_22;

	@OriginalMember(owner = "client!fd", name = "zb", descriptor = "Lclient!sa;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!fd", name = "Hb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_10;

	@OriginalMember(owner = "client!fd", name = "vb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1157 = Static94.method1596("Login");

	@OriginalMember(owner = "client!fd", name = "ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_1156 = aClass1_1157;

	@OriginalMember(owner = "client!fd", name = "xb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1158 = Static94.method1596("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!fd", name = "Kb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1160 = Static94.method1596("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!fd", name = "Ab", descriptor = "Lclient!a;")
	public static Class1 aClass1_1159 = aClass1_1160;

	@OriginalMember(owner = "client!fd", name = "Cb", descriptor = "I")
	public static int anInt1128 = 0;

	@OriginalMember(owner = "client!fd", name = "Eb", descriptor = "[I")
	public static int[] anIntArray120 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fd", name = "Jb", descriptor = "I")
	public static int anInt1133 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIB)I")
	public static int method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg1;
			arg1 = local14;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 + 1 - arg3 - arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg1 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	public static void method775() {
		aClass1_1156 = null;
		aClass8_10 = null;
		aClass4_22 = null;
		aClass8_9 = null;
		aClass1_1159 = null;
		anIntArray120 = null;
		aClass57_1 = null;
		aClass1_1158 = null;
		aClass1_1160 = null;
		aClass1_1157 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI[BI)V")
	public static void method776(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (Static8.aClass14_1 == null) {
			return;
		}
		if (Static103.anInt2605 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static53.anInt1751 = arg2;
			if (Static103.anInt2605 == 0) {
				Static7.anInt1200 = 0;
			} else {
				@Pc(36) int local36 = Static56.method1238(Static103.anInt2605);
				@Pc(40) int local40 = local36 - Static68.anInt1945;
				Static7.anInt1200 = (arg2 + local40 + 3600 - 1) / arg2;
			}
			Static2.aByteArray2 = arg3;
			Static31.anInt1223 = arg0;
			Static57.aBoolean98 = arg1;
		} else if (Static53.anInt1751 == 0) {
			Static1.method7(arg1, arg3, arg0);
		} else {
			Static31.anInt1223 = arg0;
			Static57.aBoolean98 = arg1;
			Static2.aByteArray2 = arg3;
		}
	}
}
