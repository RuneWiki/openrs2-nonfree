import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_14 = new Class268("", 15);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
	public static int method2245(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
