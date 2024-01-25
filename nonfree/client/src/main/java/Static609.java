import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "[Lclient!eq;")
	public static final Class110[] aClass110Array1 = new Class110[4];

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_147 = new Class171(131, 3);

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_108 = new Class240(7, -1);

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)Lclient!cf;")
	public static Class34_Sub1_Sub2 method8264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass34_Sub1_Sub2_1 == null ? null : local7.aClass34_Sub1_Sub2_1;
	}
}
