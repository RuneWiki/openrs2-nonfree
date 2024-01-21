import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!qe;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_26;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array10 = new Class2_Sub1_Sub4_Sub1[1000];

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!pe;")
	private static Class65 aClass65_994 = Static119.method1462(" seconds)3");

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_990 = aClass65_994;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_991 = Static119.method1462("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!pe;")
	private static Class65 aClass65_992 = Static119.method1462("Cancel");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_993 = Static119.method1462("<)4col> x");

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	public static int anInt2363 = 0;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	public static int anInt2364 = -1;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
	public static int[] anIntArray310 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_995 = aClass65_992;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!pe;")
	public static Class65 method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static36.aClass65_380;
		} else if (local4 < -6) {
			return Static11.aClass65_568;
		} else if (local4 < -3) {
			return Static122.aClass65_1142;
		} else if (local4 < 0) {
			return Static130.aClass65_1229;
		} else if (local4 > 9) {
			return Static62.aClass65_658;
		} else if (local4 > 6) {
			return Static81.aClass65_763;
		} else if (local4 > 3) {
			return Static93.aClass65_881;
		} else if (local4 > 0) {
			return Static70.aClass65_697;
		} else {
			return Static7.aClass65_93;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public static void method1707(@OriginalArg(1) int arg0) {
		if (Static44.anInt1080 == 0) {
			Static132.aClass2_Sub2_Sub2_2.method802(arg0);
		} else {
			Static39.anInt839 = arg0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!c;")
	public static Class10 method1708() {
		try {
			return (Class10) Class.forName("Class10_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class10_Sub1();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1709() {
		aClass65_991 = null;
		aClass2_Sub1_Sub4_Sub1Array10 = null;
		aClass65_994 = null;
		anIntArray310 = null;
		aClass65_992 = null;
		aClass65_993 = null;
		aClass69_1 = null;
		aClass65_995 = null;
		aClass56_Sub1_26 = null;
		aClass65_990 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ad;I)V")
	public static void method1710(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.aBoolean100 = false;
		if (arg0.aClass2_Sub5_5 != null) {
			arg0.aClass2_Sub5_5.anInt1042 = 0;
		}
		for (@Pc(23) Class2_Sub2 local23 = arg0.method1769(); local23 != null; local23 = arg0.method1766()) {
			method1710(local23);
		}
	}
}
