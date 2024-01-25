import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static640 {

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	public static int anInt10409 = 0;

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_20 = new Class226(4, 5);

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[4];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	public static int method8831() {
		return Static117.anInt1889;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)V")
	public static void method8832(@OriginalArg(1) int arg0) {
		if (!Static536.method7364()) {
			return;
		}
		if (arg0 != Static564.anInt8912) {
			Static446.aString85 = "";
		}
		Static564.anInt8912 = arg0;
		Static4.aClass389_16.method9073();
		Static411.method6060(5, -3);
	}
}
