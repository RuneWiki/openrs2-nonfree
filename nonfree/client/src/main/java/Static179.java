import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_17 = new Class233(64);

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "[I")
	public static final int[] anIntArray276 = new int[2];

	@OriginalMember(owner = "client!gga", name = "x", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)V")
	public static void method3289(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static581.aClass222_41.method5468((long) arg0);
		if (local10 != null) {
			local10.aBoolean415 = !local10.aBoolean415;
			local10.aClass52_Sub1_1.method1224(local10.aBoolean415);
		}
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)Lclient!lda;")
	public static Class202_Sub1 method3290() {
		Static288.anInt5417 = 0;
		return Static360.method5511();
	}
}
