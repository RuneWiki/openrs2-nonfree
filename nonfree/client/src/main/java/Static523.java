import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static523 {

	@OriginalMember(owner = "client!uaa", name = "I", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_102 = new Class136(4);

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)I")
	public static int method7185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.anIntArrayArray53 == null ? 0 : Static314.anIntArrayArray53[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(B)V")
	public static void method7187() {
		Static261.aClass136_57.method3470();
	}
}
