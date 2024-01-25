import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "Lclient!sja;")
	public static Class342 aClass342_26 = new Class342();

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method2679(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static126.aClass22_3 = arg0;
		Static343.aClass208ArrayArray1 = new Class208[arg2][arg1];
		if (Static210.anIntArray238 != null) {
			Static681.aClass113_4 = Static397.method5357(Static210.anIntArray238[2], Static210.anIntArray238[0], Static210.anIntArray238[3], Static210.anIntArray238[4], Static210.anIntArray238[1], Static210.anIntArray238[5]);
		}
		Static58.aClass200_1 = null;
		Static559.aClass208_6 = new Class208();
		Static177.method2858();
	}
}
