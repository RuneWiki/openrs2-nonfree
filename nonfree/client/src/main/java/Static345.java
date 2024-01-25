import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static345 {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!lt;")
	public static final Class6_Sub26_Sub2 aClass6_Sub26_Sub2_1 = new Class6_Sub26_Sub2(5000);

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!gs;")
	public static final Class123 aClass123_12 = new Class123("WTRC", 1);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I")
	public static int method5630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static515.anIntArray719[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!nb;B)I")
	public static int method5631(@OriginalArg(0) Class220 arg0) {
		if (arg0 == Static336.aClass220_9) {
			return 5120;
		} else if (Static336.aClass220_10 == arg0) {
			return 5122;
		} else if (arg0 == Static336.aClass220_11) {
			return 5124;
		} else if (arg0 == Static336.aClass220_12) {
			return 5121;
		} else if (arg0 == Static336.aClass220_13) {
			return 5123;
		} else if (Static336.aClass220_14 == arg0) {
			return 5125;
		} else if (Static336.aClass220_15 == arg0) {
			return 5131;
		} else if (arg0 == Static336.aClass220_16) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
	public static int method5634() {
		return 16;
	}
}
