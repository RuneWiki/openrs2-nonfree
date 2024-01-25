import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!hma", name = "k", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!hma", name = "m", descriptor = "Lclient!ik;")
	public static Class182 aClass182_67;

	@OriginalMember(owner = "client!hma", name = "l", descriptor = "I")
	public static int anInt3919 = 0;

	@OriginalMember(owner = "client!hma", name = "j", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_7 = new Class379("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!hma", name = "a", descriptor = "(III)V")
	public static void method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static219.method3261(local7.aClass9_Sub1_Sub3_2);
		Static219.method3261(local7.aClass9_Sub1_Sub3_1);
		if (local7.aClass9_Sub1_Sub3_2 != null) {
			local7.aClass9_Sub1_Sub3_2 = null;
		}
		if (local7.aClass9_Sub1_Sub3_1 != null) {
			local7.aClass9_Sub1_Sub3_1 = null;
		}
	}
}
