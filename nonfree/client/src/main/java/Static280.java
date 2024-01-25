import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jja", name = "o", descriptor = "[Lclient!bs;")
	public static final Class3_Sub11_Sub1[] aClass3_Sub11_Sub1Array3 = new Class3_Sub11_Sub1[14];

	@OriginalMember(owner = "client!jja", name = "b", descriptor = "(III)Lclient!ie;")
	public static Class28_Sub1_Sub3 method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass28_Sub1_Sub3_1 == null ? null : local7.aClass28_Sub1_Sub3_1;
	}
}
