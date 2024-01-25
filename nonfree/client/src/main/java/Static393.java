import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!o;")
	public static final Class260 aClass260_8 = new Class260(1);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIII)V")
	public static void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg2;
		@Pc(15) int local15 = -arg2;
		Static240.method4038(arg3 + arg2, Static144.anIntArrayArray30[arg0], arg1, arg3 - arg2);
		@Pc(31) int local31 = -1;
		while (local12 > local10) {
			local31 += 2;
			local15 += local31;
			local10++;
			if (local15 >= 0) {
				local12--;
				local15 -= local12 << 1;
				@Pc(57) int[] local57 = Static144.anIntArrayArray30[arg0 + local12];
				@Pc(63) int[] local63 = Static144.anIntArrayArray30[arg0 - local12];
				@Pc(67) int local67 = local10 + arg3;
				@Pc(71) int local71 = arg3 - local10;
				Static240.method4038(local67, local57, arg1, local71);
				Static240.method4038(local67, local63, arg1, local71);
			}
			@Pc(87) int local87 = local12 + arg3;
			@Pc(92) int local92 = arg3 - local12;
			@Pc(98) int[] local98 = Static144.anIntArrayArray30[local10 + arg0];
			@Pc(104) int[] local104 = Static144.anIntArrayArray30[arg0 - local10];
			Static240.method4038(local87, local98, arg1, local92);
			Static240.method4038(local87, local104, arg1, local92);
		}
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V")
	public static void method5983() {
		Static563.anImage3 = null;
		Static430.aFont2 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!d;BLjava/awt/Canvas;)Lclient!ha;")
	public static Class144 method5986(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class144_Sub3(arg2, arg1, arg0);
	}
}
