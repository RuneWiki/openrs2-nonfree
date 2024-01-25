import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "Lclient!ga;")
	public static Class111 aClass111_91;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_126 = new Class319(35, 7);

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
	public static int anInt6653 = 1;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V")
	public static void method5473() {
		@Pc(9) int local9 = (int) ((double) Static500.anInt6888 * 34.46D);
		local9 <<= 0x2;
		if (Static136.aClass12_8.method6455()) {
			local9 += 512;
		}
		Static136.aClass12_8.GA(200, local9);
	}
}
