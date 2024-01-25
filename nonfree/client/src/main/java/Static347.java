import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public static int anInt6376;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_190 = new Class208(18, -1);

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean459 = true;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt6374 = 0;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_14 = new Class213(13, 4);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)I")
	public static int method5538(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local13 * local27 >> 12;
	}
}
