import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eca", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
	public static void method1729(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub4_Sub13 local13 = Static506.method2916(arg0, 14);
		local13.method4132();
	}
}
