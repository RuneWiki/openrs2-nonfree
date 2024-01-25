import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
	public static int anInt2524;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	public static int method2001(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
