import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public static int anInt2961;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public static int anInt2962;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!ak;")
	public static Class7 aClass7_133;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public static int anInt2965;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[J")
	public static long[] aLongArray8 = new long[1000];

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public static int anInt2964 = -1;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	public static int anInt2966 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!le;IIBI)V")
	public static void method2472(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub6 local15 = (Class1_Sub6) Static261.aClass69_26.method1636(); local15 != null; local15 = (Class1_Sub6) Static261.aClass69_26.method1631()) {
			if (arg3 == local15.anInt1044 && local15.anInt1045 == arg1 * 128 && arg2 * 128 == local15.anInt1041 && local15.aClass104_1.anInt2819 == arg0.anInt2819) {
				if (local15.aClass1_Sub8_Sub1_1 != null) {
					Static28.aClass1_Sub8_Sub3_1.method2409(local15.aClass1_Sub8_Sub1_1);
					local15.aClass1_Sub8_Sub1_1 = null;
				}
				if (local15.aClass1_Sub8_Sub1_2 != null) {
					Static28.aClass1_Sub8_Sub3_1.method2409(local15.aClass1_Sub8_Sub1_2);
					local15.aClass1_Sub8_Sub1_2 = null;
				}
				local15.method4534();
				return;
			}
		}
	}
}
