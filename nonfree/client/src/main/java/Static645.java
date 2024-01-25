import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static645 {

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "Lclient!gu;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(II)I")
	public static int method8994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static464.aShortArrayArray16 == null ? 0 : Static464.aShortArrayArray16[arg0][arg1] & 0xFFFF;
	}
}
