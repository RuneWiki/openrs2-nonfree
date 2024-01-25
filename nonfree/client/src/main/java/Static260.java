import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ms", name = "tb", descriptor = "I")
	public static final int anInt4388 = Static88.method1559(2200);

	@OriginalMember(owner = "client!ms", name = "ub", descriptor = "I")
	public static final int anInt4389 = 4096;

	@OriginalMember(owner = "client!ms", name = "jc", descriptor = "I")
	public static final int anInt4394 = 4096;

	@OriginalMember(owner = "client!ms", name = "pc", descriptor = "I")
	public static int anInt4396 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!dg;[Lclient!ms;)Lclient!ms;")
	public static Class163_Sub1 method3490(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) Class163_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class163_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class163_Sub1(arg0, arg1);
		}
	}
}
