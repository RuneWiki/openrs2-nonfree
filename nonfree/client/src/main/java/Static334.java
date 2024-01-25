import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "[Lclient!l;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Lclient!pj;")
	public static Class248 aClass248_55;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
	public static int method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static205.aShortArrayArray15 == null ? 0 : Static205.aShortArrayArray15[arg0][arg1] & 0xFFFF;
	}
}
