import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static576 {

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Lclient!pu;")
	public static Class270 aClass270_119;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	public static int anInt9487 = 0;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "S")
	public static short aShort134 = 320;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	public static int anInt9489 = 500;

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "[Lclient!de;")
	public static final Class8_Sub3_Sub3_Sub1_Sub1[] aClass8_Sub3_Sub3_Sub1_Sub1Array1 = new Class8_Sub3_Sub3_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)Z")
	public static boolean method7739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static114.method1789(arg1, arg0) | (arg0 & 0x70000) != 0 || Static448.method6201(arg1, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I")
	public static int method7741() {
		return Static8.anInt123;
	}
}
