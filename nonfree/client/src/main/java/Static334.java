import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	public static int anInt6059 = 0;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!pfa;B)V")
	public static void method5199(@OriginalArg(0) Class251 arg0) {
		Static14.aClass251_9 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)I")
	public static int method5200(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
