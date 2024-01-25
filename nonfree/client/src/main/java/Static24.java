import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public static int anInt542 = 0;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_1 = new Class190("", 10);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZI)Ljava/lang/String;")
	public static String method469(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static447.method5989(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method472(@OriginalArg(0) int arg0) {
		Static401.anInt7562 = arg0;
		Static342.aClass83_50.method1669();
	}
}
