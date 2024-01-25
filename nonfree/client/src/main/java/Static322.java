import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static322 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[Lclient!cs;")
	public static Class15_Sub1_Sub2[] aClass15_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
	public static int anInt6494;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_83 = new Class71(44, -2);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z")
	public static boolean method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static589.method8153(arg0, arg1) & ((arg0 & 0x2000) != 0 | Static271.method4662(arg0, arg1) | Static571.method7931(arg1, arg0));
	}
}
