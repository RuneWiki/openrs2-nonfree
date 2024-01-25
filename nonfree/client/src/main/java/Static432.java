import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	public static int anInt7151;

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
	public static int anInt7161;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "[I")
	public static final int[] anIntArray602 = new int[4096];

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean475 = false;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!di;")
	public static final Class54 aClass54_105 = new Class54(28, 2);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V")
	public static void method5651(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static192.method3011(arg0, arg1.length - 1, 0, arg1);
	}
}
