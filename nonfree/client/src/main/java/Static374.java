import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[Lclient!hv;")
	public static Class148[] aClass148Array3;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bfa;I)Ljava/lang/String;")
	public static String method5546(@OriginalArg(0) Class2_Sub5 arg0) {
		return arg0.aString7 == null || arg0.aString7.length() <= 0 ? arg0.aString6 : arg0.aString6 + Static290.aClass198_34.method4365(Static52.anInt1264) + arg0.aString7;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z")
	public static boolean method5547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!es;B)Ljava/lang/String;")
	public static String method5548(@OriginalArg(0) Class2_Sub15 arg0) {
		return Static380.method5631(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
	public static int method5550(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
