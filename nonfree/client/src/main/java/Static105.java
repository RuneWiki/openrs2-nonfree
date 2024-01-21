import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "Lclient!ja;")
	public static Class2_Sub13 aClass2_Sub13_3;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Lclient!ib;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array4 = new Class2_Sub2_Sub2_Sub3[1000];

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "J")
	public static long aLong98 = 0L;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method1784() {
		aClass2_Sub13_3 = null;
		aClass40_1 = null;
		aClass2_Sub2_Sub2_Sub3Array4 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
	public static int method1785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
