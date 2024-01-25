import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!ns;")
	public static Class166 aClass166_106;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!f;")
	public static Class3 aClass3_8;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public static int anInt2838;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
	public static final int[] anIntArray238 = new int[25];

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[Lclient!tq;")
	public static final Class233[] aClass233Array7 = new Class233[14];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIZ)Lclient!tp;")
	public static Class4_Sub39 method2229(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class4_Sub39) Static183.aClass196_17.method4477(local12);
	}
}
