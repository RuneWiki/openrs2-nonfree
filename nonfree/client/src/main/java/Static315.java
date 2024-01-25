import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public static int anInt5894;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_106 = new Class126(13, -2);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	public static void method4938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub6_Sub7 local17 = Static198.method3146((long) arg0, 13);
		local17.method1712();
		local17.anInt1790 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Z")
	public static boolean method4940(@OriginalArg(1) int arg0) {
		if (arg0 == 11 || arg0 == 19 || arg0 == 47 || arg0 == 30 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z")
	public static boolean method4943(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static430.method6355(arg0, arg1) | (arg0 & 0x70000) != 0 || Static519.method7350(arg0, arg1);
	}
}
