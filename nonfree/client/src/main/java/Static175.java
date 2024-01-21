import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!jg;")
	public static Class44 aClass44_32;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1380 = Static65.method1172(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1381 = Static65.method1172("sl_button");

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1382 = Static65.method1172("(U1");

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1384 = Static65.method1172("Checking for updates )2 ");

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1383 = aClass46_1384;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public static void method2757(@OriginalArg(0) int arg0) {
		if (Static22.anInt527 == 0) {
			Static125.aClass3_Sub5_Sub2_2.method2315(arg0);
		} else {
			Static77.anInt1924 = arg0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
	public static int method2758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray69.length) {
			return local10.anIntArray69[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	public static void method2759() {
		aClass44_32 = null;
		aClass46_1384 = null;
		aClass46_1380 = null;
		aClass46_1382 = null;
		aClass46_1383 = null;
		aByteArrayArrayArray7 = null;
		aClass46_1381 = null;
	}
}
