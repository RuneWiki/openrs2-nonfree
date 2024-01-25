import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt6824;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
	public static final int[] anIntArray614 = new int[25];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I")
	public static int method5609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!wq;)V")
	public static void method5611(@OriginalArg(1) Class31_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(10) Class1_Sub35 local10 = (Class1_Sub35) Static77.aClass181_15.method4112(); local10 != null; local10 = (Class1_Sub35) Static77.aClass181_15.method4104()) {
			if (local10.aClass31_Sub2_Sub1_Sub2_1 == arg0) {
				if (local10.aClass1_Sub19_Sub1_3 != null) {
					Static59.aClass1_Sub19_Sub2_1.method2185(local10.aClass1_Sub19_Sub1_3);
					local10.aClass1_Sub19_Sub1_3 = null;
				}
				local10.method6020();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method5612() {
		Static217.anInt4004 = 0;
		Static55.aClass181_63.method4101();
		Static385.aBoolean436 = false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!uq;ZI)I")
	public static int method5613(@OriginalArg(0) Class251 arg0, @OriginalArg(2) int arg1) {
		if (!Static57.method1248(arg0).method1734(arg1) && arg0.anObjectArray24 == null) {
			return -1;
		} else if (arg0.anIntArray607 == null || arg1 >= arg0.anIntArray607.length) {
			return -1;
		} else {
			return arg0.anIntArray607[arg1];
		}
	}
}
