import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt6124;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray12 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	public static int anInt6125 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	public static void method4917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass3_Sub1_2 != null) {
			local7.aClass3_Sub1_2 = null;
		}
	}
}
