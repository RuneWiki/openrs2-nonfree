import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z")
	public static boolean method6048(@OriginalArg(0) int arg0) {
		return Static112.anInt2244 == 0 ? Static671.aClass3_Sub22_Sub5_3.method9325() : true;
	}

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)V")
	public static void method6050() {
		Static419.aClass133_1.method3451();
		Static714.aClass161_1.method8575();
		Static556.aClient1.method1151();
		Static67.aCanvas1.setBackground(Color.black);
		Static383.anInt6847 = -1;
		Static419.aClass133_1 = Static697.method9140(Static67.aCanvas1);
		Static714.aClass161_1 = Static573.method7946(Static67.aCanvas1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6051(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static677.method8942(arg0, "\n", "%0a"));
	}
}
