import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
	public static int anInt7939 = 0;

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!sq;")
	public static final Class314 aClass314_20 = new Class314(3);

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "[Lclient!eq;")
	public static final Class3_Sub10[] aClass3_Sub10Array5 = new Class3_Sub10[8];

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)V")
	public static void method6600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static67.method1444(local7.aClass41_Sub2_Sub5_1);
			if (local7.aClass41_Sub2_Sub5_1 != null) {
				local7.aClass41_Sub2_Sub5_1 = null;
			}
		}
	}
}
