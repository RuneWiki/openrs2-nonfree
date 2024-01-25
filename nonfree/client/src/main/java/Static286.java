import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
	public static int anInt5623;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_50 = new Class109(8);

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "[B")
	public static final byte[] aByteArray88 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	public static void method4982() {
		Static60.method1854();
		for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
			Static152.aClass24Array3[local6].method494();
		}
		Static309.method5417();
		Static166.method3025();
		System.gc();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)V")
	public static void method4983() {
		Static196.aClass109_44.method2859(5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBZI)I")
	public static int method4984(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class5_Sub14 local13 = Static319.method5550(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray129.length > arg2) {
			return local13.anIntArray129[arg2];
		} else {
			return -1;
		}
	}
}
