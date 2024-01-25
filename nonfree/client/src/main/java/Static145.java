import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!bm;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Z")
	public static boolean method2483(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I")
	public static int method2485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}
}
