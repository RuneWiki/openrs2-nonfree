import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray76 = new int[6][];

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_11 = new Class266("", 10);

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	public static int anInt8266 = -1;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	public static void method7019() {
		Static393.aClass174_27.method4423();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method7021(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static208.aClass308ArrayArray1 = new Class308[arg2][arg1];
		Static397.aClass9_6 = arg0;
		if (Static527.anIntArray771 != null) {
			Static384.aClass25_4 = Static242.method1906(Static527.anIntArray771[2], Static527.anIntArray771[5], Static527.anIntArray771[3], Static527.anIntArray771[0], Static527.anIntArray771[1], Static527.anIntArray771[4]);
		}
		Static15.aClass308_1 = new Class308();
		Static525.method7465();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7022(@OriginalArg(0) String arg0) {
		return Static219.method3917(10, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public static void method7023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static95.anInt2358 <= arg2 - arg4 && Static299.anInt4491 >= arg2 + arg4 && Static92.anInt2338 <= arg3 - arg4 && arg4 + arg3 <= Static341.anInt6379) {
			Static52.method1504(arg5, arg3, arg0, arg4, arg2, arg1);
		} else {
			Static325.method5490(arg3, arg2, arg0, arg5, arg1, arg4);
		}
	}
}
