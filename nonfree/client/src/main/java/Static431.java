import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "J")
	public static long aLong184;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[I")
	public static final int[] anIntArray568 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6594(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = Static395.method6255(Static118.method2353(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}
}
