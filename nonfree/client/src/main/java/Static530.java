import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static530 {

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
	public static int anInt8208;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public static int anInt8205 = -1;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public static int anInt8211 = 0;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "[S")
	public static short[] aShortArray98 = new short[256];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method7122(@OriginalArg(0) Class33 arg0) {
		if (Static523.aBoolean633) {
			Static353.method4730(arg0);
		} else {
			Static678.method8981(arg0);
		}
	}
}
