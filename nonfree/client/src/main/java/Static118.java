import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eca", name = "B", descriptor = "Lclient!tt;")
	public static Class313 aClass313_51;

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array57;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "Lclient!of;")
	public static final Class230 aClass230_59 = new Class230(3, 5);

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)I")
	public static int method7958(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return ~local37 & arg0;
	}
}
