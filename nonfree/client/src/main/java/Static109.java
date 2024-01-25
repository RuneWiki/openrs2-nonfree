import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!md;")
	public static final Class6_Sub1_Sub1 aClass6_Sub1_Sub1_5 = new Class6_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lclient!fg;")
	public static Class3_Sub5 method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub5_1 == null ? null : local7.aClass3_Sub5_1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	public static int method4309(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
