import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!t", name = "qb", descriptor = "I")
	public static int anInt2727;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1089 = Static121.method2047("Loaded fonts");

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1088 = aClass60_1089;

	@OriginalMember(owner = "client!t", name = "jb", descriptor = "Lclient!tb;")
	public static Class70 aClass70_17 = new Class70();

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1090 = Static121.method2047("<col=c0ff00>");

	@OriginalMember(owner = "client!t", name = "tb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1093 = Static121.method2047("Invalid username or password)3");

	@OriginalMember(owner = "client!t", name = "mb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1091 = aClass60_1093;

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1092 = Static121.method2047("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!t", name = "ob", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!t", name = "pb", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array24 = new Class60[500];

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "I")
	public static final int anInt2728 = 3353893;

	@OriginalMember(owner = "client!t", name = "ub", descriptor = "Lclient!je;")
	public static Class36 aClass36_2 = new Class36();

	@OriginalMember(owner = "client!t", name = "vb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1094 = Static121.method2047("");

	@OriginalMember(owner = "client!t", name = "wb", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!t", name = "xb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1095 = Static121.method2047("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!t", name = "yb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1096 = aClass60_1095;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(B)V")
	public static void method1919() {
		aClass60_1093 = null;
		aClass60_1088 = null;
		aClass60_1091 = null;
		aClass36_2 = null;
		aClass70_17 = null;
		aClass60_1096 = null;
		aClass60Array24 = null;
		aClass60_1092 = null;
		aClass60_1090 = null;
		aClass60_1094 = null;
		aClass60_1095 = null;
		aByteArrayArray9 = null;
		aClass60_1089 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZII)I")
	public static int method1920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg5;
			arg5 = local12;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg4;
		} else {
			return 8 - arg5 - arg3;
		}
	}
}
