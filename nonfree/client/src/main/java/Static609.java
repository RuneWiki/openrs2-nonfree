import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static609 {

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	public static int anInt9447;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Lclient!hma;")
	public static Class163 aClass163_6;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
	public static int anInt9448;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "Z")
	public static boolean aBoolean811 = false;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)V")
	public static void method8328() {
		Static332.aClass85_38.method1748();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)I")
	public static int method8332(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(III)Z")
	public static boolean method8335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static158.method8587(arg0, arg1) || Static435.method6316(arg1, arg0);
	}
}
