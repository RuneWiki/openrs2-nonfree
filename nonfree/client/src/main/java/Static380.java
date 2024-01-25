import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_209 = new Class194(77, -1);

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "Lclient!st;")
	public static final Class314 aClass314_107 = new Class314(11, 3);

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_12 = new Class178(10, 2, 2, 0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!mfa;B)I")
	public static int method5990(@OriginalArg(0) Class3_Sub9_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method5642(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method5642(5);
		} else if (local15 == 2) {
			local22 = arg0.method5642(8);
		} else {
			local22 = arg0.method5642(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)Lclient!pn;")
	public static Class9_Sub2_Sub3 method5991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub2_Sub3_2;
	}
}
