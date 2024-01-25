import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
	public static int anInt584 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZI)V")
	public static void method584() {
		Static419.aClass85_45.method1742(50);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IBII)I")
	public static int method586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIZBIII)V")
	public static void method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static650.aClass2_Sub30_29.aClass11_Sub5_2.method1696(1) : Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(1)) != 0 && arg3 != 0 && Static66.anInt1152 < 50 && arg0 != -1) {
			Static461.aClass177Array1[Static66.anInt1152++] = new Class177((byte) (arg2 ? 3 : 2), arg0, arg3, arg5, arg1, 0, arg4, (Class4_Sub2) null);
		}
	}
}
