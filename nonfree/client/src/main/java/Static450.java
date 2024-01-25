import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static450 {

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "Lclient!dt;")
	public static Class3_Sub4 aClass3_Sub4_4;

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
	public static int anInt7240;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
	public static int anInt7241 = -1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!g;)I")
	public static int method6089(@OriginalArg(1) Class122 arg0) {
		if (arg0 == Static147.aClass122_6) {
			return 6407;
		} else if (arg0 == Static21.aClass122_14) {
			return 6408;
		} else if (arg0 == Static111.aClass122_5) {
			return 6406;
		} else if (Static618.aClass122_19 == arg0) {
			return 6409;
		} else if (arg0 == Static511.aClass122_15) {
			return 6410;
		} else if (Static80.aClass122_4 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
