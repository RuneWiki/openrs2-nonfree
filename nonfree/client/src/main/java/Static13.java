import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V")
	public static void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg2, 10);
		local8.method4393();
		local8.anInt5245 = arg0;
		local8.anInt5246 = arg3;
		local8.anInt5255 = arg1;
	}
}
