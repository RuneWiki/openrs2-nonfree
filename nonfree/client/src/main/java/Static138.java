import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public static int anInt2768 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static258.method4296(arg0, arg1) || Static603.method8432(arg1, arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[I")
	public static int[] method2572() {
		return new int[] { Static336.anInt6308, Static641.anInt10199, Static574.anInt9449 };
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public static void method2574() {
		Static339.aClass163_1.method4106();
		Static483.aClass191_1.method6988();
		Static116.aClient1.method1819();
		Static364.aCanvas13.setBackground(Color.black);
		Static620.anInt10048 = -1;
		Static339.aClass163_1 = Static386.method6227(Static364.aCanvas13);
		Static483.aClass191_1 = Static603.method8427(Static364.aCanvas13);
	}
}
