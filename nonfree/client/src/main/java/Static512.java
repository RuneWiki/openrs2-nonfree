import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!tm", name = "H", descriptor = "Lclient!jn;")
	public static Class176 aClass176_126;

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
	public static int anInt9189;

	@OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
	public static int anInt9192;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZB)V")
	public static void method7483(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static432.anInt8124++;
			Static217.method8382();
		}
		if (arg1) {
			Static510.anInt3070++;
			Static18.method216();
		}
	}
}
