import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt3429 = 0;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method2851(@OriginalArg(0) Class247 arg0) {
		if (arg0.anInt6840 == 5 && arg0.anInt6779 != -1) {
			Static259.method3755(arg0, Static122.aClass19_16);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZII)I")
	public static int method2853(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub25 local10 = Static175.method2834(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray229.length; local28++) {
				if (arg2 == local10.anIntArray230[local28]) {
					local26 += local10.anIntArray229[local28];
				}
			}
			return local26;
		}
	}
}
