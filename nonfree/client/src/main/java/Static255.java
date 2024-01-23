import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static255 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public static int anInt5182;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = new String[5];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	public static void method4118(@OriginalArg(1) boolean arg0) {
		Static124.aBoolean208 = arg0;
		Static280.aBoolean469 = !Static67.method4885();
	}
}
