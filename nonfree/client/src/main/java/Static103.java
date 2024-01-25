import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIZIII)V")
	public static void method7655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg3 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static240.method7694(arg0, arg3, arg1, arg2);
			}
		} else if (local15 == 0) {
			Static59.method1018(arg0, arg4, arg2, arg1);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(52) int local52 = arg2 - (local44 * arg1 >> 12);
			@Pc(65) int local65;
			@Pc(63) int local63;
			if (Static130.anInt2131 > arg1) {
				local63 = local52 + (local44 * Static130.anInt2131 >> 12);
				local65 = Static130.anInt2131;
			} else if (arg1 > Static89.anInt1576) {
				local63 = local52 + (local44 * Static89.anInt1576 >> 12);
				local65 = Static89.anInt1576;
			} else {
				local65 = arg1;
				local63 = arg2;
			}
			@Pc(103) int local103;
			@Pc(105) int local105;
			if (Static130.anInt2131 > arg4) {
				local105 = local52 + (local44 * Static130.anInt2131 >> 12);
				local103 = Static130.anInt2131;
			} else if (Static89.anInt1576 >= arg4) {
				local103 = arg4;
				local105 = arg3;
			} else {
				local105 = local52 + (Static89.anInt1576 * local44 >> 12);
				local103 = Static89.anInt1576;
			}
			if (Static275.anInt4756 > local105) {
				local103 = (Static275.anInt4756 - local52 << 12) / local44;
				local105 = Static275.anInt4756;
			} else if (Static48.anInt898 < local105) {
				local105 = Static48.anInt898;
				local103 = (Static48.anInt898 - local52 << 12) / local44;
			}
			if (local63 < Static275.anInt4756) {
				local65 = (Static275.anInt4756 - local52 << 12) / local44;
				local63 = Static275.anInt4756;
			} else if (local63 > Static48.anInt898) {
				local63 = Static48.anInt898;
				local65 = (Static48.anInt898 - local52 << 12) / local44;
			}
			Static149.method2044(arg0, local65, local63, local105, local103);
		}
	}
}
