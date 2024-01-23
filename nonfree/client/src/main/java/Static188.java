import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
	public static int anInt4008;

	@OriginalMember(owner = "client!tc", name = "bc", descriptor = "I")
	public static int anInt4037;

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "Lclient!eh;")
	public static Class27 aClass27_106 = new Class27(50);

	@OriginalMember(owner = "client!tc", name = "Vb", descriptor = "[[I")
	public static int[][] anIntArrayArray63 = new int[5][5000];

	@OriginalMember(owner = "client!tc", name = "dc", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1363 = Static200.method3116("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!tc", name = "Wb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1359 = aClass60_1363;

	@OriginalMember(owner = "client!tc", name = "ac", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1361 = Static200.method3116("K");

	@OriginalMember(owner = "client!tc", name = "Xb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1360 = aClass60_1361;

	@OriginalMember(owner = "client!tc", name = "Yb", descriptor = "I")
	public static int anInt4036 = -1;

	@OriginalMember(owner = "client!tc", name = "Zb", descriptor = "[Lclient!bc;")
	public static Class9_Sub1[] aClass9_Sub1Array1 = new Class9_Sub1[4];

	@OriginalMember(owner = "client!tc", name = "cc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1362 = aClass60_1361;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIIII)V")
	public static void method2940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static32.anInt816 = -1;
		anInt4036 = -1;
		Static1.anInt42 = Static30.anInt724 * arg2 / arg0;
		Static138.anInt3087 = arg1 * Static211.anInt3462 / arg3;
		Static129.method898();
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)Lclient!se;")
	public static Class26 method2947() {
		try {
			return (Class26) Class.forName("Class26_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class26_Sub1();
		}
	}
}
