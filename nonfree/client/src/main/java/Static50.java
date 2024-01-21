import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	public static int anInt1168;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public static int anInt1147 = 0;

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_662 = Static122.method531("Loaded textures");

	@OriginalMember(owner = "client!g", name = "J", descriptor = "Lclient!sd;")
	public static Class73 aClass73_657 = aClass73_662;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "[I")
	public static int[] anIntArray112 = new int[32];

	@OriginalMember(owner = "client!g", name = "V", descriptor = "Lclient!sd;")
	public static Class73 aClass73_658 = Static122.method531("huffman");

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!sd;")
	private static Class73 aClass73_659 = Static122.method531("Please contact customer support)3");

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "[I")
	public static int[] anIntArray116 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "Lclient!sd;")
	private static Class73 aClass73_660 = Static122.method531("Your profile will be transferred in:");

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_661 = aClass73_660;

	@OriginalMember(owner = "client!g", name = "zb", descriptor = "[I")
	public static int[] anIntArray120 = new int[500];

	@OriginalMember(owner = "client!g", name = "Hb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_663 = aClass73_659;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)I")
	public static int method902(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
	public static void method904() {
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt1943; local3++) {
			@Pc(9) int local9 = Static52.anIntArray132[local3];
			@Pc(13) Class3_Sub1_Sub4_Sub7_Sub2 local13 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local9];
			if (local13 != null) {
				Static176.method2727(local13.aClass3_Sub1_Sub10_1.anInt1556, local13);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lclient!sd;")
	public static Class73 method909(@OriginalArg(0) int arg0) {
		return Static162.aClass73Array24[arg0].method2435() > 0 ? Static19.method372(new Class73[] { Static11.aClass73Array3[arg0], Static5.aClass73_75, Static162.aClass73Array24[arg0] }) : Static11.aClass73Array3[arg0];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!sd;Lclient!sd;Lclient!sd;Z)V")
	public static void method910(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class73 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static116.anIntArray302[local3] = Static116.anIntArray302[local3 - 1];
			Static125.aClass73Array19[local3] = Static125.aClass73Array19[local3 - 1];
			Static102.aClass73Array14[local3] = Static102.aClass73Array14[local3 - 1];
			Static150.aClass73Array25[local3] = Static150.aClass73Array25[local3 - 1];
		}
		Static116.anIntArray302[0] = arg0;
		Static125.aClass73Array19[0] = arg1;
		Static43.anInt1010 = Static84.anInt1893;
		anInt1147++;
		Static102.aClass73Array14[0] = arg2;
		Static150.aClass73Array25[0] = arg3;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	public static void method919() {
		aClass73_657 = null;
		aClass73_660 = null;
		anIntArray120 = null;
		anIntArray116 = null;
		aClass73_658 = null;
		aClass73_663 = null;
		aClass73_661 = null;
		aClass73_659 = null;
		aClass73_662 = null;
		anIntArray112 = null;
	}
}
