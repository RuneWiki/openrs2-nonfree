import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static516 {

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "Lclient!uq;")
	public static Class362 aClass362_111;

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
	public static int anInt8123;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
	public static int anInt8125;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_129 = new Class171(45, 8);

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
	public static int anInt8124 = -1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	public static void method6719() {
		Static393.aClass302_44.method6614();
		Static227.anInt3968 = 0;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[BI)I")
	public static int method6720(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static359.method5201(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static300.anInt5091 <= arg1 && arg3 <= Static629.anInt10412 && Static617.anInt6260 <= arg5 && Static229.anInt4089 >= arg4) {
			if (arg2 == 1) {
				Static326.method4644(arg1, arg5, arg4, arg0, arg3);
			} else {
				Static110.method1716(arg5, arg3, arg1, arg0, arg4, arg2);
			}
		} else if (arg2 == 1) {
			Static190.method2929(arg0, arg3, arg5, arg4, arg1);
		} else {
			Static203.method3048(arg0, arg4, arg1, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)Z")
	public static boolean method6724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
