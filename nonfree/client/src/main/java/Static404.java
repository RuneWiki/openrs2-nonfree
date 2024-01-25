import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!np", name = "C", descriptor = "I")
	public static int anInt6908;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public static int anInt6910;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "[J")
	public static final long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!np", name = "E", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_25 = new Class6(5, 1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BB)Z")
	public static boolean method5779(@OriginalArg(1) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			return false;
		} else {
			return local15 < 128 || local15 >= 160 || Static66.aCharArray1[local15 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(B)V")
	public static void method5780() {
		Static355.aClass16_6.xa(((float) Static227.aClass3_Sub15_11.aClass17_Sub25_1.method7847() * 0.1F + 0.7F) * Static363.aFloat151);
		Static355.aClass16_6.ZA(Static142.anInt5232, Static102.aFloat70, Static406.aFloat156, (float) (Static231.anInt4427 << 2), (float) (Static170.anInt3059 << 2), (float) (Static387.anInt6744 << 2));
		Static355.aClass16_6.method8201(Static56.aClass106_1);
	}
}
