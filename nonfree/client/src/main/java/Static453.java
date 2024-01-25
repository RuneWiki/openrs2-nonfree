import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!mf;")
	public static Class136_Sub1 aClass136_Sub1_1;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!ts;")
	public static Class239 aClass239_1;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_39 = new Class220(8, 0, 4, 1);

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[I")
	public static final int[] anIntArray514 = new int[32];

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
	public static int anInt7489 = -2;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_180 = new Class119("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public static int anInt7490 = 0;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
	public static boolean aBoolean815 = false;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	public static void method5913(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static288.aBooleanArray16[arg0]) {
			Static359.aClass82_84.method1826(arg0);
			Static87.aClass124ArrayArray7[arg0] = null;
			Static46.aClass124ArrayArray1[arg0] = null;
			Static288.aBooleanArray16[arg0] = false;
		}
	}
}
