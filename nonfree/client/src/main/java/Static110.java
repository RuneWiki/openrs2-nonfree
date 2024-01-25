import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "[I")
	public static final int[] anIntArray238 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	public static int anInt2698 = 0;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V")
	public static void method2369(@OriginalArg(1) int arg0) {
		Static305.anInt6785 = arg0;
		@Pc(15) Class198 local15 = Static142.aClass198_109;
		synchronized (Static142.aClass198_109) {
			Static142.aClass198_109.method5213();
		}
		local15 = Static245.aClass198_178;
		synchronized (Static245.aClass198_178) {
			Static245.aClass198_178.method5213();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)Z")
	public static boolean method2371(@OriginalArg(0) int arg0) {
		return arg0 == 44 || arg0 == 23 || arg0 == 1008 || arg0 == 18 || arg0 == 11;
	}
}
