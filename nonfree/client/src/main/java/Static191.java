import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_54 = new Class186(104, 20);

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "F")
	public static float aFloat60 = 0.25F;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
	public static int method2948(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(38) int local38 = local25 | local25 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return arg0 & ~local44;
	}
}
