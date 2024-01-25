import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ep", name = "Q", descriptor = "I")
	public static int anInt1718;

	@OriginalMember(owner = "client!ep", name = "T", descriptor = "Lclient!dj;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "Lclient!um;")
	public static final Class204 aClass204_5 = new Class204();

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)V")
	public static void method1436(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static212.method3689();
		} else if (arg0 == 2) {
			Static76.method1401();
		} else if (arg0 == 3) {
			Static18.method359();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	public static void method1437() {
		@Pc(1) Class154 local1 = Static46.aClass154_13;
		synchronized (Static46.aClass154_13) {
			Static46.aClass154_13.method4219();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V")
	public static void method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg1; local3 <= arg4; local3++) {
			Static182.method3394(arg0, Static30.anIntArrayArray10[local3], arg2, arg3);
		}
	}
}
