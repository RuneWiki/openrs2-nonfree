import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!uv;")
	public static Class344 aClass344_12 = null;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIBI)Z")
	public static boolean method7687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static526.aClass31_38.method7920(arg0, arg1, arg2, Static217.anIntArray243);
		@Pc(13) int local13 = Static217.anIntArray243[2];
		if (local13 < 50) {
			return false;
		} else {
			Static217.anIntArray243[1] = Static217.anIntArray243[1] * Static104.anInt2078 / local13 + Static344.anInt6333;
			Static217.anIntArray243[2] = local13;
			Static217.anIntArray243[0] = Static270.anInt5275 + Static217.anIntArray243[0] * Static381.anInt6906 / local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method7688(@OriginalArg(0) Class343 arg0) {
		Static388.aClass343_184 = arg0;
	}
}
