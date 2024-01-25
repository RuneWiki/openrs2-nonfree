import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
	public static int anInt4609 = 0;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "Z")
	public static final boolean aBoolean318 = false;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIBIII)V")
	public static void method3856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(14) int local14 = arg3 - arg4;
		if (local9 == 0) {
			if (local14 != 0) {
				Static88.method8982(arg3, arg1, arg4, arg0);
			}
		} else if (local14 == 0) {
			Static283.method4064(arg1, arg2, arg0, arg4);
		} else {
			@Pc(48) int local48 = (local14 << 12) / local9;
			@Pc(57) int local57 = arg4 - (arg1 * local48 >> 12);
			@Pc(77) int local77;
			@Pc(75) int local75;
			if (arg2 < Static313.anInt9045) {
				local75 = local57 + (Static313.anInt9045 * local48 >> 12);
				local77 = Static313.anInt9045;
			} else if (Static575.anInt9879 < arg2) {
				local75 = (local48 * Static575.anInt9879 >> 12) + local57;
				local77 = Static575.anInt9879;
			} else {
				local75 = arg3;
				local77 = arg2;
			}
			@Pc(107) int local107;
			@Pc(109) int local109;
			if (arg1 < Static313.anInt9045) {
				local107 = Static313.anInt9045;
				local109 = local57 + (Static313.anInt9045 * local48 >> 12);
			} else if (Static575.anInt9879 >= arg1) {
				local107 = arg1;
				local109 = arg4;
			} else {
				local109 = (Static575.anInt9879 * local48 >> 12) + local57;
				local107 = Static575.anInt9879;
			}
			if (local109 < Static468.anInt355) {
				local107 = (Static468.anInt355 - local57 << 12) / local48;
				local109 = Static468.anInt355;
			} else if (Static370.anInt10475 < local109) {
				local107 = (Static370.anInt10475 - local57 << 12) / local48;
				local109 = Static370.anInt10475;
			}
			if (local75 < Static468.anInt355) {
				local75 = Static468.anInt355;
				local77 = (Static468.anInt355 - local57 << 12) / local48;
			} else if (Static370.anInt10475 < local75) {
				local75 = Static370.anInt10475;
				local77 = (Static370.anInt10475 - local57 << 12) / local48;
			}
			Static279.method4040(arg0, local77, local75, local107, local109);
		}
	}
}
