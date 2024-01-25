import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static298 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[2048];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_98 = new Class156(58, 2);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZB)V")
	public static void method4687(@OriginalArg(0) boolean arg0) {
		if (Static510.aClass216_1 == null) {
			Static293.method6186();
		}
		if (arg0) {
			Static510.aClass216_1.method4940();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ua;I)I")
	public static int method4688(@OriginalArg(0) Class358 arg0) {
		if (Static221.aClass358_8 == arg0) {
			return 6407;
		} else if (Static171.aClass358_12 == arg0) {
			return 6408;
		} else if (arg0 == Static624.aClass358_16) {
			return 6406;
		} else if (arg0 == Static338.aClass358_13) {
			return 6409;
		} else if (Static266.aClass358_10 == arg0) {
			return 6410;
		} else if (Static205.aClass358_7 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
