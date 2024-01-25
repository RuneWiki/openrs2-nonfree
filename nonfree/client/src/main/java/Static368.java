import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
	public static int anInt7332;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
	public static int anInt7333 = -1;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
	public static void method6234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub6_Sub6 local12 = Static139.method3119(arg2, 11);
		local12.method3088();
		local12.anInt3368 = arg0;
		local12.anInt3367 = arg1;
	}
}
