import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
	public static int anInt2676;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!la;")
	public static final Class136 aClass136_70 = new Class136(108, 0);

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_71 = new Class136(113, 0);

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	public static int anInt2678 = 0;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)I")
	public static int method2292(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(18) int local18 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
