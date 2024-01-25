import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int anInt4982;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!ju;")
	public static final Class173 aClass173_5 = new Class173("WTQA", 2);

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	public static int anInt4987 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg2);
		@Pc(17) int local17 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg1);
		@Pc(23) int local23 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0);
		@Pc(29) int local29 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5);
		@Pc(38) int local38 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg2 + arg4);
		@Pc(47) int local47 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg1 - arg4);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static337.method5150(local29, arg3, local23, Static176.anIntArrayArray28[local49]);
		}
		for (@Pc(74) int local74 = local17; local74 > local47; local74--) {
			Static337.method5150(local29, arg3, local23, Static176.anIntArrayArray28[local74]);
		}
		@Pc(101) int local101 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + arg4);
		@Pc(110) int local110 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 - arg4);
		for (@Pc(112) int local112 = local38; local112 <= local47; local112++) {
			@Pc(118) int[] local118 = Static176.anIntArrayArray28[local112];
			Static337.method5150(local101, arg3, local23, local118);
			Static337.method5150(local29, arg3, local110, local118);
		}
	}
}
