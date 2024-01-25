import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method3381(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static275.method4840(Static269.method4712(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBII)V")
	public static void method3382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0 * Static349.anInt6699 >> 8;
		if (local14 != 0 && arg1 != -1) {
			Static354.method6026(arg1, Static270.aClass93_104, local14);
			Static111.aBoolean156 = true;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!vg;)V")
	public static void method3383(@OriginalArg(1) Class201 arg0) {
		if (arg0.anInt6518 == Static76.anInt1460) {
			Static287.aBooleanArray23[arg0.anInt6501] = true;
		}
	}
}
