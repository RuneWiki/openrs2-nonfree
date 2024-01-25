import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!uo", name = "ib", descriptor = "I")
	public static int anInt9603;

	@OriginalMember(owner = "client!uo", name = "mb", descriptor = "Z")
	public static boolean aBoolean678;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "(I)V")
	public static void method7831() {
		Static410.aClass244_54 = new Class244();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!n;I)Lclient!n;")
	public static Class225 method7832(@OriginalArg(0) Class225 arg0) {
		if (arg0.anInt6559 != -1) {
			return Static490.method7272(arg0.anInt6559);
		}
		@Pc(20) int local20 = arg0.anInt6555 >>> 16;
		@Pc(25) Class204 local25 = new Class204(Static189.aClass350_14);
		for (@Pc(30) Class4_Sub37 local30 = (Class4_Sub37) local25.method5146(); local30 != null; local30 = (Class4_Sub37) local25.method5144()) {
			if (local20 == local30.anInt8141) {
				return Static490.method7272((int) local30.aLong268);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "(I)I")
	public static int method7833() {
		@Pc(10) Class223 local10 = Static267.aClass223_36;
		synchronized (Static267.aClass223_36) {
			return Static267.aClass223_36.method5392();
		}
	}
}
