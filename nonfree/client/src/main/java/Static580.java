import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_322 = new Class123(96, 10);

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt10044 = -1;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public static int anInt10049 = -1;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt10050 = -1;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!ja;")
	public static final Class154 aClass154_15 = new Class154();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!os;)I")
	public static int method7901(@OriginalArg(1) Class245 arg0) {
		if (Static475.aClass245_14 == arg0) {
			return 6407;
		} else if (arg0 == Static18.aClass245_3) {
			return 6408;
		} else if (Static199.aClass245_11 == arg0) {
			return 6406;
		} else if (Static21.aClass245_6 == arg0) {
			return 6409;
		} else if (Static201.aClass245_12 == arg0) {
			return 6410;
		} else if (Static323.aClass245_13 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method7902() {
		if (Static229.aClass58_5 != null) {
			Static229.aClass58_5.method5313();
		}
		if (Static170.aClass58_6 != null) {
			Static170.aClass58_6.method5313();
		}
	}
}
