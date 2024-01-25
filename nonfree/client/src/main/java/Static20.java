import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_9 = new Class349(101, 8);

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_4 = new Class154(37, 11);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	public static void method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static324.method4715(local7.aClass12_Sub2_Sub4_1);
		Static324.method4715(local7.aClass12_Sub2_Sub4_2);
		if (local7.aClass12_Sub2_Sub4_1 != null) {
			local7.aClass12_Sub2_Sub4_1 = null;
		}
		if (local7.aClass12_Sub2_Sub4_2 != null) {
			local7.aClass12_Sub2_Sub4_2 = null;
		}
	}
}
