import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	public static int anInt9506 = 0;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BIII)V")
	public static void method7856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub1_Sub21 local16 = Static57.method8561(arg0, 11);
		local16.method8631();
		local16.anInt10489 = arg1;
		local16.anInt10490 = arg2;
	}
}
