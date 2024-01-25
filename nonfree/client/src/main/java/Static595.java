import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIII)V")
	public static void method8000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg0 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static430.method6122(arg0, arg2, arg4, arg1);
			}
		} else if (local15 == 0) {
			Static327.method5034(arg1, arg3, arg4, arg2);
		} else {
			@Pc(45) int local45 = (local15 << 12) / local10;
			@Pc(54) int local54 = arg1 - (arg4 * local45 >> 12);
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (arg4 < Static553.anInt9074) {
				local74 = local54 + (Static553.anInt9074 * local45 >> 12);
				local66 = Static553.anInt9074;
			} else if (arg4 > Static249.anInt4668) {
				local66 = Static249.anInt4668;
				local74 = (local45 * Static249.anInt4668 >> 12) + local54;
			} else {
				local74 = arg1;
				local66 = arg4;
			}
			@Pc(98) int local98;
			@Pc(106) int local106;
			if (arg3 < Static553.anInt9074) {
				local98 = Static553.anInt9074;
				local106 = local54 + (Static553.anInt9074 * local45 >> 12);
			} else if (Static249.anInt4668 < arg3) {
				local98 = Static249.anInt4668;
				local106 = local54 + (Static249.anInt4668 * local45 >> 12);
			} else {
				local98 = arg3;
				local106 = arg0;
			}
			if (Static326.anInt6028 > local106) {
				local98 = (Static326.anInt6028 - local54 << 12) / local45;
				local106 = Static326.anInt6028;
			} else if (Static80.anInt1738 < local106) {
				local98 = (Static80.anInt1738 - local54 << 12) / local45;
				local106 = Static80.anInt1738;
			}
			if (local74 < Static326.anInt6028) {
				local74 = Static326.anInt6028;
				local66 = (Static326.anInt6028 - local54 << 12) / local45;
			} else if (Static80.anInt1738 < local74) {
				local74 = Static80.anInt1738;
				local66 = (Static80.anInt1738 - local54 << 12) / local45;
			}
			Static217.method3480(local106, local98, local74, arg2, local66);
		}
	}
}
