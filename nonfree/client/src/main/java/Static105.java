import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_678 = Static186.method3527("::fpson");

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public static int anInt2096 = 0;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_679 = Static186.method3527("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "[I")
	public static int[] anIntArray199 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public static void method1611() {
		Static18.aClass84_10.method2577(5);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1612() {
		Static97.aClass1_Sub17_Sub1_2.method2189();
		@Pc(13) int local13 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
		if (local13 == 0) {
			return;
		}
		@Pc(32) int local32 = Static97.aClass1_Sub17_Sub1_2.method2181(2);
		if (local32 == 0) {
			Static164.anIntArray360[Static80.anInt1584++] = 2047;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		if (local32 == 1) {
			local54 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
			Static230.aClass20_Sub3_Sub1_3.method2472(false, local54);
			local64 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			if (local64 == 1) {
				Static164.anIntArray360[Static80.anInt1584++] = 2047;
			}
			return;
		}
		@Pc(104) int local104;
		if (local32 == 2) {
			local54 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
			Static230.aClass20_Sub3_Sub1_3.method2472(true, local54);
			local64 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
			Static230.aClass20_Sub3_Sub1_3.method2472(true, local64);
			local104 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			if (local104 == 1) {
				Static164.anIntArray360[Static80.anInt1584++] = 2047;
			}
		} else if (local32 == 3) {
			local54 = Static97.aClass1_Sub17_Sub1_2.method2181(7);
			local64 = Static97.aClass1_Sub17_Sub1_2.method2181(7);
			local104 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			if (local104 == 1) {
				Static164.anIntArray360[Static80.anInt1584++] = 2047;
			}
			@Pc(156) int local156 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			Static212.anInt4195 = Static97.aClass1_Sub17_Sub1_2.method2181(2);
			Static230.aClass20_Sub3_Sub1_3.method2470(local54, local64, local156 == 1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)I")
	public static int method1614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public static void method1615(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub14 local6 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg0);
		if (local6 != null) {
			local6.method3525();
		}
	}
}
