import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "[Lclient!wh;")
	public static final Class3_Sub16[] aClass3_Sub16Array4 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBI)Z")
	public static boolean method2415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
