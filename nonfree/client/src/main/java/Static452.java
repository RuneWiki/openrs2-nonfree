import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!ha;")
	public static Class104 aClass104_25;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!gd;")
	public static Class1_Sub16 aClass1_Sub16_2 = null;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt7896 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
	public static boolean method6974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class51 local8 = Static398.aClass18_4.method609(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method1627(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)I")
	public static int method6975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg2) {
			return arg2;
		} else if (arg1 <= arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}
}
