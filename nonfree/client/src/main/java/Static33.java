import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_8;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!of;")
	public static Class58 aClass58_3 = new Class58();

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!wd;")
	public static Class80 aClass80_379 = Static2.method59("Titelbild geladen)3");

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!wd;")
	public static Class80 aClass80_380 = Static2.method59("title_mute");

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_381 = Static2.method59(":  ");

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lclient!wc;")
	public static Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_383 = Static2.method59("Loaded gamescreen");

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_382 = aClass80_383;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "[I")
	public static int[] anIntArray130 = new int[5];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Lclient!wd;)[Lclient!wd;")
	public static Class80[] method603(@OriginalArg(1) Class80[] arg0) {
		@Pc(8) Class80[] local8 = new Class80[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static93.method1444(new Class80[] { Static28.method1422(local10), Static63.aClass80_665 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static93.method1444(new Class80[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && Static111.anInt3001 == arg0) {
			return true;
		} else if (arg1 == 1 && arg0 == Static121.anInt3093) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static94.anInt2415;
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method606() {
		aClass58_3 = null;
		aClass79_1 = null;
		aClass11_Sub1_8 = null;
		anIntArray130 = null;
		aClass80_383 = null;
		aClass80_382 = null;
		aClass80_380 = null;
		aClass80_379 = null;
		aClass80_381 = null;
	}
}
