import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ki", name = "Kb", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!ki", name = "Gb", descriptor = "Lclient!dn;")
	public static final Class56 aClass56_6 = new Class56("WTQA", 2);

	@OriginalMember(owner = "client!ki", name = "Hb", descriptor = "Lclient!di;")
	public static final Class54 aClass54_55 = new Class54(41, 3);

	@OriginalMember(owner = "client!ki", name = "Ib", descriptor = "F")
	public static float aFloat62 = 0.0F;

	@OriginalMember(owner = "client!ki", name = "Jb", descriptor = "I")
	public static int anInt3966 = 0;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(IB)I")
	public static int method3245(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(39) int local39 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)[B")
	public static byte[] method3248(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static457.method683(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
