import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	public static int anInt407 = 0;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	public static int anInt408 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method310() {
		@Pc(5) byte local5 = 0;
		if (Static325.aBoolean452) {
			local5 = 55;
		}
		Static247.method4265(local5);
		Static229.method4026(local5);
		Static241.method4149(local5);
		Static102.method2043(local5);
		Static160.method3077(local5);
		Static157.method3006(local5);
		Static256.method4316(local5);
		Static127.method2611(local5);
		Static351.method5640(local5);
		if (Static85.anInt2215 == 10) {
			Static82.method1759(28);
		} else if (Static85.anInt2215 == 30) {
			Static82.method1759(25);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public static void method312() {
		Static201.aClass103_39.method2679(5);
	}
}
