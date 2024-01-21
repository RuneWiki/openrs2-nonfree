import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
	public static int anInt2279;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1028 = Static24.method441(":0");

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "[Lclient!wb;")
	public static Class65[] aClass65Array11 = new Class65[100];

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1029 = Static24.method441("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1041 = Static24.method441("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1030 = aClass65_1041;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1031 = Static24.method441("Loaded gamescreen");

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1032 = Static24.method441(" more options");

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1033 = aClass65_1032;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1034 = Static24.method441("@or2@");

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1035 = Static24.method441("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!pd", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1036 = aClass65_1031;

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
	public static final int anInt2280 = 20;

	@OriginalMember(owner = "client!pd", name = "wb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1037 = Static24.method441("backleft1");

	@OriginalMember(owner = "client!pd", name = "zb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1040 = Static24.method441("Loading config )2 ");

	@OriginalMember(owner = "client!pd", name = "xb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1038 = aClass65_1040;

	@OriginalMember(owner = "client!pd", name = "yb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1039 = Static24.method441("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!mc;Lclient!b;B)V")
	public static void method1348(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub1 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.aClass33_Sub1_18 = arg1;
		local7.aClass5_1 = arg2;
		local7.aLong82 = arg0;
		local7.anInt1142 = 1;
		@Pc(27) Class52 local27 = Static62.aClass52_8;
		synchronized (Static62.aClass52_8) {
			Static62.aClass52_8.method1593(local7);
		}
		Static98.method1692();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public static int method1351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		return Static12.aClass2_Sub1_Sub13_1 != null && local11 == Static12.aClass2_Sub1_Sub13_1.aLong82 ? Static93.aClass2_Sub8_5.anInt2342 * 99 / (Static93.aClass2_Sub8_5.aByteArray59.length - Static12.aClass2_Sub1_Sub13_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
	public static void method1353() {
		aClass65_1030 = null;
		aClass65_1037 = null;
		aClass65_1031 = null;
		aClass65_1033 = null;
		aClass65_1039 = null;
		aClass65_1034 = null;
		aClass65_1032 = null;
		aClass65Array11 = null;
		aClass65_1035 = null;
		aClass65_1036 = null;
		anIntArrayArray19 = null;
		aClass65_1041 = null;
		aClass65_1028 = null;
		aClass65_1038 = null;
		aClass65_1029 = null;
		aClass65_1040 = null;
	}
}
