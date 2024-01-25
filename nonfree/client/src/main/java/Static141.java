import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!et", name = "D", descriptor = "I")
	public static int anInt3351 = 0;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	public static int anInt3352 = 0;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)I")
	public static int method2791(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(III)Z")
	public static boolean method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZII)V")
	public static void method2795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static87.aClass6_Sub33_6.aClass14_Sub22_2.method7288() : Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288()) != 0 && arg1 != 0 && Static530.anInt9223 < 50 && arg2 != -1) {
			Static433.aClass343Array1[Static530.anInt9223++] = new Class343((byte) (arg3 ? 3 : 2), arg2, arg1, arg4, arg0, 0, arg5, (Class9_Sub4) null);
		}
	}
}
