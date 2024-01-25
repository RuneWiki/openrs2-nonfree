import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Lclient!hb;")
	public static Class1 aClass1_2;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBIIII)V")
	public static void method6774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg3 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static399.method5771(arg4, arg0, arg3, arg2);
			}
		} else if (local15 == 0) {
			Static302.method4564(arg0, arg1, arg4, arg2);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg4 - (arg2 * local52 >> 12);
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (Static529.anInt9806 > arg2) {
				local66 = Static529.anInt9806;
				local74 = (local52 * Static529.anInt9806 >> 12) + local61;
			} else if (Static205.anInt3906 >= arg2) {
				local74 = arg4;
				local66 = arg2;
			} else {
				local74 = (local52 * Static205.anInt3906 >> 12) + local61;
				local66 = Static205.anInt3906;
			}
			@Pc(119) int local119;
			@Pc(117) int local117;
			if (Static529.anInt9806 > arg1) {
				local119 = Static529.anInt9806;
				local117 = (local52 * Static529.anInt9806 >> 12) + local61;
			} else if (arg1 > Static205.anInt3906) {
				local117 = (local52 * Static205.anInt3906 >> 12) + local61;
				local119 = Static205.anInt3906;
			} else {
				local117 = arg3;
				local119 = arg1;
			}
			if (local117 < Static133.anInt2531) {
				local117 = Static133.anInt2531;
				local119 = (Static133.anInt2531 - local61 << 12) / local52;
			} else if (Static52.anInt1226 < local117) {
				local119 = (Static52.anInt1226 - local61 << 12) / local52;
				local117 = Static52.anInt1226;
			}
			if (local74 < Static133.anInt2531) {
				local74 = Static133.anInt2531;
				local66 = (Static133.anInt2531 - local61 << 12) / local52;
			} else if (local74 > Static52.anInt1226) {
				local66 = (Static52.anInt1226 - local61 << 12) / local52;
				local74 = Static52.anInt1226;
			}
			Static501.method6930(local117, local119, local66, local74, arg0);
		}
	}
}
