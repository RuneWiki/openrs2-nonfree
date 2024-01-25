import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public static int anInt4627 = 0;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[Lclient!cr;")
	public static final Class41[] aClass41Array2 = new Class41[6];

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
	public static int anInt4630 = -1;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLclient!lm;)Z")
	public static boolean method4065(@OriginalArg(1) Class121 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean258) {
			return false;
		} else if (!arg0.method3309()) {
			return false;
		} else if (Static355.aClass42_62.method1052((long) arg0.anInt3564) == null) {
			return Static283.aClass42_49.method1052((long) arg0.anInt3575) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
	public static void method4066() {
		Static131.aClass66_45.method1942();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	public static void method4068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub9_Sub16 local13 = Static239.method4052(7, arg1);
		local13.method4140();
		local13.anInt4723 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method4069() {
		Static41.aClass66_12.method1942();
		Static265.aClass66_101.method1942();
		Static216.aClass66_73.method1942();
		Static168.aClass66_60.method1942();
		Static148.aClass66_50.method1942();
	}
}
