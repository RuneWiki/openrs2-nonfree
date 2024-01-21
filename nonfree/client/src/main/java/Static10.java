import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_87 = Static65.method1172("cross");

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lclient!kb;")
	private static Class46 aClass46_88 = Static65.method1172("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_89 = aClass46_88;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
	public static int anInt347 = 1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILclient!kb;)V")
	public static void method277(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1) {
		Static133.aClass3_Sub4_Sub1_3.method233(65);
		Static133.aClass3_Sub4_Sub1_3.method193(arg1.method1348());
		Static133.aClass3_Sub4_Sub1_3.method218(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	public static void method278() {
		aClass46_87 = null;
		aClass46_88 = null;
		aClass46_89 = null;
		aFontMetrics1 = null;
	}
}
