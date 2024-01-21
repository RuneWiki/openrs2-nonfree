import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean8 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_89 = Static109.method1737("compass");

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_90 = Static109.method1737("Fallen lassen");

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "[I")
	public static int[] anIntArray20 = new int[5];

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_91 = Static109.method1737(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_92 = Static109.method1737("hel");

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public static int anInt215 = 0;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_93 = Static109.method1737("@lre@");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public static void method131(@OriginalArg(1) int arg0) {
		Static53.method1446(arg0);
		Static65.method1134(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method132() {
		aClass53_93 = null;
		anIntArray20 = null;
		aClass53_89 = null;
		aClass53_90 = null;
		aClass53_91 = null;
		aClass53_92 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BII)I")
	public static int method133(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static57.method1048(arg1, 0, arg0);
	}
}
