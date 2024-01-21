import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public static int anInt874;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!lf;")
	public static Class48 aClass48_19 = new Class48(64);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_457 = Static56.method816(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_458 = Static56.method816(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!ic;")
	private static Class34 aClass34_463 = Static56.method816("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_459 = aClass34_463;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!ic;")
	private static Class34 aClass34_460 = Static56.method816("Error connecting to server)3");

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_461 = aClass34_460;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_462 = Static56.method816("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public static int anInt871 = 0;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public static int anInt872 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!wd;Lclient!ic;I)I")
	public static int method536(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(8) int local8 = arg0.anInt2853;
		arg0.method1842(arg1.anInt1418);
		arg0.anInt2853 += Static126.aClass21_3.method556(arg1.anInt1418, arg0.aByteArray44, arg0.anInt2853, arg1.aByteArray20, 0);
		return arg0.anInt2853 - local8;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method537(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static60.aBoolean63) {
			Static92.method1327();
		} else if (arg0 != -1 && arg0 != Static74.anInt1780 && Static47.anInt1277 != 0 && !Static60.aBoolean63) {
			Static116.method1637(arg0, Static67.aClass14_Sub1_9, Static47.anInt1277, 0);
		}
		Static74.anInt1780 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method538() {
		aClass34_461 = null;
		aClass34_459 = null;
		aClass34_460 = null;
		aClass34_462 = null;
		aClass34_458 = null;
		anIntArray110 = null;
		aClass34_457 = null;
		aClass48_19 = null;
		aByteArrayArray21 = null;
		aClass34_463 = null;
	}
}
