import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "[I")
	public static final int[] anIntArray610 = new int[4];

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZLclient!nc;ZB)V")
	public static void method9010(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub38 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) int local13 = arg1.anInt6418;
		@Pc(17) int local17 = (int) arg1.aLong312;
		arg1.method9222();
		if (arg2) {
			Static397.method5820(local13);
		}
		Static290.method4605(local13);
		@Pc(34) Class238 local34 = Static305.method4761(local17);
		if (local34 != null) {
			Static333.method5032(local34);
		}
		Static292.method4638(-21);
		if (!arg0 && Static381.anInt6411 != -1) {
			Static194.method8970(Static381.anInt6411, 1);
		}
		@Pc(61) Class159 local61 = new Class159(Static438.aClass306_31);
		for (@Pc(66) Class5_Sub38 local66 = (Class5_Sub38) local61.method3548(); local66 != null; local66 = (Class5_Sub38) local61.method3550()) {
			if (!local66.method9219()) {
				local66 = (Class5_Sub38) local61.method3548();
				if (local66 == null) {
					return;
				}
			}
			if (local66.anInt6419 == 3) {
				@Pc(91) int local91 = (int) local66.aLong312;
				if (local13 == local91 >>> 16) {
					method9010(arg0, local66, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
	public static void method9011(@OriginalArg(1) int arg0) {
		if (Static352.anIntArray340 == null || arg0 > Static352.anIntArray340.length) {
			Static352.anIntArray340 = new int[arg0];
		}
	}
}
