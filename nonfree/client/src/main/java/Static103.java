import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_4;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1183 = Static63.method1251("backbase2");

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!ca;")
	public static Class10 aClass10_12 = new Class10();

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1186 = Static63.method1251("Loaded fonts");

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1184 = aClass45_1186;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt2765 = 0;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1192 = Static63.method1251("Connecting to friendserver");

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1185 = aClass45_1192;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1187 = Static63.method1251(" seconds)3");

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1189 = Static63.method1251("Connection lost");

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1188 = aClass45_1189;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public static final int anInt2767 = 0;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1190 = aClass45_1187;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1191 = Static63.method1251("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!sd;II)[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] method1894(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) int arg2) {
		return Static106.method1918(arg2, arg1, arg0) ? Static111.method1989() : null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!ge;ZLclient!t;)V")
	public static void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) Class29_Sub1 arg1, @OriginalArg(3) Class68 arg2) {
		@Pc(3) Class5_Sub14 local3 = new Class5_Sub14();
		local3.aLong146 = arg0;
		local3.aClass29_Sub1_26 = arg1;
		local3.aClass68_3 = arg2;
		local3.anInt1841 = 1;
		@Pc(22) Class10 local22 = Static19.aClass10_4;
		synchronized (Static19.aClass10_4) {
			Static19.aClass10_4.method234(local3);
		}
		Static63.method1250();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method1896() {
		aClass45_1191 = null;
		aClass45_1190 = null;
		aClass45_1192 = null;
		aClass45_1185 = null;
		aClass45_1184 = null;
		aClass45_1189 = null;
		aClass45_1188 = null;
		aClass45_1186 = null;
		aClass5_Sub2_Sub6_Sub3_4 = null;
		aClass45_1187 = null;
		aClass10_12 = null;
		aClass45_1183 = null;
	}
}
