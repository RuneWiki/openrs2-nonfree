import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_132 = new Class180(42, -2);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lclient!cl;")
	public static Class28_Sub1_Sub2 method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub2_2;
	}
}
