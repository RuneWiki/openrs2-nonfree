import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!ph;")
	public static final Class159[] aClass159Array1 = new Class159[6];

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_5 = new Class144(16);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	public static void method3506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub1_2 != null) {
			local7.aClass1_Sub1_2 = null;
		}
		if (local7.aClass1_Sub1_1 != null) {
			local7.aClass1_Sub1_1 = null;
		}
	}
}
