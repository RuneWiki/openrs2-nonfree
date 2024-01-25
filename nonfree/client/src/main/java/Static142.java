import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
	public static int anInt2687;

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "Z")
	public static boolean aBoolean201;

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	public static int anInt2694;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	public static int anInt2691 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method2138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static363.method4914(arg4, arg1, arg3, arg5, arg0, arg2, 0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z")
	public static boolean method2139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
