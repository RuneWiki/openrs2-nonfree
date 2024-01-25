import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt9617;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_282 = new Class88("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "[Lclient!fl;")
	public static final Class102[] aClass102Array139 = new Class102[16];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7966(@OriginalArg(0) String arg0) {
		Static406.method6373("", 0, 0, "", arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V")
	public static void method7968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static208.aClass12_Sub10_Sub1_1.anInt2232 != 0 && arg2 != 0 && Static39.anInt790 < 50 && arg4 != -1) {
			Static308.aClass195Array1[Static39.anInt790++] = new Class195((byte) 1, arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
	public static void method7969() {
		if (Static299.aBoolean447) {
			return;
		}
		Static497.aBoolean640 = true;
		Static299.aBoolean447 = true;
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static500.aFloat186 = (int) Static500.aFloat186 - 65 & 0xFFFFFF80;
		} else {
			Static516.aFloat188 += (-24.0F - Static516.aFloat188) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
	public static boolean method7971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static334.method5354(arg0, arg1) | (arg0 & 0x70000) != 0 || Static203.method3818(arg0, arg1);
	}
}
