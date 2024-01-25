import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public static int anInt6047 = 0;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean435 = true;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
	public static void method5113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static127.anInt4399 = arg1;
		Static385.anInt6976 = arg0;
		Static488.anInt8138 = arg3;
		Static46.anInt933 = arg4;
		Static119.anInt2374 = arg2;
		if (Static127.anInt4399 >= 100) {
			@Pc(29) int local29 = Static488.anInt8138 * 512 + 256;
			@Pc(35) int local35 = Static119.anInt2374 * 512 + 256;
			@Pc(46) int local46 = Static38.method884(Static501.anInt8491, local29, local35) - Static46.anInt933;
			@Pc(51) int local51 = local29 - Static522.anInt8770;
			@Pc(56) int local56 = local46 - Static504.anInt8519;
			@Pc(61) int local61 = local35 - Static516.anInt8682;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local51 * local51 + local61 * local61));
			Static381.anInt6946 = (int) (Math.atan2((double) local56, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static305.anInt5631 = (int) (-2607.5945876176133D * Math.atan2((double) local51, (double) local61)) & 0x3FFF;
			Static363.anInt6440 = 0;
			if (Static381.anInt6946 < 1024) {
				Static381.anInt6946 = 1024;
			}
			if (Static381.anInt6946 > 3072) {
				Static381.anInt6946 = 3072;
			}
		}
		Static448.anInt7701 = 2;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(ZI)Z")
	public static boolean method5121(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = Static513.aClass122_10.method7215();
		if (arg0 == local16) {
			return true;
		}
		if (!arg0) {
			Static513.aClass122_10.method7281();
		} else if (!Static513.aClass122_10.method7218()) {
			arg0 = false;
		}
		if (local16 == arg0) {
			return false;
		} else {
			Static544.aClass1_Sub22_Sub1_1.aBoolean387 = arg0;
			Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
			return true;
		}
	}
}
