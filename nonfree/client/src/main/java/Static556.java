import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
	public static int anInt9256;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLclient!ls;)V")
	public static void method7539(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt7584 > Static518.anInt9331) {
			Static322.method4788(arg1);
		} else if (Static518.anInt9331 <= arg1.anInt7568) {
			Static62.method1012(arg1);
		} else {
			Static475.method6627(arg1, false);
			local9 = Static359.anInt6547;
			local7 = Static68.anInt1305;
		}
		if (arg1.anInt8902 < 512 || arg1.anInt8906 < 512 || arg1.anInt8902 >= Static458.anInt9736 * 512 - 512 || Static378.anInt6747 * 512 - 512 <= arg1.anInt8906) {
			local7 = -1;
			arg1.anInt7568 = 0;
			arg1.anInt7591 = -1;
			arg1.anInt7570 = -1;
			arg1.anInt7547 = -1;
			local9 = 0;
			arg1.anIntArray448 = null;
			arg1.anInt7584 = 0;
			arg1.anInt8902 = arg1.anIntArray455[0] * 512 + arg1.method6058() * 256;
			arg1.anInt8906 = arg1.anIntArray454[0] * 512 + arg1.method6058() * 256;
			arg1.method6068();
		}
		if (arg1 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 && (arg1.anInt8902 < 6144 || arg1.anInt8906 < 6144 || Static458.anInt9736 * 512 - 6144 <= arg1.anInt8902 || arg1.anInt8906 >= (Static378.anInt6747 - 12) * 512)) {
			arg1.anInt7570 = -1;
			arg1.anIntArray448 = null;
			arg1.anInt7568 = 0;
			local7 = -1;
			local9 = 0;
			arg1.anInt7591 = -1;
			arg1.anInt7547 = -1;
			arg1.anInt7584 = 0;
			arg1.anInt8902 = arg1.anIntArray455[0] * 512 + arg1.method6058() * 256;
			arg1.anInt8906 = arg1.anIntArray454[0] * 512 + arg1.method6058() * 256;
			arg1.method6068();
		}
		@Pc(223) int local223 = Static351.method5243(arg1);
		Static542.method7383(arg1);
		Static335.method4995(local9, arg1, local7, local223);
		Static296.method4399(local7, arg1);
		Static547.method7474(arg1);
	}
}
