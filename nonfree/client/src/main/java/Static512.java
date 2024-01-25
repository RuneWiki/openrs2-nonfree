import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_171 = new Class151(11, -2);

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
	public static void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static499.method6774(local7.aClass3_Sub1_Sub4_1);
		Static499.method6774(local7.aClass3_Sub1_Sub4_2);
		if (local7.aClass3_Sub1_Sub4_1 != null) {
			local7.aClass3_Sub1_Sub4_1 = null;
		}
		if (local7.aClass3_Sub1_Sub4_2 != null) {
			local7.aClass3_Sub1_Sub4_2 = null;
		}
	}
}
