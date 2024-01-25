import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
	public static int anInt3299 = 0;

	@OriginalMember(owner = "client!gv", name = "hb", descriptor = "I")
	public static int anInt3319 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(CB)Z")
	public static boolean method2822(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(BII)Z")
	public static boolean method2823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static594.method7982(arg0, arg1) || Static48.method6683(arg1, arg0);
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(B)Lclient!qea;")
	public static Class1_Sub8_Sub11 method2824() {
		return Static287.aClass1_Sub8_Sub11_2;
	}
}
