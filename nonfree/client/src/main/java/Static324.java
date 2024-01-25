import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static324 {

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_93 = new Class186(89, -2);

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	public static final int anInt5292 = 1;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
	public static int anInt5293 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method4597() {
		if (Static241.aBoolean268) {
			return;
		}
		Static165.aBoolean204 = true;
		if (Static8.aClass173_Sub1_1.aBoolean311) {
			Static367.aFloat104 = (int) Static367.aFloat104 - 17 & 0xFFFFFFF0;
		} else {
			Static74.aFloat6 += (-12.0F - Static74.aFloat6) / 2.0F;
		}
		Static241.aBoolean268 = true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z")
	public static boolean method4598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
