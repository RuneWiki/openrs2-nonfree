import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "Z")
	public static boolean aBoolean525;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_219 = new Class102(81, 0);

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
	public static int anInt7252 = -1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)I")
	public static int method5679(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public static void method5680(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(11, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
	public static void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static445.anInt7141 == 1) {
			Static231.aClass13Array12[Static351.anInt5976 / 100].method5668(Static411.anInt6741 - 8, Static55.anInt1028 - 8);
		}
		if (Static445.anInt7141 == 2) {
			Static231.aClass13Array12[Static351.anInt5976 / 100 + 4].method5668(Static411.anInt6741 - 8, Static55.anInt1028 - 8);
		}
		Static411.method5208();
	}
}
