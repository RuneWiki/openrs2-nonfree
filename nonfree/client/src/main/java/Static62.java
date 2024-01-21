import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!ff;")
	public static Class11 aClass11_28;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_654 = Static2.method59("b12_full");

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_655 = Static2.method59("lila:");

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!wd;")
	private static Class80 aClass80_656 = Static2.method59("Please remove ");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	public static int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public static int anInt1798 = 0;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_657 = aClass80_656;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_658 = Static2.method59("M");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public static volatile int anInt1800 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_664 = Static2.method59("Loading sprites )2 ");

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_659 = aClass80_664;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_660 = Static2.method59("Connection timed out)3");

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_661 = aClass80_656;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_662 = Static2.method59("(Z");

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_663 = aClass80_660;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1066() {
		anIntArray224 = null;
		aClass80_655 = null;
		aClass80_664 = null;
		aClass80_656 = null;
		aClass80_657 = null;
		aClass80_659 = null;
		aClass80_660 = null;
		aClass80_663 = null;
		aClass80_661 = null;
		aClass80_654 = null;
		aClass80_662 = null;
		aClass80_658 = null;
		aClass11_28 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method1069() {
		for (@Pc(12) int local12 = -1; local12 < Static92.anInt2273; local12++) {
			@Pc(21) int local21;
			if (local12 == -1) {
				local21 = 2047;
			} else {
				local21 = Static53.anIntArray208[local12];
			}
			@Pc(29) Class2_Sub1_Sub1_Sub4_Sub2 local29 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local21];
			if (local29 != null) {
				Static13.method225(local29, 1);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IJ)V")
	public static void method1070(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static6.method105(arg0 - 1L);
			Static6.method105(1L);
		} else {
			Static6.method105(arg0);
		}
	}
}
