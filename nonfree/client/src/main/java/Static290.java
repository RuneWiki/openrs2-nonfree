import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_58 = new Class179(36, 3);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ga;BLclient!ul;)V")
	public static void method4210(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class246 arg1) {
		Static301.anInterface4_11 = arg0;
		Static341.aClass246_184 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	public static void method4211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(14, arg0);
		local8.method1778();
		local8.anInt2056 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(FFFZ)I")
	public static int method4213(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		if (local21 > local12 && local21 > local30) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local30 && local30 > local21) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
