import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[I")
	public static int[] anIntArray620;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_113 = new Class67("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Lclient!qu;")
	public static Class251 aClass251_1 = new Class251();

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "S")
	public static short aShort108 = 320;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pt;IIII)V")
	public static void method5842(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static372.method5856(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static126.anInt2626) {
			Static372.method5856(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static372.method5856(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static108.anInt2385) {
			Static372.method5856(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static108.anInt2385) {
			Static372.method5856(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static126.anInt2626 && arg4 <= Static108.anInt2385) {
			Static372.method5856(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static372.method5856(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static126.anInt2626 && arg4 > 0) {
			Static372.method5856(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method5843() {
		Static388.aClass119_28 = null;
		Static228.anInt4893 = -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIB)V")
	public static void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 11);
		local8.method6211();
		local8.anInt7557 = arg1;
		local8.anInt7561 = arg2;
	}
}
