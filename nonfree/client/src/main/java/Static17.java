import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!aja", name = "mb", descriptor = "I")
	public static int anInt398 = 1;

	@OriginalMember(owner = "client!aja", name = "wb", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_16 = new Class200(30, 6);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!wha;)I")
	public static int method512(@OriginalArg(1) Class381 arg0) {
		if (arg0 == Static638.aClass381_12) {
			return 5120;
		} else if (Static638.aClass381_13 == arg0) {
			return 5122;
		} else if (arg0 == Static638.aClass381_14) {
			return 5124;
		} else if (Static638.aClass381_15 == arg0) {
			return 5121;
		} else if (Static638.aClass381_16 == arg0) {
			return 5123;
		} else if (arg0 == Static638.aClass381_17) {
			return 5125;
		} else if (arg0 == Static638.aClass381_18) {
			return 5131;
		} else if (arg0 == Static638.aClass381_19) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
