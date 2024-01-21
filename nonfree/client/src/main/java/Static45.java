import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_8;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!pa;")
	public static Class51 aClass51_26;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array3;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt1237 = 0;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[Lclient!tc;")
	public static Class2_Sub1_Sub2_Sub3_Sub1[] aClass2_Sub1_Sub2_Sub3_Sub1Array1 = new Class2_Sub1_Sub2_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
	public static int[] anIntArray177 = new int[200];

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt1239 = 2;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!qe;")
	public static Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public static volatile int anInt1240 = -1;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_560 = Static2.method66("Freunde");

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Lclient!ke;")
	private static Class39 aClass39_566 = Static2.method66("This computers address has been blocked");

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_561 = aClass39_566;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_562 = Static2.method66("Neuer Benutzer");

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_563 = Static2.method66("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!ke;")
	private static Class39 aClass39_565 = Static2.method66("Take");

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_564 = aClass39_565;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method864() {
		aClass2_Sub1_Sub4_Sub3Array3 = null;
		aClass39_565 = null;
		aClass39_561 = null;
		aClass55_1 = null;
		aClass2_Sub1_Sub4_Sub3_8 = null;
		aClass2_Sub1_Sub2_Sub3_Sub1Array1 = null;
		aClass39_562 = null;
		aClass39_566 = null;
		aClass51_26 = null;
		anIntArray176 = null;
		aClass39_563 = null;
		anIntArray177 = null;
		aClass39_564 = null;
		aClass39_560 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II[Lclient!ke;I)Lclient!ke;")
	public static Class39 method865(@OriginalArg(0) int arg0, @OriginalArg(2) Class39[] arg1) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg1[local7] == null) {
				arg1[local7] = Static62.aClass39_790;
			}
			local5 += arg1[local7].anInt1601;
		}
		@Pc(42) byte[] local42 = new byte[local5];
		@Pc(44) int local44 = 0;
		@Pc(54) Class39 local54;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			local54 = arg1[local46];
			Static114.method1154(local54.aByteArray13, 0, local42, local44, local54.anInt1601);
			local44 += local54.anInt1601;
		}
		local54 = new Class39();
		local54.aByteArray13 = local42;
		local54.anInt1601 = local5;
		return local54;
	}
}
