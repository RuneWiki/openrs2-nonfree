import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
	public static int anInt1615;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString117 = "white:";

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lclient!rl;")
	public static Class36_Sub8 method1299() {
		@Pc(13) Class36_Sub8 local13 = (Class36_Sub8) Static243.aClass191_5.method4868();
		if (local13 == null) {
			return new Class36_Sub8();
		} else {
			Static42.anInt1096--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public static void method1301() {
		Static225.aClass103_44.method2679(5);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method1302(@OriginalArg(0) Class180 arg0) {
		Static258.anInt5003 = arg0.method4570("titlebg");
		Static219.anInt4373 = arg0.method4570("logo");
	}
}
