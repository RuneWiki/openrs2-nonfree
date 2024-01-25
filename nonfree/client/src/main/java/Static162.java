import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
	public static int anInt3683;

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
	public static int anInt3682 = 0;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIII)V")
	public static void method3293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static282.method4624(arg2, arg1, arg3, arg4);
			}
		} else if (local15 == 0) {
			Static236.method4130(arg0, arg4, arg3, arg2);
		} else {
			@Pc(50) int local50 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg4 - (local50 * arg2 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg2 < Static376.anInt7071) {
				local71 = local59 + (Static376.anInt7071 * local50 >> 12);
				local73 = Static376.anInt7071;
			} else if (Class179_Sub2.lb < arg2) {
				local73 = Class179_Sub2.lb;
				local71 = local59 + (Class179_Sub2.lb * local50 >> 12);
			} else {
				local71 = arg4;
				local73 = arg2;
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (arg0 < Static376.anInt7071) {
				local110 = (Static376.anInt7071 * local50 >> 12) + local59;
				local112 = Static376.anInt7071;
			} else if (arg0 > Class179_Sub2.lb) {
				local110 = (local50 * Class179_Sub2.lb >> 12) + local59;
				local112 = Class179_Sub2.lb;
			} else {
				local112 = arg0;
				local110 = arg1;
			}
			if (local71 < Static96.anInt2302) {
				local71 = Static96.anInt2302;
				local73 = (Static96.anInt2302 - local59 << 12) / local50;
			} else if (Static289.anInt5545 < local71) {
				local73 = (Static289.anInt5545 - local59 << 12) / local50;
				local71 = Static289.anInt5545;
			}
			if (local110 < Static96.anInt2302) {
				local110 = Static96.anInt2302;
				local112 = (Static96.anInt2302 - local59 << 12) / local50;
			} else if (Static289.anInt5545 < local110) {
				local112 = (Static289.anInt5545 - local59 << 12) / local50;
				local110 = Static289.anInt5545;
			}
			Static165.method3363(local112, local71, local73, arg3, local110);
		}
	}
}
