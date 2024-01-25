import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public static void method3781() {
		@Pc(1) Class39[] local1 = Class5_Sub3_Sub11.aClass39Array1;
		synchronized (Class5_Sub3_Sub11.aClass39Array1) {
			for (@Pc(5) int local5 = 0; local5 < Class5_Sub3_Sub11.aClass39Array1.length; local5++) {
				Class5_Sub3_Sub11.aClass39Array1[local5] = new Class39();
				Static158.anIntArray520[local5] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public static void method3782(@OriginalArg(0) int arg0) {
		Static32.anInt633 = arg0;
		Static348.anInt6698 = -1;
		Static211.anInt4169 = -1;
		Static255.method4513();
	}
}
