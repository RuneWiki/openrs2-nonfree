import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIILclient!r;)V")
	public static void method4357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class162 arg2) {
		Static268.aClass75ArrayArray1 = new Class75[arg0][arg1];
		Static15.aClass162_1 = arg2;
		if (Static30.anIntArray51 != null) {
			Static198.aClass17_2 = Static385.method5333(Static30.anIntArray51[0], Static30.anIntArray51[1], Static30.anIntArray51[3], Static30.anIntArray51[2], Static30.anIntArray51[5], Static30.anIntArray51[4]);
		}
		Static135.aClass75_5 = new Class75();
		Static88.method1302();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
	public static boolean method4359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!fa;)Lclient!r;")
	public static Class162 method4360(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface9 arg2) {
		return new Class162_Sub3(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ps;IB)V")
	public static void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class84 local13 = arg1.method5632(Static417.aClass162_17);
		if (local13 == null) {
			return;
		}
		Static417.aClass162_17.da(arg2, arg0, arg2 + arg1.anInt6883, arg1.anInt6814 + arg0);
		if (Static449.anInt7189 < 3) {
			Static84.aClass38_42.method7454((float) arg2 + (float) arg1.anInt6883 / 2.0F, (float) arg0 + (float) arg1.anInt6814 / 2.0F, ((int) -Static313.aFloat157 & 0x3FFF) << 2, local13, arg2, arg0);
		} else {
			Static417.aClass162_17.FA(-16777216, local13, arg2, arg0);
		}
	}
}
