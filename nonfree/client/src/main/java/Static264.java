import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
	public static int anInt3855 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ws;I)Ljava/lang/String;")
	public static String method3357(@OriginalArg(0) Class2_Sub43 arg0) {
		return arg0.aString63 == null || arg0.aString63.length() <= 0 ? arg0.aString64 : arg0.aString64 + Static250.aClass62_174.method1389(Static200.anInt4144) + arg0.aString63;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BD)V")
	public static void method3358(@OriginalArg(1) double arg0) {
		if (Static353.aDouble9 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static183.anIntArray291[local16] = local28 > 255 ? 255 : local28;
		}
		Static353.aDouble9 = arg0;
	}
}
