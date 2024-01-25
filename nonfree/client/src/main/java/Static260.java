import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt5098;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_75 = new Class274(51, 4);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public static void method4252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static395.method2904(local7.aClass11_Sub1_Sub2_1);
		Static395.method2904(local7.aClass11_Sub1_Sub2_2);
		if (local7.aClass11_Sub1_Sub2_1 != null) {
			local7.aClass11_Sub1_Sub2_1 = null;
		}
		if (local7.aClass11_Sub1_Sub2_2 != null) {
			local7.aClass11_Sub1_Sub2_2 = null;
		}
	}
}
