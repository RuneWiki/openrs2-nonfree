import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt673;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public static int anInt663 = 0;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_10 = new Class109(2);

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	public static int anInt671 = -1;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
	public static final int[] anIntArray74 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public static int anInt674 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method584() {
		Static1.aClass109_1.method2858();
		Static69.aClass109_18.method2858();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method585() {
		@Pc(10) Class109 local10 = Static119.aClass109_43;
		synchronized (Static119.aClass109_43) {
			Static119.aClass109_43.method2858();
		}
		local10 = Static41.aClass109_14;
		synchronized (Static41.aClass109_14) {
			Static41.aClass109_14.method2858();
		}
		local10 = Static142.aClass109_32;
		synchronized (Static142.aClass109_32) {
			Static142.aClass109_32.method2858();
		}
	}
}
