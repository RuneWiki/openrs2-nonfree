import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static398 {

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
	public static int anInt6645;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_156 = new Class265(103, -2);

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "Lclient!ol;")
	public static final Class182 aClass182_119 = new Class182("", 14);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ju;I)Ljava/lang/String;")
	public static String method5260(@OriginalArg(0) Class2_Sub22 arg0) {
		return arg0.aString43 == null || arg0.aString43.length() <= 0 ? arg0.aString42 : arg0.aString42 + Static267.aClass209_164.method4562(Static388.anInt6533) + arg0.aString43;
	}
}
