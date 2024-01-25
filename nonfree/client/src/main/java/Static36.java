import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "Kg", descriptor = "I")
	public static int anInt1027 = -1;

	@OriginalMember(owner = "client!bea", name = "Jh", descriptor = "I")
	public static int anInt1076 = -2;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(III)V")
	public static void method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static478.method6527(local7.aClass25_Sub2_Sub5_1);
			if (local7.aClass25_Sub2_Sub5_1 != null) {
				local7.aClass25_Sub2_Sub5_1 = null;
			}
		}
	}
}
