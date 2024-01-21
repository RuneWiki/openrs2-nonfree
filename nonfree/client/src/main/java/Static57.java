import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt1783;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Z")
	public static boolean aBoolean98;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!wb;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Lclient!wc;")
	public static Class4 aClass4_41;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!vc;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!la", name = "D", descriptor = "I")
	public static final int anInt1797 = 50;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	public static int[] anIntArray183 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!a;")
	private static Class1 aClass1_1845 = Static94.method1596("Off");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_1840 = aClass1_1845;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
	public static int[] anIntArray184 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static int[] anIntArray185 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1841 = Static94.method1596("*6n");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
	public static int[] anIntArray186 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[I")
	public static int[] anIntArray188 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "r", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array16 = new Class1[anInt1797];

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_1842 = Static94.method1596("(U(Y");

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!a;")
	private static Class1 aClass1_1843 = Static94.method1596("Trade)4compete");

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_1844 = aClass1_1843;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "I")
	public static int anInt1796 = -1;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[I")
	public static int[] anIntArray189 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "J", descriptor = "[I")
	public static int[] anIntArray191 = new int[anInt1797];

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!a;")
	public static Class1 aClass1_1846 = Static94.method1596("scape main");

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1242() {
		anIntArray189 = null;
		anIntArray186 = null;
		aClass65_3 = null;
		anIntArray188 = null;
		anIntArray185 = null;
		anIntArray191 = null;
		aClass1_1841 = null;
		aClass1_1845 = null;
		aClass1Array16 = null;
		aClass68_2 = null;
		aClass1_1843 = null;
		anIntArray184 = null;
		anIntArray183 = null;
		aClass4_41 = null;
		aClass1_1844 = null;
		aClass1_1840 = null;
		aClass1_1842 = null;
		aClass1_1846 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method1247(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2732 == Static69.anInt2806 || arg0.anInt2759 == -1 || arg0.anInt2744 != 0 || arg0.anInt2738 + 1 > Static4.method192(arg0.anInt2759).anIntArray144[arg0.anInt2730]) {
			@Pc(43) int local43 = arg0.anInt2732 - arg0.anInt2736;
			@Pc(49) int local49 = Static69.anInt2806 - arg0.anInt2736;
			@Pc(60) int local60 = arg0.anInt2746 * 128 + arg0.anInt2722 * 64;
			@Pc(70) int local70 = arg0.anInt2722 * 64 + arg0.anInt2712 * 128;
			@Pc(80) int local80 = arg0.anInt2722 * 64 + arg0.anInt2725 * 128;
			@Pc(90) int local90 = arg0.anInt2748 * 128 + arg0.anInt2722 * 64;
			arg0.anInt2724 = ((local43 - local49) * local60 + local49 * local80) / local43;
			arg0.anInt2717 = (local70 * (local43 - local49) + local49 * local90) / local43;
		}
		if (arg0.anInt2704 == 0) {
			arg0.anInt2711 = 1024;
		}
		arg0.anInt2705 = 0;
		if (arg0.anInt2704 == 1) {
			arg0.anInt2711 = 1536;
		}
		if (arg0.anInt2704 == 2) {
			arg0.anInt2711 = 0;
		}
		if (arg0.anInt2704 == 3) {
			arg0.anInt2711 = 512;
		}
		arg0.anInt2741 = arg0.anInt2711;
	}
}
