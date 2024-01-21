import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static volatile int anInt2933 = 0;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt2934 = 0;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1115 = Static2.method59("white:");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1114 = aClass80_1115;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[Lclient!qa;")
	public static Class2_Sub1_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub1_Sub4_Sub2Array1 = new Class2_Sub1_Sub1_Sub4_Sub2[2048];

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1116 = aClass80_1115;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1117 = Static2.method59("backhmid1");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public static int anInt2939 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1859(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ff;I)Lclient!nb;")
	public static Class2_Sub13 method1861(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(13) byte[] local13 = arg1.method372(arg0);
		return local13 == null ? null : new Class2_Sub13(local13);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1862() {
		aClass80_1116 = null;
		aClass2_Sub1_Sub1_Sub4_Sub2Array1 = null;
		anIntArray383 = null;
		aClass80_1114 = null;
		aClass80_1117 = null;
		aClass80_1115 = null;
	}
}
