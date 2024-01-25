import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "I")
	public static int anInt7491;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public static boolean method6302(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class5_Sub3_Sub20 local15 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local15 != null; local15 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
			if (Static335.method5134(local15.anInt10178) && local15.aLong289 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	public static void method6306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(5, (long) arg1);
		local14.method7286();
		local14.anInt8546 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I[J)V")
	public static void method6308(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static487.method6994(0, arg0, arg1.length - 1, arg1);
	}
}
