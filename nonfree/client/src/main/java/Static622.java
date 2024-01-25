import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "Z")
	public static boolean aBoolean820;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BIII)V")
	public static void method8427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(11, (long) arg0);
		local9.method6239();
		local9.anInt6936 = arg2;
		local9.anInt6938 = arg1;
	}
}
