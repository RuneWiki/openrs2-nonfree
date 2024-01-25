import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Lclient!la;")
	public static Class196 aClass196_59;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "F")
	public static float aFloat109;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLclient!qk;II)V")
	public static void method4829(@OriginalArg(1) Class279 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1 local13 = arg0.method7073(Static323.aClass5_9);
		if (local13 == null) {
			return;
		}
		Static323.aClass5_9.KA(arg1, arg2, arg1 + arg0.anInt8153, arg0.anInt8141 + arg2);
		if (Static51.anInt1431 >= 3) {
			Static323.aClass5_9.A(-16777216, local13, arg1, arg2);
		} else {
			Static480.aClass24_27.method8580((float) arg1 + (float) arg0.anInt8153 / 2.0F, (float) arg2 + (float) arg0.anInt8141 / 2.0F, ((int) -Static401.aFloat165 & 0x3FFF) << 2, local13, arg1, arg2);
		}
	}
}
