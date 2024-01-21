import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
	public static int anInt1864;

	@OriginalMember(owner = "client!gg", name = "jb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_638 = Static161.method2971("Loaded title screen");

	@OriginalMember(owner = "client!gg", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_634 = aClass13_638;

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
	public static int anInt1871 = 0;

	@OriginalMember(owner = "client!gg", name = "kb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_639 = Static161.method2971("Connecting to update server");

	@OriginalMember(owner = "client!gg", name = "bb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_635 = aClass13_639;

	@OriginalMember(owner = "client!gg", name = "eb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_637 = Static161.method2971("Loaded update list");

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_636 = aClass13_637;

	@OriginalMember(owner = "client!gg", name = "gb", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array16 = new Class13[200];

	@OriginalMember(owner = "client!gg", name = "tb", descriptor = "[I")
	public static int[] anIntArray191 = new int[32];

	@OriginalMember(owner = "client!gg", name = "vb", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!gg", name = "wb", descriptor = "J")
	public static volatile long aLong62 = 0L;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)I")
	public static int method1400(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
	public static int method1401() {
		return Static14.anInt489++;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)V")
	public static void method1402(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static124.anInt3220 >= 100) {
			Static169.method2887(Static16.aClass13_253, Static154.aClass13_1256, 0);
			return;
		}
		@Pc(36) Class13 local36 = Static43.method1141(arg0).method903();
		for (@Pc(38) int local38 = 0; local38 < Static124.anInt3220; local38++) {
			if (Static5.aLongArray1[local38] == arg0) {
				Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { local36, Static108.aClass13_976 }), 0);
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static21.anInt784; local73++) {
			if (Static149.aLongArray8[local73] == arg0) {
				Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { Static14.aClass13_208, local36, Static115.aClass13_1030 }), 0);
				return;
			}
		}
		if (local36.method889(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847)) {
			Static169.method2887(Static16.aClass13_253, Static24.aClass13_301, 0);
			return;
		}
		Static5.aLongArray1[Static124.anInt3220] = arg0;
		Static52.aClass13Array13[Static124.anInt3220++] = Static43.method1141(arg0);
		Static88.anInt2490 = Static10.anInt388;
		Static1.aClass1_Sub8_Sub1_1.method1654(241);
		Static1.aClass1_Sub8_Sub1_1.method1625(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V")
	public static void method1403() {
		@Pc(1) Class42 local1 = Static140.aClass42_1;
		synchronized (Static140.aClass42_1) {
			Static148.anInt3596 = Static184.anInt4079;
			Static14.anInt481 = Static120.anInt3148;
			Static86.anInt2447 = Static57.anInt1802;
			Static109.anInt2976 = Static112.anInt3057;
			Static122.anInt3191 = Static32.anInt4089;
			Static8.anInt293 = Static87.anInt2471;
			Static75.aLong70 = Static68.aLong64;
			Static112.anInt3057 = 0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
	public static void method1404() {
		anIntArray191 = null;
		aClass13_634 = null;
		aClass13_638 = null;
		aClass13_637 = null;
		aClass13_636 = null;
		aClass13_635 = null;
		aClass13Array16 = null;
		aClass13_639 = null;
	}
}
