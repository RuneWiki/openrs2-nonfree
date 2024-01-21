import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!r;")
	private static Class61 aClass61_454 = Static129.method2060("Loading interfaces )2 ");

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_448 = aClass61_454;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_449 = Static129.method2060("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public static int[] anIntArray210 = new int[4000];

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!r;")
	private static Class61 aClass61_450 = Static129.method2060("Unable to find ");

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public static int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_451 = Static129.method2060("(Z");

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!r;")
	private static Class61 aClass61_452 = Static129.method2060("Loading title screen )2 ");

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean50 = true;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_453 = aClass61_452;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "Lclient!r;")
	public static Class61 aClass61_455 = aClass61_450;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method1010() {
		anIntArray210 = null;
		aClass61_452 = null;
		aClass61_451 = null;
		aClass61_453 = null;
		aClass61_454 = null;
		aClass61_455 = null;
		aClass61_450 = null;
		anIntArray212 = null;
		aClass61_448 = null;
		aClass61_449 = null;
		anIntArray211 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[B)I")
	public static int method1011(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static118.method1894(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBILclient!ff;Lclient!ff;)Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 method1013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		return Static8.method174(arg0, arg2, arg1) ? Static27.method1861(arg3.method1038(arg0, arg1)) : null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1014() {
		Static82.aClass29_20.method765();
		Static101.aClass29_23.method765();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static124.anInt3091 = -1;
			Static42.anInt1103 = -1;
			return;
		}
		@Pc(31) int local31 = Static42.method757(Static93.anInt2428, arg0, arg1) - arg2;
		@Pc(35) int local35 = arg0 - Static22.anInt683;
		@Pc(39) int local39 = local31 - Static78.anInt1986;
		@Pc(43) int local43 = arg1 - Static40.anInt1074;
		@Pc(52) int local52 = Class5_Sub2_Sub1_Sub2.anIntArray198[Static78.anInt1985];
		@Pc(56) int local56 = Class5_Sub2_Sub1_Sub2.anIntArray197[Static78.anInt1985];
		@Pc(60) int local60 = Class5_Sub2_Sub1_Sub2.anIntArray198[Static1.anInt15];
		@Pc(64) int local64 = Class5_Sub2_Sub1_Sub2.anIntArray197[Static1.anInt15];
		@Pc(74) int local74 = local43 * local60 + local64 * local35 >> 16;
		@Pc(85) int local85 = local43 * local64 - local60 * local35 >> 16;
		@Pc(87) int local87 = local74;
		@Pc(98) int local98 = local56 * local39 - local85 * local52 >> 16;
		@Pc(108) int local108 = local85 * local56 + local39 * local52 >> 16;
		if (local108 < 50) {
			Static124.anInt3091 = -1;
			Static42.anInt1103 = -1;
		} else {
			Static124.anInt3091 = (local87 << 9) / local108 + 256;
			Static42.anInt1103 = (local98 << 9) / local108 + 167;
		}
	}
}
