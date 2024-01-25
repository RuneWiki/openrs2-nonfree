import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lba", name = "B", descriptor = "[I")
	public static int[] anIntArray413;

	@OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_108 = new Class254(9, 6);

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
	public static int anInt5545 = 100;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)Lclient!fv;")
	public static Class112 method4772(@OriginalArg(1) int arg0) {
		@Pc(10) Class112[] local10 = Static130.method2516();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			if (local10[local12].anInt3347 == arg0) {
				return local10[local12];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIZ)V")
	public static void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static5.anInt145 == 0) {
			Static342.method5387(false);
		} else {
			Static92.anInt9035 = Static5.anInt145;
			Static419.method6517(0);
		}
		Static349.aBoolean508 = arg3;
		Static288.anInt5499 = arg2;
		Static453.anInt8318 = arg0;
		Static461.method101(arg1);
	}
}
