import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public static int anInt3558;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array20;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!wc;")
	public static final Class1_Sub3_Sub25 aClass1_Sub3_Sub25_11 = new Class1_Sub3_Sub25();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1715 = Static187.method3089("sl_flags");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1716 = Static187.method3089(": ");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Z")
	public static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public static int anInt3561 = 0;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1717 = Static187.method3089("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 2 << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
	}
}
