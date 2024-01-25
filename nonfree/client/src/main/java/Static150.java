import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
	public static volatile int anInt1955 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!rk;Lclient!pe;Lclient!rk;)V")
	public static void method1570(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) Class180 arg2) {
		Static226.aClass208_6 = Static353.method2012(arg0, Static199.anInt3921);
		Static36.aClass94_9 = arg1.method5483(Static226.aClass208_6, Static358.method1303(arg2, Static199.anInt3921));
		Static326.aClass208_7 = Static353.method2012(arg0, Static49.anInt1349);
		Static341.aClass94_32 = arg1.method5483(Static326.aClass208_7, Static358.method1303(arg2, Static49.anInt1349));
		Static175.aClass208_3 = Static353.method2012(arg0, Static233.anInt4630);
		Static149.aClass94_19 = arg1.method5483(Static175.aClass208_3, Static358.method1303(arg2, Static233.anInt4630));
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)Z")
	public static boolean method1571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static92.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method1572(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static26.method430(arg0);
	}
}
