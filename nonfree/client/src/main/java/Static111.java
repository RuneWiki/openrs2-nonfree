import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!vg;")
	public static Class85 aClass85_10;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1073 = Static32.method683("Sorry invited players only)3");

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1069 = aClass49_1073;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
	public static int[] anIntArray223 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1070 = Static32.method683("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
	public static int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1071 = aClass49_1070;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1072 = Static32.method683("welle:");

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1074 = Static32.method683("blinken3:");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!vg;I)I")
	public static int method1895(@OriginalArg(0) Class85 arg0) {
		@Pc(13) Class2_Sub21 local13 = (Class2_Sub21) Static171.aClass25_14.method836((long) arg0.anInt3866 + ((long) arg0.anInt3849 << 32));
		return local13 == null ? arg0.anInt3869 : local13.anInt2187;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1896() {
		aClass49_1072 = null;
		aClass49_1071 = null;
		anIntArray224 = null;
		aClass49_1069 = null;
		aClass49_1073 = null;
		aClass49_1074 = null;
		anIntArray222 = null;
		aClass49_1070 = null;
		aClass85_10 = null;
		anIntArray223 = null;
	}
}
