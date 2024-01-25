import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "Lclient!oo;")
	public static Class247 aClass247_9;

	@OriginalMember(owner = "client!sda", name = "w", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_128 = new Class276(16, -2);

	@OriginalMember(owner = "client!sda", name = "t", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_35 = new Class25(16);

	@OriginalMember(owner = "client!sda", name = "x", descriptor = "Lclient!cr;")
	public static final Class3_Sub11 aClass3_Sub11_1 = new Class3_Sub11(0, -1);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IBI)Z")
	public static boolean method7272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)V")
	public static void method7273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static402.method8391(arg1)) {
			Static491.method6665(arg0, Static108.aClass305ArrayArray1[arg1]);
		}
	}
}
