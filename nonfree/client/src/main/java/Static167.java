import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!m;")
	public static Class2_Sub1_Sub13 aClass2_Sub1_Sub13_1;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!mq;")
	public static Class71 aClass71_6;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt3590 = -1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Lclient!in;")
	public static final Class169 aClass169_87 = new Class169(124, 10);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
	public static int anInt3593 = 0;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_23 = new Class271();

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB)V")
	public static void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= Static457.anInt8209 && Static407.anInt7583 >= arg2) {
			@Pc(15) int local15 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg3);
			@Pc(21) int local21 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg0);
			Static430.method7043(arg1, local21, arg2, local15);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
	public static boolean method3349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class331 local8 = Static251.aClass328_1.method8261(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method8302(arg0);
	}
}
