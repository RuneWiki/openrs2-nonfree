import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!ga;")
	public static Class111 aClass111_33;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_74 = new Class81(81, 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
	public static int method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static395.aShortArrayArray8 == null ? 0 : Static395.aShortArrayArray8[arg0][arg1] & 0xFFFF;
	}
}
