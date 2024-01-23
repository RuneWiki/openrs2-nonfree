import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!kj", name = "Q", descriptor = "Lclient!n;")
	public static Class1_Sub4_Sub3 aClass1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_32;

	@OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!kj", name = "bb", descriptor = "Lclient!mb;")
	public static Class70 aClass70_26;

	@OriginalMember(owner = "client!kj", name = "ab", descriptor = "Lclient!ia;")
	private static Class51 aClass51_808 = Static64.method1101("slide:");

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_803 = aClass51_808;

	@OriginalMember(owner = "client!kj", name = "W", descriptor = "Lclient!ia;")
	private static Class51 aClass51_807 = Static64.method1101("skill)2");

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "Lclient!ia;")
	public static Class51 aClass51_804 = aClass51_807;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "[[[Lclient!sf;")
	public static Class105[][][] aClass105ArrayArrayArray1 = new Class105[4][104][104];

	@OriginalMember(owner = "client!kj", name = "M", descriptor = "Lclient!ia;")
	public static Class51 aClass51_805 = Static64.method1101("gelb:");

	@OriginalMember(owner = "client!kj", name = "V", descriptor = "Lclient!ia;")
	public static Class51 aClass51_806 = aClass51_808;

	@OriginalMember(owner = "client!kj", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!kj", name = "cb", descriptor = "Lclient!me;")
	public static Class71 aClass71_22 = null;

	@OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
	public static int anInt2460 = 0;

	@OriginalMember(owner = "client!kj", name = "eb", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!k;I)Lclient!ia;")
	public static Class51 method1875(@OriginalArg(1) Class1_Sub16 arg0) {
		try {
			@Pc(11) Class51 local11 = new Class51();
			local11.anInt1858 = arg0.method3797();
			if (local11.anInt1858 > 32767) {
				local11.anInt1858 = 32767;
			}
			local11.aByteArray17 = new byte[local11.anInt1858];
			arg0.anInt4860 += Static48.aClass98_1.method2994(arg0.anInt4860, arg0.aByteArray62, local11.anInt1858, local11.aByteArray17, 0);
			return local11;
		} catch (@Pc(48) Exception local48) {
			return Static169.aClass51_1300;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	public static void method1876() {
		if (Static200.aClass42_2 != null) {
			Static200.aClass42_2.method2730();
		}
		if (Static92.aClass42_1 != null) {
			Static92.aClass42_1.method2730();
		}
		Static185.method3102(Static18.aBoolean16);
		Static200.aClass42_2 = Static148.method2541(Static36.aCanvas1, 22050, Static51.aClass72_3, 0);
		Static200.aClass42_2.method2728(Static120.aClass1_Sub4_Sub1_2);
		Static92.aClass42_1 = Static148.method2541(Static36.aCanvas1, 2048, Static51.aClass72_3, 1);
		Static92.aClass42_1.method2728(aClass1_Sub4_Sub3_2);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ia;IZ)V")
	public static void method1880(@OriginalArg(0) Class51 arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			try {
				Static218.anApplet_Sub1_5.getAppletContext().showDocument(arg0.method1415(Static218.anApplet_Sub1_5.getCodeBase()), "_blank");
			} catch (@Pc(16) Exception local16) {
			}
		} else {
			try {
				Static218.anApplet_Sub1_5.getAppletContext().showDocument(arg0.method1415(Static218.anApplet_Sub1_5.getCodeBase()), "_top");
			} catch (@Pc(29) Exception local29) {
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)I")
	public static int method1881(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
