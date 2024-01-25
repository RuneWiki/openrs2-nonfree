import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public static int anInt4960;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt4964;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt4967;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_178 = new Class184(96, 8);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!sj;B)Ljava/lang/String;")
	public static String method3968(@OriginalArg(0) Class3_Sub38 arg0) {
		return arg0.aString59 == null || arg0.aString59.length() <= 0 ? arg0.aString60 : arg0.aString60 + Static4.aClass175_34.method4201(Static216.anInt4257) + arg0.aString59;
	}
}
