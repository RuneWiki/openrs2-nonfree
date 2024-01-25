import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "Lclient!hf;")
	public static Class136 aClass136_4;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_16 = new Class223(8);

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)I")
	public static int method2627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 << 13 ^ local10;
		@Pc(30) int local30 = (local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BI)Z")
	public static boolean method2628(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZI)Z")
	public static boolean method2630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
