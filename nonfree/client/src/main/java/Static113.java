import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
	public static void method2338(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(5, arg0);
		local8.method3062();
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)I")
	public static int method2339(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)I")
	public static int method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static310.aShortArrayArray23 == null ? 0 : Static310.aShortArrayArray23[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(CI)Z")
	public static boolean method2341(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
