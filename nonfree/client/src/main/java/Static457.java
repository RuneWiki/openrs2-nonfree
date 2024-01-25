import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public static int anInt7618;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_43 = new Class32();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method6747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg1, 4);
		local9.method4004();
		local9.anInt4595 = arg3;
		local9.anInt4592 = arg0;
		local9.anInt4599 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(14) int local14 = arg3 + arg4;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static240.method4038(arg5, Static144.anIntArrayArray30[local16], arg0, arg1);
		}
		@Pc(40) int local40 = arg4 + arg1;
		for (@Pc(42) int local42 = arg2; local42 > local9; local42--) {
			Static240.method4038(arg5, Static144.anIntArrayArray30[local42], arg0, arg1);
		}
		@Pc(71) int local71 = arg5 - arg4;
		for (@Pc(73) int local73 = local14; local73 <= local9; local73++) {
			@Pc(81) int[] local81 = Static144.anIntArrayArray30[local73];
			Static240.method4038(local40, local81, arg0, arg1);
			Static240.method4038(local71, local81, arg6, local40);
			Static240.method4038(arg5, local81, arg0, local71);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method6749() {
		if (Static109.aClass144_4 != null) {
			Static109.aClass144_4.method6932();
			Static157.aClass68_1 = null;
			Static109.aClass144_4 = null;
		}
	}
}
