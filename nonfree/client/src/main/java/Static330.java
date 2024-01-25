import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array20;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public static void method5119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 + 1;
		Static240.method4038(arg1, Static144.anIntArrayArray30[arg2], arg0, arg3);
		@Pc(19) int local19 = arg4 - 1;
		Static240.method4038(arg1, Static144.anIntArrayArray30[arg4], arg0, arg3);
		for (@Pc(25) int local25 = local10; local25 <= local19; local25++) {
			@Pc(31) int[] local31 = Static144.anIntArrayArray30[local25];
			local31[arg3] = local31[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V")
	public static void method5121(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
