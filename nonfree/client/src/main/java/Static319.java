import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Z")
	public static boolean aBoolean380 = true;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "[I")
	public static final int[] anIntArray497 = new int[13];

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "J")
	public static long aLong171 = 0L;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!ci;")
	public static Class4_Sub1_Sub4 method4403(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub4 local10 = (Class4_Sub1_Sub4) Static358.aClass24_3.method655((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static4.aClass166_6.method3696(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static405.method5346(local20);
			Static358.aClass24_3.method660(local10, (long) arg0);
			return local10;
		}
	}
}
