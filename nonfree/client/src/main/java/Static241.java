import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!dn;")
	public static Class56 aClass56_62;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
	public static int anInt4607;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_165 = new Class184(71, 4);

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	public static int anInt4606 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)I")
	public static int method3753(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
