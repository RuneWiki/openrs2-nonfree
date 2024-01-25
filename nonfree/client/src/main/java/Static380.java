import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "Lclient!f;")
	public static Class38 aClass38_40;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
	public static int anInt8020;

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "Lclient!ll;")
	public static Class211 aClass211_7;

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "Lclient!mba;")
	public static Class221 aClass221_3;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "Lclient!dg;")
	public static final Class74 aClass74_3 = new Class74();

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_51 = new Class70();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)I")
	public static int method6540(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}
}
