import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!ol", name = "Ab", descriptor = "Lclient!mq;")
	public static Class71 aClass71_11;

	@OriginalMember(owner = "client!ol", name = "R", descriptor = "Lclient!up;")
	public static final Class362 aClass362_93 = new Class362();

	@OriginalMember(owner = "client!ol", name = "ub", descriptor = "I")
	public static int anInt5752 = -2;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(IZ)I")
	public static int method5184(@OriginalArg(1) boolean arg0) {
		@Pc(11) int local11 = Static255.anInt4904;
		if (local11 == 0) {
			return arg0 ? 0 : Static5.anInt88;
		} else if (local11 == 1) {
			return Static5.anInt88;
		} else if (local11 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5197(@OriginalArg(0) Class101 arg0) {
		Static514.aClass59_13 = Static341.method5719(arg0, true, Static307.anInt5549);
		Static6.aClass324_1 = Static138.method2435(arg0, Static307.anInt5549);
		Static230.aClass59_3 = Static341.method5719(arg0, true, Static366.anInt6933);
		Static455.aClass324_11 = Static138.method2435(arg0, Static366.anInt6933);
		Static253.aClass59_5 = Static341.method5719(arg0, true, Static473.anInt8441);
		Static648.aClass324_12 = Static138.method2435(arg0, Static473.anInt8441);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(17, (long) arg1);
		local9.method2486();
		local9.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "(II)I")
	public static int method5220(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
