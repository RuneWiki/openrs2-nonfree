import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!va;")
	public static Class2_Sub1_Sub17 aClass2_Sub1_Sub17_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_36 = Static2.method59("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
	public static boolean aBoolean12 = true;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!wd;")
	private static Class80 aClass80_37 = Static2.method59("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_38 = Static2.method59("@whi@");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_41 = Static2.method59("wave:");

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_39 = aClass80_41;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_40 = aClass80_41;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt123 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_42 = aClass80_37;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public static int anInt125 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method64() {
		aClass80_36 = null;
		aClass80_42 = null;
		aClass80_37 = null;
		aLongArray1 = null;
		aClass2_Sub1_Sub17_1 = null;
		aClass80_41 = null;
		aClass80_39 = null;
		aClass80_38 = null;
		aClass80_40 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!wd;Lclient!wd;)V")
	public static void method65(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		if (arg0 == 0 && Static28.anInt2316 != -1) {
			Static20.anInt906 = 0;
			Static95.aClass80_947 = arg1;
		}
		if (Static57.anInt1737 == -1) {
			Static37.aBoolean77 = true;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static110.anIntArray378[local26] = Static110.anIntArray378[local26 - 1];
			Static25.aClass80Array6[local26] = Static25.aClass80Array6[local26 - 1];
			Static36.aClass80Array8[local26] = Static36.aClass80Array8[local26 - 1];
		}
		Static25.aClass80Array6[0] = arg2;
		Static36.aClass80Array8[0] = arg1;
		Static110.anIntArray378[0] = arg0;
	}
}
