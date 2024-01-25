import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static510 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "J")
	public static long aLong242;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt8651 = 0;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt8653 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	public static int method6989(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
	public static void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static239.anInt4818 = 3;
		Static523.anInt8857 = arg0;
		Static139.method2597(Static68.aClass43_1.aString27, Static68.aClass43_1.anInt1149);
		if (arg1) {
			Static257.method4354(false, "", "");
		} else {
			Static463.method6459();
			Static257.method4354(false, Static380.aString68, Static125.aString32);
		}
	}
}
