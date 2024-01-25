import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_31 = new Class316(57, -1);

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)Lclient!al;")
	public static Class15_Sub1 method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_1;
	}
}
