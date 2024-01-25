import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
	public static int anInt2267;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)V")
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub11 local8 = Static652.method8695(0L, 15);
		local8.method3955();
		local8.anInt4427 = arg1;
		local8.anInt4425 = arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIII)I")
	public static int method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg2;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static411.method5185(local7, local17);
		@Pc(35) int local35 = Static411.method5185(local7 + 1, local17);
		@Pc(42) int local42 = Static411.method5185(local7, local17 + 1);
		@Pc(51) int local51 = Static411.method5185(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static392.method5064(arg0, local13, local35, local28);
		@Pc(70) int local70 = Static392.method5064(arg0, local13, local51, local42);
		return Static392.method5064(arg0, local23, local70, local58);
	}
}
