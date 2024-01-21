import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!dd;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public static final int anInt58 = 50;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array1 = new Class34[anInt58];

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!ic;")
	private static Class34 aClass34_25 = Static56.method816("Invalid username or password)3");

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	public static int[] anIntArray5 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	public static int[] anIntArray6 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[Lclient!od;")
	public static Class57[] aClass57Array1 = new Class57[50];

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
	public static int[] anIntArray7 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_26 = aClass34_25;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_27 = Static56.method816(":assist:");

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
	public static int[] anIntArray8 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	public static int[] anIntArray9 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!ic;")
	public static Class34 aClass34_28 = Static56.method816("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
	public static int[] anIntArray10 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
	public static int[] anIntArray11 = new int[anInt58];

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_29 = Static56.method816("<col=ffff00>");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public static int anInt64 = 1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method29() {
		anIntArray11 = null;
		anIntArray6 = null;
		anIntArray7 = null;
		aClass34_27 = null;
		aClass34_25 = null;
		aClass57Array1 = null;
		aClass34Array1 = null;
		anIntArray9 = null;
		anIntArray8 = null;
		aClass14_1 = null;
		anIntArray10 = null;
		aClass34_28 = null;
		anIntArray5 = null;
		aClass34_26 = null;
		aClass34_29 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method30() {
		@Pc(14) boolean local14 = false;
		while (!local14) {
			local14 = true;
			for (@Pc(20) int local20 = 0; local20 < Static96.anInt552 - 1; local20++) {
				if (Static50.anIntArray166[local20] < 1000 && Static50.anIntArray166[local20 + 1] > 1000) {
					local14 = false;
					@Pc(42) Class34 local42 = Static6.aClass34Array3[local20];
					Static6.aClass34Array3[local20] = Static6.aClass34Array3[local20 + 1];
					Static6.aClass34Array3[local20 + 1] = local42;
					@Pc(60) Class34 local60 = Static61.aClass34Array11[local20];
					Static61.aClass34Array11[local20] = Static61.aClass34Array11[local20 + 1];
					Static61.aClass34Array11[local20 + 1] = local60;
					@Pc(78) int local78 = Static50.anIntArray166[local20];
					Static50.anIntArray166[local20] = Static50.anIntArray166[local20 + 1];
					Static50.anIntArray166[local20 + 1] = local78;
					@Pc(96) int local96 = Static104.anIntArray328[local20];
					Static104.anIntArray328[local20] = Static104.anIntArray328[local20 + 1];
					Static104.anIntArray328[local20 + 1] = local96;
					@Pc(114) int local114 = Static21.anIntArray71[local20];
					Static21.anIntArray71[local20] = Static21.anIntArray71[local20 + 1];
					Static21.anIntArray71[local20 + 1] = local114;
					@Pc(132) int local132 = Static117.anIntArray363[local20];
					Static117.anIntArray363[local20] = Static117.anIntArray363[local20 + 1];
					Static117.anIntArray363[local20 + 1] = local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public static void method31() {
		Static64.aClass7_14 = new Class7(32);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)Lclient!ic;")
	public static Class34 method32(@OriginalArg(0) int arg0) {
		return Static6.aClass34Array3[arg0].method820() > 0 ? Static44.method669(new Class34[] { Static61.aClass34Array11[arg0], Static3.aClass34_18, Static6.aClass34Array3[arg0] }) : Static61.aClass34Array11[arg0];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public static void method33(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		local8[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg1 != Static68.anIntArray208[local28]) {
				local13[local10] = Static68.anIntArray208[local28];
				local8[local10] = Static101.anIntArray325[local28];
				local10++;
			}
		}
		Static101.anIntArray325 = local8;
		Static68.anIntArray208 = local13;
		Static115.method1634(0, Static91.aClass2Array1, Static91.aClass2Array1.length - 1, Static101.anIntArray325, Static68.anIntArray208);
	}
}
