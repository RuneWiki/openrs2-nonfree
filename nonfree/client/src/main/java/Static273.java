import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "[Lclient!io;")
	public static final Class117[] aClass117Array1 = new Class117[4];

	@OriginalMember(owner = "client!no", name = "d", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_39 = new Class126(10);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!b;)Z")
	public static boolean method3652(@OriginalArg(1) Class20 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean11) {
			return false;
		} else if (!arg0.method228(Static93.anInterface1_2)) {
			return false;
		} else if (Static1.aClass164_1.method3512((long) arg0.anInt315) == null) {
			return Static406.aClass164_37.method3512((long) arg0.anInt314) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBI)Z")
	public static boolean method3654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
