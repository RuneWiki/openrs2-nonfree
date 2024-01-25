import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
	public static int anInt4874;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_10;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "Lclient!bca;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_39 = new Class341();

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(III)V")
	public static void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static452.method7100(local7.aClass3_Sub1_Sub5_2);
		Static452.method7100(local7.aClass3_Sub1_Sub5_1);
		if (local7.aClass3_Sub1_Sub5_2 != null) {
			local7.aClass3_Sub1_Sub5_2 = null;
		}
		if (local7.aClass3_Sub1_Sub5_1 != null) {
			local7.aClass3_Sub1_Sub5_1 = null;
		}
	}
}
