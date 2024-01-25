import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public static int anInt195;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_8 = new Class15("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!hd;II)Ljava/lang/String;")
	public static String method168(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1) {
		if (!Static55.method752(arg0).method2794(arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aStringArray25 == null || arg0.aStringArray25.length <= arg1 || arg0.aStringArray25[arg1] == null || arg0.aStringArray25[arg1].trim().length() == 0) {
			return Static37.aBoolean35 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray25[arg1];
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lclient!qd;")
	public static Class8_Sub2 method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_1;
	}
}
