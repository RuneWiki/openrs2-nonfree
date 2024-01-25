import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!tg;")
	public static Class280 aClass280_1;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_62 = new Class158(35, 7);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z")
	public static boolean method4111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4113(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static278.method4791(Static446.aClass158_108);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0));
			Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
		}
	}
}
