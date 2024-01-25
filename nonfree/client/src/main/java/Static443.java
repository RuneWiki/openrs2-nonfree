import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
	public static int anInt8057 = 0;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)Z")
	public static boolean method6744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static368.method5871(arg1, arg0) || Static37.method713(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static269.method4299(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V")
	public static void method6745() {
		Static152.aClass231_64.method6240();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6746(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static93.method1721(Static10.aClass243_5);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0));
			Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
		}
	}
}
