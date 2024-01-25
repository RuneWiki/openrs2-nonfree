import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "Lclient!jn;")
	public static Class176 aClass176_35;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B[S)[S")
	public static short[] method2452(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static597.method3728(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII)Z")
	public static boolean method2453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZI)V")
	public static void method2454(@OriginalArg(1) int arg0) {
		Static523.anInt9350 = arg0;
		@Pc(7) Class223 local7 = Static571.aClass223_66;
		synchronized (Static571.aClass223_66) {
			Static571.aClass223_66.method5398();
		}
		local7 = Static267.aClass223_36;
		synchronized (Static267.aClass223_36) {
			Static267.aClass223_36.method5398();
		}
	}
}
