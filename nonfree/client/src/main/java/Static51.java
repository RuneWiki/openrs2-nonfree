import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_3;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[S")
	public static short[] aShortArray6 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!nd;")
	public static Class59 aClass59_4 = new Class59();

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_452 = Static65.method1172("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_453 = Static65.method1172("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public static int anInt1389 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)Z")
	public static boolean method1000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(29) Class3_Sub2_Sub9 local29 = Static136.method2319(arg0);
		return local29.method1201(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method1001(@OriginalArg(1) Class44 arg0) {
		Static149.aClass44_29 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method1003() {
		for (@Pc(5) int local5 = 0; local5 < Static108.anInt2585; local5++) {
			@Pc(13) int local13 = Static14.anIntArray25[local5];
			@Pc(17) Class3_Sub2_Sub1_Sub1_Sub1 local17 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local13];
			@Pc(21) int local21 = Static49.aClass3_Sub4_Sub1_2.method191();
			if ((local21 & 0x2) != 0) {
				local21 += Static49.aClass3_Sub4_Sub1_2.method191() << 8;
			}
			Static94.method1562(local13, local17, local21);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	public static void method1005() {
		aClass73_1 = null;
		aLongArray1 = null;
		aClass59_4 = null;
		aClass46_453 = null;
		aClass46_452 = null;
		aShortArray6 = null;
		aClass44_Sub1_3 = null;
	}
}
