import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_65;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1267 = Static75.method1216("welle:");

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1270 = Static75.method1216("Please wait)3)3)3");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1268 = aClass4_1270;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public static int anInt2250 = -1;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1269 = Static75.method1216("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean187 = false;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	public static int[] anIntArray285 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1271 = Static75.method1216("mapback");

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1272 = Static75.method1216("blinken3:");

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1273 = Static75.method1216("Benutzen");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!ad;Lclient!ad;Lclient!rd;)Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 method1517(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class64 arg2) {
		@Pc(13) int local13 = arg2.method1638(arg0);
		@Pc(19) int local19 = arg2.method1626(local13, arg1);
		return Static31.method623(local19, local13, arg2);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ad;Lclient!ad;Lclient!rd;B)[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] method1518(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class64 arg2) {
		@Pc(13) int local13 = arg2.method1638(arg0);
		@Pc(19) int local19 = arg2.method1626(local13, arg1);
		return Static31.method629(arg2, local19, local13);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method1519() {
		Static61.aClass7_1.method1657();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static38.aLongArray35[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static82.aLongArray22[local26] = 0L;
		}
		Static61.anInt1514 = 0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public static void method1520(@OriginalArg(0) int arg0) {
		Static25.anInt761 += arg0;
		while (Static25.anInt761 >= Static89.anInt2053) {
			Static25.anInt761 -= Static89.anInt2053;
			Static89.anInt2050 -= Static89.anInt2050 >> 2;
		}
		Static89.anInt2050 -= arg0 * 1000;
		if (Static89.anInt2050 < 0) {
			Static89.anInt2050 = 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
	public static void method1521() {
		aClass4_1271 = null;
		aClass64_65 = null;
		aClass4_1272 = null;
		aClass4_1269 = null;
		anIntArray285 = null;
		aClass4_1267 = null;
		aClass4_1268 = null;
		aFrame3 = null;
		aClass4_1270 = null;
		aClass4_1273 = null;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I")
	public static int method1524(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static28.anIntArray81[arg0];
		@Pc(11) int local11 = (local3 * Static7.anInt281 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}
}
