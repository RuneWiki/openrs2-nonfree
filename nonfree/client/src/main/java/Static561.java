import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public static int anInt9175 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public static void method7329(@OriginalArg(0) int arg0) {
		if (Static535.anIntArray576 == null || arg0 > Static535.anIntArray576.length) {
			Static535.anIntArray576 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIB)I")
	public static int method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static559.anInt9135 < 100) {
			return -2;
		}
		@Pc(20) int local20 = -2;
		@Pc(22) int local22 = Integer.MAX_VALUE;
		@Pc(27) int local27 = arg1 - Static476.anInt7583;
		@Pc(31) int local31 = arg0 - Static476.anInt7584;
		for (@Pc(36) Class2_Sub20 local36 = (Class2_Sub20) Static476.aClass70_47.method1264(); local36 != null; local36 = (Class2_Sub20) Static476.aClass70_47.method1261()) {
			if (local36.anInt2970 == arg2) {
				@Pc(49) int local49 = local36.anInt2971;
				@Pc(52) int local52 = local36.anInt2973;
				@Pc(63) int local63 = local49 + Static476.anInt7583 << 14 | local52 + Static476.anInt7584;
				@Pc(82) int local82 = (local27 - local49) * (-local49 + local27) + (local31 - local52) * (local31 + -local52);
				if (local20 < 0 || local22 > local82) {
					local20 = local63;
					local22 = local82;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lclient!tp;")
	public static Class78 method7332() {
		try {
			return (Class78) Class.forName("Class78_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ps;I)Lclient!ps;")
	public static Class273 method7333(@OriginalArg(0) Class273 arg0) {
		if (arg0.anInt6820 != -1) {
			return Static594.method7731(arg0.anInt6820);
		}
		@Pc(25) int local25 = arg0.anInt6810 >>> 16;
		@Pc(30) Class316 local30 = new Class316(Static346.aClass90_17);
		for (@Pc(35) Class2_Sub33 local35 = (Class2_Sub33) local30.method6328(); local35 != null; local35 = (Class2_Sub33) local30.method6325()) {
			if (local25 == local35.anInt5981) {
				return Static594.method7731((int) local35.aLong268);
			}
		}
		return null;
	}
}
