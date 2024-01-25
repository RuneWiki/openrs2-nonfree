import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_7 = new Class129(2, -1);

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
	public static final int[] anIntArray13 = new int[500];

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
	public static final int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method163() {
		Static407.method5394(10);
		Static203.method2695();
		System.gc();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method164() {
		Static80.aClass252_10.method5661();
		Static383.aClass123_11.method2622();
		Static168.aClass123_9.method2622();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBII)V")
	public static void method170(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = arg1 << 3;
		@Pc(20) int local20 = arg0 << 3;
		Static99.aFloat33 = local20;
		Static10.aFloat7 = local16;
		if (Static449.anInt7379 == 2) {
			Static442.anInt7328 = local20;
			Static194.anInt3230 = 0;
			Static248.anInt3998 = local16;
		}
		Static135.method1952();
		Static324.aBoolean348 = true;
	}
}
